
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
    var content;

    // Ler o conteúdo do arquivo para a memória
    fs.readFile("/html/common/" + req.params.template + ".ejs",
        function ( err, data ) {
            content = data;

            // Se ocorrer erro
            if (err) {
                res.json(headerFooter.error = {"content": true, "error": err});
            }

            // logData é um Buffer, converta-o para string
            console.log(content);   // Put all of the code here (not the best solution)
            processFile();
    });

    console.log(content);
    headerFooter.template.content = content;
    res.json(headerFooter);
}