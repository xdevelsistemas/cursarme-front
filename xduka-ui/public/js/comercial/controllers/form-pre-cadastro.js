define(['./__module__', "jquery", "form-wizard"], function (controllers, $, formWizard) {
    'use strict';
    controllers.controller('FormPreCadastro', [
        '$scope', '$timeout', '$modal', '$resource', 'lista_cheques', 'dataCheque', 'allCheques',
        function ($scope, $timeout, $modal, $resource, lista_cheques, dataCheque, allCheques) {

            /* jshint validthis: true */
            var vm = this
                , comercialPromise = $resource('/api/comercial/dados-comercial').get().$promise;


            // ==== MODELOS ==== //

            vm._model = {};
            vm.validaCpf = true;
            vm.btnAddChequeStep1 = false;
            vm.btnAddChequeStep3 = false;
            vm.valoresCampos = {};
            vm.selectCursoArea = false;
            vm.selectCursoCurso = false;
            vm.selectCursoVagas = false;

            comercialPromise
                .then(function(data){
                    vm._model = data;
                    $.extend(vm._model.curso.vagas, {}, {
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

            // ==== REQUISIÇÕES ==== //

            vm.getAreas = function (item, model) {
                vm.selectCursoArea = true;
                vm.selectCursoCurso = false;
                vm.selectCursoVagas = false;
                vm._model.curso.area.value = '';
                vm._model.curso.curso.value = '';
            };
            vm.getCursos = function (item, model) {
                vm.selectCursoCurso = true;
                vm.selectCursoVagas = false;
                vm._model.curso.curso.value = '';
            };
            vm.getVagas = function (item, model) {
                vm.selectCursoVagas = true;
                $timeout(function () {
                    function getRandomInt(min, max) {
                        return Math.floor(Math.random() * (max - min)) + min;
                    }

                    var a = getRandomInt(100, 201), b = getRandomInt(0, 101);
                    vm._model.curso.vagas.totais = a;
                    vm._model.curso.vagas.preenchidas = Math.floor(b * a / 100);

                    if (vm._model.curso.vagas.totais/vm._model.curso.vagas.preenchidas < 1.5){
                        vm._model.curso.vagas.css.titleRed = true;
                        vm._model.curso.vagas.css.titleGray = false
                    }else{
                        vm._model.curso.vagas.css.titleGray = true;
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

            vm.selectChequeStep3 = function (item, model) {
                vm.btnAddChequeStep3 = item.tpCheque;
            };

            vm.selectPhoneType = function (item, model) {
                var tel = vm._model.aluno.telefone.model.val;
                vm._model.aluno.telefone.mask = model == 'cel' ? '(99)9999-99999' : '(99)9999-9999';
                vm._model.aluno.telefone.model.val = tel;
            };

            vm.sendDadosMatricula = function() {
                $.extend(vm._model.pagamento.listaCheques, allCheques.getAllCheques());

                var sendDadosMatPromise = $resource('/api/comercial/dados-matricula').save({}, vm._model).$promise;

                sendDadosMatPromise
                    .then(function(data){
                        //vm.dadosIniciais.successMessage = vm.STR.SUCESSO;
                        vm._model = data;
                        $.extend(vm._model.curso.vagas, {}, {
                            isEnding: function () {
                                return (this.preenchidas / (this.totais == 0 ? 1 : this.totais) >= 0.9 ? true : false);
                            },
                            getDisponiveis: function () {
                                return (parseInt(this.totais) - parseInt(this.preenchidas));
                            }
                        });

                        console.log(data);
                    })
                    .catch(function(erro) {
                        console.log("\n"+erro.data+"\n")
                    });
            };

            vm.sendFirstDados = function() {
                $.extend(vm._model.pagamento.listaCheques, allCheques.getAllCheques());

                var sendFirstDadosPromise = $resource('/api/comercial/first-dados').save({}, vm._model).$promise;

                sendFirstDadosPromise
                    .then(function(data){
                        //vm.dadosIniciais.successMessage = vm.STR.SUCESSO;
                        /*vm._model = data;
                        $.extend(vm._model.curso.vagas, {}, {
                            isEnding: function () {
                                return (this.preenchidas / (this.totais == 0 ? 1 : this.totais) >= 0.9 ? true : false);
                            },
                            getDisponiveis: function () {
                                return (parseInt(this.totais) - parseInt(this.preenchidas));
                            }
                        });*/

                        console.log(data.status);
                    })
                    .catch(function(erro) {
                        console.log("\n"+erro.data+"\n")
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
});