(function () {
    'use strict';
    angular.module('common.directives').directive('xdInputPercent', [
            function () {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: '../../common/html/xd-input-percent.html',
                    scope: {
                        disable: '=',
                        params: '=',
                        change: '='
                    }
                };

            }
        ]);
})();