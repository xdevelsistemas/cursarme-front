(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('adicionarCurso', ['$scope', '$resource', 'breadCrumb', '$timeout', '$route', 'modelStrings', 'defineUnidade',
            function($scope, $resource, breadCrumb, $timeout, $route, modelStrings, defineUnidade){

            var vm = this,
                dadosAddCurso = $resource('/api/secretaria/dados-add-curso/:id').get({"id": defineUnidade.getIdUnidade()}).$promise,
                templateAddCurso = $resource('/api/secretaria/template-add-curso/:id').get({"id": defineUnidade.getIdUnidade()}).$promise;

            //VARIÁVEIS COMUNS
            breadCrumb.title = 'Adicionar Curso';
            vm._model = {};
            vm.editing = false;
            vm.objEditing = {};
            vm.STR = modelStrings;
            vm.tableCriterios = {};
            vm.tableCursos = {
                "id": "tabelaCursos",
                "class": "table table-striped table-hover table-bordered",
                "dataTable": {},
                "head": [],
                "list": []};

            //VARIÁVEIS TIPO FUNÇÃO
            vm.adicionarCriterio = adicionarCriterio;
            vm.adicionarCurso = adicionarCurso;
            vm.cancelar = cancelar;
            vm.changeArea = changeArea;
            vm.changeTipo = changeTipo;
            vm.editar = editar;
            vm.fecharCriterios = fecharCriterios;
            vm.limpar = limpar;
            vm.modalCriterios = modalCriterios;
            vm.modalPeriodos = modalPeriodos;
            vm.salvarCurso = salvarCurso;

            //Requisições
            templateAddCurso
                .then(function(data) {
                    vm._model = data.template;
                    //
                    $.extend(true, vm.tableCursos, data.tables.tableCursos);
                    vm.tableCursos.list.forEach(function(el) {
                        el.ibtn.list[0].click = editar;
                    });
                    //
                    $.extend(true, vm.tableCriterios, data.tables.tableCriterios);

                    dadosAddCurso
                        .then(function(dataA) {
                            vm._model.tipo.list = dataA.list;
                        })
                        .catch(function(error) {
                            // TOdo tratar error
                        });
                })
                .catch(function(error) {
                    // TOdo tratar error
                });

            // Funções
            function adicionarCriterio() {
                if(vm._model.modalCriterio.model.val.length > 0){
                    vm._model.modalCriterio.model.err = "";
                    vm.tableCriterios.list.push({
                        'acriterio': vm._model.modalCriterio.model.val,
                        'bobs': vm._model.modalObs.model.val,
                        'cbtn': vm.tableCriterios.btnRemove
                    });
                    vm._model.modalCriterio.model.val = '';
                    vm._model.modalObs.model.val = '';
                }else{
                    vm._model.modalCriterio.model.err = "Campo obrigatório!"
                }
            }

            function adicionarCurso() {
                var getIdCursoPromise = $resource('/api/secretaria/get-id-curso').get().$promise;

                getIdCursoPromise
                    .then(function(data) {
                        vm._model.codigoCurso.model.val = data.idCurso;
                        vm.editing = true;
                    })
                    .catch(function(error) {
                        // TOdo tratar error
                    });
            }

            function cancelar() {
                limpar();
                vm.editing = false;
            }

            function changeArea(item, model) {
                disableModelTurno();

                vm.disableTurno = false;
                vm._model.turno.list = item.turnos;
            }

            function changeTipo(item, model) {
                disableModelArea();
                disableModelTurno();

                vm.disableArea = false;
                vm.disableTurno = true;
                vm._model.area.list = item.areas;
            }

            function disableModelArea() {
                vm._model.area.list = [];
                vm._model.area.model = {"val": "", "err": ""};
            }

            function disableModelTurno() {
                vm._model.turno.list = [];
                vm._model.turno.model = {"val": "", "err": ""}
            }

            function editar(args, obj) {
                vm.objEditing = obj;
                vm.dadosCursoEdit = vm.tableCursos.listComp.filter(
                    function(el) {
                        return el.codigoCurso.model.val == obj.acodigo
                    }
                )[0];
                $.extend(true, vm._model, vm.dadosCursoEdit);
                //
                vm.tableCriterios.list = vm._model.tableCriterios;
                vm.tableCriterios.btnRemove.list[0].click = removeCriterio;
                //
                vm.tableCriterios.list.forEach(function(el) {
                    el.cbtn = vm.tableCriterios.btnRemove;
                });

                vm.changeTipo($.grep(vm._model.tipo.list, function (e) {
                    return e.id == vm.dadosCursoEdit.tipo.model.val;
                })[0], vm.dadosCursoEdit.tipo.model.val);

                vm.changeArea($.grep(vm._model.area.list, function (e) {
                    return e.id == vm.dadosCursoEdit.area.model.val;
                })[0], vm.dadosCursoEdit.area.model.val);

                vm._model.area.model.val = vm.dadosCursoEdit.area.model.val;
                vm._model.turno.model.val = vm.dadosCursoEdit.turno.model.val;

                vm.editing = true;
            }

            function fecharCriterios() {
                vm._model.modalCriterio.model.val = '';
                vm._model.modalCriterio.model.err = '';
                vm._model.modalObs.model.val = '';
                $('#modalCritAval').modal('toggle');
            }

            function limpar() {
                vm._model.curso.model.val = '';
                vm._model.codigoCurso.model.val = '';
                vm._model.tipo.model.val = '';
                vm._model.area.model.val = '';
                vm._model.turno.model.val = '';
                vm._model.vagasTurma.model.val = '';
                vm._model.cargaHoraria.model.val = '';
                vm._model.periodo.model.val = '';
                vm._model.habilitacao.model.val = '';
                vm._model.autorizacao.model.val = '';
                vm._model.reconhecimento.model.val = '';
                vm._model.obsAval.model.val = '';
                vm._model.modalCriterio.model.val = '';
                vm._model.modalObs.model.val = '';
                vm.tableCriterios.list = [];
            }

            function modalCriterios() {
                $('#modalCritAval').modal({
                    backdrop: 'static',
                    keyboard: false
                })
            }

            function modalPeriodos() {
                $('#modalPeriodo').modal({
                    backdrop: 'static',
                    keyboard: false
                })
            }

            function removeCriterio(args,obj) {
                vm.tableCriterios.list.splice(vm.tableCriterios.list.indexOf(obj),1)
            }

            function salvarCurso() {
                var saveDadosCursoPromise = $resource('/api/secretaria/save-dados-curso').save({}, {
                    "model": vm._model, "STR": vm.STR, "tableCriterios": vm.tableCriterios
                }).$promise;

                saveDadosCursoPromise
                    .then(function(data) {
                        if (data.success) {
                            limpar();
                            $.extend(true, vm.tableCursos, data.tableCursos);
                            vm.tableCursos.list[vm.tableCursos.list.length-1].ibtn.list[0].click = editar;
                            vm.editing = false;

                            // Recarrega o controller
                            $timeout(function () {
                                $route.reload();
                            }, 0); // 0 ms de delay para recarregar a página.
                        } else {
                            $.extend(true, vm._model, data.model)
                        }
                    })
                    .catch(function(error) {
                        // TOdo tratar error
                    });
            }


        }])
})();