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
    dadosPeriodo = require('../mockup/xduka-json/common/dadosPeriodo.json'),
    dadosMaterialComp = require('../mockup/xduka-json/common/dadosMaterialComp.json'),
    dadosTableAddCurso = require('../mockup/xduka-json/common/dadosTableAddCurso.json'),
    dadosTablesPauta = require('../mockup/xduka-json/secretaria/dadosTablesPauta.json'),
    templateAddCurso = require('../mockup/xduka-json/secretaria/templateAddCurso.json'),
    templateAddDisciplina = require('../mockup/xduka-json/secretaria/templateAddDisciplina.json'),
    templateAluno = require('../mockup/xduka-json/secretaria/templateAluno.json'),
    templateConfig = require('../mockup/xduka-json/secretaria/templateConfig.json'),
    templateDadosAddCurso = require('../mockup/xduka-json/secretaria/templateDadosAddCurso.json'),
    templateEnviarCircular = require('../mockup/xduka-json/secretaria/templateEnviarCircular.json'),
    templateInscr = require('../mockup/xduka-json/common/templateInscricao.json'),
    templateMaterialComp = require('../mockup/xduka-json/secretaria/templateMaterialComp.json'),
    templatePauta = require('../mockup/xduka-json/secretaria/templatePauta.json'),
    usuario = require('../mockup/xduka-json/common/user.json'),
    viewInscr = require('../mockup/xduka-json/common/viewInscr.json'),
    templateAddTurma = require('../mockup/xduka-json/secretaria/templateAddTurma'),
    dadosTurmas = require('../mockup/xduka-json/secretaria/dadosTurmas.json');

module.exports = function() {
    var controller = {};

    controller.alunoSearch = alunoSearch;
    controller.showConfig = showConfig;
    controller.showCursos = showCursos;
    controller.showDadosAddCurso = getDadosAddCurso;
    controller.showDadosCurso = getDadosCurso;
    controller.showDadosCursoPauta = getDadosCursoPauta;
    controller.showDadosEnviarCircular = getDadosEnviarCircular;
    controller.showDadosGeraTurma = getDadosGeraTurma;
    controller.showDadosMaterialComp = getDadosMaterialComp;
    controller.showDadosPauta = getDadosPauta;
    controller.showIdCurso = getIdCurso;
    controller.showInfoUsuario = getInfoUsuario;
    controller.showTemplateAddCurso = getTemplateAddCurso;
    controller.showTemplateAddDisciplina = getTemplateAddDisciplina;
    controller.showTemplateAddTurma = getTemplateAddTurma;
    controller.showTemplateAl = getTemplateAl;
    controller.showTemplateEnviarCircular = getTemplateEnviarCircular;
    controller.showTemplateInscricao = getTemplateInscricao;
    controller.showTemplateMaterialCircular = getTemplateMaterialCircular;
    controller.showTemplatePauta = getTemplatePauta;
    controller.showTurmas = showTurmas;
    controller.showViewInscr = getViewInscr;
    controller.putDadosInscricao = postDadosInscricao;
    controller.putDadosTurmas = postDadosTurmas;
    controller.putSaveDisciplinas = postSaveDisciplinas;
    controller.putSaveConfig = postSaveConfig;
    controller.putSaveDadosCurso = postSaveDadosCurso;
    controller.putSaveEditConteudo = postSaveEditConteudo;
    controller.putSaveEnviarCircular = postSaveEnviarCircular;
    controller.putSaveFreqAlunos = postSaveFreqAlunos;
    controller.putSaveMaterialComp = postSaveMaterialComp;
    controller.putSaveNovoConteudo = postSaveNovoConteudo;
    controller.putRemoveConteudo = postRemoveConteudo;

    return controller;
};

function getDadosPauta(req, res) {
    var idDisc = req.params.id,
        objPauta = pegaDadosPauta(dadosPauta.disciplinas, idDisc);

    extend(true, dadosTablesPauta, objPauta);
    res.json(geraDadosCompletoPauta(dadosTablesPauta));
}

function geraDadosCompletoPauta(obj) {
    var i, j, freqAnterior = obj.tableFreqDatasComp.head[obj.tableFreqDatasComp.head.length-1],
        freqDatasSimp = {};

    // Definindo o head de datas simples
    obj.tableFreqDatasSimp.head = obj.tableFreqDatasComp.head.slice(obj.tableFreqDatasComp.head.length-3);
    //
    obj.tableNotas.list = [];
    obj.tableFreqFixa.list = [];
    obj.tableFreqDatasComp.list = [];
    obj.tableFreqDatasSimp.list = [];
    obj._alunos = [];
    obj.duplicaFreq = [];

    for (i = 0; i < obj.alunos.length; i++) {
        freqDatasSimp = {};
        //
        //_alunos para o preenchimento da pauta de chamada
        obj._alunos.push({
            "id": obj.alunos[i].mat.list[0].text,
            "nome": obj.alunos[i].nome
        });
        //
        // duplicando frequência anterior
        obj.duplicaFreq.push({
            "id": obj.alunos[i].mat.list[0].text,
            "freq": obj.alunos[i].freqDataComp[freqAnterior].value
        });
        //
        // Table Notas
        obj.tableNotas.list.push({
            "bmat": obj.alunos[i].mat,
            "caluno": obj.alunos[i].nome,
            "dsit": obj.alunos[i].sit,
            "efaltas": obj.alunos[i].faltas,
            "fnotaUm": obj.alunos[i].notaUm,
            "gnotaDois": obj.alunos[i].notaDois,
            "hmedia": obj.alunos[i].media
        });

        // Table Frequência Fixa
        obj.tableFreqFixa.list.push({
            "baluno": obj.alunos[i].nome,
            "cfaltas": obj.alunos[i].faltas
        });

        obj.tableFreqDatasComp.list.push(obj.alunos[i].freqDataComp);

        // Table Frequência Datas Simples
        obj.tableFreqDatasSimp.head.forEach(function(el) {
            freqDatasSimp[el.toString()] = obj.tableFreqDatasComp.list[i][el.toString()];
        });
        obj.tableFreqDatasSimp.list.push(freqDatasSimp);
    }

    // Transformando dados tipo inteiro para string
    for(i = 0; i < obj.tableFreqFixa.list.length; i++) {
        // Table Freq Fixa
        obj.tableFreqFixa.list[i].cfaltas = obj.tableFreqFixa.list[i].cfaltas.toString();

        // Table Notas
        obj.tableNotas.list[i].efaltas = obj.tableNotas.list[i].efaltas.toString();
        obj.tableNotas.list[i].fnotaUm = obj.tableNotas.list[i].fnotaUm.toString();
        obj.tableNotas.list[i].gnotaDois = obj.tableNotas.list[i].gnotaDois.toString();
        obj.tableNotas.list[i].hmedia = obj.tableNotas.list[i].hmedia.toString();
    }

    return obj
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

function showCursos(req, res){

    /* RETORNAR UMA LISTAR DE CURSOS E UMA LISTA DE PERÍODOS REFERENTE A ESTES CURSOS */

    var testCursos = {
        "1": [
            {"id": "11", "text": "Curso1"},
            {"id": "12", "text": "Curso2"},
            {"id": "13", "text": "Curso3"}
        ],
        "2": [
            {"id": "21", "text": "Curso4"},
            {"id": "22", "text": "Curso5"},
            {"id": "23", "text": "Curso6"}
        ]
    };
    var testPeriodos = {
        "11": [
            {"id": "111", "text": "Único"}
        ],
        "12": [
            {"id": "121", "text": "Único"}
        ],
        "13": [
            {"id": "131", "text": "Único"}
        ],
        "21": [
            {"id": "211", "text": "Único"}
        ],
        "22": [
            {"id": "221", "text": "Único"}
        ],
        "23": [
            {"id": "231", "text": "Único"}
        ]
    };

    var respObj = {
        "listCursos": testCursos[req.params.tipo],
        "listPeriodos": []
    };

    respObj.listCursos.forEach(function(element, index, array){
        respObj.listPeriodos.push(testPeriodos[element.id])
    });

    res.json(respObj)
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

function getDadosMaterialComp(req, res) {
    res.json(getUnidade(dadosMaterialComp.unidades, req.params.id));
}

function getDadosAddCurso(req, res) {
    res.json(getUnidade(dadosAddCurso.unidades, req.params.id));
}

function getUnidade(list, id) {
    return list.filter(function(elem) {
        return elem.id == id
    })[0]
}

function getDadosCurso(req, res) {
    res.json(dadosCurso);
}

function getDadosCursoPauta(req, res) {
    res.json(getUnidade(dadosCursoPauta.unidades, req.params.id));
}

function getDadosEnviarCircular(req, res) {
    res.json(getUnidade(dadosEnviarCircular.unidades, req.params.id));
}

function getTemplatePauta(req, res) {
    res.json(templatePauta);
}

function showTurmas(req, res){
    res.json(dadosTurmas);
}

function getTemplateAddCurso(req,res) {
    extend(true, templateAddCurso.template.periodo, dadosPeriodo);
    extend(true, templateDadosAddCurso.tableCursos, getUnidade(dadosTableAddCurso.unidades, req.params.id));
    res.json({"template": templateAddCurso.template, "tables": templateDadosAddCurso});
}

function getTemplateAddDisciplina(req,res) {
    var idUnidade = req.params.id;

    res.json({"template": templateAddDisciplina.template, "dadosAddDisciplina": getUnidade(dadosAddDisciplina.unidades, idUnidade).list});
}

function getTemplateAddTurma(req, res){
    var idUnidade = req.params.id;

    res.json(templateAddTurma.template);
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

function getTemplateMaterialCircular(req, res) {
    res.json(templateMaterialComp);
}

function getIdCurso(req, res) {
    var dataInt = new Date().getTime().toString();

    res.json({"idCurso": "AC" + dataInt.slice(dataInt.length-10)});
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

        var i, dadosAlunoPauta, freqDatasSimp = {};

        for (i = 0; i < dadosTablesPauta.alunos.length; i++) {
            if (dataSent.freqAlunos[dadosTablesPauta.alunos[i].mat.list[0].text]) {
                dadosTablesPauta.alunos[i].faltas = parseInt(dadosTablesPauta.alunos[i].faltas) + parseInt(dataSent.model.addAulas.model.val);
            }
        }

        dadosTablesPauta.tableFreqDatasComp.head.push(new Date(dataSent.model.addConteudoData.model.val).getTime());

        if (!!dataSent.model.addConteudoTitulo.model.val && !!dataSent.model.addConteudoTArea.model.val) {
            dadosTablesPauta.tableConteudoAdicionado.list.push({
                "adata": {
                    "date": true,
                    "int": new Date(dataSent.model.addConteudoData.model.val).getTime()
                },
                "btitulo": dataSent.model.addConteudoTitulo.model.val,
                "cconteudo": dataSent.model.addConteudoTArea.model.val,
                "dbtn": {
                    "btn": true,
                    "list": [{
                        "title": "Editar",
                        "entypo": "entypo-pencil",
                        "class": "btn btn-white"
                    },
                    {
                        "title": "Remover",
                        "entypo": "entypo-cancel",
                        "class": "btn btn-white"
                    }]
                }
            });
        }

        // Definindo o head de datas simples
        dadosTablesPauta.tableFreqDatasSimp.head = dadosTablesPauta.tableFreqDatasComp.head.slice(dadosTablesPauta.tableFreqDatasComp.head.length-3);
        //
        dadosTablesPauta.tableNotas.list = [];
        dadosTablesPauta.tableFreqFixa.list = [];
        dadosTablesPauta.tableFreqDatasComp.list = [];
        dadosTablesPauta.tableFreqDatasSimp.list = [];
        dadosTablesPauta._alunos = [];
        dadosTablesPauta.duplicaFreq = [];

        for (i = 0; i < dadosTablesPauta.alunos.length; i++) {
            freqDatasSimp = {};
            var freqAnterior = dadosTablesPauta.tableFreqDatasComp.head[dadosTablesPauta.tableFreqDatasComp.head.length-1];
            //
            //_alunos para o preenchimento da pauta de chamada
            dadosTablesPauta._alunos.push({
                "id": dadosTablesPauta.alunos[i].mat.list[0].text,
                "nome": dadosTablesPauta.alunos[i].nome
            });
            //
            // Table Notas
            dadosTablesPauta.tableNotas.list.push({
                "bmat": dadosTablesPauta.alunos[i].mat,
                "caluno": dadosTablesPauta.alunos[i].nome,
                "dsit": dadosTablesPauta.alunos[i].sit,
                "efaltas": dadosTablesPauta.alunos[i].faltas,
                "fnotaUm": dadosTablesPauta.alunos[i].notaUm,
                "gnotaDois": dadosTablesPauta.alunos[i].notaDois,
                "hmedia": dadosTablesPauta.alunos[i].media
            });

            // Table Frequência Fixa
            dadosTablesPauta.tableFreqFixa.list.push({
                "baluno": dadosTablesPauta.alunos[i].nome,
                "cfaltas": dadosTablesPauta.alunos[i].faltas
            });

            // Table Frequência Datas Completas

            if (dataSent.freqAlunos[dadosTablesPauta.alunos[i].mat.list[0].text]) {
                dadosTablesPauta.alunos[i].freqDataComp[freqAnterior] = {"text": "f", "class": "pointF", "value": true};
            } else {
                dadosTablesPauta.alunos[i].freqDataComp[freqAnterior] = {"class": "pointP", "value": false};
            }
            dadosTablesPauta.tableFreqDatasComp.list.push(dadosTablesPauta.alunos[i].freqDataComp);

            //
            // duplicando frequência anterior
            dadosTablesPauta.duplicaFreq.push({
                "id": dadosTablesPauta.alunos[i].mat.list[0].text,
                "freq": dadosTablesPauta.alunos[i].freqDataComp[freqAnterior].value
            });

            // Table Frequência Datas Simples
            dadosTablesPauta.tableFreqDatasSimp.head.forEach(function(el) {
                freqDatasSimp[el.toString()] = dadosTablesPauta.tableFreqDatasComp.list[i][el.toString()];
            });
            dadosTablesPauta.tableFreqDatasSimp.list.push(freqDatasSimp);
        }

        // Transformando dados tipo inteiro para string
        for(i = 0; i < dadosTablesPauta.tableFreqFixa.list.length; i++) {
            // Table Freq Fixa
            dadosTablesPauta.tableFreqFixa.list[i].cfaltas = dadosTablesPauta.tableFreqFixa.list[i].cfaltas.toString();

            // Table Notas
            dadosTablesPauta.tableNotas.list[i].efaltas = dadosTablesPauta.tableNotas.list[i].efaltas.toString();
            dadosTablesPauta.tableNotas.list[i].fnotaUm = dadosTablesPauta.tableNotas.list[i].fnotaUm.toString();
            dadosTablesPauta.tableNotas.list[i].gnotaDois = dadosTablesPauta.tableNotas.list[i].gnotaDois.toString();
            dadosTablesPauta.tableNotas.list[i].hmedia = dadosTablesPauta.tableNotas.list[i].hmedia.toString();
        }

        //
        dataSent.model.addConteudoTitulo.model.err = "";
        dataSent.model.addConteudoTArea.model.err = "";
        //
        dadosAlunoPauta = extend(true, dataSent, dadosTablesPauta);

        res.json({"success": true, "table": dadosAlunoPauta});
    } else {
        validaDadosAula(dataSent);
        res.json({"success": false, "model": dataSent.model});
    }
}

function postSaveDadosCurso(req, res) {
    var dataSent = req.body;

    if (verificaDadosAddCurso(dataSent)) {
        if (auxFilterCodCurso(templateDadosAddCurso.tableCursos, dataSent.model.codigoCurso.model.val)) {
            var pos = descobrePos(templateDadosAddCurso.tableCursos.list,dataSent.model.codigoCurso.model.val);

            templateDadosAddCurso.tableCursos.list[pos].acodigo = dataSent.model.codigoCurso.model.val;
            templateDadosAddCurso.tableCursos.list[pos].bcurso = dataSent.model.curso.model.val;
            templateDadosAddCurso.tableCursos.list[pos].ctipo = auxGeraTextObj(dataSent.model.tipo)[0].text;
            templateDadosAddCurso.tableCursos.list[pos].darea = auxGeraTextObj(dataSent.model.area)[0].text;
            templateDadosAddCurso.tableCursos.list[pos].eturno = auxGeraTextObj(dataSent.model.turno)[0].text;
            templateDadosAddCurso.tableCursos.list[pos].fvagas = dataSent.model.vagasTurma.model.val;
            templateDadosAddCurso.tableCursos.list[pos].gcarga = dataSent.model.cargaHoraria.model.val;
            templateDadosAddCurso.tableCursos.list[pos].hperiodo = auxGeraTextObj(dataSent.model.periodo)[0].text;

            for (var elem in templateDadosAddCurso.tableCursos.listComp[pos]) {
                if (elem != "tableCriterios") {
                    templateDadosAddCurso.tableCursos.listComp[pos][elem] = {"model": {"val": dataSent.model[elem].model.val}};
                }
            }
            templateDadosAddCurso.tableCursos.listComp[pos].tableCriterios = dataSent.tableCriterios.list;
        } else {
            templateDadosAddCurso.tableCursos.list.push({
                "acodigo": dataSent.model.codigoCurso.model.val,
                "bcurso": dataSent.model.curso.model.val,
                "ctipo": auxGeraTextObj(dataSent.model.tipo)[0].text,
                "darea": auxGeraTextObj(dataSent.model.area)[0].text,
                "eturno": auxGeraTextObj(dataSent.model.turno)[0].text,
                "fvagas": dataSent.model.vagasTurma.model.val,
                "gcarga": dataSent.model.cargaHoraria.model.val,
                "hperiodo": auxGeraTextObj(dataSent.model.periodo)[0].text,
                "ibtn": {
                    "btn": true,
                    "list": [
                        {
                            "text": "",
                            "class": "btn btn-white",
                            "title": "Editar",
                            "entypo": "entypo-pencil"
                        }
                    ]
                }
            });
            templateDadosAddCurso.tableCursos.listComp.push({
                "curso": {"model": {"val": dataSent.model.curso.model.val}},
                "codigoCurso": {"model": {"val": dataSent.model.codigoCurso.model.val}},
                "tipo": {"model": {"val": dataSent.model.tipo.model.val}},
                "area": {"model": {"val": dataSent.model.area.model.val}},
                "turno": {"model": {"val": dataSent.model.turno.model.val}},
                "vagasTurma": {"model": {"val": dataSent.model.vagasTurma.model.val}},
                "cargaHoraria": {"model": {"val": dataSent.model.cargaHoraria.model.val}},
                "periodo": {"model": {"val": dataSent.model.periodo.model.val}},
                "habilitacao": {"model": {"val": dataSent.model.habilitacao.model.val}},
                "autorizacao": {"model": {"val": dataSent.model.autorizacao.model.val}},
                "reconhecimento": {"model": {"val": dataSent.model.reconhecimento.model.val}},
                "tableCriterios": dataSent.tableCriterios.list
            });
        }

        res.json({"success": true, "tableCursos": templateDadosAddCurso.tableCursos});
    } else {
        validaDadosAddCurso(dataSent);
        res.json({"success": false, "model": dataSent.model});
    }
}

function descobrePos(list, id) {
    var cont = 0, pos;

    list.forEach(function(el) {
        if (el.acodigo == id) {
            pos = cont;
        }
        cont++;
    });
    return pos
}

function auxFilterCodCurso(obj, id) {

    // todo parou aqui | teste de edição de curso
    return !!obj.list.filter(function(el) {
        return el.acodigo == id
    }).length;
}

function auxGeraTextObj(obj) {
    return obj.list.filter(function(el) {
        return el.id == obj.model.val
    });
}

function postSaveEditConteudo(req, res) {
    var dataSent = req.body;

    extend(true, dadosTablesPauta.tableConteudoAdicionado.list[dataSent.editingPos], dataSent.objConteudoEdit);

    res.json({"success": true, "tableConteudoAdicionado": dadosTablesPauta.tableConteudoAdicionado});
}

function postSaveEnviarCircular(req, res) {
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

function postSaveMaterialComp(req, res) {
    var dataSent = req.body;

    if (verificaDadosMaterialComp(dataSent.model)) {

        /**
         * TOdo request para o backend / dados de enviar circular
         */

        res.json({"success": true, "model": dataSent.model});
    } else {
        validaDadosMaterialComp(dataSent);
        res.json({"success": false, "model": dataSent.model});
    }
}

function postSaveNovoConteudo(req, res) {
    var dataSent = req.body;

    dadosTablesPauta.tableConteudoAdicionado.list.push(dataSent.newContent);

    res.json({"success": true, "tableConteudoAdicionado": dadosTablesPauta.tableConteudoAdicionado, "newContent": dataSent.newContent});
}

function postRemoveConteudo(req, res) {
    var dataSent = req.body;

    dadosTablesPauta.tableConteudoAdicionado.list.splice(dataSent.editingPos, 1);

    res.json({"success": true, "tableConteudoAdicionado": dadosTablesPauta.tableConteudoAdicionado});
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
        !!obj.texto.model.val && (new Date(obj.data.model.val).getTime() > new Date().getTime())
}

function validaDadosEnviarCircular(obj) {
    obj.model.curso.model.err = !!obj.model.curso.model.val ? '' : obj.STR.FIELD;
    obj.model.turma.model.err = !!obj.model.turma.model.val ? '' : obj.STR.FIELD;
    obj.model.disciplina.model.err = !!obj.model.disciplina.model.val ? '' : obj.STR.FIELD;
    obj.model.titulo.model.err = !!obj.model.titulo.model.val ? '' : obj.STR.FIELD;
    obj.model.numero.model.err = !!obj.model.numero.model.val ? '' : obj.STR.FIELD;
    obj.model.texto.model.err = !!obj.model.texto.model.val ? '' : obj.STR.FIELD;

    if (!!obj.model.data.model.val) {
        if ((new Date(obj.model.data.model.val).getTime() > new Date().getTime())) {
            obj.model.data.model.err = '';
        } else {
            obj.model.data.model.err = obj.STR.FUTUREDATE;
        }
    } else {
        obj.model.data.model.err = obj.STR.FIELD;
    }
}

function verificaDadosMaterialComp(obj) {
    return !!obj.curso.model.val && !!obj.turma.model.val &&
        !!obj.disciplina.model.val && !!obj.titulo.model.val &&
        !!obj.numero.model.val && !!obj.data.model.val &&
        !!obj.texto.model.val && (new Date(obj.data.model.val).getTime() > new Date().getTime())
}

function validaDadosMaterialComp(obj) {
    obj.model.curso.model.err = !!obj.model.curso.model.val ? '' : obj.STR.FIELD;
    obj.model.turma.model.err = !!obj.model.turma.model.val ? '' : obj.STR.FIELD;
    obj.model.disciplina.model.err = !!obj.model.disciplina.model.val ? '' : obj.STR.FIELD;
    obj.model.titulo.model.err = !!obj.model.titulo.model.val ? '' : obj.STR.FIELD;
    obj.model.numero.model.err = !!obj.model.numero.model.val ? '' : obj.STR.FIELD;
    obj.model.texto.model.err = !!obj.model.texto.model.val ? '' : obj.STR.FIELD;

    if (!!obj.model.data.model.val) {
        if ((new Date(obj.model.data.model.val).getTime() > new Date().getTime())) {
            obj.model.data.model.err = '';
        } else {
            obj.model.data.model.err = obj.STR.FUTUREDATE;
        }
    } else {
        obj.model.data.model.err = obj.STR.FIELD;
    }
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

function validaDadosAddCurso(obj) {
    obj.model.curso.model.err = !!obj.model.curso.model.val ? "" : obj.STR.FIELD;
    obj.model.tipo.model.err = !!obj.model.tipo.model.val ? "" : obj.STR.FIELD;
    obj.model.area.model.err = !!obj.model.area.model.val ? "" : obj.STR.FIELD;
    obj.model.turno.model.err = !!obj.model.turno.model.val ? "" : obj.STR.FIELD;
    obj.model.vagasTurma.model.err = !!obj.model.vagasTurma.model.val ? "" : obj.STR.FIELD;
    obj.model.cargaHoraria.model.err = !!obj.model.cargaHoraria.model.val ? "" : obj.STR.FIELD;
    obj.model.periodo.model.err = !!obj.model.periodo.model.val ? "" : obj.STR.FIELD;
    obj.model.habilitacao.model.err = !!obj.model.habilitacao.model.val ? "" : obj.STR.FIELD;
    obj.model.autorizacao.model.err = !!obj.model.autorizacao.model.val ? "" : obj.STR.FIELD;
    obj.model.reconhecimento.model.err = !!obj.model.reconhecimento.model.val ? "" : obj.STR.FIELD;
    obj.model.obsAval.model.err = !!obj.tableCriterios.list.length ? "" : obj.STR.FIELD;
}

function verificaDadosAddCurso(obj) {
    return !!obj.model.curso.model.val && !!obj.model.tipo.model.val &&
        !!obj.model.area.model.val && !!obj.model.turno.model.val &&
        !!obj.model.vagasTurma.model.val && !!obj.model.cargaHoraria.model.val &&
        !!obj.model.periodo.model.val && !!obj.model.habilitacao.model.val &&
        !!obj.model.autorizacao.model.val && !!obj.model.reconhecimento.model.val &&
        !!obj.tableCriterios.list.length
}