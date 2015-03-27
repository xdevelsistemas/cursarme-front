define([
    './__module__',
    'jquery',
    'select2'
], function (directives, $) {

    'use strict';

    app.directive('onChange', function () {
        return {
            restrict: 'A',
            scope: {'onChange': '=onChange'},
            templateUrl: 'html/common/xd-select.html',
            link: link

        };
        function link(scope, elm, attrs) {
            scope.$watch('onChange', function (nVal) {
                elm.val(nVal);
            });
            elm.bind('blur', function () {
                var currentValue = elm.val();
                if (scope.onChange !== currentValue) {
                    scope.$apply(function () {
                        scope.onChange = currentValue;
                    });
                }
            });
        }
    });
});