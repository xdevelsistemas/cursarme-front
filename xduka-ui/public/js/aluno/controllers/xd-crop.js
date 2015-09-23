(function () {

    'use strict';

    angular.module('app.controllers')
        .controller('xdCrop', xdCrop);

    xdCrop.$inject = ['$scope', 'breadCrumb', 'cropService', 'modelStrings'];

    /* @ngInject */
    function xdCrop($scope, breadCrumb, cropService, modelStrings) {
        /* jshint validthis: true */
        $scope.showModal = false;
        $scope.toggleModal = function(){
            $scope.showModal = !$scope.showModal;
        };

        var vm = this;

        vm.imgSv = cropService.imgTemp;

        vm.STR = modelStrings;
        breadCrumb.title = vm.STR.CORTAIMG;

        $scope.myImage = '';
        $scope.myCroppedImage = '';

        $scope.svImgCropped = '';
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

        vm.atualizaImgTemp = atualizaImgTemp;
        vm.clearInput = clearInput;
        vm.sendFoto = sendFoto;

        function atualizaImgTemp() {
            vm.imgSv = cropService.imgTemp;
        }

        function clearInput(id) {
            $(id).replaceWith( $(id).clone() );
        }

        function sendFoto() {
            //window.open($scope.myCroppedImage, '_blank');
            cropService.imgSalva = cropService.imgTemp;
        }
    }
})();