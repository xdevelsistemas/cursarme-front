var urlDataBase = '',
    extend = require('node.extend'),
    request = require('request'),
    cheques = require('../mockup/xduka-json/financeiro/cheques.json'),
    dadosBancoFinanceiro = require('../mockup/xduka-json/common/dadosBancoFinanceiro.json'),
    dadosCadastroCaixa = require('../mockup/xduka-json/financeiro/dadosCadastroCaixa.json'),
    dadosCurso = require('../mockup/xduka-json/common/dadosCursos.json'),
    dadosUnidades = require('../mockup/xduka-json/financeiro/dadosUnidades.json'),
    alunos = require('../mockup/xduka-json/common/alunos.json'),
    templateAluno = require('../mockup/xduka-json/financeiro/templateAluno.json'),
    templateCadastroCaixa = require('../mockup/xduka-json/financeiro/templateCadastroCaixa.json');
    templateValoresCursos = require('../mockup/xduka-json/financeiro/templateValoresCursos.json');

module.exports = function() {
    var controller = {};

    controller.alunoSearch = alunoSearch;
    controller.showCheques = getCheques;
    controller.showDadosCadastroCaixa = getDadosCadastroCaixa;
    controller.showDadosTipoCurso = getDadosTipoCurso;
    controller.showDadosUnidades = getDadosUnidades;
    controller.showTemplateAluno = getTemplateAluno;
    controller.showTemplateCadastroCaixa = getTemplateCadastroCaixa;
    controller.showTemplateValoresCursos = getTemplateValoresCursos;
    controller.putChequeEdit = postChequeEdit;
    controller.putDadosCadastroCaixa = postDadosCadastroCaixa;
    controller.putValoresCurso = postValoresCurso;

    return controller;
};

function alunoSearch(req,res){
    var result = {};

    result.result = alunos.list.filter(
        function (value) {
            return value.matricula.model.val.substring(0,req.params.nomeMat.length).toLocaleLowerCase() == req.params.nomeMat.toLowerCase()
        }
    );
    if (result.result.length == 0){
        result.result = alunos.list.filter(
            function (value) {
                return removerAcentos(value.nome.model.val.substring(0,req.params.nomeMat.length)).toLocaleLowerCase() == removerAcentos(req.params.nomeMat).toLowerCase()
            }
        );
    }
    if (result.result.length == 0){
        result.err = "Nenhum resultado encontrado!"
    }

    function removerAcentos(str){

        str = str.replace(/[ÀÁÂÃÄÅ]/,"A");
        str = str.replace(/[àáâãäå]/,"a");
        str = str.replace(/[ÈÉÊË]/,"E");
        str = str.replace(/[Ç]/,"C");
        str = str.replace(/[ç]/,"c");

        return str.replace(/[^a-z0-9]/gi,'');
    }

    res.json(result)
}

function getDadosCadastroCaixa(req,res) {
    res.json(dadosCadastroCaixa)
}

function getDadosTipoCurso(req,res) {
    var idUnidade = req.params.id;

    var list = verificaUnidade(dadosCurso.unidade.list, idUnidade);

    res.json({"list": list});
}

function getDadosUnidades(req,res) {
    res.json(dadosUnidades)
}

function postDadosCadastroCaixa(req,res) {
    var dataSent = req.body;

    if (verificaDadosCadastroCaixa(dataSent.model, dataSent.escolhaBanco)) {

        /**
         * TOdo request para o beckend
         */

        dadosCadastroCaixa.list.push({
            "aNome": dataSent.model.nomeCaixa.model.val || dataSent.model.nomeBanco.model.val,
            "btipo": 'Indefinido',
            "cobs": dataSent.model.obs.model.val
        });

        res.json({"success": true, "list": dadosCadastroCaixa.list});
    } else {
        validaDadosCadastroCaixa(dataSent);
        res.json({"success": false, "model": dataSent.model});
    }
}

function postValoresCurso(req,res) {
    var dataSent = req.body,
        idUnidade = req.params.id;

    if (verificaDadosValoresCurso(dataSent.model)) {
        var dataSend = {
            "unidade": {"model": {"val": idUnidade}},
            "tipoCurso": {"model": {"val": dataSent.model.tipoCurso.model.val}},
            "areaCurso": {"model": {"val": dataSent.model.areaCurso.model.val}},
            "curso": {"model": {"val": dataSent.model.curso.model.val}},
            "periodoVigencia": {"model": {"val": dataSent.model.periodoVigencia.model.val}},
            "ate": {"model": {"val": dataSent.model.ate.model.val}},
            "valorIntegral": {"model": {"val": dataSent.model.valorIntegral.model.val}},
            "valorInscr": {"model": {"val": dataSent.model.valorInscr.model.val}},
            "valorAvista": {"model": {"val": dataSent.model.valorAvista.model.val}},
            "parcelaMax": {"model": {"val": dataSent.model.parcelaMax.model.val}},
            "formaPagamento": {"list": [],"model": {"val": dataSent.model.formaPagamento.model.val}},
            "valorParcela": {"model": {"val": dataSent.model.valorParcela.model.val}}
        };

        /**
         * TOdo request para o beckend / enviar dataSend
         */

        // TOdo verificar necessidade de se retornar o model
        //res.json({"success": true, "model": extend(true, dataSent.model, dataSend)});
        res.json({"success": true});
    } else {
        validaDadosValoresCurso(dataSent);
        res.json({"success": false, "model": dataSent.model});
    }
}

function getTemplateCadastroCaixa(req,res) {
    templateCadastroCaixa.template.nomeBanco.list = dadosBancoFinanceiro.list;
    res.json(templateCadastroCaixa);
}

function getTemplateValoresCursos(req,res) {
    res.json(templateValoresCursos);
}

function getCheques(req,res) {
    res.json(cheques);
}

function getTemplateAluno(req,res) {
    res.json(templateAluno);
}

function postChequeEdit(req,res) {
    var cheque = req.body.cheque,
        pos = req.body.pos;

    /**
     * TOdo request com requisição ao backend
     */

    cheques.list[pos] = cheque;

    res.json(cheques);
}

function verificaUnidade(obj, unidade) {
    for (var i = 0; i < obj.length; i++) {
        if (obj[i].id == unidade) {
            return obj[i].tipoCursos;
        }
    }
}

function validaDadosValoresCurso(obj) {
    obj.model.tipoCurso.model.err = !!obj.model.tipoCurso.model.val ? '' : obj.STR.FIELD;
    obj.model.areaCurso.model.err = !!obj.model.areaCurso.model.val ? '' : obj.STR.FIELD;
    obj.model.curso.model.err = !!obj.model.curso.model.val ? '' : obj.STR.FIELD;
    obj.model.periodoVigencia.model.err = !!obj.model.periodoVigencia.model.val ? '' : obj.STR.FIELD;
    obj.model.ate.model.err = !!obj.model.ate.model.val ? '' : obj.STR.FIELD;
    obj.model.valorIntegral.model.err = !!obj.model.valorIntegral.model.val ? '' : obj.STR.FIELD;
    obj.model.valorInscr.model.err = !!obj.model.valorInscr.model.val ? '' : obj.STR.FIELD;
    obj.model.valorAvista.model.err = !!obj.model.valorAvista.model.val ? '' : obj.STR.FIELD;
    obj.model.formaPagamento.model.err = obj.model.formaPagamento.list.length!=0 ? '' : obj.STR.NOFORMPAG;
}

function verificaDadosValoresCurso(obj) {
    return !!obj.tipoCurso.model.val && !!obj.areaCurso.model.val &&
        !!obj.curso.model.val && !!obj.periodoVigencia.model.val &&
        !!obj.ate.model.val && !!obj.valorIntegral.model.val &&
        !!obj.valorInscr.model.val && !!obj.valorAvista.model.val &&
        !!obj.formaPagamento.model.val
}

function validaDadosCadastroCaixa(obj) {
    if (obj.escolhaBanco) {
        obj.model.nomeCaixa.model.err = !!obj.model.nomeCaixa.model.val ? "" : obj.STR.FIELD;
        obj.model.nomeBanco.model.err = "";
        obj.model.agencia.model.err = "";
        obj.model.contaBancaria.model.err = "";
        obj.model.codCedente.model.err = "";
        obj.model.tipoCarteira.model.err = "";
        obj.model.obs.model.err = "";
    } else {
        obj.model.nomeCaixa.model.err = "";
        obj.model.nomeBanco.model.err = !!obj.model.nomeBanco.model.val ? "" : obj.STR.FIELD;
        obj.model.agencia.model.err = !!obj.model.agencia.model.val ? "" : obj.STR.FIELD;
        obj.model.contaBancaria.model.err = !!obj.model.contaBancaria.model.val ? "" : obj.STR.FIELD;
        obj.model.codCedente.model.err = !!obj.model.codCedente.model.val ? "" : obj.STR.FIELD;
        obj.model.tipoCarteira.model.err = !!obj.model.tipoCarteira.model.val ? "" : obj.STR.FIELD;
        obj.model.obs.model.err = !!obj.model.obs.model.val ? "" : obj.STR.FIELD;
    }

    obj.model.numCartao.model.err = !!obj.model.numCartao.model.val ? "" : obj.STR.FIELD;
    obj.model.nome.model.err = !!obj.model.nome.model.val ? "" : obj.STR.FIELD;
    obj.model.validadeCartao.model.err = !!obj.model.validadeCartao.model.val ? "" : obj.STR.FIELD;
    obj.model.codSeguranca.model.err = !!obj.model.codSeguranca.model.val ? "" : obj.STR.FIELD;
}

function verificaDadosCadastroCaixa(obj, bool) {
    var escolhaBanco;

    if (bool) {
        escolhaBanco = !!obj.nomeCaixa.model.val;
    } else {
        escolhaBanco = !!obj.nomeBanco.model.val && !!obj.agencia.model.val &&
            !!obj.contaBancaria.model.val && !!obj.codCedente.model.val &&
            !!obj.tipoCarteira.model.val && !!obj.obs.model.val;
    }

    return escolhaBanco && !!obj.numCartao.model.val && !!obj.nome.model.val &&
        !!obj.validadeCartao.model.val && !!obj.codSeguranca.model.val;
}