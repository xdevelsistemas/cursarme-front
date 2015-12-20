(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('pauta', ['$scope', '$resource', 'breadCrumb', '$timeout','dataUser','modelStrings', '$location', 'defineUnidade',
            function($scope, $resource, breadCrumb, $timeout, dataUser, modelStrings, $location, defineUnidade){

            var vm = this,
                dadosCursoPautaPromise = $resource('/api/secretaria/dados-curso-pauta/:id').get({"id": defineUnidade.getIdUnidade()}).$promise,
                templatePautaPromise = $resource('/api/secretaria/template-pauta').get().$promise;


            vm.STR = modelStrings;
            breadCrumb.title = vm.STR.PAUTA;

            // VARIÁVEIS COMUNS
            //controles de dados
            vm._alunos = [];
            vm._model = {};
            vm._modelAlunos = {};
            //visualização na tela
            vm.disableDisciplina = true;
            vm.disableTables = false;
            vm.disableTurma = true;
            //
            vm.editingPos = -1;
            vm.ultimaFreq = [];
            vm.verTodos = false;
            // xd-grid
            vm.tableConteudoAdicionado = {
                /* ID importante se for usar dataTable*/
                id: 'tableConteudoAdd',
                /* CLASSES CSS QUE A TABELA IRÁ UTILIZAR*/
                class: 'table-hover display',
                /* Se irá sar dataTable*/
                dataTable: {
                    /*  elementos desabilitados ou habilitados dataTable*/
                    "paging":   true,
                    "ordering": false,
                    "info":     false,
                    "filter":   true,
                    "order": [[ 0, "desc" ]]
                },
                /*  Cabeçalho do grid   */
                head: [],
                list: []
            };
            vm.tableFreqFixa = {
                /*  Cabeçalho do grid   */
                head: [],
                list: []
            };
            vm.tableFreqDatasComp = {
                /*  Cabeçalho do grid   */
                head: [],
                list: []
            };
            vm.tableFreqDatasSimp = {
                /*  Cabeçalho do grid   */
                head: [],
                list: []
            };
            vm.tableNotas = {
                id: 'tableNotas'

            };

            // VARIÁVEIS TIPO FUNÇÃO
            vm.addFreq = addFreq;
            vm.cancelEditConteudo = cancelEditConteudo;
            vm.changeCurso = changeCurso;
            vm.changeTurma = changeTurma;
            vm.changeDisciplina = changeDisciplina;
            vm.duplicarFreq = duplicarFreq;
            vm.saveEditConteudo = saveEditConteudo;
            vm.saveFreq = saveFreq;
            vm.saveNewConteudo = saveNewConteudo;
            vm.visualizarFreq = visualizarFreq;

            // REQUISIÇÕES
            templatePautaPromise
                .then(function(data) {
                    vm._model = data.template;
                    vm._model.professor.model.val = dataUser.getNameUser();
                    vm._model.addData.model.val = new Date();

                    //
                    dadosCursoPautaPromise
                        .then(function(data) {
                            vm._model.curso.list = data.list;
                        })
                        .catch(function(error) {
                            // TOdo tratar error
                        });
                })
                .catch(function(error) {
                    // TOdo tratar error
                });

            function geraDataTxt(list) {
                var listDate = [];

                list.forEach(function(el){listDate.push(new Date(el).toLocaleDateString());});

                return listDate
            }

            function addFreq() {
                if (!!vm._model.addAulas.model.val && !!vm._model.addData.model.val) {
                    vm._model.addAulas.model.err = "";
                    vm._model.addData.model.err = "";
                    vm._model.addConteudoData.model.val = vm._model.addData.model.val;
                    //
                    // Open-modal
                    $('#modalAddFreq').modal({
                        backdrop: 'static',
                        keyboard: false
                    });
                } else {
                    vm._model.addAulas.model.err = !!vm._model.addAulas.model.val ? "" : vm.STR.FIELD;
                    vm._model.addData.model.err = !!vm._model.addAulas.model.val ? "" : vm.STR.FIELD;
                }
            }

            function cancelEditConteudo() {
                vm._model.addConteudoData.model.val = "";
                vm._model.addConteudoTitulo.model.val = "";
                vm._model.addConteudoTArea.model.val = "";
            }

            function changeCurso(item, model) {
                vm._model.turma.list = [];
                vm._model.turma.model.val = "";
                vm._model.disciplina.list = [];
                vm._model.disciplina.model.val = "";

                vm.disableTurma = false;
                vm.disableDisciplina = true;
                vm.disableTables = false;

                vm._model.turma.list = item.turmas;
            }

            function changeTurma(item, model) {
                vm._model.disciplina.list = [];
                vm._model.disciplina.model.val = "";

                vm.disableDisciplina = false;
                vm.disableTables = false;

                vm._model.disciplina.list = item.disciplinas;
            }

            function changeDisciplina(item, model) {
                var dadosPautaPromise = $resource('/api/secretaria/dados-pauta/:id').get({"id": model}).$promise;

                dadosPautaPromise
                    .then(function(data) {
                        // Tabela de Frequência
                        vm.tableFreqFixa.list = data.tableFreqFixa.list;
                        vm.tableFreqFixa.head = data.tableFreqFixa.head;
                        //
                        vm.tableFreqDatasComp.list = data.tableFreqDatasComp.list;
                        vm.tableFreqDatasComp.head = geraDataTxt(data.tableFreqDatasComp.head);
                        //
                        vm.tableFreqDatasSimp.list = data.tableFreqDatasSimp.list;
                        vm.tableFreqDatasSimp.head = geraDataTxt(data.tableFreqDatasSimp.head);
                        //
                        // Tabelas de Notas
                        vm.tableNotas.list = data.tableNotas.list;
                        vm.tableNotas.head = data.tableNotas.head;

                        for(var cont = 0; cont < vm.tableNotas.list.length; cont++){
                            vm.tableNotas.list[cont].bmat.list[0].click = moreAlunoTable;
                        }

                        // vm._aluno
                        vm._alunos = data._alunos;
                        //
                        // vm.ultimaFreq
                        vm.ultimaFreq = data.duplicaFreq;
                        //
                        // Tabela de Conteúdos Aplicados
                        vm.tableConteudoAdicionado.list = data.tableConteudoAdicionado.list;
                        vm.tableConteudoAdicionado.head = data.tableConteudoAdicionado.head;

                        for (var i = 0; i < vm.tableConteudoAdicionado.list.length; i++) {
                            vm.tableConteudoAdicionado.list[i].dbtn.list[0].click = editConteudo;
                            vm.tableConteudoAdicionado.list[i].dbtn.list[1].click = removeConteudo;
                        }
                    })
                    .catch(function(error) {
                        // TOdo tratar error
                    });

                //$("#notas").addClass("active");

                vm.disableTables = true;
            }

            function duplicarFreq(val) {
                //todo duplicar frequência
                if (val) {
                    vm._modelAlunos.bkp = $.extend(true, {}, vm._modelAlunos);
                    for (var i = 0; i < vm._alunos.length; i++) {
                        vm._modelAlunos[vm._alunos[i].id] = vm.ultimaFreq.filter(function(elem) {return elem.id == vm._alunos[i].id})[0].freq;
                    }
                }else{
                    vm._modelAlunos = $.extend(true, {}, vm._modelAlunos.bkp);
                    vm._modelAlunos.bkp = {};
                }
            }

            function editConteudo(args,line){
                // TOdo resource para save das dados
                vm._model.addConteudoData.model.val = new Date(line.adata.int);
                vm._model.addConteudoTitulo.model.val = line.btitulo;
                vm._model.addConteudoTArea.model.val = line.cconteudo;
                vm.editingPos = vm.tableConteudoAdicionado.list.indexOf(line);
                $('#modalEditConteudo').modal({
                    backdrop: 'static',
                    keyboard: true
                });
            }

            function moreAlunoTable(args, line){
                var route = '/secretaria/aluno/'+line.bmat.list[0].text;
                $location.path(route);
            }

            function removeConteudo(args,line) {
                vm.editingPos = vm.tableConteudoAdicionado.list.indexOf(line);
                var removeConteudoPromise = $resource('/api/secretaria/remove-conteudo').save({}, {
                    "conteudo": line, "editingPos": vm.editingPos
                }).$promise;

                removeConteudoPromise
                    .then(function(data) {
                        vm.tableConteudoAdicionado = data.tableConteudoAdicionado;
                    })
                    .catch(function(error) {
                        // TOdo tratar error
                    });
            }

            function saveEditConteudo() {
                var objConteudoEdit = {
                    "adata": {"int": new Date(vm._model.addConteudoData.model.val).getTime()},
                    "btitulo": vm._model.addConteudoTitulo.model.val,
                    "cconteudo": vm._model.addConteudoTArea.model.val
                };
                var saveEditConteudoPromise = $resource('/api/secretaria/save-edit-conteudo').save({}, {
                    "editingPos": vm.editingPos, "objConteudoEdit": objConteudoEdit
                }).$promise;

                saveEditConteudoPromise
                    .then(function(data) {
                        $.extend(true, vm.tableConteudoAdicionado, data.tableConteudoAdicionado);
                    })
                    .catch(function(error) {
                        // TOdo tratar error
                    });
                vm.cancelEditConteudo();
                $('#modalEditConteudo').modal('toggle');
            }

            function saveFreq() {
                var saveFreqPromise = $resource('/api/secretaria/save-frequencia-alunos').save({}, {
                    "model": vm._model,
                    "STR": vm.STR,
                    "freqAlunos": vm._modelAlunos
                }).$promise;

                saveFreqPromise
                    .then(function(data) {
                        if (data.success) {
                            //
                            $.extend(true, vm._model, data.table.model);
                            //
                            vm._alunos = data.table._alunos;
                            vm.ultimaFreq = data.table.duplicaFreq;
                            //
                            vm.tableNotas = data.table.tableNotas;
                            vm.tableFreqFixa = data.table.tableFreqFixa;
                            vm.tableFreqDatasComp = data.table.tableFreqDatasComp;
                            vm.tableFreqDatasSimp = data.table.tableFreqDatasSimp;

                            vm.tableConteudoAdicionado = data.table.tableConteudoAdicionado;
                            vm.tableConteudoAdicionado.list[vm.tableConteudoAdicionado.list.length-1].dbtn.list[0].click = editConteudo;
                            vm.tableConteudoAdicionado.list[vm.tableConteudoAdicionado.list.length-1].dbtn.list[1].click = removeConteudo;

                            //
                            vm.tableFreqDatasComp.head = geraDataTxt(data.table.tableFreqDatasComp.head);
                            vm.tableFreqDatasSimp.head = geraDataTxt(data.table.tableFreqDatasSimp.head);
                            //
                            $('#modalAddFreq').modal('toggle');
                            //
                            limpaCamposModalFreq();

                        } else {
                            $.extend(true, vm._model, data.model);
                        }
                    })
                    .catch(function(error) {
                        // TOdo tratar error
                    });
            }

            function saveNewConteudo() {
                var newContent = {
                    "adata": {
                        date: true
                    },
                    "btitulo": '',
                    "cconteudo": '',
                    "dbtn": {
                        btn: true,
                        list: [
                            {
                                title: 'Editar',
                                entypo: 'entypo-pencil',
                                class: 'btn btn-white'
                            },
                            {
                                title: 'Remover',
                                entypo: 'entypo-cancel',
                                class: 'btn btn-white'
                            }
                        ]

                    }
                };
                newContent.adata.int = new Date(vm._model.addConteudoData.model.val).getTime();
                newContent.btitulo = vm._model.addConteudoTitulo.model.val;
                newContent.cconteudo = vm._model.addConteudoTArea.model.val;

                var novoConteudoPromise = $resource('/api/secretaria/save-novo-conteudo').save({}, {"newContent": newContent}).$promise;

                novoConteudoPromise
                    .then(function(data) {
                        vm.tableConteudoAdicionado = data.tableConteudoAdicionado;
                        vm.tableConteudoAdicionado.list[vm.tableConteudoAdicionado.list.length-1].dbtn.list[0].click = editConteudo;
                        vm.tableConteudoAdicionado.list[vm.tableConteudoAdicionado.list.length-1].dbtn.list[1].click = removeConteudo;
                    })
                    .catch(function(error) {
                        // TOdo tratar error
                    });

                //Clear form
                cancelEditConteudo();
            }

            function visualizarFreq() {
                vm.verTodos = !vm.verTodos;
            }

            function limpaCamposModalFreq() {
                //
                vm._model.addAulas.model.val = "";
                vm._model.addData.model.val = "";
                // Frequência
                vm._modelAlunos = {};
                //
                cancelEditConteudo();
            }
        }])
})();