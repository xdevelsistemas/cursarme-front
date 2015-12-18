(function () {
    'use strict';
    angular.module('common.directives').directive('xdInputChecks', [
            function () {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-input-checks.html',
                    scope: {
                        disable: '=',
                        params: '=',
                        change: '='
                    }
                };

            }
        ]);
})();