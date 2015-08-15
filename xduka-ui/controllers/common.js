
var request = require("request");

module.exports = function() {
    var controller = {};

    controller.showDadosTemplateReport = showDadosTemplateReport;

    return controller;
};

function showDadosTemplateReport(req, res) {
    var data = req.query;

    /*  ===  FASE DE TESTES  ===  */
    request('https://localhost/api/report',JSON.parse(data.myParams), {responseType: data.responseType},
        function (error, response, body) {
            if (!error && response.statusCode == 200) {
                res.json(body);
            } else {
                res.json(error);
            }
        }
    )
}