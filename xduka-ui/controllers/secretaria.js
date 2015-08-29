var urlDataBase = '',
    extend = require('node.extend'),
    request = require('request'),
    alunos = require('../mockup/xduka-json/common/alunos.json'),
    dadosCurso = require('../mockup/xduka-json/common/dadosCursos.json'),
    dadosGeraTurma = require('../mockup/xduka-json/secretaria/dadosGeraTurma.json'),
    dadosFreqPauta = require('../mockup/xduka-json/secretaria/dadosFreqPauta.json'),
    dadosNotasPauta = require('../mockup/xduka-json/secretaria/dadosNotasPauta.json'),
    templateAluno = require('../mockup/xduka-json/secretaria/templateAluno.json'),
    templateConfig = require('../mockup/xduka-json/secretaria/templateConfig.json'),
    templateInscr = require('../mockup/xduka-json/common/templateInscricao.json'),
    templatePauta = require('../mockup/xduka-json/secretaria/templatePauta.json'),
    usuario = require('../mockup/xduka-json/common/user.json'),
    viewInscr = require('../mockup/xduka-json/common/viewInscr.json');

module.exports = function() {
    var controller = {};

    controller.alunoSearch = alunoSearch;
    controller.showConfig = showConfig;
    controller.showDadosCurso = getDadosCurso;
    controller.showDadosGeraTurma = getDadosGeraTurma;
    controller.showDadosFreqPauta = getDadosFreqPauta;
    controller.showDadosNotasPauta = getDadosNotasPauta;
    controller.showInfoUsuario = getInfoUsuario;
    controller.showTemplateAl = getTemplateAl;
    controller.showViewInscr = getViewInscr;
    controller.showTemplateInscricao = getTemplateInscricao;
    controller.showTemplatePauta = getTemplatePauta;
    controller.putDadosInscricao = putDadosInscricao;
    controller.putDadosTurmas = putDadosTurmas;
    controller.putSaveConfig = putSaveConfig;

    return controller;
};

function getDadosFreqPauta(req, res) {
    var i;

    for(i = 0; i < dadosFreqPauta.tableFreqFixa.list.length; i++) {
        dadosFreqPauta.tableFreqFixa.list[i].anum = dadosFreqPauta.tableFreqFixa.list[i].anum.toString();
        dadosFreqPauta.tableFreqFixa.list[i].cfaltas = dadosFreqPauta.tableFreqFixa.list[i].cfaltas.toString();
    }
    res.json(dadosFreqPauta);
}

function getDadosNotasPauta(req, res) {
    var i;

    for(i = 0; i < dadosNotasPauta.list.length; i++) {
        dadosNotasPauta.list[i].anum = dadosNotasPauta.list[i].anum.toString();
        dadosNotasPauta.list[i].enotaUm = dadosNotasPauta.list[i].enotaUm.toString();
        dadosNotasPauta.list[i].fnotaDois = dadosNotasPauta.list[i].fnotaDois.toString();
        dadosNotasPauta.list[i].gfaltas = dadosNotasPauta.list[i].gfaltas.toString();
        dadosNotasPauta.list[i].hmedia = dadosNotasPauta.list[i].hmedia.toString();
    }

    res.json(dadosNotasPauta);
}

function getTemplatePauta(req, res) {
    res.json(templatePauta);
}

function getTemplateAl(req,res) {
    res.json(templateAluno)
}

function showConfig(req,res) {
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

    if (verificaDadosEmpresa(dadosSent.model)) {
        var sendDados = {
            "nomeUnidade": {"model": {"val": dadosSent.nomeUnidade.model.val}},
            "nomeEmpresa": {"model": {"val": dadosSent.nomeEmpresa.model.val}},
            "cnpj": {"model": {"val": dadosSent.cnpj.model.val}},
            "endereco": {"model": {"val": dadosSent.endereco.model.val}},
            "telefone": {"model": {"val": dadosSent.telefone.model.val}},
            "site": {"model": {"val": dadosSent.site.model.val}},
            "email": {"model": {"val": dadosSent.email.model.val}},
            "tipoCurso": {"list": dadosSent.tipoCurso.list},
            "tipoArea": {"list": dadosSent.tipoArea.list},
            "turno": {"list": dadosSent.turno.list},
            "tipoPeriodo": {"list": dadosSent.tipoPeriodo.list},
            "modalidadeTurma": {"list": dadosSent.modalidadeTurma.list},
            "horarioEntrada": {"list": dadosSent.horarioEntrada.list},
            "horarioSaida": {"list": dadosSent.horarioSaida.list},
            "tipoTelefone": {"list": dadosSent.tipoTelefone.list},
            "tipoSituacao": {"list": dadosSent.tipoSituacao.list},
            "secAutorizacao": {"model": {"val": dadosSent.secAutorizacao.model.val}},
            "secFolha": {"model": {"val": dadosSent.secFolha.model.val}},
            "secNumero": {"model": {"val": dadosSent.secNumero.model.val}},
            "dirAutorizacao": {"model": {"val": dadosSent.dirAutorizacao.model.val}},
            "dirFolha": {"model": {"val": dadosSent.dirFolha.model.val}},
            "dirNumero": {"model": {"val": dadosSent.dirNumero.model.val}}
        };

        /*  ENVIAR PARA BD O OBJETO SENDDADOS CRIADO SÓ COM OS DADOS A SEREM SALVOS   */
        /*
        request(urlDataBase, function (error, response, body) {
            if (!error && response.statusCode == 200) {
                res.json(JSON.parse(body));
            }else {
                res.json({"erro": true});
            }
        });
        */
        /*  ===   */

        res.json(extend(true, dadosSent, sendDados));
    } else {
        validaDadosEmpresa(dadosSent);

        res.json(dadosSent);
    }
}

function setDataExt(a) {
    return new Date(a);
}

function setDataInt(a) {
    return new Date(a).getTime();
}

function verificaDadosEmpresa(obj) {
    return !!obj.nomeUnidade.model.val && !!obj.nomeEmpresa.model.val &&
    !!obj.cnpj.model.val && !! obj.endereco.model.val &&
    !!obj.telefone.model.val && !!obj.site.model.val &&
    !!obj.email.model.val && !!obj.secAutorizacao.model.val &&
    !!obj.secFolha.model.val && !!obj.secNumero.model.val &&
    !!obj.dirAutorizacao.model.val && !!obj.dirFolha.model.val &&
    !!obj.dirNumero.model.val
}

function validaDadosEmpresa(obj) {
    obj.model.nomeUnidade.model.err = obj.model.nomeUnidade.model.val ? '' : obj.STR.FIELD;
    obj.model.nomeEmpresa.model.err = obj.model.nomeEmpresa.model.val ? '' : obj.STR.FIELD;
    obj.model.cnpj.model.err = obj.model.cnpj.model.val ? '' : obj.STR.FIELD;
    obj.model.endereco.model.err = obj.model.endereco.model.val ? '' : obj.STR.FIELD;
    obj.model.telefone.model.err = obj.model.telefone.model.val ? '' : obj.STR.FIELD;
    obj.model.site.model.err = obj.model.site.model.val ? '' : obj.STR.FIELD;

    obj.model.email.model.err = !obj.model.email.model.val ?
        obj.STR.FIELD : isEmail(obj.model.email.model.val) ? '' : obj.STR.NOEMAIL;

    obj.model.secAutorizacao.model.err = obj.model.secAutorizacao.model.val ? '' : obj.STR.FIELD;
    obj.model.secFolha.model.err = obj.model.secFolha.model.val ? '' : obj.STR.FIELD;
    obj.model.secNumero.model.err = obj.model.secNumero.model.val ? '' : obj.STR.FIELD;
    obj.model.dirAutorizacao.model.err = obj.model.dirAutorizacao.model.val ? '' : obj.STR.FIELD;
    obj.model.dirFolha.model.err = obj.model.dirFolha.model.val ? '' : obj.STR.FIELD;
    obj.model.dirNumero.model.err = obj.model.dirNumero.model.val ? '' : obj.STR.FIELD;
}

function isEmail(email){
    var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    return regex.test(email);
}