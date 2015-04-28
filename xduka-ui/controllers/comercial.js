var controle = require('../mockup/xduka-json/comercial/controle.json'),
    curso = require('../mockup/xduka-json/comercial/curso.json'),
    documentacao = require('../mockup/xduka-json/comercial/documentacao.json'),
    form = require('../mockup/xduka-json/comercial/form.json'),
    infoAluno = require('../mockup/xduka-json/comercial/info-aluno.json'),
    inscricao = require('../mockup/xduka-json/comercial/inscricao.json'),
    pagamento = require('../mockup/xduka-json/comercial/pagamento.json'),
    preCadastro = require('../mockup/xduka-json/preCadastro.json'),
    tipoTel = require('../mockup/xduka-json/comercial/tipo_telefone.json'),
    usuario = require('../mockup/xduka-json/common/user.json');

module.exports = function() {
    var controller = {};

    controller.putDadosIniciais = putDadosIniciais;
    controller.showForm = getForm;
    controller.showInfoAluno = getInfoAluno;
    controller.showInfoControle = getInfoControle;
    controller.showInfoCurso = getInfoCurso;
    controller.showInfoDocumentacao = getInfoDocumentacao;
    controller.showInfoInscricao = getInfoInscricao;
    controller.showInfoPagamento = getInfoPagamento;
    controller.showInfoUsuario = getInfoUsuario;
    controller.showPreCadastro = getPreCadastro;
    controller.showTipoTel = getTipoTel;

    return controller;
};

function getForm(req, res) {
    res.json(form);
}

function getInfoAluno(req, res) {
    res.json(infoAluno);
}

function getInfoControle(req, res) {
    res.json(controle);
}

function getInfoCurso(req, res) {
    res.json(curso);
}

function getInfoDocumentacao(req, res) {
    res.json(documentacao);
}

function getInfoInscricao(req, res) {
    res.json(inscricao);
}

function getInfoPagamento(req, res) {
    res.json(pagamento);
}

function getInfoUsuario(req, res) {
    res.json({"usuario": usuario});
}

function getPreCadastro(req, res) {
    res.json(preCadastro);
}

function getTipoTel(req, res) {
    res.json(tipoTel);
}

function putDadosIniciais(req, res) {

    for (var elem = 0; elem < req.body.dadosIniciais.listaCheques.length; elem++) {
        req.body.dadosIniciais.listaCheques[elem].data = setDataInt(req.body.dadosIniciais.listaCheques[elem].data)
        console.log(req.body.dadosIniciais.listaCheques[elem])
    }

    //res.json(req.body);
    //console.log(req.body);
    res.json({"status": "ok"});
}

function setDataInt(a) {
    return new Date(a).getTime();
}