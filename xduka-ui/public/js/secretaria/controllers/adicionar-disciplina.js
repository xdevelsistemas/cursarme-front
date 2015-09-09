(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('adicionarDisciplina', ['$scope', '$resource', 'breadCrumb', '$timeout', function($scope, $resource, breadCrumb, $timeout){

            var vm = this,
                templateAddDisciplina = $resource('/api/secretaria/template-add-disciplina').get().$promise;


            // VARIÁVEIS COMUNS
            breadCrumb.title = 'Adicionar Disciplina';
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
            vm.modalEditarDisciplinas = modalEditarDisciplinas;
            vm.modalSalvar = modalSalvar;
            vm.salvar = salvar;
            vm.selectDiscModal = selectDiscModal;

            // Requisições
            templateAddDisciplina
                .then(function(data) {
                    vm._model = data.template;

                    var list = vm._model.nome.list[0];
                    vm._model.nome.list = data.dadosAddDisciplina;
                    vm._model.nome.list.push(list);

                    vm._bkp = $.extend(true, {}, vm._model);
                })
                .catch(function(error) {
                    // TOdo tratar error
                });

            // Funções

            function alteraEditDisc() {
                if(vm._model.editarNome.model.val != ''){
                    if(vm._model.editarNome.model.val != vm._model.nome.list[vm._model.nome.list.indexOf(vm.editingObj)].text) {
                        vm._model.nome.list[vm._model.nome.list.indexOf(vm.editingObj)].text = vm._model.editarNome.model.val;
                        $('#modalEditDisc').modal('toggle');
                        limpaCamposModalEdit();
                        vm.editing = true;

                    } else {
                        vm._model.editarNome.model.err = 'O nome da disciplina continua o mesmo!';
                    }
                }else{
                    vm._model.editarNome.model.err = 'Campo obrigatório!';
                }
            }

            function cadastrarNovo(item,model) {
                if (model=='0'){
                    vm._model.addNome.label = item.label;
                    vm._model.addNome.ref = item.ref;
                    $('#modalCadastrarNovo').modal('show');
                }
            }

            function cancelar(tmp) {
                vm._model = $.extend(true,{}, tmp);
                vm.editing = false;
                vm.editingObj = {};
                vm.editingModal = false;
            }

            function cancelEditar() {
                limpaCamposModalEdit();
                vm.editingObj = {};
                $('#modalEditDisc').modal('toggle');
            }

            function modalEditarDisciplinas() {
                vm._model.editarSelectNome.list = vm._model.nome.list.slice(0, vm._model.nome.list.length-1);

                $('#modalEditDisc').modal({
                    backdrop: 'static',
                    keyboard: false
                })
            }

            function modalSalvar() {
                if(vm._model.addNome.model.val.length){
                    var ultimoElem = vm._model.nome.list.pop(vm._model.nome.list.length-1);

                    vm._model.nome.list.unshift({
                        id: "disciplina"+new Date().getTime(),
                        text: vm._model.addNome.model.val
                    });
                    vm._model.nome.list.sort(sortObject);
                    vm._model.nome.list.push(ultimoElem);

                    vm._model.addNome.model.val = '';
                    vm._model.addNome.model.err = '';
                    vm.editing = true;
                    $('#modalCadastrarNovo').modal('toggle');
                }else{
                    vm._model.addNome.model.err = 'Campo obrigatório!';
                }
            }

            function sortObject(a,b) {
                return a.text.toLowerCase() < b.text.toLowerCase() ?
                    -1 :
                    a.text.toLowerCase() > b.text.toLowerCase() ?
                        1 :
                        0;
            }

            function limpaCamposModalEdit() {
                vm._model.editarSelectNome.model.val = "";
                vm._model.editarNome.model.val = "";
                vm._model.editarNome.model.err = '';
                vm.editingModal = false;
            }

            function removeDisciplina(args,event){
                //todo remover da tabela
            }

            function salvar() {
                var saveDisciplinasPromise = $resource('/api/secretaria/save-dados-disciplinas').save({}, {
                    "model": vm._model
                }).$promise;

                saveDisciplinasPromise
                    .then(function(data) {
                        if (data.success) {
                            // TOdo mostrar uma msg de sucesso
                            cancelar(data.model);
                            vm._model.nome.model.val = "";
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

        }])
})();