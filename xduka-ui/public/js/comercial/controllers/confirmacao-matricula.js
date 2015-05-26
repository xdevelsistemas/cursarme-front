define(['./__module__', "jquery", "jqueryMask"], function (controllers, $, jqueryMask) {
    'use strict';
    controllers.controller('confirmacaoMatricula', [
        '$scope', 'breadCrumb', '$timeout', '$modal', '$resource',
        function ($scope, breadCrumb, $timeout, $modal, $resource) {

            /* jshint validthis: true */
            breadCrumb.title = 'Confirmação de Matrícula';



        }
    ]);
});