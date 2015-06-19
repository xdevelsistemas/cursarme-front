(function() {
    "use strict";

    angular.module('app.controllers').controller('FormPreCadastro', [
        '$scope', 'breadCrumb', '$timeout', '$modal', '$resource', 'modelStrings', 'lista_cheques', 'dataCheque', 'tipoTelefone',
        function ($scope, breadCrumb, $timeout, $modal, $resource, modelStrings, lista_cheques, dataCheque, tipoTelefone) {

            /* jshint validthis: true */
            var vm = this
                , comercialPromise = $resource('/api/comercial/template-inscricao').get().$promise
                , viewInscrPromise = $resource('/api/comercial/view-inscr').get().$promise;

            breadCrumb.title = 'Pré Cadastro';

            // ==== MODELOS ==== //

            vm._model = {};

            // Botões de pre-cadastro
            vm.btnAddChequeStep1 = false;
            vm.btnAddChequeStep2 = false;
            vm.confirmEdit = confirmEdit;
            vm.disableAlert = disableAlert;
            vm.disableAtualiza = false;
            vm.disableAnterior = true;
            vm.disableBtn = disableBtn;
            vm.disableLimpar = false;
            vm.disableProximo = false;
            vm.editarInscr = editarInscr;
            vm.editing = false;
            vm.lista_cheques = lista_cheques;

            //alert sucesso
            vm.sendSucess = false;

            //Alerta de campos faltando
            vm.showAlert = false;

            //xd-select de curso
            vm.selectCursoArea = false;
            vm.selectCursoCurso = false;
            vm.selectCursoVagas = false;

            vm.STR = modelStrings;

            // valida todos os campos
            vm.validaCpf = false;
            vm.validaSexo = false;

            // valida cep
            vm.validaCep = false;
            vm.validaCepAvRua = false;
            vm.validaCepBairro = false;
            vm.validaCepCidade = false;
            vm.validaCepEndUf = false;

            // temporarias de dados
            vm.tempItem = {}; /* Guarda um obj para confirmar a edição em caso de uma edição quando um cadastro já está sendo editado */

            // ==== REQUISIÇÕES ==== //

            comercialPromise
                .then(function(data){
                    vm._model = data;
                    $.extend(vm._model.vagas, funcVagas());
                    vm.selectPhoneType({}, vm._model.tipoTelefone.model.val);
                })
                .catch(function(erro){
                    console.log("\n" + erro.data + "\n");
                });

            viewInscrPromise
                .then(function(data2) {
                    vm._viewInscr = data2;

                    for (var i = 0; i < data2.list.length; i++) {
                        for (var j = 0; j < data2.list[i].listaCheques.length; j++) {
                            vm._viewInscr.list[i].listaCheques[j].data = new Date(data2.list[i].listaCheques[j].data);
                        }
                    }
                })
                .catch(function(erro) {
                    console.log("\n" + erro.data + "\n");
                });


            vm.getDadosCep = function(cep) {
                if (cep.length == 8) {
                    var getCepPromise = $resource('/api/comercial/dados-cep/:cep').get({"cep": cep}).$promise;

                    getCepPromise
                        .then(function (data) {
                            if (data.erro) {
                                vm.validaCep = data.erro;
                                vm.validaCepAvRua = data.erro;
                                vm.validaCepBairro = data.erro;
                                vm.validaCepCidade = data.erro;
                                vm.validaCepEndUf = data.erro;

                                vm._model.cep.model.err = vm.STR.NOCEPFOUND;
                                vm._model.avRua.model.val = '';
                                vm._model.bairro.model.val = '';
                                vm._model.cidade.model.val = '';
                                vm._model.endUf.model.val = '';
                            } else {
                                vm.validaCep = false;
                                vm._model.avRua.model.val = data.logradouro.length <= 1 ? '' : data.logradouro;
                                vm._model.bairro.model.val = data.bairro;
                                vm._model.cidade.model.val = data.localidade;
                                vm._model.endUf.model.val = "UF_" + data.uf;
                                vm._model.cep.model.err = '';

                                vm.validaCepAvRua = data.logradouro.length <= 1;
                                vm.validaCepBairro = !data.bairro;
                                vm.validaCepCidade = !data.localidade;
                                vm.validaCepEndUf = !data.uf;
                            }
                        })
                        .catch(function (erro) {
                            console.log(erro);
                        });
                }
            };

            vm.verificaCpf = function (cpf) {
                if (cpf.length == 11) {
                    try {
                        if (cpf == "00000000000" || cpf == "11111111111" || cpf == "22222222222" ||
                            cpf == "33333333333" || cpf == "44444444444" || cpf == "55555555555" ||
                            cpf == "66666666666" || cpf == "77777777777" || cpf == "88888888888" || cpf == "99999999999"){
                            vm._model.cpf.model.err = 'CPF inválido';
                            vm.validaCpf = false;
                        }else{
                            // Valida 1o digito
                            var add, rev;
                            add = 0;
                            for (var i=0; i < 9; i ++)
                                add += parseInt(cpf.charAt(i)) * (10 - i);
                            rev = 11 - (add % 11);
                            if (rev == 10 || rev == 11)
                                rev = 0;
                            if (rev != parseInt(cpf.charAt(9))) {
                                vm._model.cpf.model.err = 'CPF inválido';
                                vm.validaCpf = false;
                            }else{
                                // Valida 2o digito
                                add = 0;
                                for (i = 0; i < 10; i ++)
                                    add += parseInt(cpf.charAt(i)) * (11 - i);
                                rev = 11 - (add % 11);
                                if (rev == 10 || rev == 11)
                                    rev = 0;
                                if (rev != parseInt(cpf.charAt(10))) {
                                    vm._model.cpf.model.err = 'CPF inválido';
                                    vm.validaCpf = false;
                                }else{
                                    var verificaCpfPromise = $resource('/api/comercial/verifica-cpf/:cpf').get({"cpf": cpf}).$promise;

                                    verificaCpfPromise
                                        .then(function (data) {
                                            vm._model.cpf.model.err = data.dados.msg;
                                            vm._model.unidade.list = data.dadosCurso.unidade.list;
                                            vm.validaCpf = !data.dados.msg;
                                            if(vm.validaCpf){
                                                vm.editing = true;
                                            }
                                        })
                                        .catch(function (erro) {
                                            console.log(erro);
                                        })
                                }
                            }

                        }
                    }catch(erro){
                        console.log("Erro:\n" + erro);
                    }
                } else {
                    vm.validaCpf = false;
                }
            };

            vm.verificaSexo = function(item, model) {
                vm.validaSexo = model == 'f';
                vm._model.certificadoRes.model.val = '';
                vm._model.registro.model.val = '';
                vm._model.categoria.model.val = '';
                vm._model.ufReservista.model.val = '';
            };

            vm.unidadeChange = function (item, model) {
                vm.selectCursoArea = true;
                vm.selectCursoCurso = false;
                vm.selectCursoVagas = false;

                vm._model.area.list = [];
                vm._model.area.model = {'val': '', 'err': ''};
                $.extend(vm._model.area.list, item.areas);

                // limpa a sujeira que fica no model.val quando troca de curso
                limpaCampoPag();
            };

            vm.areaChange = function (item, model) {
                vm.selectCursoCurso = true;
                vm.selectCursoVagas = false;

                vm._model.curso.list = [];
                vm._model.curso.model = {'val': '', 'err': ''};
                $.extend(vm._model.curso.list, item.cursos);
                $.extend(vm._model.vagas, item.turma[0].vagas);

                // limpa a sujeira que fica no model.val quando troca de curso
                limpaCampoPag();
            };

            vm.cursoChange = function (item, model) {
                vm.selectCursoVagas = true;

                // alimentando valores referentes ao curso selecionado
                $.extend(vm._model.descontoInscr.list, item.descontoInscr);
                $.extend(vm._model.desconto.list, item.desconto);
                $.extend(vm._model.qtdParcelas.list, item.qtdParcelas);
                $.extend(vm._model.melhorData.list, item.melhorData);

                // limpa a sujeira que fica no model.val quando troca de curso
                limpaCampoPag();

                // definindo valor de inscrição
                vm._model.valorInscricao.model.val = item.valorInscricao;
                vm._model.valorInscricao.model.aux = item.valorInscricao;
                vm._model.valorIntegral.model.val = item.valorIntegral;
                vm._model.valorIntegral.model.aux = item.valorIntegral;

                $timeout(function () {
                    if ((vm._model.vagas.totais / vm._model.vagas.preenchidas) < 1.5){
                        vm._model.vagas.css.titleRed = true;
                        vm._model.vagas.css.titleBlue = false
                    }else{
                        vm._model.vagas.css.titleBlue = true;
                        vm._model.vagas.css.titleRed = false
                    }
                }, 1);
            };

            vm.descontoAplicInscr = function(item, model) {
                if (model != 0) {
                    vm._model.valorInscricao.model.val = vm._model.valorInscricao.model.aux - ((vm._model.valorInscricao.model.aux * model) / 100);
                }else{
                    vm._model.valorInscricao.model.val = vm._model.valorInscricao.model.aux;
                }
            };

            vm.descontoAplic = function(item, model) {
                if (model != 0) {
                    vm._model.valorIntegral.model.val = vm._model.valorIntegral.model.aux - ((vm._model.valorIntegral.model.aux * model) / 100);
                }else{
                    vm._model.valorIntegral.model.val = vm._model.valorIntegral.model.aux;
                }

                if (vm._model.qtdParcelas.model.val) {
                    vm.qtdParcelasAplic({}, vm._model.qtdParcelas.model.val);
                }
            };

            vm.qtdParcelasAplic = function(item, model) {
                vm._model.valorParcela.model.val = vm._model.valorIntegral.model.val / model;
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
                vm._model.telefone.mask = tipoTelefone.getMskPhone(model);
            };

            vm.sendInscricaoCompleta = function() {
                vm._model.listaCheques = vm.lista_cheques.lista;

                var sendInscricaoCompletaPromise = $resource('/api/comercial/dados-inscricao-completa').save({}, {"model": vm._model, "STR": vm.STR}).$promise;

                sendInscricaoCompletaPromise
                    .then(function (data) {
                        vm._model = data;
                        vm.disableLimpar = false;
                        $.extend(vm._model.vagas, funcVagas());
                        disableBtn()
                    })
                    .catch(function (erro) {
                        console.log("\n" + erro.data + "\n")
                    });
            };

            vm.sendInscricaoParcial = function() {
                vm._model.listaCheques = vm.lista_cheques.lista;

                var sendInscricaoParcialPromise = $resource('/api/comercial/dados-inscricao-parcial').save({}, {"model": vm._model, "STR": vm.STR}).$promise;

                sendInscricaoParcialPromise
                    .then(function (data) {
                        vm._model = data;
                        vm.disableLimpar = false;
                        $.extend(vm._model.vagas, funcVagas());
                        disableBtn();
                        vm.limpaForm();
                        vm.sendSucess = data.success;
                    })
                    .catch(function (erro) {
                        console.log("\n" + erro.data + "\n")
                    });
            };

            //TODO função selectSexo() para desabilitar reservistas caso seja feminino

            vm.topCollapse = function(){
                $('html, body').animate({scrollTop: 0},'slow');
            };

            function disableBtn(){
                $timeout(function () {
                    vm.disableAtualiza = $('#step0').attr('class').indexOf('active') == -1;
                    vm.disableAnterior = $('#step0').attr('class').indexOf('active') != -1;
                    vm.disableProximo = $('#step3').attr('class').indexOf('active') != -1;
                }, 300);
            }

            function disableAlert(){
                vm.showAlert = false;
            }

            function editarInscr(item){

                if (!vm.editing) {
                    var getUnidadePromise = $resource('/api/comercial/dados-curso').get().$promise,
                        curso = {};

                    getUnidadePromise
                        .then(function (data) {
                            vm.editing = true;
                            vm.showAlert = true;
                            vm.disableLimpar = true;
                            vm.validaCpf = true;

                            vm.selectCursoArea = true;
                            vm.selectCursoCurso = true;
                            vm.selectCursoVagas = true;

                            vm._model.unidade.list = data.unidade.list;

                            vm._model.area.list = $.grep(vm._model.unidade.list, function (e) {
                                return e.id == item.unidade.model.val;
                            })[0].areas;

                            vm._model.curso.list = $.grep(vm._model.area.list, function (e) {
                                return e.id == item.area.model.val;
                            })[0].cursos;


                            // definindo valor de inscrição
                            vm._model.valorInscricao.model.val = item.valorInscricao.model.val;
                            vm._model.valorIntegral.model.val = item.valorIntegral.model.val;

                            curso = $.grep(vm._model.curso.list, function (e) {
                                return e.id == item.curso.model.val;
                            })[0];

                            vm._model.valorInscricao.model.aux = curso.valorInscricao;
                            vm._model.valorIntegral.model.aux = curso.valorIntegral;

                            // alimentando valores referentes ao curso selecionado
                            vm._model.descontoInscr.list = curso.descontoInscr;
                            vm._model.desconto.list = curso.desconto;
                            vm._model.qtdParcelas.list = curso.qtdParcelas;
                            vm._model.melhorData.list = curso.melhorData;


                            // limpa a sujeira que fica no model.val quando troca de curso
                            limpaCampoPag();

                            $.extend(true, vm._model, item);
                            vm.getDadosCep(vm._model.cep.model.val);
                            vm.selectPhoneType({}, vm._model.tipoTelefone.model.val);

                        })
                        .catch(function (erro) {
                            console.log(erro);
                        });

                    vm.btnAddChequeStep1 = item.formaPagamentoInscr.model.val == 2;
                    vm.btnAddChequeStep2 = item.formaPagamentoPag.model.val == 2;
                    lista_cheques.addAll(item.listaCheques);
                }else{
                    $('#confirmEdit').modal('show');
                    vm.tempItem = item;
                    /*if(window.confirm('Há um cadastro atual em edição/cadastro, deseja ignorá-lo?')){
                     vm.editing = false;
                     vm.disableBtn();
                     vm.limpaForm();
                     $('#cursorSetp0').click()
                     }else{
                     vm.disableBtn();
                     }*/
                }
            }

            function confirmEdit(itemBkp){
                vm.limpaForm();
                vm.editarInscr(itemBkp);
            }

            function funcVagas() {
                return {
                    isEnding: function () {
                        return (this.preenchidas / (this.totais == 0 ? 1 : this.totais) >= 0.9 ? true : false);
                    },
                    getDisponiveis: function () {
                        return (parseInt(this.totais) - parseInt(this.preenchidas));
                    }
                }
            }

            function limpaCampoPag() {
                vm._model.desconto.model.val = "";
                vm._model.qtdParcelas.model.val = "";
                vm._model.melhorData.model.val = "";
                vm._model.valorInscricao.model.val = '';
                vm._model.valorIntegral.model.val = '';
                vm._model.valorParcela.model.val = '';
            }

            vm.limpaForm = function(){
                // escondendo select's de curso
                vm.selectCursoArea = false;
                vm.selectCursoCurso = false;
                vm.selectCursoVagas = false;

                vm.limpaFormStep1();
                vm.limpaFormStep2();
                vm.limpaFormStep3();

                // limpando cheques adicionados
                lista_cheques.clean();

                vm.editing = false;
                vm.disableLimpar = false;
                vm.validaCpf = false;

                vm.topCollapse();
            };

            vm.limpaFormStep1 = function() {

                vm._model.cpf.model.val = '';
                vm._model.cpf.model.err = '';
                vm._model.rg.model.val = '';
                vm._model.rg.model.err = '';
                vm._model.nome.model.val = '';
                vm._model.nome.model.err = '';
                vm._model.cidade.model.val = '';
                vm._model.cidade.model.err = '';
                vm._model.cep.model.val = '';
                vm._model.cep.model.err = '';
                vm._model.telefone.model.val = '';
                vm._model.telefone.model.err = '';
                vm._model.tipoTelefone.model.val = '';
                vm._model.tipoTelefone.model.err = '';
                vm._model.email.model.val = '';
                vm._model.email.model.err = '';
                vm._model.unidade.model.val = '';
                vm._model.unidade.model.err = '';
                vm._model.area.model.val = '';
                vm._model.area.model.err = '';
                vm._model.curso.model.val = '';
                vm._model.curso.model.err = '';
                vm._model.valorInscricao.model.val = '';
                vm._model.valorInscricao.model.err = '';
                vm._model.formaPagamentoInscr.model.val = '';
                vm._model.formaPagamentoInscr.model.err = '';
            };

            vm.limpaFormStep2 = function() {

                vm._model.valorIntegral.model.val = '';
                vm._model.valorIntegral.model.err = '';
                vm._model.desconto.model.val = '';
                vm._model.desconto.model.err = '';
                vm._model.formaPagamentoPag.model.val = '';
                vm._model.formaPagamentoPag.model.err = '';
                vm._model.qtdParcelas.model.val = '';
                vm._model.qtdParcelas.model.err = '';
                vm._model.valorParcela.model.val = '';
                vm._model.valorParcela.model.err = '';
                vm._model.melhorData.model.val = '';
                vm._model.melhorData.model.err = '';
                vm._model.observacoes.model.val = '';
                vm._model.observacoes.model.err = '';
                vm._model.listaCheques = [];
            };

            vm.limpaFormStep3 = function() {

                vm._model.dataExp.model.val = '';
                vm._model.dataExp.model.err = '';
                vm._model.orgaoEmissor.model.val = '';
                vm._model.orgaoEmissor.model.err = '';
                vm._model.tituloEleitor.model.val = '';
                vm._model.tituloEleitor.model.err = '';
                vm._model.zona.model.val = '';
                vm._model.zona.model.err = '';
                vm._model.secao.model.val = '';
                vm._model.secao.model.err = '';
                vm._model.ufTitulo.model.val = '';
                vm._model.ufTitulo.model.err = '';
                vm._model.certidaoNc.model.val = '';
                vm._model.certidaoNc.model.err = '';
                vm._model.folha.model.val = '';
                vm._model.folha.model.err = '';
                vm._model.livro.model.val = '';
                vm._model.livro.model.err = '';
                vm._model.cartorio.model.val = '';
                vm._model.cartorio.model.err = '';
                vm._model.certificadoRes.model.val = '';
                vm._model.certificadoRes.model.err = '';
                vm._model.registro.model.val = '';
                vm._model.registro.model.err = '';
                vm._model.ufReservista.model.val = '';
                vm._model.ufReservista.model.err = '';
                vm._model.categoria.model.val = '';
                vm._model.categoria.model.err = '';
                vm._model.sexo.model.val = '';
                vm._model.sexo.model.err = '';
                vm._model.dataNasc.model.val = '';
                vm._model.dataNasc.model.err = '';
                vm._model.raca.model.val = '';
                vm._model.raca.model.err = '';
                vm._model.estadoCivil.model.val = '';
                vm._model.estadoCivil.model.err = '';
                vm._model.pai.model.val = '';
                vm._model.pai.model.err = '';
                vm._model.mae.model.val = '';
                vm._model.mae.model.err = '';
                vm._model.avRua.model.val = '';
                vm._model.avRua.model.err = '';
                vm._model.endNum.model.val = '';
                vm._model.endNum.model.err = '';
                vm._model.apt.model.val = '';
                vm._model.apt.model.err = '';
                vm._model.bairro.model.val = '';
                vm._model.bairro.model.err = '';
                vm._model.endUf.model.val = '';
                vm._model.endUf.model.err = '';
                vm._model.nacionalidade.model.val = '';
                vm._model.nacionalidade.model.err = '';
                vm._model.naturalidade.model.val = '';
                vm._model.naturalidade.model.err = '';
                vm._model.natUf.model.val = '';
                vm._model.natUf.model.err = '';
                vm._model.escolaEm.model.val = '';
                vm._model.escolaEm.model.err = '';
                vm._model.anoEm.model.val = '';
                vm._model.anoEm.model.err = '';
                vm._model.cursoGrad.model.val = '';
                vm._model.cursoGrad.model.err = '';
                vm._model.anoGrad.model.val = '';
                vm._model.anoGrad.model.err = '';
                vm._model.instituicao.model.val = '';
                vm._model.instituicao.model.err = '';
            };

            vm.cancelEdit = function(){
                vm.limpaForm();
                vm.disableLimpar = false;
                disableBtn();
                vm.editing = false;

            };

            vm.condTable = {
                boolean: function(elem){
                    return typeof(elem) == 'boolean'
                },
                checkbox: function(elem){
                    return elem == 'checkbox'
                },
                editFunc: function(){
                    vm.disableLimpar = true;
                },
                editInscr: vm.editarInscr
            };

            vm.disableSendSucess = function(){
                vm.sendSucess = false;
            };

        }]),

        '$scope', 'breadCrumb', '$timeout', '$modal', '$resource', 'modelStrings', 'lista_cheques', 'dataCheque', 'tipoTelefone'
})();
