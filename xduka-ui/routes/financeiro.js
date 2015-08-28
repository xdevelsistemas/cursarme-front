module.exports = function (app, passport) {
    var controller = require('../controllers/financeiro')();

    //Alunos Search
    app.route('/api/financeiro/aluno/:nomeMat')
        .get(controller.alunoSearch);

    //get-unidade
    app.route('/api/financeiro/getCheques')
        .get(controller.showCheques);

    //get template aluno
    app.route('/api/financeiro/templateAluno')
        .get(controller.showTemplateAluno);

    //get template aluno
    app.route('/api/financeiro/chequeEdit')
        .post(controller.putChequeEdit);

    //dados-cadastro-caixa
    app.route('/api/financeiro/save-dados-cadastro-caixa')
        .post(controller.putDadosCadastroCaixa);

    //dados-cadastro-caixa
    app.route('/api/financeiro/dados-cadastro-caixa')
        .get(controller.showDadosCadastroCaixa);

    //template-cadastro-caixa
    app.route('/api/financeiro/template-cadastro-caixa')
        .get(controller.showTemplateCadastroCaixa);

    return app;
};