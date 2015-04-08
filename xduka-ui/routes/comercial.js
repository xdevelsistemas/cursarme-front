module.exports = function (app, passport) {
    var controller = require('../controllers/comercial')();

    //form
    app.route('/api/comercial/form')
        .get(controller.showForm);

    //infoAluno
    app.route('/api/comercial/info-aluno')
        .get(controller.showInfoAluno);

    //tipoTel
    app.route('/api/comercial/tipo-telefone')
        .get(controller.showTipoTel);

    return app;
};