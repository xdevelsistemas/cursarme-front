define([
    './__module__',
    '../../common/models/strings',
    '../models/conteudo'
], function (controllers, modelStrings, modelConteudo) {

    'use strict';

    controllers
        .controller('Conteudo', Conteudo);

    Conteudo.$inject = ['$scope', 'breadCrumb'];

    /* @ngInject */
    function Conteudo($scope, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Conteúdo Aplicado';

        vm.STR = modelStrings;
        vm.filterPeriodo = modelConteudo.filterPeriodo;
        vm.filterDisciplina = modelConteudo.filterDisciplina;
        vm.disciplina = modelConteudo.disciplina;

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Nothing sent!');
        }

    }

});