define([
    './__module__',
    '../../common/models/strings',
    '../../common/models/user',
    '../models/menu'
], function (controllers, modelStrings, modelUser, modelMenu) {

    'use strict';

    controllers
        .controller('Main', Main);

    Main.$inject = ['$scope', 'breadCrumb', 'cropService'];

    /* @ngInject */
    function Main($scope, breadCrumb, cropService) {
        /* jshint validthis: true */
        var vm = this;

        vm.breadCrumb = breadCrumb;

        vm.STR = modelStrings;
        vm.user = modelUser;
        vm.menu = modelMenu;

        vm.appName = 'xDuka';
        vm.area = 'Comercial';
        vm.lang = 'pt-br';
        vm.title = 'Página Principal';
        vm.section = '';

        vm.sendData = sendData;

        ////////////////

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        };

        vm.atualizaAvatar = atualizaAvatar;

        function atualizaAvatar(){
            vm.user.avatar.thumb = cropService.imgSalva;
        };

        vm.imgSalva = cropService.imgTemp;
        function attImg(){
            vm.imgSalva = cropService.imgTemp;
        }

    }

});