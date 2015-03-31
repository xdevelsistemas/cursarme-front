define([
    './__module__',
    '../../common/models/strings'
], function (controllers, modelStrings) {

    'use strict';

    controllers
        .controller('Messages', Messages);

    Messages.$inject = ['$scope', '$resource', 'breadCrumb'];

    /* @ngInject */
    function Messages($scope, $resource, breadCrumb) {
        /* jshint validthis: true */
        var vm = this
            , msgPromise = $resource('/api/aluno/mensagens').get().$promise;

        breadCrumb.title = 'Mensagens';

        vm.STR = modelStrings;

        msgPromise
            .then(function(data) {
                vm.mensagens = data;
            })
            .catch(function(statusTexto) {
                console.log("Erro");
            });

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }
    }

});