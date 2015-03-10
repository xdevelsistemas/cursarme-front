
module.exports = function (app, passport) {
    var controller = require('../controllers/aluno')();

    //aniversariantes
    app.route('/api/aluno/aniversariantes')
        .get(controller.showAniversariantes);

    //conteudo
    app.route('/api/aluno/conteudo')
        .get(controller.showConteudo);

    //editar-perfil
    app.route('/api/aluno/editar-perfil')
        .get(controller.showEditarPerfil);

    //grade
    app.route('/api/aluno/grade')
        .get(controller.showGrade);

    //Horarios
    app.route('/api/aluno/horarios')
        .get(controller.showHorarios);

    //Mensagens
    app.route('/api/aluno/mensagens')
        .get(controller.showMessages);

    //Notas
    app.route('/api/aluno/notas')
        .get(controller.showNotas);

    //Parcelas
    app.route('/api/aluno/parcelas')
        .get(controller.showParcelas);

    //Tarefas
    app.route('/api/aluno/tarefas')
        .get(controller.showTarefas);

    //Tarefas
    app.route('/api/aluno/usuario')
        .get(controller.showUsuario);

    return app;
};
