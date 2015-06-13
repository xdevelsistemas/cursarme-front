var isLoggedIn = require('../services/isLoggedIn.js');
var isNotLoggedIn = require('../services/isNotLoggedIn.js');
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

    return app;
};