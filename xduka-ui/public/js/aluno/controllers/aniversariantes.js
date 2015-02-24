define([
    './__module__',
    '../../common/models/strings',
    '../models/aniversariantes'
], function (controllers, modelStrings, modelAniversariantes) {

    'use strict';

    controllers
        .controller('Aniversariantes', Aniversariantes);

    Aniversariantes.$inject = ['$scope', 'breadCrumb'];

    /* @ngInject */
    function Aniversariantes($scope, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        //console.log(breadCrumb);

        breadCrumb.title = 'Aniversariantes';

        vm.STR = modelStrings;
        vm.lista = modelAniversariantes.lista;

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Nothing sent!');
        }

    }

});