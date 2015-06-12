(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('secretaria', ['$scope', 'breadCrumb', function($scope, breadCrumb){

            var vm = this;

            breadCrumb.title = 'Secretaria';

            vm._model = {
                totalAlunosNovos: '19',
                alunosNovosInc: '8'
            };
            vm.grafico = {
                id: 'dashSecGrafico',
                data: [
                    { y: '2012/06', a: 43, b: 11 },
                    { y: '2013/06', a: 31, b: 9 },
                    { y: '2014/06', a: 54, b: 13 },
                    { y: '2015/06', a: 47, b: 22 }
                ],
                xkey: 'y',
                ykeys: ['a', 'b'],
                labels: ['Alunos Matriculados', 'Cadastros incompletos'],
                redraw: true
            }

            

        }])

})();
