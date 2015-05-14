module.exports = function (app, passport) {
    var controller = require('../controllers/comercial')();

    //dados-comercial
    app.route('/api/comercial/dados-comercial')
        .get(controller.showDadosComercial);

    //info-usuario
    app.route('/api/comercial/info-usuario')
        .get(controller.showInfoUsuario);

    //view-inscr
    app.route('/api/comercial/view-inscr')
        .get(controller.showViewInscr);

    //salva-dados-iniciais
    app.route('/api/comercial/dados-matricula')
        .post(controller.putDadosMatricula);

    //salva-first-dados
    app.route('/api/comercial/dados-inscricao')
        .post(controller.putDadosInscricao);

    return app;
};