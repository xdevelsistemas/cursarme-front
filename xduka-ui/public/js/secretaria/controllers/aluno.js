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
                        number: '1',
                        active: true,
                        target: '#home'
                    },
                    {
                        text: 'Endereço',
                        number: '2',
                        active: false,
                        target: '#endereco'
                    },
                    {
                        text: 'Documentação',
                        number: '3',
                        active: false,
                        target: '#documentacao'
                    },
                    {
                        text: 'Grade/Disciplinas',
                        number: '4',
                        active: false,
                        target: '#gradeDisc'
                    },
                    {
                        text: 'Notas',
                        number: '5',
                        active: false,
                        target: '#notas'
                    },
                    {
                        text: 'Histórico',
                        number: '6',
                        active: false,
                        target: '#historico'
                    },
                    {
                        text: 'Log',
                        number: '7',
                        active: false,
                        target: '#log'
                    },
                    {
                        text: 'Parcelas',
                        number: '8',
                        active: false,
                        target: '#parcelas'
                    }
                ]
            }])
})();
