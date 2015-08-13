(function () {
    //Menu
    'use strict';

    angular.module('app.values').value('modelMenu', {
        "list": [
            {
                "text": "Dashboard",
                "iconClass": "entypo-docs",
                "href": "#/financeiro"
            },
            {
                "text": "Controle de Cheques",
                "iconClass": "entypo-docs",
                "href": "#/controle-cheques"
            }
        ]
    })
})();