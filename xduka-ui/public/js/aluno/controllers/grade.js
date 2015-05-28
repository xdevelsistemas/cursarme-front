(function () {

    'use strict';

    angular.module('app.controllers')
        .controller('Grade', Grade);

    Grade.$inject = ['$scope', '$resource', 'breadCrumb', 'defineCurso'];

    /* @ngInject */
    function Grade($scope, $resource, breadCrumb, defineCurso) {
        /* jshint validthis: true */
        var vm = this
            , gradePromise = $resource('/api/aluno/grade/:id').get({id: defineCurso.getIdCurso()}).$promise;

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

})();