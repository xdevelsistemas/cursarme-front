
module.exports = function () {
    var aniversariantes = require('../mockup/xduka-json/aluno/aniversariantes.json'),
        conteudo = require('../mockup/xduka-json/aluno/conteudo.json'),
        editarPerfil = require('../mockup/xduka-json/aluno/editar-perfil.json'),
        grade = require('../mockup/xduka-json/aluno/grade.json'),
        horarios = require('../mockup/xduka-json/aluno/horarios.json'),
        mensagens = require('../mockup/xduka-json/aluno/messages.json'),
        notas = require('../mockup/xduka-json/aluno/notas.json'),
        parcelas = require('../mockup/xduka-json/aluno/parcelas.json'),
        tarefas = require('../mockup/xduka-json/aluno/tasks.json'),

        controller = {};

    controller.showAniversariantes = function (req, res) {
        res.json(aniversariantes);
    };
    controller.showConteudo = function (req, res) {
        res.json(conteudo);
    };
    controller.showEditarPerfil = function (req, res) {
        res.json(editarPerfil);
    };
    controller.showGrade = function (req, res) {
        res.json(grade);
    };
    controller.showHorarios = function (req, res) {
        res.json(horarios);
    };
    controller.showMessages = function (req, res) {
        res.json(mensagens);
    };
    controller.showNotas = function (req, res) {
        res.json(notas);
    };
    controller.showParcelas = function (req, res) {
        res.json(parcelas);
    };
    controller.showTarefas = function (req, res) {
        res.json(tarefas);
    };

    return controller;
};