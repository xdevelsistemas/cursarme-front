var controller = require('../controllers/aluno');

module.exports = function () {
    app.route('/mensagens')
        .get(controller.showMessages);
};
