define(['./__module__', 'jquery'], function (controllers, $) {
    'use strict';
    controllers.controller('ModalCheques', [
        '$scope', '$http', 'lista_cheques', '$modalInstance', 'dataCheque',
        function ($scope, $http, lista_cheques, $modalInstance, dataCheque) {
            $scope._model = {
                label: "Adicionar Cheques",
                name: "modal_cheques",
                banco: {
                    label: "Banco",
                    type: "select",
                    name: 'banco',
                    value: "0",
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma opção",
                    required: true,
                    list: [
                        {id: "1", text: "Banco do Brasil"},
                        {id: "2", text: "Bradesco"},
                        {id: "3", text: "Caixa"},
                        {id: "4", text: "Itaú"}
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
                    required: true,
                    model: {err: "", val: dataCheque.getData()}
                },
                valor: {
                    label: "Valor",
                    type: "text",
                    name: 'valor',
                    help: "Campo obrigatório",
                    required: true,
                    model: {err: "", val: "200"}
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
                dataCheque.setDataFormat($scope._model.data.model.val);
                $scope._data = {
                    "banco": $scope._model.banco.value,
                    "agencia": $scope._model.agencia.model.val,
                    "conta": $scope._model.conta.model.val,
                    "numero": $scope._model.numero.model.val,
                    "data": dataCheque.getDataFormat(),
                    "valor": "R$ "+$scope._model.valor.model.val+",00",
                    "titular": $scope._model.titular.model.val
                };
                $scope._novo_cheque = $scope._data;
                console.log($scope._data)
            };

            $scope.lista_cheques = lista_cheques;
            $scope.voltar = function () {
                $modalInstance.dismiss('cancel');
            };
        }]);
});
