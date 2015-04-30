define([
    './__module__',
    'jquery',
    'select2'
], function (directives, $) {

    'use strict';

    directives
        .directive('xdSelect', [
            '$compile',
            '$http',
            '$timeout',
            function ($compile, $http, $timeout) {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-select.html',
                    terminal: true,
                    priority: 1000,
                    scope: {
                        params: '=',
                        change: '=',
                        disabled: '=',
                        dValidate: '='
                    }
                };
            }
        ]
    );
});