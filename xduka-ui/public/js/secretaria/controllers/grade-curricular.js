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

            // VARIÁVEIS COMUNS
            vm._model = {};
            vm._modalGrade = {};
            vm._modalDisciplina = {};
            vm.STR = modelStrings;

            // disable select
            vm.disableArea = true;
            vm.disableCurso = true;
            vm.disableGrade = true;
            vm.showGrid = true;
            vm.disableAreaModal = true;
            vm.disableCursoModal = true;
            vm.disableGradeModal = true;

            // ui-grid control
            vm.tableCronograma = {
                id: 'tableCronograma',
                columnDefs: []
            };

            // VARIÁVEIS FUNÇÕES
            vm.addDisc = addDisc;
            vm.cancelAddGrade = cancelAddGrade;
            // select do template
            vm.changeArea = changeArea;
            vm.changeCurso = changeCurso;
            vm.changeGrade = changeGrade;
            vm.changeTipoCurso = changeTipoCurso;
            // select do modalGrade
            vm.changeAreaModal = changeAreaModal;
            vm.changeCursoModal = changeCursoModal;
            vm.changeTipoCursoModal = changeTipoCursoModal;
            //
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

            function cancelAddGrade(){
                limpaCampos(vm._modalGrade);
                vm._model.grade.model.val = "";
                $("#modalAddGrade").modal("hide");
                return true;
            }
            
            function limpaCampos(objeto){
                var el;
                for(el in objeto){
                    if(!!objeto[el].model){
                        objeto[el].model.val = "";
                        objeto[el].model.err = "";
                    }
                }
            }

            // tipoCurso _model
            function changeTipoCurso(item, model) {
                vm._model.tipoCurso.model.err = '';
                vm.disableArea = false;
                vm.disableCurso = true;
                vm.disableGrade = true;
                vm.showGrid = true;
                vm.tableCronograma.data = [];

                $resource('/api/secretaria/template-area-grade-curricular/:id').get({"id": model}).$promise
                    .then(function(data){
                        if (data.success) {
                            vm._model.area.list = data.list;
                        }
                    })
                    .catch(function(err){
                        console.log(err);
                    });

                defineModel(vm._model.area);
                defineModel(vm._model.curso);
                defineModel(vm._model.grade);
            }

            // tipoCurso _modalGrade
            function changeTipoCursoModal(item, model) {
                vm.disableAreaModal = false;
                vm.disableCursoModal = true;
                vm.disableGradeModal = true;

                $resource('/api/secretaria/template-area-grade-curricular/:id').get({"id": model}).$promise
                    .then(function(data){
                        if (data.success) {
                            vm._modalGrade.area.list = data.list;
                        }
                    })
                    .catch(function(err){
                        console.log(err);
                    });

                defineModel(vm._modalGrade.area);
                defineModel(vm._modalGrade.curso);
                defineModel(vm._modalGrade.nome);
            }

            // area _model
            function changeArea(item, model) {
                vm._model.area.model.err = '';
                vm.disableCurso = false;
                vm.disableGrade = true;
                vm.showGrid = true;
                vm.tableCronograma.data = [];

                $resource('/api/secretaria/template-curso-grade-curricular/:id').get({"id": model}).$promise
                    .then(function(data){
                        if (data.success) {
                            vm._model.curso.list = data.list;
                        }
                    })
                    .catch(function(err){
                        console.log(err);
                    });

                defineModel(vm._model.curso);
                defineModel(vm._model.grade);
            }

            // area _modalGrade
            function changeAreaModal(item, model) {
                vm.disableCursoModal = false;
                vm.disableGradeModal = true;

                $resource('/api/secretaria/template-curso-grade-curricular/:id').get({"id": model}).$promise
                    .then(function(data){
                        if (data.success) {
                            vm._modalGrade.curso.list = data.list;
                        }
                    })
                    .catch(function(err){
                        console.log(err);
                    });

                defineModel(vm._modalGrade.curso);
                defineModel(vm._modalGrade.nome);
            }

            // curso _model
            function changeCurso(item, model) {
                vm._model.curso.model.err = '';
                vm.disableGrade = false;
                vm.showGrid = true;
                vm.tableCronograma.data = [];

                $resource('/api/secretaria/template-grade-grade-curricular/:id').get({"id": model}).$promise
                    .then(function(data){
                        if (data.success) {
                            addGradeList(data.list);
                        }
                    })
                    .catch(function(err){
                        console.log(err);
                    });

                defineModel(vm._model.grade);
            }

            // curso _modalGrade
            function changeCursoModal(item, model) {
                vm.disableGradeModal = false;

                defineModel(vm._modalGrade.nome);
            }

            // grade _model
            function changeGrade(item, model) {
                vm._model.grade.model.err = '';
                vm.showGrid = true;
                vm.tableCronograma.data = [];

                if(item.id === "add"){
                    $("#modalAddGrade").modal({
                        backdrop: 'static',
                        keyboard: false
                    });

                    tranfDadosModal();
                    return true;
                }

                $resource('/api/secretaria/dados-grade-curricular/:id').get({"id": model}).$promise
                    .then(function(data){
                        if (data.success) {
                            vm.tableCronograma.data = data.data;
                        }
                    })
                    .catch(function(err){
                        console.log(err);
                    });

                return false;
            }

            function defineModel(objeto) {
                objeto.model = {"val": "", "err": ""};
            }

            // cópia sem referência dos objetos de _model para _modalGrade
            function tranfDadosModal() {
                // tipo curso
                vm._modalGrade.tipoCurso.list = withoutRef(vm._model.tipoCurso.list);
                vm._modalGrade.tipoCurso.model = withoutRef(vm._model.tipoCurso.model);

                // area
                vm.disableAreaModal = vm.disableArea;
                vm._modalGrade.area.list = withoutRef(vm._model.area.list);
                vm._modalGrade.area.model = withoutRef(vm._model.area.model);

                // curso
                vm.disableCursoModal = vm.disableCurso;
                vm._modalGrade.curso.list = withoutRef(vm._model.curso.list);
                vm._modalGrade.curso.model = withoutRef(vm._model.curso.model);

                // nome grade
                vm.disableGradeModal = !vm._modalGrade.curso.model.val;
            }

            function withoutRef(objeto) {
                return JSON.parse(JSON.stringify(objeto));
            }

            function addGradeList(list) {
                vm._model.grade.list = list;
                vm._model.grade.list.unshift({
                    id: "add",
                    text: "Adicionar Grade"
                });
            }

            // salva uma nova grade sem as disciplinas
            function salvarGrade(){
                if(_validaCampos(vm._modalGrade)){
                    $resource('/api/secretaria/save-dados-grade-curricular').save({}, vm._modalGrade).$promise
                        .then(function(data){
                            if (data.success) {
                                addGradeList(data.list);
                                vm._model.grade.model.val = vm._modalGrade.nome.model.val;
                                vm.tableCronograma.data = [];
                                $('#modalAddGrade').modal('hide');
                                limpaCampos(vm._modalGrade);
                            } else {
                                _validaCampos(vm._modalGrade);
                            }
                        })
                        .catch(function(err){
                            console.log(err);
                        });
                }
            }

            // salva uma disciplina para a grade selecionada
            function salvarDisciplinaGrade(){
                if(_validaCampos(vm._modalDisciplina)){
                    $resource('/api/secretaria/save-dados-disciplinas-curricular').save({}, {
                        "grade": vm.gradeAtual, "model": vm._modalDisciplina
                    }).$promise
                        .then(function(data){
                            if (data.success) {
                                limpaCampos(vm._modalDisciplina);
                                vm.tableCronograma.data = data.dados;
                                $('#modalAddDisc').modal('hide');
                            } else {
                                _validaCampos(vm._modalDisciplina);
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