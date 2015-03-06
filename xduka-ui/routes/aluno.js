module.exports = function (app) {
    var controller = app.controllers.aluno;

    //aniversariantes
    app.route('/aniversariantes')
        .get(controller.showAniversariantes);

    //conteudo
    app.route('/conteudo')
        .get(controller.showConteudo);

    //editar-perfil
    app.route('/editar-perfil')
        .get(controller.showEditarPerfil);

    //grade
    app.route('/grade')
        .get(controller.showGrade);

    //Horarios
    app.route('/horarios')
        .get(controller.showHorarios);

    //Mensagens
    app.route('/mensagens')
        .get(controller.showMessages);

    //Notas
    app.route('/notas')
        .get(controller.showNotas);

    //Parcelas
    app.route('/parcelas')
        .get(controller.showParcelas);

    //Tarefas
    app.route('/tarefas')
        .get(controller.showTarefas);
};
