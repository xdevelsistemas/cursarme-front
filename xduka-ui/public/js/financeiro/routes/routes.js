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
            redirectTo: '/financeiro'
        });
// ========= DASHBOARD FINANCEIRO ========= //
        $routeProvider.when('/financeiro', {
            templateUrl: 'html/financeiro/financeiro.html',
            controller: 'dashboard',
            controllerAs: 'dash'
        });
// ========= CONTROLE DE CHEQUES ========= //
        $routeProvider.when('/controle-cheques', {
            templateUrl: 'html/financeiro/control-cheques.html',
            controller: 'controlCheques',
            controllerAs: 'cc'
        });
// ========= ALUNO FINANCEIRO ========= //
        $routeProvider.when('/financeiro/aluno/:matricula', {
            templateUrl: 'html/financeiro/aluno.html',
            controller: 'alunoFin',
            controllerAs: 'al'
        });
// ========= OTHERWISE ========= //
        $routeProvider.otherwise({
            redirectTo: '/'
        });
    }]);