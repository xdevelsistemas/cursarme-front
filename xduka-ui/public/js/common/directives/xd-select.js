define([
    './__module__',
    'jquery',
    'select2'
], function (directives, $) {

    'use strict';

    directives
        .directive('xdSelect', [
            '$compile',
            '$http',
            '$timeout',
            function ($compile, $http, $timeout) {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-select.html',
                    link: link,
                    scope: {
                        params: '='
                    }
                };

                function link(scope, element, attributes) {
                    scope.params._recompile = _recompile;
                    _recompile();
                    function _recompile() {
                        $timeout(function () {
                            var pr = scope.params;
                            element.find('select').select2('destroy');
                            element.find('select').select2({
                                placeholder: pr.placeholder,
                                width: '100%'
                            });
                        }, 1);
                    }
                }

            }
        ]);
});