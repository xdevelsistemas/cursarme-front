(function () {
    'use strict';
    angular.module('common.directives').directive('xdInputMoney', [
            function () {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: '../../common/html/xd-input-money.html',
                    scope: {
                        disable: '=',
                        params: '='
                    }
                };
            }
        ]);
})();
