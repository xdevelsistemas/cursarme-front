(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('materialComplementar', ['$scope', '$resource', 'breadCrumb', '$timeout', 'modelStrings', 'defineUnidade',
            function($scope, $resource, breadCrumb, $timeout, modelStrings, defineUnidade){

            var vm = this,
                dadosMaterialCompPromise = $resource('/api/secretaria/dados-material-complementar/:id').get({"id": defineUnidade.getIdUnidade()}).$promise,
                templateMaterialComp = $resource('/api/secretaria/template-material-complementar').get().$promise;

            // VARIÁVEIS COMUNS
            breadCrumb.title = 'Material Complementar';
            vm._model = {}; //todo pegar arquivo anexado e enviar para o node
            vm.disableDisciplina = true;
            vm.disableTurma = true;
            vm.STR = modelStrings;

            // VARIÁVEIS TIPO FUNÇÃO
            vm.changeCurso = changeCurso;
            vm.changeTurma = changeTurma;
            vm.limpar = limpar;
            vm.salvar = salvar;

            // Requisições
            templateMaterialComp
                .then(function(data) {
                    vm._model = data.template;

                    // Buscando dados de cursos referente à unidade
                    dadosMaterialCompPromise
                        .then(function(dataA) {
                            vm._model.curso.list = dataA.list;
                        })
                        .catch(function(error) {
                            // TOdo tratar error
                        })
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
                vm._model.curso.model.err = '';
                vm._model.turma.model.val = '';
                vm._model.turma.model.err = '';
                vm._model.disciplina.model.val = '';
                vm._model.disciplina.model.err = '';
                vm._model.titulo.model.val = '';
                vm._model.titulo.model.err = '';
                vm._model.numero.model.val = '';
                vm._model.numero.model.err = '';
                vm._model.data.model.val = '';
                vm._model.data.model.err = '';
                vm._model.texto.model.val = '';
                vm._model.texto.model.err = '';
                vm.disableTurma = true;
                vm.disableDisciplina = true;
            }

            function salvar() {
                var saveDadosMaterialCompPromise = $resource('/api/secretaria/save-material-complementar').save({}, {
                    "model": vm._model, "STR": vm.STR
                }).$promise;

                saveDadosMaterialCompPromise
                    .then(function(data) {
                        if (data.success) {
                            limpar();

                            // TOdo mostrar mensagem de sucesso | quando adicionado um novo material complementar

                        } else {
                            $.extend(true, vm._model, data.model);
                        }
                    })
                    .catch(function(error) {
                        // TOdo tratar error
                    });
            }

        }])
})();