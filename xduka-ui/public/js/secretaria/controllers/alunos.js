(function(){
    'use strict';


    angular.module('app.controllers')
        .controller('alunos', ['$scope', '$resource', '$route', 'breadCrumb', 'tipoTelefone', '$timeout', 'modelStrings',
            function($scope, $resource, $route, breadCrumb, tipoTelefone, $timeout, modelStrings){

                var vm = this
                    , alunosPromise = $resource('/api/secretaria/alunos').get().$promise;

                breadCrumb.title = 'Alunos';

                // ==== MODELOS ==== //

                vm._model = {};

                alunosPromise
                    .then(function (data) {
                        vm._model.alunos = data.list;
                        for (var i=0; i < vm._model.alunos.length; i++) {
                            vm._model.alunos[i].cont = i
                        }
                    })
                    .catch(function (erro) {
                        console.log(erro);
                    });
                vm.colorIf = function(item){
                    return item.cont%2 == 0
                }


            }])
})();
