(function(){
    'use strict';
    angular.module('app.controllers')
        .controller('configuracoes', ['$scope', '$resource', 'breadCrumb', '$timeout','$location', function($scope, $resource, breadCrumb, $timeout,$location){
            /*jshint validthis: true*/
            var vm = this
                ,templateConfig = $resource('/api/secretaria/templateConfig').get().$promise;

            breadCrumb.title = 'Configurações';

            /* OBJETOS */
            vm._model = {};

            /* STRINGS MODAL 'NEW' */
            vm.modalNew = {
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
                        newtipoArea: 'Area',
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
                vm.modalNew.model.val = '';
                vm.modalNew.label = '';
                vm.modalNew.atual = '';
            };
            vm.saveNew = function(){
                var atual = vm.modalNew.atual.substr(3),
                    objNew = {
                        'id': atual.toLowerCase()+Math.round((Math.random()*100)/2).toString(),
                        'text': vm.modalNew.model.val
                    };

                vm._model[atual].list.unshift(objNew);

                /* ROTA DE SALVAR NO NODE */
                //ADICIONAR ROTA DE POST

                vm.cancelNew();
                $('#modalNew').modal('toggle');
            };
            vm.voltar = function(){
                $location.path('/');
            };


        }]
    )
})();