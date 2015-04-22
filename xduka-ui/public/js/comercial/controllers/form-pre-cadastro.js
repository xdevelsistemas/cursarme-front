define(['./__module__', "jquery"], function (controllers, $) {
    'use strict';
    
    controllers.controller('FormPreCadastro', [
        '$scope', '$timeout', '$modal', '$resource', 'lista_cheques',
        function ($scope, $timeout, $modal, $resource, lista_cheques) {
            /* jshint validthis: true */
            var vm = this
                , alunoPromise = $resource('/api/comercial/info-aluno').get().$promise
                , controlePromise = $resource('/api/comercial/info-controle').get().$promise
                , cursoPromise = $resource('/api/comercial/info-curso').get().$promise
                , docPromise = $resource('/api/comercial/info-documentacao').get().$promise
                , inscrPromise = $resource('/api/comercial/info-inscricao').get().$promise
                , pagPromise = $resource('/api/comercial/info-pagamento').get().$promise;


            // ==== MODELOS ==== //

            vm.validaCpf = true;

            vm._model = {};

            alunoPromise
                .then(function(data){
                    vm._model.aluno = data.object;
                })
                .catch(function(erro){
                    console.log("\n" + erro.data + "\n");
                });

            controlePromise
                .then(function(data){
                    vm._model.controle = data;
                })
                .catch(function(erro){
                    console.log("\n" + erro.data + "\n");
                });

            cursoPromise
                .then(function(data){
                    vm._model.curso = data;
                    $.extend(vm._model.curso.vagas, {}, {
                        isEnding: function () {
                            return (this.preenchidas / (this.totais == 0 ? 1 : this.totais) >= 0.9 ? true : false);
                        },
                        getDisponiveis: function () {return (parseInt(this.totais) - parseInt(this.preenchidas));
                        }
                    });
                })
                .catch(function(erro){
                    console.log("\n" + erro.data + "\n");
                });

            docPromise
                .then(function(data){
                    vm._model.documentacao = data;
                })
                .catch(function(erro){
                    console.log("\n" + erro.data + "\n");
                });

            inscrPromise
                .then(function(data){
                    vm._model.inscr = data;
                })
                .catch(function(erro){
                    console.log("\n" + erro.data + "\n");
                });

            pagPromise
                .then(function(data){
                    vm._model.pagamento = data;
                })
                .catch(function(erro){
                    console.log("\n" + erro.data + "\n");
                });
//            // ==== FORM DATA ==== //
//
//            vm._novo_cheque = {};
//            vm.cleanForm();
//            vm._data = {
//                curso: {
//                    unidade: ''
//                },
//                pagamento: {
//                    lista_cheques: lista_cheques
//                },
//                controle: {}
//            };

            // ==== MÉTODOS ==== //

            vm.selectPhoneType = function (item, model) {
                vm._model.aluno.telefone.mask = model == 'cel' ? '(99) 9999-99999' : '(99) 9999-9999';
            };

            vm.openModalCheque = function () {
                var modalInstance = $modal.open({
                    templateUrl: '../html/comercial/modal-cheques.html',
                    controller: 'ModalCheques',
                    size: 'lg'
                });
            };

            vm.cleanForm = function () {
                lista_cheques.clean();
                vm._data = {
                    aluno: {},
                    curso: {
                        unidade: ''
                    },
                    pagamento: {
                        lista_cheques: lista_cheques
                    },
                    controle: {}
                };
                $timeout(function () {
                    $('select').select2('destroy');
                    $('select').select2({width: "100%", placeholder: "Selecione uma opção"});
                });
            };

            vm.sendForm = function () {
                console.log('//=== Formuário enviado:');
                console.log(JSON.stringify(vm._data));
                console.log('====//');
            };

            // ==== REQUISIÇÕES ==== //

            /*vm.getAreas = function (view) {
                $timeout(function () {
                    vm._model.curso.area.list = [
                        {
                            id: "1",
                            text: vm._data.curso.unidade + " - Área 01"
                        },
                        {
                            id: "2",
                            text: vm._data.curso.unidade + " - Área 02"
                        },
                        {
                            id: "3",
                            text: vm._data.curso.unidade + " - Área 03"
                        }
                    ];
                    vm._data.curso.area = '';
                    vm._data.curso.curso = '';
                    view.remake('#f_curso_area select');
                }, 1);
            };
            vm.getCursos = function (view) {
                $timeout(function () {
                    vm._model.curso.curso.list = [
                        {
                            id: "1",
                            text: vm._data.curso.unidade + ' - ' +
                                vm._data.curso.area + " - Curso 01"
                        },
                        {
                            id: "2",
                            text: vm._data.curso.unidade + ' - ' +
                                vm._data.curso.area + " - Curso 02"
                        },
                        {
                            id: "3",
                            text: vm._data.curso.unidade + ' - ' +
                                vm._data.curso.area + " - Curso 03"
                        }
                    ];
                    vm._data.curso.curso = '';
                    view.remake('#f_curso_curso select');
                }, 1);
            };*/
            vm.getVagas = function (view, view2) {
                $timeout(function () {
                    function getRandomInt(min, max) {
                        return Math.floor(Math.random() * (max - min)) + min;
                    }

                    var a = getRandomInt(100, 201), b = getRandomInt(0, 101);
                    vm._model.curso.vagas.totais = a;
                    vm._model.curso.vagas.preenchidas = Math.floor(b * a / 100);
                }, 1);
            };

            vm.salvarFirstData = function() {
                console.log("salva!")
            };

            // ==== FORM DATA ==== //
/*
            vm._novo_cheque = {};
            vm.cleanForm();
            vm.tipoPagamento = false;
            vm.teste = function(){
                vm.tipoPagamento = true;
            };*/
        }
    ]);
});