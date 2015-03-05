
module.exports = function () {
    var messages = require('../mockup/xduka-json/aluno/messages.json'),
        controller = {};

    controller.showMessages = function (req, res) {
        res.json(messages);
    };

    return controller;
};