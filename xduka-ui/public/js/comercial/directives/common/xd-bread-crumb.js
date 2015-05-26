(function () {
    'use strict';
    angular.module('app.directives').directive('xdBreadCrumb', function () {
        return {
            restrict: 'E',
            replace: true,
            templateUrl: '../../html/templates/xd-bread-crumb.html'
        };
    });
})();