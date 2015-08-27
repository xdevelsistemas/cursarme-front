module.exports = function (app, passport) {
    var controller = require('../controllers/financeiro')();

    //Alunos Search
    app.route('/api/financeiro/aluno/:nomeMat')
        .get(controller.alunoSearch);

    //get-unidade
    app.route('/api/financeiro/getCheques')
        .get(controller.getCheques);

    //get template aluno
    app.route('/api/financeiro/templateAluno')
        .get(controller.getTemplateAluno);

    //get template aluno
    app.route('/api/financeiro/chequeEdit')
        .post(controller.postChequeEdit);

    return app;
};