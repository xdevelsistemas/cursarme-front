define([
    './__module__',
    '../../common/models/strings',
    '../models/conteudo'
], function (controllers, modelStrings, modelConteudo) {

    'use strict';

    controllers
        .controller('Conteudo', Conteudo);

    Conteudo.$inject = ['$scope', '$http', 'breadCrumb'];

    /* @ngInject */
    function Conteudo($scope, $http, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Conteúdo Aplicado';

        vm.STR = modelStrings;
        vm.filterPeriodo = modelConteudo.filterPeriodo;
        vm.filterDisciplina = modelConteudo.filterDisciplina;
        vm.disciplina = modelConteudo.disciplina;

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