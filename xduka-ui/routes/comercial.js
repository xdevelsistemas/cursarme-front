module.exports = function (app, passport) {
    var controller = require('../controllers/comercial')();

    //dados-comercial
    app.route('/api/comercial/dados-comercial')
        .get(controller.showDadosComercial);

    //info-usuario
    app.route('/api/comercial/info-usuario')
        .get(controller.showInfoUsuario);

    //salva-dados-iniciais
    app.route('/api/comercial/salva-dados-iniciais')
        .post(controller.putDadosIniciais);

    return app;
};