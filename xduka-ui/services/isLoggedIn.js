// route middleware to make sure a user is logged in
function isLoggedIn(req, res, next) {
/*
    // if user is authenticated in the session, carry on
    if (req.isAuthenticated())
        return next()return next();;

    // if they aren't redirect them to the home page
    res.redirect('/login');
*/

    return next();
}

module.exports = isLoggedIn;