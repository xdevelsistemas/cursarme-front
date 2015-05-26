angular.module('app',[
    'ngRoute',
    'ngResource',
    'ui.bootstrap',
    'common.value',
    'common.services',
    'common.directives',
    'app.filters',
    'app.services',
    'app.directives',
    'app.controllers'

])

.config(['$routeProvider', function ($routeProvider) {
// ========= HOME ========= //
        $routeProvider.when('/', {
            redirectTo: '/pre-cadastro'
        });
// ========= PRÉ CADASTRO ========= //
        $routeProvider.when('/pre-cadastro', {
            templateUrl: 'html/comercial/pre-cadastro.html',
            controller: 'FormPreCadastro',
            controllerAs: 'pre'
        });
// ========= FORMS EXAMPLE ========= //
        $routeProvider.when('/forms-example', {
            templateUrl: 'html/forms-example.html',
            controller: 'formsExample'
        });
// ========= OTHERWISE ========= //
        $routeProvider.otherwise({
            redirectTo: '/'
        });
    }]);

/*
*
 'jquery', 'angular', 'angular-bootstrap', 'angular-route', 'angular-resource',
 'angular-sanitize', 'angular-ui-utils', 'angular-ui-select', 'animate.css',
 'bootstrap', 'entypo', 'font-awesome', 'jquery', 'jquery-maskedinput',
 'jquery-ui', 'select2', 'ngImgCrop', 'angular-input-masks',
 'underscore', 'ngRoute', 'ngResource', ''
 */