(function() {
    'use strict';

    angular.module('common.services').factory('dataUser', function() {
        var name = "";

        return {
            getNameUser: getNameUser,
            setNameUser: setNameUser
        };

        function getNameUser() {
            return name;
        }

        function setNameUser(model) {
            name = model;
        }
    });
})();