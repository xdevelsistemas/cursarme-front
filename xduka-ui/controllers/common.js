
// Carregando o módulo fs (filesystem)
var fs = require('fs'),
    request = require("request"),
    headerFooter = require('../mockup/xduka-json/common/templateReport.json'),
    reportClient = require('../config/report.js'),
    http =  require('http');


    module.exports = function() {
    var controller = {};

    controller.showTemplateHeaderFooter = showTemplateHeaderFooter;
    controller.putGeraRelatorio = putGeraRelatorio;

    return controller;
};

function showTemplateHeaderFooter(req, res) {
    // Ler o conteúdo do arquivo para a memória
    fs.readFile("./public/html/common/" + req.params.template + ".ejs", function ( err, data ) {
        headerFooter.template = {"content": data.toString()};
        res.json(headerFooter);
    });
}



function putGeraRelatorio(req, res) {

    var dataTemplate = {},
        options = reportClient.options(req.body.templateContent);

    var callback = function(response) {
        response.on('data', function (data) {
            dataTemplate = JSON.parse(data);
        });
        response.on('end', function () {
            // your code here if you want to use the results !
            dataTemplate.template.recipe = "phantom-pdf";
            dataTemplate.phantom = { header: "olha o header aqui", footer: "olha o footer aqui" };
            dataTemplate.data.content = req.body.dataContent;

            reportClient.client.render(dataTemplate, function(err, response) {
                if (err) {
                    return next(err);
                }
                response.pipe(res);
            });
        });
    };

    http.request(options, callback).end();



}