
angular.module('app', ['ngRoute', 'ngResource'])
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