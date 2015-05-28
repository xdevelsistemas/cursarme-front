(function () {
    'use strict';
    angular.module('app.directives').directive('xdPanelCollapse', function () {
        return {
            restrict: 'E',
            transclude: true,
            replace: true,
            templateUrl: '../../../html/templates/xd-painel-collapse.html',
            scope: {
                title: '='
            }
        };
    });
})();