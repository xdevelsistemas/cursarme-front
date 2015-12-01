(function () {

    'use strict';

    angular.module('app.controllers')
        .controller('Grade', Grade);

    Grade.$inject = ['$scope', '$resource', 'breadCrumb', 'defineCurso', 'modelStrings'];

    /* @ngInject */
    function Grade($scope, $resource, breadCrumb, defineCurso, modelStrings) {
        /* jshint validthis: true */
        var vm = this
            , gradePromise = $resource('/api/aluno/grade/:id').get({id: defineCurso.getIdCurso()}).$promise;


        vm.STR = modelStrings;
        breadCrumb.title = vm.STR.GRADECUR;

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