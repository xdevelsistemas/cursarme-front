(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('secretaria', ['$scope', 'breadCrumb', function($scope, breadCrumb){

            var vm = this;

            breadCrumb.title = 'Secretaria';

            vm._model = {
                totalAlunosNovos: '19',
                alunosNovosInc: '8'
            }

            

        }])

})();
