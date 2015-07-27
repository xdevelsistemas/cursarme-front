(function () {
    'use strict';

    angular.module('app.services')
        .factory('serviceMessages', ['$resource', function ($resource) {
            return $resource('/api/aluno/mensagens/:id',{},
                {getById: {method: 'GET', params: {id: '@id'}}});
        }
    ])
})();