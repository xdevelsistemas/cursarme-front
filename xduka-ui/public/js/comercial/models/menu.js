(function () {
    //Menu
    'use strict';

    angular.module('app.values').value('modelMenu', {
        "list": [
            {
                "text": "Pré Cadastro",
                "iconClass": "entypo-docs",
                "href": "#/pre-cadastro"
            },
            {
                "text": "contrato",
                "iconClass": "entypo-newspaper",
                "href": "#/contrato"
            }
        ]
    })
})();