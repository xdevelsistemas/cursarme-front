define([
    './__module__',
    '../../common/models/strings'
], function (controllers, modelStrings) {

    'use strict';

    controllers
        .controller('Conteudo', Conteudo);

    Conteudo.$inject = ['$http', 'breadCrumb'];

    /* @ngInject */
    function Conteudo($http, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Conteúdo Aplicado';

        vm.STR = modelStrings;

        $http.get('/api/aluno/conteudo')
            .success(function(data) {
                vm.filterPeriodo = data.filterPeriodo;
                vm.filterDisciplina = data.filterDisciplina;
                vm.disciplina = data.disciplina;
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