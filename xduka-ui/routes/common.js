module.exports = function (app, passport) {
    var controller = require('../controllers/common')();

    //dados-template-report
    app.route('/api/common/dados-template-report')
        .get(controller.showDadosTemplateReport);

    return app;
};