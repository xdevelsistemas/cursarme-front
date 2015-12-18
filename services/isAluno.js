module.exports = function (req, res, next) {
    if (!!req.user.local.areas.aluno)
        return next();
    res.redirect('/');
};