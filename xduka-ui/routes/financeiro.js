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

    //dados-tipo-curso
    app.route('/api/financeiro/dados-tipo-curso/:id')
        .get(controller.showDadosTipoCurso);

    //dados-tipo-curso-msg-boletos
    app.route('/api/financeiro/dados-tipo-curso-msg-boletos/:id')
        .get(controller.showDadosTipoCursoMsgBoletos);

    //dados-unidade
    app.route('/api/financeiro/dados-unidades')
        .get(controller.showDadosUnidades);

    //get-unidade
    app.route('/api/financeiro/getCheques')
        .get(controller.showCheques);

    //save-dados-cadastro-caixa
    app.route('/api/financeiro/save-dados-cadastro-caixa')
        .post(controller.putDadosCadastroCaixa);

    //save-dados-mensagem-boletos
    app.route('/api/financeiro/save-mensagem-boletos')
        .post(controller.putMsgBoletos);

    //dados-valores-curso
    app.route('/api/financeiro/save-valores-curso/:id')
        .post(controller.putValoresCurso);

    //get template aluno
    app.route('/api/financeiro/templateAluno')
        .get(controller.showTemplateAluno);

    //template-cadastro-caixa
    app.route('/api/financeiro/template-cadastro-caixa')
        .get(controller.showTemplateCadastroCaixa);

    //template-mensagem-boletos
    app.route('/api/financeiro/template-mensagem-boletos')
        .get(controller.showTemplateMsgBoletos);

    //template-valores-cursos
    app.route('/api/financeiro/template-valores-cursos')
        .get(controller.showTemplateValoresCursos);

    return app;
};