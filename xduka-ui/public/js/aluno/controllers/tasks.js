define([
    './__module__',
    '../../common/models/strings',
    '../models/tasks'
], function (controllers, modelStrings, modelTasks) {

    'use strict';

    controllers
        .controller('Tasks', Tasks);

    Tasks.$inject = ['$scope', 'breadCrumb'];

    /* @ngInject */
    function Tasks($scope, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Tarefas';

        vm.STR = modelStrings;
        vm.filter = modelTasks.filter;
        vm.tasks = modelTasks.tasks;

        //vm.sendData = sendData;
        vm.selectFilter = selectFilter;

        /*This is just an example*/
        window.doo = function () {
            vm.filter.list.push({
                id: 123,
                text: 'lalalalal'
            });
            vm.filter._recompile();
        };

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }

        function selectFilter() {

        }

    }

});