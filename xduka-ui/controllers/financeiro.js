var urlDataBase = '',
    extend = require('node.extend'),
    request = require('request'),
    cheques = require('../mockup/xduka-json/financeiro/cheques.json'),
    dadosBancoFinanceiro = require('../mockup/xduka-json/common/dadosBancoFinanceiro.json'),
    dadosCadastroCaixa = require('../mockup/xduka-json/financeiro/dadosCadastroCaixa.json'),
    dadosCampPromo = require('../mockup/xduka-json/common/dadosCampPromo.json'),
    dadosCurso = require('../mockup/xduka-json/common/dadosCursos.json'),
    dadosCursoMsgBoletos = require('../mockup/xduka-json/common/dadosCursosMsgBoletos.json'),
    dadosUnidades = require('../mockup/xduka-json/financeiro/dadosUnidades.json'),
    alunos = require('../mockup/xduka-json/common/alunos.json'),
    templateAluno = require('../mockup/xduka-json/financeiro/templateAluno.json'),
    templateCadastroCaixa = require('../mockup/xduka-json/financeiro/templateCadastroCaixa.json'),
    templateCampPromo = require('../mockup/xduka-json/financeiro/templateCampPromo.json'),
    templateMsgBoletos = require('../mockup/xduka-json/financeiro/templateMsgBoletos.json'),
    templateValoresCursos = require('../mockup/xduka-json/financeiro/templateValoresCursos.json'),
    dadosValoresCurso = require('../mockup/xduka-json/financeiro/dadosValoresCursos.json');


module.exports = function() {
    var controller = {};

    controller.alunoSearch = alunoSearch;
    controller.showCheques = getCheques;
    controller.showDadosCadastroCaixa = getDadosCadastroCaixa;
    controller.showDadosCampPromo = getDadosCampPromo;
    controller.showDadosTipoCurso = getDadosTipoCurso;
    controller.showDadosTipoCursoMsgBoletos = getDadosTipoCursoMsgBoletos;
    controller.showDadosUnidades = getDadosUnidades;
    controller.showTemplateAluno = getTemplateAluno;
    controller.showTemplateCadastroCaixa = getTemplateCadastroCaixa;
    controller.showTemplateCampPromo = getTemplateCampPromo;
    controller.showTemplateMsgBoletos = getTemplateMsgBoletos;
    controller.showTemplateValoresCursos = getTemplateValoresCursos;
    controller.showDadosValoresCursos = getDadosValoresCurso;
    controller.putChequeEdit = postChequeEdit;
    controller.putCampPromo = postCampPromo;
    controller.putDadosCadastroCaixa = postDadosCadastroCaixa;
    controller.putMsgBoletos = postMsgBoletos;
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

function getDadosCampPromo(req,res) {
    var idUnidade = req.params.id;

    res.json({"list": verificaUnidade(dadosCampPromo.unidade.list, idUnidade)});
}

function getDadosTipoCurso(req,res) {
    var idUnidade = req.params.id;

    res.json({"list": verificaUnidade(dadosCurso.unidade.list, idUnidade)});
}

function getDadosTipoCursoMsgBoletos(req,res) {
    var idUnidade = req.params.id;

    res.json({"list": verificaUnidade(dadosCursoMsgBoletos.unidade.list, idUnidade)});
}

function getDadosUnidades(req,res) {
    res.json(dadosUnidades);
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

function postCampPromo(req,res) {
    var dataSent = req.body;

    if (verificaDadosCampPromo(dataSent.model)) {
        var dataSend = {
            "addTipoCurso": {"model": {"val": 11,"err": ""}},
            "addInicio": {"model": {"val": "2015-09-04T03:00:00.000Z","err": ""}},
            "addFim": {"model": {"val": "2015-10-10T03:00:00.000Z","err": ""}},
            "addInscrPromo": {"model": {"val": 16380,"err": ""}},
            "addValorCursoPromo": {"model": {"val": 15050,"err": ""}},
            "addFormaPagamento": {"list": [{  "id": "11",  "text": "Forma de pg 1"}],"model": {"val": "11","err": ""}},
            "addDescontoFormaPg": {"model": {"val": 1330,"err": ""}}
        };

        /**
         * TOdo request para o backend / enviar dados da campanha promocional
         */

        res.json({"success": true, "model": dataSent.model});
    } else {
        validaDadosCampPromo(dataSent);
        res.json({"success": false, "model": dataSent.model});
    }
}

function postDadosCadastroCaixa(req,res) {
    var dataSent = req.body;

    if (verificaDadosCadastroCaixa(dataSent.model)) {

        /**
         * TOdo request para o beckend
         */

        dadosCadastroCaixa.list.push({
            "aNome": dataSent.model.nomeCaixa.model.val ||
                     dataSent.model.nome.model.val ||
                     dataSent.model.nomeBanco.list.filter(function(elem) {return elem.id == dataSent.model.nomeBanco.model.val})[0].text,
            "btipo": 'Indefinido',
            "cobs": dataSent.model.obs.model.val
        });

        res.json({"success": true, "list": dadosCadastroCaixa.list});
    } else {
        validaDadosCadastroCaixa(dataSent);
        res.json({"success": false, "model": dataSent.model});
    }
}

function postMsgBoletos(req, res) {
    var dataSent = req.body;

    if (!!dataSent.model.model.val) {

        /**
         * TOdo request para beckend / enviar dados das mensagens dos boletos
         */

        dataSent.model.model.err = "";
        res.json({"success": true, "model": dataSent.model});
    } else {
        dataSent.model.model.err = !!dataSent.model.model.val ? "" : dataSent.STR.FIELD;
        res.json({"success": false, "model": dataSent.model})
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

function getTemplateCampPromo(req,res) {
    res.json(templateCampPromo);
}

function getTemplateMsgBoletos(req,res) {
    res.json(templateMsgBoletos);
}

function getTemplateValoresCursos(req,res) {
    res.json(templateValoresCursos);
}

function getDadosValoresCurso(req, res) {
    res.json(dadosValoresCurso)
}

function getCheques(req,res) {
    res.json(cheques);
}

function getTemplateAluno(req,res) {
    res.json(templateAluno);
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
    if (!!obj.model.nomeCaixa.model.val) {
        obj.model.nomeCaixa.model.err = "";
        obj.model.nomeBanco.model.err = "";
        obj.model.agencia.model.err = "";
        obj.model.contaBancaria.model.err = "";
        obj.model.codCedente.model.err = "";
        obj.model.tipoCarteira.model.err = "";
        obj.model.obs.model.err = !!obj.model.obs.model.val ? "" : obj.STR.FIELD;
        obj.model.numCartao.model.err = "";
        obj.model.nome.model.err = "";
        obj.model.validadeCartao.model.err = "";
        obj.model.codSeguranca.model.err = "";
    } else
    if (!!obj.model.numCartao.model.val) {
        obj.model.numCartao.model.err = "";
        obj.model.nome.model.err = !!obj.model.nome.model.val ? "" : obj.STR.FIELD;
        obj.model.validadeCartao.model.err = !!obj.model.validadeCartao.model.val ? "" : obj.STR.FIELD;
        obj.model.codSeguranca.model.err = !!obj.model.codSeguranca.model.val ? "" : obj.STR.FIELD;
        obj.model.nomeCaixa.model.err = "";
        obj.model.nomeBanco.model.err = "";
        obj.model.agencia.model.err = "";
        obj.model.contaBancaria.model.err = "";
        obj.model.codCedente.model.err = "";
        obj.model.tipoCarteira.model.err = "";
        obj.model.obs.model.err = !!obj.model.obs.model.val ? "" : obj.STR.FIELD;
    } else
    if (!!obj.model.nomeBanco.model.val) {
        obj.model.nomeBanco.model.err = "";
        obj.model.agencia.model.err = !!obj.model.agencia.model.val ? "" : obj.STR.FIELD;
        obj.model.contaBancaria.model.err = !!obj.model.contaBancaria.model.val ? "" : obj.STR.FIELD;
        obj.model.codCedente.model.err = !!obj.model.codCedente.model.val ? "" : obj.STR.FIELD;
        obj.model.tipoCarteira.model.err = !!obj.model.tipoCarteira.model.val ? "" : obj.STR.FIELD;
        obj.model.obs.model.err = !!obj.model.obs.model.val ? "" : obj.STR.FIELD;
        obj.model.nomeCaixa.model.err = "";
        obj.model.nomeBanco.model.err = "";
        obj.model.numCartao.model.err = "";
        obj.model.nome.model.err = "";
        obj.model.validadeCartao.model.err = "";
        obj.model.codSeguranca.model.err = "";
    } else {
        obj.model.nomeCaixa.model.err = obj.STR.FIELD;
        obj.model.numCartao.model.err = obj.STR.FIELD;
        obj.model.nomeBanco.model.err = obj.STR.FIELD;
        obj.model.obs.model.err = !!obj.model.obs.model.val ? "" : obj.STR.FIELD;
    }

}

function verificaDadosCadastroCaixa(obj) {
    if (!!obj.nomeCaixa.model.val) {
        return !!obj.nomeCaixa.model.val && !!obj.obs.model.val
    } else
    if(!!obj.numCartao.model.val) {
        return !!obj.numCartao.model.val && !!obj.nome.model.val &&
            !!obj.validadeCartao.model.val && !!obj.codSeguranca.model.val &&
            !!obj.obs.model.val
    } else
    if(!!obj.nomeBanco.model.val) {
        return !!obj.nomeBanco.model.val && !!obj.agencia.model.val &&
            !!obj.contaBancaria.model.val && !!obj.codCedente.model.val &&
            !!obj.tipoCarteira.model.val && !!obj.obs.model.val
    } else {
        return !!obj.nomeCaixa.model.val && !!obj.numCartao.model.val &&
            !!obj.nomeBanco.model.val && !!obj.obs.model.val
    }
}

function validaDadosCampPromo(obj) {
    obj.model.addTipoCurso.model.err = !!obj.model.addTipoCurso.model.val ? "" : obj.STR.FIELD;
    obj.model.addInicio.model.err = !!obj.model.addInicio.model.val ? "" : obj.STR.FIELD;
    obj.model.addFim.model.err = !!obj.model.addFim.model.val ? "" : obj.STR.FIELD;
    obj.model.addInscrPromo.model.err = !!obj.model.addInscrPromo.model.val ? "" : obj.STR.FIELD;
    obj.model.addValorCursoPromo.model.err = !!obj.model.addValorCursoPromo.model.val ? "" : obj.STR.FIELD;
    obj.model.addFormaPagamento.model.err = !!obj.model.addFormaPagamento.model.val ? "" : obj.STR.FIELD;
    obj.model.addDescontoFormaPg.model.err = !!obj.model.addDescontoFormaPg.model.val ? "" : obj.STR.FIELD;
}

function verificaDadosCampPromo(obj) {
    return !!obj.addTipoCurso.model.val && !!obj.addInicio.model.val &&
        !!obj.addFim.model.val && !!obj.addInscrPromo.model.val &&
        !!obj.addValorCursoPromo.model.val && !!obj.addFormaPagamento.model.val &&
        !!obj.addDescontoFormaPg.model.val
}