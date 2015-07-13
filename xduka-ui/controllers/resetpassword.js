var dataPassword = require('../mockup/xduka-json/common/password.json');

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
        res.json({"msgSuccess": "Sucesso! Em breve enviaremos um email para " + email + " com os passos necessários para recuperar sua senha.", "msgErro": ""});
        //res.json({"message": "O endereço de email informado não está cadastrado! Por favor insira o email cadastrado para recuperar sua conta."});
    } else {
        res.json({"msgSuccess": "", "msgErro": "Email inválido"});
    }
}

function getDataUser(req, res) {
    var token = req.params.token;
    var dataUser = dataPassword.filter(function (data) {
            return data.token == token;
        })[0];
    dataUser ?
        res.json(dataUser):
        res.json({"msgSuccess": "", "msgErro": "Token expirado, por favor solicite outra nova senha"});
}

function putDataResetPassword(req, res) {
    var email = req.params.email,
        pw = req.params.password,
        token = req.params.token;

    /*   Senha enviada com sucesso   */

    /*   //   */

    res.json({"msgSuccess": "Senha alterada com sucesso.", "msgErro": ""});
    //res.json({"msgSuccess": "", "msgErro": "Token expirado, solicite novamente outra nova senha."});
}

function isEmail(email){
    return /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/.test(email);
}