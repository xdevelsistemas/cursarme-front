(function () {
    'use strict';
    angular.module('common.directives').directive('xdPanelCollapse', function () {
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