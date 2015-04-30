define(['./__module__', 'jquery'], function (controllers, $) {
    'use strict';
    controllers.controller('ModalCheques', [
        '$scope', '$http', 'lista_cheques', '$modalInstance', 'dataCheque', 'allCheques',
        function ($scope, $http, lista_cheques, $modalInstance, dataCheque, allCheques) {
            $scope._model = {
                label: "Adicionar Cheques",
                name: "modal_cheques",
                banco: {
                    label: "Banco",
                    type: "select",
                    name: 'banco',
                    value: "",
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma opção",
                    required: true,
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
                    required: true,
                    model: {err: "", val: ""}
                },
                conta: {
                    label: "Conta",
                    type: "text",
                    name: 'conta',
                    help: "Campo obrigatório",
                    required: true,
                    model: {err: "", val: ""}
                },
                numero: {
                    label: "Número",
                    type: "text",
                    name: 'numero',
                    help: "Campo obrigatório",
                    required: true,
                    model: {err: "", val: ""}
                },
                data: {
                    label: "Data",
                    type: "text",
                    name: 'data',
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma Data",
                    required: true,
                    model: {err: "", val: ""}
                },
                valor: {
                    label: "Valor",
                    type: "text",
                    name: 'valor',
                    help: "Campo obrigatório",
                    required: true,
                    model: {err: "", val: ""}
                },
                titular: {
                    label: "Nome do titular",
                    type: "text",
                    name: 'titular',
                    help: "Campo obrigatório",
                    required: true,
                    model: {err: "", val: ""}
                }
            };

            $scope.new_cheque = function(){
                dataCheque.setData($scope._model.data.model.val);
                $scope._data = {
                    "banco": $scope._model.banco.value,
                    "agencia": $scope._model.agencia.model.val,
                    "conta": $scope._model.conta.model.val,
                    "numero": $scope._model.numero.model.val,
                    "data": dataCheque.getData(),
                    "valor": "R$ "+$scope._model.valor.model.val,
                    "titular": $scope._model.titular.model.val
                };
                $scope._novo_cheque = $scope._data;
                /*$scope._data.data = dataCheque.getDataInt();
                $scope._data.valor = $scope._model.valor.model.val;*/
            };

            $scope.lista_cheques = lista_cheques;
            $scope.voltar = function () {
                $modalInstance.dismiss('cancel');
                allCheques.setAllCheques($scope.lista_cheques.lista);
                console.log(allCheques.getAllCheques());
            };
        }]);
});
