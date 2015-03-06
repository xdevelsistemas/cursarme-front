define([
    './__module__',
    '../../common/models/strings'
], function (controllers, modelStrings) {

    'use strict';

    controllers
        .controller('Aniversariantes', Aniversariantes);

    Aniversariantes.$inject = ['$http', 'breadCrumb'];

    /* @ngInject */
    function Aniversariantes($http, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        //console.log(breadCrumb);

        breadCrumb.title = 'Aniversariantes';

        vm.STR = modelStrings;

        $http.get('/api/aluno/aniversariantes')
            .success(function(data) {
                vm.lista = data.lista;
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