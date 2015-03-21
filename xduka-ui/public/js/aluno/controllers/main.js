define([
    './__module__',
    '../../common/models/strings',
    '../models/menu'
], function (controllers, modelStrings, modelMenu) {

    'use strict';

    controllers
        .controller('Main', Main);

    Main.$inject = ['$scope', '$http', 'breadCrumb'];

    /* @ngInject */
    function Main($scope, $http, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        vm.breadCrumb = breadCrumb;

        vm.STR = modelStrings;
        vm.menu = modelMenu;

        vm.appName = 'xDuka';
        vm.area = 'Aluno';
        vm.lang = 'pt-br';
        vm.title = 'Página Principal';
        vm.section = '';
        vm.sendData = sendData;

        //TODO passar $http para $resource
        //TODO colocar as requisições em promisse
        $http.get('/api/aluno/usuario')
            .success(getUsuario)
            .error(function(erro){
                console.log("Erro:\n" + erro + "\n");
            });

        $http.get('/api/aluno/cursos')
            .success(getCursos)
            .error(function(erro){
                console.log("Erro:\n" + erro + "\n");
            });

        ////////////////

        function getCursos(data){
            vm.cursos = data.cursos;
            //vm.curso = vm.cursos.value;
        }

        function getUsuario(data){
            vm.user = data;
        }

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }

    }

});