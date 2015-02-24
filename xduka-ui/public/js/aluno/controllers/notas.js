define([
    './__module__',
    '../../common/models/strings',
    '../models/notas'
], function (controllers, modelStrings, modelNotas) {

    'use strict';

    controllers
        .controller('Notas', Notas);

    Notas.$inject = ['$scope', 'breadCrumb'];

    /* @ngInject */
    function Notas($scope, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Notas e Avaliações';

        vm.STR = modelStrings;
        vm.disciplinas = modelNotas.disciplinas;
        vm.boletins = modelNotas.boletins;

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Nothing sent!');
        }

    }

});