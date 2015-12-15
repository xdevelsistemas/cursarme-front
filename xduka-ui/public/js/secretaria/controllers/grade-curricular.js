(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('gradeCurricular', ['$scope', '$resource', '$timeout', '$route', 'breadCrumb', 'modelStrings', 'defineUnidade', 'modelMenu', '$location', 'alunoService', 'ngProgressFactory', 'dataUser',
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
            vm.STR = modelStrings;

            // ui-grid control
            vm.tableCronograma = {
                id: 'tableCronograma',
                columnDefs: []
            };

            // VARIÁVEIS FUNÇÕES
            vm.addDisc = addDisc;
            vm.addGrade = addGrade;
            vm.cancelAddGrade = cancelAddGrade;
            vm.limpaCampos = limpaCampos;
            vm.salvarGrade = salvarGrade;
            vm.salvarDisciplina = salvarDisciplinaGrade;
            vm.voltar = voltar;

            // Requisições
            gradeCurricularPromise
                .then(function(data){
                    vm.tableCronograma.columnDefs = data.grid.columnDefs;
                    vm._model = data.template;
                    vm._modalGrade = data.modalGrade;
                    vm._modalDisciplina = data.modalDisciplina;

                    /* Adicionar grade */
                    vm._model.grade.list.unshift({
                        id: "add",
                        text: "Adicionar Grade"
                    });

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
            function _validaCampos(objeto){
                var ret = true;
                for(var i in objeto){
                    if(!objeto[i].model.val){
                        objeto[i].model.err = vm.STR.FIELD;
                        ret = false;
                    }else{
                        objeto[i].model.err = '';
                    }
                }
                return ret;
            }

            function addDisc(){
                if(!_validaCampos(vm._model)){
                    return false;
                }

                //obtendo a grade atual do select
                vm.gradeAtual = vm._model.grade.list.filter(function(el){return el.id === vm._model.grade.model.val})[0];

                $("#modalAddDisc").modal({
                    backdrop: 'static',
                    keyboard: false
                });
                return true;
            }

            function addGrade(line){
                if(line.id === "add"){
                    $("#modalAddGrade").modal({
                        backdrop: 'static',
                        keyboard: false
                    });
                    return true;
                }
                return false;
            }

            function cancelAddGrade(){
                limpaCampos(vm._modalGrade);
                vm._model.grade.model.val = "";
                $("#modalAddGrade").modal("hide");
                return true;
            }
            
            function limpaCampos(objeto){
                var el;
                for(el in objeto){
                    if(angular.isDefined(objeto[el].model)){
                        objeto[el].model.val = "";
                        objeto[el].model.err = "";
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
                if(_validaCampos(vm._modalDisciplina)){
                    $resource('/api/secretaria/dados-disciplinas-curricular').save({}, vm._modalDisciplina).$promise
                        .then(function(data){
                            if (data.success) {
                                limpaCampos(vm._modalDisciplina);
                                vm.tableCronograma.data = data.dados;
                                $('#modalAddDisc').modal('hide');
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