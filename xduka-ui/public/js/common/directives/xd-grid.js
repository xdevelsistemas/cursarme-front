(function () {
    'use strict';
    angular.module('common.directives').directive('xdGrid', ['$timeout',
            function ($timeout) {


                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-grid.html',
                    scope: {
                        disable: '=',
                        params: '='
                    },
                    link: function(scope){
                        try{if (!!scope.params.dataTable&&!!scope.params.id){
                            $timeout(function(){
                                window['dataTable_'+scope.params.id] = $('#'+scope.params.id).dataTable(
                                    scope.params.dataTable
                                );
                            },2000)
                        }}catch(err){
                            console.log('xdGrid directive: Params provavelmente não está definido! Insira um objeto válido e use data-params no html.')
                        }

                    }
                };

            }
        ]);
})();

//