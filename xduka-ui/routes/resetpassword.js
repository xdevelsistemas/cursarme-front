module.exports = function (app, passport) {
    var controller = require('../controllers/resetpassword')();

    //a tela de resetar senha terá a seguinte dinamica:
    //
    //    1) post /api/resetpassword com parametro email : email
    app.route('/api/resetpassword/:email')
        .post(controller.putResetPassword);
    //
    //2) get /api/resetpassword/:id sendo a id o token enviado pelo email a tela de resetar senha deve ser assim:
    //    beta.xduka.com.br/resetarsenha/:id onde a id vai ser passada pelo email
    app.route('/api/resetpassword/:id')
        .get(controller.getDataUser);
    //
    //3) post /api/resetpassword com parametros   { email : email, password: password, token: token}
    app.route('/api/resetpassword/:data')
        .post(controller.putDataResetPassword);
    //
    //
    return app;
};