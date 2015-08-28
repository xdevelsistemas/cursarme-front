(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('valoresCursos', ['$scope', '$resource', 'breadCrumb', function($scope, $resource, breadCrumb) {

            /* jshint validthis: true */
            var vm = this,
                templateValoresCursosPromise = $resource('/api/financeiro/template-valores-cursos').get().$promise;

            // VARIÁVEIS COMUNS
            vm.breadCrumb = breadCrumb;
            vm.breadCrumb.title = 'Valores Cursos';
            vm._model = {};

            // VARIÁVEIS TIPO FUNÇÕES
            vm.addFormaPagamento = addFormaPagamento;
            vm.changeFormaPagamento = changeFormaPagamento;
            vm.clear = clear;
            vm.clearModalAddForma = clearModalAddForma;

            templateValoresCursosPromise
                .then(function(data) {
                    vm._model = data.template;
                })
                .catch(function(error) {
                    //TOdo tratar error
                });

            function addFormaPagamento() {
                //TOdo resource para salvar nova forma de pagamento
                var novaForma = {
                    id: vm._model.addNome.model.val,
                    text: vm._model.addNome.model.val,
                    valor: vm._model.addValor.model.val,
                    parcelamento: vm._model.addParcelamento.model.val
                };
                vm._model.formaPagamento.list.push(novaForma);

                clearModalAddForma();
                $('#modalAddForma').modal('toggle');
            }

            function changeFormaPagamento(event){
                vm._model.parcelaMax.model.val = event.parcelamento;
                vm._model.valorParcela.model.val = Number(event.valor)/Number(event.parcelamento);
            }

            function clear() {
                vm._model.tipoCurso.model.val = '';
                vm._model.areaCurso.model.val = '';
                vm._model.curso.model.val = '';
                vm._model.periodoVigencia.model.val = '';
                vm._model.ate.model.val = '';
                vm._model.valorIntegral.model.val = '';
                vm._model.valorAvista.model.val = '';
                vm._model.valorInscr.model.val = '';
                vm._model.parcelaMax.model.val = '';
                vm._model.formaPagamento.model.val = '';
                vm._model.valorParcela.model.val = '';
            }

            function clearModalAddForma() {
                vm._model.addNome.model.val = '';
                vm._model.addValor.model.val= '';
                vm._model.addParcelamento.model.val= '';
            }

        }]);
})();