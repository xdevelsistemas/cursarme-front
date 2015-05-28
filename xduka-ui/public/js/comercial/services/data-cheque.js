(function () {
    'use strict';
    angular.module('app.services').factory('dataCheque', dataCheque);


    function dataCheque(){
        var data_cheque = {
                getData: getData,
                setData: setData
            },
            data = '';

        return data_cheque;

        function getData() {
            return data;
        }

        function setData(a) {
            data = a;
        }
    }
})();