var dadosComercial = require('../mockup/xduka-json/comercial/dados-comercial.json'),
    usuario = require('../mockup/xduka-json/common/user.json');

module.exports = function() {
    var controller = {};

    controller.putDadosMatricula = putDadosMatricula;
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

function putDadosMatricula(req, res) {

    for (var elem = 0; elem < req.body.pagamento.listaCheques.length; elem++) {
        req.body.pagamento.listaCheques[elem].data = setDataInt(req.body.pagamento.listaCheques[elem].data);
        console.log(req.body.pagamento.listaCheques[elem]);
    }

    function setDataInt(a) {
        return new Date(a).getTime();
    }

    //res.json(req.body);
    //console.log(req.body);
    res.json(req.body);
}