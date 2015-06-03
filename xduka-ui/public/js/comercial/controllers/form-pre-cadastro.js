(function() {
    "use strict";

    angular.module('app.controllers').controller('FormPreCadastro', [
        '$scope', 'breadCrumb', '$timeout', '$modal', '$resource', 'lista_cheques', 'dataCheque', 'allCheques',

    function ($scope, breadCrumb, $timeout, $modal, $resource, lista_cheques, dataCheque, allCheques) {

        /* jshint validthis: true */
        var vm = this
            , comercialPromise = $resource('/api/comercial/dados-comercial').get().$promise
            , viewInscrPromise = $resource('/api/comercial/view-inscr').get().$promise;

        breadCrumb.title = 'Pré Cadastro';

        // ==== MODELOS ==== //
        $scope.cor = 'blue';
        $scope.casa = 'ape';

        vm._model = {};

        // Botões de pre-cadastro
        vm.btnAddChequeStep1 = false;
        vm.btnAddChequeStep2 = false;
        vm.disableAtualiza = false;
        vm.disableAnterior = true;
        vm.disableBtn = disableBtn;
        vm.disableLimpar = false;
        vm.disableProximo = false;

        vm.editarInscr = editarInscr;

        //xd-select de curso
        vm.selectCursoArea = false;
        vm.selectCursoCurso = false;
        vm.selectCursoVagas = false;

        // valida todos os campos
        vm.validaCpf = true;

        // ==== REQUISIÇÕES ==== //

        comercialPromise
            .then(function(data){
                vm._model = data;
                $.extend(vm._model.vagas, funcVagas());
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

        vm.unidadeChange = function (item, model) {
            vm.selectCursoArea = true;
            vm.selectCursoCurso = false;
            vm.selectCursoVagas = false;
            vm._model.valorInscricao.model.val = '';

            vm._model.area.list = [];
            vm._model.area.model = {'val': '', 'err': ''};
            $.extend(vm._model.area.list, item.areas);

            // limpa a sujeira que fica no model.val quando troca de curso
            limpaCampoPag();
        };

        vm.areaChange = function (item, model) {
            vm.selectCursoCurso = true;
            vm.selectCursoVagas = false;
            vm._model.valorInscricao.model.val = '';

            vm._model.curso.list = [];
            vm._model.curso.model = {'val': '', 'err': ''};
            $.extend(vm._model.curso.list, item.curso);

            // limpa a sujeira que fica no model.val quando troca de curso
            limpaCampoPag();
        };

        vm.cursoChange = function (item, model) {
            vm.selectCursoVagas = true;

            // alimentando valores referentes ao curso selecionado
            $.extend(vm._model.vagas, item.turma[0].vagas);
            $.extend(vm._model.desconto.list, item.desconto);
            $.extend(vm._model.qtdParcelas.list, item.qtdParcelas);
            $.extend(vm._model.melhorData.list, item.melhorData);

            // limpa a sujeira que fica no model.val quando troca de curso
            limpaCampoPag();

            // definindo valor de inscrição
            vm._model.valorInscricao.model.val = vm._model.vagas.valorInscricao;

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
            vm._model.telefone.mask = model == 'cel' ? '?(99)9999-99999' : '?(99)9999-9999';
        };

        vm.sendInscricao = function() {
            $.extend(vm._model.listaCheques, lista_cheques.lista);
            console.log(vm._model.listaCheques + 'teste');

            var sendInscricaoPromise = $resource('/api/comercial/dados-inscricao').save({}, vm._model).$promise;

            sendInscricaoPromise
                .then(function (data) {
                    vm._model = data;
                    //console.log(vm._model);
                    $.extend(vm._model.vagas, funcVagas());
                })
                .catch(function (erro) {
                    console.log("\n" + erro.data + "\n")
                });
        };

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

        function editarInscr(item){
            $.extend(true, vm._model, item);

            vm._model.area.list = $.grep(vm._model.unidade.list, function(e){ return e.id == item.unidade.model.val; })[0].areas;
            vm._model.curso.list = $.grep(vm._model.area.list, function(e){ return e.id == item.area.model.val; })[0].curso;

            vm.selectCursoArea = true;
            vm.selectCursoCurso = true;
            vm.selectCursoVagas = true;

            vm.btnAddChequeStep1 = item.formaPagamentoInscr.model.val == 2;
            vm.btnAddChequeStep2 = item.formaPagamentoPag.model.val == 2;
            lista_cheques.addAll(item.listaCheques);
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
        }

        /*  DESABILITADO PARA TESTE */
        /*$(function(){
         $('a').bind('contextmenu', function(e){
         alert('Função desabilitada para este elemento!');
         return false;
         });
         });*/
        vm.limpaForm = function(){

            /* ALUNO */
            vm._model.cpf.model.val = '';
            vm._model.rg.model.val = '';
            vm._model.nome.model.val = '';
            vm._model.cidade.model.val = '';
            vm._model.cep.model.val = '';
            vm._model.telefone.model.val = '';
            vm._model.tipoTelefone.model.val = '';
            vm._model.email.model.val = '';
            vm._model.dataExp.model.val = '';
            vm._model.orgaoEmissor.model.val = '';
            vm._model.tituloEleitor.model.val = '';
            vm._model.zona.model.val = '';
            vm._model.secao.model.val = '';
            vm._model.ufTitulo.model.val = '';
            vm._model.certidaoNc.model.val = '';
            vm._model.folha.model.val = '';
            vm._model.livro.model.val = '';
            vm._model.cartorio.model.val = '';
            vm._model.certificadoRes.model.val = '';
            vm._model.registro.model.val = '';
            vm._model.ufReservista.model.val = '';
            vm._model.categoria.model.val = '';
            vm._model.sexo.model.val = '';
            vm._model.dataNasc.model.val = '';
            vm._model.raca.model.val = '';
            vm._model.estadoCivil.model.val = '';
            vm._model.pai.model.val = '';
            vm._model.mae.model.val = '';
            vm._model.avRua.model.val = '';
            vm._model.endNum.model.val = '';
            vm._model.apt.model.val = '';
            vm._model.bairro.model.val = '';
            vm._model.endUf.model.val = '';
            vm._model.nacionalidade.model.val = '';
            vm._model.naturalidade.model.val = '';
            vm._model.natUf.model.val = '';

            /* CURSO */
            vm._model.unidade.model.val = '';
            vm._model.area.model.val = '';
            vm._model.curso.model.val = '';

            /* DOCUMENTACAO */
            vm._model.escolaEm.model.val = '';
            vm._model.anoEm.model.val = '';
            vm._model.cursoGrad.model.val = '';
            vm._model.anoGrad.model.val = '';
            vm._model.instituicao.model.val = '';

            /* INSCRIÇÃO */
            vm._model.valorInscricao.model.val = '';
            vm._model.formaPagamentoInscr.model.val = '';

            /* PAGAMENTO  */
            vm._model.valorIntegral.model.val = '';
            vm._model.desconto.model.val = '';
            vm._model.formaPagamentoPag.model.val = '';
            vm._model.qtdParcelas.model.val = '';
            vm._model.valorParcela.model.val = '';
            vm._model.melhorData.model.val = '';
            vm._model.observacoes.model.val = '';
            vm._model.listaCheques = [];

            // limpando cheques adicionados
            lista_cheques.clean();
        };

        vm.cancelEdit = function(){
            vm.limpaForm();
            vm.disableLimpar = false;
            disableBtn()

        };

        vm.condTable = {
            boolean: function(elem){
                return typeof(elem) == 'boolean'
            },
            checkbox: function(elem){
                return elem == 'checkbox'
            },
            editFunc: function(){
                vm.disableLimpar = true
            }
        }
    }])
})();
