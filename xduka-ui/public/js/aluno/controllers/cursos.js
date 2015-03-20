define([
    './__module__',
    '../../common/models/strings'
], function (controllers, modelStrings) {

    'use strict';

    controllers
        .controller('Cursos', Cursos);

    Cursos.$inject = ['$scope', '$http', 'breadCrumb'];

    /* @ngInject */
    function Cursos($scope, $http, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Seleção de Curso';

        vm.STR = modelStrings;

        $http.get('/api/aluno/cursos')
            .success(function(data) {
                vm.cursos = $.extend(true, data.cursos);
            })
            .error(function(statusTexto) {
                console.log("Erro!\n" + statusTexto)
            });

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Nothing sent!');
        }

    }

});