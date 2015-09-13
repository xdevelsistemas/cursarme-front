(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('Main', ['$scope', '$resource', 'breadCrumb', 'defineUnidade', 'modelStrings', 'modelMenu', '$timeout', '$route', '$location', 'ngProgressFactory',
            function($scope, $resource, breadCrumb, defineUnidade, modelStrings, modelMenu, $timeout, $route, $location, ngProgressFactory) {

                /* PROGRESS BAR */
                $scope.progressbar = ngProgressFactory.createInstance();
                $scope.progressbar.setColor('#45A0CF');
                $scope.progressbar.start();

                /* jshint validthis: true */
                var vm = this,
                    dadosUnidadesPromise = $resource('/api/financeiro/dados-unidades').get().$promise,
                    infoUserPromise = $resource('/api/comercial/info-usuario').get().$promise;

                // VARIÁVEIS COMUNS
                vm.breadCrumb = breadCrumb;
                //models
                vm.STR = modelStrings;
                vm.menu = modelMenu;
                //usuais
                vm.appName = 'xDuka';
                vm.area = 'Financeiro';
                vm.lang = 'pt-br';
                vm.onChange = {};
                vm.section = '';

                //VARIÁVEIS TIPO FUNÇÃO
                vm.menuAction = menuAction;
                vm.sendUnidade = sendUnidade;

                infoUserPromise.
                    then(
                    function (data) {
                        vm.user = data.usuario;
                        $scope.progressbar.complete();
                    })
                    .catch(
                    function (error) {
                        // TOdo tratar error
                    }
                );

                dadosUnidadesPromise.
                    then(
                    function (data) {
                        vm._unidade = data.unidade;
                        defineUnidade.setIdUnidade(vm._unidade.model.val);
                    })
                    .catch(
                    function (error) {
                        // TOdo tratar error
                    }
                );

                function menuAction(){
                    vm.openSearch = false;
                    if (!$('.sidebar-menu').attr('style')){
                        $('.sidebar-mobile-menu.visible-xs>.with-animation').click()
                    }
                }

                function sendUnidade(item, model) {
                    if( vm.onChange != item ) {
                        vm.onChange = item;
                        defineUnidade.setIdUnidade(model);

                        $timeout(function () {
                            $route.reload();
                        }, 0); // 0 ms de delay para recarregar a página.
                    }
                }
            }]);
})();