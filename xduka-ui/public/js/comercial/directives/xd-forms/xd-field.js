(function () {
    'use strict';
    angular.module('app.directives').directive('xdField', [
        function () {
            return {
                restrict: 'E',
                replace: true,
                templateUrl: '../../../html/xd-forms/xd-field.html',
                scope: {
                    field: '=',
                    model: '=',
                    change: '='
                }
            };
        }
    ]);
})();