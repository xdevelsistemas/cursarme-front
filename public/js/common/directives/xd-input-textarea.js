(function () {
    'use strict';
    angular.module('common.directives').directive('xdInputTextarea', [
            function () {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-input-textarea.html',
                    scope: {
                        disable: '=',
                        params: '='
                    }
                };

            }
        ]);
})();