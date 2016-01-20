(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('adicionarDisciplina', ['$scope', '$resource', 'breadCrumb', '$timeout', '$route', 'defineUnidade', 'modelStrings',
            function($scope, $resource, breadCrumb, $timeout, $route, defineUnidade, modelStrings){

            var vm = this,
                templateAddDisciplina = $resource('/api/secretaria/template-add-disciplina/:id').get({"id": defineUnidade.getIdUnidade()}).$promise;

            // VARIÁVEIS COMUNS
            vm.STR = modelStrings;
            breadCrumb.title = vm.STR.ADDDISCIPLINA;
            vm._bkp = {};
            vm._model = {};
            vm.editing = false;
            vm.editingModal = false;
            vm.editingObj = {};

            // VARIÁVEIS TIPO FUNÇÃO
            vm.alteraEditDisc = alteraEditDisc;
            vm.cadastrarNovo = cadastrarNovo;
            vm.cancelar = cancelar;
            vm.cancelEditar = cancelEditar;
            vm.modalSalvar = modalSalvar;
            vm.salvar = salvar;
            vm.selectDiscModal = selectDiscModal;
            vm.tableNome = {
                "id": "tableNome",
                "dataTable": {},
                "head": ["Nome", ""],
                "list": []
            };

            // Requisições
            templateAddDisciplina
                .then(function(data) {
                    vm._model = data.template;

                    vm.tableNome.list = data.dadosAddDisciplina;
                    for(var i = 0; i < vm.tableNome.list.length; i++){
                        vm.tableNome.list[i].bbtn.list[0].click = tableClick;
                    }

                    vm._bkp = $.extend(true, {}, vm.tableNome);
                })
                .catch(function(error) {
                    // TOdo tratar error
                });

            // Funções

            function alteraEditDisc() {
                //todo
                if(vm._model.editarNome.model.val != ''){
                    if(vm._model.editarNome.model.val != vm.tableNome.list[vm.tableNome.list.indexOf(vm.editingObj)].anome) {
                        vm.tableNome.list[vm.tableNome.list.indexOf(vm.editingObj)].anome = vm._model.editarNome.model.val;
                        $('#modalEditDisc').modal('toggle');
                        limpaCamposModalEdit();
                        vm.editingObj = {};
                        vm.editing = true;

                    } else {
                        vm._model.editarNome.model.err = 'O nome da disciplina continua o mesmo!';
                    }
                }else{
                    vm._model.editarNome.model.err = 'Campo obrigatório!';
                }
            }

            function cadastrarNovo() {
                $('#modalCadastrarNovo').modal('show');
            }

            function cancelar(tmp) {
                vm.tableNome = $.extend(true,{}, tmp);
                vm.editing = false;
                vm.editingObj = {};
                vm.editingModal = false;
            }

            function cancelEditar() {
                limpaCamposModalEdit();
                vm.editingObj = {};
                $('#modalEditDisc').modal('toggle');
            }

            function modalSalvar() {
                if(vm._model.addNome.model.val.length){
                    vm.tableNome.list.unshift({
                        "anome": vm._model.addNome.model.val,
                        "bbtn": {
                            "btn": true,
                            "list": [{
                                "text": "",
                                "entypo": "entypo-pencil",
                                "class": "btn btn-white",
                                "title": "Editar",
                                "click": tableClick
                            }]
                        }
                    });
                    vm.tableNome.list.sort(sortObject);

                    vm._model.addNome.model.val = '';
                    vm._model.addNome.model.err = '';
                    vm.editing = true;
                    $('#modalCadastrarNovo').modal('toggle');
                }else{
                    vm._model.addNome.model.err = 'Campo obrigatório!';
                }
            }

            function sortObject(a,b) {
                return a.anome.toLowerCase() < b.anome.toLowerCase() ?
                    -1 :
                    a.anome.toLowerCase() > b.anome.toLowerCase() ?
                        1 :
                        0;
            }

            function limpaCamposModalEdit() {
                vm._model.editarNome.model.val = "";
                vm._model.editarNome.model.err = '';
                vm.editingModal = false;
            }

            function removeDisciplina(args,event){
                //todo remover da tabela
            }

            function salvar() {
                var saveDisciplinasPromise = $resource('/api/secretaria/save-dados-disciplinas').save({}, {
                    "tableNome": vm.tableNome
                }).$promise;

                saveDisciplinasPromise
                    .then(function(data) {
                        if (data.success) {
                            // TOdo mostrar uma msg de sucesso
                            cancelar(data.tableNome);

                            // Recarrega o controller
                            $timeout(function () {
                                $route.reload();
                            }, 0); // 0 ms de delay para recarregar a página.
                        }
                    })
                    .catch(function(error) {
                        // TOdo tratar error
                    });
            }

            function selectDiscModal(obj) {
                vm.editingObj = obj;
                vm._model.editarNome.model.val = obj.text;
                vm.editingModal = true;
            }

            function tableClick(args, line) {
                vm._model.editarNome.model.val = line.anome;
                vm.editingObj = line;

                $('#modalEditDisc').modal({
                    backdrop: 'static',
                    keyboard: false
                })
            }

        }])
})();