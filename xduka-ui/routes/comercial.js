module.exports = function (app, passport) {
    var controller = require('../controllers/comercial')();

    //form
    app.route('/api/comercial/form')
        .get(controller.showForm);

    //info-aluno
    app.route('/api/comercial/info-aluno')
        .get(controller.showInfoAluno);

    //info-controle
    app.route('/api/comercial/info-controle')
        .get(controller.showInfoControle);

    //info-curso
    app.route('/api/comercial/info-curso')
        .get(controller.showInfoCurso);

    //info-documentacao
    app.route('/api/comercial/info-documentacao')
        .get(controller.showInfoDocumentacao);

    //info-inscricao
    app.route('/api/comercial/info-inscricao')
        .get(controller.showInfoInscricao);

    //info-pagamento
    app.route('/api/comercial/info-pagamento')
        .get(controller.showInfoPagamento);

    //info-usuario
    app.route('/api/comercial/info-usuario')
        .get(controller.showInfoUsuario);

    //pre-cadastro
    app.route('/api/comercial/pre-cadastro')
        .get(controller.showPreCadastro);

    //tipo-telefone
    app.route('/api/comercial/tipo-telefone')
        .get(controller.showTipoTel);

    return app;
};