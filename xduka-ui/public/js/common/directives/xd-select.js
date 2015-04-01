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
                    scope: {params: '=params', onChange:'=onChange' },
                    templateUrl: 'html/common/xd-select.html',
                    terminal: true,
                    priority: 1000,
                    link: function(scope, elm, attrs) {
                        console.log(elm.find('select').select2());
                        elm.find('select').select2()
                            .on("change", function(e) {
                                // mostly used event, fired to the original element when the value changes
                                console.log("change val=" + e.val);
                            });



                        //scope.$watch('onChange', function(nVal) { elm.val(nVal); });
                        //
                        //
                        //
                        //elm.bind('change', function(event) {
                        //    event.preventDefault();
                        //    var currentValue = elm.val();
                        //    if( scope.onChange !== currentValue ) {
                        //        scope.$apply(function() {
                        //            scope.onChange = currentValue;
                        //        });
                        //    }
                        //    console.log("aqui");
                        //});
                    }

                };


                //function link(scope, element, attrs) {
                //    element.removeAttr("xd-select"); //remove the attribute to avoid indefinite loop
                //    element.removeAttr("data-xd-select"); //also remove the same attribute with data- prefix in case users specify data-common-things in the html
                //
                //    $compile(element)(scope);
                //}

                /*function link(scope, element, attributes) {
                    //scope.params._recompile = _recompile;
                    _recompile();
                    function _recompile() {
                        scope.$watch('params', function(newVal) {
                            if(newVal) {
                                console.log(scope.params);
                                var pr = scope.params;
                                element.find('select').select2('destroy');
                                element.find('select').select2({
                                    placeholder: pr.placeholder,
                                    width: '100%'
                                });
                            }
                        }, true);
                    }
                }*/
            }
        ]
    );
});