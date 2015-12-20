(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('FormContrato', ['$scope', '$resource', 'breadCrumb', 'modelStrings', 'modelMenu', 'ngProgressFactory',
            function($scope, $resource, breadCrumb, modelStrings, modelMenu, ngProgressFactory) {

                /* PROGRESS BAR */
                $scope.progressbar = ngProgressFactory.createInstance();
                $scope.progressbar.setColor('#45A0CF');
                $scope.progressbar.start();

                /* jshint validthis: true */
                var vm = this
                    , contratoPromise = $resource('/api/comercial/view-contrato').get().$promise;

                vm.breadCrumb = breadCrumb;

                vm.STR = modelStrings;
                vm.menu = modelMenu;

                vm.appName = 'xDuka';
                vm.area = 'Comercial';
                vm.lang = 'pt-br';
                vm.section = '';
                vm.clausulas = {};
                vm.cl_text = [];

                contratoPromise.
                    then(
                    function (data) {
                        vm.clausulas = data.clausulas;
                        $scope.progressbar.complete();
                    })
                    .catch(
                    function (erro) {
                        console.log("Erro:\n" + erro.data + "\n");
                    }
                );


                vm.menuAction = function(){
                    if (!$('.sidebar-menu').attr('style')){
                        $('.sidebar-mobile-menu.visible-xs>.with-animation').click()
                    }
                };

                vm.salvarContrato = function(){
                    $resource('/api/financeiro/contrato').save({clausula: vm.clausulas}).$promise;

                    console.log(vm.clausulas);

                }

                vm.addClausula = function(){
                    vm.clausulas.push({
                        "label": "Cláusula "+vm.clausulas.length,
                        "title": "",
                        "text": ""
                    });

                    console.log(vm.clausulas)
                }

            }]);
})();