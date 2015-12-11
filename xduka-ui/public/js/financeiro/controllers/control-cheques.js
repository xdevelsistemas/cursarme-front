(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('controlCheques', ['$scope', '$resource', 'modelStrings', '$timeout', '$route', 'breadCrumb',
            function($scope, $resource, modelStrings, $timeout, $route, breadCrumb) {

            /* jshint validthis: true */
            var vm = this
                ,chequesPromise = $resource('/api/financeiro/getCheques').get().$promise;


            vm.STR = modelStrings;
            vm.breadCrumb = breadCrumb;
            vm.breadCrumb.title = vm.STR.CONTROLCHEQUES;
            vm.cancelEdit = cancelEdit;
            vm.cheques = [];
            vm.modalEdit = {};
            vm.saveEdit = saveEdit;
            vm.tableCheques = {
                id: 'tableCheques',
                columnDefs: []
            };

            //Requisições
            chequesPromise
                .then(function (data) {
                    //vm.cheques = data.list;
                    vm.tableCheques.data = data.list;
                    vm.tableCheques.columnDefs = data.columnDefs;
                    vm.modalEdit = data.modal;

                    for (var i = 0; i < vm.tableCheques.data.length; i++){
                        vm.tableCheques.data[i].btn = {
                            click: editCheque,
                            args: i
                        };
                    }

                })
                .catch(function(err){
                    console.log(err)
                });

            //Funções

            function editCheque(pos) {
                vm.modalEdit.data.model.val = new Date(vm.tableCheques.data[pos].cheque.data);
                vm.modalEdit.valor.model.val = vm.tableCheques.data[pos].cheque.valor;
                vm.modalEdit.bomPara.model.val = new Date(vm.tableCheques.data[pos].bomPara);
                vm.modalEdit.parcela.model.val = vm.tableCheques.data[pos].parcela;
                vm.modalEdit.num.model.val = vm.tableCheques.data[pos].cheque.numero;
                vm.modalEdit.banco.model.val = vm.tableCheques.data[pos].cheque.banco.id;
                vm.modalEdit.agencia.model.val = vm.tableCheques.data[pos].cheque.agencia;
                vm.modalEdit.destino.model.val = vm.tableCheques.data[pos].destino;
                vm.modalEdit.status.model.val = vm.tableCheques.data[pos].status.id;
                vm.modalEdit.pos = pos;
                $('#editChequeModal').modal({
                    backdrop: 'static',
                    keyboard: false
                })
            }

            function saveEdit(pos) {
                var cheque = $.extend(true, {}, vm.tableCheques.data[pos]);
                cheque.cheque.data = new Date(vm.modalEdit.data.model.val).getTime();
                cheque.cheque.valor = vm.modalEdit.valor.model.val;
                cheque.bomPara = new Date(vm.modalEdit.bomPara.model.val).getTime();
                cheque.parcela = vm.modalEdit.parcela.model.val;
                cheque.cheque.numero = vm.modalEdit.num.model.val;
                cheque.cheque.banco.id = vm.modalEdit.banco.model.val;
                cheque.cheque.agencia = vm.modalEdit.agencia.model.val;
                cheque.destino = vm.modalEdit.destino.model.val;
                cheque.status = vm.modalEdit.status.list.filter(function(el){return el.id === vm.modalEdit.status.model.val})[0];
                cheque.repassadoCpf = vm.modalEdit.repassadoCpf.model.val;
                cheque.repassadoNome = vm.modalEdit.repassadoNome.model.val;

                // possível sintaxe para causar erro 400
                //var chequeEditPromise = $resource('/api/financeiro/chequeEdit').save({}, pos).$promise;
                var chequeEditPromise = $resource('/api/financeiro/chequeEdit').save({}, {"pos": pos, "cheque": cheque}).$promise;

                chequeEditPromise
                    .then(function(data) {
                        console.log("Success resource");
                        console.log(data);

                        cancelEdit();
                    })
                    .catch(function(error) {
                        // TODO TRATAR POSSÍVEL ERROR NA EDIÇÃO DO CHEQUE
                        // TOdo tela de resposta com um "Tipo de dado incorreto."
                        console.log("Error área financeiro");
                        console.log("controller control-cheques");
                        console.log("function saveEdit");
                        console.log(error);
                    });
            }

            function cancelEdit() {
                vm.modalEdit.data.model.val = "";
                vm.modalEdit.valor.model.val = "";
                vm.modalEdit.bomPara.model.val = "";
                vm.modalEdit.parcela.model.val = "";
                vm.modalEdit.num.model.val = "";
                vm.modalEdit.banco.model.val = "";
                vm.modalEdit.agencia.model.val = "";
                vm.modalEdit.destino.model.val = "";
                vm.modalEdit.status.model.val = "";
                vm.modalEdit.pos = undefined;
                $('#editChequeModal').modal('toggle')
            }
        }]);
})();