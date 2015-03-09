define([
    './__module__',
    '../../common/models/strings',
    '../models/parcelas'
], function (controllers, modelStrings, modelParcelas) {

    'use strict';

    controllers
        .controller('Parcelas', Parcelas);

    Parcelas.$inject = ['$scope', '$http', 'breadCrumb'];

    /* @ngInject */
    function Parcelas($scope, $http, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Mensalidades';

        vm.STR = modelStrings;

        $http.get('/api/aluno/parcelas')
            .success(function(data) {
                vm.lista = data.lista
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