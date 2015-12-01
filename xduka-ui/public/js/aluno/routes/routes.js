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
            templateUrl: 'html/aluno/messages.html'
        });

        //Tarefas
        $routeProvider.when('/tarefas', {
            templateUrl: 'html/aluno/tasks.html'
        });

        //Notas
        $routeProvider.when('/notas', {
            templateUrl: 'html/aluno/notas.html'
        });

        //Parcelas
        $routeProvider.when('/parcelas', {
            templateUrl: 'html/aluno/parcelas.html'
        });

        //Horarios
        $routeProvider.when('/horarios', {
            templateUrl: 'html/aluno/horarios.html'
        });

        //conteudo
        $routeProvider.when('/conteudo', {
            templateUrl: 'html/aluno/conteudo.html'
        });

        //cursos
        $routeProvider.when('/cursos', {
            templateUrl: 'html/aluno/cursos.html'
        });

        //grade
        $routeProvider.when('/grade', {
            templateUrl: 'html/aluno/grade.html'
        });

        //aniversariantes
        $routeProvider.when('/aniversariantes', {
            templateUrl: 'html/aluno/aniversariantes.html'
        });

        //editar-perfil
        $routeProvider.when('/editar-perfil', {
            templateUrl: 'html/aluno/editar-perfil.html'
        });

        //Otherwise
        $routeProvider.otherwise({
            redirectTo: '/'
        });
    }])
})();


