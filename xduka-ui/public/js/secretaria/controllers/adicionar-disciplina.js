(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('adicionarDisciplina', ['$scope', '$resource', 'breadCrumb', '$timeout', function($scope, $resource, breadCrumb, $timeout){

            var vm = this,
                templateAddDisciplina = $resource('/api/secretaria/template-add-disciplina').get().$promise;

            breadCrumb.title = 'Adicionar Disciplina';

            vm._model = {};
            vm.cadastrarNovo = cadastrarNovo;
            vm.cancelar = cancelar;
            vm.editing = false;
            vm.modalEditarDisciplinas = modalEditarDisciplinas;
            vm.modalSalvar = modalSalvar;
            vm.tableDisciplinas = {
                class: 'table table-hover table-striped table-bordered',
                head: ["Nome", "Carga Horária", "Valor", "Tipo", ""],
                list: [], //todo get das disciplinas cadastradas no banco
                btns: {
                    btn: true,
                    list: [{
                        text: "",
                        click: editarDisciplina,
                        class: "btn btn-primary btn-sm",
                        entypo: "entypo-pencil"
                    },
                    {
                        text: "",
                        click: removeDisciplina,
                        class: "btn btn-danger btn-sm",
                        entypo: "entypo-cancel"
                    }]
                }
            };
            vm.salvar = salvar;

            templateAddDisciplina
                .then(function(data) {
                    vm._model = data.template;
                })
                .catch(function(error) {
                    // TOdo tratar error
                });

            function cadastrarNovo(item,model) {
                if (model=='0'){
                    vm._model.addNome.label = item.label;
                    vm._model.addNome.ref = item.ref;
                    $('#modalCadastrarNovo').modal('show');
                }else{
                    vm.editing = true;
                }
            }

            function cancelar() {
                vm._model.nome.model.val = '';
                vm._model.cargaHoraria.model.val = '';
                vm._model.valor.model.val = '';
                vm._model.tipo.model.val = '';
                vm.editing = false;
            }

            function editarDisciplina(args,event) {
                /*todo conteudo da tabela selecionado ir para o model.val equivalente
                (ex: vm._model.editarNome.model.val = vm.tableDisciplinas.list[0].anome*/
            }

            function modalEditarDisciplinas() {
                var i;
                for(i = 0; i < vm.tableDisciplinas.list.length ; i++){ //PREENCHENDO AS LINHAS DA TABELA COM BOTÕES DE EDITAR E REMOVER
                    vm.tableDisciplinas.list[i].ebtn = vm.tableDisciplinas.btns;
                }
                $('#modalEditDisc').modal({
                    backdrop: 'static',
                    keyboard: false
                })
            }

            function modalSalvar() {
                if(vm._model.addNome.model.val.length){
                    vm._model.addNome.model.err = '';
                    vm._model[vm._model.addNome.ref].list.push({
                        id: new Date().getTime()+vm._model.addNome.model.val,
                        text: vm._model.addNome.model.val
                    });
                    vm._model.addNome.model.val = '';
                    $('#modalCadastrarNovo').modal('toggle');
                }else{
                    vm._model.addNome.model.err = 'Campo obrigatório!';
                }
            }

            function removeDisciplina(args,event){
                //todo remover da tabela
            }

            function salvar() {
                //todo post salvamento
            }

        }])
})();