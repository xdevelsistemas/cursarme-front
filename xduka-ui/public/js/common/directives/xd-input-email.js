define([
    './__module__'
], function (directives) {

    'use strict';

    directives
        .directive('xdInputEmail', [
            function () {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-input-email.html',
                    scope: {
                        disable: '=',
                        params: '='
                    },
                    link: link
                };

                function link(scope, elem, attr) {
                    elem.bind('blur', function() {
                        scope.$apply(attr.xdInputEmail);
                    });

                    scope.testfn = function() {
                        if (scope.params.model.val == "") {
                            scope.params.model.err = "Insira um email"
                        }else {
                            if (!isEmail(scope.params.model.val)) {
                                scope.params.model.err = "Email inválido"
                            } else {
                                scope.params.model.err = ""
                            }
                        }
                    };

                    function isEmail(email){
                        var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
                        return regex.test(email);
                    }

                }
            }
        ]);
});