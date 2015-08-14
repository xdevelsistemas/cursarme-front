module.exports = function (app, passport) {
    var controller = require('../controllers/financeiro')();

    //get-unidade
    app.route('/api/financeiro/getCheques')
        .get(controller.getCheques);

    return app;
};