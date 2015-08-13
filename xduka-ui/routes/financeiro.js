module.exports = function (app, passport) {
    var controller = require('../controllers/financeiro')();

    //get-unidade
    app.route('/api/financeiro/test')
        .get(controller.test);

    return app;
};