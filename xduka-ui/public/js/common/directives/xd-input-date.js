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
                        click: "=",
                        disable: '=',
                        opened: "=",
                        params: '=',
                        dateOptions: "="
                    }
                };

            }
        ]);
});