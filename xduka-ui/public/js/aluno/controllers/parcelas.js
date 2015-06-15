(function () {

    'use strict';

    angular.module('app.controllers')
        .controller('Parcelas', Parcelas);

    Parcelas.$inject = ['$scope', '$resource', 'breadCrumb', 'defineCurso', 'modelStrings'];

    /* @ngInject */
    function Parcelas($scope, $resource, breadCrumb, defineCurso, modelStrings) {
        /* jshint validthis: true */
        var vm = this
            , parcelasPromise = $resource('/api/aluno/parcelas/:id').get({id: defineCurso.getIdCurso()}).$promise;

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

})();