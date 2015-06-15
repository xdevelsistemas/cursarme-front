(function () {
    'use strict';
    angular.module('common.directives').directive('xdInput', [
            function () {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-input.html',
                    scope: {
                        disable: '=',
                        params: '=',
                        change: '='
                    }
                };

            }
        ]);
})();