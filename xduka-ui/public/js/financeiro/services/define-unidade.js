(function () {
    'use strict';

    angular.module('app.services').factory('defineUnidade', function (){
        var idUnidade = '';

        return  {
            getIdUnidade: getIdUnidade,
            setIdUnidade: setIdUnidade
        };

        function getIdUnidade() {
            return idUnidade;
        }

        function setIdUnidade(id) {
            idUnidade = id;
        }
    })
})();