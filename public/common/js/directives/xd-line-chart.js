(function () {
    'use strict';
    angular.module('common.directives').directive('xdLineChart', ['$timeout',
            function ($timeout) {


                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: '../../common/html/xd-line-chart.html',
                    scope: {
                        disable: '=',
                        params: '='
                    },
                    link: function(scope){
                        $timeout(function(){
                            // Line Charts
                            var line_chart_xd = $('#'+scope.params.id);
                            /*var line_chart = Morris.Line({
                                element: scope.params.id,   //str
                                data: scope.params.data,    //list of dics
                                xkey: scope.params.xkey,    //str
                                ykeys: scope.params.ykeys,   //list
                                labels: scope.params.labels, //list
                                redraw: scope.params.redraw //boolean
                            });*/

                            line_chart_xd.parent().attr('style', '');
                            $('#load_'+scope.params.id).attr({style: 'display: none'});
                        },1000);
                    }
                };

            }
        ]);
})();