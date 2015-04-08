var form = require('../mockup/xduka-json/comercial/form.json'),
    infoAluno = require('../mockup/xduka-json/comercial/info-aluno.json'),
    tipoTel = require('../mockup/xduka-json/comercial/tipo_telefone.json');

module.exports = function() {
    var controller = {};

    controller.showForm = getForm;
    controller.showInfoAluno = getInfoAluno;
    controller.showTipoTel = getTipoTel;

    return controller;
};

function getForm(req, res) {
    res.json(form);
}

function getInfoAluno(req, res) {
    res.json(infoAluno);
}

function getTipoTel(req, res) {
    res.json(tipoTel);
}