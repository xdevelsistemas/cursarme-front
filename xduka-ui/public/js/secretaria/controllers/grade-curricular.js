(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('aulasDadas', ['$scope', '$resource', '$timeout', '$route', 'breadCrumb', 'modelStrings', 'defineUnidade', 'modelMenu', '$location', 'alunoService', 'ngProgressFactory', 'dataUser',
        function($scope, $resource, $timeout, $route, breadCrumb, modelStrings, defineUnidade, modelMenu, $location, alunoService, ngProgressFactory, dataUser) {

            /* jshint validthis: true */
            var vm = this;

            /* PROGRESS BAR */
            $scope.progressbar = ngProgressFactory.createInstance();
            $scope.progressbar.setColor('#45A0CF');
            $scope.progressbar.start();

            var gradeCurricularPromise = $resource('/api/secretaria/template-grade-curricular').get().$promise;
            var dadosDiscGradCurricPromise = $resource('/api/secretaria/dados-grade-curricular').get().$promise;

            // VARIÁVEIS COMUNS
            vm._model = {};
            vm._modalGrade = {};
            vm._modalDisciplina = {};

            vm.tableCronograma = {
                id: 'tableCronograma',
                columnDefs: []
            };

            //Variáveis de funções
            vm.limpar = limpaCampos;
            vm.salvar = salvar;
            vm.voltar = voltar;

            // Requisições
            gradeCurricularPromise
                .then(function(data){
                    vm.tableCronograma.columnDefs = data.grid.columnDefs;
                    vm._model = data.template;
                    vm._modalGrade = data.modalGrade;
                    vm._modalDisciplina = data.modalDisciplina;
                })
                .catch(function(err){
                    console.log(err);
                });

            dadosDiscGradCurricPromise
                .then(function(data){
                    vm.tableCronograma.data = data.cronograma.data;
                })
                .catch(function(err){
                    console.log(err);
                });

            // Funções do controller
            function _validaCampos(list){
                var ret = true;
                for(var i in list){
                    if(!list[i].model.val){
                        list[i].model.err = 'Campo obrigatório!';
                        ret = false;
                    }else{
                        list[i].model.err = '';
                    }
                }
                return ret;
            }

            function limpaCampos(list){
                var el;
                for(el in list){
                    if(angular.isDefined(list[el].model)){
                        list[el].model.val = "";
                        list[el].model.err = "";
                    }
                }
            }

            function salvarGrade(){
                if(_validaCampos(vm._modalGrade)){
                    $resource('/api/secretaria/save-dados-grade-curricular').save({}, vm._modalGrade).$promise
                        .then(function(data){
                            if (data.success) {
                                limpaCampos(vm._modalGrade);
                                vm._model.grade.list = data.dados;
                                $('#modalGrade').modal('hide');
                            } else {
                                _validaModalGrade();
                            }
                        })
                        .catch(function(err){
                            console.log(err);
                        });
                }
            }

            function salvarDisciplinaGrade(){
                if(_validaCampos()){
                    $resource('/api/secretaria/dados-disciplinas-curricular').save({}, vm._modalDisciplina).$promise
                        .then(function(data){
                            if (data.success) {
                                limpaCampos(vm._modalDisciplina);
                                vm.tableCronograma.data = data.dados;
                                $('#modalDisciplina').modal('hide');
                            } else {
                                _validaModalDisciplina();
                            }
                        })
                        .catch(function(err){
                            console.log(err);
                        });
                }
            }

            function voltar(){
                $location.path('/pedagogico');
                $location.replace();
            }

            $scope.progressbar.complete();
        }]);
})();