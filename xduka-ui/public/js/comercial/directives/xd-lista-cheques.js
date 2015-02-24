define(['./__module__'], function (directives) {
    'use strict';
    directives.directive('xdListaCheques', function () {
        return {
            restrict: 'E',
            replace: true,
            templateUrl: '../../../html/comercial/lista-cheques.html',
            scope: {
                model: '='
            }
        };
    });
});