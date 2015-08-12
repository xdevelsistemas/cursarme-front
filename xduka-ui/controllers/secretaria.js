var extend = require('node.extend'),
    dadosCurso = require('../mockup/xduka-json/common/dadosCursos.json'),
    dadosGeraTurma = require('../mockup/xduka-json/secretaria/dadosGeraTurma.json'),
    templateInscr = require('../mockup/xduka-json/common/templateInscricao.json'),
    usuario = require('../mockup/xduka-json/common/user.json'),
    viewInscr = require('../mockup/xduka-json/common/viewInscr.json');
    alunos = require('../mockup/xduka-json/secretaria/alunos.json');
    templateConfig = require('../mockup/xduka-json/secretaria/templateConfig.json');

module.exports = function() {
    var controller = {};

    controller.showDadosCurso = getDadosCurso;
    controller.showDadosGeraTurma = getDadosGeraTurma;
    controller.showInfoUsuario = getInfoUsuario;
    controller.showViewInscr = getViewInscr;
    controller.showTemplateInscricao = getTemplateInscricao;
    controller.putDadosInscricao = putDadosInscricao;
    controller.putDadosTurmas = putDadosTurmas;
    controller.putSaveConfig = putSaveConfig;
    controller.alunoSearch = alunoSearch;
    controller.showConfig = showConfig;

    return controller;
};

function showConfig(req,res){
    res.json(templateConfig)
}

function alunoSearch(req, res){
    var result = {};

    result.result = alunos.list.filter(
        function (value) {
            return value.matricula.model.val.substring(0,req.params.nomeMat.length).toLocaleLowerCase() == req.params.nomeMat.toLowerCase()
        }
    );
    if (result.result.length == 0){
        result.result = alunos.list.filter(
            function (value) {
                return removerAcentos(value.nome.model.val.substring(0,req.params.nomeMat.length)).toLocaleLowerCase() == removerAcentos(req.params.nomeMat).toLowerCase()
            }
        );
    }
    if (result.result.length == 0){
        result.err = "Nenhum resultado encontrado!"
    }

    function removerAcentos(str){

        str = str.replace(/[ÀÁÂÃÄÅ]/,"A");
        str = str.replace(/[àáâãäå]/,"a");
        str = str.replace(/[ÈÉÊË]/,"E");
        str = str.replace(/[Ç]/,"C");
        str = str.replace(/[ç]/,"c");

        return str.replace(/[^a-z0-9]/gi,'');
    }

    res.json(result)

}

function getDadosGeraTurma(req, res) {
    res.json(dadosGeraTurma);
}

function getDadosCurso(req, res) {
    res.json(dadosCurso);
}

function getTemplateInscricao(req, res) {
    res.json(templateInscr);
}

function getInfoUsuario(req, res) {
    res.json({"usuario": usuario});
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

    if  (!dataSent.email.model.err && !!dataSent.email.model.val && (dataSent.vagas.totais - dataSent.vagas.preenchidas) > 0) {

        /*  Transformando data por extenso para data numerica dos cheques enviados  */
        for (var i = 0; i < dataSent.listaCheques.length; i++) {
            dataSent.listaCheques[i].data = setDataInt(dataSent.listaCheques[i].data);
        }

        /*  --- Resultado recebido do BackEnd (/#Banco de Dados#/)      */
        /*TODO   Alterar: dataSent.(...) para a sintaxe real da conversa com o BackEnd   */

/*-----------------------------------------------------------------------------------------------------------------------*/
/*  ==============  =========   ==========  =========== ============    =============   ============    =========== =====*/

        //Dados a serem passados pro backend
        var result = {
            "nome":{"model":{"val":dataSent.nome.model.val}},
            "endereco":{"model":{"val":dataSent.endereco.model.val}},
            "tipoTelefone":{"model":{"val":dataSent.tipoTelefone.model.val}},
            "telefone":{"model":{"val":dataSent.telefone.model.val}},
            "email":{"model":{"val":dataSent.email.model.val}},
            "cidade":{"model":{"val":dataSent.cidade.model.val}},
            "cep":{"model":{"val":dataSent.cep.model.val}},
            "rg":{"model":{"val":dataSent.rg.model.val}},
            "dataExp":{"model":{"val":dataSent.dataExp.model.val}},
            "orgaoEmissor":{"model":{"val":dataSent.orgaoEmissor.model.val}},
            "cpf":{"model":{"val":dataSent.cpf.model.val}},
            "tituloEleitor":{"model":{"val":dataSent.tituloEleitor.model.val}},
            "zona":{"model":{"val":dataSent.zona.model.val}},
            "secao":{"model":{"val":dataSent.secao.model.val}},
            "ufTitulo":{"model":{"val":dataSent.ufTitulo.model.val}},
            "certidaoNc":{"model":{"val":dataSent.certidaoNc.model.val}},
            "folha":{"model":{"val":dataSent.folha.model.val}},
            "livro":{"model":{"val":dataSent.livro.model.val}},
            "cartorio":{"model":{"val":dataSent.cartorio.model.val}},
            "certificadoRes":{"model":{"val":dataSent.certificadoRes.model.val}},
            "registro":{"model":{"val":dataSent.registro.model.val}},
            "ufReservista":{"model":{"val":dataSent.ufReservista.model.val}},
            "categoria":{"model":{"val":dataSent.categoria.model.val}},
            "sexo":{"model":{"val":dataSent.sexo.model.val}},
            "dataNasc":{"model":{"val":dataSent.dataNasc.model.val}},
            "raca":{"model":{"val":dataSent.raca.model.val}},
            "estadoCivil":{"model":{"val":dataSent.estadoCivil.model.val}},
            "pai":{"model":{"val":dataSent.pai.model.val}},
            "mae":{"model":{"val":dataSent.mae.model.val}},
            "avRua":{"model":{"val":dataSent.avRua.model.val}},
            "endNum":{"model":{"val":dataSent.endNum.model.val}},
            "apt":{"model":{"val":dataSent.apt.model.val}},
            "bairro":{"model":{"val":dataSent.bairro.model.val}},
            "endUf":{"model":{"val":dataSent.endUf.model.val}},
            "nacionalidade":{"model":{"val":dataSent.nacionalidade.model.val}},
            "naturalidade":{"model":{"val":dataSent.naturalidade.model.val}},
            "natUf":{"model":{"val":dataSent.natUf.model.val}},
            "unidade":{"model":{"val":dataSent.unidade.model.val}},
            "area":{"model":{"val":dataSent.area.model.val}},
            "curso":{"model":{"val":dataSent.curso.model.val}},
            "vagas":{"preenchidas":dataSent.vagas.preenchidas,"totais":dataSent.vagas.totais},
            "escolaEm":{"model":{"val":dataSent.escolaEm.model.val}},
            "anoEm":{"model":{"val":dataSent.anoEm.model.val}},
            "cursoGrad":{"model":{"val":dataSent.cursoGrad.model.val}},
            "anoGrad":{"model":{"val":dataSent.anoGrad.model.val}},
            "instituicao":{"model":{"val":dataSent.instituicao.model.val}},
            "valorInscricao":{"model":{"val":dataSent.valorInscricao.model.val}},
            "formaPagamentoInscr":{"model":{"val":dataSent.formaPagamentoInscr.model.val}},
            "valorIntegral":{"model":{"val":dataSent.valorIntegral.model.val}},
            "desconto":{"model":{"val":dataSent.desconto.model.val}},
            "formaPagamentoPag":{"model":{"val":dataSent.formaPagamentoPag.model.val}},
            "qtdParcelas":{"model":{"val":dataSent.qtdParcelas.model.val}},
            "valorParcela":{"model":{"val":dataSent.valorParcela.model.val}},
            "melhorData":{"model":{"val":dataSent.melhorData.model.val}},
            "observacoes":{"model":{"val":dataSent.observacoes.model.val}},
            "listaCheques":dataSent.listaCheques
        };

/*-----------------------------------------------------------------------------------------------------------------------*/

        /*  --- retransformando as datas de formato int para a data por extenso---  */
        for (var j = 0; j < dataSent.listaCheques.length; j++) {
            dataSent.listaCheques[j].data = setDataExt(dataSent.listaCheques[j].data);
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

function putDadosTurmas(req, res) {
    var dadosSent = req.body;

    var result = [];

    for (var i = 0; i < dadosSent.list.length; i++) {
        if (dadosSent.list[i].acao.model.val) {
            result.push(dadosSent.list[i].area.turma.id)
        }
    }

/*      Enviar para Clayton o result (que contém uma lista de id's de turmas a serem geradas)   */

    console.log(result); // ???

    res.json(dadosSent);
}

function putSaveConfig(req, res) {
    var dadosSent = req.body;

    var sendDados = {
        "nomeUnidade":{"model":{"val":dadosSent.nomeUnidade.model.val,"err":""}},
        "nomeEmpresa":{"model":{"val":dadosSent.nomeEmpresa.model.val,"err":""}},
        "cnpj":{"model":{"val":dadosSent.cnpj.model.val,"err":""}},
        "endereco":{"model":{"val":dadosSent.endereco.model.val,"err":""}},
        "telefone":{"model":{"val":dadosSent.telefone.model.val,"err":""}},
        "site":{"model":{"val":dadosSent.site.model.val,"err":""}},
        "email":{"model":{"val":dadosSent.email.model.val,"err":""}},
        "tipoCurso":{"list":dadosSent.tipoCurso.list},
        "tipoArea":{"list":dadosSent.tipoArea.list},
        "turno":{"list":dadosSent.turno.list},
        "tipoPeriodo":{"list":dadosSent.tipoPeriodo.list},
        "modalidadeTurma":{"list":dadosSent.modalidadeTurma.list},
        "horarioEntrada":{"list":dadosSent.horarioEntrada.list},
        "horarioSaida":{"list":dadosSent.horarioSaida.list},
        "tipoTelefone":{"list":dadosSent.tipoTelefone.list},
        "tipoSituacao":{"list":dadosSent.tipoSituacao.list},
        "secAutorizacao":{"model":{"val":dadosSent.secAutorizacao.model.val,"err":""}},
        "secFolha":{"model":{"val":dadosSent.secFolha.model.val,"err":""}},
        "secNumero":{"model":{"val":dadosSent.secNumero.model.val,"err":""}},
        "dirAutorizacao":{"model":{"val":dadosSent.dirAutorizacao.model.val,"err":""}},
        "dirFolha":{"model":{"val":dadosSent.dirFolha.model.val,"err":""}},
        "dirNumero":{"model":{"val":dadosSent.dirNumero.model.val,"err":""}}
    };

    /*  ENVIAR PARA CLAYTON O OOBJETO SENDdADOS CRIADO SÓ COM OS DADOS A SEREM SALVOS   */

    /*  ===   */

    res.json(extend(true, dadosSent, sendDados));
}

function setDataExt(a) {
    return new Date(a);
}

function setDataInt(a) {
    return new Date(a).getTime();
}