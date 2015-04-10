define([
    './__module__',
    '../../common/models/strings',
    '../models/editar-perfil',
    'jquery'
], function (controllers, modelStrings, modelEditarPerfil, $) {

    'use strict';

    controllers
        .controller('EditarPerfil', EditarPerfil);

    EditarPerfil.$inject = ['$scope', 'breadCrumb', 'cropService'];

    /* @ngInject */
    function EditarPerfil($scope, breadCrumb, cropService) {
        /* jshint validthis: true */
        $scope.showModal = false;
        $scope.toggleModal = function(){
            $scope.showModal = !$scope.showModal;
        };

        var vm = this;

        breadCrumb.title = 'Editar Perfil';

        vm.STR = modelStrings;

        $scope.myImage = '';
        $scope.myCroppedImage = '';

        vm.showCropArea = false;
        vm.showCroppedArea = false;


        var handleFileSelect = function (evt) {
            vm.showCropArea = true;
            vm.showCroppedArea = true;
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
            $scope.imgSalva = $scope.myCroppedImage;
            console.log($scope.imgSalva);
            //window.open($scope.myCroppedImage, '_blank');
        }

        vm.tempFoto = tempFoto;

        function tempFoto() {
            cropService.imgTemp = $scope.myCroppedImage;
            vm.imgSv = cropService.imgTemp;
        }





    }

});