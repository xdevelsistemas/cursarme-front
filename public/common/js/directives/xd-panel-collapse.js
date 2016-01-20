(function () {
    'use strict';
    angular.module('common.directives').directive('xdPanelCollapse', function () {
        return {
            restrict: 'E',
            transclude: true,
            replace: true,
            templateUrl: '../../common/html/xd-painel-collapse.html',
            scope: {
                title: '='
            }
        };
    });
})();