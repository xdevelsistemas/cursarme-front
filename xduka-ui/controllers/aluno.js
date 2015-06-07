var extend = require('node.extend'),
    aniversariantes = require('../mockup/xduka-json/aluno/aniversariantes.json'),
    conteudo = require('../mockup/xduka-json/aluno/conteudo.json'),
    cursos = require('../mockup/xduka-json/aluno/cursos.json'),
    editarPerfil = require('../mockup/xduka-json/aluno/editar-perfil.json'),
    grade = require('../mockup/xduka-json/aluno/grade.json'),
    horarios = require('../mockup/xduka-json/aluno/horarios.json'),
    mensagens = require('../mockup/xduka-json/aluno/messages.json'),
    notas = require('../mockup/xduka-json/aluno/notas.json'),
    parcelas = require('../mockup/xduka-json/aluno/parcelas.json'),
    tarefas = require('../mockup/xduka-json/aluno/tasks.json'),
    usuario = require('../mockup/xduka-json/common/user.json');

module.exports = function() {
    var controller = {};

    controller.showAniversariantes = getAniversariantes;
    controller.showConteudo = getConteudo;
    controller.showEditarPerfil = getEditarPerfil;
    controller.putEditarPerfil = putEditarPerfil;
    controller.putEditarPerfilInfo = putEditarPerfilInfo;
    controller.putEditarPerfilSenha = putEditarPerfilSenha;
    controller.showGrade = getGrade;
    controller.showHorarios = getHorarios;
    controller.showInfoUsuario = getInfoUsuario;
    controller.showMessages = getMessages;
    controller.showNotas = getNotas;
    controller.showParcelas = getParcelas;
    controller.showTarefas = getTarefas;

    return controller;
};

function getAniversariantes(req, res) {
    //req.params.id;
    res.json(aniversariantes);
}

function getConteudo(req, res) {
    res.json(conteudo);
}

function getEditarPerfil(req, res) {
    res.json(editarPerfil);
}

function putEditarPerfil(req, res) {
    //res.json(req.body);
    console.log(req.body);
    res.json({"status": "ok"});
}

function putEditarPerfilInfo(req, res) {
    var dataSent = req.body,
        dadosInfo;

    //// Limpa os dados referente aos maios de contato do ususario
    dataSent.info.email.err = "";
    dataSent.info.phone.err = "";
    dataSent.info.cel.err = "";

    //// verifica se os campos sao validos e se os campo não estão vazios
    if (isEmail(dataSent.info.email.val) && isPhone(dataSent.info.phone.val) && isCel(dataSent.info.cel.val) &&
        (dataSent.info.email.val && dataSent.info.phone.val && dataSent.info.cel.val)) {

        dadosInfo = {
            "email":{"model":{"val": dataSent.info.email.val, "err": ""}},
            "phone":{"model":{"val": dataSent.info.phone.val, "err": ""}},
            "cel":{"model":{"val": dataSent.info.cel.val, "err": ""}}
        };

        res.json(extend(true, dataSent.info, dadosInfo));
    }else{
        //// Verifica se os campo estão vazios
        if (!isEmail(dataSent.info.email.val)) {
            dataSent.info.email.err = dataSent.STR.NOEMAIL;
        }else{
            dataSent.info.email.err = '';
        }
        if (!isPhone(dataSent.info.phone.val)) {
            dataSent.info.phone.err = dataSent.STR.NOPHONE;
        }else{
            dataSent.info.phone.err = '';
        }
        if (!isCel(dataSent.info.cel.val)) {
            dataSent.info.cel.err = dataSent.STR.NOCEL;
        }else{
            dataSent.info.cel.err = '';
        }
        dataSent.info.successMessage = dataSent.STR.SUCESSO;
    }

    res.json(dataSent);
}

function putEditarPerfilSenha(req, res) {
    //res.json(req.body);
    console.log(req.body);
    res.json({"status": "ok"});
}

function getGrade(req, res) {
    res.json(grade);
}

function getHorarios(req, res) {
    res.json(horarios);
}

function getInfoUsuario(req, res) {
    var infoUsuario = {
        "cursos": cursos,
        "usuario": usuario
    };
    res.json(infoUsuario);
}

function getMessages(req, res) {
    var idCurso = req.params.id
        , msg = mensagens.filter(function (msg) {
            return msg.idCurso == idCurso;
        })[0];
    msg ?
        res.json(msg) :
        res.json({});
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

/*  Funções de editar-perfil    */

function isCel(cel){
    return cel.length == 11;
}

function isConfPw(newPw, confPw){
    return newPw == confPw;
}

function isEmail(email){
    var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    return regex.test(email);
}

function isPhone(phone){
    return phone.length == 10;
}