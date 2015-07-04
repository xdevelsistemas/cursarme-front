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
        //res.json({"msgErro": "O endereço de email informado não está cadastrado! Por favor insira o email cadastrado para recuperar sua conta."});
    } else {
        res.json({"msgErro": "Email inválido"});
    }
}

function getDataUser(req, res) {
    var id = req.params.id;
    var dataUser = dataPassword.filter(function (data) {
            return data.id == id;
        })[0];
    dataUser ?
        res.render('resetpass', {title: 'Resetar senha', "message": "", dataUser: dataUser}):
        res.redirect('/login', {});
    //res.json(dataUser):
}

function putDataResetPassword(req, res) {
    var email = req.params.email,
        pw = req.params.password,
        token = req.params.token;

    /*   Senha enviada com sucesso   */

    /*   //   */

    res.redirect('/login', {"msgSuccess": "Senha enviada com sucesso"});
}

function isEmail(email){
    return /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/.test(email);
}