(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('valoresCursos', ['$scope', '$resource', 'breadCrumb', 'modelStrings', 'defineUnidade',
            function($scope, $resource, breadCrumb, modelStrings, defineUnidade) {

            /* jshint validthis: true */
            var vm = this,
                templateValoresCursosPromise = $resource('/api/financeiro/template-valores-cursos').get().$promise,
                valoresCadastradosPromise = $resource('/api/financeiro/dados-valores-cursos').get().$promise,
                dadosTipoCursoPromise = $resource('/api/financeiro/dados-tipo-curso/:id').get({id: defineUnidade.getIdUnidade()}).$promise;

            // VARIÁVEIS COMUNS
            vm._model = {};
            vm.STR = modelStrings;
            vm.breadCrumb = breadCrumb;
            vm.breadCrumb.title = vm.STR.VALORECURSOS;
            vm.disableArea = true;
            vm.disableCurso = true;
            vm.disableTipoCurso = true;
            vm.editing = false;
            vm.tableValoresCurso = {
                "id": "tableValoresCurso",
                "columnDefs": []
            };

            // VARIÁVEIS TIPO FUNÇÕES
            vm.addFormaPagamento = addFormaPagamento;
            vm.changeFormaPagamento = changeFormaPagamento;
            vm.clear = clear;
            vm.clearCamposDetalhes = clearCamposDetalhes;
            vm.clearModalAddForma = clearModalAddForma;
            vm.changeArea = changeArea;
            vm.changeCurso = changeCurso;
            vm.changeTipoCurso = changeTipoCurso;
            vm.newValorCurso = newValorCurso;
            vm.saveValoresCurso = saveValoresCurso;
            vm.topCollapse = topCollapse;

            templateValoresCursosPromise
                .then(function(data) {
                    vm._model = data.template;
                })
                .catch(function(error) {
                    // TOdo tratar error
                });

            valoresCadastradosPromise
                .then(function(data){
                    vm.tableValoresCurso.columnDefs = data.columnDefs;
                    vm.tableValoresCurso.data = data.dados;
                })
                .catch(function(error){
                    // Todo tratar error
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
                vm.clearCamposDetalhes();
            }

            function clearCamposDetalhes() {
                vm._model.periodoVigencia.model.val = '';
                vm._model.ate.model.val = '';
                vm._model.valorIntegral.model.val = '';
                vm._model.valorAvista.model.val = '';
                vm._model.valorInscr.model.val = '';
                vm._model.parcelaMax.model.val = '';
                vm._model.formaPagamento.model.val = '';
                vm._model.valorParcela.model.val = '';
            }

            function clearMsgErro() {
                vm._model.tipoCurso.model.err = '';
                vm._model.areaCurso.model.err = '';
                vm._model.curso.model.err = '';
                vm._model.periodoVigencia.model.err = '';
                vm._model.ate.model.err = '';
                vm._model.valorIntegral.model.err = '';
                vm._model.valorAvista.model.err = '';
                vm._model.valorInscr.model.err = '';
                vm._model.parcelaMax.model.err = '';
                vm._model.formaPagamento.model.err = '';
                vm._model.valorParcela.model.err = '';
            }

            function clearModalAddForma() {
                vm._model.addNome.model.val = '';
                vm._model.addValor.model.val = '';
                vm._model.addParcelamento.model.val = '';
            }

            function changeTipoCurso(item, model) {
                vm.disableTipoCurso = false;
                vm.disableArea = true;
                vm.disableCurso = true;
                vm.clearCamposDetalhes();

                defineModelAreaCurso();
                defineModelCurso();
                vm._model.areaCurso.list = item.areas;
            }

            function newValorCurso() {
                vm.editing = true;
            }

            function changeArea(item, model) {
                vm.disableArea = false;
                vm.disableCurso = true;
                vm.clearCamposDetalhes();

                defineModelCurso();
                vm._model.curso.list = item.cursos;
            }

            function changeCurso(item, model) {
                vm.disableCurso = false;
                vm.clearCamposDetalhes();
            }

            function defineModelAreaCurso() {
                vm._model.areaCurso.list = [];
                vm._model.areaCurso.model.val = '';
            }

            function defineModelCurso() {
                vm._model.curso.list = [];
                vm._model.curso.model.val = '';
            }

            function saveValoresCurso() {
                var saveValoresCursoPromise = $resource('/api/financeiro/save-valores-curso/:id').save({"id": defineUnidade.getIdUnidade()}, {"model": vm._model, "STR": vm.STR}).$promise;

                saveValoresCursoPromise
                    .then(function(data) {
                        //response
                        if (data.success) {

                            //todo responder o post com a tabela atualizada
                            //vm.tableValoresCurso.data = data.dados;

                            vm.disableArea = true;
                            vm.disableCurso = true;
                            vm.disableTipoCurso = true;
                            vm.clear();
                            defineModelCurso();
                            defineModelAreaCurso();
                            clearMsgErro();
                            vm._model.formaPagamento.list = [];
                            vm.editing = false;
                            topCollapse();
                        } else {
                            $.extend(true, vm._model, data.model);
                        }
                    })
                    .catch(function(error) {
                        // TOdo tratar error
                    })
            }

            function topCollapse(){
                $('html, body').animate({scrollTop: 0},'slow');
            }

        }]);
})();