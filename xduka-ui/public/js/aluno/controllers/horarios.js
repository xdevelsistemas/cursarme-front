define([
    './__module__',
    '../../common/models/strings',
    '../models/horarios'
], function (controllers, modelStrings, modelHorarios) {

    'use strict';

    controllers
        .controller('Horarios', Horarios);

    Horarios.$inject = ['$scope', 'breadCrumb'];

    /* @ngInject */
    function Horarios($scope,breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Quadro de Horários';

        vm.STR = modelStrings;
        vm.MAX =
            modelHorarios.MAX;
        vm.domingo =
            modelHorarios.domingo;
        vm.segunda =
            modelHorarios.segunda;
        vm.terca =
            modelHorarios.terca;
        vm.quarta =
            modelHorarios.quarta;
        vm.quinta =
            modelHorarios.quinta;
        vm.sexta =
            modelHorarios.sexta;
        vm.sabado =
            modelHorarios.sabado;

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Nothing sent!');
        }

    }

});