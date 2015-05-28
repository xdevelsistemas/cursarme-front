define([
    './../../common/directives/__module__'
], function (directives) {

    'use strict';

    directives
        .directive('xdTableComercial', [
            function () {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-table-comercial.html',
                    scope: {
                        if: '=',
                        params: '='
                    }
                };

            }
        ]);
});