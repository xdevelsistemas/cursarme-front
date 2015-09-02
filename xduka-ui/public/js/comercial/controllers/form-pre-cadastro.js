(function() {
    "use strict";

    angular.module('app.controllers').controller('FormPreCadastro', [
        '$scope', 'breadCrumb', '$timeout', '$modal', '$route', '$resource', 'modelStrings', 'lista_cheques', 'dataCheque', 'tipoTelefone',
        function ($scope, breadCrumb, $timeout, $modal, $route, $resource, modelStrings, lista_cheques, dataCheque, tipoTelefone) {

            /* jshint validthis: true */
            var vm = this
                , comercialPromise = $resource('/api/comercial/template-inscricao').get().$promise
                , viewInscrPromise = $resource('/api/comercial/view-inscr').get().$promise;

            breadCrumb.title = 'Pré Cadastro';

            // VARIÁVEIS COMUNS
            // Modelo
            vm._model = {};
            // Botões de pre-cadastro
            vm.btnAddChequeStep1 = false;
            vm.btnAddChequeStep2 = false;
            vm.disableAtualiza = false;
            vm.disableAnterior = true;
            vm.disableLimpar = false;
            vm.disableProximo = false;
            // Habilita passos do desconto
            vm.disableDescAdd = true;
            vm.disableQtdParcelas = true;
            // Edição de cadastro
            vm.editing = false;
            vm.lista_cheques = lista_cheques;
            // Habilitar ou desabilitar checks
            vm.isComplementacao = false;
            vm.isContinuada = false;
            vm.isMestrado = false;
            vm.isPosGrad = false;
            vm.isTeologia = false;
            //xd-select de curso
            vm.selectCursoTipoCurso = false;
            vm.selectCursoArea = false;
            vm.selectCursoCurso = false;
            vm.selectCursoVagas = false;
            //alert sucesso
            vm.sendSuccess = false;
            //Alerta de campos faltando
            vm.showAlert = false;
            //Common model string
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

            // VARIÁVEIS TIPO FUNÇÕES
            //
            vm.addDescontoAdicional = addDescontoAdicional;
            // Select area
            vm.areaChange = areaChange;
            //
            vm.atualizaPartial = atualizaPartial;
            //
            vm.cancelarDescontoAdicional = cancelarDescontoAdicional;
            vm.cancelEdit = cancelEdit;
            //
            vm.confirmEdit = confirmEdit;
            // Select curso
            vm.cursoChange = cursoChange;
            //
            vm.disableAlert = disableAlert;
            vm.disableBtn = disableBtn;
            vm.disableSendSuccess = disableSendSuccess;
            // Edição de cadastro
            vm.editarInscr = editarInscr;
            //
            vm.getDadosCep = getDadosCep;
            // Limpa forms
            vm.limpaForm = limpaForm;
            vm.limpaFormStep1 = limpaFormStep1;
            vm.limpaFormStep2 = limpaFormStep2;
            vm.limpaFormStep3 = limpaFormStep3;
            vm.limpaFormStep4 = limpaFormStep4;
            //
            vm.openModalCheque = openModalCheque;
            // Desconto por qtd parcelas
            vm.qtdParcelasAplic = qtdParcelasAplic;
            //
            vm.selectChequeStep1 = selectChequeStep1;
            vm.selectChequeStep2 = selectChequeStep2;
            vm.selectPhoneType = selectPhoneType;
            // Envio dos dados de cadastro/edicao
            vm.sendInscricaoCompleta = sendInscricaoCompleta;
            vm.sendInscricaoParcial = sendInscricaoParcial;
            //select tipo curso
            vm.tipoCursoChange = tipoCursoChange;
            //
            vm.topCollapse = topCollapse;
            // select unidade
            vm.unidadeChange = unidadeChange;
            //
            vm.verificaCpf = verificaCpf;
            vm.verificaSexo = verificaSexo;

            // ==== REQUISIÇÕES ==== //
            comercialPromise
                .then(function(data){
                    vm._model = data;
                    $.extend(vm._model.vagas, funcVagas());
                    vm.selectPhoneType({}, vm._model.tipoTelefone.model.val);
                })
                .catch(function(erro){
                    if (erro.status == '400') {
                        console.log(erro)
                    }
                });

            viewInscrPromise
                .then(function(data) {
                    vm._viewInscr = data;

                    for (var i = 0; i < data.list.length; i++) {
                        for (var j = 0; j < data.list[i].listaCheques.length; j++) {
                            vm._viewInscr.list[i].listaCheques[j].data = new Date(data.list[i].listaCheques[j].data);
                        }
                    }
                })
                .catch(function(erro) {
                    // TOdo tratar erro
                    if (erro.status == '400') {
                        console.log("Erro 400");
                        console.log(erro);
                    }
                });

            function getDadosCep(cep) {
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
                            if (erro.status == '400') {
                                console.log(erro)
                            }
                        });
                }
            }

            function verificaCpf(cpf) {
                if (cpf.length == 11) {
                    try {
                        if (cpf == "00000000000" || cpf == "11111111111" || cpf == "22222222222" ||
                            cpf == "33333333333" || cpf == "44444444444" || cpf == "55555555555" ||
                            cpf == "66666666666" || cpf == "77777777777" || cpf == "88888888888" || cpf == "99999999999"){
                            vm._model.cpf.model.err = 'CPF inválido';
                            vm.validaCpf = false;
                            vm.editing = false;
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
                                vm.editing = false;
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
                                    vm.editing = false;
                                }else{
                                    var verificaCpfPromise = $resource('/api/comercial/verifica-cpf/:cpf').get({"cpf": cpf}).$promise;

                                    verificaCpfPromise
                                        .then(function (data) {
                                            vm._model.cpf.model.err = data.dados.msg;
                                            vm._model.unidade.list = data.dadosCurso.unidade.list;
                                            vm.validaCpf = !data.dados.msg;
                                            vm.editing = vm.validaCpf;

                                            vm._model.desconto.model.aux = data.desconto;
                                        })
                                        .catch(function (erro) {
                                            if (erro.status == '400') {
                                                console.log(erro)
                                            }
                                        })
                                }
                            }

                        }
                    }catch(erro){
                        if (erro.status == '400') {
                            console.log(erro)
                        }
                    }
                } else {
                    vm.validaCpf = false;
                    vm.editing = false;
                }
            }

            function verificaSexo(item, model) {
                vm.validaSexo = model == 'f';
                vm._model.certificadoRes.model.val = '';
                vm._model.registro.model.val = '';
                vm._model.categoria.model.val = '';
                vm._model.ufReservista.model.val = '';
            }

            function unidadeChange(item, model) {
                vm.selectCursoTipoCurso = true;
                vm.selectCursoArea = false;
                vm.selectCursoCurso = false;
                vm.selectCursoVagas = false;

                vm._model.tipoCurso.list = [];
                vm._model.tipoCurso.model = {'val': '', 'err': ''};
                vm._model.tipoCurso.list = item.tipoCursos;

                // limpa a sujeira que fica no model.val quando troca de curso
                limpaCampoPag();
            }

            function tipoCursoChange(item, model) {
                vm.selectCursoArea = true;
                vm.selectCursoCurso = false;
                vm.selectCursoVagas = false;

                vm._model.area.list = [];
                vm._model.area.model = {'val': '', 'err': ''};
                vm._model.area.list = item.areas;

                // limpa a sujeira que fica no model.val quando troca de curso
                limpaCampoPag();

                // definindo valores para pagamento
                vm._model.formaPagamentoPag.valores = item.valores;
                vm._model.valorInscricao.model.aux = item.valores.inscricao;
                vm._model.valorIntegral.model.aux = item.valores.integral;

                // Habilitando checkbox's da documentação
                vm.isMestrado = item.text.toLowerCase().indexOf("mestrado") != -1;
                vm.isTeologia = item.text.toLowerCase().indexOf("teologia") != -1;
                vm.isPosGrad = item.text.toLowerCase().indexOf("pós graduação") != -1;
                vm.isContinuada = item.text.toLowerCase().indexOf("continuada") != -1;
                vm.isComplementacao = item.text.toLowerCase().indexOf("complementação") != -1;
            }

            function areaChange(item, model) {
                vm.selectCursoCurso = true;
                vm.selectCursoVagas = false;

                vm._model.curso.list = [];
                vm._model.curso.model = {'val': '', 'err': ''};
                vm._model.curso.list = item.cursos;
                $.extend(vm._model.vagas, item.turma[0].vagas);

                // limpa a sujeira que fica no model.val quando troca de curso
                limpaCampoPag();
            }

            function cursoChange(item, model) {
                vm.selectCursoVagas = true;

                // alimentando valores referentes ao curso selecionado
                vm._model.qtdParcelas.list = item.qtdParcelas;
                vm._model.melhorData.list = item.melhorData;

                // limpa a sujeira que fica no model.val quando troca de curso
                limpaCampoPag();

                // definindo valor de inscrição
                vm._model.valorInscricao.model.val = vm._model.valorInscricao.model.aux;
                vm._model.valorIntegral.model.val = vm._model.valorIntegral.model.aux;
                vm._model.desconto.model.val = vm._model.desconto.model.aux;
                alteraValorIntegral();

                $timeout(function () {
                    if ((vm._model.vagas.totais / vm._model.vagas.preenchidas) < 1.5){
                        vm._model.vagas.css.titleRed = true;
                        vm._model.vagas.css.titleBlue = false
                    }else{
                        vm._model.vagas.css.titleBlue = true;
                        vm._model.vagas.css.titleRed = false
                    }
                }, 1);
            }

            function qtdParcelasAplic(item, model) {
                /*  Testando se qtd de parcelas é igual a 1  */
                if (model == '1'){
                    /*  Calculando o percentual de pagamento à vista  */
                    vm._model.desconto.model.percentAvista = 1 - ((vm._model.formaPagamentoPag.valores.avista) / vm._model.formaPagamentoPag.valores.integral);
                    /*  Aqui dizemos que estamos usuando o percentual de à vista  */
                    vm._model.desconto.model.percentAvistaBool = true;
                    vm._model.desconto.model.val += vm._model.desconto.model.percentAvista;
                } else {
                    /* Testando se foi adicionado o percentual de valor à vista no desconto  */
                    if (vm._model.desconto.model.percentAvistaBool) {
                        /*  Aqui dizemos que estamos tirando o percentual à vista  */
                        vm._model.desconto.model.percentAvistaBool = false;
                        vm._model.desconto.model.val -= vm._model.desconto.model.percentAvista;
                    }
                }

                alteraValorIntegral();
                /* Adicionando ao valor da parcela a divisão do valor integral com a quantidade de parcelas selecionada  */
                vm._model.valorParcela.model.val = vm._model.valorIntegral.model.val / model;
            }

            function addDescontoAdicional(_edit){
                /*  Verificando se os campos estão vazios  */
                vm._model.descricaoDesconto.model.err = vm._model.descricaoDesconto.model.val.length == 0 ? vm.STR.FIELD: '';
                vm._model.descontosAdicionais.model.err = vm._model.descontosAdicionais.model.val.length == 0 ? vm.STR.FIELD: '';

                /*  Se estão vazios retorna com 0(zero) e informa com as mensagens acima  */
                if(!!vm._model.descricaoDesconto.model.err || !!vm._model.descontosAdicionais.model.err){
                    return 0
                }

                /* Agora o cálculo com o desconto adicional aparece  */
                if (vm._model.desconto.model.descontoAdd) {
                    vm._model.desconto.model.val -= vm._model.desconto.model.descontoAdd;
                } else {
                    vm._model.desconto.model.val -= vm._model.desconto.model.aux;
                }

                vm._model.desconto.model.descontoAdd = $.grep( vm._model.descontosAdicionais.list, function( n, i ) {
                    return n.id == vm._model.descontosAdicionais.model.val;
                })[0].percent;

                vm._model.descontosAdicionais.model.text = $.grep( vm._model.descontosAdicionais.list, function( n, i ) {
                    return n.id == vm._model.descontosAdicionais.model.val;
                })[0].text;

                if (vm._model.desconto.model.descontoAdd == 1) {
                    vm._model.desconto.model.val = 1;
                    vm.disableQtdParcelas = true;
                    vm._model.qtdParcelas.model.val = 1;
                    alteraValorIntegral();
                    vm._model.valorParcela.model.val = vm._model.valorIntegral.model.val;
                } else {
                    vm._model.desconto.model.val += vm._model.desconto.model.descontoAdd;
                    vm.disableQtdParcelas = false;
                    vm._model.qtdParcelas.model.val = '';
                    vm._model.valorParcela.model.val = '';
                    alteraValorIntegral();
                }

                if (!_edit) {
                    $('#modalDescAdc').modal('toggle');
                }
            }

            function cancelarDescontoAdicional() {
                if (vm._model.desconto.model.val == 1) {
                    vm._model.desconto.model.val = vm._model.desconto.model.aux + vm._model.desconto.model.descPag;
                } else {
                    if (vm._model.desconto.model.descontoAdd && vm._model.desconto.model.descontoAdd != 0) {
                        vm._model.desconto.model.val -= vm._model.desconto.model.descontoAdd;
                        vm._model.desconto.model.val += vm._model.desconto.model.aux;
                    }
                }

                limpaDescAddQtdParcelas();
                alteraValorIntegral();
                limpaCamposDescantoAdicional();
            }

            function openModalCheque() {
                var modalInstance = $modal.open({
                    templateUrl: '../html/comercial/modal-cheques.html',
                    controller: 'ModalCheques',
                    controllerAs: 'cheq',
                    size: 'lg'
                });
            }

            function selectChequeStep1(item, model) {
                vm.btnAddChequeStep1 = item.tpCheque;
            }

            function selectChequeStep2(item, model) {
                vm.btnAddChequeStep2 = item.tpCheque;

                vm._model.desconto.model.descPag = 1 - ((vm._model.formaPagamentoPag.valores[item.name]) / vm._model.formaPagamentoPag.valores.integral);

                /* Por agora não terá cálculo com o desconto adicional */
                vm._model.desconto.model.val = vm._model.desconto.model.aux + vm._model.desconto.model.descPag;

                vm.disableDescAdd = false;

                limpaDescAddQtdParcelas();
                alteraValorIntegral();
                limpaCamposDescantoAdicional();
            }

            function alteraValorIntegral() {
                vm._model.valorIntegral.model.val = vm._model.formaPagamentoPag.valores.integral -
                    (vm._model.formaPagamentoPag.valores.integral * (vm._model.desconto.model.val));
            }

            function limpaDescAddQtdParcelas() {
                vm._model.desconto.model.descontoAdd = 0;
                vm.disableQtdParcelas = false;
                vm._model.qtdParcelas.model.val = '';
                vm._model.valorParcela.model.val = '';
            }

            function selectPhoneType(item, model) {
                vm._model.telefone.mask = tipoTelefone.getMaskPhone(model);
            }

            function sendInscricaoCompleta() {
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
                        if (erro.status == '400') {
                            console.log(erro)
                        }
                    });
            }

            function sendInscricaoParcial() {
                vm._model.listaCheques = vm.lista_cheques.lista;

                var sendInscricaoParcialPromise = $resource('/api/comercial/dados-inscricao-parcial').save({}, {"model": vm._model, "STR": vm.STR}).$promise;

                sendInscricaoParcialPromise
                    .then(function (data) {
                        vm._model = data;
                        vm.disableLimpar = false;
                        $.extend(vm._model.vagas, funcVagas());
                        disableBtn();
                        if (data.success) {
                            vm.limpaForm();
                            vm.sendSuccess = data.success;
                            vm.editing = false;
                            vm.showAlert = false;
                            $timeout(vm.disableSendSuccess, 6000);
                        }
                    })
                    .catch(function (erro) {
                        if (erro.status == '400') {
                            console.log(erro)
                        }
                    });
            }

            //TODO função selectSexo() para desabilitar reservistas caso seja feminino

            function topCollapse(){
                $('html, body').animate({scrollTop: 0},'slow');
            }

            function disableBtn(){
                $timeout(function () {
                    vm.disableAtualiza = $('#step0').attr('class').indexOf('active') == -1;
                    vm.disableAnterior = $('#step0').attr('class').indexOf('active') != -1;
                    vm.disableProximo = $('#step4').attr('class').indexOf('active') != -1;
                }, 300);
            }

            function disableAlert(){
                vm.showAlert = false;
            }

            function editarInscr(item){
                if (!vm.editing) {
                    var buscaCpfPromise = $resource('/api/comercial/verifica-cpf/:cpf').get({"cpf": item.cpf.model.val}).$promise;

                    buscaCpfPromise
                        .then(function (data) {
                            $.extend(true, vm._model, item);

                            vm.disableLimpar = true;
                            vm.validaCpf = !data.dados.msg;
                            vm.editing = vm.validaCpf;
                            vm._model.cpf.model.err = data.dados.msg;
                            vm._model.unidade.list = data.dadosCurso.unidade.list;

                            vm._model.desconto.model.aux = data.desconto;

                            vm.unidadeChange($.grep(vm._model.unidade.list, function (e) {
                                return e.id == item.unidade.model.val;
                            })[0], item.unidade.model.val);

                            vm.tipoCursoChange($.grep(vm._model.tipoCurso.list, function (e) {
                                return e.id == item.tipoCurso.model.val;
                            })[0], item.tipoCurso.model.val);

                            vm.areaChange(vm._model.curso.list = $.grep(vm._model.area.list, function (e) {
                                return e.id == item.area.model.val;
                            })[0], item.area.model.val);

                            vm.cursoChange($.grep(vm._model.curso.list, function (e) {
                                return e.id == item.curso.model.val;
                            })[0], item.curso.model.val);

                            vm.getDadosCep(item.cep.model.val);
                            vm.selectPhoneType({}, item.tipoTelefone.model.val);

                            vm.selectChequeStep1($.grep(vm._model.formaPagamentoInscr.list, function (e) {
                                return e.id == item.formaPagamentoInscr.model.val;
                            })[0], item.formaPagamentoInscr.model.val);

                            vm.selectChequeStep2($.grep(vm._model.formaPagamentoPag.list, function (e) {
                                return e.id == item.formaPagamentoPag.model.val;
                            })[0], item.formaPagamentoPag.model.val);

                            lista_cheques.addAll(item.listaCheques);
                            vm.lista_cheques = lista_cheques;

                            if(item.descontosAdicionais.model.val && item.descricaoDesconto.model.val != '') {
                                vm._model.descontosAdicionais.model = item.descontosAdicionais.model;
                                vm._model.descricaoDesconto.model = item.descricaoDesconto.model;
                                vm.addDescontoAdicional(true); // Edição == True!!
                            }

                            vm.qtdParcelasAplic($.grep(vm._model.qtdParcelas.list, function (e) {
                                return e.id == item.qtdParcelas.model.val;
                            })[0], item.qtdParcelas.model.val);

                            $.extend(true, vm._model, item);
                        })
                        .catch(function (erro) {
                            if (erro.status == '400') {
                                console.log(erro)
                            }
                        });
                }
            }

            function confirmEdit(itemBkp){
                vm.limpaForm();
                vm.editarInscr(itemBkp);
            }

            function funcVagas() {
                return {
                    isEnding: function () {
                        return this.preenchidas / (this.totais == 0 ? 1 : this.totais) >= 0.9;
                    },
                    getDisponiveis: function () {
                        return (parseInt(this.totais) - parseInt(this.preenchidas));
                    }
                }
            }

            function limpaCampoPag() {
                vm._model.desconto.model.val = "";
                vm._model.qtdParcelas.model.val = "";
                vm._model.formaPagamentoInscr.model.val = "";
                vm._model.formaPagamentoPag.model.val = "";
                vm._model.melhorData.model.val = "";
                vm._model.valorInscricao.model.val = '';
                vm._model.valorIntegral.model.val = '';
                vm._model.valorParcela.model.val = '';
            }

            function limpaForm(){
                // escondendo select's de curso
                vm.selectCursoTipoCurso = false;
                vm.selectCursoArea = false;
                vm.selectCursoCurso = false;
                vm.selectCursoVagas = false;

                vm.limpaFormStep1();
                vm.limpaFormStep2();
                vm.limpaFormStep3();
                vm.limpaFormStep4();

                // limpando cheques adicionados
                lista_cheques.clean();

                vm.editing = false;
                vm.disableLimpar = false;
                vm.validaCpf = false;
                vm.showAlert = false;

                vm.topCollapse();
            }

            function limpaFormStep1() {
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
                vm._model.tipoCurso.model.val = '';
                vm._model.tipoCurso.model.err = '';
                vm._model.area.model.val = '';
                vm._model.area.model.err = '';
                vm._model.curso.model.val = '';
                vm._model.curso.model.err = '';
                vm._model.valorInscricao.model.val = '';
                vm._model.valorInscricao.model.err = '';
                vm._model.formaPagamentoInscr.model.val = '';
                vm._model.formaPagamentoInscr.model.err = '';
            }

            function limpaFormStep2() {
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
            }

            function limpaFormStep3() {
                vm._model.checkFoto34.model.val = false;
                vm._model.checkCertidao.model.val = false;
                vm._model.checkReservista.model.val = false;
                vm._model.checkComprovanteResidencia.model.val = false;
                vm._model.checkCpf.model.val = false;
                vm._model.checkDiplomaGrad.model.val = false;
                vm._model.checkDiploma2grau.model.val = false;
                vm._model.checkDiplomaSeminario.model.val = false;
                vm._model.checkHistoricoGraduacao.model.val = false;
                vm._model.checkHistoricoSeminario.model.val = false;
                vm._model.checkTitulo.model.val = false;
                vm._model.checkRg.model.val = false;
                vm._model.checkFichaInscr.model.val = false;
                vm._model.checkTaxaInscr.model.val = false;
                // Desabilitando checkbox's da documentação
                vm.isMestrado = false;
                vm.isTeologia = false;
                vm.isPosGrad = false;
                vm.isContinuada = false;
                vm.isComplementacao = false;
            }

            function limpaFormStep4() {
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
                vm._model.complemento.model.val = '';
                vm._model.complemento.model.err = '';
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
            }

            function atualizaPartial(time) {
                $timeout(function () {
                    $route.reload();
                }, time); // delay to reload page.
            }

            function cancelEdit(){
                vm.limpaForm();
                vm.disableLimpar = false;
                disableBtn();
                vm.editing = false;
                vm.showAlert = false;

            }

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
                editInscr: vm.editarInscr,

                verificaEdit: verificaEdit
            };

            function disableSendSuccess(){
                vm.sendSuccess = false;
            }

            function verificaEdit(data){
                data = new Date(data); var atual = new Date();
                return (atual.getDate() == data.getDate() && atual.getMonth() == data.getMonth())
            }

            vm.testeInput = {
                type: 'checkbox',
                label: 'Diploma de graduação ou certificado de conclusão de curso (2 cópias autenticadas)',
                model: {'val': false, 'err': 'Campo obrigatório'}
            };

            vm.testeInput2 = {
                type: 'checkbox',
                label: 'Diploma de graduação ou certificado de conclusão de curso (2 cópias autenticadas)',
                model: {'val': true}
            };

            function limpaCamposDescantoAdicional() {
                vm._model.descricaoDesconto.model.val = '';
                vm._model.descontosAdicionais.model.val = '';
            }

            vm.formPreCadastro = {

            };

        }])
})();