var extend = require('node.extend'),
    dadosComercial = require('../mockup/xduka-json/comercial/dados-comercial.json'),
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

    var dataSend = req.body;
    var result = {
        "curso": {
            "area": {"model": {"val": dataSend.curso.area.model.val, "err": ""}},
            "curso": {"model": {"val": dataSend.curso.curso.model.val, "err": ""}},
            "unidade": {"model": {"val": dataSend.curso.unidade.model.val, "err": ""}}
        },
        "aluno": {
            "cep": {"model": {"val": dataSend.aluno.cep.model.val, "err": ""}},
            "cidade": {"model": {"val": dataSend.aluno.cidade.model.val, "err": ""}},
            "cpf": {"model": {"val": dataSend.aluno.cpf.model.val, "err": ""}},
            "email": {"model": {"val": dataSend.aluno.email.model.val, "err": "Email inválido"}},
            "nome": {"model": {"val": dataSend.aluno.nome.model.val, "err": "Nome Incompleto"}},
            "rg": {"model": {"val": dataSend.aluno.rg.model.val, "err": ""}},
            "telefone": {"model": {"val": dataSend.aluno.telefone.model.val, "err": ""}},
            "tipoTelefone": {"model": {"val": dataSend.aluno.tipoTelefone.model.val, "err": ""}}
        },
        "inscr": {
            "desconto": {"model": {"val": dataSend.inscr.desconto.model.val, "err": ""}},
            "formaPagamento": {"model": {"val": dataSend.inscr.formaPagamento.model.val, "err": ""}},
            "melhorData": {"model": {"val": dataSend.inscr.melhorData.model.val, "err": ""}},
            "qtdParcelas": {"model": {"val": dataSend.inscr.qtdParcelas.model.val, "err": ""}},
            "valorInscricao": {"model": {"val": dataSend.inscr.valorInscricao.model.val, "err": ""}}
        }
    };

    for (var elem = 0; elem < req.body.pagamento.listaCheques.length; elem++) {
        req.body.pagamento.listaCheques[elem].data = setDataInt(req.body.pagamento.listaCheques[elem].data);
        console.log(req.body.pagamento.listaCheques[elem]);
    }

    //res.json(req.body);
    //console.log(result);

    //var resultConcat = extend(true, dataSend, result);

    res.json(extend(true, dataSend, result));

    function setDataInt(a) {
        return new Date(a).getTime();
    }
}