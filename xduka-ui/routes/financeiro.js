module.exports = function (app, passport) {
    var controller = require('../controllers/financeiro')();

    //Alunos Search
    app.route('/api/financeiro/aluno/:nomeMat')
        .get(controller.alunoSearch);

    //get template aluno
    app.route('/api/financeiro/chequeEdit')
        .post(controller.putChequeEdit);

    //dados-cadastro-caixa
    app.route('/api/financeiro/dados-cadastro-caixa')
        .get(controller.showDadosCadastroCaixa);

    //dados-cadastro-caixa
    app.route('/api/financeiro/dados-unidades')
        .get(controller.showDadosUnidades);

    //get-unidade
    app.route('/api/financeiro/getCheques')
        .get(controller.showCheques);

    //dados-cadastro-caixa
    app.route('/api/financeiro/save-dados-cadastro-caixa')
        .post(controller.putDadosCadastroCaixa);

    //dados-valores-curso
    app.route('/api/financeiro/save-valores-curso')
        .post(controller.putValoresCurso);

    //get template aluno
    app.route('/api/financeiro/templateAluno')
        .get(controller.showTemplateAluno);

    //template-cadastro-caixa
    app.route('/api/financeiro/template-cadastro-caixa')
        .get(controller.showTemplateCadastroCaixa);

    //template-valores-cursos
    app.route('/api/financeiro/template-valores-cursos')
        .get(controller.showTemplateValoresCursos);

    //template-valores-cursos
    app.route('/api/financeiro/template-valores-cursos')
        .get(controller.showTemplateValoresCursos);

    return app;
};