angular.module('app',[
    'ui.utils.masks',
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
    'app.values',
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