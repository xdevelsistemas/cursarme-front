(function() {
    "use strict";

    angular.module('app.controllers').controller('FormPreCadastro', [
        '$scope', 'breadCrumb', '$timeout', '$modal', '$resource', 'lista_cheques', 'dataCheque', 'allCheques',
        function ($scope, breadCrumb, $timeout, $modal, $resource, lista_cheques, dataCheque, allCheques) {

            /* jshint validthis: true */
            var vm = this
                , comercialPromise = $resource('/api/comercial/dados-comercial').get().$promise
                , viewInscrPeromise = $resource('/api/comercial/view-inscr').get().$promise;

            breadCrumb.title = 'Pré Cadastro';

            // ==== MODELOS ==== //
            $scope.cor = 'blue';
            $scope.casa = 'ape';
            vm._model = {};
            vm.validaCpf = true;
            vm.btnAddChequeStep1 = false;
            vm.btnAddChequeStep2 = false;
            vm.btnSendInscr = true;
            vm.selectCursoArea = false;
            vm.selectCursoCurso = false;
            vm.selectCursoVagas = false;
            vm.testeInput = function(){
                console.log(vm._model.aluno.input)
            };
            vm.disableAtualiza = true;
            vm.passoZero = passoZero;
            function passoZero(){
                $timeout(function () {
                    vm.disableAtualiza = $('#step0').attr('class').indexOf('active') == -1;
                }, 300);
            }
            comercialPromise
                .then(function(data){
                    vm._model = data;
                    $.extend(vm._model.curso.vagas, {
                        isEnding: function () {
                            return (this.preenchidas / (this.totais == 0 ? 1 : this.totais) >= 0.9 ? true : false);
                        },
                        getDisponiveis: function () {
                            return (parseInt(this.totais) - parseInt(this.preenchidas));
                        }
                    });
                })
                .catch(function(erro){
                    console.log("\n" + erro.data + "\n");
                });

            viewInscrPeromise
                .then(function(data) {
                    vm._viewInscr = data.inscr;
                })
                .catch(function(erro) {
                    console.log("\n" + erro.data + "\n");
                });

            // ==== REQUISIÇÕES ==== //

            vm.unidadeChange = function (item, model) {
                vm.selectCursoArea = true;
                vm.selectCursoCurso = false;
                vm.selectCursoVagas = false;
                vm._model.inscr.valorInscricao.model.val = '';

                vm._model.curso.area.list = [];
                vm._model.curso.area.model = {'val': '', 'err': ''};
                $.extend(vm._model.curso.area.list, item.areas);

                /*vm._model.curso.unidade.select.unidade = _.findLastIndex(vm._model.curso.unidade.list, item);
                 vm._model.curso.unidade.list[vm._model.curso.unidade.select.unidade].area.model.val = '';
                 vm._model.curso.unidade.list[vm._model.curso.unidade.select.unidade].area.list[vm._model.curso.unidade.select.area].curso.model.val = '';*/
            };

            vm.areaChange = function (item, model) {
                vm.selectCursoCurso = true;
                vm.selectCursoVagas = false;
                vm._model.inscr.valorInscricao.model.val = '';

                vm._model.curso.curso.list = [];
                vm._model.curso.curso.model = {'val': '', 'err': ''};
                $.extend(vm._model.curso.curso.list, item.curso);

                /*vm._model.curso.unidade.select.area = _.findLastIndex(vm._model.curso.unidade.list[vm._model.curso.unidade.select.unidade].area.list, item);
                 vm._model.curso.unidade.list[vm._model.curso.unidade.select.unidade].area.list[vm._model.curso.unidade.select.area].curso.model.val = '';*/
            };

            vm.cursoChange = function (item, model) {
                vm.selectCursoVagas = true;

                /*vm._model.curso.unidade.select.curso = _.findLastIndex(vm._model.curso.unidade.list[vm._model.curso.unidade.select.unidade].area.list[vm._model.curso.unidade.select.area].curso.list, item);*/

                $.extend(vm._model.curso.vagas, item.turma[0].vagas);

                vm.btnSendInscr = false;
                vm._model.inscr.valorInscricao.model.val = vm._model.curso.vagas.valorInscricao;

                $timeout(function () {

                    if ((vm._model.curso.vagas.totais / vm._model.curso.vagas.preenchidas) < 1.5){
                        vm._model.curso.vagas.css.titleRed = true;
                        vm._model.curso.vagas.css.titleBlue = false
                    }else{
                        vm._model.curso.vagas.css.titleBlue = true;
                        vm._model.curso.vagas.css.titleRed = false
                    }
                }, 1);
            };

            vm.openModalCheque = function () {
                var modalInstance = $modal.open({
                    templateUrl: '../html/comercial/modal-cheques.html',
                    controller: 'ModalCheques',
                    controllerAs: 'cheq',
                    size: 'lg'
                });
            };

            vm.selectChequeStep1 = function (item, model) {
                vm.btnAddChequeStep1 = item.tpCheque;
            };

            vm.selectChequeStep2 = function (item, model) {
                vm.btnAddChequeStep2 = item.tpCheque;
            };

            vm.selectPhoneType = function (item, model) {
                vm._model.aluno.telefone.mask = model == 'cel' ? '?(99)9999-99999' : '?(99)9999-9999';
            };

            vm.sendDadosMatricula = function() {
                $.extend(vm._model.pagamento.listaCheques, allCheques.getAllCheques());

                var sendDadosMatPromise = $resource('/api/comercial/dados-matricula').save({}, vm._model).$promise;

                sendDadosMatPromise
                    .then(function(data){
                        //vm.dadosIniciais.successMessage = vm.STR.SUCESSO;
                        vm._model = data;
                        /*$.extend(vm._model.curso.vagas, {
                         isEnding: function () {
                         return (this.preenchidas / (this.totais == 0 ? 1 : this.totais) >= 0.9 ? true : false);
                         },
                         getDisponiveis: function () {
                         return (parseInt(this.totais) - parseInt(this.preenchidas));
                         }
                         });*/

                        console.log(data);
                    })
                    .catch(function(erro) {
                        console.log("\n"+erro.data+"\n")
                    });
            };

            vm.sendInscricao = function() {
                //console.log("Qtd de vagas disponiveis para o curso que você escolheu /==/ " + vm._model.curso.unidade.list[vm._model.curso.unidade.select.unidade].area.list[vm._model.curso.unidade.select.area].curso.list[vm._model.curso.unidade.select.curso].turma[0].vagas.getDisponiveis());
                console.log("Somente campo de teste (tanto no Node como no angular!)");
                $.extend(vm._model.pagamento.listaCheques, allCheques.getAllCheques());

                var sendInscricaoPromise = $resource('/api/comercial/dados-inscricao').save({}, vm._model).$promise;

                sendInscricaoPromise
                    .then(function (data) {
                        vm._model = data;
                        console.log("recebido");
                        console.log(vm._model);
                        $.extend(vm._model.curso.vagas, {
                            isEnding: function () {
                                return (this.preenchidas / (this.totais == 0 ? 1 : this.totais) >= 0.9 ? true : false);
                            },
                            getDisponiveis: function () {
                                return (parseInt(this.totais) - parseInt(this.preenchidas));
                            }
                        });
                    })
                    .catch(function (erro) {
                        console.log("\n" + erro.data + "\n")
                    });
            };

            vm.topCollapse = function(){
                $('html, body').animate({scrollTop: 0},'slow');
            };

            $(function(){
                $('a').bind('contextmenu', function(e){
                    alert('Função desabilitada para este elemento!');
                    return false;
                });
            });


        }
    ]);
})();