(function () {
    'use strict';
    angular.module('app.directives').directive('xdListaCheques', function () {
        return {
            restrict: 'E',
            replace: true,
            templateUrl: 'html/lista-cheques.html',
            scope: {
                model: '='
            }
        };
    });
})();