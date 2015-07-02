(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('secretaria', ['$scope', '$resource', 'breadCrumb', '$timeout', function($scope, $resource, breadCrumb, $timeout){

            var vm = this
                , geraTurmaPromise = $resource('/api/secretaria/dados-gera-turma').get().$promise;

            breadCrumb.title = 'Secretaria';

            vm.grafico = {};

            geraTurmaPromise
                .then(function(data) {
                    vm._model = {"totalAlunosCad": 0, "totalAlunosInc": 0};
                    vm.grafico.data = [];

                    for (var i = 0; i < data.list.length; i++) {
                        vm._model.totalAlunosCad += data.list[i].area.turma.vagas.preenchidas;
                        vm._model.totalAlunosInc += data.list[i].area.turma.vagas.incompletas;

                        /*  grafico  */
                        vm.grafico.data.push({
                            y: data.list[i].area.turma.param,
                            a: data.list[i].area.turma.vagas.preenchidas,
                            b: data.list[i].area.turma.vagas.incompletas
                        });


                    }
                })
                .catch(function(erro) {
                    console.log(erro);
                });

            /*vm._model = {
             totalAlunosCad: '19',
             totalAlunosInc: '8'
             };*/

            vm.grafico = {
                id: 'dashSecGrafico',
                xkey: 'y',
                ykeys: ['a', 'b'],
                labels: ['Alunos cadastrados', 'Cadastros incompletos'],
                redraw: true
            };

            $timeout(function(){}, 1000);


            /*data: [       // data -> vm.grafico
             { y: '2012/06', a: 43, b: 11 },
             { y: '2013/06', a: 30, b: 30 },
             { y: '2014/06', a: 54, b: 0 },
             { y: '2015/06', a: 47, b: 9 }
             ],*/

            vm.grafico2 = {
                id: 'testeGraf',
                x: 'MAIO, JUNHO, JULHO',
                list: [
                    {
                        name: '2015',
                        values: '20,13,18',
                        type: 'spline'
                    },
                    {
                        name: '2014',
                        values: '3,14,28',
                        type: 'spline'
                    },
                    {
                        name: '2013',
                        values: '2,17,8',
                        type: 'spline'
                    }
                ]
            }



        }])
})();