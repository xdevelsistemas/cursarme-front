(function() {
    'use strict';

    angular.module('common.services').factory('alunoService', function() {
        return {
            aluno: {},
            _origem: '',
            err: ''
        };
    });
})();