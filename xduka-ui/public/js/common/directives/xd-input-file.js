(function () {
    'use strict';
    angular.module('common.directives').directive('xdInputFile', [
        'modelStrings',
            function (modelStrings) {

                function link(scope) {
                    scope.STR = modelStrings;
                    scope.geraStrTamanho = geraStrTamanho;
                }

                function geraStrTamanho(size){
                    return size/1024<1024?((size/1024).toFixed(2)+' KB'):((size/1024/1024).toFixed(2)+' MB')
                }

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-input-file.html',
                    scope: {
                        disable: '=',
                        params: '='
                    },
                    link: link
                };

            }
        ]);
})();