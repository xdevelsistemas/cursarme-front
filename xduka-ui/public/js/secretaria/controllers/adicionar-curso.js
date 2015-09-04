(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('adicionarCurso', ['$scope', '$resource', 'breadCrumb', '$timeout', function($scope, $resource, breadCrumb, $timeout){

            var vm = this,
                dadosAddCurso = $resource('/api/secretaria/dados-add-curso').get().$promise,
                templateAddCurso = $resource('/api/secretaria/template-add-curso').get().$promise;

            //VARIÁVEIS COMUNS
            breadCrumb.title = 'Adicionar Curso';
            vm._model = {};
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

            //VARIÁVEIS TIPO FUNÇÃO
            vm.adicionarCriterio = adicionarCriterio;
            vm.adicionarCurso = adicionarCurso;
            vm.changeArea = changeArea;
            vm.changeTipo = changeTipo;
            vm.fecharCriterios = fecharCriterios;
            vm.limpar = limpar;
            vm.modalCriterios = modalCriterios;
            vm.salvarCriterios = salvarCriterios;

            //Requisições
            templateAddCurso
                .then(function(data) {
                    vm._model = data.template;

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
                //todo post _model e validações
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

            function fecharCriterios() {
                vm._model.modalCriterio.model.val = '';
                vm._model.modalCriterio.model.err = '';
                vm._model.modalObs.model.val = '';
            }

            function limpar() {
                vm._model.curso.model.val = '';
                vm._model.codigoCurso.model.val = '';
                vm._model.tipo.model.val = '';
                vm._model.area.model.val = '';
                vm._model.turno.model.val = '';
                vm._model.vagasTurma.model.val = '';
                vm._model.cargaHoraria.model.val = '';
                vm._model.nome.model.val = '';
                vm._model.codigo.model.val = '';
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

            function removeCriterio(args,obj) {
                vm.tableCriterios.list.splice(vm.tableCriterios.list.indexOf(obj),1)
            }

            function salvarCriterios() {
                if(vm.tableCriterios.list.length > 0){
                    vm._model.modalCriterio.model.err = "";
                    vm._model.obsAval.model.val = vm.tableCriterios.list.length > 1?vm.tableCriterios.list.length+' Critérios':vm.tableCriterios.list[0].a;
                    vm._model.modalCriterio.model.val = "";
                    vm._model.modalObs.model.val = "";
                    $('#modalCritAval').modal('toggle');
                }else{
                    vm._model.modalCriterio.model.err = "Nenhum critério adicionado!"
                }
            }


        }])
})();