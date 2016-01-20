(function () {

    'use strict';

    angular.module('app.controllers')
        .controller('Notas', Notas);

    Notas.$inject = ['$scope', '$resource', 'breadCrumb', 'defineCurso', 'modelStrings'];

    /* @ngInject */
    function Notas($scope, $resource, breadCrumb, defineCurso, modelStrings) {
        /* jshint validthis: true */
        var vm = this
            , notasPromise = $resource('/api/aluno/notas/:id').get({id: defineCurso.getIdCurso()}).$promise;


        vm.STR = modelStrings;
        breadCrumb.title = vm.STR.NOTAS;

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