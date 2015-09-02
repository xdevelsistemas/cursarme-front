var express = require('express');
var path = require('path');
var favicon = require('static-favicon');
var logger = require('morgan');
var mongoose = require('mongoose');
var passport = require('passport');
var flash = require('connect-flash');
var morgan = require('morgan');
var cookieParser = require('cookie-parser');
var bodyParser = require('body-parser');
var session = require('express-session');
var compression = require('compression')
var app = express();
var http = require('http');

var RedisStore = require('connect-redis')(session);

// configuration ===============================================================
var configDB = require('./config/database.js'),
    configRedis = require('./config/redis.js'),
    proxies = require('./config/proxies.js');

mongoose.connect(configDB.url); // connect to our database



//enable cors
app.use(function(req, res, next) {
    res.header("Access-Control-Allow-Origin", "" + process.env.STATIC_HOST + "" );
    res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
    next();
});

// view engine setup
app.get('env') === 'development' ?
    app.set('views', path.join(__dirname, 'views')):
    app.set('views', path.join(__dirname, 'dist/views'));

app.set('view engine', 'ejs'); // set up ejs for templating

app.use(favicon());
app.use(logger('dev'));
app.use(morgan('dev')); // log every request to the console
app.use(cookieParser()); // read cookies (needed for auth)
app.use(bodyParser({limit: '50mb'})); // get information from html forms / limite upload de arquivo 50mb
app.use(bodyParser.json());
app.use(bodyParser.urlencoded());

app.get('env') === 'development' ?
    app.use(express.static(path.join(__dirname, 'public'))):
    app.use(express.static(path.join(__dirname, 'dist/public')));

app.use(session({
        store: new RedisStore(configRedis),
        cookie: {maxAge: (24 * 3600 * 1000 * 180)}, // 180 Days in ms
        secret: 'ilovescotchscotchyscotchscotch'
    })
);


// required for passport
require('./config/passport')(passport); // pass passport for configuration

app.use(passport.initialize());
app.use(passport.session()); // persistent login sessions
app.use(flash()); // use connect-flash for flash messages stored in session


//html compression - compress all requests
app.use(compression());

// routes ======================================================================
// load our routes and pass in our app and fully configured passport
require('./routes/routes.js')(app, passport);
require('./routes/areas.js')(app, passport);
require('./routes/aluno.js')(app, passport);
require('./routes/comercial.js')(app, passport);
require('./routes/common.js')(app, passport);
require('./routes/financeiro.js')(app, passport);
require('./routes/resetpassword.js')(app, passport);
require('./routes/secretaria.js')(app, passport);
require('./routes/financeiro.js')(app, passport);


//jsreport route
require('./routes/proxyRoutes')(app, passport, proxies.jsreport.http_host, proxies.jsreport.http_port, "/api/report", proxies.jsreport.prefix, http, express, proxies.jsreport.prefix);




/// catch 404 and forward to error handler
if (app.get('env') === 'development') {
    app.use(function (req, res, next) {
        var err = new Error('Not Found');
        err.status = 404;

        res.render('error', {
            message: err.message,
            error: err
        });
    });
} else {
    app.use(function (req, res, next) {
        var err = new Error('Not Found');
        err.status = 404;
        /*next(err);*/

        res.render('404');
    });
}
/// error handlers

// development error handler
// will print stacktrace
if (app.get('env') === 'development') {
    app.use(function (err, req, res, next) {
        res.status(err.status || 400);
        res.render('error', {
            message: err.message,
            error: err
        });
    });
}else {
    // production error handler
    // no stacktraces leaked to user
    app.use(function (err, req, res, next) {
        res.status(err.status || 400);
        res.render('400', {
            message: err.message,
            error: err
        });
    });
}

// development error handler
// will print stacktrace
if (app.get('env') === 'development') {
    app.use(function (err, req, res, next) {
        res.status(err.status || 500);
        res.render('error', {
            message: err.message,
            error: err
        });
    });
}else {
    // production error handler
    // no stacktraces leaked to user
    app.use(function (err, req, res, next) {
        res.status(err.status || 500);
        res.render('500', {
            message: err.message,
            error: err
        });
    });
}


module.exports = app;
