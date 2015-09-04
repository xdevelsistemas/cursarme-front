(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('materialComplementar', ['$scope', '$resource', 'breadCrumb', '$timeout', function($scope, $resource, breadCrumb, $timeout){

            var vm = this;

            breadCrumb.title = 'Material Complementar';

            vm._model = {
                "curso": {
                    "label": "Curso",
                    "type": "select",
                    "name": "curso",
                    "placeholder": "Selecione...",
                    "model": {"val": "", "err": ""},
                    "list": []
                },
                "turma": {
                    "label": "Turma",
                    "type": "select",
                    "name": "turma",
                    "placeholder": "Selecione...",
                    "model": {"val": "", "err": ""},
                    "list": []
                },
                "disciplina": {
                    "label": "Disciplina",
                    "type": "select",
                    "name": "disciplina",
                    "placeholder": "Selecione...",
                    "model": {"val": "", "err": ""},
                    "list": []
                },
                "titulo": {
                    "label": "Título",
                    "type": "text",
                    "name": "titulo",
                    "model": {"val": "", "err": ""}
                },
                "numero": {
                    "label": "Número",
                    "type": "text",
                    "name": "numero",
                    "model": {"val": "", "err": ""}
                },
                "data": {
                    "label": "Data",
                    "type": "text",
                    "model": {"val": "", "err": ""},
                    "name": "data",
                    "format": "dd/MM/yyyy"
                },
                "texto": {
                    "label": "Texto Complementar",
                    "type": "textarea",
                    "name": "texto",
                    "rows": 7,
                    "model": {"val": "", "err": ""}
                },
                "anexo": {
                    "model": {"val": ""} //todo pegar arquivo anexado e enviar para o node
                }
            };

            vm.limpar = limpar;
            vm.salvar = salvar;


            function limpar() {
                vm._model.curso.model.val = '';
                vm._model.turma.model.val = '';
                vm._model.disciplina.model.val = '';
                vm._model.titulo.model.val = '';
                vm._model.numero.model.val = '';
                vm._model.data.model.val = '';
                vm._model.texto.model.val = '';
            }

            function salvar() {
                //todo post salvamento
                limpar();
            }

        }])
})();