(function () {
    //Menu
    'use strict';

    angular.module('app.values').value('modelMenu', {
        "list": [
            {
                "text": "Secretaria",
                "iconClass": "entypo-docs",
                "href": "#/secretaria"
            },
            {
                "text": "Confirmação de Matrícula",
                "iconClass": "entypo-docs",
                "href": "#/secretaria/confirmarMatricula"
            },
            {
                "text": "Alunos",
                "iconClass": "entypo-users",
                "href": "#/secretaria/alunos"
            }
        ]
    })
})();