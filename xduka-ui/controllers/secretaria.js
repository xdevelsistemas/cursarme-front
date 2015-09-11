var urlDataBase = '',
    extend = require('node.extend'),
    request = require('request'),
    alunos = require('../mockup/xduka-json/common/alunos.json'),
    dadosAddCurso = require('../mockup/xduka-json/common/dadosAddCurso.json'),
    dadosAddDisciplina = require('../mockup/xduka-json/common/dadosAddDisciplina.json'),
    dadosCurso = require('../mockup/xduka-json/common/dadosCursos.json'),
    dadosCursoPauta = require('../mockup/xduka-json/common/dadosCursoPauta.json'),
    dadosEnviarCircular = require('../mockup/xduka-json/common/dadosEnviarCircular.json'),
    dadosGeraTurma = require('../mockup/xduka-json/common/dadosGeraTurma.json'),
    dadosPauta = require('../mockup/xduka-json/common/dadosPauta.json'),
    templateAddCurso = require('../mockup/xduka-json/secretaria/templateAddCurso.json'),
    templateAddDisciplina = require('../mockup/xduka-json/secretaria/templateAddDisciplina.json'),
    templateAluno = require('../mockup/xduka-json/secretaria/templateAluno.json'),
    templateConfig = require('../mockup/xduka-json/secretaria/templateConfig.json'),
    templateEnviarCircular = require('../mockup/xduka-json/secretaria/templateEnviarCircular.json'),
    templateInscr = require('../mockup/xduka-json/common/templateInscricao.json'),
    templatePauta = require('../mockup/xduka-json/secretaria/templatePauta.json'),
    usuario = require('../mockup/xduka-json/common/user.json'),
    viewInscr = require('../mockup/xduka-json/common/viewInscr.json');

module.exports = function() {
    var controller = {};

    controller.alunoSearch = alunoSearch;
    controller.showConfig = showConfig;
    controller.showDadosAddCurso = getDadosAddCurso;
    controller.showDadosCurso = getDadosCurso;
    controller.showDadosCursoPauta = getDadosCursoPauta;
    controller.showDadosEnviarCircular = getDadosEnviarCircular;
    controller.showDadosGeraTurma = getDadosGeraTurma;
    controller.showDadosPauta = getDadosPauta;
    controller.showInfoUsuario = getInfoUsuario;
    controller.showTemplateAddCurso = getTemplateAddCurso;
    controller.showTemplateAddDisciplina = getTemplateAddDisciplina;
    controller.showTemplateAl = getTemplateAl;
    controller.showTemplateEnviarCircular = getTemplateEnviarCircular;
    controller.showTemplateInscricao = getTemplateInscricao;
    controller.showTemplatePauta = getTemplatePauta;
    controller.showViewInscr = getViewInscr;
    controller.putDadosInscricao = postDadosInscricao;
    controller.putDadosTurmas = postDadosTurmas;
    controller.putSaveDisciplinas = postSaveDisciplinas;
    controller.putSaveConfig = postSaveConfig;
    controller.putSaveFreqAlunos = postSaveFreqAlunos;
    controller.putEnviarCircular = postEnviarCircular;

    return controller;
};

function getDadosPauta(req, res) {
    var idDisc = req.params.id,
        i, j,
        objPauta = pegaDadosPauta(dadosPauta.disciplinas, idDisc),
        freqDatasSimp = {};

    // Definindo o head de datas simples
    objPauta.tableFreqDatasSimp.head = objPauta.tableFreqDatasComp.head.slice(objPauta.tableFreqDatasComp.head.length-3);
    //
    objPauta.tableNotas.list = [];
    objPauta.tableFreqFixa.list = [];
    objPauta.tableFreqDatasComp.list = [];
    objPauta.tableFreqDatasSimp.list = [];

    for (i = 0; i < objPauta.alunos.length; i++) {
        // Table Notas
        objPauta.tableNotas.list.push({
            "bmat": objPauta.alunos[i].mat,
            "caluno": objPauta.alunos[i].nome,
            "dsit": objPauta.alunos[i].sit,
            "efaltas": objPauta.alunos[i].faltas,
            "fnotaUm": objPauta.alunos[i].notaUm,
            "gnotaDois": objPauta.alunos[i].notaDois,
            "hmedia": objPauta.alunos[i].media
        });

        // Table Frequência Fixa
        objPauta.tableFreqFixa.list.push({
            "baluno": objPauta.alunos[i].nome,
            "cfaltas": objPauta.alunos[i].faltas
        });

        // Table Frequência Datas Completas
        objPauta.tableFreqDatasComp.list.push(objPauta.alunos[i].freqDataComp);

        // Table Frequência Datas Simples
        objPauta.tableFreqDatasSimp.head.forEach(function(el) {
            freqDatasSimp[el.toString()] = objPauta.tableFreqDatasComp.list[i][el.toString()];
        });
        objPauta.tableFreqDatasSimp.list.push(freqDatasSimp);
    }

    // Transformando dados tipo inteiro para string
    for(i = 0; i < objPauta.tableFreqFixa.list.length; i++) {
        // Table Freq Fixa
        objPauta.tableFreqFixa.list[i].cfaltas = objPauta.tableFreqFixa.list[i].cfaltas.toString();

        // Table Notas
        objPauta.tableNotas.list[i].efaltas = objPauta.tableNotas.list[i].efaltas.toString();
        objPauta.tableNotas.list[i].fnotaUm = objPauta.tableNotas.list[i].fnotaUm.toString();
        objPauta.tableNotas.list[i].gnotaDois = objPauta.tableNotas.list[i].gnotaDois.toString();
        objPauta.tableNotas.list[i].hmedia = objPauta.tableNotas.list[i].hmedia.toString();
    }

    res.json(objPauta);
}

function pegaDadosPauta(obj, id) {
    for (var i = 0; i < obj.length; i++) {
        if (obj[i].id == id) {
            return obj[i].pauta;
        }
    }
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

function getDadosAddCurso(req, res) {
    res.json(dadosAddCurso);
}

function getDadosCurso(req, res) {
    res.json(dadosCurso);
}

function getDadosCursoPauta(req, res) {
    res.json(dadosCursoPauta);
}

function getDadosEnviarCircular(req, res) {
    res.json(dadosEnviarCircular);
}

function getTemplatePauta(req, res) {
    res.json(templatePauta);
}

function getTemplateAddCurso(req,res) {
    res.json(templateAddCurso);
}

function getTemplateAddDisciplina(req,res) {
    res.json({"template": templateAddDisciplina.template, "dadosAddDisciplina": dadosAddDisciplina.list});
}

function getTemplateAl(req,res) {
    res.json(templateAluno);
}

function getTemplateEnviarCircular(req, res) {
    res.json(templateEnviarCircular);
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

function postDadosInscricao(req, res) {
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

function postDadosTurmas(req, res) {
    var dataSent = req.body;

    var result = [];

    for (var i = 0; i < dataSent.list.length; i++) {
        if (dataSent.list[i].acao.model.val) {
            result.push(dataSent.list[i].area.turma.id)
        }
    }

/*      TOdo Enviar para backend o result (que contém uma lista de id's de turmas a serem geradas)   */

    console.log(result); // ???

    res.json(dataSent);
}

function postSaveDisciplinas(req, res) {
    var dataSent = req.body;

    var result = {"list": dataSent.tableNome.list};

    // Todo enviar dados para p backend | disciplinas adicionadas/editadas

    res.json({"success": true, "tableNome": dataSent.tableNome});
}

function postSaveConfig(req, res) {
    var dataSent = req.body;

    if (verificaDadosEmpresa(dataSent.model)) {
        var sendDados = {
            "nomeUnidade": {"model": {"val": dataSent.nomeUnidade.model.val}},
            "nomeEmpresa": {"model": {"val": dataSent.nomeEmpresa.model.val}},
            "cnpj": {"model": {"val": dataSent.cnpj.model.val}},
            "endereco": {"model": {"val": dataSent.endereco.model.val}},
            "telefone": {"model": {"val": dataSent.telefone.model.val}},
            "site": {"model": {"val": dataSent.site.model.val}},
            "email": {"model": {"val": dataSent.email.model.val}},
            "tipoCurso": {"list": dataSent.tipoCurso.list},
            "tipoArea": {"list": dataSent.tipoArea.list},
            "turno": {"list": dataSent.turno.list},
            "tipoPeriodo": {"list": dataSent.tipoPeriodo.list},
            "modalidadeTurma": {"list": dataSent.modalidadeTurma.list},
            "horarioEntrada": {"list": dataSent.horarioEntrada.list},
            "horarioSaida": {"list": dataSent.horarioSaida.list},
            "tipoTelefone": {"list": dataSent.tipoTelefone.list},
            "tipoSituacao": {"list": dataSent.tipoSituacao.list},
            "secAutorizacao": {"model": {"val": dataSent.secAutorizacao.model.val}},
            "secFolha": {"model": {"val": dataSent.secFolha.model.val}},
            "secNumero": {"model": {"val": dataSent.secNumero.model.val}},
            "dirAutorizacao": {"model": {"val": dataSent.dirAutorizacao.model.val}},
            "dirFolha": {"model": {"val": dataSent.dirFolha.model.val}},
            "dirNumero": {"model": {"val": dataSent.dirNumero.model.val}}
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

        res.json(extend(true, dataSent, sendDados));
    } else {
        validaDadosEmpresa(dataSent);

        res.json(dataSent);
    }
}

function postSaveFreqAlunos(req, res) {
    var dataSent = req.body;

    if (verificaDadosAula(dataSent.model)) {

        /**
         * TOdo request para o backend / dados de frequências dos alunos
         */

        var i, j, alunos = [];

        for (i = 0; i < dataSent.tableNotas.list.length; i++) {
            if (dataSent.freqAlunos[dataSent.tableNotas.list[i].bmat]) {
                dataSent.tableNotas.list[i].gfaltas = parseInt(dataSent.tableNotas.list[i].gfaltas);
                dataSent.tableNotas.list[i].gfaltas += parseInt(dataSent.model.addAulas.model.val);
                dataSent.tableNotas.list[i].gfaltas = dataSent.tableNotas.list[i].gfaltas.toString();
                alunos.push(dataSent.tableNotas.list[i].caluno);
            }
        }

        // TABLE NOTAS
        for (i = 0; i < dataSent.tableFreqFixa.list.length; i++) {
            if (dataSent.tableFreqFixa.list[i].baluno in alunos) {
                dataSent.tableFreqFixa.list[i].cfaltas = parseInt(dataSent.tableFreqFixa.list[i].cfaltas);
                dataSent.tableFreqFixa.list[i].cfaltas += parseInt(dataSent.model.addAulas.model.val);
                dataSent.tableFreqFixa.list[i].cfaltas = dataSent.tableFreqFixa.list[i].cfaltas.toString();
            }
        }

        // TABLE FREQUÊNCIA SIMPLES
        for (i = 0; i < dataSent.tableFreqDatasSimp.list.length; i++) {
            for (j = 0; dataSent.tableFreqDatasSimp.head.length-1; j++) {
                dataSent.tableFreqDatasSimp.list[i][dataSent.tableFreqDatasSimp.head[j].toString()] =
                    dataSent.tableFreqDatasSimp.list[i][dataSent.tableFreqDatasSimp.head[j+1].toString()];
            }
        }
        dataSent.tableFreqDatasSimp.head.splice(0, 1);
        dataSent.tableFreqDatasSimp.head.push(new Date(dataSent.model.addConteudoData.model.val).getTime());

        // TABLE FREQUÊNCIA COMPLETA
        dataSent.tableFreqDatasComp.head.push(new Date(dataSent.model.addConteudoData.model.val).getTime());
        for (i = 0; i < dataSent.tableFreqDatasComp.list.length; i++) {
            dataSent.tableFreqDatasComp.list[i][new Date(dataSent.model.addConteudoData.model.val).getTime().toString()] =
                alunos ? "p" : "f";
        }



        res.json({"success": true, "table": dataSent});
    } else {
        validaDadosAula(dataSent);
        res.json({"success": false, "model": dataSent.model});
    }
}

function postEnviarCircular(req, res) {
    var dataSent = req.body;

    if (verificaDadosEnviarCircular(dataSent.model)) {

        /**
         * TOdo request para o backend / dados de enviar circular
         */

        res.json({"success": true, "model": dataSent.model});
    } else {
        validaDadosEnviarCircular(dataSent);
        res.json({"success": false, "model": dataSent.model});
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

function verificaDadosEnviarCircular(obj) {
    return !!obj.curso.model.val && !!obj.turma.model.val &&
        !!obj.disciplina.model.val && !!obj.titulo.model.val &&
        !!obj.numero.model.val && !!obj.data.model.val &&
        !!obj.texto.model.val && !!obj.anexo.model.val
}

function validaDadosEnviarCircular(obj) {
    obj.model.curso.model.err = !!obj.model.curso.model.val ? '' : obj.STR.FIELD;
    obj.model.turma.model.err = !!obj.model.turma.model.val ? '' : obj.STR.FIELD;
    obj.model.disciplina.model.err = !!obj.model.disciplina.model.val ? '' : obj.STR.FIELD;
    obj.model.titulo.model.err = !!obj.model.titulo.model.val ? '' : obj.STR.FIELD;
    obj.model.numero.model.err = !!obj.model.numero.model.val ? '' : obj.STR.FIELD;
    obj.model.data.model.err = !!obj.model.data.model.val ? '' : obj.STR.FIELD;
    obj.model.texto.model.err = !!obj.model.texto.model.val ? '' : obj.STR.FIELD;
    obj.model.anexo.model.err = !!obj.model.anexo.model.val ? '' : obj.STR.FIELD;
}

function isEmail(email){
    var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    return regex.test(email);
}

function validaDadosAula(obj) {
    obj.model.addConteudoTitulo.model.err = !!obj.model.addConteudoTitulo.model.val ? "" : obj.STR.FIELD;
    obj.model.addConteudoTArea.model.err = !!obj.model.addConteudoTArea.model.val ? "" : obj.STR.FIELD;
}

function verificaDadosAula(obj) {
    return !obj.addConteudoTitulo.model.val && !obj.addConteudoTArea.model.val ||
        !!obj.addConteudoTitulo.model.val && !!obj.addConteudoTArea.model.val
}