var dadosComercial = require('../mockup/xduka-json/comercial/dados-comercial.json'),
    usuario = require('../mockup/xduka-json/common/user.json');

module.exports = function() {
    var controller = {};

    controller.putDadosIniciais = putDadosIniciais;
    controller.showDadosComercial = getDadosComercial;
    controller.showInfoUsuario = getInfoUsuario;

    return controller;
};

function getDadosComercial(req, res) {
    res.json(dadosComercial);
}

function getInfoUsuario(req, res) {
    res.json({"usuario": usuario});
}

function putDadosIniciais(req, res) {

    for (var elem = 0; elem < req.body.dadosIniciais.listaCheques.length; elem++) {
        req.body.dadosIniciais.listaCheques[elem].data = setDataInt(req.body.dadosIniciais.listaCheques[elem].data);
        console.log(req.body.dadosIniciais.listaCheques[elem]);

    }

    function setDataInt(a) {
        return new Date(a).getTime();
    }

    //res.json(req.body);
    //console.log(req.body);
    res.json({"status": "ok"});
}