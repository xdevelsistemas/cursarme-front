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
        res.render('/resetarsenha', {"msgSuccess": "Enviamos um link para seu email"});
    } else {
        res.render('/resetarsenha', {"msgErro": "Email inválido"});
    }
}

function getDataUser(req, res) {
    var id = req.params.id
        , dataUser = dataPassword.filter(function (data) {
            return data.id == id;
        })[0];
    dataUser ?
        res.render('/resetarsenha', {"dataUser": dataUser}):
        res.render('/resetarsenha', {"msgErro": "Token expirado, favor solicitar novamente"});
}

function putDataResetPassword(req, res) {
    var data = req.params.data;

    /*   Senha enviada com sucesso   */

    /*   //   */

    res.render('/resetarsenha', {"msgSuccess": "Senha enviada com sucesso"});
}

function isEmail(email){
    return /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/.test(email);
}