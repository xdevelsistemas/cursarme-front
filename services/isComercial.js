module.exports = function (req, res, next) {
    if (!!req.user.local.areas.comercial)
        return next();
    res.redirect('/');
};