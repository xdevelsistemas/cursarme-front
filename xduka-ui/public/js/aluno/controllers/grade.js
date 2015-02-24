define([
    './__module__',
    '../../common/models/strings',
    '../models/grade'
], function (controllers, modelStrings, modelGrade) {

    'use strict';

    controllers
        .controller('Grade', Grade);

    Grade.$inject = ['$scope', 'breadCrumb'];

    /* @ngInject */
    function Grade($scope, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Grade Curricular';

        vm.STR = modelStrings;
        vm.lista = modelGrade.lista;

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Nothing sent!');
        }

    }

});