(function () {

    'use strict';

    angular.module('app.controllers')
        .controller('Aniversariantes', Aniversariantes);

    Aniversariantes.$inject = ['$scope', '$resource', 'breadCrumb', 'defineCurso'];

    /* @ngInject */
    function Aniversariantes($scope, $resource, breadCrumb, defineCurso) {
        /* jshint validthis: true */
        var vm = this
            , aniverPromise = $resource('/api/aluno/aniversariantes/:id').get({id: defineCurso.getIdCurso()}).$promise;

        //console.log(breadCrumb);

        breadCrumb.title = 'Aniversariantes';

        vm.STR = modelStrings;

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