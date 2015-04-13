define([
    './__module__'
], function (directives) {

    'use strict';

    directives
        .directive('xdInput', [
            function () {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-input.html',
                    scope: {
                        name: '=',
                        model: '=',
                        type: '=',
                        label: '=',
                        mask: '=',
                        placeholder: '=',
                        disable: '=',
                        dValidate: '=',
                        req: '='
                    }
                };

            }
        ]);
});