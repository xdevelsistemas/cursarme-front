module.exports = function (app, passport) {
    var controller = require('../controllers/secretaria')();

    //template-inscricao
    app.route('/api/secretaria/template-inscricao')
        .get(controller.showDadosComercial);

    //info-usuario
    app.route('/api/secretaria/info-usuario')
        .get(controller.showInfoUsuario);

    //view-inscr
    app.route('/api/secretaria/view-inscr')
        .get(controller.showViewInscr);

    //dados-inscricao
    app.route('/api/secretaria/dados-inscricao')
        .post(controller.putDadosInscricao);

    return app;
};