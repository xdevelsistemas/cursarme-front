define([
    './__module__',
    '../../common/models/strings'
], function (controllers, modelStrings) {

    'use strict';

    controllers
        .controller('Notas', Notas);

    Notas.$inject = ['$scope', '$http', 'breadCrumb'];

    /* @ngInject */
    function Notas($scope, $http, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Notas e Avaliações';

        vm.STR = modelStrings;

        $http.get('/api/aluno/notas')
            .success(function(data) {
                vm.disciplinas = data.disciplinas;
                vm.boletins = data.boletins;

            })
            .error(function(statusTexto) {
                console.log("Erro!\n" + statusTexto)
            });

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Nothing sent!');
        }

    }

});