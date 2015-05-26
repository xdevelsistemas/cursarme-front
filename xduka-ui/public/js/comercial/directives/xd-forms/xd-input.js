(function () {
    'use strict';
    angular.module('app.directives').directive('xdInput', ['$compile', '$http', '$timeout', 'jquery',
        function ($compile, $http, $timeout, $) {

            var ROOTPATH = 'html/xd-forms/input/';

            var TYPES = {
                "text": {
                    template: 'xd-text',
                    link: function (scope, element, attributes, view) {
                    }
                },
                "email": {
                    template: 'xd-email'
                },
                "select": {
                    template: 'xd-select',
                    link: function (scope, element, attributes, view) {
                        scope.remake = function (identifier) {
                            var target = !!identifier ? $(identifier) : view;
                            $timeout(function () {
                                target.select2('destroy');
                                target.select2({width: '100%', placeholder: scope.field.placeholder});
                            }, 1);
                        };
                        view.select2({width: '100%', placeholder: scope.field.placeholder});
                    }
                },
                "textarea": {
                    template: 'xd-textarea',
                    link: function (scope, element, attributes, view) {
                    }
                },
                "vagas": {
                    template: 'xd-textarea',
                    link: function (scope, element, attributes, view) {
                    }
                }
            };

            var link = function (scope, element, attributes) {
                var TYPE = TYPES[scope.field.type];
                $http.get(ROOTPATH + TYPE.template + '.html')
                    .success(function (data) {
                        element.html(data).show();
                        var view = $compile(element.contents())(scope);
                        element.replaceWith(view);
                        $timeout(function () {
                            if (!!TYPE.link) {
                                TYPE.link(scope, element, attributes, view);
                            }
                        }, 1);
                    });
            };

            return {
                restrict: "E",
                link: link,
                scope: {
                    field: '=',
                    model: '=',
                    change: '='
                }
            };
        }
    ]);
})();