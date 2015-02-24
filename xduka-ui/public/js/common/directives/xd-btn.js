define([
    './__module__'
], function (directives) {

    'use strict';

    directives
        .directive('xdBtn', [
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
});