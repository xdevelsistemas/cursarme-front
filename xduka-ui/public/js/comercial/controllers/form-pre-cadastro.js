define(['./__module__', "jquery"], function (controllers, $) {
    'use strict';
    
    controllers.controller('FormPreCadastro', [
        '$scope', '$timeout', '$modal', '$resource', 'lista_cheques', 'allCheques',
        function ($scope, $timeout, $modal, $resource, lista_cheques, allCheques) {

            /* jshint validthis: true */
            var vm = this
                , comercialPromise = $resource('/api/comercial/dados-comercial').get().$promise;


            // ==== MODELOS ==== //

            vm._model = {};
            vm.validaCpf = true;
            vm.btnAddCheque = false;
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
                }, 1);
            };

            vm.openModalCheque = function () {
                var modalInstance = $modal.open({
                    templateUrl: '../html/comercial/modal-cheques.html',
                    controller: 'ModalCheques',
                    size: 'lg'
                });
            };

            vm.salvarFirstData = function() {
                vm.dadosIniciais = {
                    area: vm._model.curso.area.value,
                    cep: vm._model.aluno.cep.model.val,
                    cidade: vm._model.aluno.cidade.model.val,
                    cpf: vm._model.aluno.cpf.model.val,
                    curso: vm._model.curso.curso.value,
                    desconto: vm._model.inscr.desconto.value,
                    email: vm._model.aluno.email.model.val,
                    formaPagamento: vm._model.inscr.formaPagamento.value,
                    melhorData: vm._model.inscr.melhorData.value,
                    nome: vm._model.aluno.nome.model.val,
                    qtdParcelas: vm._model.inscr.qtdParcelas.value,
                    rg: vm._model.aluno.rg.model.val,
                    telefone: vm._model.aluno.telefone.model.val,
                    tipoTelefone: vm._model.aluno.tipo_telefone.value,
                    unidade: vm._model.curso.unidade.value,
                    valorInscricao: vm._model.inscr.inscricao.model.val,
                    listaCheques: allCheques.getAllCheques()
                };

                //// verifica se os campos sao validos e se os campo não estão vazios

                var dataDadosIniciais = {"dadosIniciais": vm.dadosIniciais},
                    savePromisse = $resource('/api/comercial/salva-dados-iniciais').save({}, dataDadosIniciais).$promise;

                savePromisse
                    .then(function(data){
                        //vm.dadosIniciais.successMessage = vm.STR.SUCESSO;
                        //vm._model.aluno = data.object;
                    })
                    .catch(function(erro) {

                    });
            };

            vm.salvarSecondData = function() {
                console.table(vm._model.aluno);
            };

            vm.selectCheque = function (item, model) {
                //model == "2" ? $("#btn_addChequeStep1").slideDown() : $("#btn_addChequeStep1").slideUp();
                model == "2" ? vm.btnAddCheque = true : vm.btnAddCheque = false;
            };

            vm.selectPhoneType = function (item, model) {
                var tel = vm._model.aluno.telefone.model.val;
                vm._model.aluno.telefone.mask = model == 'cel' ? '(99)9999-99999' : '(99)9999-9999';
                vm._model.aluno.telefone.model.val = tel;
            };

            vm.sendForm = function () {
                console.log('//=== Formuário enviado:');
                console.log(JSON.stringify(vm._data));
                console.log('====//');
            };
        }
    ]);
});