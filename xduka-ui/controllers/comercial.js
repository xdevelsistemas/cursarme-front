var extend = require('node.extend'),
    dadosComercial = require('../mockup/xduka-json/comercial/dados-comercial.json'),
    viewInscr = require('../mockup/xduka-json/comercial/viewInscr.json'),
    usuario = require('../mockup/xduka-json/common/user.json');

module.exports = function() {
    var controller = {};

    controller.showDadosComercial = getDadosComercial;
    controller.showInfoUsuario = getInfoUsuario;
    controller.showViewInscr = getViewInscr;
    controller.putDadosInscricao = putDadosInscricao;

    return controller;
};

function getDadosComercial(req, res) {
    res.json(dadosComercial);
}

function getInfoUsuario(req, res) {
    res.json({"usuario": usuario});
}

function getViewInscr(req, res) {
    res.json(viewInscr);
}

function putDadosInscricao(req, res) {
/*  --- Json tela comercial / matricula ---   */
    var dataSent = req.body;

    if ((!dataSent.email.model.err && !!dataSent.email.model.val) && ((dataSent.vagas.totais - dataSent.vagas.preenchidas) > 0)) {

        /*  Transformando data por extenso para data numerica dos cheques enviados  */

        for (var elem = 0; elem < dataSent.listaCheques.length; elem++) {
            dataSent.listaCheques[elem].data = setDataInt(dataSent.listaCheques[elem].data);
        }

        /*  --- Resultado recebido do BackEnd (/#Banco de Dados#/)      */
        /*   Alterar: dataSent.(...) para a sintaxe real da conversa com o BackEnd   */
        var result = {
            "curso": {
                "area": {"model": {"val": dataSent.area.model.val, "err": ""}},
                "curso": {"model": {"val": dataSent.curso.model.val, "err": ""}},
                "unidade": {"model": {"val": dataSent.unidade.model.val, "err": ""}}
            },
            "aluno": {
                "cep": {"model": {"val": dataSent.cep.model.val, "err": ""}},
                "cidade": {"model": {"val": dataSent.cidade.model.val, "err": ""}},
                "cpf": {"model": {"val": dataSent.cpf.model.val, "err": ""}},
                "email": {"model": {"val": dataSent.email.model.val, "err": ""}},
                "nome": {"model": {"val": dataSent.nome.model.val, "err": ""}},
                "rg": {"model": {"val": dataSent.rg.model.val, "err": ""}},
                "telefone": {"model": {"val": dataSent.telefone.model.val, "err": ""}},
                "tipoTelefone": {"model": {"val": dataSent.tipoTelefone.model.val, "err": ""}}
            },
            "inscr": {
                "formaPagamentoInscr": {"model": {"val": dataSent.formaPagamentoInscr.model.val, "err": ""}},
                "valorInscricao": {"model": {"val": dataSent.valorInscricao.model.val, "err": ""}}
            }
        };



        /*  Como curso está implementado em niveis  */
        /*  Esta parte sera responsavel por gerar os itens selecionados  */
        /*extend(dataSent.unidade.list[dataSent.unidade.select.unidade].area.model, result.area.model);
        extend(dataSent.unidade.list[dataSent.unidade.select.unidade].area.list[dataSent.unidade.select.area].curso.model, result.curso.model);*/


        /*  --- retransformando as datas de formato int para a data por extenso---  */
        for (var elem = 0; elem < dataSent.listaCheques.length; elem++) {
            dataSent.listaCheques[elem].data = setDataExt(dataSent.listaCheques[elem].data);
        }


        //TOdo terminar essa parte de extende de dataSent e result
        res.json(extend(true, dataSent, result));
    }else{
        if (!dataSent.email.model.val || dataSent.email.model.err) {
            dataSent.email.model.err = "Email inválido";
        }
        if ((dataSent.vagas.totais - dataSent.vagas.preenchidas) == 0) {
            dataSent.curso.model.err = "Não há mais vagas neste curso, escolha outro!";
        }else{
            dataSent.curso.model.err = "";
        }
        res.json(dataSent);
    }
}

function setDataExt(a) {
    return new Date(a);
}

function setDataInt(a) {
    return new Date(a).getTime();
}