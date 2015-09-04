(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('pauta', ['$scope', '$resource', 'breadCrumb', '$timeout', function($scope, $resource, breadCrumb, $timeout){

            var vm = this,
                dadosConteudoDadoPautaPromise = $resource('/api/secretaria/dados-conteudo-dado-pauta').get().$promise,
                dadosFreqPautaPromise = $resource('/api/secretaria/dados-freq-pauta').get().$promise,
                dadosNotasPautaPromise = $resource('/api/secretaria/dados-notas-pauta').get().$promise,
                templatePautaPromise = $resource('/api/secretaria/template-pauta').get().$promise;

            breadCrumb.title = 'Pauta';

            // VARIÁVEIS COMUNS
            //controles de dados
            vm._alunos = [
                {id: 1, nome: "João das Couves"},
                {id: 2, nome: "Mariana"},
                {id: 3, nome: "Maria"},
                {id: 4, nome: "Abner"}
            ];
            vm._bkp = {};
            vm._model = {};
            vm._modelAlunos = {
                //CHAVES == ID DO ALUNO
                1: '',
                2: '',
                3: '',
                4: ''
            };
            //visualização na tela
            vm.editingPos = -1;
            vm.verTodos = false;
            //dados para xdGrid
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
                head: ["Data", "Título", "Conteúdo",""],
                list: [
                    {
                        "adata": {
                            date: true,
                            int: new Date().getTime()
                        },
                        "btitulo": "Conteúdo 01",
                        "cconteudo": "Émile Durkheim, Karl Marx e Marx Weber. Citações sobre Auguste Comte e sua importância.",
                        "dbtn": {
                            btn: true,
                            list: [
                                {
                                    click: editCenteudo,
                                    title: 'Editar',
                                    entypo: 'entypo-pencil',
                                    class: 'btn btn-white'
                                },
                                {
                                    click: removeCenteudo,
                                    title: 'Remover',
                                    entypo: 'entypo-cancel',
                                    class: 'btn btn-white'
                                }
                            ]

                        }
                    }
                ]
            };
            vm.tableFreqFixa = {
                /*  Cabeçalho do grid   */
                head: [{text: "", class: "col-sx-1"}, {text: "Aluno", class: "col-md-10"}, {text: "Faltas", class: "col-xs-1"}],
                list: []
            };
            vm.tableFreqDatasComp = {
                /*  Cabeçalho do grid   */
                head: [new Date('08/25/2015').toLocaleString().substr(0,11),new Date('08/26/2015').toLocaleString().substr(0,11),new Date('08/27/2015').toLocaleString().substr(0,11),new Date('08/28/2015').toLocaleString().substr(0,11),new Date('08/29/2015').toLocaleString().substr(0,11),new Date('08/30/2015').toLocaleString().substr(0,11),new Date('08/31/2015').toLocaleString().substr(0,11),new Date('09/01/2015').toLocaleString().substr(0,11)],
                list: []
            };
            vm.tableFreqDatasSimp = {
                /*  Cabeçalho do grid   */
                head: [new Date().toLocaleString().substr(0,11),new Date('08/29/2015').toLocaleString().substr(0,11),new Date('08/30/2015').toLocaleString().substr(0,11)],
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
                head: ["", "Matrícula", "Aluno", "Situação", "Nota1", "Nota2", "Faltas", "Média"],
                list: []
            };

            // VARIÁVEIS TIPO FUNÇÃO
            vm.addFreq = addFreq;
            vm.cancelEditConteudo = cancelEditConteudo;
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
                })
                .catch(function(error) {
                    // TOdo tratar error
                });

            dadosFreqPautaPromise
                .then(function(data) {
                    vm.tableFreqFixa.list = data.tableFreqFixa.list;
                    vm.tableFreqDatasComp.list = data.tableFreqDatasComp.list;
                    vm.tableFreqDatasSimp.list = data.tableFreqDatasSimp.list;
                })
                .catch(function(error) {
                    // TOdo tratar error
                });

            dadosNotasPautaPromise
                .then(function(data) {
                    vm.tableNotas.list = data.list;
                })
                .catch(function(error) {
                    // TOdo tratar error
                });

            dadosConteudoDadoPautaPromise
                .then(function(data) {
                    vm.tableConteudoAdicionado = {

                        /* ID importante se for usar dataTable*/
                        id: 'tableConteudoAdd',
                        /* CLASSES CSS QUE A TABELA IRÁ UTILIZAR*/
                        class: 'table-hover display',

                        /* Se irá sar dataTable*/
                        dataTable: {
                            /*  elementos desabilitados ou habilitados dataTable*/
                            "paging": true,
                            "ordering": false,
                            "info": false,
                            "filter": true,
                            "order": [[0, "desc"]]
                        },

                        /*  Cabeçalho do grid   */
                        head: ["Data", "Título", "Conteúdo", ""],
                        list: [
                            {
                                "adata": {
                                    date: true,
                                    int: new Date().getTime()
                                },
                                "btitulo": "Conteúdo 01",
                                "cconteudo": "Émile Durkheim, Karl Marx e Marx Weber. Citações sobre Auguste Comte e sua importância.",
                                "dbtn": {
                                    btn: true,
                                    list: [
                                        {
                                            click: editCenteudo,
                                            title: 'Editar',
                                            entypo: 'entypo-pencil',
                                            class: 'btn btn-white'
                                        },
                                        {
                                            click: removeCenteudo,
                                            title: 'Remover',
                                            entypo: 'entypo-cancel',
                                            class: 'btn btn-white'
                                        }
                                    ]

                                }
                            }
                        ]

                    };
                })
                .catch(function (error) {
                    //TOdo tratar error
                });

            function addFreq() {
                $('#modalAddFreq').modal({
                    backdrop: 'static',
                    keyboard: false
                })
            }

            function cancelEditConteudo() {
                vm._model = $.extend(true,{},vm._bkp);
            }

            function duplicarFreq(val) {
                //todo duplicar frequência
                if (val) {
                    vm._modelAlunos.bkp = $.extend(true, {}, vm._modelAlunos);
                    for (var i = 0; i < vm._alunos.length; i++) {
                        vm._modelAlunos[vm._alunos[i].id] = i % 2 == 0
                    }
                }else{
                    vm._modelAlunos = $.extend(true, {}, vm._modelAlunos.bkp);
                    vm._modelAlunos.bkp = {};
                }
            }

            function editCenteudo(args,line){
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

            function removeCenteudo(args,line) {
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
                //todo
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
                                click: editCenteudo,
                                title: 'Editar',
                                entypo: 'entypo-pencil',
                                class: 'btn btn-white'
                            },
                            {
                                click: removeCenteudo,
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