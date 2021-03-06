angular.module('app',[
    'ngRoute',
    'ngResource',
    'ui.select',
    'ngSanitize',
    'ui.bootstrap',
    'ui.utils',
    'ui.utils.masks',
    'ui.grid',
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
                templateUrl: 'html/pre-cadastro.html',
                controller: 'FormPreCadastro',
                controllerAs: 'pre'
            });
    // ========= OTHERWISE ========= //
            $routeProvider.otherwise({
                redirectTo: '/'
            });
    }]);