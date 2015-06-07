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

        function isCel(cel){
            return cel.length == 11;
        }

        function isConfPw(newPw, confPw){
            return newPw == confPw;
        }

        function isEmail(email){
            var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
            return regex.test(email);
        }

        function isPhone(phone){
            return phone.length == 10;
        }

        function sendInfo() {
            console.log(vm.info);
            //// Limpa os dados referente aos maios de contato do ususario
            vm.info.email.err = "";
            vm.info.phone.err = "";
            vm.info.cel.err = "";

            //// verifica se os campos sao validos e se os campo não estão vazios
            if (isEmail(vm.info.email.model.val) && isPhone(vm.info.phone.model.val) && isCel(vm.info.cel.model.val) &&
                (vm.info.email.model.val && vm.info.phone.model.val && vm.info.cel.model.val)) {

                var dataInfo = {"info": vm.info},
                    SendInfoPromise = $resource('/api/aluno/editar-perfil').save({}, dataInfo).$promise;

                SendInfoPromise
                    .then(function(data){
                        vm.info.successMessage = vm.STR.SUCESSO;
                        console.log(data.status);
                    })
                    .catch(function(erro) {
                        console.log("Erro!\n" + erro.statusText + "\n");
                    });
            }else{
                //// Verifica se os campo não estão vazios
                if (!vm.info.email.model.val || !vm.info.phone.model.val || !vm.info.cel.model.val) {
                    if (!isEmail(vm.info.email.model.val)) {
                        vm.info.email.err = vm.STR.REQUIRIDO;
                    }else{
                        vm.info.email.err = '';
                    }
                    if (!isPhone(vm.info.phone.model.val)) {
                        vm.info.phone.err = vm.STR.REQUIRIDO;
                    }else{
                        vm.info.phone.err = '';
                    }
                    if (!isCel(vm.info.cel.model.val)) {
                        vm.info.cel.err = vm.STR.REQUIRIDO;
                    }else{
                        vm.info.cel.err = '';
                    }
                }else{
                    //// Verifica se os campos nao sao validos
                    if (!isEmail(vm.info.email.model.val)) {
                        vm.info.email.err = vm.STR.NOEMAIL;
                    }
                    if (!isPhone(vm.info.phone.model.val)) {
                        vm.info.phone.err = vm.STR.NOPHONE;
                    }
                    if (!isCel(vm.info.cel.model.val)) {
                        vm.info.cel.err = vm.STR.NOCEL;
                    }
                }
                vm.info.successMessage = "";
            }
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
            if (isConfPw(vm.password.new.model.val, vm.password.confirm.model.val) && (vm.password.current.model.val && vm.password.new.model.val && vm.password.confirm.model.val)) {
                var dataPw = {"password": vm.password},
                    sendSenhaPromise = $resource('/api/aluno/editar-perfil').save({}, dataPw).$promise;

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
                if (!vm.password.current.model.val || !vm.password.new.model.val || !vm.password.confirm.model.val) {
                    if (!vm.password.current.model.val) {
                        vm.password.current.err = vm.STR.REQUIRIDO;
                    }else{
                        vm.password.current.err = '';
                    }
                    if (!vm.password.new.model.val) {
                        vm.password.new.err = vm.STR.REQUIRIDO;
                    }else{
                        vm.password.new.err = '';
                    }
                    if (!vm.password.confirm.model.val) {
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
