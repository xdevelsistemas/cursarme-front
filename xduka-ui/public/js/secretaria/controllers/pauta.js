(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('pauta', ['$scope', '$resource', 'breadCrumb', '$timeout', function($scope, $resource, breadCrumb, $timeout){

            var vm = this;

            breadCrumb.title = 'Pauta';

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
                }

            };
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
                /* CLASSES CSS QUE A TABELA IRÁ UTILIZAR*/
                class: 'table table-hover',

                /*  Cabeçalho do grid   */
                head: ["", "Aluno", "Faltas", "01/04/2015", "05/04/2015", "08/04/2015", "12/04/2015"],
                list: [
                    {
                        "anum": "1",
                        "baluno": "João das Couves",
                        "cfaltas": "1",
                        "d01042015": "P",
                        "d01052015": "P",
                        "d08052015": "P",
                        "d12052015": "F"
                    },
                    {
                        "anum": "2",
                        "baluno": "Mariana",
                        "cfaltas": "1",
                        "d01042015": "F",
                        "d01052015": "P",
                        "d08052015": "P",
                        "d12052015": "P"
                    },
                    {
                        "anum": "3",
                        "baluno": "Maria",
                        "cfaltas": "1",
                        "d01042015": "F",
                        "d01052015": "P",
                        "d08052015": "P",
                        "d12052015": "P"
                    },
                    {
                        "anum": "4",
                        "baluno": "Abner",
                        "cfaltas": "0",
                        "d01042015": "P",
                        "d01052015": "P",
                        "d08052015": "P",
                        "d12052015": "P"
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
            vm.tableFreq.list.push(vm.rodapeFreq)



        }])
})();