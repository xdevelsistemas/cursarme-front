(function(){
    'use strict';


    angular.module('app.controllers')
        .controller('alunoFin', ['$scope', '$resource', '$route', 'breadCrumb', 'tipoTelefone', '$timeout', 'modelStrings', 'alunoService','$location', '$routeParams', 'ngProgressFactory',
            function($scope, $resource, $route, breadCrumb, tipoTelefone, $timeout, modelStrings,alunoService,$location, $routeParams, ngProgressFactory){

                /* PROGRESS BAR */
                $scope.progressbar = ngProgressFactory.createInstance();
                $scope.progressbar.setColor('#45A0CF');
                $scope.progressbar.start();

                //IMG CROP
                $scope.myImage='';
                $scope.myCroppedImage='';
                angular.element(document.querySelector('#fileInput')).on('change',handleFileSelect);

                var vm = this
                    , template = $resource('/api/financeiro/templateAluno').get().$promise;


                vm.modelStrings = modelStrings;
                breadCrumb.title = vm.modelStrings.ALUNO;

                // ==== MODELOS ==== //

                vm._alunos = [];
                vm._model = {};
                vm._searchVal = '';
                vm._temp = {};
                vm.alert = true;
                vm.editing = false;
                vm.loaded = false;
                vm.msgPendencia = '';
                vm.openSearch = false;
                vm.salvarParcela = salvarParcela;
                vm.visualizarAluno = false;

                /* VOLTAR MORE ALUNO */
                vm.completeBar = completeBar;
                vm.disableAlert = disableAlert;
                vm.moreAlunoVoltar = moreAlunoVoltar;

                /* IMG CROP CUSTOM */
                vm.clickFoto = clickFoto;
                vm.imgCropErr = imgCropErr;
                vm.removeFoto = removeFoto;
                vm.sendFoto = sendFoto;

                /* FUNÇÕES DE EDIÇÃO */
                vm.cancelEdit = cancelEdit;
                vm.editarAluno = editarAluno;
                vm.salvar = salvar;


                // PROMISES
                template
                    .then(function(data){
                        $.extend(vm._model, data, {
                            logUser: {
                                "label": "Usuário",
                                "type": "text",
                                "placeholder": "Selecione...",
                                "name": "userLog",
                                "model": {"val": "", "err": ""},
                                "list": [
                                    {id: 0, text: '*Todos'},
                                    {id: 1, text: 'Camila Ferreira'},
                                    {id: 2, text: 'João da Silva'}
                                ]
                            },
                            printBoletim: {
                                "label": "BOLETIM",
                                "type": "text",
                                "placeholder": "Selecione...",
                                "name": "printBOletim",
                                "model": {"val": "", "err": ""},
                                "list": [
                                    {id: 0, text: 'Completo'},
                                    {id: 1, text: 'Período 1'},
                                    {id: 2, text: 'Período 2'},
                                    {id: 3, text: 'Período 3'},
                                    {id: 4, text: 'Período 4'}
                                ]
                            },
                            "situacao": {
                                "label": "Situação",
                                "type": "text",
                                "placeholder": "Selecione...",
                                "name": "situacao",
                                "model": {"val": "", "err": ""},
                                "list": [
                                    {id: 0, text: 'Normal'},
                                    {id: 1, text: 'Transferência de turma'},
                                    {id: 2, text: 'Transferência de curso'},
                                    {id: 3, text: 'Desistência'},
                                    {id: 4, text: 'Cancelado'},
                                    {id: 5, text: 'Transferência de instituição'},
                                    {id: 6, text: 'Remanejado'}
                                ]
                            },
                            "origem": {
                                "label": "Origem",
                                "name": "origem",
                                "type": "text",
                                "model": {"val": "", "err": ""}
                            },
                            "destino": {
                                "label": "Destino",
                                "name": "destino",
                                "type": "text",
                                "model": {"val": "", "err": ""}
                            }
                        });
                        if (Object.keys(alunoService.aluno).length==0){
                            $routeParams.matricula.length > 6?search($routeParams.matricula):vm._erro='Matrícula '+$routeParams.matricula+' inexistente!'
                        }else{
                            $.extend(true,vm._model,alunoService.aluno);
                            if(angular.isDefined(alunoService.aluno.pendencia)){
                                vm.msgPendencia = vm.modelStrings.PENDENCIA+' R$'+alunoService.aluno.pendencia.model.val;
                            }
                            vm.completeBar();
                        }
                    })
                    .catch(function(erro){
                        if (erro.status == '400') {
                            console.log(erro)
                        }
                    });


                /* NAV (LINKS PARTE DE CIMA) */
                vm._model.navs = [
                    {
                        text: 'Home',
                        entypo: 'entypo-home',
                        active: true,
                        target: '#home'
                    },
                    {
                        text: 'Endereço',
                        entypo: 'entypo-address',
                        active: false,
                        target: '#endereco'
                    },
                    {
                        text: 'Parcelas',
                        entypo: 'entypo-calendar',
                        active: false,
                        target: '#parcelas'
                    },
                    {
                        text: 'Documentação',
                        entypo: 'entypo-vcard',
                        active: false,
                        target: '#documentacao'
                    },
                    {
                        text: 'Grade',
                        entypo: 'entypo-docs',
                        active: false,
                        target: '#gradeDisc'
                    },
                    {
                        text: 'Notas',
                        entypo: 'entypo-graduation-cap',
                        active: false,
                        target: '#notas'
                    },
                    {
                        text: 'Histórico',
                        entypo: 'entypo-archive',
                        active: false,
                        target: '#historico'
                    },
                    {
                        text: 'Log',
                        entypo: 'entypo-book-open',
                        active: false,
                        target: '#log'
                    }
                ];
                vm._model.gridLOg = {
                    id: 'logTable',
                    dataTable: {
                        "paging":   false,
                        "ordering": true,
                        "info":     false,
                        "filter":   false,
                        "order": [[ 0, "desc" ]],
                        "aoColumnDefs": [
                            { 'bSortable': false, 'aTargets': [ 2 ] }
                        ]

                    },
                    class: 'table-hover table-bordered display',
                    head: ["Data/Hora", "Usuário", "Evento"],
                    list: [
                        {
                            'adata': {date: true, int: 1437423897997, formatDate: 'dd/MM/yyyy h:mm a'},
                            'buser': 'Camila Ferreira',
                            'cevento': 'Usuário(a) Camila Ferreira Matrícula Aluno(a): (21321231) ADENILSON BLA BLA BLA BLA NKL NASDKLASDKLASALDASKLDMSAKLDAMKLAMDSMKLA MSDAKD MAKLSMDAKLMSDKLAMDSKAMDKALDMKSAL MDASKLDM KAM AKL MSDKL'
                        },
                        {
                            'adata': {date: true, int: 1437426700808, formatDate: 'dd/MM/yyyy h:mm a'},
                            'buser': 'João da Silva',
                            'cevento': 'Usuário(a) João da Silva Matrícula Aluno(a): (343434343) MARIA BLA BLA BLA BLA NKL NASDKLASDKLASALDASKLDMSAKLDAMKLAMDSMKLA MSDAKD MAKLSMDAKLMSDKLAMDSKAMDKALDMKSAL MDASKLDM KAM AKL MSDKL'
                        }
                    ]
                };
                vm._model.gridAvaliacoes = {
                    class: 'table-hover table-bordered display',
                    head: ["Disciplina", "AV1","AV2","Nota","Média","REC","2HC", "Média Final", "Resultado"],
                    list: [
                        {
                            "adisc": "Serviços de Saúde: Legislação e Segurança do Trabalho",
                            "bav1": "10",
                            "cav2": "10",
                            "dnota": "9",
                            "emedia": "4.5",
                            "frec": "8",
                            "g2hc": "6.25",
                            "hmediaf": "6",
                            "iresult": "APROVADO"
                        },
                        {
                            "adisc": "Políticas Públicas de Saúde no Brasil",
                            "bav1": "10",
                            "cav2": "10",
                            "dnota": "9",
                            "emedia": "4.5",
                            "frec": "8",
                            "g2hc": "6.25",
                            "hmediaf": "6",
                            "iresult": "APROVADO"
                        }
                    ]
                };
                vm._model.gridGrade = {
                    id: 'gradeDiscTable',
                    dataTable: {
                        "paging":   false,
                        "ordering": true,
                        "info":     false,
                        "filter":   true,
                        "order": [[ 2, "desc" ]],
                        "language": {
                            "search": "Pesquisar Grade"
                        }

                    },
                    class: 'table-hover table-bordered display',
                    head: ["Período", "Disciplina", "Carga Horária"],
                    list: [
                        {
                            "aperiodo": "Único",
                            "bdisciplina": "Políticas Públicas de Saúde no Brasil",
                            "ccargahoraria": "30"
                        },
                        {
                            "aperiodo": "Único",
                            "bdisciplina": "Serviços de Saúde: Legislação e Segurança do Trabalho",
                            "ccargahoraria": "40"
                        },
                        {
                            "aperiodo": "Único",
                            "bdisciplina": "Vigilância em Saúde",
                            "ccargahoraria": "30"
                        },
                        {
                            "aperiodo": "Único",
                            "bdisciplina": "Orientação do Trabalho de Conclusão de Curso",
                            "ccargahoraria": "80"
                        }
                    ]
                };

                vm._model.gridParcelas = {
                    class: 'table-hover table-bordered display',
                    head: ["Nº", "Valor", "Desconto", "Acrescimo", "Vencimento", "Valor pago", "Pagamento", "Jur/Multas", "Caixa", "Status", "C", "A", ""],
                    list: [
                        {
                            'anum': '1',
                            'bvalor': '315,00',
                            'cdesconto': {type: 'text', text:'15,00', condicionado: true},
                            'dacrescimo': '0,00',
                            'evencimento': {date: true, int: 1439866800000, formatDate: 'dd/MM/yyyy'},
                            'fvalorPago': '300.00',
                            'gpagamento': {date: true, int: 1439866800000, formatDate: 'dd/MM/yyyy'},
                            'hjurMultas': '0.00',
                            'icaixa': 'Banco do Brasil',
                            'jstatus': 'Quitado',
                            'kc': {input: true, label: ' ', model: {val: ''}, disable: true},
                            'la': {input: true, label: ' ', model: {val: ''}, disable: true},
                            'medit': {btn: true, list: [
                                {
                                    class: 'btn btn-ico',
                                    entypo: 'entypo-pencil',
                                    click: editParcela,
                                    args: 0
                                }
                            ]}
                        },
                        {
                            'anum': '2',
                            'bvalor': '315,00',
                            'cdesconto': {type: 'text', text:'15,00', condicionado: true},
                            'dacrescimo': '0,00',
                            'evencimento': {date: true, int: 1439866800000, formatDate: 'dd/MM/yyyy'},
                            'fvalorPago': '0.00',
                            'gpagamento': {date: true, int: '', formatDate: 'dd/MM/yyyy'},
                            'hjurMultas': '0.00',
                            'icaixa': 'Banco do Brasil',
                            'jstatus': 'Quitado',
                            'kc': {input: true, label: ' ', model: {val: ''}, disable: true},
                            'la': {input: true, label: ' ', model: {val: ''}, disable: true},
                            'medit': {btn: true, list: [
                                {
                                    class: 'btn btn-ico',
                                    entypo: 'entypo-pencil',
                                    click: editParcela,
                                    args: 1
                                }
                            ]}
                        },
                        {
                            'anum': '3',
                            'bvalor': '315,00',
                            'cdesconto': {type: 'text', text:'15,00', condicionado: true},
                            'dacrescimo': '0,00',
                            'evencimento': {date: true, int: 1439866800000, formatDate: 'dd/MM/yyyy'},
                            'fvalorPago': '0.00',
                            'gpagamento': {date: true, int: '', formatDate: 'dd/MM/yyyy'},
                            'hjurMultas': '0.00',
                            'icaixa': 'Banco do Brasil',
                            'jstatus': 'Quitado',
                            'kc': {input: true, label: ' ', model: {val: ''}, disable: true},
                            'la': {input: true, label: ' ', model: {val: ''}, disable: true},
                            'medit': {btn: true, list: [
                                {
                                    class: 'btn btn-ico',
                                    entypo: 'entypo-pencil',
                                    click: editParcela,
                                    args: 2
                                }
                            ]}
                        },
                        {
                            'anum': '4',
                            'bvalor': '315,00',
                            'cdesconto': {type: 'text', text:'15,00', condicionado: true},
                            'dacrescimo': '0,00',
                            'evencimento': {date: true, int: 1439866800000, formatDate: 'dd/MM/yyyy'},
                            'fvalorPago': '0.00',
                            'gpagamento': {date: true, int: '', formatDate: 'dd/MM/yyyy'},
                            'hjurMultas': '0.00',
                            'icaixa': 'Banco do Brasil',
                            'jstatus': 'Quitado',
                            'kc': {input: true, label: ' ', model: {val: ''}, disable: true},
                            'la': {input: true, label: ' ', model: {val: ''}, disable: true},
                            'medit': {btn: true, list: [
                                {
                                    class: 'btn btn-ico',
                                    entypo: 'entypo-pencil',
                                    click: editParcela,
                                    args: 3
                                }
                            ]}
                        },
                        {
                            'anum': '5',
                            'bvalor': '315,00',
                            'cdesconto': {type: 'text', text:'15,00', condicionado: true},
                            'dacrescimo': '0,00',
                            'evencimento': {date: true, int: 1439866800000, formatDate: 'dd/MM/yyyy'},
                            'fvalorPago': '0.00',
                            'gpagamento': {date: true, int: '', formatDate: 'dd/MM/yyyy'},
                            'hjurMultas': '0.00',
                            'icaixa': 'Banco do Brasil',
                            'jstatus': 'Quitado',
                            'kc': {input: true, label: ' ', model: {val: ''}, disable: true},
                            'la': {input: true, label: ' ', model: {val: ''}, disable: true},
                            'medit': {btn: true, list: [
                                {
                                    class: 'btn btn-ico',
                                    entypo: 'entypo-pencil',
                                    click: editParcela,
                                    args: 4
                                }
                            ]}
                        }
                    ]
                };
                vm._model.modalParcela = {
                    num: {
                        "label": "Nº",
                        "type": "text",
                        "name": "modalNum",
                        "model": {
                            "val": "",
                            "err": ""
                        }
                    },
                    valorIntegral: {
                        "label": "Valor Integral",
                        "type": "text",
                        "name": "modalValorIntegral",
                        "model": {
                            "val": "",
                            "err": ""
                        }
                    },
                    vencimento: {
                        "label": "Data Vencimento",
                        "type": "text",
                        "model": {
                            "val": "",
                            "err": ""
                        },
                        "name": "modalDataVenc",
                        "format": "dd/MM/yyyy"
                    },
                    desconto: {
                        "label": "Desconto",
                        "type": "text",
                        "name": "modalDesconto",
                        "model": {
                            "val": "",
                            "err": ""
                        }
                    },
                    condicionado: {
                        "label": "Condicionado a data de vencimento",
                        "type": "checkbox",
                        "name": "modalCond",
                        "model": {
                            "val": "",
                            "err": ""
                        }
                    },
                    acrescimo: {
                        "label": "Acrescimo",
                        "type": "text",
                        "name": "modalAcresc",
                        "model": {
                            "val": "",
                            "err": ""
                        }
                    },
                    valorPagar: {
                        "label": "Valor a pagar",
                        "type": "text",
                        "name": "modalValPagar",
                        "model": {
                            "val": "",
                            "err": ""
                        }
                    },
                    c: {
                        "label": "Cancelar",
                        "type": "text",
                        "model": {
                            "val": "",
                            "err": ""
                        },
                        "name": "modalCancelarP",
                        "format": "dd/MM/yyyy"
                    },
                    motivoC: {
                        "label": "Motivo",
                        "type": "text",
                        "name": "modalMotivoC",
                        "model": {
                            "val": "",
                            "err": ""
                        }
                    },
                    pagamento: {
                        "label": "Data Pagamento",
                        "type": "text",
                        "model": {
                            "val": "",
                            "err": ""
                        },
                        "name": "modalPagamento",
                        "format": "dd/MM/yyyy"
                    },
                    a: {
                        "label": "Ajuizar",
                        "type": "text",
                        "model": {
                            "val": "",
                            "err": ""
                        },
                        "name": "modalAjuizar",
                        "format": "dd/MM/yyyy"
                    },
                    motivoA: {
                        "label": "Motivo",
                        "type": "text",
                        "name": "modalMotivoA",
                        "model": {
                            "val": "",
                            "err": ""
                        }
                    },
                    jurMultas: {
                        "label": "Juros e Multas",
                        "type": "text",
                        "name": "modalJurMultas",
                        "model": {
                            "val": "",
                            "err": ""
                        }
                    },
                    valorPago: {
                        "label": "Valor pago",
                        "type": "text",
                        "name": "modalValPago",
                        "model": {
                            "val": "",
                            "err": ""
                        }
                    }
                };

                /* FUNÇÕES */
                function cancelEdit(){
                    vm._model = $.extend(true,{},vm._temp);
                    vm._temp = {};
                    vm.editing = false;
                }

                function clearModalEdit() {
                    vm._model.modalParcela.num.model.val = '';
                    vm._model.modalParcela.valorIntegral.model.val = '';
                    vm._model.modalParcela.vencimento.model.val = '';
                    vm._model.modalParcela.desconto.model.val = '';
                    vm._model.modalParcela.condicionado.model.val = '';
                    vm._model.modalParcela.acrescimo.model.val = '';
                    vm._model.modalParcela.valorPagar.model.val = '';
                    vm._model.modalParcela.c.model.val = '';
                    vm._model.modalParcela.motivoC.model.val = '';
                    vm._model.modalParcela.pagamento.model.val = '';
                    vm._model.modalParcela.a.model.val = '';
                    vm._model.modalParcela.motivoA.model.val = '';
                    vm._model.modalParcela.jurMultas.model.val = '';
                    vm._model.modalParcela.valorPago.model.val = '';
                    vm._model.modalParcela.pos = -1;
                    $('#modalEditParcelas').modal('toggle')
                }

                function clickFoto() {
                    $scope.myImage = ''
                }

                function completeBar(){
                    $timeout(function () {
                        $scope.progressbar.complete();
                        vm.loaded = true;
                    })
                }

                function disableAlert(){
                    vm._model.alert = false;
                }

                function editarAluno(){
                    vm._temp = $.extend(true,{},vm._model);
                    vm.editing = true;
                }

                function editParcela(pos,line){
                    vm._model.modalParcela.num.model.val = line.anum;
                    vm._model.modalParcela.valorIntegral.model.val = line.bvalor;
                    vm._model.modalParcela.vencimento.model.val = new Date(line.evencimento.int);
                    vm._model.modalParcela.desconto.model.val = line.cdesconto.text;
                    vm._model.modalParcela.condicionado.model.val = !!line.cdesconto.condicionado?line.cdesconto.condicionado:false;
                    vm._model.modalParcela.acrescimo.model.val = line.dacrescimo;
                    vm._model.modalParcela.valorPagar.model.val = ((parseFloat(line.bvalor)-parseFloat(line.cdesconto.text))+parseFloat(line.dacrescimo)+parseFloat(line.hjurMultas)-parseFloat(line.fvalorPago));
                    vm._model.modalParcela.c.model.val = !!line.kc.model.val?line.kc.model.date:'';
                    vm._model.modalParcela.motivoC.model.val = !!line.kc.motivoC?line.kc.motivoC:'';
                    vm._model.modalParcela.pagamento.model.val = !!line.gpagamento.int?new Date(line.gpagamento.int):'';
                    vm._model.modalParcela.a.model.val = !!line.la.model.val?line.la.model.date:'';
                    vm._model.modalParcela.motivoA.model.val = !!line.la.motivoA?line.la.motivoA:'';
                    vm._model.modalParcela.jurMultas.model.val = line.hjurMultas;
                    vm._model.modalParcela.valorPago.model.val = line.fvalorPago;
                    vm._model.modalParcela.pos = pos;
                    $('#modalEditParcelas').modal({
                        backdrop: 'static',
                        keyboard: false
                    })
                }

                function handleFileSelect(evt) {
                    var file=evt.currentTarget.files[0];
                    var reader = new FileReader();
                    reader.onload = function (evt) {
                        $scope.$apply(function($scope){
                            $scope.myImage=evt.target.result;
                            vm.fotoModel = $scope.myImage
                        });
                    };
                    reader.readAsDataURL(file);
                }

                function imgCropErr(){
                    vm._model.foto.model.err = 'Erro!'
                }

                function moreAlunoVoltar(){
                    alunoService.aluno = {};
                    $location.path('/');
                }

                function removeFoto(){
                    vm._model.foto.model.val = 'http://www.westcare.com.br/imagens/especialistas/perfil-sem-foto.jpg';
                }

                function salvar(){
                    /* ROTA DE TRATAMENTO DO NODE */
                    vm.editing = false;  //SE VALIDAÇÃO OK

                }

                function salvarParcela(){
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].anum = vm._model.modalParcela.num.model.val;
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].bvalor = vm._model.modalParcela.valorIntegral.model.val;
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].evencimento.int = vm._model.modalParcela.vencimento.model.val.getTime();
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].cdesconto.text = vm._model.modalParcela.desconto.model.val;
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].cdesconto.condicionado = vm._model.modalParcela.condicionado.model.val; //ENTENDER
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].dacrescimo = vm._model.modalParcela.acrescimo.model.val;
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].kc.model.val = !!vm._model.modalParcela.c.model.val;
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].kc.model.date = vm._model.modalParcela.c.model.val;
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].kc.motivoC = vm._model.modalParcela.motivoC.model.val;
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].gpagamento.int = !!vm._model.modalParcela.pagamento.model.val?vm._model.modalParcela.pagamento.model.val.getTime():'';
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].la.model.val = !!vm._model.modalParcela.a.model.val;
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].la.model.date = vm._model.modalParcela.a.model.val;
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].la.motivoA = vm._model.modalParcela.motivoA.model.val;
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].hjurMultas = vm._model.modalParcela.jurMultas.model.val;
                    vm._model.gridParcelas.list[vm._model.modalParcela.pos].fvalorPago = vm._model.modalParcela.valorPago.model.val;
                    clearModalEdit();

                }

                function search(matNome){
                    var search = $resource('/api/secretaria/aluno/:matNome').get({matNome: matNome}).$promise;
                    search
                        .then(
                        function (data) {
                            if (data.result.length > 0){
                                $.extend(true,vm._model,data.result[0]);
                                vm.msgPendencia = vm.modelStrings.PENDENCIA+' R$'+vm._model.pendencia.model.val;
                                vm._model.alert = true;
                            }else{
                                vm._erro = 'Aluno não encontrado! Matrícula: '+$routeParams.matricula
                            }
                            vm.completeBar();
                        }
                    )
                        .catch(
                        function (err) {
                            console.log(err)
                        }
                    );
                }

                function sendFoto() {
                    vm._model.foto.model.val = $scope.myCroppedImage;
                }

                function topCollapse(){
                    $('html, body').animate({scrollTop: 0},'slow');
                }

            }])
})();
