(function(){
    'use strict';


    angular.module('app.controllers')
        .controller('aluno', ['$scope', '$resource', '$route', 'breadCrumb', 'tipoTelefone', '$timeout', 'modelStrings',
            function($scope, $resource, $route, breadCrumb, tipoTelefone, $timeout, modelStrings){

                var vm = this
                    , alunosPromise = $resource('/api/secretaria/aluno').get().$promise;

                breadCrumb.title = 'Aluno';

                // ==== MODELOS ==== //

                vm._model = {};

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

                vm._model.dados = {
                    nome: {
                        label: 'Nome',
                        model: {val: ''},
                        type: 'text'
                    },
                    matricula: {
                        label: 'Matrícula',
                        model: {val: ''},
                        type: 'text'
                    },
                    dataMatricula: {
                        label: 'Data de Matrícula',
                        model: {val: ''},
                        type: 'text'
                    },
                    sexo: {
                        label: 'Sexo',
                        model: {val: ''},
                        type: 'select'
                    },
                    dataNasc: {
                        label: 'Nascimento',
                        model: {val: ''},
                        type: 'text'
                    },
                    rg: {
                        label: 'RG',
                        model: {val: ''},
                        type: 'text'
                    },
                    cpf: {
                        label: 'CPF',
                        model: {val: ''},
                        type: 'text'
                    },
                    email: {
                        label: 'E-mail',
                        model: {val: ''},
                        type: 'text'
                    },
                    telefone: {
                        label: 'Telefone',
                        model: {val: ''},
                        type: 'text'
                    },
                    cidadeUf: {
                        label: 'Cidade/UF',
                        model: {val: ''},
                        type: 'text'
                    },
                    cursoTurma: {
                        label: 'Curso/Turma',
                        model: {val: ''},
                        type: 'text'
                    },
                    relatorio: {
                        label: '',
                        model: {val: ''},
                        type: 'text'
                    }
                };
            }])
})();
