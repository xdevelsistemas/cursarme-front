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
    'gridshore.c3js.chart',
    'ngProgress',
    'angularFileUpload'
])
    .config(['$httpProvider', function($httpProvider) {
        $httpProvider.defaults.useXDomain = true;
        delete $httpProvider.defaults.headers.common['X-Requested-With'];
    }
    ])
    .config(['$routeProvider', function ($routeProvider) {
    // ========= HOME ========= //
            $routeProvider.when('/', {
                redirectTo: '/secretaria'
            });
    // ========= DASHBOARD SECRETARIA ========= //
            $routeProvider.when('/secretaria', {
                templateUrl: 'html/secretaria.html',
                controller: 'secretaria',
                controllerAs: 'sec'
            });
    // ========= CONFIRMAR MATRICULA ========= //
            $routeProvider.when('/secretaria/confirmarMatricula', {
                templateUrl: 'html/confirmar-matricula.html',
                controller: 'confMatricula',
                controllerAs: 'conf'
            });
    // ========= ALUNOS ========= //
            $routeProvider.when('/secretaria/aluno/:matricula', {
                templateUrl: 'html/aluno.html',
                controller: 'aluno',
                controllerAs: 'al'
            });
    // ========= CONFIGURAÇÕES ========= //
            $routeProvider.when('/secretaria/configuracoes', {
                templateUrl: 'html/configuracoes.html',
                controller: 'configuracoes',
                controllerAs: 'config'
            });
    // ========= RELATÓRIOS ========= //
            $routeProvider.when('/secretaria/relatorios', {
                templateUrl: 'html/relatorios.html',
                controller: 'relatorios',
                controllerAs: 'rel'
            });
    // ========= RELATÓRIOS ========= //
            $routeProvider.when('/pedagogico', {
                templateUrl: 'html/pedagogico.html',
                controller: 'pedagogico',
                controllerAs: 'ped'
            });
    // ========= PAUTA ========= //
            $routeProvider.when('/secretaria/pauta', {
                templateUrl: 'html/pauta.html',
                controller: 'pauta',
                controllerAs: 'pt'
            });
    // ========= ADICIONAR CURSO ========= //
            $routeProvider.when('/secretaria/adicionar-curso', {
                templateUrl: 'html/adicionar-curso.html',
                controller: 'adicionarCurso',
                controllerAs: 'ac'
            });
    // ========= ADICIONAR DISCIPLINA ========= //
            $routeProvider.when('/secretaria/adicionar-disciplina', {
                templateUrl: 'html/adicionar-disciplina.html',
                controller: 'adicionarDisciplina',
                controllerAs: 'ad'
            });

    // ========= ADICIONAR TURMA ========= //
            $routeProvider.when('/secretaria/adicionar-turma', {
                templateUrl: 'html/adicionar-turma.html',
                controller: 'adicionarTurma',
                controllerAs: 'at'
            });
    // ========= ENVIAR CIRCULAR ========= //
            $routeProvider.when('/secretaria/enviar-circular', {
                templateUrl: 'html/enviar-circular.html',
                controller: 'enviarCircular',
                controllerAs: 'ec'
            });

    // ========= MATERIAL COMPLEMENTAR ========= //
            $routeProvider.when('/secretaria/material-complementar', {
                templateUrl: 'html/material-complementar.html',
                controller: 'materialComplementar',
                controllerAs: 'mc'
            });

    // ========= AULAS DADAS ========= //
            $routeProvider.when('/secretaria/aulas-dadas', {
                templateUrl: 'html/aulas-dadas.html',
                controller: 'aulasDadas',
                controllerAs: 'aud'
            });

    // ========= GRADE CURRICULAR ========= //
            $routeProvider.when('/secretaria/grade-curricular', {
                templateUrl: 'html/grade-curricular.html',
                controller: 'gradeCurricular',
                controllerAs: 'gc'
            });
    // ========= OTHERWISE ========= //
            $routeProvider.otherwise({
                redirectTo: '/'
            });
        }]);