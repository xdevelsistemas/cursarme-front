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
            vm.area = 'Comercial';
            vm.lang = 'pt-br';
            vm.section = '';

            vm.sendData = sendData;

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

            ////////////////

            function sendData() {
                console.log('>>>>>', 'Enviou nada!');
            }

            vm.menuAction = function(){
                if (!$('.sidebar-menu').attr('style')){
                    $('.sidebar-mobile-menu.visible-xs>.with-animation').click()
                }
            };
        }]);
})();