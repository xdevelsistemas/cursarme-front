(function () {

    'use strict';

    angular.module('app.controllers')
        .controller('Horarios', Horarios);

    Horarios.$inject = ['$scope', '$resource', 'breadCrumb', 'defineCurso', 'modelStrings'];

    /* @ngInject */
    function Horarios($scope, $resource,breadCrumb, defineCurso, modelStrings) {
        /* jshint validthis: true */
        var vm = this
            , horariosPromise = $resource('/api/aluno/horarios/:id').get({id: defineCurso.getIdCurso()}).$promise;

        breadCrumb.title = 'Quadro de Horários';

        vm.STR = modelStrings;

        horariosPromise
            .then(function(data){
                vm.MAX = data.MAX;
                vm.domingo = data.domingo;
                vm.segunda = data.segunda;
                vm.terca = data.terca;
                vm.quarta = data.quarta;
                vm.quinta = data.quinta;
                vm.sexta = data.sexta;
                vm.sabado = data.sabado;
            })
            .catch(function(statusTexto){
                console.log("Erro!\n" + statusTexto + "\n");
            });

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Nothing sent!');
        }

    }

})();