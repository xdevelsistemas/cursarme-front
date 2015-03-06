define([
    './__module__',
    '../../common/models/strings'
], function (controllers, modelStrings) {

    'use strict';

    controllers
        .controller('Messages', Messages);

    Messages.$inject = ['$http', 'breadCrumb'];

    /* @ngInject */
    function Messages($http, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Mensagens';

        vm.STR = modelStrings;

        $http.get('/api/aluno/usuario')
            .success(function (data) {
                vm.user = data;
            })
            .error(function (statusTexto) {
                console.log("Erro!\n" + statusTexto);
            });

        $http.get('/api/aluno/mensagens')
            .success(function(data) {
                vm.mensagens = data;
            })
            .error(function(statusTexto) {
                console.log("Erro");
            });

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }
    }

});