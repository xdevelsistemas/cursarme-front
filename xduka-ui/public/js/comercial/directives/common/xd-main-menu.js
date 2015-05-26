(function () {
    'use strict';
    angular.module('app.directives').directive('xdMainMenu', function () {
        return {
            restrict: 'E',
            replace: true,
            templateUrl: '../../html/templates/xd-main-menu.html'
        };
    });
})();