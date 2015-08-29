(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('valoresCursos', ['$scope', '$resource', 'breadCrumb', 'modelStrings', 'defineUnidade',
            function($scope, $resource, breadCrumb, modelStrings, defineUnidade) {

            /* jshint validthis: true */
            var vm = this,
                templateValoresCursosPromise = $resource('/api/financeiro/template-valores-cursos').get().$promise,
                dadosTipoCursoPromise = $resource('/api/financeiro/dados-tipo-curso/:id').get({id: defineUnidade.getIdUnidade()}).$promise;

            // VARIÁVEIS COMUNS
            vm.breadCrumb = breadCrumb;
            vm.breadCrumb.title = 'Valores Cursos';
            vm._model = {};
            vm.STR = modelStrings;

            // VARIÁVEIS TIPO FUNÇÕES
            vm.addFormaPagamento = addFormaPagamento;
            vm.changeFormaPagamento = changeFormaPagamento;
            vm.clear = clear;
            vm.clearModalAddForma = clearModalAddForma;
            vm.saveValoresCurso = saveValoresCurso;

            templateValoresCursosPromise
                .then(function(data) {
                    vm._model = data.template;
                })
                .catch(function(error) {
                    // TOdo tratar error
                });

            dadosTipoCursoPromise
                .then(function(data) {
                    vm._model.tipoCurso.list = data.list;
                })
                .catch(function(error) {
                    // TOdo tratar error
                });

            function addFormaPagamento() {
                /*  Verificando se os campos estão vazios  */
                vm._model.addNome.model.err = vm._model.addNome.model.val.length == 0 ? vm.STR.FIELD: '';
                vm._model.addValor.model.err = vm._model.addValor.model.val.length == 0 ? vm.STR.FIELD: '';
                vm._model.addParcelamento.model.err = vm._model.addParcelamento.model.val.length == 0 ? vm.STR.FIELD: '';

                /*  Se estão vazios retorna com 0(zero) e informa com as mensagens acima  */
                if(!!vm._model.addNome.model.err || !!vm._model.addValor.model.err || vm._model.addParcelamento.model.err){
                    return 0
                }

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

            function saveValoresCurso() {
                var saveValoresCursoPromise = $resource('/api/financeiro/save-valores-curso').save({}, {"model": vm._model, "STR": vm.STR}).$promise;

                saveValoresCursoPromise
                    .then(function(data) {
                        // TOdo tela com resposta como um "Valores cadastrado com sucesso".
                        vm.clear();
                        vm._model.formaPagamento.list = [];
                    })
                    .catch(function(error) {
                        // TOdo tratar error
                    })
            }

        }]);
})();