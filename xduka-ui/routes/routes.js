var isLoggedIn = require('../services/isLoggedIn.js'),
    isNotLoggedIn = require('../services/isNotLoggedIn.js'),
    reportClient = require('../config/report.js'),
    http =  require('http');


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
                    port: function(){return process.env.PORT || 3000}(),
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
    app.get('/report', function (req, res) {

        var dataTemplate = {},
            options = reportClient.options(req.query.templateContent),

            data_content = [
                {

                },
                {
                    'data': '22/12/2015',
                    'nome': 'João das Couves',
                    'curso': 'Sistemas de Informação'
                },
                {
                    'head': [
                        {text: 'Nome'},
                        {text: '5 fotos 3x4'},
                        {text: 'Carteira de Identidade'},
                        {text: 'CPF'},
                        {text: 'Titulo Eleitoral'},
                        {text: 'Comprovante da Ultima Eleição'},
                        {text: 'Certidão de Reservista'},
                        {text: 'Certidão de Nascimento ou Casamento'},
                        {text: 'Comprovante de Residência'},
                        {text: 'Diploma de Graduação'},
                        {text: 'Histórico de Graduação'},
                        {text: 'Certidão de Conclusão'}
                    ],
                    'body': [
                        {
                            Nome: 'João das Couves',
                            foto: 'X',
                            c_id: '',
                            cpf: 'X',
                            tit_eleit: '',
                            comp_eleit: 'X',
                            cert_reserv: 'X',
                            cert_cas: '',
                            comp_res: 'X',
                            dip_grad: '',
                            hist_grad: 'X',
                            cert_conclu: 'X'
                        }
                    ]
                }
            ];




        var callback = function(response) {
            response.on('data', function (data) {
                dataTemplate = JSON.parse(data);
            });
            response.on('end', function() {
                dataTemplate.template.recipe = "phantom-pdf";
                dataTemplate.data.content = data_content[req.query.data];

                reportClient.client.render(dataTemplate, function(err, response) {
                    if (err) {
                        return next(err);
                    }

                    response.pipe(res);


                });
            });
        };

        http.request(options, callback).end();


    });

};
