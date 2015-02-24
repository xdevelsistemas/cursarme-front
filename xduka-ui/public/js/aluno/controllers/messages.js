define([
    './__module__',
    '../../common/models/strings',
    '../../common/models/user',
    '../models/messages'
], function (controllers, modelStrings, modelUser, modelMessages) {

    'use strict';

    controllers
        .controller('Messages', Messages);

    Messages.$inject = ['$scope', 'breadCrumb'];

    /* @ngInject */
    function Messages($scope, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Mensagens';

        vm.STR = modelStrings;
        vm.user = modelUser;
        vm.messages = modelMessages;

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }

    }

});