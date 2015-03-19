define([
    './__module__',
    '../../common/models/strings',
    'jquery'
], function (controllers, modelStrings, $) {

    'use strict';

    controllers
        .controller('EditarPerfil', EditarPerfil);

    EditarPerfil.$inject = ['$scope', '$http', 'breadCrumb'];

    /* @ngInject */
    function EditarPerfil($scope, $http, breadCrumb) {
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

        $http.get('/api/aluno/editar-perfil')
            .success(function(data){
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
            .error(function(statusTexto){
                console.log("Erro!\n" + statusTexto)
            });

        vm.sendSenha = sendSenha;
        vm.sendInfo = sendInfo;
        vm.sendFoto = sendFoto;

        //vm.teste = validPassword;
        //////////////////////////////////////////////////////////////////////
        //
        //function validPassword(){
        //    if ((vm.password.confirm.val == "") || (vm.password.confirm.val != vm.password.new.val)) {
        //        vm.password.confirm.err = modelStrings.NOCONFER;
        //    }
        //}

        function isEmail(email){
            var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
            return regex.test(email);
        }

        function isPhone(phone){
            return phone.length == 10;
        }

        function isCel(cel){
            return cel.length == 11;
        }

        function sendInfo() {
            vm.info.email.err = "";
            vm.info.phone.err = "";
            vm.info.cel.err = "";

            if (isEmail(vm.info.email.val) && isPhone(vm.info.phone.val) && isCel(vm.info.cel.val)) {
                var dataInfo = {"info": vm.info},
                    promisse = $http.post('/api/aluno/editar-perfil', dataInfo);

                promisse
                    .then(function(){
                        vm.info.successMessage = modelStrings.SUCESSO;
                        vm.info.email.err = "";
                        vm.info.phone.err = "";
                        vm.info.cel.err = "";
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

            //console.log('>>>>>', vm.info);
            //$.extend(true, vm.info, {
            //    sharePic: {err: ''},
            //    email: {err: 'E-mail inválido!'},
            //    cel: {err: ''},
            //    phone: {err: ''}
            //});
            //return console.log('<<<<<', vm.info);
        }

        function sendFoto() {
            console.log($scope.myCroppedImage);
            //window.open($scope.myCroppedImage, '_blank');
        }

        function sendSenha() {
            //console.log('>>>>>', vm.password);
            //$.extend(true, vm.password, {
            //    current: {err: 'Senha Inválida!'},
            //    new: {err: 'A senha deve conter pelo menos 6 caracteres!'},
            //    confirm: {err: 'As novas senhas não batem!'}
            //});
            //return console.log('<<<<<', vm.password);

            var dataPw = {"password": vm.password},
                promisse = $http.post('/api/aluno/editar-perfil', dataPw);

            promisse
                .then(function(){
                    vm.password.successMessagePw = modelStrings.SUCESSO;
                })
                .catch(function(erro) {
                    console.log("Erro!" + erro.statusTexto);
                })
        }

    }

});