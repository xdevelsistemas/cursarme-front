(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('dashboard', ['$scope', '$resource', 'modelStrings', 'breadCrumb',
            function($scope, $resource, modelStrings, breadCrumb) {

            /* jshint validthis: true */
            var vm = this;

            vm.STR = modelStrings;
            vm.breadCrumb = breadCrumb;
            vm.breadCrumb.title = vm.STR.DASHBOARD;

            vm.grafic1 = {
                id: 'graf1',
                x: 'MAIO, JUNHO, JULHO',
                list: [
                    {
                        name: 'EM ATRASO',
                        values: '10,13,23',
                        type: 'spline'
                    },
                    {
                        name: 'EM DIA',
                        values: '17,14,28',
                        type: 'spline'
                    }
                ]
            }


        }]);
})();