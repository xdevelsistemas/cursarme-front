define([
    './__module__',
    '../../common/models/strings'
], function (controllers, modelStrings) {

    'use strict';

    controllers
        .controller('Grade', Grade);

    Grade.$inject = ['$scope', '$http', 'breadCrumb'];

    /* @ngInject */
    function Grade($scope, $http, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Grade Curricular';

        vm.STR = modelStrings;

        $http.get('/api/aluno/grade')
            .success(function(data) {
                vm.lista = data.lista;
            })
            .error(function(statusText) {
                console.log('Erro!\n' + statusText);
            });


        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Nothing sent!');
        }

    }

});