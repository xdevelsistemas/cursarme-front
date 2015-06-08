(function (controllers, modelStrings) {

    'use strict';

    angular.module('app.controllers')
        .controller('Messages', Messages);

    Messages.$inject = ['$scope', '$resource', 'breadCrumb', 'defineCurso', 'modelStrings'];

    /* @ngInject */
    function Messages($scope, $resource, breadCrumb, defineCurso, modelStrings) {
        /* jshint validthis: true */

        var vm = this
            , msgPromise = $resource('/api/aluno/mensagens/:id').get({id: defineCurso.getIdCurso()}).$promise;

        breadCrumb.title = 'Mensagens';

        vm.STR = modelStrings;

        msgPromise
            .then(function(data) {
                vm.mensagens = data;
            })
            .catch(function(erro) {
                console.log(erro);
            });

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }
    }

})();