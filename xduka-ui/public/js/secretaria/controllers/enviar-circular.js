(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('enviarCircular', ['$scope', '$resource', 'breadCrumb', '$timeout', 'modelStrings',
            function($scope, $resource, breadCrumb, $timeout, modelStrings){

            var vm = this,
                dadosEnviarCircular = $resource('/api/secretaria/dados-enviar-circular').get().$promise,
                templateEnviarCircular = $resource('/api/secretaria/template-enviar-circular').get().$promise;

            // VARIÁVEIS COMUNS
            breadCrumb.title = 'Enviar Circular';
            vm._model = {}; //todo pegar arquivo anexado e enviar para o node
            vm.disableTurma = true;
            vm.disableDisciplina = true;
            vm.STR = modelStrings;

            // VARÍVEIS TIPO FUNÇÃO
            vm.changeCurso = changeCurso;
            vm.changeTurma = changeTurma;
            vm.limpar = limpar;
            vm.salvar = salvar;

            // Requisições
            templateEnviarCircular
                .then(function(data) {
                    vm._model = data.template;

                    //
                    dadosEnviarCircular
                        .then(function(dataA) {
                            vm._model.curso.list = dataA.list;
                        })
                        .catch(function(error) {
                            // TOdo tratar error
                        });
                })
                .catch(function(error) {
                    // TOdo tratar error
                });

            function changeCurso(item, model) {
                disableModelTurma();
                disableModelDisciplina();

                vm._model.turma.list = item.turmas;

                vm.disableTurma = false;
                vm.disableDisciplina = true;
            }

            function changeTurma(item, model) {
                disableModelDisciplina();

                vm._model.disciplina.list = item.disciplinas;

                vm.disableDisciplina = false;
            }

            function disableModelTurma() {
                vm._model.turma.list = [];
                vm._model.turma.model.val = "";
            }

            function disableModelDisciplina() {
                vm._model.disciplina.list = [];
                vm._model.disciplina.model.val = "";
            }

            function limpar() {
                vm._model.curso.model.val = '';
                vm._model.turma.model.val = '';
                vm._model.disciplina.model.val = '';
                vm._model.titulo.model.val = '';
                vm._model.numero.model.val = '';
                vm._model.data.model.val = '';
                vm._model.texto.model.val = '';
            }

            function salvar() {
                //todo post salvamento

                var saveEnviarCircular = $resource('/api/secretaria/save-enviar-circular').save({}, {
                    "model": vm._model, "STR": vm.STR
                }).$promise;

                saveEnviarCircular
                    .then(function(data) {
                        if (data.success) {
                            limpar();
                        } else {
                            $.extend(true, vm._model, data.model);
                        }
                    })
                    .catch(function(error) {
                        // TOdo tratar error
                    })
            }
        }])
})();