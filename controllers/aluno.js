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
    controller.putEditarPerfilFoto = putEditarPerfilFoto;
    controller.putEditarPerfilInfo = putEditarPerfilInfo;
    controller.putEditarPerfilSenha = putEditarPerfilSenha;
    controller.showGrade = getGrade;
    controller.showHorarios = getHorarios;
    controller.showInfoCurso = getInfoCurso;
    controller.showInfoUsuario = getInfoUsuario;
    controller.showMessages = getMessages;
    controller.showNotas = getNotas;
    controller.showParcelas = getParcelas;
    controller.showTarefas = getTarefas;

    return controller;
};

function getAniversariantes(req, res) {
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
            //req.params.id;
            res.json(aniversariantes);
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
}

function getConteudo(req, res) {
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
            res.json(conteudo);
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
}

function getEditarPerfil(req, res) {
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
            res.json(editarPerfil);
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
}

function putEditarPerfil(req, res) {
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
            //res.json(req.body);
            console.log(req.body);
            res.json({"foto": req.body});
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
}

function putEditarPerfilFoto(req, res) {
    //res.json(req.body);
    res.json({"foto": req.body});
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
}

function putEditarPerfilInfo(req, res) {
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
            var dataSent = req.body,
                dadosInfo;

            //// Limpa os dados referente aos maios de contato do ususario
            dataSent.info.email.model.err = "";
            dataSent.info.phone.model.err = "";
            dataSent.info.cel.model.err = "";

            //// verifica se os campos sao validos e se os campo não estão vazios
            if ((dataSent.info.email.model.val && dataSent.info.phone.model.val && dataSent.info.cel.model.val) &&
                isEmail(dataSent.info.email.model.val) && isPhone(dataSent.info.phone.model.val) && isCel(dataSent.info.cel.model.val)) {

                dadosInfo = {
                    "email":{"model":{"val": dataSent.info.email.model.val, "err": ""}},
                    "phone":{"model":{"val": dataSent.info.phone.model.val, "err": ""}},
                    "cel":{"model":{"val": dataSent.info.cel.model.val, "err": ""}}
                };

                dataSent.info.successMessage = dataSent.STR.SUCESSO;

                res.json(extend(true, dataSent.info, dadosInfo));
            }else{
                //// Verifica se os campo estão vazios
                if (!isEmail(dataSent.info.email.model.val)) {
                    dataSent.info.email.model.err = dataSent.STR.NOEMAIL;
                }else{
                    dataSent.info.email.model.err = '';
                }
                if (!isPhone(dataSent.info.phone.model.val)) {
                    dataSent.info.phone.model.err = dataSent.STR.NOPHONE;
                }else{
                    dataSent.info.phone.model.err = '';
                }
                if (!isCel(dataSent.info.cel.model.val)) {
                    dataSent.info.cel.model.err = dataSent.STR.NOCEL;
                }else{
                    dataSent.info.cel.model.err = '';
                }
                dataSent.info.successMessage = "";

                res.json(dataSent.info);
            }
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
}

function putEditarPerfilSenha(req, res) {
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
            var dataSent = req.body,
                dadosSenha;

            //// Limpa as mensagens de erros referente as senhas
            dataSent.password.current.model.err = "";
            dataSent.password.new.model.err = "";
            dataSent.password.confirm.model.err = "";

            //// Verifica se as novas senhas batem e se não estão vazios
            if ((dataSent.password.current.model.val && dataSent.password.new.model.val && dataSent.password.confirm.model.val) &&
                isConfPw(dataSent.password.new.model.val, dataSent.password.confirm.model.val)) {

                dadosSenha = {
                    "new": {"model": {"val": dataSent.password.new.model.val, "err": ""}},
                    "confirm": {"model": {"val": dataSent.password.confirm.model.val, "err": ""}},
                    "current": {"model": {"val": dataSent.password.current.model.val, "err": ""}}
                };

                dataSent.password.successMessagePw = dataSent.STR.SUCESSO;

                res.json(extend(true, dataSent.password, dadosSenha));

            }else{
                //// Verifica se os campos estao vazios
                dataSent.password.successMessagePw = "";
                if (!dataSent.password.current.model.val || !dataSent.password.new.model.val || !dataSent.password.confirm.model.val) {
                    if (!dataSent.password.current.model.val) {
                        dataSent.password.current.model.err = dataSent.STR.REQUIRIDO;
                    }else{
                        dataSent.password.current.model.err = '';
                    }
                    if (!dataSent.password.new.model.val) {
                        dataSent.password.new.model.err = dataSent.STR.REQUIRIDO;
                    }else{
                        dataSent.password.new.model.err = '';
                    }
                    if (!dataSent.password.confirm.model.val) {
                        dataSent.password.confirm.model.err = dataSent.STR.REQUIRIDO;
                    }else{
                        dataSent.password.confirm.model.err = '';
                    }
                }else{
                    dataSent.password.confirm.model.err = dataSent.STR.NOCONFER;
                }

                res.json(dataSent.password);
            }
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
}

function getGrade(req, res) {
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
            res.json(grade);
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
}

function getHorarios(req, res) {
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
            res.json(horarios);
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
}

function getInfoCurso(req, res) {
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
            res.json(cursos);
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
}

function getInfoUsuario(req, res) {
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
            res.json(usuario);
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
}

function getMessages(req, res) {
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
            var idCurso = req.params.id
                , msg = mensagens.filter(function (msg) {
                    return msg.idCurso == idCurso;
                })[0];
            msg ?
                res.json(msg) :
                res.json({});
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
}

function getNotas(req, res) {
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
            res.json(notas);
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
}

function getParcelas(req, res) {
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
            res.json(parcelas);
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
}

function getTarefas(req, res) {
    if(req.isAuthenticated()){
        if(req.user.local.areas.aluno){
            res.json(tarefas);
        }else{
            res.redirect("/404");
        }
    }else{
        res.redirect('/login');
    }
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