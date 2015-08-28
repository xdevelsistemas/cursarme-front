(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('valoresCursos', ['$scope', '$resource', 'breadCrumb', function($scope, $resource, breadCrumb) {

            /* jshint validthis: true */
            var vm = this;

            vm.breadCrumb = breadCrumb;
            vm.breadCrumb.title = 'Valores Cursos';

            vm._model = {
                "tipoCurso": {
                    "label": "Tipo de Curso",
                    "type": "select",
                    "name": "tipoCurso",
                    "placeholder": "Selecione uma opção",
                    "list": [],
                    "model": {"val": "", "err": ""}
                },
                "areaCurso": {
                    "label": "Área",
                    "type": "select",
                    "name": "areaCurso",
                    "placeholder": "Selecione uma opção",
                    "list": [],
                    "model": {"val": "", "err": ""}
                },
                "curso": {
                    "label": "Curso",
                    "type": "select",
                    "name": "curso",
                    "placeholder": "Selecione uma opção",
                    "list": [],
                    "model": {"val": "", "err": ""}
                },
                "periodoVigencia": {
                    "label": "Período de Vigência",
                    "type": "text",
                    "model": {"val": "", "err": ""},
                    "name": "periodoVigencia",
                    "format": "dd/MM/yyyy"
                },
                "ate": {
                    "label": "Até",
                    "type": "text",
                    "model": {"val": "", "err": ""},
                    "name": "ate",
                    "format": "dd/MM/yyyy"
                },
                "valorIntegral": {
                    "label": "Valor Integral",
                    "type": "text",
                    "name": "valorIntegral",
                    "required": false,
                    "mask": "?",
                    "model": {"val": "", "err": ""}
                },
                "valorInscr": {
                    "label": "Valor Inscrição",
                    "type": "text",
                    "name": "valorInscr",
                    "required": false,
                    "mask": "?",
                    "model": {"val": "", "err": ""}
                },
                "valorAvista": {
                    "label": "Valor a Vista",
                    "type": "text",
                    "name": "valorAvista",
                    "required": false,
                    "mask": "?",
                    "model": {"val": "", "err": ""}
                },
                "parcelaMax": {
                    "label": "Valor Máximo de Parcelamento",
                    "type": "text",
                    "val": "",
                    "name": "parcelaMax",
                    "model": {"val": "", "err": ""}
                },
                "formaPagamento": {
                    "label": "Forma de Pagamento",
                    "type": "select",
                    "name": "formaPagamento",
                    "placeholder": "Selecione uma opção",
                    "list": [],
                    "model": {"val": "", "err": ""}
                },
                "valorParcela": {
                    "label": "Valor da Parcela",
                    "type": "text",
                    "name": "valorParcela",
                    "required": false,
                    "mask": "?",
                    "model": {"val": "", "err": ""}
                },
                "addNome": {
                    "label": "Nome",
                    "type": "text",
                    "val": "",
                    "name": "addNome",
                    "model": {"val": "", "err": ""}
                },
                "addValor": {
                    "label": "Valor",
                    "type": "text",
                    "name": "addValor",
                    "required": false,
                    "mask": "?",
                    "model": {"val": "", "err": ""}
                },
                "addParcelamento": {
                    "label": "Parcelamento",
                    "type": "text",
                    "val": "",
                    "name": "addParcelamento",
                    "model": {"val": "", "err": ""}
                }
            };
            vm.addFormaPagamento = addFormaPagamento;
            vm.changeFormaPagamento = changeFormaPagamento;
            vm.clear = clear;
            vm.clearModalAddForma = clearModalAddForma;

            function addFormaPagamento() {
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