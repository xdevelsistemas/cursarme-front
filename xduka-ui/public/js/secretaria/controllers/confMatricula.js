(function(){
    'use strict';


    angular.module('app.controllers')
        .controller('confMatricula', ['$scope', '$resource', '$route', 'breadCrumb', 'lista_cheques', 'tipoTelefone', '$timeout', 'modelStrings',
            function($scope, $resource, $route, breadCrumb, lista_cheques, tipoTelefone, $timeout, modelStrings){

                var vm = this
                    , geraTurmaPromise = $resource('/api/secretaria/dados-gera-turma').get().$promise
                    , secretariaPromise = $resource('/api/secretaria/template-inscricao').get().$promise
                    , viewInscrPromise = $resource('/api/secretaria/view-inscr').get().$promise;

                breadCrumb.title = 'Confirmação de Matrícula';

                // ==== MODELOS ==== //

                vm._model = {};

                // Botões
                vm.confirmEdit = confirmEdit;
                vm.disableAlert = disableAlert;
                vm.disableAtualiza = false;
                vm.editarInscr = editarInscr;
                vm.editing = false;
                vm.lista_cheques = lista_cheques;

                vm.collapseForm = false;
                vm.tableGerarTurma = {};

                //alert sucesso
                vm.sendSuccess = false;

                //Alerta de campos faltando
                vm.showAlert = false;

                vm.STR = modelStrings;

                // valida todos os campos
                vm.validaCpf = false;
                vm.validaSexo = false;

                // valida cep
                vm.validaCep = false;
                vm.validaCepAvRua = false;
                vm.validaCepBairro = false;
                vm.validaCepCidade = false;
                vm.validaCepEndUf = false;

                // temporarias de dados
                vm.tempItem = {}; /* Guarda um obj para confirmar a edição em caso de uma edição quando um cadastro já está sendo editado */

                // ==== REQUISIÇÕES ==== //

                secretariaPromise
                    .then(function(data){
                        vm._model = data;
                    })
                    .catch(function(erro){
                        console.log("\n" + erro.data + "\n");
                    });

                viewInscrPromise
                    .then(function (data2) {
                        vm._viewInscr = data2;

                        for (var i = 0; i < data2.list.length; i++) {
                            for (var j = 0; j < data2.list[i].listaCheques.length; j++) {
                                vm._viewInscr.list[i].listaCheques[j].data = new Date(data2.list[i].listaCheques[j].data);
                            }
                        }

                        vm._viewInscr.naoEhComercial = true;
                    })
                    .catch(function (erro) {
                        console.log("\n" + erro.data + "\n");
                    });

                geraTurmaPromise
                    .then(function (data) {
                        var list = [],
                            turma = {};
                        vm._geraTurma = data;

                        for (var i = 0; i < data.list.length; i++) {
                            turma = {
                                "ainput": data.list[i].acao,
                                "bprogress": {
                                    "maxVal": data.list[i].area.turma.vagas.totais,
                                    "minVal": data.list[i].area.turma.vagas.minima,
                                    "percent": (data.list[i].area.turma.vagas.preenchidas*100)/data.list[i].area.turma.vagas.totais,
                                    "text": data.list[i].area.turma.vagas.preenchidas + '/' + data.list[i].area.turma.vagas.totais,
                                    "progress": true
                                },
                                "ctext": data.list[i].area.turma.text,
                                "ddata": {
                                    date: true,
                                    int: data.list[i].area.turma.dataInicio
                                },
                                "dtext": data.list[i].area.text
                            };
                            turma.ainput.model.val = data.list[i].area.turma.vagas.totais == data.list[i].area.turma.vagas.preenchidas;

                            list.push(turma);
                        }
                        vm.tableGerarTurma.list = list;
                    })
                    .catch(function (erro) {
                        console.log(erro);
                    });

                vm.getDadosCep = function(cep) {
                    if (cep.length == 8) {
                        var getCepPromise = $resource('/api/comercial/dados-cep/:cep').get({"cep": cep}).$promise;

                        getCepPromise
                            .then(function (data) {
                                if (data.erro) {
                                    vm.validaCep = data.erro;
                                    vm.validaCepAvRua = data.erro;
                                    vm.validaCepBairro = data.erro;
                                    vm.validaCepCidade = data.erro;
                                    vm.validaCepEndUf = data.erro;

                                    vm._model.cep.model.err = vm.STR.NOCEPFOUND;
                                    vm._model.avRua.model.val = '';
                                    vm._model.bairro.model.val = '';
                                    vm._model.cidade.model.val = '';
                                    vm._model.endUf.model.val = '';
                                } else {
                                    vm.validaCep = false;
                                    vm._model.avRua.model.val = data.logradouro.length <= 1 ? '' : data.logradouro;
                                    vm._model.bairro.model.val = data.bairro;
                                    vm._model.cidade.model.val = data.localidade;
                                    vm._model.endUf.model.val = "UF_" + data.uf;
                                    vm._model.cep.model.err = '';

                                    vm.validaCepAvRua = data.logradouro.length <= 1;
                                    vm.validaCepBairro = !data.bairro;
                                    vm.validaCepCidade = !data.localidade;
                                    vm.validaCepEndUf = !data.uf;
                                }
                            })
                            .catch(function (erro) {
                                if (erro.status == '400') {
                                    console.log(erro)
                                }
                            });
                    }
                };

                vm.atualizaPartial = function(time) {
                    $timeout(function () {
                        $route.reload();
                    }, time); // delay to reload page.
                };

                vm.condTable = {
                    boolean: function(elem){
                        return typeof(elem) == 'boolean'
                    },
                    checkbox: function(elem){
                        return elem == 'checkbox'
                    },
                    editFunc: function(){
                        vm.disableLimpar = true;
                    },
                    editInscr: vm.editarInscr,

                    verificaEdit: verificaEdit
                };

                function verificaEdit(){
                    return true
                }

                vm.selectPhoneType = function (item, model) {
                    vm._model.telefone.mask = tipoTelefone.getMaskPhone(model);
                };


                function editarInscr(item){
                    if (!vm.editing) {
                        vm.editing = true;
                        vm.showAlert = true;
                        vm.disableLimpar = true;
                        vm.validaCpf = true;
                        $.extend(true, vm._model, item);
                        vm.collapseForm = true;
                        vm.selectCursoArea = true;
                        vm.selectCursoCurso = true;
                        vm.selectCursoVagas = true;

                        var getUnidadePromise = $resource('/api/secretaria/dados-curso').get().$promise;

                        getUnidadePromise
                            .then(function (data) {
                                vm.selectPhoneType({}, vm._model.tipoTelefone.model.val);
                                vm._model.unidade.list = data.unidade.list;
                                vm._model.tipoCurso.list = $.grep(vm._model.unidade.list, function (e) {
                                    return e.id == item.unidade.model.val;
                                })[0].tipoCursos;
                                vm._model.area.list = $.grep(vm._model.tipoCurso.list, function (e) {
                                    return e.id == item.tipoCurso.model.val;
                                })[0].areas;
                                vm._model.curso.list = $.grep(vm._model.area.list, function (e) {
                                    return e.id == item.area.model.val;
                                })[0].curso;
                            })
                            .catch(function (erro) {
                                console.log(erro);
                            });

                        vm.btnAddChequeStep1 = item.formaPagamentoInscr.model.val == 2;
                        vm.btnAddChequeStep2 = item.formaPagamentoPag.model.val == 2;
                        lista_cheques.addAll(item.listaCheques);
                    }else{
                        $('#confirmEdit').modal('show');
                        vm.tempItem = item;
                        /*if(window.confirm('Há um cadastro atual em edição/cadastro, deseja ignorá-lo?')){
                         vm.editing = false;
                         vm.disableBtn();
                         vm.limpaForm();
                         $('#cursorSetp0').click()
                         }else{
                         vm.disableBtn();
                         }*/
                    }
                }

                function confirmEdit(itemBkp){
                    vm.limpaForm();
                    vm.editarInscr(itemBkp);
                }

                vm.limpaForm = function(){

                    vm.limpaFormStep4();

                    // limpando cheques adicionados
                    lista_cheques.clean();

                    vm.editing = false;
                    vm.showAlert = false;

                    vm.topCollapse();
                };
                vm.limpaFormStep4 = function() {

                    vm._model.dataExp.model.val = '';
                    vm._model.dataExp.model.err = '';
                    vm._model.orgaoEmissor.model.val = '';
                    vm._model.orgaoEmissor.model.err = '';
                    vm._model.tituloEleitor.model.val = '';
                    vm._model.tituloEleitor.model.err = '';
                    vm._model.zona.model.val = '';
                    vm._model.zona.model.err = '';
                    vm._model.secao.model.val = '';
                    vm._model.secao.model.err = '';
                    vm._model.ufTitulo.model.val = '';
                    vm._model.ufTitulo.model.err = '';
                    vm._model.certidaoNc.model.val = '';
                    vm._model.certidaoNc.model.err = '';
                    vm._model.folha.model.val = '';
                    vm._model.folha.model.err = '';
                    vm._model.livro.model.val = '';
                    vm._model.livro.model.err = '';
                    vm._model.cartorio.model.val = '';
                    vm._model.cartorio.model.err = '';
                    vm._model.certificadoRes.model.val = '';
                    vm._model.certificadoRes.model.err = '';
                    vm._model.registro.model.val = '';
                    vm._model.registro.model.err = '';
                    vm._model.ufReservista.model.val = '';
                    vm._model.ufReservista.model.err = '';
                    vm._model.categoria.model.val = '';
                    vm._model.categoria.model.err = '';
                    vm._model.sexo.model.val = '';
                    vm._model.sexo.model.err = '';
                    vm._model.dataNasc.model.val = '';
                    vm._model.dataNasc.model.err = '';
                    vm._model.raca.model.val = '';
                    vm._model.raca.model.err = '';
                    vm._model.estadoCivil.model.val = '';
                    vm._model.estadoCivil.model.err = '';
                    vm._model.pai.model.val = '';
                    vm._model.pai.model.err = '';
                    vm._model.mae.model.val = '';
                    vm._model.mae.model.err = '';
                    vm._model.avRua.model.val = '';
                    vm._model.avRua.model.err = '';
                    vm._model.endNum.model.val = '';
                    vm._model.endNum.model.err = '';
                    vm._model.complemento.model.val = '';
                    vm._model.complemento.model.err = '';
                    vm._model.bairro.model.val = '';
                    vm._model.bairro.model.err = '';
                    vm._model.endUf.model.val = '';
                    vm._model.endUf.model.err = '';
                    vm._model.nacionalidade.model.val = '';
                    vm._model.nacionalidade.model.err = '';
                    vm._model.naturalidade.model.val = '';
                    vm._model.naturalidade.model.err = '';
                    vm._model.natUf.model.val = '';
                    vm._model.natUf.model.err = '';
                    vm._model.escolaEm.model.val = '';
                    vm._model.escolaEm.model.err = '';
                    vm._model.anoEm.model.val = '';
                    vm._model.anoEm.model.err = '';
                    vm._model.cursoGrad.model.val = '';
                    vm._model.cursoGrad.model.err = '';
                    vm._model.anoGrad.model.val = '';
                    vm._model.anoGrad.model.err = '';
                    vm._model.instituicao.model.val = '';
                    vm._model.instituicao.model.err = '';
                };

                vm.disableAlert = function(){
                    vm.showAlert = false;
                };

                vm.cancelEdit = function(){
                    vm.limpaForm();
                    vm.disableLimpar = false;
                    vm.editing = false;
                    vm.topCollapse();

                };

                vm.verificaSexo = function(item, model) {
                    vm.validaSexo = model == 'f';
                };

                vm.topCollapse = function(){
                    $('html, body').animate({scrollTop: 0},'slow');
                };

                vm.tableGerarTurma = {
                    /* ID importante se for usar dataTable*/
                    id: 'tableGerarTurma',
                    /* CLASSES CSS QUE A TABELA IRÁ UTILIZAR*/
                    class: 'table-hover display',

                    /* Se irá sar dataTable*/
                    dataTable: {
                        /*  elementos desabilitados ou habilitados dataTable*/
                        "paging":   false,
                        "ordering": true,
                        "info":     false,
                        "filter":   false,
                        "order": [[ 1, "desc" ]]
                    },

                    /*  Cabeçalho do grid   */
                    head: ["", "Vagas", "Turma", "Data de início", "Área"]
                };

                vm.sendTurmas = function() {
                    var sendTurmasPromise = $resource('/api/secretaria/send-turmas').save(
                        {},
                        $.extend(true, vm._geraTurma, vm.tableGerarTurma)
                    ).$promise;

                    sendTurmasPromise
                        .then(function (data) {
                            vm._geraTurma = data;
                        })
                        .catch(function(erro) {
                            console.log(erro);
                        });
                };

                function disableAlert(){
                    vm.showAlert = false;
                }

                vm.gerarPdfContrato = gerarPdfContrato;
                function gerarPdfContrato(item) {

                    console.log(item);

                    var template = 'contrato-aluno';
                    var data = 8;
                    var id = 1;
                    window.open('/report?templateContent='+template+'&data='+data+'&id='+id ,'_blank');
                }

            }])
})();
