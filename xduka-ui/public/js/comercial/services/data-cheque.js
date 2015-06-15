(function () {
    'use strict';

    angular.module('app.services').factory('dataCheque', dataCheque);

    function dataCheque(){
        var data = '';

        return {
            getData: getData,
            setData: setData
        };

        function getData() {
            return data;
        }

        function setData(a) {
            data = a;
        }
    }
})();