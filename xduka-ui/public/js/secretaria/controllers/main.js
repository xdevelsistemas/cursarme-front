(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('Main', ['$scope', '$resource', 'breadCrumb', 'modelStrings', 'modelMenu', '$location', 'alunoService', 'ngProgressFactory',
        function($scope, $resource, breadCrumb, modelStrings, modelMenu, $location, alunoService, ngProgressFactory) {

            /* PROGRESS BAR */
            $scope.progressbar = ngProgressFactory.createInstance();
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
            vm.searchFocus = function(){
                vm.openSearch = true;
            };
            vm.searchFocusOff = function(){
                vm.openSearch = false;
            };

            /* SEARCH NODE */
            vm.seachPromise = function(matNome) {
                if (matNome.length >= 4) {
                    $scope.progressbar.start();
                    search(matNome)
                }else{
                    vm.auxAlunos = vm._alunos;
                    vm._alunos = []
                }
            };

            /* VER ALUNO PESQUISADO */
            vm.moreAluno = function(aluno){
                vm.openSearch = false;
                alunoService.aluno = aluno;
                alunoService.aluno.alert = true;
                $location.path('/secretaria/aluno/'+aluno.matricula.model.val)
            };
            function search(matNome){
                var search = $resource('/api/secretaria/aluno/:matNome').get({matNome: matNome}).$promise;
                search
                    .then(
                    function (data) {
                        if (compareArray(data.result,vm._alunos)){
                            vm._alunos.err = data.err;
                            $scope.progressbar.complete();
                        }else{
                            vm._alunos = data.result;
                            vm._alunos.err = data.err;
                            $scope.progressbar.complete();
                        }
                    }
                )
                    .catch(
                    function (err) {
                        console.log(err)
                    }
                );
            }


            function compareArray(array1, array2){
                var aux1 = array1
                    ,aux2 = array2;
                if(array1.length!=array2.length){
                    return false
                }
                for (var i = 0; i > array1.length;i++){
                    for (var k in array1[i]){
                        if (k != '$$hashKey'){
                            if (array1[i][k] != array2[i][k]){
                                return false
                            }
                        }
                    }
                }
                return true
            }
            vm.searchkp = function(){
                vm.searchFocusOff();
                $('#search').blur();
            }

        }]);
})();