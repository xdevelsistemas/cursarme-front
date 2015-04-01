define(['./__module__', 'jquery'], function (services, $) {
    'use strict';
    services.factory('defineCurso', defineCurso);

    function defineCurso($scope){
        $scope.idCurso = '';
        $scope.path = '';

        //TODO implementar o algoritmo de pesquisa por id do curso
    }
});