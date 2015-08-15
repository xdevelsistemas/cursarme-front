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
    'ngProgress'

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