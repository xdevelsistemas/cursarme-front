var reportjsClient = require("jsreport-client"),
    url = 'http://localhost:3000/jsreport/',
    username = process.env.REPORTJS_USERNAME,
    password = process.env.REPORTJS_PASSWORD;

var options = function (templateContent) {
    return {
        host: 'localhost',
        port: function(){return process.env.PORT || 3000}(),
        path: '/api/common/dados-template-header-footer/' + decodeURIComponent(templateContent)
    }
};

module.exports = {
    client :reportjsClient(url, username, password),
    options : options
};
