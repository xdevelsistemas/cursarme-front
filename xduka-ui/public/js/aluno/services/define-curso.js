define(['./__module__', 'jquery'], function (services, $) {
    'use strict';

    return services.factory('defineCurso', defineCurso);


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
});