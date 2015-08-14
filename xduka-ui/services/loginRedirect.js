module.exports = function (req, res, next) {
    if (!!req.user.local.areas.aluno)
        res.redirect('/aluno');
    if (!!req.user.local.areas.comercial)
        res.redirect('/comercial');
    if (!!req.user.local.areas.secretaria)
        res.redirect('/secretaria');
    if (!!req.user.local.areas.financeiro)
        res.redirect('/financeiro');
    return next();
};