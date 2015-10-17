module.exports = function (app, passport) {
    var controller = require('../controllers/comercial')();

    //get-cep
    app.route('/api/comercial/dados-cep/:cep')
        .get(controller.showDadosCep);

    //dados-comercial
    app.route('/api/comercial/template-inscricao')
        .get(controller.showDadosInscricao);

    //get-unidade
    app.route('/api/comercial/dados-curso')
        .get(controller.showDadosCurso);

    //info-usuario
    app.route('/api/comercial/info-usuario')
        .get(controller.showInfoUsuario);

    //modal-cheque
    app.route('/api/comercial/modal-cheque')
        .get(controller.showModalCheque);

    app.route('/api/comercial/verifica-cpf/:cpf')
        .get(controller.putVerificaCpf);

    //view-inscr
    app.route('/api/comercial/view-inscr')
        .get(controller.showViewInscr);

    //view-contrato
    app.route('/api/comercial/view-contrato')
        .get(controller.showViewContrato);

    //dados-inscricao-completa
    app.route('/api/comercial/dados-inscricao-completa')
        .post(controller.putDadosInscricaoCompleta);

    //dados-inscricao-parcial
    app.route('/api/comercial/dados-inscricao-parcial')
        .post(controller.putDadosInscricaoParcial);

    return app;
};