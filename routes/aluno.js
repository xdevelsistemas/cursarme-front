
module.exports = function (app, passport) {
    var controller = require('../controllers/aluno')();

    //aniversariantes
    app.route('/api/aluno/aniversariantes/:id')
        .get(controller.showAniversariantes);

    //conteudo
    app.route('/api/aluno/conteudo/:id')
        .get(controller.showConteudo);

    //editar-perfil
    app.route('/api/aluno/editar-perfil')
        .get(controller.showEditarPerfil)
        .post(controller.putEditarPerfil);

    //editar-perfil-foto
    app.route('/api/aluno/editar-perfil-foto')
        .post(controller.putEditarPerfilFoto);

    //editar-perfil-senha
    app.route('/api/aluno/editar-perfil-senha')
        .post(controller.putEditarPerfilSenha);

    //editar-perfil-info
    app.route('/api/aluno/editar-perfil-info')
        .post(controller.putEditarPerfilInfo);

    //grade
    app.route('/api/aluno/grade/:id')
        .get(controller.showGrade);

    //Horarios
    app.route('/api/aluno/horarios/:id')
        .get(controller.showHorarios);

    //Nome e id do curso do usuario
    app.route('/api/aluno/infoCurso')
        .get(controller.showInfoCurso);

    //Informações do usuario
    app.route('/api/aluno/infoUsuario')
        .get(controller.showInfoUsuario);

    //Mensagens
    app.route('/api/aluno/mensagens/:id')
        .get(controller.showMessages);

    //Notas
    app.route('/api/aluno/notas/:id')
        .get(controller.showNotas);

    //Parcelas
    app.route('/api/aluno/parcelas/:id')
        .get(controller.showParcelas);

    //Tarefas
    app.route('/api/aluno/tarefas/:id')
        .get(controller.showTarefas);

    return app;
};
