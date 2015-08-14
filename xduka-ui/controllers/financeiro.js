
var http = require("http");

module.exports = function() {
    var controller = {};

    controller.putSaveControleCheque = putSaveControleCheque;

    return controller;
};

function putSaveControleCheque(req, res) {
    var data = req.body;

    /*  ==  ==  ==  ==  ==  */

    /*  ==  ==  ==  ==  ==  */

    res.json({"status": "ok"});
}