(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('dashboard', ['$scope', '$resource', 'breadCrumb', function($scope, $resource, breadCrumb) {

            /* jshint validthis: true */
            var vm = this;

            vm.breadCrumb = breadCrumb;
            vm.breadCrumb.title = 'Dashboard';

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