(function () {
    //Menu
    'use strict';

    angular.module('app.values').value('modelMenu', {
        "list": [
            {
                "text": "Dashboard",
                "iconClass": "entypo-gauge",
                "href": "#/financeiro"
            },
            {
                "text": "Controle de Cheques",
                "iconClass": "entypo-tag",
                "href": "#/controle-cheques"
            },
            {
                "text": "Mensagem para Boletos",
                "iconClass": "entypo-comment",
                "href": "#/mensagem-boletos"
            },
            {
                "text": "Valores dos Cursos",
                "iconClass": "glyphicon glyphicon-usd",
                "href": "#/valores-cursos"
            }
        ]
    })
})();