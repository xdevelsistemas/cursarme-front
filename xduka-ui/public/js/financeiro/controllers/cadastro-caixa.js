(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('cadastroCaixa', ['$scope', '$resource', 'breadCrumb', function($scope, $resource, breadCrumb) {

            /* jshint validthis: true */
            var vm = this;

            vm.breadCrumb = breadCrumb;
            vm.breadCrumb.title = 'Cadastro de Caixa';

            vm._model = {
                "inputNomeCaixa": {
                    "label": "Nome do Caixa",
                    "type": "text",
                    "val": "",
                    "name": "inputNomeCaixa",
                    "model": {"val": "", "err": ""}
                },
                "selectNomeCaixa": {
                    "label": "Nome do Caixa",
                    "type": "select",
                    "name": "selectNomeCaixa",
                    "placeholder": "Selecione uma opção",
                    "model": {"val": "", "err": ""},
                    "list": []
                },
                "agencia": {
                    "label": "Agência",
                    "type": "text",
                    "val": "",
                    "name": "agencia",
                    "model": {"val": "", "err": ""}
                },
                "contaBancaria": {
                    "label": "Conta Bancária",
                    "type": "text",
                    "val": "",
                    "name": "contaBancaria",
                    "model": {"val": "", "err": ""}
                },
                "codCedente": {
                    "label": "Cod. Cedente",
                    "type": "text",
                    "val": "",
                    "name": "codCedente",
                    "model": {"val": "", "err": ""}
                },
                "tipoCarteira": {
                    "label": "Tipo Carteira",
                    "type": "text",
                    "val": "",
                    "name": "tipoCarteira",
                    "model": {"val": "", "err": ""}
                },
                "obs": {
                    "label": "Obs",
                    "type": "textarea",
                    "name": "obs",
                    "rows": 7,
                    "model": {"val": "", "err": ""}
                },
                "numCartao": {
                    "label": "Número Cartão",
                    "type": "text",
                    "val": "",
                    "name": "numCartao",
                    "model": {"val": "", "err": ""}
                },
                "nome": {
                    "label": "Nome",
                    "type": "text",
                    "val": "",
                    "name": "nome",
                    "model": {"val": "", "err": ""}
                },
                "validadeCartao": {
                    "label": "Validade Cartão",
                    "type": "text",
                    "val": "",
                    "name": "validadeCartao",
                    "mask": "99/99",
                    "model": {"val": "", "err": ""}
                },
                "codSeguranca": {
                    "label": "Cód. Segurança",
                    "type": "text",
                    "val": "",
                    "name": "codSeguranca",
                    "mask": "999",
                    "model": {"val": "", "err": ""}
                }
            };

            vm.addCaixa = addCaixa;
            vm.cancelar = cancelar;
            vm.continuar = continuar;
            vm.detectarBandeira = detectarBandeira;
            vm.limpar = limpar;
            vm.salvar = salvar;
            vm.voltar = voltar;
            vm.editing = false;
            vm.showTable = true;
            vm.srcCartao = '';
            vm.tableCaixa = {
                id: 'tableCaixa',
                dataTable: {
                    "paging":   true,
                    "ordering": false,
                    "info":     true,
                    "filter":   true,
                    "order": [[ 0, "asc" ]]

                },
                class: 'table-hover table-bordered display',
                head: ["Nome", "Tipo", "Obs"],
                list: [
                    {
                        "anome": "Bradesco",
                        "btipo": "Boleto",
                        "cobs": "Alunos"
                    },
                    {
                        "anome": "Visa",
                        "btipo": "Cartão de Crédito",
                        "cobs": ""
                    },
                    {
                        "anome": "Mastercard",
                        "btipo": "Cartão de Crédito",
                        "cobs": ""
                    },
                    {
                        "anome": "Cheque",
                        "btipo": "",
                        "cobs": "Alunos"
                    },
                    {
                        "anome": "Acordo",
                        "btipo": "Advocacia",
                        "cobs": "Alunos"
                    }
                ]
            };

            function addCaixa() {
                vm.editing = true;
                vm.showTable = false;
                topCollapse();
            }

            function cancelar() {
                limpar();
                vm.editing = false;
            }

            function continuar() {
                vm.showTable = false;
                topCollapse();
            }

            function detectarBandeira(val) {
                //todo
                if (val.length) {
                    if (val.length < 2) {
                        if (val == "4") {
                            vm.srcCartao = 'http://www.dreamtemplate.com/dreamcodes/payment_icons/visa2-mini.png'
                        } else if (val == "5") {
                            vm.srcCartao = 'http://www.dreamtemplate.com/dreamcodes/payment_icons/mastercard2-mini.png'
                        }
                    } else if (val.length < 3) {
                        if (val == "34" || val == "37") {
                            vm.srcCartao = "http://www.dreamtemplate.com/dreamcodes/payment_icons/amex2-mini.png"
                        } else if (val == "64" || val == "65") {
                            vm.srcCartao = "http://www.dreamtemplate.com/dreamcodes/payment_icons/discover2-mini.png"
                        }
                    } else if (val.length < 5) {
                        if (val == "6011" || val == "622") {
                            vm.srcCartao = "http://www.dreamtemplate.com/dreamcodes/payment_icons/discover2-mini.png"
                        }
                    }
                }else {
                    vm.srcCartao = ""
                }
            }

            function limpar() {
                var i;
                for (i in vm._model) {
                    vm._model[i].model.val = "";
                }
                vm.srcCartao = "";
            }

            function salvar() {
                //todo post de salvamento
                var novoCaixa = {
                    "aNome": vm._model.inputNomeCaixa.model.val||vm._model.selectNomeCaixa.model.val,
                    "btipo": 'Indefinido',
                    "cobs": vm._model.obs.model.val
                };

                vm.tableCaixa.list.push(novoCaixa);

                vm.editing = false;
                limpar();
                voltar();
            }

            function topCollapse() {
                $('html, body').animate({scrollTop: 0},'slow');
            }

            function voltar() {
                vm.showTable = true;
                topCollapse();
            }


        }]);
})();