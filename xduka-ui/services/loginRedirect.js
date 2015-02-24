module.exports = function (req, res, next) {
    if (!!req.user.local.areas.aluno)
        res.redirect('/aluno');
    if (!!req.user.local.areas.comercial)
        res.redirect('/comercial');
    return next();
};