// expose our config directly to our application using module.exports
module.exports = {

    jsreport : {
        prefix : "/jsreport/",
        http_host : process.env.HTTP_REPORTJS,
        http_port : process.env.PORT_REPORTJS
    }
};



