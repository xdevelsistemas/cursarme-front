module.exports = function (app, passport) {
    var controller = require('../controllers/common')();

    //dados-template-header-footer
    app.route('/api/common/dados-template-header-footer/:template')
        .get(controller.showTemplateHeaderFooter);


    app.route('/api/common/report')
        .post(controller.putGeraRelatorio);



    return app;
};