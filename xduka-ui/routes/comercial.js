module.exports = function (app, passport) {
    var controller = require('../controllers/comercial')();

    //form
    app.route('/api/comercial/form')
        .get(controller.showForm);

    //info-aluno
    app.route('/api/comercial/info-aluno')
        .get(controller.showInfoAluno);

    //pre-cadastro
    app.route('/api/comercial/pre-cadastro')
        .get(controller.showPreCadastro);

    //tipo-telefone
    app.route('/api/comercial/tipo-telefone')
        .get(controller.showTipoTel);

    return app;
};