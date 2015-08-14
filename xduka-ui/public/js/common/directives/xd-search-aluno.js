(function () {
    'use strict';
    angular.module('common.directives').directive('xdSearchAluno', [ 'alunoService', '$location', '$resource',
            function (alunoService,$location,$resource) {

                function link(scope) {

                    scope.params = {};
                    /* DEFININDO VARIAVEIS */
                    scope.params._alunos = false;
                    scope.params._searchVal = '';
                    scope.params.moreAluno = moreAluno;
                    scope.params.openSearch = false;
                    scope.params.searchFocus = searchFocus;
                    scope.params.searchFocusOff = searchFocusOff;
                    scope.params.searchkp = searchkp;
                    scope.params.searchPromise = searchPromise;

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

                    /* VER ALUNO PESQUISADO */
                    function moreAluno (aluno){
                        console.log('/'+scope.location.toLowerCase()+'/aluno/'+aluno.matricula.model.val);
                        scope.params.openSearch = false;
                        alunoService.aluno = aluno;
                        alunoService.aluno.alert = true;
                        $location.path('/'+scope.location.toLowerCase()+'/aluno/'+aluno.matricula.model.val)
                    }

                    function search(matNome){
                        var search = $resource('/api/'+scope.location.toLowerCase()+'/aluno/:matNome').get({matNome: matNome}).$promise;
                        search
                            .then(
                            function (data) {
                                if (compareArray(data.result,scope.params._alunos)){
                                    scope.params._alunos.err = data.err;
                                    scope.$parent.progressbar.complete();
                                }else{
                                    scope.params._alunos = data.result;
                                    scope.params._alunos.err = data.err;
                                    scope.$parent.progressbar.complete();
                                }
                            }
                        )
                            .catch(
                            function (err) {
                                console.log(err)
                            }
                        );
                    }

                    function searchFocus () {
                        scope.params.openSearch = true;
                    }

                    function searchFocusOff () {
                        scope.params.openSearch = false;
                    }

                    function searchkp (){
                        scope.params.searchFocusOff();
                        $('#searchAl_'+scope.params.name).blur();
                    }

                    /* SEARCH NODE */
                    function searchPromise (matNome) {
                        if (matNome.length >= 4) {
                            scope.$parent.progressbar.start();
                            search(matNome)
                        }else{
                            scope.params.auxAlunos = scope.params._alunos;
                            scope.params._alunos = []
                        }
                    }


                }

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-search-aluno.html',
                    scope: {
                        location: '=',
                        disable: '='
                    },
                    link: link
                };

            }
        ]);
})();