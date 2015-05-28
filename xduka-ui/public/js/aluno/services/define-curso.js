(function () {
    'use strict';

    angular.module('app.services').factory('defineCurso', defineCurso);


    function defineCurso(){
        var curso = {
            getIdCurso: getIdCurso,
            setIdCurso: setIdCurso
        },
        idCurso = '';

        return curso;

        function getIdCurso() {
            return idCurso;
        }

        function setIdCurso(id) {
            idCurso = id;
        }
    }
})();