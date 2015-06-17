(function() {
    'use strict';

    angular.module('common.services').factory('tipoTelefone', function() {
        return {
            getMskPhone: getMaskPhone
        };

        function getMaskPhone(model) {
            return model == 'cel' ? '?(99) 9 9999-9999' : '?(99) 9999-9999';
        }
    });
})();