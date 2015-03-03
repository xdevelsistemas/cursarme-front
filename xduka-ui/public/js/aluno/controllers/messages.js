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
    function Messages($scope, $http, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Mensagens';

        vm.STR = modelStrings;
        vm.user = modelUser;

        $http.get("./mockup/xduka-json/aluno/messages.json")
            .success(function(data) {
                vm.messages = data;
                console.log("Certo!");
        }).error(function() {
            vm.messages = modelMessages;
            console.log("Erro!");
        });
        //vm.messages = modelMessages;

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }

    }

});