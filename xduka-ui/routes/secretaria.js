module.exports = function (app, passport) {
    var controller = require('../controllers/secretaria')();

    //
    app.route('/api/secretaria/dados-add-curso')
        .get(controller.showDadosAddCurso);

    //
    app.route('/api/secretaria/dados-curso')
        .get(controller.showDadosCurso);

    //
    app.route('/api/secretaria/dados-curso-pauta')
        .get(controller.showDadosCursoPauta);

    //dados-gera-turma
    app.route('/api/secretaria/dados-gera-turma')
        .get(controller.showDadosGeraTurma);

    //
    app.route('/api/secretaria/dados-pauta/:id')
        .get(controller.showDadosPauta);

    //info-usuario
    app.route('/api/secretaria/info-usuario')
        .get(controller.showInfoUsuario);

    //view-inscr
    app.route('/api/secretaria/view-inscr')
        .get(controller.showViewInscr);

    //dados-inscricao
    app.route('/api/secretaria/dados-inscricao')
        .post(controller.putDadosInscricao);

    //send-turmas
    app.route('/api/secretaria/send-turmas')
        .post(controller.putDadosTurmas);

    //template-inscricao
    app.route('/api/secretaria/template-inscricao')
        .get(controller.showTemplateInscricao);

    //Alunos Search
    app.route('/api/secretaria/aluno/:nomeMat')
        .get(controller.alunoSearch);

    //Template aluno
    app.route('/api/secretaria/template-add-curso')
        .get(controller.showTemplateAddCurso);

    //Template aluno
    app.route('/api/secretaria/templateAluno')
        .get(controller.showTemplateAl);

    //Alunos Search
    app.route('/api/secretaria/templateConfig')
        .get(controller.showConfig);

    //save-configuracoes
    app.route('/api/secretaria/save-configuracoes')
        .post(controller.putSaveConfig);

    //template-pauta
    app.route('/api/secretaria/template-pauta')
        .get(controller.showTemplatePauta);

    return app;
};