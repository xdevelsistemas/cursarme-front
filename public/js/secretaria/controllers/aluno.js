(function(){
    'use strict';


    angular.module('app.controllers')
        .controller('aluno', ['$scope', '$resource', '$route', 'breadCrumb', 'tipoTelefone', '$timeout', 'modelStrings',
            'alunoService','$location', '$routeParams', 'ngProgressFactory', 'FileUploader',
            function($scope, $resource, $route, breadCrumb, tipoTelefone, $timeout, modelStrings,
                     alunoService,$location, $routeParams, ngProgressFactory, FileUploader){

                /* PROGRESS BAR */
                $scope.progressbar = ngProgressFactory.createInstance();
                $scope.progressbar.setColor('#45A0CF');
                $scope.progressbar.start();

                var vm = this
                    , template = $resource('/api/secretaria/templateAluno').get().$promise;

                // VARIÁVEIS COMUNS
                // ==== MODELOS ==== //
                vm.STR = modelStrings;
                breadCrumb.title = vm.STR.ALUNO;

                vm.alert = true;
                vm.anexo = new FileUploader();
                vm._alunos = [];
                vm._model = {};
                vm._temp = {};
                vm._searchVal = '';
                vm.openSearch = false;
                vm.loaded = false;
                vm.editing = false;
                vm.visualizarAluno = false;
                vm.tableAnexos = {
                    id: 'tableAnexos',
                    columnDefs: [
                    {"name": "Nome do arquivo", "field": "nome"}, 
                    {"name": "data"},
                    {"name": "", "field": "todo"}
                    ]
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
                        target: '#endereco'
                    },
                    {
                        text: 'Documentação',
                        entypo: 'entypo-vcard',
                        target: '#documentacao'
                    },
                    {
                        text: 'Grade',
                        entypo: 'entypo-docs',
                        target: '#gradeDisc'
                    },
                    {
                        text: 'Notas',
                        entypo: 'entypo-graduation-cap',
                        target: '#notas'
                    },
                    {
                        text: 'Histórico',
                        entypo: 'entypo-archive',
                        target: '#historico'
                    },
                    {
                        text: 'Anexo',
                        entypo: 'glyphicon glyphicon-paperclip',
                        target: '#anexar'
                    },
                    {
                        text: 'Log',
                        entypo: 'entypo-book-open',
                        target: '#log'
                    }
                ];
                vm._model.gridLOg = {
                    id: 'logTable',
                    columnDefs: [
                    {"name": "Data/Hora", "field": "data"}, 
                    {"name": "Usuário", "field": "user"}, 
                    {"name": "evento"}
                    ]
                };
                vm._model.gridAvaliacoes = {
                    id: "gridAvaliacoes",
                    columnDefs: [
                    {"name": "Disciplina", "field": "disc"}, 
                    {"name": "AV1", "field": "av1"},
                    {"name": "AV2", "field": "av2"},
                    {"name": "nota"},
                    {"name": "Média", "field": "media"},
                    {"name": "REC", "field": "rec"},
                    {"name": "2HC", "field": "2hc"}, 
                    {"name": "Média Final", "field": "mediaf"}, 
                    {"name": "Resultado", "field": "result"}
                    ]
                };
                vm._model.gridGrade = {
                    id: 'gradeDiscTable',
                    columnDefs: [
                    { "name": "Período", "field": "periodo"}, 
                    { "name": "disciplina"}, 
                    { "name": "Carga Horária", "field": "cargahoraria"}
                    ]
                };


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
                            }
                        });
                        if (Object.keys(alunoService.aluno).length==0){
                            $routeParams.matricula.length > 6?search($routeParams.matricula):vm._erro='Matrícula '+$routeParams.matricula+' inexistente!';
                            vm.completeBar();
                        }else{
                            $.extend(true,vm._model,alunoService.aluno);
                            vm.completeBar();
                        }
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
                    vm._model.foto.model.val = 'http://www.westcare.com.br/imagens/especialistas/perfil-sem-foto.jpg';
                };
                vm.imgCropErr = function(){
                    vm._model.foto.model.err = 'Erro!'
                };

                function topCollapse(){
                    $('html, body').animate({scrollTop: 0},'slow');
                }

                /* FUNÇÕES DE EDIÇÃO */
                vm.cancelEdit = function(){
                    vm._model = $.extend(true,{},vm._temp);
                    vm._temp = {};
                    vm.editing = false;
                };
                vm.editarAluno = function(){
                    vm._temp = $.extend(true,{},vm._model);
                    vm.editing = true;
                };
                vm.salvar = function(){
                    /* ROTA DE TRATAMENTO DO NODE */
                    vm.editing = false;  //SE VALIDAÇÃO OK

                };

                function search(matNome){
                    var search = $resource('/api/secretaria/aluno/:matNome').get({matNome: matNome}).$promise;
                    search
                        .then(
                        function (data) {
                            if (data.result.length > 0){
                                $.extend(true,vm._model,data.result[0]);
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

                /* VOLTAR MORE ALUNO */
                vm.moreAlunoVoltar = function(){
                    alunoService.aluno = {};
                    $location.path('/');
                };

                vm.disableAlert = function(){
                    vm._model.alert = false;
                };


                vm.completeBar = function(){
                    $timeout(function () {
                        $scope.progressbar.complete();
                        vm.loaded = true;
                    })
                };

                vm.loadRelatorio = loadRelatorio;
                vm.printRelatorio = printRelatorio;
                vm._templateRelatorio = "";
                vm._dataRelatorio = "";

                function loadRelatorio(item, model) {
                    vm._templateRelatorio = item.value;
                    vm._dataRelatorio = item.id;
                }

                function printRelatorio() {
                    window.open('/report?templateContent='+vm._templateRelatorio+'&data='+vm._dataRelatorio ,'_blank');
                }

            }])
})();
