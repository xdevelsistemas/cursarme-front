(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('relatorios', ['$scope', '$resource', 'breadCrumb', '$timeout', '$http', '$sce', 'reportService', function($scope, $resource, breadCrumb, $timeout, $http, $sce, reportService){

            breadCrumb.title = 'Relatórios';

            var vm = this,
                dados = $resource('/api/secretaria/view-inscr').get().$promise,
                dados_geral = $resource('/api/secretaria/templateConfig').get().$promise;

            vm._viewInscr = {};
            vm._templateConfig = {};
            vm._selectPdf = {
                "label": "Relatórios PDF",
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
                        "id": "2",
                        "text": "Demo Mestrado",
                        "value": "mestrado"
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
                    }
                ],
                "model": {"val": "", "err": ""}
            };


            vm.data = {content: {head: [], body:[]}, header: [], footer: []};
            vm.gerarPdf = gerarPdf;

            vm.reportSv = reportService; // Service de relatorios (PDF)
            vm.template = '';

            function gerarPdf(item, model) {
                var template = item.value;
                var data = item.id;
                //$http.post('/api/common/report', { templateContent: template, data: '1' })
                window.open('/report?templateContent='+template+'&data='+data ,'_blank');

            }

        }]);
})();