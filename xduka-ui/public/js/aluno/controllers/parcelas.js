define([
    './__module__',
    '../../common/models/strings',
    '../models/parcelas'
], function (controllers, modelStrings, modelParcelas) {

    'use strict';

    controllers
        .controller('Parcelas', Parcelas);

    Parcelas.$inject = ['$scope', 'breadCrumb'];

    /* @ngInject */
    function Parcelas($scope, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Mensalidades';

        vm.STR = modelStrings;
        vm.lista = modelParcelas.lista;

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Nothing sent!');
        }

    }

});