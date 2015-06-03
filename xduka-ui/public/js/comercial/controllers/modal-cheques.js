(function () {
    'use strict';
    angular.module('app.controllers').controller('ModalCheques', [
        '$scope', '$resource', 'lista_cheques', '$modalInstance', 'dataCheque',
        function ($scope, $resource, lista_cheques, $modalInstance, dataCheque) {
        /* jshint validthis: true */
            var vm = this
                , modalChequePromise = $resource('/api/comercial/modal-cheque').get().$promise;

            vm._data = {};

            modalChequePromise
                .then(function(data) {
                    vm._model = data;
                })
                .catch(function(erro) {
                    console.log("\nErro: " + erro.data);
                });

            vm.new_cheque = function(){
                if (!!vm._model.banco.model.val && !!vm._model.agencia.model.val && !!vm._model.conta.model.val &&
                    !!vm._model.numero.model.val && !!vm._model.data.model.val && !!vm._model.valor.model.val &&
                    !!vm._model.titular.model.val && !vm._model.data.model.err){

                /*  LIMPANDO CAMPOS DE ERRO     */
                    vm._model.banco.model.err = '';
                    vm._model.agencia.model.err = '';
                    vm._model.conta.model.err = '';
                    vm._model.numero.model.err = '';
                    vm._model.data.model.err = '';
                    vm._model.valor.model.err = '';
                    vm._model.titular.model.err = '';

                    /*FIM CAMPOS DE ERRO*/

                    dataCheque.setData(vm._model.data.model.val);
                    $.extend(vm._data, {

                        "agencia": vm._model.agencia.model.val,
                        "conta": vm._model.conta.model.val,
                        "numero": vm._model.numero.model.val,
                        "data": dataCheque.getData(),
                        "valor": vm._model.valor.model.val,
                        "titular": vm._model.titular.model.val
                    });
                    vm._novo_cheque = vm._data;
                    vm.lista_cheques.add(vm._novo_cheque)

                }else{
                    if (!vm._model.banco.model.val){
                        vm._model.banco.model.err = 'Campo obrigatório'
                    }else{vm._model.banco.model.err = ''}
                    if (!vm._model.agencia.model.val){
                        vm._model.agencia.model.err = 'Campo obrigatório'
                    }else{vm._model.agencia.model.err = ''}
                    if (!vm._model.conta.model.val){
                        vm._model.conta.model.err = 'Campo obrigatório'
                    }else{vm._model.conta.model.err = ''}
                    if (!vm._model.numero.model.val){
                        vm._model.numero.model.err = 'Campo obrigatório'
                    }else{vm._model.numero.model.err = ''}
                    if (!vm._model.data.model.val || !!vm._model.data.model.err){
                        vm._model.data.model.err = 'Campo obrigatório'
                    }else{vm._model.data.model.err = ''}
                    if (!vm._model.valor.model.val){
                        vm._model.valor.model.err = 'Campo obrigatório'
                    }else{vm._model.valor.model.err = ''}
                    if (!vm._model.titular.model.val){
                        vm._model.titular.model.err = 'Campo obrigatório'
                    }else{vm._model.titular.model.err = ''}
                }
            };

            vm.lista_cheques = lista_cheques;

            vm.voltar = function () {
                $modalInstance.dismiss('cancel');
            };

            vm.changeBanco = function(item,model){
                console.log(item);
                vm._data.banco = item
            };

            vm.validaData = function(){
                if (isDate($('#input_data').val())){
                    vm._model.data.model.err = '';
                }
            };

            function isDate(date){
                return /^(0[1-9]|[12][0-9]|3[01])[\/](0[1-9]|1[012])[\/](19|20)\d\d$/gm.test(date)
            }
        }]);
})();