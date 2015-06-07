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
            var dadosInfo = {"info": vm.info},
                SendInfoPromise = $resource('/api/aluno/editar-perfil-info').save({}, dadosInfo).$promise;

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
            //window.open($scope.myCroppedImage, '_blank');
        }

        vm.tempFoto = tempFoto;

        function tempFoto() {
            cropService.imgTemp = $scope.myCroppedImage;
            vm.imgSv = cropService.imgTemp;
        }



        function sendSenha() {
            //// Limpa as mensagens de erros referente as senhas
            vm.password.current.err = "";
            vm.password.new.err = "";
            vm.password.confirm.err = "";

            //// Verifica se as novas senhas batem e se não estão vazios
            if (isConfPw(vm.password.new.val, vm.password.confirm.val) && (vm.password.current.val && vm.password.new.val && vm.password.confirm.val)) {
                var sendSenhaPromise = $resource('/api/aluno/editar-perfil-senha').save({}, {"password": vm.password}).$promise;

                sendSenhaPromise
                    .then(function (data) {
                        vm.password.successMessagePw = vm.STR.SUCESSO;
                        console.log(data.status);
                    })
                    .catch(function (erro) {
                        console.log("Erro!" + erro.statusTexto);
                    });
            }else{
                //// Verifica se os campos estao vazios
                if (!vm.password.current.val || !vm.password.new.val || !vm.password.confirm.val) {
                    if (!vm.password.current.val) {
                        vm.password.current.err = vm.STR.REQUIRIDO;
                    }else{
                        vm.password.current.err = '';
                    }
                    if (!vm.password.new.val) {
                        vm.password.new.err = vm.STR.REQUIRIDO;
                    }else{
                        vm.password.new.err = '';
                    }
                    if (!vm.password.confirm.val) {
                        vm.password.confirm.err = vm.STR.REQUIRIDO;
                    }else{
                        vm.password.confirm.err = '';
                    }
                }else{
                    vm.password.confirm.err = vm.STR.NOCONFER;
                }
                vm.password.successMessagePw = "";
            }
        }
    }

})();
