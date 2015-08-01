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
// ========= OTHERWISE ========= //
        $routeProvider.otherwise({
            redirectTo: '/'
        });
    }]);