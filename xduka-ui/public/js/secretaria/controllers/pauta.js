(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('pauta', ['$scope', '$resource', 'breadCrumb', '$timeout', function($scope, $resource, breadCrumb, $timeout){

            var vm = this;

            breadCrumb.title = 'Pauta';

            vm._bkp = {};
            vm._alunos = ["João das Couves","Mariana","Maria","Abner"];
            vm._modelAlunos = {};
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
                    "label": "Data",
                    "type": "text",
                    "model": {"val": new Date(), "err": ""},
                    "name": "addData",
                    "format": "dd/MM/yyyy"
                },
                "addAulas": {
                    "label": "Aulas",
                    "type": "text",
                    "mask": "9",
                    "name": "addAulas",
                    "model": {"val": "1", "err": ""}
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
                    "model": {"val": new Date(), "err": ""},
                    "name": "addConteudoData",
                    "format": "dd/MM/yyyy"
                },
                "addConteudoTArea": {
                    "label": "",
                    "type": "textarea",
                    "name": "addConteudoTArea",
                    "rows": 7,
                    "model": {"val": "", "err": ""}
                },
                "duplicar": {
                    "label": "Duplicar anterior",
                    "type": "checkbox",
                    "name": "duplicar",
                    "model": {"val": "", "err": ""}

                }

            };
            vm.addFreq = addFreq;
            vm.cancelEditConteudo = cancelEditConteudo;
            vm.duplicarFreq = duplicarFreq;
            vm.editingPos = -1;
            vm.saveEditConteudo = saveEditConteudo;
            vm.saveFreq = saveFreq;
            vm.saveNewConteudo = saveNewConteudo;
            vm.tableFreqFixa = {
                /*  Cabeçalho do grid   */
                head: [{text: "", class: "col-sx-1"}, {text: "Aluno", class: "col-md-10"}, {text: "Faltas", class: "col-xs-1"}],
                list: [
                    {
                        "anum": "1",
                        "baluno": "João das Couves",
                        "cfaltas": "1"
                    },
                    {
                        "anum": "2",
                        "baluno": "Mariana",
                        "cfaltas": "1"
                    },
                    {
                        "anum": "3",
                        "baluno": "Maria",
                        "cfaltas": "1"
                    },
                    {
                        "anum": "4",
                        "baluno": "Abner",
                        "cfaltas": "0"
                    }
                ]
            };
            vm.tableFreqDatasComp = {
                /*  Cabeçalho do grid   */
                head: [new Date('08/25/2015').toLocaleString().substr(0,11),new Date('08/26/2015').toLocaleString().substr(0,11),new Date('08/27/2015').toLocaleString().substr(0,11),new Date('08/28/2015').toLocaleString().substr(0,11),new Date('08/29/2015').toLocaleString().substr(0,11),new Date('08/30/2015').toLocaleString().substr(0,11),new Date('08/31/2015').toLocaleString().substr(0,11),new Date('09/01/2015').toLocaleString().substr(0,11)],
                list: [
                    {
                        "ajoao": "p",
                        "bjoao": "p",
                        "cjoao": "f",
                        "djoao": "p",
                        "ejoao": "p",
                        "fjoao": "p",
                        "gjoao": "p",
                        "hjoao": "p"
                    },
                    {
                        "amariana": "p",
                        "bmariana": "f",
                        "cmariana": "p",
                        "dmariana": "p",
                        "emariana": "p",
                        "fmariana": "p",
                        "gmariana": "p",
                        "hmariana": "p"
                    },
                    {
                        "amaria": "p",
                        "bmaria": "p",
                        "cmaria": "f",
                        "dmaria": "p",
                        "emaria": "p",
                        "fmaria": "p",
                        "gmaria": "p",
                        "hmaria": "p"
                    },
                    {
                        "aabner": "p",
                        "babner": "p",
                        "cabner": "p",
                        "dabner": "p",
                        "eabner": "p",
                        "fabner": "p",
                        "gabner": "p",
                        "habner": "p"
                    }
                ]
            };
            vm.tableFreqDatasSimp = {
                /*  Cabeçalho do grid   */
                head: [new Date().toLocaleString().substr(0,11),new Date('08/29/2015').toLocaleString().substr(0,11),new Date('08/30/2015').toLocaleString().substr(0,11)],
                list: [
                    {
                        "ajoao": "p",
                        "bjoao": "p",
                        "cjoao": "f"
                    },
                    {
                        "amariana": "p",
                        "bmariana": "f",
                        "cmariana": "p"
                    },
                    {
                        "amaria": "p",
                        "bmaria": "p",
                        "cmaria": "f"
                    },
                    {
                        "aabner": "p",
                        "babner": "p",
                        "cabner": "p"
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
            vm.verTodos = false;
            vm.visualizarFreq = visualizarFreq;

            function addFreq() {
                vm._model.addConteudoData.model.val = vm._model.addData.model.val.toLocaleString().substr(0,11);
                $('#modalAddFreq').modal({
                    backdrop: 'static',
                    keyboard: false
                })
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

            function cancelEditConteudo() {
                vm._model = $.extend(true,{},vm._bkp);
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