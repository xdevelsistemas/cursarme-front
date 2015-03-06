define([
    './__module__',
    '../../common/models/strings'
], function (controllers, modelStrings) {

    'use strict';

    controllers
        .controller('Horarios', Horarios);

    Horarios.$inject = ['$http', 'breadCrumb'];

    /* @ngInject */
    function Horarios($http,breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Quadro de Horários';

        vm.STR = modelStrings;

        $http.get('/api/aluno/horarios')
            .success(function(data){
                vm.MAX =
                    data.MAX;
                vm.domingo =
                    data.domingo;
                vm.segunda =
                    data.segunda;
                vm.terca =
                    data.terca;
                vm.quarta =
                    data.quarta;
                vm.quinta =
                    data.quinta;
                vm.sexta =
                    data.sexta;
                vm.sabado =
                    data.sabado;
            })
            .error(function(statusTexto){
                console.log("Erro!\n" + statusTexto);
            });

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Nothing sent!');
        }

    }

});