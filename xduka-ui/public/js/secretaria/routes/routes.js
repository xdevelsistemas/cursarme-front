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
    'gridshore.c3js.chart'

])

.config(['$routeProvider', function ($routeProvider) {
// ========= HOME ========= //
        $routeProvider.when('/', {
            redirectTo: '/secretaria'
        });
// ========= PRÉ CADASTRO ========= //
        $routeProvider.when('/secretaria', {
            templateUrl: 'html/secretaria/secretaria.html',
            controller: 'secretaria',
            controllerAs: 'sec'
        });
// ========= PRÉ CADASTRO ========= //
        $routeProvider.when('/secretaria/confirmarMatricula', {
            templateUrl: 'html/secretaria/confirmar-matricula.html',
            controller: 'confMatricula',
            controllerAs: 'conf'
        });
// ========= OTHERWISE ========= //
        $routeProvider.otherwise({
            redirectTo: '/'
        });
    }]);