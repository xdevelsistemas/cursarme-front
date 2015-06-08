(function () {

    'use strict';

    angular.module('app.controllers')
        .controller('Tasks', Tasks);

    Tasks.$inject = ['$scope', '$resource', 'breadCrumb', 'defineCurso', 'modelStrings'];

    /* @ngInject */
    function Tasks($scope, $resource, breadCrumb, defineCurso, modelStrings) {
        /* jshint validthis: true */
        var vm = this
            ,tarefasPromise = $resource('/api/aluno/tarefas/:id').get({id: defineCurso.getIdCurso()}).$promise;

        breadCrumb.title = 'Tarefas';

        vm.STR = modelStrings;

        //vm.selectFilter = selectFilter;
        //vm.sendData = sendData;
        vm.sendTask = sendTask;

        /*This is just an example*/
        window.doo = function () {
            vm.filter.list.push({
                id: 123,
                text: 'lalalalal'
            });
            vm.filter._recompile();
        };

        ////////////////
        tarefasPromise
            .then(
                function(data) {
                    vm.filter = data.filter;
                    vm.tasks = data.tasks;

                })
            .catch(function(erro) {
                    console.log("Erro!\n" + erro.data)
                }
            );

        function selectFilter() {

        }

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }

        function sendTask(item, model) {
            console.log(item.id + " - " + item.text);
        }
    }
})();