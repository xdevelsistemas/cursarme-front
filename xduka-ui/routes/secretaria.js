module.exports = function (app, passport) {
    var controller = require('../controllers/secretaria')();

    //
    app.route('/api/secretaria/dados-add-curso/:id')
        .get(controller.showDadosAddCurso);

    //
    app.route('/api/secretaria/dados-curso')
        .get(controller.showDadosCurso);

    //
    app.route('/api/secretaria/dados-enviar-circular')
        .get(controller.showDadosEnviarCircular);

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
    app.route('/api/secretaria/get-id-curso')
        .get(controller.showIdCurso);

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
    app.route('/api/secretaria/template-add-disciplina/:id')
        .get(controller.showTemplateAddDisciplina);

    //Template aluno
    app.route('/api/secretaria/template-add-curso/:id')
        .get(controller.showTemplateAddCurso);

    //Template aluno
    app.route('/api/secretaria/templateAluno')
        .get(controller.showTemplateAl);

    //Template aluno
    app.route('/api/secretaria/template-enviar-circular')
        .get(controller.showTemplateEnviarCircular);

    //Alunos Search
    app.route('/api/secretaria/templateConfig')
        .get(controller.showConfig);

    //template-pauta
    app.route('/api/secretaria/template-pauta')
        .get(controller.showTemplatePauta);

    //save-configuracoes
    app.route('/api/secretaria/save-configuracoes')
        .post(controller.putSaveConfig);

    //
    app.route('/api/secretaria/save-enviar-circular')
        .post(controller.putEnviarCircular);

    //save-dados-disciplinas
    app.route('/api/secretaria/save-dados-disciplinas')
        .post(controller.putSaveDisciplinas);

    //
    app.route('/api/secretaria/save-frequencia-alunos')
        .post(controller.putSaveFreqAlunos);

    //
    app.route('/api/secretaria/save-novo-conteudo')
        .post(controller.putSaveNovoConteudo);

    //
    app.route('/api/secretaria/save-edit-conteudo')
        .post(controller.putSaveEditConteudo);

    //
    app.route('/api/secretaria/remove-conteudo')
        .post(controller.putRemoveConteudo);

    //
    app.route('/api/secretaria/save-dados-curso')
        .post(controller.putSaveDadosCurso);

    return app;
};