define(['./__module__', 'jqueryUi'], function (controllers, $) {
    'use strict';
    controllers.controller('ModalCheques', [
        '$scope', '$http', 'lista_cheques', '$modalInstance', 'dataCheque', 'allCheques',
        function ($scope, $http, lista_cheques, $modalInstance, dataCheque, allCheques) {

            /* jshint validthis: true */
            var vm = this;

            vm._model = {
                label: "Adicionar Cheques",
                name: "modal_cheques",
                banco: {
                    label: "Banco",
                    type: "select",
                    name: 'banco',
                    value: "",
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma opção",
                    required: false,
                    list: [
                        {id: "Banco do Brasil", text: "Banco do Brasil"},
                        {id: "Bradesco", text: "Bradesco"},
                        {id: "Caixa", text: "Caixa"},
                        {id: "Itau", text: "Itaú"}
                    ],
                    model: {err: "", val: ""}
                },
                agencia: {
                    label: "Agência",
                    type: "text",
                    name: 'agencia',
                    help: "Campo obrigatório",
                    required: false,
                    model: {err: "", val: ""}
                },
                conta: {
                    label: "Conta",
                    type: "text",
                    name: 'conta',
                    help: "Campo obrigatório",
                    required: false,
                    model: {err: "", val: ""}
                },
                numero: {
                    label: "Número",
                    type: "text",
                    name: 'numero',
                    help: "Campo obrigatório",
                    required: false,
                    model: {err: "", val: ""}
                },
                data: {
                    label: "Data",
                    type: "text",
                    name: 'data',
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma Data",
                    format: "dd/MM/yyyy",
                    required: false,
                    model: {err: "", val: ""}
                },
                valor: {
                    label: "Valor",
                    type: "text",
                    name: 'valor',
                    help: "Campo obrigatório",
                    required: false,
                    model: {err: "", val: ""}
                },
                titular: {
                    label: "Nome do titular",
                    type: "text",
                    name: 'titular',
                    help: "Campo obrigatório",
                    required: false,
                    model: {err: "", val: ""}
                }
            };

            vm.new_cheque = function(){
                if (!!vm._model.banco.model.val&&
                    !!vm._model.agencia.model.val&&
                    !!vm._model.conta.model.val&&
                    !!vm._model.numero.model.val&&
                    !!vm._model.data.model.val&&
                    !!vm._model.valor.model.val&&
                    !!vm._model.titular.model.val){

                    /*LIMPANDO CAMPOS DE ERRO*/
                    vm._model.banco.model.err = '';
                    vm._model.agencia.model.err = '';
                    vm._model.conta.model.err = '';
                    vm._model.numero.model.err = '';
                    vm._model.data.model.err = '';
                    vm._model.valor.model.err = '';
                    vm._model.titular.model.err = '';

                    /*FIM CAMPOS DE ERRO*/

                    dataCheque.setData(vm._model.data.model.val);
                    vm._data = {
                        "banco": vm._model.banco.model.val,
                        "agencia": vm._model.agencia.model.val,
                        "conta": vm._model.conta.model.val,
                        "numero": vm._model.numero.model.val,
                        "data": dataCheque.getData(),
                        "valor": "R$ "+vm._model.valor.model.val,
                        "titular": vm._model.titular.model.val
                    };
                    vm._novo_cheque = vm._data;
                    vm._data.valor = vm._model.valor.model.val;

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
                    if (!vm._model.data.model.val){
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
                allCheques.setAllCheques(vm.lista_cheques.lista);
                console.log(allCheques.getAllCheques());
            };
        }]);
});
