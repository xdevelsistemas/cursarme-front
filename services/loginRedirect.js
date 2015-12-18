module.exports = function (req, res, next) {

    var cont = 0;
    for (var i in req.user._doc.local.areas){
        if(req.user._doc.local.areas[i]){
            cont++
        }
    }
    cont>1?res.redirect('/modulos'):0;

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