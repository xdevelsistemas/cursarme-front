var isLoggedIn = require('../services/isLoggedIn.js'),
    isNotLoggedIn = require('../services/isNotLoggedIn.js'),
    http = require('http');

var url = 'https://localhost',
    username = '',
    password = '',
    client = require("jsreport-client")(url, username, password);

module.exports = function (app, passport) {
//    var express = require('express');

    // ASSETS ========
    app.get('/assets', function (req, res) {
        res.redirect('/assets');
    });
    // STRINGS ========
    app.get('/strings', function (req, res) {
        res.redirect('/mockup/strings');
    });

    app.get('/resetarsenha/:token',
        function(req,res){
            var token = req.params.token,
                dataRes = {},
                options = {
                    host: 'localhost',
                    port: 3000,
                    path: '/api/resetpassword/' + token
                };

            var callback = function(response) {
                response.on('data', function (data) {
                    dataRes = JSON.parse(data);
                });
                response.on('end', function () {
                    // your code here if you want to use the results !
                    if (dataRes.msgErro && dataRes.msgErro != '') {
                        res.redirect('/login');
                    } else {
                        res.render('resetpass', {
                            title: 'Resetar senha',
                            message: '',
                            dataUser: dataRes
                        });
                    }
                });
            };

            http.request(options, callback).end();
        }
    );

    //404 ================================
    app.get('/404',
        function(req,res){
            res.render('404')
        }
    );

    //500 ================================
    app.get('/500',
        function(req,res){
            res.render('500')
        }
    );

    // LOGIN ===============================
    app.get('/login',
        function (req, res, next) {
            // if user is authenticated in the session, carry on
            if (req.isAuthenticated())
            // if they aren't redirect them to the home page
                res.redirect('/');
            return next();
        },
        function (req, res) {
            res.render('login', {
                title: 'Login',
                message: req.flash('loginMessage')
            });
        });

    // process the login form
    app.post('/login', passport.authenticate('local-login', {
        successRedirect: '/', // redirect to the secure profile section
        failureRedirect: '/login', // redirect back to the signup page if there is an error
        failureFlash: true // allow flash messages
    }));

    // SIGNUP ==============================
    app.get('/signup', isNotLoggedIn, function (req, res) {
        res.render('signup', {
            title: 'Sign up',
            message: req.flash('signupMessage')
        });
    });

    // process the signup form
    app.post('/signup', passport.authenticate('local-signup', {
        successRedirect: '/profile', // redirect to the secure profile section
        failureRedirect: '/signup', // redirect back to the signup page if there is an error
        failureFlash: true // allow flash messages
    }));

    // PROFILE SECTION =====================
    app.get('/profile', isLoggedIn, function (req, res) {
        res.render('profile', {
            title: 'Profile',
            user: req.user // get the user out of session and pass to template
        });
    });

    // LOGOUT ==============================
    app.get('/logout', function (req, res) {
        req.logout();
        res.redirect('/login');
    });


    // USER JSON
    app.get('/json/user', function (req, res) {
        if (!!req.user) {
            res.setHeader('Content-Type', 'application/json');
            res.send({success: true, obj: {
                id: req.user._id,
                email: req.user.local.email,
                areas: req.user.local.areas
            }});
        }
        else
            res.send({success: false, errmsg: 'User is not defined.'});
    });

    // REPORT
    app.get("/report", function(req, res, next) {
        var dataTemplate = {},
            options = {
                host: 'localhost',
                port: 3000,
                path: '/api/common/dados-template-header-footer/' + decodeURIComponent(req.query.templateContent)
            };

        var callback = function(response) {
            response.on('data', function (data) {
                dataTemplate = JSON.parse(data);
            });
            response.on('end', function () {
                // your code here if you want to use the results !
                dataTemplate.template.recipe = "phantom-pdf";
                dataTemplate.data.content = JSON.parse(decodeURIComponent(req.query.dataContent));

                client.render(dataTemplate, function(err, response) {
                    if (err) {
                        return next(err);
                    }
                    response.pipe(res);
                });
            });
        };

        http.request(options, callback).end();


    });


    return app;
};