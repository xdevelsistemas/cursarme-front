(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('controlCheques', ['$scope', '$resource', 'breadCrumb', function($scope, $resource, breadCrumb) {

            /* jshint validthis: true */
            var vm = this
                ,chequesPromise = $resource('/api/financeiro/getCheques').get().$promise;

            vm.breadCrumb = breadCrumb;
            vm.breadCrumb.title = 'Controle de Cheques';
            vm.cancelEdit = cancelEdit;
            vm.cheques = [];
            vm.modalEdit = {};
            vm.saveEdit = saveEdit;
            vm.tableCheques = {
                id: 'tableCheques',
                class: 'table-hover display',
                dataTable: {
                    "columnDefs": [
                        { "orderable": false, "targets": 0 }
                    ],
                    "order": [[ 1, "desc" ]]
                },
                list: [],
                head: ["", "Data", "Bom para", "Valor", "Parcela", "Nº Cheque", "Banco", "Agência", "Status", "Destino"]
            };

            //Requisições
            chequesPromise
                .then(function (data) {
                    vm.cheques = data.list;
                    vm.modalEdit = data.modal;
                    preencheTabelaCheques();
                })
                .catch(function(err){
                    console.log(err)
                });

            //Funções
            function preencheTabelaCheques() {
                vm.tableCheques.list = [];

                for (var i = 0; i < vm.cheques.length; i++){
                    vm.tableCheques.list.push(
                        {
                            "0botao": {
                                btn: true,
                                list: [{
                                    text: "",
                                    click: editCheque,
                                    args: i,
                                    class: "btn btn-blue btn-sm",
                                    entypo: "entypo-pencil"
                                }]
                            },
                            "1data": {date: true, int: vm.cheques[i].data},
                            "2bompara": {date: true, int: vm.cheques[i].bomPara},
                            "3valor": Number(vm.cheques[i].cheque.valor).toFixed(2),
                            "4parcela": vm.cheques[i].parcela.toString(),
                            "5num": vm.cheques[i].cheque.numero,
                            "6banco": vm.cheques[i].cheque.banco.text,
                            "7agencia": vm.cheques[i].cheque.agencia.toString(),
                            "8status": vm.cheques[i].status.text,
                            "9destino": vm.cheques[i].destino
                        }
                    )
                }
            }

            function editCheque(pos) {
                vm.modalEdit.data.model.val = new Date(vm.cheques[pos].data);
                vm.modalEdit.valor.model.val = vm.cheques[pos].cheque.valor.toString();
                vm.modalEdit.bomPara.model.val = new Date(vm.cheques[pos].bomPara);
                vm.modalEdit.parcela.model.val = vm.cheques[pos].parcela;
                vm.modalEdit.num.model.val = vm.cheques[pos].num;
                vm.modalEdit.banco.model.val = vm.cheques[pos].cheque.banco.id;
                vm.modalEdit.agencia.model.val = vm.cheques[pos].cheque.agencia.toString();
                vm.modalEdit.destino.model.val = vm.cheques[pos].destino;
                vm.modalEdit.status.model.val = vm.cheques[pos].status.id;
                vm.modalEdit.pos = pos;
                $('#editChequeModal').modal({
                    backdrop: 'static',
                    keyboard: false
                })
            }

            function saveEdit(pos) {
                vm.cheques[pos].data = new Date(vm.modalEdit.data.model.val).getTime();
                vm.cheques[pos].cheque.valor = vm.modalEdit.valor.model.val;
                vm.cheques[pos].bomPara = new Date(vm.modalEdit.bomPara.model.val).getTime();
                vm.cheques[pos].parcela = vm.modalEdit.parcela.model.val;
                vm.cheques[pos].num = vm.modalEdit.num.model.val;
                vm.cheques[pos].cheque.banco.id = vm.modalEdit.banco.model.val;
                vm.cheques[pos].cheque.agencia = vm.modalEdit.agencia.model.val;
                vm.cheques[pos].destino = vm.modalEdit.destino.model.val;
                //TODO MELHORAR O SALVAMENTO DO STATUS ABAIXO
                vm.cheques[pos].status = vm.modalEdit.status.list[vm.modalEdit.status.model.val];
                //
                //  TODO FUNÇÃO DE POST DE SALVAMENTO AQUI

                var chequeEditPromise = $resource('/api/financeiro/chequeEdit').save({}, {"cheque": vm.cheques[pos]}).$promise;

                chequeEditPromise
                    .then(function(data) {
                        vm.cheques[pos] = data;

                        atualizaTable();
                        cancelEdit()
                    })
                    .catch(function(error) {
                        // TODO TRATAR POSSÍVEL ERROR NA EDIÇÃO DO CHEQUE
                        console.log("Error área financeiro");
                        console.log("controller control-cheques");
                        console.log("function saveEdit");
                        console.log(error);
                    });
            }

            function atualizaTable() {
                /* TODO ATUALIZAR TABELA AO SALVAR */
                preencheTabelaCheques();
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