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
            , userPromise = $resource('/api/aluno/usuario').get().$promise
            , cursosPromise = $resource('/api/aluno/cursos').get().$promise;

        vm.breadCrumb = breadCrumb;

        vm.STR = modelStrings;
        vm.menu = modelMenu;

        vm.appName = 'xDuka';
        vm.area = 'Aluno';
        vm.lang = 'pt-br';
        vm.title = 'Página Principal';
        vm.section = '';

        vm.onChange = '';
        vm.sendCurso = sendCurso;
        vm.sendData = sendData;

        //TODO passar $http para $resource
        //TODO colocar as requisições em promisse

        userPromise.
            then(
                function (data) {
                    vm.user = data;
                })
            .catch(
                function (erro) {
                    console.log("Erro:\n" + erro + "\n");
                }
            );

        cursosPromise
            .then(
                function (data) {
                    vm.cursos = data.cursos;
                    //vm.curso = vm.cursos.value;
                })
            .catch(function (erro) {
                    console.log("Erro:\n" + erro + "\n");
                }
            );

        ////////////////

        function sendCurso(item, model) {
            //var promise = $http.post('/api/aluno/curso-selecionado/:idCurso', {"idCurso": vm.curso.id});

            if( vm.onChange !== item ) {
                console.log(item.id + " - " + item.text);
                vm.onChange = item;
            }
        }

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }

    }

});