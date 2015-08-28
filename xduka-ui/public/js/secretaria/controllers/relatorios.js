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
            vm.data = {content: {head: [], body:[]}, header: [], footer: []};
            vm.gerar = gerar;
            vm.gerarCompPedagogica = gerarCompPedagogica;
            vm.gerarDecHorario = gerarDecHorario;

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
                window.open("/report?templateContent=" + encodeURIComponent("relatorio") + "&dataContent=" + encodeURIComponent(JSON.stringify(vm.data.content)) + "","_blank");
            }

            function gerarCompPedagogica() {
                reportDataCP();
                window.open("/report?templateContent=" + encodeURIComponent("comp-pedagogica") + "&dataContent=" + encodeURIComponent(JSON.stringify(vm.data.content)) + "","_blank");
            }

            function reportDataCP() {
                // content head pdf
                vm.data.content.head = [
                    {text: 'Nome'},
                    {text: '3 fotos 3x4'},
                    {text: 'Carteira de Identidade'},
                    {text: 'CPF'},
                    {text: 'Titulo Eleitoral'},
                    {text: 'Comprovante da Ultima Eleição'},
                    {text: 'Certidão de Reservista'},
                    {text: 'Certidão de Nascimento ou Casamento'},
                    {text: 'Comprovante de Residência'},
                    {text: 'Diploma do Ensino Médio'},
                    {text: 'Histórico do Ensino Médio'},
                    {text: 'Diploma de Graduação'},
                    {text: 'Histórico de Graduação'},
                    {text: 'Certidão de Conclusão'}
                ];

                vm.data.content.body = [];

                // content body pdf
                for (var i = 0; i < 10;i++){
                    vm.data.content.body.push({
                        Nome: 'João das Couves',
                        foto: 'X',
                        c_id: '',
                        cpf: 'X',
                        tit_eleit: '',
                        comp_eleit: 'X',
                        cert_reserv: 'X',
                        cert_cas: '',
                        comp_res: 'X',
                        dip_em: '',
                        hist_em: 'X',
                        dip_grad: '',
                        hist_grad: 'X',
                        cert_conclu: 'X'
                    });
                    vm.data.content.body.sort(function compare(a,b) {
                        if (a.Nome > b.Nome){
                            return a.Nome > b.Nome
                        }
                    })
                }
            }



            function reportData() {
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
                vm.data.content = {
                    data: '22/12/2015',
                    nome: 'João das Couves',
                    curso: 'Sistemas de Informação'
                };
                window.open("/report?templateContent=" + encodeURIComponent("template-decDocs") + "&dataContent=" + encodeURIComponent(JSON.stringify(vm.data.content)) + "","_blank");
            };


            function gerarDecHorario() {
                vm.data.content = {
                    nome: 'João das Couves',
                    cpf: '123.123.123-54',
                    disciplina: 'Cálculo 2',
                    professor: 'Bruno teste',
                    curso: 'Sistemas de Informação',
                    dia: '14',
                    mes: 'Novembro',
                    ano: '2015',
                    hora1: '7:30',
                    hora2: '9:30'
                };
                window.open("/report?templateContent=" + encodeURIComponent("dec-horario-aluno") + "&dataContent=" + encodeURIComponent(JSON.stringify(vm.data.content)) + "","_blank");
            };


        }])
})();