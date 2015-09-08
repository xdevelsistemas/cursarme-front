(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('adicionarDisciplina', ['$scope', '$resource', 'breadCrumb', '$timeout', function($scope, $resource, breadCrumb, $timeout){

            var vm = this,
                templateAddDisciplina = $resource('/api/secretaria/template-add-disciplina').get().$promise;

            breadCrumb.title = 'Adicionar Disciplina';

            vm._model = {};
            vm.cadastrarNovo = cadastrarNovo;
            vm.cancelar = cancelar;
            vm.cancelEditar = cancelEditar;
            vm.editing = false;
            vm.editingModal = false;
            vm.editingObj = {};
            vm.modalEditarDisciplinas = modalEditarDisciplinas;
            vm.modalSalvar = modalSalvar;
            vm.salvar = salvar;

            templateAddDisciplina
                .then(function(data) {
                    vm._model = data.template;
                })
                .catch(function(error) {
                    // TOdo tratar error
                });
            vm.salvarEditDisc = salvarEditDisc;
            vm.selectDiscModal = selectDiscModal;

            function cadastrarNovo(item,model) {
                if (model=='0'){
                    vm._model.addNome.label = item.label;
                    vm._model.addNome.ref = item.ref;
                    $('#modalCadastrarNovo').modal('show');
                }
            }

            function cancelar() {
                vm._model = $.extend(true,{}, vm._bkp);
                vm.editing = false;
                vm.editingObj = {};
                vm.editingModal = false;
            }

            function cancelEditar() {
                vm._model.editarNome.model.val = '';
                vm._model.editarSelectNome.model.val = '';
                vm.editingObj = {};
                vm.editingModal = false;
                $('#modalEditDisc').modal('toggle');
            }

            function modalEditarDisciplinas() {
                var i;
                for (i = 0; i < vm._model.nome.list.length; i++) { //adicionando disciplinas cadastradas no select do modal
                    //todo molhorar semântica
                    if( vm._model.nome.list[i] != vm._model.nome.list[vm._model.nome.list.length-1] &&
                        vm._model.editarSelectNome.list.indexOf(vm._model.nome.list[i]) == -1){
                        vm._model.editarSelectNome.list.push(vm._model.nome.list[i])
                    }
                }
                $('#modalEditDisc').modal({
                    backdrop: 'static',
                    keyboard: false
                })
            }

            function modalSalvar() {
                if(vm._model.addNome.model.val.length){
                    vm._model.addNome.model.err = '';
                    vm._model[vm._model.addNome.ref].list.unshift({
                        id: new Date().getTime()+vm._model.addNome.model.val,
                        text: vm._model.addNome.model.val
                    });
                    vm._model.addNome.model.val = '';
                    vm.editing = true;
                    $('#modalCadastrarNovo').modal('toggle');
                }else{
                    vm._model.addNome.model.err = 'Campo obrigatório!';
                }
            }

            function removeDisciplina(args,event){
                //todo remover da tabela
            }

            function salvar() {
                //todo post salvamento
            }

            function salvarEditDisc() {
                //todo salvamento não funcionando
                if(vm._model.editarNome.model.val != ''){
                    vm._model.editarNome.model.err = '';
                    vm._model.nome.list[vm._model.nome.list.indexOf(vm.editingObj)] = vm._model.editarNome.model.val;
                    $('#modalEditDisc').modal('toggle');
                }else{
                    vm._model.editarNome.model.err = 'Campo obrigatório!';
                }
            }

            function selectDiscModal(obj) {
                vm.editingObj = obj;
                vm._model.editarNome.model.val = obj.text;
                vm.editingModal = true;
            }

        }])
})();