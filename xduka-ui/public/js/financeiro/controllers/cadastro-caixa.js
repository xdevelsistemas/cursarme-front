(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('cadastroCaixa', ['$scope', '$resource', 'breadCrumb', 'modelStrings',
            function($scope, $resource, breadCrumb, modelStrings) {

            /* jshint validthis: true */
            var vm = this,
                dadosCadastroCaixa = $resource('/api/financeiro/dados-cadastro-caixa').get().$promise,
                templateCadastroCaixa = $resource('/api/financeiro/template-cadastro-caixa').get().$promise;

            vm.breadCrumb = breadCrumb;
            vm.STR = modelStrings;
            vm.breadCrumb.title = vm.STR.CADCAIXA;

            // VARIÁVEIS COMUNS
            vm._model = {};
            vm.disableEscolhaBanco = true;
            vm.disableEscolhaCartao = true;
            vm.disableNomeBanco = false;
            vm.disableNomeCaixa = false;
            vm.disableNumCartao = false;
            //
            vm.editing = false;
            vm.showTable = true;
            vm.srcCartao = '';
            vm.tableCaixa = {
                id: 'tableCaixa',
                columnDefs: []
            };

            // VARIÁVEIS TIPO FUNÇÃO
            vm.addCaixa = addCaixa;
            vm.cancelar = cancelar;
            vm.changeNomeBanco = changeNomeBanco;
            vm.changeNomeCaixa = changeNomeCaixa;
            vm.changeNumCartao = changeNumCartao;
            vm.continuar = continuar;
            vm.detectarBandeira = detectarBandeira;
            vm.limpar = limpar;
            vm.salvar = salvar;
            vm.voltar = voltar;

            templateCadastroCaixa
                .then(function (data) {
                    vm._model = data.template;
                })
                .catch(function (error) {
                    // TOdo tratar error;
                });

            dadosCadastroCaixa
                .then(function(data) {
                    vm.tableCaixa.columnDefs = data.columnDefs;
                    vm.tableCaixa.data = data.list;
                })
                .catch(function(error) {
                    // TOdo tratar error
                });

            function addCaixa() {
                vm.editing = true;
                vm.showTable = false;
                topCollapse();
            }

            function cancelar() {
                limpar();
                vm.editing = false;
            }

            function changeNomeBanco(item, model) {
                vm.disableNomeBanco = false;
                vm.disableNomeCaixa = true;
                vm.disableNumCartao = true;
                vm.disableEscolhaBanco = false;
                vm._model.nomeCaixa.model = {"val": "", "err": ""};
                limpaCamposCartao();
            }

            function changeNomeCaixa() {
                if (vm._model.nomeCaixa.model.val.length != 0) {
                    vm.disableNomeBanco = true;
                    vm.disableNomeCaixa = false;
                    vm.disableNumCartao = true;
                } else {
                    vm.disableNomeBanco = false;
                    vm.disableNomeCaixa = false;
                    vm.disableNumCartao = false;
                }

                limpaCamposBancoFin();
                limpaCamposCartao();
                vm.disableEscolhaBanco = true;
            }

            function changeNumCartao() {
                if (vm._model.numCartao.model.val.length != 0) {
                    vm.disableNomeBanco = true;
                    vm.disableNomeCaixa = true;
                    vm.disableNumCartao = false;
                    vm.disableEscolhaCartao = false;
                } else {
                    vm.disableNomeBanco = false;
                    vm.disableNomeCaixa = false;
                    vm.disableNumCartao = false;
                    vm.disableEscolhaCartao = true;
                }

                limpaCamposBancoFin();
                vm._model.nomeCaixa.model = {"val": "", "err": ""};
                detectarBandeira(vm._model.numCartao.model.val)
            }

            function limpaCamposBancoFin() {
                vm._model.nomeBanco.model.val = '';
                vm._model.nomeBanco.model.err = '';
                vm._model.agencia.model.val = '';
                vm._model.agencia.model.err = '';
                vm._model.contaBancaria.model.val = '';
                vm._model.contaBancaria.model.err = '';
                vm._model.codCedente.model.val = '';
                vm._model.codCedente.model.err = '';
                vm._model.tipoCarteira.model.val = '';
                vm._model.tipoCarteira.model.err = '';
            }

            function limpaCamposCartao() {
                vm._model.numCartao.model.val = '';
                vm._model.numCartao.model.err = '';
                vm._model.nome.model.val = '';
                vm._model.nome.model.err = '';
                vm._model.validadeCartao.model.val = '';
                vm._model.validadeCartao.model.err = '';
                vm._model.codSeguranca.model.val = '';
                vm._model.codSeguranca.model.err = '';
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
                    vm._model[i].model.err = "";
                }

                vm.srcCartao = "";

                vm.disableEscolhaBanco = true;
                vm.disableEscolhaCartao  = true;
                vm.disableNomeBanco = false;
                vm.disableNomeCaixa = false;
                vm.disableNumCartao = false;
            }

            function salvar() {
                var saveCadastroCaixa = $resource('/api/financeiro/save-dados-cadastro-caixa')
                    .save({}, {
                        "model": vm._model, "STR": vm.STR
                    }).$promise;

                saveCadastroCaixa
                    .then(function(data) {
                        //TOdo tela de resposta com um "salvo com sucesso."
                        if (data.success) {
                            vm.tableCaixa.data = data.list;
                            vm.editing = false;
                            limpar();
                            voltar();
                        } else {
                            $.extend(true, vm._model, data.model);
                        }
                    })
                    .catch(function (error) {
                        //TOdo tratar error
                    });
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