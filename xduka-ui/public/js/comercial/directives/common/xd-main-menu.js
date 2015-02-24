define(['../__module__'], function (directives) {
    'use strict';
    directives.directive('xdMainMenu', function () {
        return {
            restrict: 'E',
            replace: true,
            templateUrl: '../../html/templates/xd-main-menu.html'
        };
    });
});