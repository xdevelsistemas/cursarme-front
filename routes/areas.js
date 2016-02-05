var isLoggedIn = require('../services/isLoggedIn.js');
var isAluno = require('../services/isAluno.js');
var isComercial = require('../services/isComercial.js');
var isSecretaria = require('../services/isSecretaria.js');
var isFinanceiro = require('../services/isFinanceiro.js');
var loginRedirect = require('../services/loginRedirect.js');

module.exports = function (app, passport) {
    var express = require('express');

    // MODULOS (CASO HAJA MAIS DE 1)
    app.get('/modulos', isLoggedIn, function(req, res){
        var modulos = [];
        if(req.user._doc.local.areas.aluno){
            modulos.push({
                href: '/aluno',
                icon: 'entypo-user',
                text: 'Aluno',
                description: 'Acessar página de alunos'
            })
        }
        if(req.user._doc.local.areas.comercial){
            modulos.push({
                href: '/comercial',
                icon: 'entypo-credit-card',
                text: 'Comercial',
                description: 'Novas Matrículas'
            })
        }
        if(req.user._doc.local.areas.financeiro){
            modulos.push({
                href: '/financeiro',
                icon: 'entypo-chart-line',
                text: 'Financeiro',
                description: 'Gestão Financeira'
            })
        }
        if(req.user._doc.local.areas.secretaria){
            modulos.push({
                href: '/secretaria',
                icon: 'entypo-graduation-cap',
                text: 'Secretaria',
                description: 'Conferência de Cadastros'
            })
        }

        res.render('modulos', {
            title: 'Modulos',
            modulos: modulos
        })
    });

    // VISITANTE ========
    app.get('/', isLoggedIn, loginRedirect, function (req, res) {
        res.render('index', { title: 'Visitante', modulos: Object.keys(req.user.local.areas).length > 1, area: 'visitante'});
    });

    // ALUNO ========
    app.get('/aluno', isLoggedIn, isAluno, function (req, res) {
        res.render('index', { title: 'Aluno', modulos: Object.keys(req.user.local.areas).length > 1, area: 'aluno' });
    });

    // COMERCIAL ========
    app.get('/comercial', isLoggedIn, isComercial, require('../services/isComercial.js'), function (req, res) {
        res.render('comercial', { title: 'Comercial', modulos: Object.keys(req.user.local.areas).length > 1, area: 'comercial' });
    });

    // SECRETARIA ========
    app.get('/secretaria', isLoggedIn, isSecretaria, require('../services/isSecretaria.js'), function (req, res) {
        res.render('secretaria', { title: 'Secretaria', modulos: Object.keys(req.user.local.areas).length > 1, area: 'secretaria' });
    });

    // FINANCEIRO ========
    app.get('/financeiro', isLoggedIn, isFinanceiro, require('../services/isFinanceiro.js'), function (req, res) {
        res.render('financeiro', { title: 'Financeiro', modulos: Object.keys(req.user.local.areas).length > 1, area: 'financeiro' });
    });

    // App ========
    app.get('/app', isLoggedIn, isComercial, require('../services/isComercial.js'), function (req, res) {
        res.render('comercial', { title: 'Comercial', modulos: Object.keys(req.user.local.areas).length > 1, area: 'comercial' });
    });
    return app;
};