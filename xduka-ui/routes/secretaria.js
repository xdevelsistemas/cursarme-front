module.exports = function (app, passport) {
    var controller = require('../controllers/secretaria')();

    //
    app.route('/api/secretaria/showTurmas/')
        .get(controller.showTurmas);

    //
    app.route('/api/secretaria/cursos/:tipo')
        .get(controller.showCursos);

    //
    app.route('/api/secretaria/template-add-turma/:id')
        .get(controller.showTemplateAddTurma);

    //
    app.route('/api/secretaria/dados-add-curso/:id')
        .get(controller.showDadosAddCurso);

    // Dados aulas dadas
    app.route('/api/secretaria/dados-aulas-dadas')
        .get(controller.showDadosAulasDadas);

    //
    app.route('/api/secretaria/dados-curso')
        .get(controller.showDadosCurso);

    //
    app.route('/api/secretaria/dados-curso-pauta/:id')
        .get(controller.showDadosCursoPauta);

    // dados-gera-turma
    app.route('/api/secretaria/dados-gera-turma')
        .get(controller.showDadosGeraTurma);

    // template-area-grade
    app.route('/api/secretaria/template-area-grade-curricular/:id')
        .get(controller.showTemplateAreaGradeCurricular);

    // template-curso-grade
    app.route('/api/secretaria/template-curso-grade-curricular/:id')
        .get(controller.showTemplateCursoGradeCurricular);

    // template-grade
    app.route('/api/secretaria/template-grade-grade-curricular/:id')
        .get(controller.showTemplateGradeGradeCurricular);

    // dados-grade
    app.route('/api/secretaria/dados-grade-curricular/:id')
        .get(controller.showDadosGradeCurricular);

    //
    app.route('/api/secretaria/dados-enviar-circular/:id')
        .get(controller.showDadosEnviarCircular);

    //
    app.route('/api/secretaria/dados-material-complementar/:id')
        .get(controller.showDadosMaterialComp);

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

    //
    app.route('/api/secretaria/template-add-curso/:id')
        .get(controller.showTemplateAddCurso);

    //Template aluno
    app.route('/api/secretaria/templateAluno')
        .get(controller.showTemplateAl);

    //
    app.route('/api/secretaria/template-enviar-circular')
        .get(controller.showTemplateEnviarCircular);

    // template-grade-curricular
    app.route('/api/secretaria/template-grade-curricular')
        .get(controller.showTemplateGradeCurricular);

    //
    app.route('/api/secretaria/template-material-complementar')
        .get(controller.showTemplateMaterialCircular);

    //
    app.route('/api/secretaria/templateConfig')
        .get(controller.showConfig);

    //template-pauta
    app.route('/api/secretaria/template-pauta')
        .get(controller.showTemplatePauta);

    //save-dados-aulas-dadas
    app.route('/api/secretaria/save-aulas-dadas')
        .post(controller.putSaveAulasDadas);

    //save-configuracoes
    app.route('/api/secretaria/save-configuracoes')
        .post(controller.putSaveConfig);

    //save-dados-disciplinas
    app.route('/api/secretaria/save-dados-disciplinas')
        .post(controller.putSaveDisciplinas);

    //save-dados-disciplinas
    app.route('/api/secretaria/save-dados-disciplinas-curricular')
        .post(controller.putSaveDiscGradCurric);

    //
    app.route('/api/secretaria/save-enviar-circular')
        .post(controller.putSaveEnviarCircular);

    //
    app.route('/api/secretaria/save-frequencia-alunos')
        .post(controller.putSaveFreqAlunos);

    // save-dados-grade-curricular
    app.route('/api/secretaria/save-dados-grade-curricular')
        .post(controller.putSaveGradeCurricular);

    //
    app.route('/api/secretaria/save-material-complementar')
        .post(controller.putSaveMaterialComp);

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