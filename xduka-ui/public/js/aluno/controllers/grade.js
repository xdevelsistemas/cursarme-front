define([
    './__module__',
    '../../common/models/strings'
], function (controllers, modelStrings) {

    'use strict';

    controllers
        .controller('Grade', Grade);

    Grade.$inject = ['$scope', '$resource', 'breadCrumb'];

    /* @ngInject */
    function Grade($scope, $resource, breadCrumb) {
        /* jshint validthis: true */
        var vm = this
            , gradePromise = $resource('/api/aluno/grade').get().$promise;

        breadCrumb.title = 'Grade Curricular';

        vm.STR = modelStrings;

        gradePromise
            .then(function(data) {
                vm.lista = data.lista;
            })
            .catch(function(statusText) {
                console.log('Erro!\n' + statusText);
            });


        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Nothing sent!');
        }

    }

});