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

    /**
     * TOdo request para o beckend
     */

    res.json({"status": "OK"});
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