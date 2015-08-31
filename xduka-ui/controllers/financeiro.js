var urlDataBase = '',
    extend = require('node.extend'),
    request = require('request'),
    cheques = require('../mockup/xduka-json/financeiro/cheques.json'),
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

    /**
     * TOdo request para o beckend
     */

    dadosCadastroCaixa.list.push({
        "aNome": dataSent.model.nomeCaixa.model.val||dataSent.model.nomeBanco.model.val,
        "btipo": 'Indefinido',
        "cobs": dataSent.model.obs.model.val
    });

    res.json({"list": dadosCadastroCaixa.list});
}

function postValoresCurso(req,res) {
    var dataSent = req.body;

    if (verificaDadosValoresCurso(dataSent.model)) {

        /**
         * TOdo request para o beckend
         */

        res.json({"status": true});
    } else {
        validaDadosValoresCurso(dataSent);
        res.json({"status": false, "model": dataSent.model});
    }
}

function getTemplateCadastroCaixa(req,res) {
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