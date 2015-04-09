var form = require('../mockup/xduka-json/comercial/form.json'),
    infoAluno = require('../mockup/xduka-json/comercial/info-aluno.json'),
    preCadastro = require('../mockup/xduka-json/preCadastro.json'),
    tipoTel = require('../mockup/xduka-json/comercial/tipo_telefone.json');

module.exports = function() {
    var controller = {};

    controller.showForm = getForm;
    controller.showInfoAluno = getInfoAluno;
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

function getPreCadastro(req, res) {
    res.json(preCadastro);
}

function getTipoTel(req, res) {
    res.json(tipoTel);
}