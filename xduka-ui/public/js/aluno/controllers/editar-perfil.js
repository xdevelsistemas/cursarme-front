define([
    './__module__',
    '../../common/models/strings',
    'jquery'
], function (controllers, modelStrings, $) {

    'use strict';

    controllers
        .controller('EditarPerfil', EditarPerfil);

    EditarPerfil.$inject = ['$scope', 'breadCrumb'];

    /* @ngInject */
    function EditarPerfil($scope, breadCrumb) {
        /* jshint validthis: true */
        var vm = this;

        breadCrumb.title = 'Editar Perfil';

        vm.STR = modelStrings;

        $scope.myImage = '';
        $scope.myCroppedImage = '';

        vm.showCropArea = false;

        var handleFileSelect = function (evt) {
            vm.showCropArea = true;
            var file = evt.currentTarget.files[0];
            var reader = new FileReader();
            reader.onload = function (evt) {
                $scope.$apply(function ($scope) {
                    $scope.myImage = evt.target.result;
                });
            };
            reader.readAsDataURL(file);
        };

        angular.element(document.querySelector('#fileInput')).on('change', handleFileSelect);

        vm.password = {
            current: {val: ''},
            new: {val: ''},
            confirm: {val: ''}
        };
        vm.info = {
            sharePic: {val: true},
            email: {val: ''},
            cel: {val: ''},
            phone: {val: ''}
        };

        vm.sendSenha = sendSenha;
        vm.sendInfo = sendInfo;
        vm.sendFoto = sendFoto;

        ////////////////

        function sendSenha() {
            console.log('>>>>>', vm.password);
            $.extend(true, vm.password, {
                current: {err: 'Senha Inválida!'},
                new: {err: 'A senha deve conter pelo menos 6 caracteres!'},
                confirm: {err: 'As novas senhas não batem!'}
            });
            return console.log('<<<<<', vm.password);
        }

        function sendInfo() {
            console.log('>>>>>', vm.info);
            $.extend(true, vm.info, {
                sharePic: {err: ''},
                email: {err: 'E-mail inválido!'},
                cel: {err: ''},
                phone: {err: ''}
            });
            return console.log('<<<<<', vm.info);
        }

        function sendFoto() {
            console.log($scope.myCroppedImage);
            //window.open($scope.myCroppedImage, '_blank');
        };

    }

});