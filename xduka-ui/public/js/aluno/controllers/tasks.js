define([
    './__module__',
    '../../common/models/strings'
], function (controllers, modelStrings) {

    'use strict';

    controllers
        .controller('Tasks', Tasks);

    Tasks.$inject = ['$scope', '$resource', 'breadCrumb'];

    /* @ngInject */
    function Tasks($scope, $resource, breadCrumb) {
        /* jshint validthis: true */
        var vm = this
            ,tarefasPromise = $resource('/api/aluno/tarefas').get().$promise;

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
                    vm.filter = $.extend({label: vm.STR.FILTER, placeholder: vm.STR.FILTER_BY_SUBJECT}, data.filter);
                    vm.tasks = data.tasks;

                })
            .catch(function(statusTexto) {
                    console.log("Erro!\n" + statusTexto)
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
});