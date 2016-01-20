(function () {
    'use strict';
    angular.module('common.directives').directive('xdInputChecks', [
            function () {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: '../../common/html/xd-input-checks.html',
                    scope: {
                        disable: '=',
                        params: '=',
                        change: '='
                    }
                };

            }
        ]);
})();