angular.module('app',[
    'ngRoute',
    'ngResource',
    'ui.select',
    'ngSanitize',
    'ui.bootstrap',
    'ui.utils',
    'ui.utils.masks',
    'ui.grid',
    'ui.grid.resizeColumns',
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
                redirectTo: '/financeiro'
            });
    // ========= DASHBOARD FINANCEIRO ========= //
            $routeProvider.when('/financeiro', {
                templateUrl: 'html/financeiro.html',
                controller: 'dashboard',
                controllerAs: 'dash'
            });
    // ========= CONTROLE DE CHEQUES ========= //
            $routeProvider.when('/controle-cheques', {
                templateUrl: 'html/control-cheques.html',
                controller: 'controlCheques',
                controllerAs: 'cc'
            });
    // ========= ALUNO FINANCEIRO ========= //
            $routeProvider.when('/financeiro/aluno/:matricula', {
                templateUrl: 'html/aluno.html',
                controller: 'alunoFin',
                controllerAs: 'al'
            });
    // ========= ALUNO FINANCEIRO ========= //
            $routeProvider.when('/mensagem-boletos', {
                templateUrl: 'html/msg-boletos.html',
                controller: 'msgBoletos',
                controllerAs: 'mb'
            });
    // ========= VALORES CURSOS ========= //
            $routeProvider.when('/valores-cursos', {
                templateUrl: 'html/valores-cursos.html',
                controller: 'valoresCursos',
                controllerAs: 'vc'
            });
    // ========= CADASTRO DE CAIXA ========= //
            $routeProvider.when('/cadastro-caixa', {
                templateUrl: 'html/cadastro-caixa.html',
                controller: 'cadastroCaixa',
                controllerAs: 'cadc'
            });
    // ========= CAMPANHAS PROMOCIONAIS ========= //
            $routeProvider.when('/campanhas-promocionais', {
                templateUrl: 'html/campanhas-promocionais.html',
                controller: 'campanhasPromocionais',
                controllerAs: 'cp'
            });
    // ========= CONTRATO ========= //
            $routeProvider.when('/contrato', {
                templateUrl: 'html/contrato.html',
                controller: 'FormContrato',
                controllerAs: 'contr'
            });
    // ========= OTHERWISE ========= //
            $routeProvider.otherwise({
                redirectTo: '/'
            });
    }]);