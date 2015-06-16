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
    controller.putDadosInscricaoCompleta = putDadosInscricaoCompleta;
    controller.putDadosInscricaoParcial = putDadosInscricaoParcial;
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

function putDadosInscricaoParcial(req, res) {
/*  --- Json tela comercial / inscricao ---   */
    var dataSent = req.body;

    if  (validaCamposStep1(dataSent.model) && validaCamposStep2(dataSent.model)) {

        limpaModelErrStep1(dataSent.model);
        limpaModelErrStep2(dataSent.model);
        limpaModelErrStep3(dataSent.model);

        /*  Transformando data por extenso para data numerica dos cheques enviados  */
        alteraDataCheque(dataSent, setDataInt);

        /*  --- Resultado recebido do BackEnd (/#Banco de Dados#/)      */
        /*TODO   Alterar: dataSent.model.(...) para a sintaxe real da conversa com o BackEnd   */

/*-----------------------------------------------------------------------------------------------------------------------*/
/*  ==============  =========   ==========  =========== ============    =============   ============    =========== =====*/

        //Dados a serem passados pro backend
        var result = dadosSentInscr(dataSent.model);

/*-----------------------------------------------------------------------------------------------------------------------*/

        /*  --- retransformando as datas de formato int para a data por extenso---  */
        alteraDataCheque(dataSent.model, setDataExt);


        //TOdo terminar essa parte de extende de dataSent.model e result
        res.json(extend(true, dataSent.model, result));
    }else{
        verificaValidacoesStep1(dataSent);
        verificaValidacoesStep2(dataSent);

        res.json(dataSent.model);
    }
}

function putDadosInscricaoCompleta(req, res) {
    /*  --- Json tela comercial / inscricao ---   */
    var dataSent = req.body;

    if  (validaCamposStep1(dataSent.model) && validaCamposStep2(dataSent.model) && validaCamposStep3(dataSent.model)) {

        limpaModelErrStep1(dataSent.model);
        limpaModelErrStep2(dataSent.model);
        limpaModelErrStep3(dataSent.model);

        /*  Transformando data por extenso para data numerica dos cheques enviados  */
        alteraDataCheque(dataSent, setDataInt);

        /*  --- Resultado recebido do BackEnd (/#Banco de Dados#/)      */
        /*TODO   Alterar: dataSent.model.(...) para a sintaxe real da conversa com o BackEnd   */

        /*-----------------------------------------------------------------------------------------------------------------------*/
        /*  ==============  =========   ==========  =========== ============    =============   ============    =========== =====*/

        //Dados a serem passados pro backend
        var result = dadosSentInscr(dataSent.model);

        /*-----------------------------------------------------------------------------------------------------------------------*/

        /*  --- retransformando as datas de formato int para a data por extenso---  */
        alteraDataCheque(dataSent.model, setDataExt);


        //TOdo terminar essa parte de extende de dataSent.model e result
        res.json(extend(true, dataSent.model, result));
    }else{
        verificaValidacoesStep1(dataSent);
        verificaValidacoesStep2(dataSent);
        verificaValidacoesStep3(dataSent);

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

function alteraDataCheque(obj, func) {
    for (var i = 0; i < obj.listaCheques.length; i++) {
        obj.listaCheques[i].data = func(obj.listaCheques[i].data);
    }
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
    return !!obj.dataExp.model.val && !obj.dataExp.model.err && !!obj.orgaoEmissor.model.val &&
    !!obj.tituloEleitor.model.val && !!obj.zona.model.val && !!obj.secao.model.val &&
    !!obj.ufTitulo.model.val && !!obj.certidaoNc.model.val && !!obj.folha.model.val &&
    !!obj.livro.model.val && !!obj.cartorio.model.val && !!obj.certificadoRes.model.val &&
    !!obj.registro.model.val && !!obj.ufReservista.model.val && !!obj.categoria.model.val &&
    !!obj.sexo.model.val && !!obj.dataNasc.model.val && !obj.dataNasc.model.err &&
    !!obj.raca.model.val && !!obj.estadoCivil.model.val && !!obj.pai.model.val &&
    !!obj.mae.model.val && !!obj.endNum.model.val && !!obj.apt.model.val &&
    !!obj.nacionalidade.model.val && !!obj.naturalidade.model.val && !!obj.natUf.model.val &&
    !!obj.escolaEm.model.val && !!obj.anoEm.model.val && !!obj.cursoGrad.model.val &&
    !!obj.anoGrad.model.val && !!obj.instituicao.model.val
}

function limpaModelErrStep1(obj) {
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

function limpaModelErrStep2(obj) {
    obj.desconto.model.err = "";
    obj.formaPagamentoPag.model.err = "";
    obj.qtdParcelas.model.err = "";
    obj.melhorData.model.err = "";
}

function limpaModelErrStep3(obj) {
    obj.dataExp.model.err = "";
    obj.orgaoEmissor.model.err = "";
    obj.tituloEleitor.model.err = "";
    obj.zona.model.err = "";
    obj.secao.model.err = "";
    obj.ufTitulo.model.err = "";
    obj.certidaoNc.model.err = "";
    obj.folha.model.err = "";
    obj.livro.model.err = "";
    obj.cartorio.model.err = "";
    obj.certificadoRes.model.err = "";
    obj.registro.model.err = "";
    obj.ufReservista.model.err = "";
    obj.categoria.model.err = "";
    obj.sexo.model.err = "";
    obj.dataNasc.model.err = "";
    obj.raca.model.err = "";
    obj.estadoCivil.model.err = "";
    obj.pai.model.err = "";
    obj.mae.model.err = "";
    obj.endNum.model.err = "";
    obj.apt.model.err = "";
    obj.nacionalidade.model.err = "";
    obj.naturalidade.model.err = "";
    obj.natUf.model.err = "";
    obj.escolaEm.model.err = "";
    obj.anoEm.model.err = "";
    obj.cursoGrad.model.err = "";
    obj.anoGrad.model.err = "";
    obj.instituicao.model.err = "";
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
    !obj.model.cpf.model.val || obj.model.cpf.model.err ?
        obj.model.cpf.model.err = obj.STR.NOCPF :
        obj.model.cpf.model.err = "";

    !obj.model.email.model.val || obj.model.email.model.err ?
        obj.model.email.model.err = obj.STR.NOEMAIL :
        obj.model.email.model.err = "";

    !obj.model.rg.model.val || obj.model.rg.model.err ?
        obj.model.rg.model.err = obj.STR.FIELD :
        obj.model.rg.model.err = "";

    !obj.model.nome.model.val || obj.model.nome.model.err ?
        obj.model.nome.model.err = obj.STR.FIELD :
        obj.model.nome.model.err = "";

    !obj.model.cidade.model.val || obj.model.cidade.model.err ?
        obj.model.cidade.model.err = obj.STR.FIELD :
        obj.model.cidade.model.err = "";

    !obj.model.cep.model.val || obj.model.cep.model.err ?
        obj.model.cep.model.err = obj.STR.FIELD :
        obj.model.cep.model.err = "";

    !obj.model.telefone.model.val || obj.model.telefone.model.err ?
        obj.model.telefone.model.err = obj.STR.FIELD :
        obj.model.telefone.model.err = "";

    !obj.model.tipoTelefone.model.val || obj.model.tipoTelefone.model.err ?
        obj.model.tipoTelefone.model.err = obj.STR.FIELD :
        obj.model.tipoTelefone.model.err = "";

    !obj.model.unidade.model.val || obj.model.unidade.model.err ?
        obj.model.unidade.model.err = obj.STR.FIELD :
        obj.model.unidade.model.err = "";

    !obj.model.area.model.val || obj.model.area.model.err ?
        obj.model.area.model.err = obj.STR.FIELD :
        obj.model.area.model.err = "";

    !obj.model.curso.model.val || obj.model.curso.model.err ?
        obj.model.curso.model.err = obj.STR.FIELD :
        obj.model.curso.model.err = "";

    !obj.model.formaPagamentoInscr.model.val || obj.model.formaPagamentoInscr.model.err ?
        obj.model.formaPagamentoInscr.model.err = obj.STR.FIELD :
        obj.model.formaPagamentoInscr.model.err = "";

    !obj.model.descontoInscr.model.val || obj.model.descontoInscr.model.err ?
        obj.model.descontoInscr.model.err = obj.STR.FIELD :
        obj.model.descontoInscr.model.err = "";

    (obj.model.vagas.totais - obj.model.vagas.preenchidas) == 0 ?
        obj.model.curso.model.err = obj.STR.NOVAGAS :
        obj.model.curso.model.err = "";
}

function verificaValidacoesStep2(obj) {
    !obj.model.desconto.model.val || obj.model.desconto.model.err ?
        obj.model.desconto.model.err = obj.STR.NOCPF :
        obj.model.desconto.model.err = "";

    !obj.model.formaPagamentoPag.model.val || obj.model.formaPagamentoPag.model.err ?
        obj.model.formaPagamentoPag.model.err = obj.STR.NOEMAIL :
        obj.model.formaPagamentoPag.model.err = "";

    !obj.model.qtdParcelas.model.val || obj.model.qtdParcelas.model.err ?
        obj.model.qtdParcelas.model.err = obj.STR.NOEMAIL :
        obj.model.qtdParcelas.model.err = "";

    !obj.model.melhorData.model.val || obj.model.melhorData.model.err ?
        obj.model.melhorData.model.err = obj.STR.NOEMAIL :
        obj.model.melhorData.model.err = "";
}

function verificaValidacoesStep3(obj) {
    !obj.model.dataExp.model.val || obj.model.dataExp.model.err ?
        obj.model.dataExp.model.err = obj.STR.NOCPF :
        obj.model.dataExp.model.err = "";

    !obj.model.orgaoEmissor.model.val || obj.model.orgaoEmissor.model.err ?
        obj.model.orgaoEmissor.model.err = obj.STR.NOEMAIL :
        obj.model.orgaoEmissor.model.err = "";

    !obj.model.tituloEleitor.model.val || obj.model.tituloEleitor.model.err ?
        obj.model.tituloEleitor.model.err = obj.STR.NOEMAIL :
        obj.model.tituloEleitor.model.err = "";

    !obj.model.zona.model.val || obj.model.zona.model.err ?
        obj.model.zona.model.err = obj.STR.NOEMAIL :
        obj.model.zona.model.err = "";

    !obj.model.secao.model.val || obj.model.secao.model.err ?
        obj.model.secao.model.err = obj.STR.NOEMAIL :
        obj.model.secao.model.err = "";

    !obj.model.ufTitulo.model.val || obj.model.ufTitulo.model.err ?
        obj.model.ufTitulo.model.err = obj.STR.NOEMAIL :
        obj.model.ufTitulo.model.err = "";

    !obj.model.certidaoNc.model.val || obj.model.certidaoNc.model.err ?
        obj.model.certidaoNc.model.err = obj.STR.NOEMAIL :
        obj.model.certidaoNc.model.err = "";

    !obj.model.folha.model.val || obj.model.folha.model.err ?
        obj.model.folha.model.err = obj.STR.NOEMAIL :
        obj.model.folha.model.err = "";

    !obj.model.livro.model.val || obj.model.livro.model.err ?
        obj.model.livro.model.err = obj.STR.NOEMAIL :
        obj.model.livro.model.err = "";

    !obj.model.cartorio.model.val || obj.model.cartorio.model.err ?
        obj.model.cartorio.model.err = obj.STR.NOEMAIL :
        obj.model.cartorio.model.err = "";

    !obj.model.certificadoRes.model.val || obj.model.certificadoRes.model.err ?
        obj.model.certificadoRes.model.err = obj.STR.NOEMAIL :
        obj.model.certificadoRes.model.err = "";

    !obj.model.registro.model.val || obj.model.registro.model.err ?
        obj.model.registro.model.err = obj.STR.NOEMAIL :
        obj.model.registro.model.err = "";

    !obj.model.ufReservista.model.val || obj.model.ufReservista.model.err ?
        obj.model.ufReservista.model.err = obj.STR.NOEMAIL :
        obj.model.ufReservista.model.err = "";

    !obj.model.categoria.model.val || obj.model.categoria.model.err ?
        obj.model.categoria.model.err = obj.STR.NOEMAIL :
        obj.model.categoria.model.err = "";

    !obj.model.sexo.model.val || obj.model.sexo.model.err ?
        obj.model.sexo.model.err = obj.STR.NOEMAIL :
        obj.model.sexo.model.err = "";

    !obj.model.dataNasc.model.val || obj.model.dataNasc.model.err ?
        obj.model.dataNasc.model.err = obj.STR.NOEMAIL :
        obj.model.dataNasc.model.err = "";

    !obj.model.raca.model.val || obj.model.raca.model.err ?
        obj.model.raca.model.err = obj.STR.NOEMAIL :
        obj.model.raca.model.err = "";

    !obj.model.estadoCivil.model.val || obj.model.estadoCivil.model.err ?
        obj.model.estadoCivil.model.err = obj.STR.NOEMAIL :
        obj.model.estadoCivil.model.err = "";

    !obj.model.pai.model.val || obj.model.pai.model.err ?
        obj.model.pai.model.err = obj.STR.NOEMAIL :
        obj.model.pai.model.err = "";

    !obj.model.mae.model.val || obj.model.mae.model.err ?
        obj.model.mae.model.err = obj.STR.NOEMAIL :
        obj.model.mae.model.err = "";

    !obj.model.endNum.model.val || obj.model.endNum.model.err ?
        obj.model.endNum.model.err = obj.STR.NOEMAIL :
        obj.model.endNum.model.err = "";

    !obj.model.apt.model.val || obj.model.apt.model.err ?
        obj.model.apt.model.err = obj.STR.NOEMAIL :
        obj.model.apt.model.err = "";

    !obj.model.nacionalidade.model.val || obj.model.nacionalidade.model.err ?
        obj.model.nacionalidade.model.err = obj.STR.NOEMAIL :
        obj.model.nacionalidade.model.err = "";

    !obj.model.naturalidade.model.val || obj.model.naturalidade.model.err ?
        obj.model.naturalidade.model.err = obj.STR.NOEMAIL :
        obj.model.naturalidade.model.err = "";

    !obj.model.natUf.model.val || obj.model.natUf.model.err ?
        obj.model.natUf.model.err = obj.STR.NOEMAIL :
        obj.model.natUf.model.err = "";

    !obj.model.escolaEm.model.val || obj.model.escolaEm.model.err ?
        obj.model.escolaEm.model.err = obj.STR.NOEMAIL :
        obj.model.escolaEm.model.err = "";

    !obj.model.anoEm.model.val || obj.model.anoEm.model.err ?
        obj.model.anoEm.model.err = obj.STR.NOEMAIL :
        obj.model.anoEm.model.err = "";

    !obj.model.cursoGrad.model.val || obj.model.cursoGrad.model.err ?
        obj.model.cursoGrad.model.err = obj.STR.NOEMAIL :
        obj.model.cursoGrad.model.err = "";

    !obj.model.anoGrad.model.val || obj.model.anoGrad.model.err ?
        obj.model.anoGrad.model.err = obj.STR.NOEMAIL :
        obj.model.anoGrad.model.err = "";

    !obj.model.instituicao.model.val || obj.model.instituicao.model.err ?
        obj.model.instituicao.model.err = obj.STR.NOEMAIL :
        obj.model.instituicao.model.err = "";
}