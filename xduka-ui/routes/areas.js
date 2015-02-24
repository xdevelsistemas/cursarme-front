var isLoggedIn = require('../services/isLoggedIn.js');
var isAluno = require('../services/isAluno.js');
var isComercial = require('../services/isComercial.js');
var loginRedirect = require('../services/loginRedirect.js');

module.exports = function (app, passport) {
    var express = require('express');

    // VISITANTE ========
    app.get('/', isLoggedIn, loginRedirect, function (req, res) {
        res.render('index', { title: 'Visitante', area: 'visitante'});
    });

    // ALUNO ========
    app.get('/aluno', isLoggedIn, isAluno, function (req, res) {
        res.render('index', { title: 'Aluno', area: 'aluno' });
    });

    // COMERCIAL ========
    app.get('/comercial', isLoggedIn, isComercial, require('../services/isComercial.js'), function (req, res) {
        res.render('index', { title: 'Comercial', area: 'comercial' });
    });

    // App ========
    app.get('/app', isLoggedIn, isComercial, require('../services/isComercial.js'), function (req, res) {
        res.render('index', { title: 'Comercial', area: 'comercial' });
    });
    return app;
};