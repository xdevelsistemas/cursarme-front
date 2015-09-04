angular.module('app',[
    'ngRoute',
    'ngResource',
    'ui.select',
    'ngSanitize',
    'ui.bootstrap',
    'ui.utils',
    'ui.utils.masks',
    'ngImgCrop',
    'common.values',
    'common.filters',
    'common.services',
    'common.directives',
    'app.values',
    'app.filters',
    'app.services',
    'app.directives',
    'app.controllers',
    'gridshore.c3js.chart',
    'ngProgress'

])
    .config(['$httpProvider', function($httpProvider) {
        $httpProvider.defaults.useXDomain = true;
        delete $httpProvider.defaults.headers.common['X-Requested-With'];
    }
    ])
    .config(['$routeProvider', function ($routeProvider) {
    // ========= HOME ========= //
            $routeProvider.when('/', {
                redirectTo: '/secretaria'
            });
    // ========= DASHBOARD SECRETARIA ========= //
            $routeProvider.when('/secretaria', {
                templateUrl: 'html/secretaria/secretaria.html',
                controller: 'secretaria',
                controllerAs: 'sec'
            });
    // ========= CONFIRMAR MATRICULA ========= //
            $routeProvider.when('/secretaria/confirmarMatricula', {
                templateUrl: 'html/secretaria/confirmar-matricula.html',
                controller: 'confMatricula',
                controllerAs: 'conf'
            });
    // ========= ALUNOS ========= //
            $routeProvider.when('/secretaria/aluno/:matricula', {
                templateUrl: 'html/secretaria/aluno.html',
                controller: 'aluno',
                controllerAs: 'al'
            });
    // ========= CONFIGURAÇÕES ========= //
            $routeProvider.when('/secretaria/configuracoes', {
                templateUrl: 'html/secretaria/configuracoes.html',
                controller: 'configuracoes',
                controllerAs: 'config'
            });
    // ========= RELATÓRIOS ========= //
            $routeProvider.when('/secretaria/relatorios', {
                templateUrl: 'html/secretaria/relatorios.html',
                controller: 'relatorios',
                controllerAs: 'rel'
            });
    // ========= RELATÓRIOS ========= //
            $routeProvider.when('/pedagogico', {
                templateUrl: 'html/secretaria/pedagogico.html',
                controller: 'pedagogico',
                controllerAs: 'ped'
            });
    // ========= PAUTA ========= //
            $routeProvider.when('/secretaria/pauta', {
                templateUrl: 'html/secretaria/pauta.html',
                controller: 'pauta',
                controllerAs: 'pt'
            });
    // ========= ADICIONAR CURSO ========= //
            $routeProvider.when('/secretaria/adicionar-curso', {
                templateUrl: 'html/secretaria/adicionar-curso.html',
                controller: 'adicionarCurso',
                controllerAs: 'ac'
            });
    // ========= ADICIONAR DISCIPLINA ========= //
            $routeProvider.when('/secretaria/adicionar-disciplina', {
                templateUrl: 'html/secretaria/adicionar-disciplina.html',
                controller: 'adicionarDisciplina',
                controllerAs: 'ad'
            });
    // ========= ENVIAR CIRCULAR ========= //
            $routeProvider.when('/secretaria/enviar-circular', {
                templateUrl: 'html/secretaria/enviar-circular.html',
                controller: 'enviarCircular',
                controllerAs: 'ec'
            });

    // ========= ENVIAR CIRCULAR ========= //
            $routeProvider.when('/secretaria/material-complementar', {
                templateUrl: 'html/secretaria/material-complementar.html',
                controller: 'materialComplementar',
                controllerAs: 'mc'
            });
    // ========= OTHERWISE ========= //
            $routeProvider.otherwise({
                redirectTo: '/'
            });
        }]);