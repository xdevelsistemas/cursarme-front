var urlDataBase = '',
    extend = require('node.extend'),
    request = require('request'),
    test = 'Rota financeiro!';

module.exports = function() {
    var controller = {};

    controller.test = teste;

    return controller;
};
function teste(req,res) {
    res.send(test);
}