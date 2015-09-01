var verificaAutenticacao = require('../services/isLoggedIn.js');

module.exports = function (app, passport, backend_host, backend_port, backend_path_prefix, standard_prefix, http, express, path) {

    // Proxy request
    function get_from_proxy(request, response) {

        // if a path prefix is set, remove the existing one
        if (backend_path_prefix !== '') {
            if (request.url.indexOf(standard_prefix) === 0) {
                request.url = backend_path_prefix + request.url.substr(standard_prefix.length);
            }
        }



        var options = {
            hostname: backend_host,
            port: backend_port,
            path: request.url,
            method: request.method,
            headers: request.headers
        };

        console.log(options.method, options.path);

        var proxy_request = http.request(options);

        proxy_request.addListener('response', function (proxy_response) {
            proxy_response.addListener('data', function (chunk) {
                response.write(chunk, 'binary');
            });

            proxy_response.addListener('end', function () {
                if (process.env.CHAOS_MONKEY) {
                    setTimeout(function () {
                        response.end();
                    }, Math.floor(Math.random() * 3000));
                } else {
                    response.end();
                }
            });
            //console.log(proxy_response.headers);
            response.writeHead(proxy_response.statusCode, proxy_response.headers);
        });

        //request.addListener('data', function (chunk) {
        //    proxy_request.write(chunk, 'binary');
        //});
        if (options.headers["content-length"] > 0 ){
            proxy_request.write(JSON.stringify(request.body))
        }


        proxy_request.end();
    }


    // Handle of path rests through proxy
    app.route(path + '*').all(verificaAutenticacao,function (req, res, next) {
        req.headers.host = backend_host;
        get_from_proxy(req, res);
    });

    return app;
};