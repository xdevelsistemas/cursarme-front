define([
    './__module__',
    '../../common/models/strings',
    '../../common/models/user',
    '../models/messages'
], function (controllers, modelStrings, modelUser, modelMessages) {

    'use strict';

    controllers
        .controller('Messages', Messages);

    Messages.$inject = ['$scope', '$http', 'breadCrumb'];

    /* @ngInject */
    function Messages($scope, $resource, breadCrumb) {
        /* jshint validthis: true */
        var vm = this,
            mensagem = $resource('/mensagens/:id');

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