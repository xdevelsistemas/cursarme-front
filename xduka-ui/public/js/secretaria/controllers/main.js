(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('Main', ['$scope', '$resource', '$timeout', '$route', 'breadCrumb', 'modelStrings', 'defineUnidade', 'modelMenu', '$location', 'alunoService', 'ngProgressFactory', 'dataUser',
        function($scope, $resource, $timeout, $route, breadCrumb, modelStrings, defineUnidade, modelMenu, $location, alunoService, ngProgressFactory, dataUser) {

            /* PROGRESS BAR */
            $scope.progressbar = ngProgressFactory.createInstance();
            $scope.progressbar.setColor('#45A0CF');
            $scope.progressbar.start();

            /* jshint validthis: true */
            var vm = this,
                dadosUnidadesPromise = $resource('/api/financeiro/dados-unidades').get().$promise,
                infoUserPromise = $resource('/api/comercial/info-usuario').get().$promise;

            // VARIÁVEIS COMUNS
            //
            //vm._alunos = [];
            vm._searchVal = '';
            vm.appName = 'xDuka';
            vm.area = 'Secretaria';
            vm.lang = 'pt-br';
            vm.menu = modelMenu;
            vm.section = '';
            vm.searchAluno = {name: 'secretaria'};
            vm.STR = modelStrings;
            vm.openSearch = false;
            vm.onChange = {};

            // VARIÁVEIS TIPO FUNÇÃO
            vm.menuAction = menuAction;
            vm.sendUnidade = sendUnidade;

            // Requisições
            infoUserPromise.
                then(
                function (data) {
                    vm.user = data.usuario;
                    dataUser.setNameUser(vm.user.name);
                    $scope.progressbar.complete();
                })
                .catch(
                function (erro) {
                    console.log("Erro:\n" + erro.data + "\n");
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