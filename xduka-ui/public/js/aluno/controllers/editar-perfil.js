define([
    './__module__',
    '../../common/models/strings',
    'jquery'
], function (controllers, modelStrings, $) {

    'use strict';

    controllers
        .controller('EditarPerfil', EditarPerfil);

    EditarPerfil.$inject = ['$scope', '$resource', 'breadCrumb'];

    /* @ngInject */
    function EditarPerfil($scope, $resource, breadCrumb) {
        /* jshint validthis: true */
        var vm = this
            , perfilPromise = $resource('/api/aluno/editar-perfil').get().$promise;

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

        perfilPromise
            .then(function(data){
                vm.password = {
                    current: {val: ''},
                    new: {val: ''},
                    confirm: {val: ''}
                };
                vm.info = {
                    sharePic: {val: data.compartilharAniversario},
                    email: {val: data.email},
                    cel: {val: data.telefoneCelular},
                    phone: {val: data.telefoneResidencial}
                };
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

        //TODO tratar os dados e enviar via promise tambem

        function sendInfo() {
            if (isEmail(vm.info.email.val) && isPhone(vm.info.phone.val) && isCel(vm.info.cel.val)) {
                //TODO reajustar e inserir a service 'User' criada
                var dataInfo = {"info": vm.info},
                    promisse = $resource('/api/aluno/editar-perfil', dataInfo).save().$promise;

                vm.info.email.err = "";
                vm.info.phone.err = "";
                vm.info.cel.err = "";

                promisse
                    .then(function(){
                        vm.info.successMessage = vm.STR.SUCESSO;
                    })
                    .catch(function(erro) {
                        console.log("Erro!" + erro.statusTexto);
                    });
            }else{
                if (!isEmail(vm.info.email.val)) {
                    vm.info.email.err = vm.STR.NOEMAIL;
                }
                if (!isPhone(vm.info.phone.val)) {
                    vm.info.phone.err = vm.STR.NOPHONE;
                }
                if (!isCel(vm.info.cel.val)) {
                    vm.info.cel.err = vm.STR.NOCEL;
                }
            }
        }

        function sendFoto() {
            console.log($scope.myCroppedImage);
            //window.open($scope.myCroppedImage, '_blank');
        }

        function sendSenha() {
            if (isConfPw(vm.password.new.val, vm.password.confirm.val)) {
                var dataPw = {"password": vm.password},
                    promisse = $resource('/api/aluno/editar-perfil', dataPw).save().$promise;

                vm.password.current.err = "";
                vm.password.new.err = "";
                vm.password.confirm.err = "";

                promisse
                    .then(function () {
                        vm.password.successMessagePw = vm.STR.SUCESSO;
                    })
                    .catch(function (erro) {
                        console.log("Erro!" + erro.statusTexto);
                    });
            }else{
                vm.password.confirm.err = vm.STR.NOCONFER;
                vm.password.successMessagePw = "";
            }
        }
    }

});