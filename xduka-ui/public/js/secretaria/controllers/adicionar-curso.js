(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('adicionarCurso', ['$scope', '$resource', 'breadCrumb', '$timeout', 'modelStrings',
            function($scope, $resource, breadCrumb, $timeout, modelStrings){

            var vm = this,
                dadosAddCurso = $resource('/api/secretaria/dados-add-curso').get().$promise,
                templateAddCurso = $resource('/api/secretaria/template-add-curso').get().$promise;

            //VARIÁVEIS COMUNS
            breadCrumb.title = 'Adicionar Curso';
            vm._model = {};
            vm.editing = false;
            vm.objEditing = {};
            vm.STR = modelStrings;
            vm.tableCriterios = {
                class: "table table-striped table-hover table-bordered",
                head: ["Critério", "Obs",""],
                list:[],
                btnRemove: {
                    btn: true,
                    list: [{
                        text: "",
                        click: removeCriterio,
                        class: "btn btn-danger btn-sm",
                        entypo: "entypo-cancel"
                    }]
                }
            };
            vm.tableCursos = {};

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
            vm.modalSalvar = modalSalvar;
            vm.salvarCurso = salvarCurso;

            //Requisições
            templateAddCurso
                .then(function(data) {
                    vm._model = data.template;
                    $.extend(true, vm.tableCursos, data.tableCursos);

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
                        'a': vm._model.modalCriterio.model.val,
                        'b': vm._model.modalObs.model.val,
                        'c': vm.tableCriterios.btnRemove
                    });
                    vm._model.modalCriterio.model.val = '';
                    vm._model.modalObs.model.val = '';
                }else{
                    vm._model.modalCriterio.model.err = "Campo obrigatório!"
                }
            }

            function adicionarCurso() {
                vm.editing = true;
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
                vm._model.area.model.val = "";
            }

            function disableModelTurno() {
                vm._model.turno.list = [];
                vm._model.turno.model.val = "";
            }

            function editar(args, obj) {
                vm.objEditing = obj;
                vm._model.curso.model.val = obj.acurso;
                vm._model.codigo.model.val = obj.bcodigo;
                vm._model.tipo.model.val = obj.ctipo;
                vm._model.area.model.val = obj.darea;
                vm._model.turno.model.val = obj.eturno;
                vm._model.vagasTurma.model.val = obj.fvagas;
                vm._model.cargaHoraria.model.val = obj.gcarga;
                vm._model.periodo.model.val = obj.hperiodo;
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
                vm._model.periodo.list = [];
                vm._model.addPeriodo.model.val = '';
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

            function modalSalvar() {
                if (vm._model.addPeriodo.model.val == "") {
                    vm._model.addPeriodo.model.err = vm.STR.FIELD;
                    return 0
                }

                vm._model.addPeriodo.model.err = '';

                vm._model.periodo.list.push({
                    "id": vm._model.periodo.list.length+1,
                    "text": vm._model.addPeriodo.model.val
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
                            vm.tableCursos.list[vm.tableCursos.list.length-1].hbtn.list[0].click = editar;
                            vm.editing = false;
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