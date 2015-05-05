define([
    './__module__'
], function (directives) {

    'use strict';

    directives
        .directive('xdInputEmail', ['$parse',
            function ($parse) {

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

    //TODO terminar lógica da validação do  campo email

                function link(scope, el, attr) {

                    if (!isEmail(scope.params.model.val)) {
                        scope.params.model.err = "Email inválido"
                    }


                    var fn = $parse(attr['ngBlur']);
                    element.bind('blur', function(event) {
                        scope.$apply(function () {
                            fn(scope.params.model.err, {$event: event});
                            /*if (!isEmail(scope.params.model.val)) {
                                scope.params.model.err = "Email inválido"
                            }*/
                        });
                    });

                    function isEmail(email){
                        var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
                        return regex.test(email);
                    }
                }
            }
        ]);
});