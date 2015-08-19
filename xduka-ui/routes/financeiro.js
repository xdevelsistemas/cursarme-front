module.exports = function (app, passport) {
    var controller = require('../controllers/financeiro')();

    //get-unidade
    app.route('/api/financeiro/getCheques')
        .get(controller.getCheques);
    //Alunos Search
    app.route('/api/financeiro/aluno/:nomeMat')
        .get(controller.alunoSearch);
    //get template aluno
    app.route('/api/financeiro/templateAluno')
        .get(controller.getTemplateAluno);

    return app;
};