/**
 * Created by douglas on 13/08/15.
 */

var http = require("http");

module.exports = function() {
    var controller = {};

    controller.showDadosTemplateReport = showDadosTemplateReport;

    return controller;
};

function showDadosTemplateReport(req, res) {
    var data = req.body;

    http.post('https://localhost/api/report',data.myParams, {responseType: data.responseType})
        .success(function(response) {
            res.json(response);
        })
        .catch(function(err){
            res.json(err);
        });
}