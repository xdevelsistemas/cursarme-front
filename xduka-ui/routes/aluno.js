module.exports = function (app) {
    var controller = require('../controllers/aluno');
    app.route('/mensagens')
        .get(controller.showMessages);
};
