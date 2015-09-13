(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('relatorios', ['$scope', '$resource', 'breadCrumb', '$timeout', '$http', '$sce', 'reportService', function($scope, $resource, breadCrumb, $timeout, $http, $sce, reportService){

            breadCrumb.title = 'Relatórios';

            var vm = this;

            vm._viewInscr = {};
            vm._templateConfig = {};
            vm._selectPdf = {
                "label": "",
                "type": "select",
                "name": "selectPdf",
                "placeholder": "Selecione um relatório",
                "list": [
                    {
                        "id": "0",
                        "text": "Demo Matriculados",
                        "value": "relatorio"
                    },
                    {
                        "id": "1",
                        "text": "Demo Declaração",
                        "value": "template-decDocs"
                    },
                    {
                        "id": "3",
                        "text": "Demo de horario",
                        "value": "dec-horario-aluno"
                    },
                    {
                        "id": "4",
                        "text": "Demo Declaração de matrícula",
                        "value": "dec-matricula-aluno"
                    },
                    {
                        "id": "5",
                        "text": "Demo Declaração de frequência",
                        "value": "dec-frequencia-aluno"
                    },
                    {
                        "id": "6",
                        "text": "Demo de curso livre",
                        "value": "dec-curso-livre"
                    },
                    {
                        "id": "7",
                        "text": "Demo Pauta de Frequência",
                        "value": "pauta-frequencia"
                    }                ],
                "model": {"val": "", "err": ""}
            };
            vm.gerarPdf = gerarPdf;


            function gerarPdf(item, model) {
                var template = item.value;
                var data = item.id;
                window.open('/report?templateContent='+template+'&data='+data ,'_blank');
            }

        }]);
})();