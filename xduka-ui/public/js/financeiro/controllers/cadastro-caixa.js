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
            vm.breadCrumb.title = 'Cadastro de Caixa';
            vm.STR = modelStrings;

            // VARIÁVEIS COMUNS
            vm._model = {};
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
                list: []
            };

            // VARIÁVEIS TIPO FUNÇÃO
            vm.addCaixa = addCaixa;
            vm.cancelar = cancelar;
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
                    vm.tableCaixa.list = data.list;
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
                var saveCadastroCaixa = $resource('/api/financeiro/save-dados-cadastro-caixa').save({}, {"model": vm._model, "STR": vm.STR}).$promise;

                saveCadastroCaixa
                    .then(function(data) {
                        //TOdo tela de resposta com um "salvo com sucesso."
                        vm.tableCaixa.list = data.list;

                        vm.editing = false;
                        limpar();
                        voltar();
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