module.exports = function (req, res, next) {
    if (!!req.user.local.areas.financeiro)
        return next();
    res.redirect('/');
};