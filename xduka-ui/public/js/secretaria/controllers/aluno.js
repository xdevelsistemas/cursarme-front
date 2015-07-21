(function(){
    'use strict';


    angular.module('app.controllers')
        .controller('aluno', ['$scope', '$resource', '$route', 'breadCrumb', 'tipoTelefone', '$timeout', 'modelStrings',
            function($scope, $resource, $route, breadCrumb, tipoTelefone, $timeout, modelStrings){

                var vm = this
                    , template = $resource('/api/comercial/template-inscricao').get().$promise
                    /* PROMESSA "alunosPromise" TEM QUE SER EDITADA PARA FAZER BUSCA DE UM ALUNO OU MAIS (tipo filter)*/
                    , alunosPromise = $resource('/api/secretaria/aluno').get().$promise;

                breadCrumb.title = 'Aluno';

                // ==== MODELOS ==== //

                vm._model = {};
                vm._temp = {};

                vm.editing = false;

                alunosPromise
                    .then(function (data) {
                        vm._model.alunos = data.list;
                        for (var i=0; i < vm._model.alunos.length; i++) {
                            vm._model.alunos[i].cont = i
                        }
                    })
                    .catch(function (erro) {
                        console.log(erro);
                    });
                vm.colorIf = function(item){
                    return item.cont%2 == 0
                };
                template
                    .then(function(data){
                        $.extend(vm._model, data, {
                            matricula: {
                                label: 'Matrícula',
                                model: {val: ''},
                                type: 'text'
                            },
                            dataMatricula: {
                                label: 'Data de Matrícula',
                                model: {val: ''},
                                type: 'text',
                                "name": "dataMatr",
                                "format": "dd/MM/yyyy"
                            },
                            foto: {
                                model: {val: ''}
                            },
                            cursoTurma: {
                                label: 'Curso/Turma',
                                model: {val: ''},
                                type: 'text'
                            },
                            relatorio: {
                                label: ' ',
                                model: {val: ''},
                                type: 'text'
                            },
                            cidadeUf: {
                                label: 'Cidade/UF',
                                model: {val: ''},
                                type: 'text'
                            },
                            escolaridade: {
                                label: 'Escolaridade',
                                model: {val: ''},
                                type: 'text'
                            },
                            formacao: {
                                label: 'Formação',
                                model: {val: ''},
                                type: 'text'
                            },
                            profissao: {
                                label: 'Profissão',
                                model: {val: ''},
                                type: 'text'
                            },
                            empresa: {
                                label: 'Empresa',
                                model: {val: ''},
                                type: 'text'
                            },
                            funcao: {
                                label: 'Função',
                                model: {val: ''},
                                type: 'text'
                            },
                            statusMilitar: {
                                label: 'Status',
                                model: {val: ''},
                                list: [
                                    {id: 'n', text: 'Não apresentou'},
                                    {id: 's', text: 'Apresentou'}
                                ],
                                type: 'select'
                            },
                            statusCertidao: {
                                label: 'Status',
                                model: {val: ''},
                                list: [
                                    {id: 'n', text: 'Não apresentou'},
                                    {id: 's', text: 'Apresentou'}
                                ],
                                type: 'select'
                            },
                            certidaoCidadeUf: {
                                label: 'Cidade/UF',
                                model: {val: ''},
                                type: 'text'
                            },
                            im: {
                                label: 'I.M',
                                model: {val: ''},
                                type: 'text'
                            },
                            monografia: {
                                label: 'Monografia',
                                model: {val: ''},
                                type: 'text'
                            },
                            orientador: {
                                label: 'Orientador',
                                model: {val: ''},
                                type: 'text'
                            },
                            nota: {
                                label: 'Nota',
                                model: {val: ''},
                                type: 'text'
                            },
                            dataApuracao: {
                                label: 'Data Apuração',
                                model: {val: ''},
                                type: 'text',
                                "name": "dataMatr",
                                "format": "dd/MM/yyyy"
                            },
                            dataColacao: {
                                label: 'Data Colação',
                                model: {val: ''},
                                type: 'text',
                                "name": "dataMatr",
                                "format": "dd/MM/yyyy"
                            },
                            anoLetivo: {
                                label: 'Ano Letivo',
                                model: {val: ''},
                                type: 'text'
                            },
                            municipioEm: {
                                label: 'Municipio',
                                model: {val: ''},
                                type: 'text'
                            },
                            ufEm: {
                                "label": "UF",
                                "type": "text",
                                "placeholder": "Selecione...",
                                "name": "natUf",
                                "model": {"val": "", "err": ""},
                                "list": [{"id": "UF_AC", "text": "AC"},
                                    {"id": "UF_AL", "text": "AL"},
                                    {"id": "UF_AP", "text": "AP"},
                                    {"id": "UF_AM", "text": "AM"},
                                    {"id": "UF_BA", "text": "BA"},
                                    {"id": "UF_CE", "text": "CE"},
                                    {"id": "UF_DF", "text": "DF"},
                                    {"id": "UF_ES", "text": "ES"},
                                    {"id": "UF_GO", "text": "GO"},
                                    {"id": "UF_MA", "text": "MA"},
                                    {"id": "UF_MT", "text": "MT"},
                                    {"id": "UF_MS", "text": "MS"},
                                    {"id": "UF_MG", "text": "MG"},
                                    {"id": "UF_PA", "text": "PA"},
                                    {"id": "UF_PB", "text": "PB"},
                                    {"id": "UF_PR", "text": "PR"},
                                    {"id": "UF_PE", "text": "PE"},
                                    {"id": "UF_PI", "text": "PI"},
                                    {"id": "UF_RJ", "text": "RJ"},
                                    {"id": "UF_RN", "text": "RN"},
                                    {"id": "UF_RS", "text": "RS"},
                                    {"id": "UF_RO", "text": "RO"},
                                    {"id": "UF_SC", "text": "SC"},
                                    {"id": "UF_RR", "text": "RR"},
                                    {"id": "UF_SP", "text": "SP"},
                                    {"id": "UF_SE", "text": "SE"},
                                    {"id": "UF_TO", "text": "TO"}]
                            },
                            cursoEm: {
                                label: 'Curso',
                                model: {val: ''},
                                type: 'text'
                            },
                            ufGrad: {
                                "label": "UF",
                                "type": "text",
                                "placeholder": "Selecione...",
                                "name": "natUf",
                                "model": {"val": "", "err": ""},
                                "list": [{"id": "UF_AC", "text": "AC"},
                                    {"id": "UF_AL", "text": "AL"},
                                    {"id": "UF_AP", "text": "AP"},
                                    {"id": "UF_AM", "text": "AM"},
                                    {"id": "UF_BA", "text": "BA"},
                                    {"id": "UF_CE", "text": "CE"},
                                    {"id": "UF_DF", "text": "DF"},
                                    {"id": "UF_ES", "text": "ES"},
                                    {"id": "UF_GO", "text": "GO"},
                                    {"id": "UF_MA", "text": "MA"},
                                    {"id": "UF_MT", "text": "MT"},
                                    {"id": "UF_MS", "text": "MS"},
                                    {"id": "UF_MG", "text": "MG"},
                                    {"id": "UF_PA", "text": "PA"},
                                    {"id": "UF_PB", "text": "PB"},
                                    {"id": "UF_PR", "text": "PR"},
                                    {"id": "UF_PE", "text": "PE"},
                                    {"id": "UF_PI", "text": "PI"},
                                    {"id": "UF_RJ", "text": "RJ"},
                                    {"id": "UF_RN", "text": "RN"},
                                    {"id": "UF_RS", "text": "RS"},
                                    {"id": "UF_RO", "text": "RO"},
                                    {"id": "UF_SC", "text": "SC"},
                                    {"id": "UF_RR", "text": "RR"},
                                    {"id": "UF_SP", "text": "SP"},
                                    {"id": "UF_SE", "text": "SE"},
                                    {"id": "UF_TO", "text": "TO"}]
                            },
                            obsGrad: {
                                "label": "Observações",
                                "type": "textarea",
                                "name": "observacoes",
                                "required": false,
                                "model": {"val": "", "err": ""}
                            },
                            obsLog: {
                                "label": "Observações",
                                "type": "textarea",
                                "name": "observacoes",
                                "required": false,
                                "model": {"val": "", "err": ""}
                            },
                            logUser: {
                                "label": "Usuário",
                                "type": "text",
                                "placeholder": "Selecione...",
                                "name": "natUf",
                                "model": {"val": "", "err": ""},
                                "list": [
                                    {id: 0, text: '*Todos'},
                                    {id: 1, text: 'Camila Ferreira'},
                                    {id: 2, text: 'João da Silva'}
                                ]
                            }
                        });
                    })
                    .catch(function(erro){
                        if (erro.status == '400') {
                            console.log(erro)
                        }
                    });

                //IMG CROP
                $scope.myImage='';
                $scope.myCroppedImage='';
                var handleFileSelect=function(evt) {
                    var file=evt.currentTarget.files[0];
                    var reader = new FileReader();
                    reader.onload = function (evt) {
                        $scope.$apply(function($scope){
                            $scope.myImage=evt.target.result;
                            vm.fotoModel = $scope.myImage
                        });
                    };
                    reader.readAsDataURL(file);
                };
                angular.element(document.querySelector('#fileInput')).on('change',handleFileSelect);
                vm.clickFoto = function(){
                    $scope.myImage = ''
                };
                vm.sendFoto = function(){
                    vm._model.foto.model.val = $scope.myCroppedImage;
                };
                vm.removeFoto = function(){
                    vm._model.foto.model.val = '';
                };
                vm.imgCropErr = function(){
                    vm._model.foto.model.err = 'Erro!'
                };


                /* FUNÇÕES DE EDIÇÃO */
                vm.cancelEdit = function(){
                    vm._model = vm._temp;
                    vm._temp = {};
                    vm.editing = false;
                };
                vm.editarAluno = function(){
                    vm._temp = vm._model;
                    vm.editing = true;
                };


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
                    },
                    {
                        text: 'Parcelas',
                        entypo: 'entypo-calendar',
                        active: false,
                        target: '#parcelas'
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
                }
            }])
})();
