define([
    './__module__',
    '../../common/models/strings',
    '../models/menu'
], function (controllers, modelStrings, modelMenu) {

    'use strict';

    controllers
        .controller('Main', Main);

    Main.$inject = ['$scope', 'breadCrumb'];

    /* @ngInject */
    function Main($scope, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        vm.breadCrumb = breadCrumb;

        vm.STR = modelStrings;
        vm.menu = modelMenu;

        vm.appName = 'xDuka';
        vm.area = 'Comercial';
        vm.lang = 'pt-br';
        vm.section = '';

        vm.sendData = sendData;

        $http.get('/api/aluno/usuario')
            .success(getUsuario)
            .error(function(textError){
                console.log("Erro:\n" + textError + "\n");
            });

        ////////////////

        function getUsuario(data) {
            vm.user = data;
        }

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }

    }

});