(function () {

    'use strict';

    angular.module('app.controllers')
        .controller('Main', Main);

    Main.$inject = ['$scope', '$resource', '$timeout','$route','breadCrumb', 'defineCurso', 'cropService', 'modelStrings','modelMenu'];

    /* @ngInject */
    function Main($scope, $resource, $timeout, $route, breadCrumb, defineCurso, cropService, modelStrings, modelMenu) {
        /* jshint validthis: true */
        var vm = this
            , infoUserPromise = $resource('/api/aluno/infoUsuario').get().$promise;

        vm.breadCrumb = breadCrumb;

        vm.STR = modelStrings;
        vm.menu = modelMenu;

        vm.appName = 'xDuka';
        vm.area = 'Comercial';
        vm.lang = 'pt-br';
        vm.title = 'Página Principal';
        vm.section = '';

        vm.onChange = '';
        vm.sendCurso = sendCurso;
        vm.sendData = sendData;

        infoUserPromise.
            then(
                function (data) {
                    vm.user = data.usuario;
                    vm.cursos = data.cursos.cursos;
                    defineCurso.setIdCurso(vm.cursos.model.val);
                })
            .catch(
                function (erro) {
                    console.log("Erro:\n" + erro.data + "\n");
                }
            );

        ////////////////

        function sendCurso(item, model) {
            //var promise = $http.post('/api/aluno/curso-selecionado/:idCurso', {"idCurso": vm.curso.id});

            if( vm.onChange !== item ) {
                vm.onChange = item;
                defineCurso.setIdCurso(model);

                $timeout(function () {
                    $route.reload();
                }, 0); // 0 ms delay to reload the page.
            }
        }

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }

        vm.atualizaAvatar = atualizaAvatar;

        function atualizaAvatar(){
            var sendFotoPromise;
            vm.user.avatar.thumb = cropService.imgSalva;

            sendFotoPromise = $resource('api/aluno/send-foto').save({}, {"foto": vm.user.avatar.thumb}).$promise;
        }

        vm.imgSalva = cropService.imgTemp;
        function attImg(){
            vm.imgSalva = cropService.imgTemp;
        }

    }
})();