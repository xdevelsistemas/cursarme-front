(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('msgBoletos', ['$scope', '$resource', 'breadCrumb', 'defineUnidade', 'modelStrings',
            function($scope, $resource, breadCrumb, defineUnidade, modelStrings) {

            /* jshint validthis: true */
            var vm = this,
                dadosTipoCursoPromise = $resource('/api/financeiro/dados-tipo-curso-msg-boletos/:id').get({"id": defineUnidade.getIdUnidade()}).$promise,
                templateMsgBoletosPromise = $resource('/api/financeiro/template-mensagem-boletos').get().$promise;

            // VARIÁVEIS COMUNS
            vm._model = {};
            vm.breadCrumb = breadCrumb;
            vm.breadCrumb.title = 'Mensagem Boletos';
            vm.disableTipoCurso = true;
            vm.disableCurso = true;
            vm.showTextareas = false;
            vm.STR = modelStrings;

            // VARIÁVEIS TIPO FUNÇÃO
            vm.changeCurso = changeCurso;
            vm.changeTipoCurso = changeTipoCurso;
            vm.changeTurma = changeTurma;
            vm.limpar = limpar;
            vm.salvar = salvar;

            //Requisições
            templateMsgBoletosPromise
                .then(function(data) {
                    vm._model = data.template;

                    dadosTipoCursoPromise
                        .then(function(data) {
                            vm._model.tipoCurso.list = data.list;
                        })
                        .catch(function(error) {
                            //TOdo tratar error
                        });
                })
                .catch(function(error) {
                    //TOdo tratar error
                });

            function changeTipoCurso(item, model) {
                limpaTextAreasMsg();
                limpaCurso();
                limpaTurma();

                vm._model.curso.list = item.cursos;
                vm.disableTipoCurso = false;
                vm.disableCurso = true;
                vm.showTextareas = false;
            }

            function changeCurso(item, model) {
                limpaTextAreasMsg();
                limpaTurma();

                vm._model.turma.list = item.turmas;
                vm.disableCurso = false;
                vm.showTextareas = false;
            }

            function changeTurma(item, model) {
                limpaTextAreasMsg();

                vm.showTextareas = true;
            }

            function limpaCurso() {
                vm._model.curso.list = [];
                vm._model.curso.model.val = "";
            }

            function limpaTurma() {
                vm._model.turma.list = [];
                vm._model.turma.model.val = "";
            }

            function limpar(obj) {
                obj.model.val = '';
            }

            function limpaTextAreasMsg() {
                vm._model.compensacao.model.val = "";
                vm._model.compensacao.model.err = "";
                vm._model.sacado.model.val = "";
                vm._model.sacado.model.err = "";
                vm._model.atraso.model.val = "";
                vm._model.atraso.model.err = "";
            }

            function salvar(obj) {
                var saveMsgBoletosPromise = $resource('/api/financeiro/save-mensagem-boletos').save({}, {
                    "model": obj, "STR": vm.STR
                }).$promise;

                saveMsgBoletosPromise
                    .then(function(data){
                        vm._model[data.model.name].model = data.model.model;
                    })
                    .catch(function(error){
                        //TOdo tratar error
                    });
            }
        }]);
})();