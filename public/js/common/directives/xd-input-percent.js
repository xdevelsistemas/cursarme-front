(function () {
    'use strict';
    angular.module('common.directives').directive('xdInputPercent', [
            function () {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-input-percent.html',
                    scope: {
                        disable: '=',
                        params: '=',
                        change: '='
                    }
                };

            }
        ]);
})();