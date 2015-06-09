(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('Main', ['$scope', '$resource', 'breadCrumb', 'modelStrings', 'modelMenu',
            function($scope, $resource, breadCrumb, modelStrings, modelMenu) {
            /* jshint validthis: true */
            var vm = this
                , infoUserPromise = $resource('/api/comercial/info-usuario').get().$promise;

            vm.breadCrumb = breadCrumb;

            vm.STR = modelStrings;
            vm.menu = modelMenu;

            vm.appName = 'xDuka';
            vm.area = 'Secretaria';
            vm.lang = 'pt-br';
            vm.section = '';

            infoUserPromise.
                then(
                function (data) {
                    vm.user = data.usuario;
                })
                .catch(
                function (erro) {
                    console.log("Erro:\n" + erro.data + "\n");
                }
            );
        }]);
})();