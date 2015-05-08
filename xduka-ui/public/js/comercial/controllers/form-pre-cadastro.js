define(['./__module__', "jquery", "form-wizard", "underscore"], function (controllers, $, formWizard, _) {
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
                    $.extend(vm._model.curso.turma[0].vagas, {}, {
                        isEnding: function () {
                            return (this.preenchidas / (this.totais == 0 ? 1 : this.totais) >= 0.9 ? true : false);
                        },
                        getDisponiveis: function () {
                            return (parseInt(this.totais) - parseInt(this.preenchidas));
                        }
                    });
                    vm._model.curso.area.listAux = vm._model.curso.area.list;
                    vm._model.curso.curso.listAux = vm._model.curso.curso.list;

                })
                .catch(function(erro){
                    console.log("\n" + erro.data + "\n");
                });

            // ==== REQUISIÇÕES ==== //

            vm.getAreas = function (item, model) {
                vm.selectCursoArea = true;
                vm.selectCursoCurso = false;
                vm.selectCursoVagas = false;
                vm._model.curso.area.model.val = '';
                vm._model.curso.curso.model.val = '';
                console.log(vm._model);
            };
            vm.getCursos = function (item, model) {
                vm.selectCursoCurso = true;
                vm.selectCursoVagas = false;

                vm._model.curso.curso.list = _.where(vm._model.curso.curso.listAux, {idParent: model});

                vm._model.curso.curso.model.val = '';
            };
            vm.getTurma = function (item, model) {
                vm.selectCursoVagas = true;
                vm._model.inscr.valorInscricao.model.val = vm._model.curso.turma[0].vagas.valorInscricao;
                $timeout(function () {
                    function getRandomInt(min, max) {
                        return Math.floor(Math.random() * (max - min)) + min;
                    }

                    var a = getRandomInt(50, 100), b = getRandomInt(98, 101);
                    vm._model.curso.turma[0].vagas.totais = a;
                    vm._model.curso.turma[0].vagas.preenchidas = Math.floor(b * a / 100);

                    if (vm._model.curso.turma[0].vagas.totais/vm._model.curso.turma[0].vagas.preenchidas < 1.5){
                        vm._model.curso.turma[0].vagas.css.titleRed = true;
                        vm._model.curso.turma[0].vagas.css.titleGray = false
                    }else{
                        vm._model.curso.turma[0].vagas.css.titleGray = true;
                        vm._model.curso.turma[0].vagas.css.titleRed = false
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
                vm._model.aluno.telefone.mask = model == 'cel' ? '(99)9999-99999' : '(99)9999-9999';
                vm._model.aluno.telefone.model.val = "";
            };

            vm.sendDadosMatricula = function() {
                $.extend(vm._model.pagamento.listaCheques, allCheques.getAllCheques());

                var sendDadosMatPromise = $resource('/api/comercial/dados-matricula').save({}, vm._model).$promise;

                sendDadosMatPromise
                    .then(function(data){
                        //vm.dadosIniciais.successMessage = vm.STR.SUCESSO;
                        vm._model = data;
                        $.extend(vm._model.curso.turma[0].vagas, {}, {
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

            vm.sendInscricao = function() {
                console.log("Qtd de vagas disponiveis para o curso que você escolheu /==/ " + vm._model.curso.turma[0].vagas.getDisponiveis());
                console.log("Somente campo de teste (tanto no Node como no angular!)");
                $.extend(vm._model.pagamento.listaCheques, allCheques.getAllCheques());

                var sendInscricaoPromise = $resource('/api/comercial/dados-inscricao').save({}, vm._model).$promise;

                sendInscricaoPromise
                    .then(function (data) {
                        vm._model = data;
                        $.extend(vm._model.curso.turma[0].vagas, {}, {
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
});