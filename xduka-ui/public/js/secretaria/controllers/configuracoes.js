(function(){
    'use strict';
    angular.module('app.controllers')
        .controller('configuracoes', ['$scope', '$resource', 'breadCrumb', '$timeout','$location',
            function($scope, $resource, breadCrumb, $timeout, $location){
            /*jshint validthis: true*/
            var vm = this
                ,templateConfig = $resource('/api/secretaria/templateConfig').get().$promise;

            breadCrumb.title = 'Configurações';

            /* OBJETOS */
            vm._model = {};
            vm.modalNew = { //CRIADO COM OBJETIVO DE INSERIR NOVOS CAMPOS NOS SELECT'S
                model: {val: ''},
                label: '',
                name: 'newVal',
                type: 'text',
                autofocus: 'true',
                atual: ''
            };

            /* REQUISIÇÕES */
            templateConfig
                .then(function(data){
                    $.extend(true,vm._model,data);
                })
                .catch(function(err){
                    console.log(err)
                });

            vm.newVal = function(item, model) {
                var lst = ['newtipoCurso','newtipoArea','newturno','newtipoPeriodo','newmodalidadeTurma','newhorarioEntrada','newhorarioSaida','newtipoSituacao','newtipoTelefone'],
                    indice = lst.indexOf(model),
                    dic = {
                        newtipoCurso: 'Tipo de Curso',
                        newtipoArea: 'Tipo de Area',
                        newturno: 'Turno',
                        newtipoPeriodo: 'Tipo de Período',
                        newmodalidadeTurma: 'Modalidade Turma',
                        newhorarioEntrada: 'Horário de Entrada',
                        newhorarioSaida: 'Horário de Saída',
                        newtipoSituacao: 'Tipo de Situação',
                        newtipoTelefone: 'Tipo de Telefone'
                    };
                if(indice != -1){
                    vm.modalNew.label = dic[lst[indice]];
                    vm.modalNew.atual = lst[indice];
                    $('#modalNew').modal('show')
                }
            };

            vm.cancelNew = function(){
                vm.modalNew.model.err = '';
                vm.modalNew.model.val = '';
                vm.modalNew.label = '';
                vm.modalNew.atual = '';
            };

            //Função de inserir no xd-select o novo campo cadastrado
            vm.saveNew = function(){
                var atual = vm.modalNew.atual.substr(3),
                    objNew = {
                        'id': atual.toLowerCase()+Math.round((Math.random()*100)/2).toString(),
                        'text': vm.modalNew.model.val
                    };

                // Validação caso vazio
                if (vm.modalNew.model.val == ''){
                    vm.modalNew.model.err = 'O campo está vazio!'
                }else
                // Validação caso haja um texto igual no xd-select atual
                if (!verificaText(vm.modalNew.model.val, vm._model[atual].list)){
                    vm._model[atual].list.unshift(objNew);

                    /*=============================*/
                    /*   ROTA DE SALVAR NO NODE    */
                    /* ADICIONAR ROTA DE POST AQUI */
                    /*=============================*/

                    vm.cancelNew();
                    $('#modalNew').modal('toggle');
                }else{
                    vm.modalNew.model.err = 'Campo já existente! Não adicionado.'
                }
            };

            //Botão voltar apenas redirecionando
            vm.voltar = function(){
                $location.path('/');
            };

            // Função que verifica os objetos do xd-select e invalida a inserção caso haja um 'text' igual
            function verificaText(text,lstObj){
                for (var i=0; i < lstObj.length; i++){
                    if (lstObj[i].text.toLowerCase().replace(/\s/ig,'') == text.toLowerCase().replace(/\s/ig,'')){
                        return true
                    }
                }
                return false
            }

            vm.saveDadosConfiguracoes = function() {
                var saveDadosPromise = $resource('/api/secretaria/save-configuracoes').save({}, vm._model).$promise;

                saveDadosPromise
                    .then(function(data) {
                        vm._model = data;
                    })
                    .catch(function(error) {
                        console.log(error.data);
                    })
            }
        }]
    )
})();