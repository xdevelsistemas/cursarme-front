module.exports = function (req, res, next) {
    if (!!req.user.local.areas.secretaria)
        return next();
    res.redirect('/');
};