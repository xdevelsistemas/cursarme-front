(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('confMatricula', ['$scope', '$resource', 'breadCrumb', 'lista_cheques', function($scope, $resource, breadCrumb, lista_cheques){

            var vm = this
                , comercialPromise = $resource('/api/comercial/dados-comercial').get().$promise
                , viewInscrPromise = $resource('/api/comercial/view-inscr').get().$promise;

            breadCrumb.title = 'Confirmação de Matrícula';

            vm._model = {};


            // ==== REQUISIÇÕES ==== //

            comercialPromise
                .then(function(data){
                    vm._model = data;
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

            vm.teste = 'Controller OK!'
            

        }])

})();
