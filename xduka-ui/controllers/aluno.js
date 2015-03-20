var aniversariantes = require('../mockup/xduka-json/aluno/aniversariantes.json'),
    conteudo = require('../mockup/xduka-json/aluno/conteudo.json'),
    cursos = require('../mockup/xduka-json/aluno/cursos.json'),
    editarPerfil = require('../mockup/xduka-json/aluno/editar-perfil.json'),
    grade = require('../mockup/xduka-json/aluno/grade.json'),
    horarios = require('../mockup/xduka-json/aluno/horarios.json'),
    mensagens = require('../mockup/xduka-json/aluno/messages.json'),
    notas = require('../mockup/xduka-json/aluno/notas.json'),
    parcelas = require('../mockup/xduka-json/aluno/parcelas.json'),
    tarefas = require('../mockup/xduka-json/aluno/tasks.json');
    usuario = require('../mockup/xduka-json/aluno/user.json');

module.exports = function() {
    var controller = {};

    controller.showAniversariantes = getAniversariantes;
    controller.showConteudo = getConteudo;
    controller.showCursos = getCursos;
    controller.showEditarPerfil = getEditarPerfil;
    controller.putEditarPerfil = putEditarPerfil;
    controller.showGrade = getGrade;
    controller.showHorarios = getHorarios;
    controller.showMessages = getMessages;
    controller.showNotas = getNotas;
    controller.showParcelas = getParcelas;
    controller.showTarefas = getTarefas;
    controller.showUsuario = getUsuario;

    return controller;
};

function getAniversariantes(req, res) {
    res.json(aniversariantes);
}

function getConteudo(req, res) {
    res.json(conteudo);
}

function getCursos(req, res) {
    res.json(cursos);
}

function getEditarPerfil(req, res) {
    res.json(editarPerfil);
}

function putEditarPerfil(req, res) {
    //res.json(req.body);
    //console.log(req.body);
}

function getGrade(req, res) {
    res.json(grade);
}

function getHorarios(req, res) {
    res.json(horarios);
}

function getMessages(req, res) {
    res.json(mensagens);
}

function getNotas(req, res) {
    res.json(notas);
}

function getParcelas(req, res) {
    res.json(parcelas);
}

function getTarefas(req, res) {
    res.json(tarefas);
}

function getUsuario(req, res) {
    res.json(usuario);
}