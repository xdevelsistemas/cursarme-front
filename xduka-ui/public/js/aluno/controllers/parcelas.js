define([
    './__module__',
    '../../common/models/strings'
], function (controllers, modelStrings) {

    'use strict';

    controllers
        .controller('Parcelas', Parcelas);

    Parcelas.$inject = ['$scope', '$resource', 'breadCrumb'];

    /* @ngInject */
    function Parcelas($scope, $resource, breadCrumb) {
        /* jshint validthis: true */
        var vm = this
            , parcelasPromise = $resource('/api/aluno/parcelas').get().$promise;

        breadCrumb.title = 'Mensalidades';

        vm.STR = modelStrings;

        parcelasPromise
            .then(function(data) {
                vm.lista = data.lista
            })
            .catch(function(statusTexto) {
                console.log("Erro!\n" + statusTexto)
            });

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Nothing sent!');
        }

    }

});