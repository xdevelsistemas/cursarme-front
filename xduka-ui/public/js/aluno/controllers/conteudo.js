define([
    './__module__',
    '../../common/models/strings'
], function (controllers, modelStrings) {

    'use strict';

    controllers
        .controller('Conteudo', Conteudo);

    Conteudo.$inject = ['$scope', '$resource', 'breadCrumb'];

    /* @ngInject */
    function Conteudo($scope, $resource, breadCrumb) {
        /* jshint validthis: true */
        var vm = this
            , conteudoPromise = $resource('/api/aluno/conteudo/:id').get({id: defineCurso.idCurso}).$promise;

        breadCrumb.title = 'Conteúdo Aplicado';

        vm.STR = modelStrings;

        conteudoPromise
            .then(function(data) {
                vm.filterPeriodo = data.filterPeriodo;
                vm.filterDisciplina = data.filterDisciplina;
                vm.disciplina = data.disciplina;
            })
            .catch(function(statusTexto) {
                console.log("Erro!\n" + statusTexto)
            });


        vm.sendData = sendData;
        vm.sendDisciplina = sendDisciplina;
        vm.sendPeriodo = sendPeriodo;

        ////////////////

        function sendData(item, model) {
            console.log(item.id + " - " + item.text);
        }

        function sendDisciplina(item, model) {
            console.log(item.id + " - " + item.text);
        }

        function sendPeriodo(item, model) {
            console.log(item.id + " - " + item.text);
        }

    }

});