(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('campanhasPromocionais', ['$scope', '$resource', 'breadCrumb', 'modelStrings', 'defineUnidade',
            function($scope, $resource, breadCrumb, modelStrings, defineUnidade) {

            /* jshint validthis: true */
            var vm = this,
                dadosCampPromoPromise = $resource('/api/financeiro/dados-campanhas-promocionais/:id').get({"id": defineUnidade.getIdUnidade()}).$promise,
                templateCampPromoPromise = $resource('/api/financeiro/template-campanhas-promocionais').get().$promise;

            // VARIÁVEIS COMUNS
            vm._model = {};
            vm.breadCrumb = breadCrumb;
            vm.breadCrumb.title = 'Campanhas Promocionais';
            vm.showAdd = false;
            vm.STR = modelStrings;

            // VARIÁVIES TIPO FUNÇÃO
            vm.adicionar = adicionar;
            vm.cancelar = cancelar;
            vm.changeFormaPag = changeFormaPag;
            vm.changeTipoCurso = changeTipoCurso;
            vm.limpar = limpar;
            vm.limparAdd = limparAdd;
            vm.salvar = salvar;

            // Requisições
            templateCampPromoPromise
                .then(function(data) {
                    vm._model = data.template;

                    // uma promise dentro da outra
                    // para evitar que dê erro na hora de renderizar
                    // a página e o list de tipo de curso não seja reconhecido.
                    dadosCampPromoPromise
                        .then(function(data) {
                            vm._model.tipoCurso.list = data.list;
                            vm._model.addTipoCurso.list = data.list;
                        })
                        .catch(function(error) {
                            // TOdo tratar error
                        });
                })
                .catch(function(error) {
                    // TOdo tratar error
                });

            // FUNÇÕES
            function adicionar() {
                vm.showAdd = true;
                topCollapse();
            }

            function cancelar() {
                vm.showAdd = false;
                limparAdd();
                topCollapse();
            }

            function changeFormaPag(item, model) {
                vm._model.descontoFormaPg.model.val = item.descontoFormaPg;
                vm._model.valorFormaPg.model.val = item.valorFormaPg;
            }

            function changeTipoCurso(item, model) {
                $.extend(true, vm._model, item.campanha);
                //vm._model.formaPagamento.list = item.campanha.formaPagamento.list;

            }

            function limpar() {
                vm._model.tipoCurso.model.val = '';
                vm._model.taxaInscr.model.val = '';
                vm._model.qtdParcelaMax.model.val = '';
                vm._model.valorIntegral.model.val = '';
                vm._model.desconto.model.val = '';
                vm._model.valorAvista.model.val = '';
                vm._model.formaPagamento.model.val = '';
                vm._model.descontoFormaPg.model.val = '';
                vm._model.valorFormaPg.model.val = '';
            }

            function limparAdd() {
                vm._model.addTipoCurso.model.val = '';
                vm._model.addTipoCurso.model.err = '';
                vm._model.addInicio.model.val = '';
                vm._model.addInicio.model.err = '';
                vm._model.addFim.model.val = '';
                vm._model.addFim.model.err = '';
                vm._model.addInscrPromo.model.val = '';
                vm._model.addInscrPromo.model.err = '';
                vm._model.addValorCursoPromo.model.val = '';
                vm._model.addValorCursoPromo.model.err = '';
                vm._model.addFormaPagamento.model.val = '';
                vm._model.addFormaPagamento.model.err = '';
                vm._model.addDescontoFormaPg.model.val = '';
                vm._model.addDescontoFormaPg.model.err = '';
            }

            function salvar() {
                var saveCampPromoPromise = $resource('/api/financeiro/save-campanhas-promocionais').save({}, {
                    "model": vm._model, "STR": vm.STR
                }).$promise;

                saveCampPromoPromise
                    .then(function(data) {
                        $.extend(true, vm._model, data.model);
                        if (data.success) cancelar();
                    })
                    .catch(function(error) {
                        // TOdo tratar error
                    });
            }

            function topCollapse() {
                $('html, body').animate({scrollTop: 0},'slow');
            }
        }]);
})();