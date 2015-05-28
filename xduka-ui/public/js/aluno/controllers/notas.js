(function () {

    'use strict';

    angular.module('app.controllers')
        .controller('Notas', Notas);

    Notas.$inject = ['$scope', '$resource', 'breadCrumb', 'defineCurso'];

    /* @ngInject */
    function Notas($scope, $resource, breadCrumb, defineCurso) {
        /* jshint validthis: true */
        var vm = this
            , notasPromise = $resource('/api/aluno/notas/:id').get({id: defineCurso.getIdCurso()}).$promise;

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

})();