define([
    './__module__'
], function (directives) {

    'use strict';

    directives
        .directive('xdInputDate', [
            function () {

        //TODO consertar BUG do openDatePicker /// que abre o "calendário" em todos os xd-input-date
                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-input-date.html',
                    scope: {
                        //click: "=",
                        disable: '=',
                        //opened: "=",
                        params: '='
                        //dateOptions: "="
                    },
                    link: link
                };

                function link(scope, elem, attr) {
                    scope.opened = false;
                    elem.bind('click', function() {
                        scope.$apply(attr.xdInputDate);
                    });

                    scope.fnOpen = function($event) {
                        $event.preventDefault();
                        $event.stopPropagation();

                        scope.opened = true;
                    };
                    // ===Date picker ==//

                    scope.formats = ['dd/MM/yyyy', 'yyyy/MM/dd', 'dd.MM.yyyy', 'shortDate'];
                    scope.format = scope.formats[0];

                    scope.clear = function () {
                        scope.dt = null;
                    };

                    // Disable weekend selection
                    /*vm.disabled = function(date, mode) {
                     return ( mode === 'day' && ( date.getDay() === 0 || date.getDay() === 6 ) );
                     };*/

                    scope.toggleMin = function() {
                        vm.minDate = vm.minDate ? null : new Date();
                    };
                    scope.toggleMin();

                    scope.dateOptions = {
                        formatYear: 'yyyy',
                        startingDay: 1
                    };
                }

            }
        ]);
});