define(['./__module__', 'jquery'], function (controllers, $) {
    'use strict';
    controllers.controller('ModalCheques', [
        '$scope', '$http', 'lista_cheques', '$modalInstance',
        function ($scope, $http, lista_cheques, $modalInstance) {
            $scope._model = {
                label: "Adicionar Cheques",
                name: "modal_cheques",
                banco: {
                    label: "Banco",
                    type: "select",
                    name: 'banco',
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma opção",
                    required: true,
                    val: "",
                    list: [
                        {id: "01", text: "Banco 01"},
                        {id: "02", text: "Banco 02"},
                        {id: "03", text: "Banco 03"}
                    ]
                },
                agencia: {
                    label: "Agência",
                    type: "text",
                    name: 'agencia',
                    help: "Campo obrigatório",
                    val: "",
                    required: true
                },
                conta: {
                    label: "Conta",
                    type: "text",
                    name: 'conta',
                    help: "Campo obrigatório",
                    val: "",
                    required: true
                },
                numero: {
                    label: "Número",
                    type: "text",
                    name: 'numero',
                    help: "Campo obrigatório",
                    val: "",
                    required: true
                },
                data: {
                    label: "Data",
                    type: "text",
                    name: 'data',
                    help: "Campo obrigatório",
                    val: "",
                    required: true
                },
                valor: {
                    label: "Valor",
                    type: "text",
                    name: 'valor',
                    help: "Campo obrigatório",
                    val: "",
                    required: true
                },
                titular: {
                    label: "Nome do titular",
                    type: "text",
                    name: 'titular',
                    help: "Campo obrigatório",
                    val: "pp",
                    required: true
                }
            };

            $scope.new_cheque = function(){

                $scope._data = {
                    "banco": $scope._model.banco.val,
                    "agencia": $scope._model.agencia.val,
                    "conta": $scope._model.conta.val,
                    "numero": $scope._model.numero.val,
                    "data": $scope._model.data.val,
                    "valor": $scope._model.valor.val,
                    "titular": $scope._model.titular.val
                };
                $scope._novo_cheque = $scope._data;
            };

            $scope.lista_cheques = lista_cheques;
            $scope.voltar = function () {
                $modalInstance.dismiss('cancel');
            };
        }]);
});
