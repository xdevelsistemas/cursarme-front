(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('pauta', ['$scope', '$resource', 'breadCrumb', '$timeout', function($scope, $resource, breadCrumb, $timeout){

            var vm = this,
                dadosCursoPautaPromise = $resource('/api/secretaria/dados-curso-pauta').get().$promise,
                templatePautaPromise = $resource('/api/secretaria/template-pauta').get().$promise;

            breadCrumb.title = 'Pauta';

            // VARIÁVEIS COMUNS
            //
            vm._alunos = [];//["João das Couves","Mariana","Maria","Abner"];
            vm._bkp = {};
            vm._model = {};
            vm._modelAlunos = {};
            //
            vm.disableDisciplina = true;
            vm.disableTables = false;
            vm.disableTurma = true;
            //
            vm.editingPos = -1;
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
                /* ID importante se for usar dataTable*/
                id: 'tableNotas',
                /* CLASSES CSS QUE A TABELA IRÁ UTILIZAR*/
                class: 'table-hover display',
                /* Se irá sar dataTable*/
                dataTable: {
                    /*  elementos desabilitados ou habilitados dataTable*/
                    "paging":   true,
                    "ordering": true,
                    "info":     true,
                    "filter":   true,
                    "order": [[ 0, "asc" ]]
                },
                /*  Cabeçalho do grid   */
                head: [],
                list: []
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
                    vm._model.addData.model.val = new Date();
                    vm._model.addConteudoData.model.val = new Date();

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
                vm._model.addConteudoData.model.val = vm._model.addData.model.val.toLocaleString().substr(0,11);
                $('#modalAddFreq').modal({
                    backdrop: 'static',
                    keyboard: false
                })
            }

            function cancelEditConteudo() {
                vm._model = $.extend(true,{},vm._bkp);
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
                        // vm._aluno
                        data.tableFreqFixa.list.forEach(function(obj) {
                            vm._alunos.push(obj.baluno);
                        });
                        //
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
                        //
                        // Tabela de Conteúdos Aplicados
                        vm.tableConteudoAdicionado.list = data.tableConteudoAdicionado.list;
                        vm.tableConteudoAdicionado.head = data.tableConteudoAdicionado.head;

                        for (var i = 0; i < vm.tableConteudoAdicionado.list.length; i++) {
                            vm.tableConteudoAdicionado.list[i].adata = {
                                date: true,
                                int: new Date().getTime()
                            };
                            vm.tableConteudoAdicionado.list[i].dbtn = {
                                btn: true,
                                list: [
                                    {
                                        click: editConteudo,
                                        title: 'Editar',
                                        entypo: 'entypo-pencil',
                                        class: 'btn btn-white'
                                    },
                                    {
                                        click: removeConteudo,
                                        title: 'Remover',
                                        entypo: 'entypo-cancel',
                                        class: 'btn btn-white'
                                    }
                                ]
                            }
                        }
                    })
                    .catch(function(error) {
                        // TOdo tratar error
                    });

                $("#notas").addClass("active");

                vm.disableTables = true;
            }

            function duplicarFreq(val) { // Duplica de acordo com o primeiro da lista simplificada
                var aluno, i, lstKeys;
                if(val){
                    for (aluno in vm._alunos){
                        for (i in vm.tableFreqDatasSimp.list){
                            lstKeys = Object.keys(vm.tableFreqDatasSimp.list[i]);
                            vm._modelAlunos[vm._alunos[aluno]] = vm.tableFreqDatasSimp.list[i][lstKeys[0]];
                        }
                    }
                }else{
                    for (aluno in vm._alunos){
                        for (i in vm.tableFreqDatasSimp.list){
                            lstKeys = Object.keys(vm.tableFreqDatasSimp.list[i]);
                            vm._modelAlunos[vm._alunos[aluno]] = '';
                        }
                    }
                }
            }

            function editConteudo(args,line){
                // TOdo resource para save das dados
                vm._bkp = $.extend(true,{},vm._model);
                vm._model.addConteudoData.model.val = new Date(line.adata.int);
                vm._model.addConteudoTitulo.model.val = line.btitulo;
                vm._model.addConteudoTArea.model.val = line.cconteudo;
                vm.editingPos = vm.tableConteudoAdicionado.list.indexOf(line);
                $('#modalEditConteudo').modal({
                    backdrop: 'static',
                    keyboard: true
                });
            }

            function removeConteudo(args,line) {
                vm.tableConteudoAdicionado.list.splice(vm.tableConteudoAdicionado.list.indexOf(line),1);
                //vm.tableConteudoAdicionado.list.splice(pos,1)
            }

            function saveEditConteudo() {
                vm.tableConteudoAdicionado.list[vm.editingPos].adata.int = vm._model.addConteudoData.model.val.getTime();
                vm.tableConteudoAdicionado.list[vm.editingPos].btitulo = vm._model.addConteudoTitulo.model.val;
                vm.tableConteudoAdicionado.list[vm.editingPos].cconteudo = vm._model.addConteudoTArea.model.val;
                vm.cancelEditConteudo();
                $('#modalEditConteudo').modal('toggle');
            }

            function saveFreq() {
                // TOdo save dos dados de frequencia / `chamada`
                console.log(vm._modelAlunos);
            }

            function saveNewConteudo() {
                var newContent = {
                    adata: {
                        date: true
                    },
                    btitulo: '',
                    cconteudo: '',
                    "dbtn": {
                        btn: true,
                        list: [
                            {
                                click: editConteudo,
                                title: 'Editar',
                                entypo: 'entypo-pencil',
                                class: 'btn btn-white'
                            },
                            {
                                click: removeConteudo,
                                title: 'Remover',
                                entypo: 'entypo-cancel',
                                class: 'btn btn-white'
                            }
                        ]

                    }
                };
                newContent.adata.int = vm._model.addConteudoData.model.val.getTime();
                newContent.btitulo = vm._model.addConteudoTitulo.model.val;
                newContent.cconteudo = vm._model.addConteudoTArea.model.val;

                vm.tableConteudoAdicionado.list.push(newContent);

                //Clear form
                vm._model.addConteudoData.model.val = '';
                vm._model.addConteudoTitulo.model.val = '';
                vm._model.addConteudoTArea.model.val = '';

            }

            function visualizarFreq() {
                vm.verTodos = !vm.verTodos;
            }
        }])
})();