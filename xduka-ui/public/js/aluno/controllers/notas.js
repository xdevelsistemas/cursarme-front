define([
    './__module__',
    '../../common/models/strings'
], function (controllers, modelStrings) {

    'use strict';

    controllers
        .controller('Notas', Notas);

    Notas.$inject = ['$scope', '$resource', 'breadCrumb'];

    /* @ngInject */
    function Notas($scope, $resource, breadCrumb) {
        /* jshint validthis: true */
        var vm = this
            , notasPromise = $resource('/api/aluno/notas').get().$promise;

        breadCrumb.title = 'Notas e Avaliações';

        vm.STR = modelStrings;

        notasPromise
            .then(function(data) {
                vm.disciplinas = data.disciplinas;
                vm.boletins = data.boletins;

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