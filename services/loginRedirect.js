module.exports = function (req, res, next) {

    var cont = 0;
    for (var i in req.user._doc.local.areas){
        if(req.user._doc.local.areas[i]){
            cont++
        }
    }

    if(cont>1){
        return res.redirect('/modulos');
    }else {
        if (!!req.user.local.areas.aluno)
            return res.redirect('/aluno');
        if (!!req.user.local.areas.comercial)
            return res.redirect('/comercial');
        if (!!req.user.local.areas.secretaria)
            return res.redirect('/secretaria');
        if (!!req.user.local.areas.financeiro)
            return res.redirect('/financeiro');
        return next();
    }
};