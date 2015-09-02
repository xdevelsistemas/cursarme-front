var reportjsClient = require("jsreport-client"),
    //url = process.env.REPORTJS_URL,
    url = 'http://localhost:3000',
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
