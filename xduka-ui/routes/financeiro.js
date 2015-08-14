module.exports = function (app, passport) {
    var controller = require('../controllers/financeiro')();

    //get-unidade
    app.route('/api/financeiro/getCheques')
        .get(controller.getCheques);
    //Alunos Search
    app.route('/api/financeiro/aluno/:nomeMat')
        .get(controller.alunoSearch);

    return app;
};