var extend = require('node.extend'),
    dadosComercial = require('../mockup/xduka-json/comercial/dados-comercial.json'),
    viewInscr = require('../mockup/xduka-json/comercial/viewInscr.json'),
    usuario = require('../mockup/xduka-json/common/user.json');

module.exports = function() {
    var controller = {};

    controller.putDadosMatricula = putDadosMatricula;
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
    console.log(dataSent.curso.vagas.getDisponiveis);

    if ((!dataSent.aluno.email.model.err && !!dataSent.aluno.email.model.val) && ((dataSent.curso.vagas.totais - dataSent.curso.vagas.preenchidas) > 0)) {
    //if ((!dataSent.aluno.email.model.err && !!dataSent.aluno.email.model.val) && ((dataSent.curso.vagas.getDisponiveis()) > 0)) {
        /*  Transformando data por extenso para data numerica dos cheques enviados (se existirem é claro!!!)  */

        for (var elem = 0; elem < dataSent.pagamento.listaCheques.length; elem++) {
            dataSent.pagamento.listaCheques[elem].data = setDataInt(dataSent.pagamento.listaCheques[elem].data);
            //console.log(dataSent.pagamento.listaCheques[elem]);
        }

        /*  --- Resultado recebido do BackEnd (/#Banco de Dados#/)      */
        /*   Alterar: dataSent.(...) para a sintaxe real da conversa com o BackEnd   */
        var result = {
            "curso": {
                "area": {"model": {"val": dataSent.curso.area.model.val, "err": ""}},
                "curso": {"model": {"val": dataSent.curso.curso.model.val, "err": ""}},
                "unidade": {"model": {"val": dataSent.curso.unidade.model.val, "err": ""}}
            },
            "aluno": {
                "cep": {"model": {"val": dataSent.aluno.cep.model.val, "err": ""}},
                "cidade": {"model": {"val": dataSent.aluno.cidade.model.val, "err": ""}},
                "cpf": {"model": {"val": dataSent.aluno.cpf.model.val, "err": ""}},
                "email": {"model": {"val": dataSent.aluno.email.model.val, "err": ""}},
                "nome": {"model": {"val": dataSent.aluno.nome.model.val, "err": "Nome invalido"}},
                "rg": {"model": {"val": dataSent.aluno.rg.model.val, "err": ""}},
                "telefone": {"model": {"val": dataSent.aluno.telefone.model.val, "err": ""}},
                "tipoTelefone": {"model": {"val": dataSent.aluno.tipoTelefone.model.val, "err": ""}}
            },
            "inscr": {
                "desconto": {"model": {"val": dataSent.inscr.desconto.model.val, "err": ""}},
                "formaPagamento": {"model": {"val": dataSent.inscr.formaPagamento.model.val, "err": ""}},
                "melhorData": {"model": {"val": dataSent.inscr.melhorData.model.val, "err": ""}},
                "qtdParcelas": {"model": {"val": dataSent.inscr.qtdParcelas.model.val, "err": ""}},
                "valorInscricao": {"model": {"val": dataSent.inscr.valorInscricao.model.val, "err": ""}}
            }
        };

        /*  Como curso está implementado em niveis  */
        /*  Esta parte sera responsavel por gerar os itens selecionados  */
        /*extend(dataSent.curso.unidade.list[dataSent.curso.unidade.select.unidade].area.model, result.area.model);
        extend(dataSent.curso.unidade.list[dataSent.curso.unidade.select.unidade].area.list[dataSent.curso.unidade.select.area].curso.model, result.curso.model);*/


        /*  --- retransformando as datas de formato int para a data por extenso---  */
        for (var elem = 0; elem < dataSent.pagamento.listaCheques.length; elem++) {
            dataSent.pagamento.listaCheques[elem].data = setDataExt(dataSent.pagamento.listaCheques[elem].data);
        }


        //TOdo terminar essa parte de extende de dataSent e result
        res.json(extend(true, dataSent, result));
    }else{
        if (!dataSent.aluno.email.model.val || dataSent.aluno.email.model.err) {
            dataSent.aluno.email.model.err = "Email inválido";
        }
        if ((dataSent.curso.vagas.totais - dataSent.curso.vagas.preenchidas) == 0) {
        //if ((dataSent.curso.vagas.getDisponiveis()) == 0) {
                dataSent.curso.curso.model.err = "Não há mais vagas neste curso, escolha outro!";
        }else{
            dataSent.curso.curso.model.err = "";
        }
        res.json(dataSent);
    }
}

function putDadosMatricula(req, res) {
    res.json({status: "ok!"})
}

function setDataExt(a) {
    return new Date(a);
}

function setDataInt(a) {
    return new Date(a).getTime();
}