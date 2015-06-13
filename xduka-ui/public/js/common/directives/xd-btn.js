(function () {
    'use strict';
    angular.module('common.directives').directive('xdBtn', [
            function () {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-btn.html',
                    scope: {
                        click: '=',
                        label: '=',
                        icon: '='
                    }
                };

            }
        ]);
})();