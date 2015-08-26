(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('pauta', ['$scope', '$resource', 'breadCrumb', '$timeout', function($scope, $resource, breadCrumb, $timeout){

            var vm = this;

            breadCrumb.title = 'Pauta';

            vm._bkp = {};
            vm._model = {

                "professor": {
                    "label": "Professor",
                    "type": "select",
                    "name": "prof",
                    "placeholder": "Selecione uma opção",
                    "list": [
                    ],
                    "model": {"val": "", "err": ""}
                },
                "curso": {
                    "label": "Curso",
                    "type": "select",
                    "name": "curso",
                    "placeholder": "Selecione uma opção",
                    "list": [
                        {
                            "id": "1",
                            "text": "Curso 1"
                        }
                    ],
                    "model": {"val": "", "err": ""}
                },
                "turma": {
                    "label": "Turma",
                    "type": "select",
                    "name": "turma",
                    "placeholder": "Selecione uma opção",
                    "list": [
                    ],
                    "model": {"val": "", "err": ""}
                },
                "disciplina": {
                    "label": "Professor",
                    "type": "select",
                    "name": "prof",
                    "placeholder": "Selecione uma opção",
                    "list": [
                    ],
                    "model": {"val": "", "err": ""}
                },
                "addData": {
                    "label": "",
                    "type": "text",
                    "model": {"val": "", "err": ""},
                    "name": "addData",
                    "format": "dd/MM/yyyy"
                },
                "addConteudoTitulo": {
                    "label": "Título",
                    "type": "text",
                    "name": "titulo",
                    "model": {"val": "", "err": ""}
                },
                "addConteudoData": {
                    "label": "Data",
                    "type": "text",
                    "model": {"val": "", "err": ""},
                    "name": "addConteudoData",
                    "format": "dd/MM/yyyy"
                },
                "addConteudoTArea": {
                    "label": "",
                    "type": "textarea",
                    "name": "addConteudoTArea",
                    "rows": 7,
                    "model": {"val": "", "err": ""}
                }

            };
            vm.cancelEditConteudo = cancelEditConteudo;
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
            vm.saveEditConteudo = saveEditConteudo;
            vm.saveNewConteudo = saveNewConteudo;
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
                list: [
                    {
                        "anum": "1",
                        "baluno": "João das Couves",
                        "cfaltas": "1",
                        "d01042015": "P",
                        "d01052015": "P",
                        "d08052015": "P",
                        "d12052015": "F",
                        "d13052015": "F",
                        "d14052015": "F",
                        "d15052015": "F"
                    },
                    {
                        "anum": "2",
                        "baluno": "Mariana",
                        "cfaltas": "1",
                        "d01042015": "F",
                        "d01052015": "P",
                        "d08052015": "P",
                        "d12052015": "P",
                        "d13052015": "F",
                        "d14052015": "F",
                        "d15052015": "F"
                    },
                    {
                        "anum": "3",
                        "baluno": "Maria",
                        "cfaltas": "1",
                        "d01042015": "F",
                        "d01052015": "P",
                        "d08052015": "P",
                        "d12052015": "P",
                        "d13052015": "F",
                        "d14052015": "F",
                        "d15052015": "F"
                    },
                    {
                        "anum": "4",
                        "baluno": "Abner",
                        "cfaltas": "0",
                        "d01042015": "P",
                        "d01052015": "P",
                        "d08052015": "P",
                        "d12052015": "P",
                        "d13052015": "F",
                        "d14052015": "F",
                        "d15052015": "F"
                    }
                ]
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
                list: [
                    {
                        "anum": "1",
                        "bmat": "2014BSI123",
                        "caluno": "João das Couves",
                        "dsit": "Normal",
                        "enotaUm": "7.5",
                        "fnotaDois": "",
                        "gfaltas": "3",
                        "hmedia": (7.5/2).toString()
                    },
                    {
                        "anum": "2",
                        "bmat": "2014BSI321",
                        "caluno": "Mariana",
                        "dsit": "Normal",
                        "enotaUm": "5.3",
                        "fnotaDois": "",
                        "gfaltas": "0",
                        "hmedia": (5.3/2).toString()
                    }
                ]
            };

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
            atualizaRodapeFreq();
            vm.tableFreq.list.push(vm.rodapeFreq);

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

            function cancelEditConteudo() {
                vm._model = $.extend(true,{},vm._bkp);
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