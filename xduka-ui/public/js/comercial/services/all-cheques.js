define(['./__module__', 'jquery'], function (services, $) {
    'use strict';
    return services.factory('allCheques', allCheques);


    function allCheques(){
        var all_cheques = {
                getAllCheques: getAllCheques,
                setAllCheques: setAllCheques
            },
            cheques = [];

        return all_cheques;

        function getAllCheques() {
            return cheques;
        }

        function setAllCheques(a) {
            return cheques = a;
        }
    }
});