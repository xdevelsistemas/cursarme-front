(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('relatorios', ['$scope', '$resource', 'breadCrumb', '$timeout', '$http', '$sce', 'reportService', function($scope, $resource, breadCrumb, $timeout, $http, $sce, reportService){

            var vm = this,
                dados = $resource('/api/secretaria/view-inscr').get().$promise,
                dados_geral = $resource('/api/secretaria/templateConfig').get().$promise;

            breadCrumb.title = 'Relatórios';

            vm._viewInscr = {};
            vm._templateConfig = {};
            vm.data = {content: {head: [], body:[]}, header: [], footer: []};
            vm.gerar = gerar;
            vm.reportSv = reportService; // Service de relatorios (PDF)
            vm.template = '';

            dados_geral
                .then(function (dados_geral2) {
                    vm._templateConfig = dados_geral2;
                })
                .catch(function (erro) {
                    console.log("\n" + erro.data + "\n");
                });

            dados
                .then(function (data2) {
                    vm._viewInscr = data2;

                    for (var i = 0; i < data2.list.length; i++) {
                        for (var j = 0; j < data2.list[i].listaCheques.length; j++) {
                            vm._viewInscr.list[i].listaCheques[j].data = new Date(data2.list[i].listaCheques[j].data);
                        }
                    }
                })
                .catch(function (erro) {
                    console.log("\n" + erro.data + "\n");
                });

            function gerar() {
                reportData();
                //reportService.data = vm.data;
                //reportService.gerar('html/common/relatorio.ejs');
                window.open("/report?templateContent=" + encodeURIComponent("relatorio") + "&dataContent=" + encodeURIComponent(JSON.stringify(vm.data.content)) + "","_blank");
            }

            function reportData() {
                // header pdf
                /*vm.data.header = {
                    logo: vm._templateConfig.logo,
                    nomeEmpresa: vm._templateConfig.nomeEmpresa.model.val,
                    nomeUnidade: vm._templateConfig.nomeUnidade.model.val
                };

                // footer pdf
                vm.data.footer = {
                    endereco: vm._templateConfig.endereco.model.val,
                    telefone: vm._templateConfig.telefone.model.val,
                    email: vm._templateConfig.email.model.val,
                    site: vm._templateConfig.site.model.val
                };*/

                // content head pdf
                vm.data.content.head = [
                    {text: 'Nome'},
                    {text: 'Turma'},
                    {text: 'Curso'},
                    {text: 'Unidade'}
                ];

                vm.data.content.body = [];

                // content body pdf
                for (var i = 0; i < vm._viewInscr.list.length;i++){
                    vm.data.content.body.push({
                        Nome: vm._viewInscr.list[i].nome.model.val,
                        Turma: vm._viewInscr.list[i].vagas.turma,
                        Curso: vm._viewInscr.list[i].curso.model.text,
                        Unidade: vm._viewInscr.list[i].unidade.model.text
                    });
                    vm.data.content.body.sort(function compare(a,b) {
                        if (a.Nome > b.Nome){
                            return a.Nome > b.Nome
                        }
                        if (a.Turma > b.Turma){
                            return a.Turma > b.Turma
                        }
                        if (a.Curso > b.Curso){
                            return a.Curso > b.Curso
                        }
                        if (a.Unidade > b.Unidade){
                            return a.Unidade > b.Unidade
                        }
                    })
                }
            }
            vm.geraDec = function () {
                // header pdf
                reportService.data.header = {
                    logo: vm._templateConfig.logo,
                    nomeEmpresa: vm._templateConfig.nomeEmpresa.model.val,
                    nomeUnidade: vm._templateConfig.nomeUnidade.model.val
                };

                // footer pdf
                reportService.data.footer = {
                    endereco: vm._templateConfig.endereco.model.val,
                    telefone: vm._templateConfig.telefone.model.val,
                    email: vm._templateConfig.email.model.val,
                    site: vm._templateConfig.site.model.val
                };

                reportService.data.content = {
                    data: '22/12/2015',
                    nome: 'João das Couves',
                    curso: 'Sistemas de Informação'
                };
                reportService.gerar('html/common/template-decDocs.ejs');
            };


        }])
})();