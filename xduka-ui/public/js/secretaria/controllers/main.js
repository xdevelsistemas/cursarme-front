(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('Main', ['$scope', '$resource', 'breadCrumb', 'modelStrings', 'modelMenu', '$location', 'alunoService', 'ngProgressFactory',
        function($scope, $resource, breadCrumb, modelStrings, modelMenu, $location, alunoService, ngProgressFactory) {

            /* PROGRESS BAR */
            $scope.progressbar = ngProgressFactory.createInstance();
            $scope.progressbar.setColor('#45A0CF');
            $scope.progressbar.start();

            /* jshint validthis: true */
            var vm = this
                , infoUserPromise = $resource('/api/comercial/info-usuario').get().$promise;

            vm.breadCrumb = breadCrumb;

            vm.STR = modelStrings;
            vm.menu = modelMenu;

            //vm._alunos = [];
            vm._searchVal = '';
            vm.appName = 'xDuka';
            vm.area = 'Secretaria';
            vm.lang = 'pt-br';
            vm.section = '';
            vm.openSearch = false;
            vm.searchAluno = {name: 'secretaria'};

            infoUserPromise.
                then(
                function (data) {
                    vm.user = data.usuario;
                    $scope.progressbar.complete();
                })
                .catch(
                function (erro) {
                    console.log("Erro:\n" + erro.data + "\n");
                }
            );
            vm.menuAction = function(){
                vm.openSearch = false;
                if (!$('.sidebar-menu').attr('style')){
                    $('.sidebar-mobile-menu.visible-xs>.with-animation').click()
                }
            };


        }]);
})();