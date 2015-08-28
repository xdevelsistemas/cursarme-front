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
            vm._bkp = {};
            vm._model = {};

            vm.editingPos = -1;
            vm.rodapeFreq = {
                "anum": "",
                "baluno": "",
                "cfaltas": "",
                "d01042015": {
                    input: true,
                    label: ' ',
                    type: 'radio',
                    name: 'duplicar',
                    model: {val: ''}
                },
                "d01052015": {
                    input: true,
                    label: ' ',
                    type: 'radio',
                    name: 'duplicar',
                    model: {val: ''}
                }
            };
            vm.tableFreq = {
                /* ID importante se for usar dataTable*/
                id: 'tableFreq',

                /* Se irá sar dataTable*/
                dataTable: {
                    /*  elementos desabilitados ou habilitados dataTable*/
                    "paging":   true,
                    "ordering": false,
                    "info":     true,
                    "filter":   true,
                    "order": [[ 0, "asc" ]]
                },
                /* CLASSES CSS QUE A TABELA IRÁ UTILIZAR*/
                class: 'table table-hover',

                /*  Cabeçalho do grid   */
                head: ["", "Aluno", "Faltas", "01/04/2015", "05/04/2015", "08/04/2015", "12/04/2015", "13/04/2015", "14/04/2015", "15/04/2015"],
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
            vm.cancelEditConteudo = cancelEditConteudo;
            vm.saveEditConteudo = saveEditConteudo;
            vm.saveNewConteudo = saveNewConteudo;

            // REQUISIÇÕES
            templatePautaPromise
                .then(function(data) {
                    vm._model = data.template;
                })
                .catch(function(error) {

                });

            dadosFreqPautaPromise
                .then(function(data) {
                    vm.tableFreq.list = data.list;

                    atualizaRodapeFreq();
                    vm.tableFreq.list.push(vm.rodapeFreq);
                })
                .catch(function(error) {

                });

            dadosNotasPautaPromise
                .then(function(data) {
                    vm.tableNotas.list = data.list;
                })
                .catch(function(error) {

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

            function atualizaRodapeFreq() {
                var lkey;
                for (lkey in vm.tableFreq.list[0]) {
                    if (lkey == "anum" || lkey == "baluno" || lkey == "cfaltas") {
                        vm.rodapeFreq[lkey] = ""
                    }else{
                        vm.rodapeFreq[lkey] = {
                            input: true,
                            label: ' ',
                            type: 'radio',
                            name: 'duplicar',
                            model: {val: ''}
                        }
                    }
                }
            }

            function cancelEditConteudo() {
                vm._model = $.extend(true,{},vm._bkp);
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
                vm._model = $.extend(true,{},vm._bkp);
                $('#modalEditConteudo').modal('toggle');
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
        }])
})();