var urlDataBase = '',
    extend = require('node.extend'),
    request = require('request'),
    cheques = require('../mockup/xduka-json/financeiro/cheques.json');

module.exports = function() {
    var controller = {};

    controller.getCheques = getCheques;

    return controller;
};
function getCheques(req,res) {
    res.json(cheques)
}