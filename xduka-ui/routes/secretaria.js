module.exports = function (app, passport) {
    var controller = require('../controllers/secretaria')();

    //get-unidade
    app.route('/api/secretaria/dados-curso')
        .get(controller.showDadosCurso);

    //dados-gera-turma
    app.route('/api/secretaria/dados-gera-turma')
        .get(controller.showDadosGeraTurma);

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

    //Alunos
    app.route('/api/secretaria/alunos')
        .get(controller.getAlunos);

    return app;
};