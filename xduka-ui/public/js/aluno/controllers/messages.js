define([
    './__module__',
    '../../common/models/strings',
    '../../common/models/user',
    '../models/messages'
], function (controllers, modelStrings, modelUser, modelMessages) {

    'use strict';

    controllers
        .controller('Messages', Messages);

    Messages.$inject = ['$http', 'breadCrumb'];

    /* @ngInject */
    function Messages($resource, breadCrumb) {
        /* jshint validthis: true */
        var vm = this,
            mensagem = $http.get('/api/aluno/mensagens');

        breadCrumb.title = 'Mensagens';

        vm.STR = modelStrings;
        vm.user = modelUser;
        buscaMensagens();
        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }

        function buscaMensagens() {
            mensagem.query(
                function(data) {
                    vm.mensagem = data;
                }
            );
        }

    }

});