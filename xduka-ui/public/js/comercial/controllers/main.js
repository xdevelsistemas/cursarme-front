define([
    './__module__',
    '../../common/models/strings',
    '../../common/models/user',
    '../models/menu'
], function (controllers, modelStrings, modelUser, modelMenu) {

    'use strict';

    controllers
        .controller('Main', Main);

    Main.$inject = ['$scope', 'breadCrumb'];

    /* @ngInject */
    function Main($scope, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        vm.breadCrumb = breadCrumb;

        vm.STR = modelStrings;
        vm.user = modelUser;
        vm.menu = modelMenu;

        vm.appName = 'xDuka';
        vm.area = 'Comercial';
        vm.lang = 'pt-br';
        vm.section = '';

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }

    }

});