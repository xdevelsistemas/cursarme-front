(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('adicionarCurso', ['$scope', '$resource', 'breadCrumb', '$timeout', function($scope, $resource, breadCrumb, $timeout){

            var vm = this;

            breadCrumb.title = 'Adicionar Curso';

            vm._model = {
                "curso": {
                    "label": "Curso",
                    "type": "text",
                    "val": "Teste1",
                    "name": "curso",
                    "model": {"val": "", "err": ""}
                },
                "codigoCurso": {
                    "label": "Código",
                    "type": "text",
                    "val": "Teste1",
                    "name": "codigoCurso",
                    "model": {"val": "", "err": ""}
                },
                "tipo": {
                    "label": "Tipo",
                    "type": "select",
                    "name": "tipo",
                    "placeholder": "Selecione...",
                    "model": {"val": "", "err": ""},
                    "list": []
                },
                "area": {
                    "label": "Área",
                    "type": "select",
                    "name": "area",
                    "placeholder": "Selecione...",
                    "model": {"val": "", "err": ""},
                    "list": []
                },
                "turno": {
                    "label": "Turno",
                    "type": "select",
                    "name": "turno",
                    "placeholder": "Selecione...",
                    "model": {"val": "", "err": ""},
                    "list": []
                },
                "vagasTurma": {
                    "label": "Vagas/Turma",
                    "type": "text",
                    "val": "Teste1",
                    "name": "vagasTurma",
                    "model": {"val": "", "err": ""}
                },
                "cargaHoraria": {
                    "label": "Carga Horária",
                    "type": "text",
                    "val": "Teste1",
                    "name": "cargaHoraria",
                    "model": {"val": "", "err": ""}
                },
                "nome": {
                    "label": "Nome",
                    "type": "select",
                    "name": "nome",
                    "placeholder": "Selecione...",
                    "model": {"val": "", "err": ""},
                    "list": []
                },
                "codigo": {
                    "label": "Código",
                    "type": "text",
                    "val": "Teste1",
                    "name": "codigo",
                    "model": {"val": "", "err": ""}
                },
                "habilitacao": {
                    "label": "Habilitação",
                    "type": "text",
                    "val": "Teste1",
                    "name": "habilitacao",
                    "model": {"val": "", "err": ""}
                },
                "autorizacao": {
                    "label": "Autorização",
                    "type": "text",
                    "val": "Teste1",
                    "name": "autorizacao",
                    "model": {"val": "", "err": ""}
                },
                "reconhecimento": {
                    "label": "Reconhecimento",
                    "type": "text",
                    "val": "Teste1",
                    "name": "reconhecimento",
                    "model": {"val": "", "err": ""}
                },
                "obsAval": {
                    "label": "Obs. de Avaliação",
                    "type": "text",
                    "name": "obsAval",
                    "model": {"val": "", "err": ""}
                },
                "modalCriterio": {
                    "label": "Critério",
                    "type": "text",
                    "name": "modalCriterio",
                    "model": {"val": "", "err": ""}
                },
                "modalObs": {
                    "label": "Obs",
                    "type": "text",
                    "name": "modalObs",
                    "model": {"val": "", "err": ""}
                }
            };
            vm.adicionarCriterio = adicionarCriterio;
            vm.adicionarCurso = adicionarCurso;
            vm.fecharCriterios = fecharCriterios;
            vm.limpar = limpar;
            vm.modalCriterios = modalCriterios;
            vm.salvarCriterios = salvarCriterios;
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