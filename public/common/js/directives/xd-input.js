(function () {
    'use strict';
    angular.module('common.directives').directive('xdInput', [
            function () {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: '../../common/html/xd-input.html',
                    scope: {
                        change: '=',
                        disable: '=',
                        params: '='
                    }
                };

            }
        ]);
})();