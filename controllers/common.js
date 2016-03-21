
// Carregando o módulo fs (filesystem)
var fs = require('fs'),
    request = require("request"),
    headerFooter = require('../mockup/xduka-json/common/templateReport.json');

    module.exports = function() {
    var controller = {};

    controller.showTemplateHeaderFooter = showTemplateHeaderFooter;

    return controller;
};

function showTemplateHeaderFooter(req, res) {
    // Ler o conteúdo do arquivo para a memória
    fs.readFile("./public/common/html/" + req.params.template + ".ejs", function ( err, data ) {
        if(err)throw err;
        headerFooter.template = {"content": data.toString()};
        res.json(headerFooter);
    });
}
