(function () {
    angular.module('app',[
        'ngImgCrop',
        'ngProgress',
        'ngRoute',
        'ngResource',
        'ngSanitize',
        'ui.grid',
        'ui.select',
        'ui.utils',
        'ui.bootstrap',
        'common.values',
        'common.filters',
        'common.services',
        'common.directives',
        'app.filters',
        'app.services',
        'app.directives',
        'app.controllers'
    ])
    .config(['$httpProvider', function($httpProvider) {
        $httpProvider.defaults.useXDomain = true;
        delete $httpProvider.defaults.headers.common['X-Requested-With'];
    }
    ])
    .config(['$routeProvider', function ($routeProvider) {

        //Home
        $routeProvider.when('/', {
            redirectTo: '/mensagens'
        });

        //Mensagens
        $routeProvider.when('/mensagens', {
            templateUrl: 'html/messages.html'
        });

        //Tarefas
        $routeProvider.when('/tarefas', {
            templateUrl: 'html/tasks.html'
        });

        //Notas
        $routeProvider.when('/notas', {
            templateUrl: 'html/notas.html'
        });

        //Parcelas
        $routeProvider.when('/parcelas', {
            templateUrl: 'html/parcelas.html'
        });

        //Horarios
        $routeProvider.when('/horarios', {
            templateUrl: 'html/horarios.html'
        });

        //conteudo
        $routeProvider.when('/conteudo', {
            templateUrl: 'html/conteudo.html'
        });

        //cursos
        $routeProvider.when('/cursos', {
            templateUrl: 'html/cursos.html'
        });

        //grade
        $routeProvider.when('/grade', {
            templateUrl: 'html/grade.html'
        });

        //aniversariantes
        $routeProvider.when('/aniversariantes', {
            templateUrl: 'html/aniversariantes.html'
        });

        //editar-perfil
        $routeProvider.when('/editar-perfil', {
            templateUrl: 'html/editar-perfil.html'
        });

        //Otherwise
        $routeProvider.otherwise({
            redirectTo: '/'
        });
    }])
})();


