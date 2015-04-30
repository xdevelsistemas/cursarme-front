define([
    './__module__',
    '../../common/models/strings',
    '../models/menu'
], function (controllers, modelStrings, modelMenu) {

    'use strict';

    controllers
        .controller('Main', Main);

    Main.$inject = ['$scope', '$resource', 'breadCrumb'];

    /* @ngInject */
    function Main($scope, $resource, breadCrumb) {
        /* jshint validthis: true */
        var vm = this
            , infoUserPromise = $resource('/api/comercial/info-usuario').get().$promise;

        console.log("I'm here(comercial)");

        vm.breadCrumb = breadCrumb;

        vm.STR = modelStrings;
        vm.menu = modelMenu;

        vm.appName = 'xDuka';
        vm.area = 'Comercial';
        vm.lang = 'pt-br';
        vm.section = '';

        vm.sendData = sendData;

        infoUserPromise.
            then(
            function (data) {
                vm.user = data.usuario;
                vm.cursos = data.cursos.cursos;
                //defineCurso.setIdCurso(vm.cursos.value);
            })
            .catch(
            function (erro) {
                console.log("Erro:\n" + erro.data + "\n");
            }
        );


        ////////////////

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }



    }
});