define(['../__module__'], function (directives) {
    'use strict';
    directives.directive('xdPanelCollapse', function () {
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
});