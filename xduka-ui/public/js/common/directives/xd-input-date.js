define([
    './__module__'
], function (directives) {

    'use strict';

    directives
        .directive('xdInputDate', [
            function () {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-input-date.html',
                    scope: {
                        click: "=click",
                        disable: '=',
                        opened: "=",
                        params: '=',
                        dateOptions: "="
                    }
                };

            }
        ]);
});