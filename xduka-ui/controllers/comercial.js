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
    var dataSend = req.body;
    console.log(dataSend.curso.vagas.getDisponiveis);

    if ((!dataSend.aluno.email.model.err && !!dataSend.aluno.email.model.val) && ((dataSend.curso.vagas.totais - dataSend.curso.vagas.preenchidas) > 0)) {
    //if ((!dataSend.aluno.email.model.err && !!dataSend.aluno.email.model.val) && ((dataSend.curso.vagas.getDisponiveis()) > 0)) {
        /*  Transformando data por extenso para data numerica dos cheques enviados (se existirem é claro!!!)  */

        for (var elem = 0; elem < dataSend.pagamento.listaCheques.length; elem++) {
            dataSend.pagamento.listaCheques[elem].data = setDataInt(dataSend.pagamento.listaCheques[elem].data);
            //console.log(dataSend.pagamento.listaCheques[elem]);
        }

        /*  --- Resultado recebido do BackEnd (/#Banco de Dados#/)      */
        /*   Alterar: dataSend.(...) para a sintaxe real da conversa com o BackEnd   */
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
                "email": {"model": {"val": dataSend.aluno.email.model.val, "err": ""}},
                "nome": {"model": {"val": dataSend.aluno.nome.model.val, "err": "Nome invalido"}},
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

        /*  Como curso está implementado em niveis  */
        /*  Esta parte sera responsavel por gerar os itens selecionados  */
        /*extend(dataSend.curso.unidade.list[dataSend.curso.unidade.select.unidade].area.model, result.area.model);
        extend(dataSend.curso.unidade.list[dataSend.curso.unidade.select.unidade].area.list[dataSend.curso.unidade.select.area].curso.model, result.curso.model);*/


        /*  --- retransformando as datas de formato int para a data por extenso---  */
        for (var elem = 0; elem < dataSend.pagamento.listaCheques.length; elem++) {
            dataSend.pagamento.listaCheques[elem].data = setDataExt(dataSend.pagamento.listaCheques[elem].data);
        }


        //TOdo terminar essa parte de extende de dataSend e result
        res.json(extend(true, dataSend, result));
    }else{
        if (!dataSend.aluno.email.model.val || dataSend.aluno.email.model.err) {
            dataSend.aluno.email.model.err = "Email inválido";
        }
        if ((dataSend.curso.vagas.totais - dataSend.curso.vagas.preenchidas) == 0) {
        //if ((dataSend.curso.vagas.getDisponiveis()) == 0) {
                dataSend.curso.curso.model.err = "Não há mais vagas neste curso, escolha outro!";
        }else{
            dataSend.curso.curso.model.err = "";
        }
        res.json(dataSend);
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