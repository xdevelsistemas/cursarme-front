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
    .config(['$httpProvider', function($httpProvider) {
        $httpProvider.defaults.useXDomain = true;
        delete $httpProvider.defaults.headers.common['X-Requested-With'];
    }
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
            // ========= CONTRATO ========= //
            $routeProvider.when('/contrato', {
                templateUrl: 'html/comercial/contrato.html',
                controller: 'FormContrato',
                controllerAs: 'contr'
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