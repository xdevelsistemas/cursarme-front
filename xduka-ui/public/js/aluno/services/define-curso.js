(function () {
    'use strict';

    angular.module('app.services').factory('defineCurso', function (){
        var idCurso = '';

        return  {
            getIdCurso: getIdCurso,
            setIdCurso: setIdCurso
        };

        function getIdCurso() {
            return idCurso;
        }

        function setIdCurso(id) {
            idCurso = id;
        }
    })
})();