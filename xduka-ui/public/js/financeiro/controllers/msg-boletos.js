(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('msgBoletos', ['$scope', '$resource', 'breadCrumb', function($scope, $resource, breadCrumb) {

            /* jshint validthis: true */
            var vm = this;

            vm._model = {

                "tipoCurso": {
                    "label": "Tipo Curso",
                    "type": "select",
                    "name": "tipoCurso",
                    "placeholder": "Selecione uma opção",
                    "required": false,
                    "list": [],
                    "model": {"val": "", "err": ""}
                },
                "curso": {
                    "label": "Curso",
                    "type": "select",
                    "name": "curso",
                    "placeholder": "Selecione uma opção",
                    "required": false,
                    "list": [],
                    "model": {"val": "", "err": ""}
                },
                "turma": {
                    "label": "Turma",
                    "type": "select",
                    "name": "turma",
                    "placeholder": "Selecione uma opção",
                    "required": false,
                    "list": [],
                    "model": {"val": "", "err": ""}
                },
                "compensacao": {
                    "label": "Compensação",
                    "type": "textarea",
                    "name": "compensacao",
                    "rows": 7,
                    "model": {"val": "", "err": ""}
                },
                "sacado": {
                    "label": "Sacado",
                    "type": "textarea",
                    "name": "sacado",
                    "rows": 7,
                    "model": {"val": "", "err": ""}
                },
                "atraso": {
                    "label": "Atraso",
                    "type": "textarea",
                    "name": "atraso",
                    "rows": 7,
                    "model": {"val": "", "err": ""}
                }
            };
            vm.breadCrumb = breadCrumb;
            vm.breadCrumb.title = 'Mensagem Boletos';
            vm.limpar = limpar;
            vm.salvar = salvar;
            vm.showTextareas = false;

            function limpar(obj) {
                obj.model.val = '';
            }

            function salvar(obj) {
                /* FUNCTION SEND DATA */
                /* POST ROUTE HERE */
            }


        }]);
})();