(function () {

    'use strict';

    angular.module('app.controllers')
        .controller('Main', Main);

    Main.$inject = ['$scope', '$resource', '$timeout','$route','breadCrumb', 'defineCurso', 'cropService', 'modelStrings','modelMenu','ngProgressFactory'];

    /* @ngInject */
    function Main($scope, $resource, $timeout, $route, breadCrumb, defineCurso, cropService, modelStrings, modelMenu, ngProgressFactory) {

        /* PROGRESS BAR */
        $scope.progressbar = ngProgressFactory.createInstance();
        $scope.progressbar.setColor('#45A0CF');
        $scope.progressbar.start();

        /* jshint validthis: true */
        var vm = this,
            infoUserPromise = $resource('/api/aluno/infoUsuario').get().$promise,
            infoCursoPromise = $resource('/api/aluno/infoCurso').get().$promise;

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

        infoCursoPromise.
            then(
            function (data) {
                vm.cursos = data.cursos;
                defineCurso.setIdCurso(vm.cursos.model.val);
                $scope.progressbar.complete();
            })
            .catch(
            function (erro) {
                console.log("Erro:\n" + erro.data + "\n");
            }
        );

        infoUserPromise.
            then(
                function (data) {
                    vm.user = data;
                })
            .catch(
                function (erro) {
                    console.log("Erro:\n" + erro.data + "\n");
                }
            );

        ////////////////

        function sendCurso(item, model) {
            //var promise = $http.post('/api/aluno/curso-selecionado/:idCurso', {"idCurso": vm.curso.id});

            if( vm.onChange != item ) {
                vm.onChange = item;
                defineCurso.setIdCurso(model);

                $timeout(function () {
                    $route.reload();
                }, 0); // 0 ms de delay para recarregar a página.
            }
        }

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }

        vm.atualizaAvatar = atualizaAvatar;

        function atualizaAvatar(){
            var sendFotoPromise;
            vm.user.avatar.thumb = cropService.imgSalva;

            //sendFotoPromise = $resource('api/aluno/send-foto').save({}, {"foto": vm.user.avatar.thumb}).$promise;
        }

        vm.imgSalva = cropService.imgTemp;
        function attImg(){
            vm.imgSalva = cropService.imgTemp;
        }

        vm.menuAction = function(){
            if (!$('.sidebar-menu').attr('style')){
                $('.sidebar-mobile-menu.visible-xs>.with-animation').click()
            }
        };

    }
})();