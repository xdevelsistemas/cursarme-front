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
                        if (scope.params.dataTable != {}){
                            $timeout(function(){
                                $('#'+scope.params.id).dataTable(
                                    scope.params.dataTable
                                );
                            },2000)
                        }
                    }
                };

            }
        ]);
})();