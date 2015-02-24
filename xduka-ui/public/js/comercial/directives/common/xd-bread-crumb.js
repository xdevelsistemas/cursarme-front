define(['../__module__'], function (directives) {
    'use strict';
    directives.directive('xdBreadCrumb', function () {
        return {
            restrict: 'E',
            replace: true,
            templateUrl: '../../html/templates/xd-bread-crumb.html'
        };
    });
});