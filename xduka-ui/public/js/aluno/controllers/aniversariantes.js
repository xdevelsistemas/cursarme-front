(function () {

    'use strict';

    angular.module('app.controllers')
        .controller('Aniversariantes', Aniversariantes);

    Aniversariantes.$inject = ['$scope', '$resource', 'breadCrumb', 'defineCurso', 'modelStrings'];

    /* @ngInject */
    function Aniversariantes($scope, $resource, breadCrumb, defineCurso, modelStrings) {
        /* jshint validthis: true */
        var vm = this
            , aniverPromise = $resource('/api/aluno/aniversariantes/:id').get({id: defineCurso.getIdCurso()}).$promise;


        vm.STR = modelStrings;
        breadCrumb.title = vm.STR.ANIVER;

        aniverPromise
            .then(function(data) {
                vm.lista = data.lista;
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