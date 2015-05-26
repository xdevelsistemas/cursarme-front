(function () {

    'use strict';

    angular.module('app.controllers')
        .controller('xdCrop', xdCrop);

    xdCrop.$inject = ['$scope', 'breadCrumb', 'cropService'];

    /* @ngInject */
    function xdCrop($scope, breadCrumb, cropService) {
        /* jshint validthis: true */
        $scope.showModal = false;
        $scope.toggleModal = function(){
            $scope.showModal = !$scope.showModal;
        };

        var vm = this;

        vm.imgSv = cropService.imgTemp;

        breadCrumb.title = 'Cortar Imagem';

        vm.STR = modelStrings;
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

        vm.sendFoto = sendFoto;

        function sendFoto() {
            cropService.imgSalva = cropService.imgTemp;
            //window.open($scope.myCroppedImage, '_blank');
        };

        vm.atualizaImgTemp = atualizaImgTemp;

        function atualizaImgTemp() {
            vm.imgSv = cropService.imgTemp;
        };

        vm.clearInput = clearInput;
        function clearInput(id) {
            $(id).replaceWith( $(id).clone() );
        };




    }
})();