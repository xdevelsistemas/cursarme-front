module.exports = function (app, passport) {
    var controller = require('../controllers/comercial')();

    //dados-comercial
    app.route('/api/comercial/dados-comercial')
        .get(controller.showDadosComercial);

    //get-unidade
    app.route('/api/comercial/dados-curso')
        .get(controller.showDadosCurso);

    //info-usuario
    app.route('/api/comercial/info-usuario')
        .get(controller.showInfoUsuario);

    //modal-cheque
    app.route('/api/comercial/modal-cheque')
        .get(controller.showModalCheque);

    app.route('/api/comercial/verifica-cpf')
        .post(controller.putVerificaCpf);

    //view-inscr
    app.route('/api/comercial/view-inscr')
        .get(controller.showViewInscr);

    //dados-inscricao
    app.route('/api/comercial/dados-inscricao')
        .post(controller.putDadosInscricao);

    return app;
};