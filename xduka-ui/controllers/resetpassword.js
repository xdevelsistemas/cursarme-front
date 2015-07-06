var dataPassword = require('../mockup/xduka-json/common/password.json'),
    emails = {};

module.exports = function() {
    var controller = {};

    controller.putResetPassword = putResetPassword;
    controller.getDataUser = getDataUser;
    controller.putDataResetPassword = putDataResetPassword;

    return controller;
};

function putResetPassword(req, res) {
    var email = req.params.email;

    if (isEmail(email)) {
        res.json({"msgSuccess": "Sucesso! Em breve você receberá um email para " + email + " com os passos necessários para recuperar sua senha."});
        //res.json({"message": "O endereço de email informado não está cadastrado! Por favor insira o email cadastrado para recuperar sua conta."});
    } else {
        res.json({"message": "Email inválido"});
    }
}

function getDataUser(req, res) {
    var token = req.params.token;
    var dataUser = dataPassword.filter(function (data) {
            return data.token == token;
        })[0];
    dataUser ?
        res.redirect('/resetarsenha/' + token, dataUser):
        res.render('login', {title: 'Login', "message": "Token expirado, por favor solicite outra nova senha"});
}

function putDataResetPassword(req, res) {
    var email = req.body.dados.email,
        pw = req.body.newpass.password,
        token = req.body.dados.token;

    /*   Senha enviada com sucesso   */

    /*   //   */

    res.render('login', {title: 'Login', "message": "", "msgSuccess": "Senha enviada com sucesso"});
}

function isEmail(email){
    return /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/.test(email);
}