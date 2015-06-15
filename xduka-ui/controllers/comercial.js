var extend = require('node.extend'),
    templateInscr = require('../mockup/xduka-json/common/templateInscricao.json'),
    dadosCurso = require('../mockup/xduka-json/common/dadosCursos.json'),
    dadosTesteCpf = require('../mockup/xduka-json/comercial/dadosTestesCpf.json'),
    modalCheque = require('../mockup/xduka-json/comercial/modalCheque.json'),
    usuario = require('../mockup/xduka-json/common/user.json'),
    viewInscr = require('../mockup/xduka-json/common/viewInscr.json');

module.exports = function() {
    var controller = {};

    controller.showDadosInscricao = getDadosInscricao;
    controller.showDadosCurso = getDadosCurso;
    controller.showInfoUsuario = getInfoUsuario;
    controller.showModalCheque = getModalCheque;
    controller.putVerificaCpf = putVerificaCpf;
    controller.showViewInscr = getViewInscr;
    controller.putDadosInscricao = putDadosInscricao;
    controller.putEditInscricao = putEditInscricao;

    return controller;
};

function getDadosInscricao(req, res) {
    res.json(templateInscr);
}

function getInfoUsuario(req, res) {
    res.json({"usuario": usuario});
}

function getModalCheque(req, res) {
    res.json(modalCheque);
}

function putVerificaCpf(req, res) {
    //var dados = verificaCpf(dadosTesteCpf.verificaCpf, req.body.cpf);
    var dados = {};

    if (parseInt(req.body.cpf) %2 == 0) {
        dados.cpf = req.body.cpf;
        dados.msg = "";
        res.json({"dados": dados, "dadosCurso": dadosCurso});
    }else{
        dados.cpf = req.body.cpf;
        dados.msg = "Pessoa com pendências no financeiro";
        res.json({"dados": dados, "dadosCurso": {"unidade": {"list": []}}});
    }
}

function verificaCpf(obj, cpf) {

    //TODO implementar cálculo de valores para informações de pagamento no json dados-cursos

    for (var i = 0; i < obj.length; i++) {
        if (obj[i].cpf == cpf) {
            return obj[i];
        }
    }
}

function getDadosCurso(req, res) {
    res.json(dadosCurso);
}

function getViewInscr(req, res) {

    for (var i = 0; i < viewInscr.list.length; i++) {
        for (var j = 0; j < viewInscr.list[i].listaCheques.length; j++) {
            viewInscr.list[i].listaCheques[j].data = setDataExt(viewInscr.list[i].listaCheques[j].data);
        }
    }

    res.json(viewInscr);
}

function putDadosInscricao(req, res) {
/*  --- Json tela comercial / matricula ---   */
    var dataSent = req.body;

    if  (validaCamposStep1(dataSent.model)) {

        limpModelErr(dataSent.model);

        /*  Transformando data por extenso para data numerica dos cheques enviados  */
        for (var i = 0; i < dataSent.model.listaCheques.length; i++) {
            dataSent.model.listaCheques[i].data = setDataInt(dataSent.model.listaCheques[i].data);
        }

        /*  --- Resultado recebido do BackEnd (/#Banco de Dados#/)      */
        /*TODO   Alterar: dataSent.model.(...) para a sintaxe real da conversa com o BackEnd   */

/*-----------------------------------------------------------------------------------------------------------------------*/
/*  ==============  =========   ==========  =========== ============    =============   ============    =========== =====*/

        //Dados a serem passados pro backend
        var result = dadosSentInscr(dataSent.model);

/*-----------------------------------------------------------------------------------------------------------------------*/

        /*  --- retransformando as datas de formato int para a data por extenso---  */
        for (var j = 0; j < dataSent.model.listaCheques.length; j++) {
            dataSent.model.listaCheques[j].data = setDataExt(dataSent.model.listaCheques[j].data);
        }


        //TOdo terminar essa parte de extende de dataSent.model e result
        res.json(extend(true, dataSent.model, result));
    }else{
        verificaValidacoesStep1(dataSent);

        res.json(dataSent.model);
    }
}

function putEditInscricao(req, res) {
    res.json(req.body)
}

function setDataExt(a) {
    return new Date(a);
}

function setDataInt(a) {
    return new Date(a).getTime();
}

function validaCamposStep1(obj) {
    return !!obj.cpf.model.val && !obj.cpf.model.err && !!obj.rg.model.val && !!obj.nome.model.val &&
    !!obj.cidade.model.val && !!obj.cep.model.val && !!obj.telefone.model.val &&
    !!obj.tipoTelefone.model.val && !!obj.email.model.val && !obj.email.model.err &&
    !!obj.unidade.model.val && !!obj.area.model.val && !!obj.curso.model.val &&
    !!obj.formaPagamentoInscr.model.val && !!obj.descontoInscr.model.val &&
    ((obj.vagas.totais - obj.vagas.preenchidas) > 0);
}

function validaCamposStep2(obj) {
    return !!obj.desconto.model.val && !!obj.formaPagamentoPag.model.val &&
    !!obj.qtdParcelas.model.val && !!obj.melhorData.model.val;
}

function validaCamposStep3(obj) {
    return !!obj.desconto.model.val && !!obj.formaPagamentoPag.model.val &&
    !!obj.qtdParcelas.model.val && !!obj.melhorData.model.val;
}

function limpModelErr(obj) {
    obj.cpf.model.err = "";
    obj.cpf.model.err = "";
    obj.rg.model.err = "";
    obj.nome.model.err = "";
    obj.cidade.model.err = "";
    obj.cep.model.err = "";
    obj.telefone.model.err = "";
    obj.tipoTelefone.model.err = "";
    obj.email.model.err = "";
    obj.email.model.err = "";
    obj.unidade.model.err = "";
    obj.area.model.err = "";
    obj.curso.model.err = "";
    obj.formaPagamentoInscr.model.err = "";
    obj.descontoInscr.model.err = "";
}

function dadosSentInscr(obj) {
    return {
        "nome":{"model":{"val":obj.nome.model.val}},
        "endereco":{"model":{"val":obj.endereco.model.val}},
        "tipoTelefone":{"model":{"val":obj.tipoTelefone.model.val}},
        "telefone":{"model":{"val":obj.telefone.model.val}},
        "email":{"model":{"val":obj.email.model.val}},
        "cidade":{"model":{"val":obj.cidade.model.val}},
        "cep":{"model":{"val":obj.cep.model.val}},
        "rg":{"model":{"val":obj.rg.model.val}},
        "dataExp":{"model":{"val":obj.dataExp.model.val}},
        "orgaoEmissor":{"model":{"val":obj.orgaoEmissor.model.val}},
        "cpf":{"model":{"val":obj.cpf.model.val}},
        "tituloEleitor":{"model":{"val":obj.tituloEleitor.model.val}},
        "zona":{"model":{"val":obj.zona.model.val}},
        "secao":{"model":{"val":obj.secao.model.val}},
        "ufTitulo":{"model":{"val":obj.ufTitulo.model.val}},
        "certidaoNc":{"model":{"val":obj.certidaoNc.model.val}},
        "folha":{"model":{"val":obj.folha.model.val}},
        "livro":{"model":{"val":obj.livro.model.val}},
        "cartorio":{"model":{"val":obj.cartorio.model.val}},
        "certificadoRes":{"model":{"val":obj.certificadoRes.model.val}},
        "registro":{"model":{"val":obj.registro.model.val}},
        "ufReservista":{"model":{"val":obj.ufReservista.model.val}},
        "categoria":{"model":{"val":obj.categoria.model.val}},
        "sexo":{"model":{"val":obj.sexo.model.val}},
        "dataNasc":{"model":{"val":obj.dataNasc.model.val}},
        "raca":{"model":{"val":obj.raca.model.val}},
        "estadoCivil":{"model":{"val":obj.estadoCivil.model.val}},
        "pai":{"model":{"val":obj.pai.model.val}},
        "mae":{"model":{"val":obj.mae.model.val}},
        "avRua":{"model":{"val":obj.avRua.model.val}},
        "endNum":{"model":{"val":obj.endNum.model.val}},
        "apt":{"model":{"val":obj.apt.model.val}},
        "bairro":{"model":{"val":obj.bairro.model.val}},
        "endUf":{"model":{"val":obj.endUf.model.val}},
        "nacionalidade":{"model":{"val":obj.nacionalidade.model.val}},
        "naturalidade":{"model":{"val":obj.naturalidade.model.val}},
        "natUf":{"model":{"val":obj.natUf.model.val}},
        "unidade":{"model":{"val":obj.unidade.model.val}},
        "area":{"model":{"val":obj.area.model.val}},
        "curso":{"model":{"val":obj.curso.model.val}},
        "vagas":{"preenchidas":obj.vagas.preenchidas,"totais":obj.vagas.totais},
        "escolaEm":{"model":{"val":obj.escolaEm.model.val}},
        "anoEm":{"model":{"val":obj.anoEm.model.val}},
        "cursoGrad":{"model":{"val":obj.cursoGrad.model.val}},
        "anoGrad":{"model":{"val":obj.anoGrad.model.val}},
        "instituicao":{"model":{"val":obj.instituicao.model.val}},
        "valorInscricao":{"model":{"val":obj.valorInscricao.model.val}},
        "formaPagamentoInscr":{"model":{"val":obj.formaPagamentoInscr.model.val}},
        "valorIntegral":{"model":{"val":obj.valorIntegral.model.val}},
        "desconto":{"model":{"val":obj.desconto.model.val}},
        "formaPagamentoPag":{"model":{"val":obj.formaPagamentoPag.model.val}},
        "qtdParcelas":{"model":{"val":obj.qtdParcelas.model.val}},
        "valorParcela":{"model":{"val":obj.valorParcela.model.val}},
        "melhorData":{"model":{"val":obj.melhorData.model.val}},
        "observacoes":{"model":{"val":obj.observacoes.model.val}},
        "listaCheques":obj.listaCheques
    }
}

function verificaValidacoesStep1(obj) {
    if (!obj.model.cpf.model.val || obj.model.cpf.model.err) {
        obj.model.cpf.model.err = obj.STR.NOCPF;
    }else{
        obj.model.cpf.model.err = "";
    }

    if (!obj.model.email.model.val || obj.model.email.model.err) {
        obj.model.email.model.err = obj.STR.NOEMAIL;
    }else{
        obj.model.email.model.err = "";
    }

    if (!obj.model.rg.model.val || obj.model.rg.model.err) {
        obj.model.rg.model.err = obj.STR.FIELD;
    }else{
        obj.model.rg.model.err = "";
    }

    if (!obj.model.nome.model.val || obj.model.nome.model.err) {
        obj.model.nome.model.err = obj.STR.FIELD;
    }else{
        obj.model.nome.model.err = "";
    }

    if (!obj.model.cidade.model.val || obj.model.cidade.model.err) {
        obj.model.cidade.model.err = obj.STR.FIELD;
    }else{
        obj.model.cidade.model.err = "";
    }

    if (!obj.model.cep.model.val || obj.model.cep.model.err) {
        obj.model.cep.model.err = obj.STR.FIELD;
    }else{
        obj.model.cep.model.err = "";
    }

    if (!obj.model.telefone.model.val || obj.model.telefone.model.err) {
        obj.model.telefone.model.err = obj.STR.FIELD;
    }else{
        obj.model.telefone.model.err = "";
    }

    if (!obj.model.tipoTelefone.model.val || obj.model.tipoTelefone.model.err) {
        obj.model.tipoTelefone.model.err = obj.STR.FIELD;
    }else{
        obj.model.tipoTelefone.model.err = "";
    }

    if (!obj.model.unidade.model.val || obj.model.unidade.model.err) {
        obj.model.unidade.model.err = obj.STR.FIELD;
    }else{
        obj.model.unidade.model.err = "";
    }

    if (!obj.model.area.model.val || obj.model.area.model.err) {
        obj.model.area.model.err = obj.STR.FIELD;
    }else{
        obj.model.area.model.err = "";
    }

    if (!obj.model.curso.model.val || obj.model.curso.model.err) {
        obj.model.curso.model.err = obj.STR.FIELD;
    }else{
        obj.model.curso.model.err = "";
    }

    if (!obj.model.formaPagamentoInscr.model.val || obj.model.formaPagamentoInscr.model.err) {
        obj.model.formaPagamentoInscr.model.err = obj.STR.FIELD;
    }else{
        obj.model.formaPagamentoInscr.model.err = "";
    }

    if (!obj.model.descontoInscr.model.val || obj.model.descontoInscr.model.err) {
        obj.model.descontoInscr.model.err = obj.STR.FIELD;
    }else{
        obj.model.descontoInscr.model.err = "";
    }

    if ((obj.model.vagas.totais - obj.model.vagas.preenchidas) == 0) {
        obj.model.curso.model.err = obj.STR.NOVAGAS;
    }else{
        obj.model.curso.model.err = "";
    }
}