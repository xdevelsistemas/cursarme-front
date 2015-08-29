(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('campanhasPromocionais', ['$scope', '$resource', 'breadCrumb', function($scope, $resource, breadCrumb) {

            /* jshint validthis: true */
            var vm = this;

            vm.breadCrumb = breadCrumb;
            vm.breadCrumb.title = 'Campanhas Promocionais';

            vm._model = {
                "tipoCurso": {
                    "label": "Tipo de Curso",
                    "type": "select",
                    "name": "tipoCurso",
                    "placeholder": "Selecione uma opção",
                    "list": [
                        {id: 1, text: 'tipo curso 1'}
                    ],
                    "model": {"val": "", "err": ""}
                },
                "taxaInscr": {
                    "label": "Taxa de Inscrição",
                    "type": "text",
                    
                    "name": "taxaInscr",
                    "model": {"val": "", "err": ""}
                },
                "qtdParcelaMax": {
                    "label": "Quantidade máxima de parcelas",
                    "type": "text",
                    "name": "qtdParcelaMax",
                    "model": {"val": "", "err": ""}
                },
                "valorIntegral": {
                    "label": "Valor Integral",
                    "type": "text",
                    "name": "valorIntegral",
                    "model": {"val": "", "err": ""}
                },
                "desconto": {
                    "label": "Desconto",
                    "type": "text",
                    "name": "desconto",
                    "model": {"val": "", "err": ""}
                },
                "valorAvista": {
                    "label": "Valor a vista",
                    "type": "text",
                    "name": "valorAvista",
                    "model": {"val": "", "err": ""}
                },
                "formaPagamento": {
                    "label": "Forma de Pagamento",
                    "type": "select",
                    "name": "formaPagamento",
                    "placeholder": "Selecione uma opção",
                    "list": [
                        {id: 11, text: 'Forma de pg 1'}
                    ],
                    "model": {"val": "", "err": ""}
                },
                "descontoFormaPg": {
                    "label": "Desconto Forma de Pagamento",
                    "type": "text",
                    "name": "descontoFormaPg",
                    "model": {"val": "", "err": ""}
                },
                "valorFormaPg": {
                    "label": "Valor Forma de Pagamento",
                    "type": "text",
                    "name": "valorFormaPg",
                    "model": {"val": "", "err": ""}
                },
                "addTipoCurso": {
                    "label": "Tipo de Curso",
                    "type": "select",
                    "name": "addTipoCurso",
                    "placeholder": "Selecione uma opção",
                    "list": [
                        {id: 1, text: 'tipo curso 1'}
                    ],
                    "model": {"val": "", "err": ""}
                },
                "addInicio": {
                    "label": "Início",
                    "type": "text",
                    "model": {"val": "", "err": ""},
                    "name": "addInicio",
                    "format": "dd/MM/yyyy"
                },
                "addFim": {
                    "label": "Fim",
                    "type": "text",
                    "model": {"val": "", "err": ""},
                    "name": "addFim",
                    "format": "dd/MM/yyyy"
                },
                "addInscrPromo": {
                    "label": "Inscrição Promocional",
                    "type": "text",
                    "name": "addInscrPromo",
                    "model": {"val": "", "err": ""}
                },
                "addValorCursoPromo": {
                    "label": "Valor Curso Promocional",
                    "type": "text",
                    "name": "addValorCursoPromo",
                    "model": {"val": "", "err": ""}
                },
                "addFormaPagamento": {
                    "label": "Forma de Pagamento",
                    "type": "select",
                    "name": "addFormaPagamento",
                    "placeholder": "Selecione uma opção",
                    "list": [
                        {id: 11, text: 'Forma de pg 1'}
                    ],
                    "model": {"val": "", "err": ""}
                },
                "addDescontoFormaPg": {
                    "label": "Desconto Forma de Pagamento Promocional",
                    "type": "text",
                    "name": "addDescontoFormaPg",
                    "model": {"val": "", "err": ""}
                }
            };
            vm.adicionar = adicionar;
            vm.cancelar = cancelar;
            vm.limpar = limpar;
            vm.limparAdd = limparAdd;
            vm.salvar = salvar;
            vm.showAdd = false;

            function adicionar() {
                vm.showAdd = true;
                topCollapse();
            }

            function cancelar() {
                vm.showAdd = false;
                limparAdd();
                topCollapse();
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
                vm._model.addInicio.model.val = '';
                vm._model.addFim.model.val = '';
                vm._model.addInscrPromo.model.val = '';
                vm._model.addValorCursoPromo.model.val = '';
                vm._model.addFormaPagamento.model.val = '';
                vm._model.addDescontoFormaPg.model.val = '';

            }

            function salvar() {
                //todo post salvamento
                cancelar();

            }

            function topCollapse() {
                $('html, body').animate({scrollTop: 0},'slow');
            }

        }]);
})();