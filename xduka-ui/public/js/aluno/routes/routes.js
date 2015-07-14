(function () {
    angular.module('app',[
        'ngRoute',
        'ngResource',
        'ui.select',
        'ngSanitize',
        'ui.utils',
        'ui.bootstrap',
        'ngImgCrop',
        'common.values',
        'common.filters',
        'common.services',
        'common.directives',
        'app.filters',
        'app.services',
        'app.directives',
        'app.controllers'

    ]).config(['$routeProvider', function ($routeProvider) {

        //Home
        $routeProvider.when('/', {
            redirectTo: '/mensagens'
            //redirectTo: '/cursos'
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
    }]);
})();