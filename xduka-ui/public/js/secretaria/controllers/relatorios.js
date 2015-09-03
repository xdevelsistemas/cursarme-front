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


            vm._selectTest = {
                "label": "Select Teste",
                "type": "select",
                "name": "selectTest",
                "placeholder": "Selecione uma opção",
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
                        "text": "Demo Complementação Pedagógica",
                        "value": "comp-pedagogica"
                    },
                    {
                        "id": "3",
                        "text": "Demo Mestrado",
                        "value": "mestrado"
                    },
                    {
                        "id": "4",
                        "text": "Demo de horario",
                        "value": "dec-horario-aluno"
                    },
                    {
                        "id": "5",
                        "text": "Demo Declaração de matrícula",
                        "value": "dec-matricula-aluno"
                    },
                    {
                        "id": "6",
                        "text": "Demo Declaração de frequência",
                        "value": "dec-frequencia-aluno"
                    },
                    {
                        "id": "7",
                        "text": "Demo de curso livre",
                        "value": "dec-curso-livre"
                    }
                ],
                "model": {"val": "", "err": ""}
            };






            vm.data = {content: {head: [], body:[]}, header: [], footer: []};
            vm.gerar = gerar;

            vm.reportSv = reportService; // Service de relatorios (PDF)
            vm.template = '';



            function gerar(item, model) {

                var template = item.value;
                var data = item.id;

                //$http.post('/api/common/report', { templateContent: template, data: '1' })
                window.open('/report?templateContent='+template+'&data='+data ,'_blank');

            }


            function gerarCompPedagogica() {
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
                vm.data.content.body.push({ turma: 'SIN15/1' });

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

                window.open("/report?templateContent=" + encodeURIComponent("comp-pedagogica") + "&dataContent=" + encodeURIComponent(JSON.stringify(vm.data.content)) + "","_blank");
            }


            function gerarMestrado() {
                // content head pdf
                vm.data.content.head = [
                    {text: 'Nome'},
                    {text: '5 fotos 3x4'},
                    {text: 'Carteira de Identidade'},
                    {text: 'CPF'},
                    {text: 'Titulo Eleitoral'},
                    {text: 'Comprovante da Ultima Eleição'},
                    {text: 'Certidão de Reservista'},
                    {text: 'Certidão de Nascimento ou Casamento'},
                    {text: 'Comprovante de Residência'},
                    {text: 'Diploma de Graduação'},
                    {text: 'Histórico de Graduação'},
                    {text: 'Certidão de Conclusão'}
                ];

                vm.data.content.body = [];
                vm.data.content.body.push({ turma: 'SIN15/1' });

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
                        dip_grad: '',
                        hist_grad: 'X',
                        cert_conclu: 'X',
                    });
                    vm.data.content.body.sort(function compare(a,b) {
                        if (a.Nome > b.Nome){
                            return a.Nome > b.Nome
                        }
                    })
                }
                window.open("/report?templateContent=" + encodeURIComponent("mestrado") + "&dataContent=" + encodeURIComponent(JSON.stringify(vm.data.content)) + "","_blank");

            }

            function gerarDecHorario() {
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
            }

            function gerarDecmat() {
                vm.data.content = {
                    nome: 'João das Couves',
                    rg: '2.141-654 - ES',
                    curso: 'Sistemas de Informação',
                    matricula: '1412SI312',
                    encontro: 'semanais',
                    data_ini: '18/08/2015',
                    data_fim: '18/05/2017'
                };
                window.open("/report?templateContent=" + encodeURIComponent("dec-matricula-aluno") + "&dataContent=" + encodeURIComponent(JSON.stringify(vm.data.content)) + "","_blank");
            }

            function gerarDecFreq() {
                vm.data.content = {
                    nome: 'João das Couves',
                    cpf: '123.123.123-31',
                    curso: 'Complementação Pedagógica',
                    matricula: '1412SI312',
                    encontro: 'semanais',
                    hora1: '07:30',
                    hora2: '09:30',
                    data_ini: '18/08/2015',
                    data_fim: '18/05/2017'
                };
                window.open("/report?templateContent=" + encodeURIComponent("dec-frequencia-aluno") + "&dataContent=" + encodeURIComponent(JSON.stringify(vm.data.content)) + "","_blank");
            }

            function gerarDecCursoLivre() {
                vm.data.content = {
                    nome: 'João das Couves',
                    curso: 'Sistemas de Informação',
                    caga_horaria: '2500',
                    dia_ini: '01',
                    mes_ini: 'Novembro',
                    ano_ini: '2013',
                    dia_fim: '01',
                    mes_fim: 'Novembro',
                    ano_fim: '2016',
                    content_curso: [
                        { text: "DESENVOLVIMENTO INFANTIL" },
                        { text: "RECÉM NASCIDO" },
                        { text: "PRIMEIRO ANO" },
                        { text: "SEGUNDO ANO" },
                        { text: "DO TERCEIRO AO QUINTO ANO" },
                        { text: "SINAIS DE ALERTA NO DESENVOLVIMENTO INFANTIL" },
                        { text: "DESENVOLVIMENTO PSICOSEXUAL DA CRIANÇA" },
                        { text: "FASES DO DESENVOLVIMENTO" },
                        { text: "CARACTERÍSTICAS DO DESENVOLVIMENTO COGNITIVO" },
                        { text: "REAÇÕES AGRESSIVAS NA INFÂNCIA" },
                        { text: "AS BRINCADEIRAS NOS DOIS PRIMEIROS ANOS" },
                        { text: "AS BRINCADEIRAS E A CRIANÇA DE 3, 4 E 5 ANOS" },
                        { text: "BRINQUEDOS E BRINCADEIRAS" },
                        { text: "CONSIDERAÇÕES SOBRE OS BRINQUEDOS PEDAGÓGICOS" },
                        { text: "CLASSIFICAÇÃO DE BRINQUEDOS" },
                        { text: "O DESENHO E O DESENVOLVIMENTO DAS CRIANÇAS" },
                        { text: "ORIGEM DA EDUCAÇÃO INFANTIL NO MUNDO" },
                        { text: "EDUCAÇÃO INFANTIL NO BRASIL" },
                        { text: "O QUE É EDUCAÇÃO INFANTIL? OS OBJETIVOS DO TRABALHO PEDAGÓGICO COM CRIANÇAS DE 0 A 6 ANOS" },
                        { text: "OBJETIVOS NA EDUCAÇÃO INFANTIL" },
                        { text: "CURRÍCULO VIVO: A ORGANIZAÇÃO DO TRABALHO PEDAGÓGICO NA EDUCAÇÃO INFANTIL" },
                        { text: "ROTINA NA EDUCAÇÃO INFANTIL" },
                        { text: "AVALIAÇÃO NA EDUCAÇÃO INFANTIL: O ADULTO COMO UM DOS MEDIADORES DO DESENVOLVIMENTO INFANTIL" }
                    ]
                };
                window.open("/report?templateContent=" + encodeURIComponent("dec-curso-livre") + "&dataContent=" + encodeURIComponent(JSON.stringify(vm.data.content)) + "","_blank");
            }

        }]);
})();