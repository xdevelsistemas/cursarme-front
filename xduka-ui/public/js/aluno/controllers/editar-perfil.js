(function () {

    'use strict';

    angular.module('app.controllers')
        .controller('EditarPerfil', EditarPerfil);

    EditarPerfil.$inject = ['$scope', '$resource', 'breadCrumb', 'cropService', '$modal', 'modelStrings'];

    /* @ngInject */
    function EditarPerfil($scope, $resource, breadCrumb, cropService, $modal, modelStrings) {
        /* jshint validthis: true */
        var vm = this
            , perfilPromise = $resource('/api/aluno/editar-perfil').get().$promise;
        
        $scope.showModal = false;
        $scope.toggleModal = function(){
            $scope.showModal = !$scope.showModal;
        };


        vm.STR = modelStrings;
        breadCrumb.title = vm.STR.EDITAPERFIL;

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

        perfilPromise
            .then(function(data){
                vm.info = data.info;
                vm.password = data.password;
            })
            .catch(function(statusTexto){
                console.log("Erro!\n" + statusTexto)
            });

        vm.sendSenha = sendSenha;
        vm.sendInfo = sendInfo;
        vm.sendFoto = sendFoto;


/////////////  FUNCTIONS  /////////////

        function sendInfo() {
            var SendInfoPromise = $resource('/api/aluno/editar-perfil-info').save({}, {"info": vm.info, "STR": vm.STR}).$promise;

            SendInfoPromise
                .then(function(data){
                    $.extend(true, vm.info, data);
                })
                .catch(function(erro) {
                    console.log(erro);
                });
        }

        function sendFoto() {
            console.log($scope.myCroppedImage);
            $scope.imgSalva = $scope.myCroppedImage;
            console.log($scope.imgSalva);

            var SendFotoPromise = $resource('/api/aluno/editar-perfil-foto').save({}, {"foto": cropService.imgTemp}).$promise;

            SendFotoPromise
                .then(function (data) {
                    console.log(data);
                    //window.open(data.foto.foto);
                })
                .catch(function(erro) {
                    console.log(erro);
                });
            //window.open($scope.myCroppedImage, '_blank');
        }

        vm.tempFoto = tempFoto;

        function tempFoto() {
            cropService.imgTemp = $scope.myCroppedImage;
            vm.imgSv = cropService.imgTemp;
        }


        function sendSenha() {
            var sendSenhaPromise = $resource('/api/aluno/editar-perfil-senha').save({}, {"password": vm.password, "STR": vm.STR}).$promise;

            sendSenhaPromise
                .then(function (data) {
                    $.extend(true, vm.password, data);
                })
                .catch(function (erro) {
                    console.log("Erro!" + erro);
                });
        }
    }

})();
