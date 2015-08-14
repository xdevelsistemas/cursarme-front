var isLoggedIn = require('../services/isLoggedIn.js');
var isAluno = require('../services/isAluno.js');
var isComercial = require('../services/isComercial.js');
var isSecretaria = require('../services/isSecretaria.js');
var isFinanceiro = require('../services/isFinanceiro.js');
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
        res.render('comercial', { title: 'Comercial', area: 'comercial' });
    });

    // SECRETARIA ========
    app.get('/secretaria', isLoggedIn, isSecretaria, require('../services/isSecretaria.js'), function (req, res) {
        res.render('secretaria', { title: 'Secretaria', area: 'secretaria' });
    });

    // FINANCEIRO ========
    app.get('/financeiro', isLoggedIn, isFinanceiro, require('../services/isFinanceiro.js'), function (req, res) {
        res.render('financeiro', { title: 'Financeiro', area: 'financeiro' });
    });

    // App ========
    app.get('/app', isLoggedIn, isComercial, require('../services/isComercial.js'), function (req, res) {
        res.render('comercial', { title: 'Comercial', area: 'comercial' });
    });
    return app;
};