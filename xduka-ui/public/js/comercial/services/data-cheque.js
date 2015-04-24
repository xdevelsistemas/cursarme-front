define(['./__module__', 'jquery'], function (services, $) {
    'use strict';
    return services.factory('dataCheque', dataCheque);


    function dataCheque(){
        var data_cheque = {
                getData: getData,
                setData: setData,
                getDataFormat: getDataFormat,
                setDataFormat: setDataFormat
            },
            data = '',
            dataFormat = '';

        return data_cheque;

        function getData() {
            return data;
        }

        function getDataFormat() {
            return dataFormat;
        }

        function setDataFormat(a) {
            var dd = a.getDate(),
                mm = a.getMonth() + 1,
                yyyy = a.getFullYear();

            dataFormat = isDia(dd) + '/' + isMes(mm) + '/' + yyyy;

            function isDia(a){
                return  a<10 ? "0"+a : a;
            }

            function isMes(a){
                return a<10 ? "0"+a : a;
            }
        }

        function setData(a) {
            data = a;
        }
    }
});