(function(){
    'use strict';
    angular.module('app.controllers')
        .controller('configuracoes', ['$scope', '$resource', 'breadCrumb', '$timeout', function($scope, $resource, breadCrumb, $timeout){
            /*jshint validthis: true*/
            var vm = this
                ,templateConfig = $resource('/api/secretaria/templateConfig').get().$promise;

            breadCrumb.title = 'Configurações';

            /* OBJETOS */
            vm._model = {};

            /* REQUISIÇÕES */
            templateConfig
                .then(function(data){
                    $.extend(true,vm._model,data);
                })
                .catch(function(err){
                    console.log(err)
                });



        }]
    )
})();