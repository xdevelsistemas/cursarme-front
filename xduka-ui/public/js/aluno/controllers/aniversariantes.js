define([
    './__module__',
    '../../common/models/strings'
], function (controllers, modelStrings) {

    'use strict';

    controllers
        .controller('Aniversariantes', Aniversariantes);

    Aniversariantes.$inject = ['$scope', '$resource', 'breadCrumb'];

    /* @ngInject */
    function Aniversariantes($scope, $resource, breadCrumb) {
        /* jshint validthis: true */
        var vm = this
            , aniverPromise = $resource('/api/aluno/aniversariantes/:id').get({id: defineCurso.idCurso}).$promise;

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

});