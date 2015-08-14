module.exports = function (app, passport) {
    var controller = require('../controllers/financeiro')();

    //save-controle-cheque
    app.route('/api/common/save-controle-cheque')
        .post(controller.putSaveControleCheque);

    return app;
};