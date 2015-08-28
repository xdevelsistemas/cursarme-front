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
                "text": "Relatórios",
                "iconClass": "entypo-chart-bar",
                "href": "#/secretaria/relatorios"
            },
            {
                "text": "Configurações",
                "iconClass": "entypo-cog",
                "href": "#/secretaria/configuracoes"
            }
        ],
        "listLevels": [
            {
                "text": "Pedagógico",
                "iconClass": "entypo-book-open",
                "levels": [
                    {
                        "text": "Pauta",
                        "iconClass": "entypo-clipboard",
                        "href": "#/secretaria/pauta"
                    }
                ]
            }
        ]
    })
})();