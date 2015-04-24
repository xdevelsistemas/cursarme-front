define([
    './__module__',
    'jqueryUi',
    '../../common/models/strings',
    '../models/menu'
], function (controllers, $, modelStrings, modelMenu) {

    'use strict';

    controllers
        .controller('Main', Main);

    Main.$inject = ['$scope', '$resource', 'breadCrumb', 'dataCheque'];

    /* @ngInject */
    function Main($scope, $resource, breadCrumb, dataCheque) {
        /* jshint validthis: true */
        var vm = this
            , infoUserPromise = $resource('/api/comercial/info-usuario').get().$promise;

        vm.breadCrumb = breadCrumb;

        vm.STR = modelStrings;
        vm.menu = modelMenu;

        vm.appName = 'xDuka';
        vm.area = 'Comercial';
        vm.lang = 'pt-br';
        vm.section = '';

        vm.sendData = sendData;

        infoUserPromise.
            then(
            function (data) {
                vm.user = data.usuario;
            })
            .catch(
            function (erro) {
                console.log("Erro:\n" + erro.data + "\n");
            }
        );


        ////////////////

        function sendData() {
            console.log('>>>>>', 'Enviou nada!');
        }

        // ===Date picker ==//

        $scope.formats = ['dd/MM/yyyy', 'yyyy/MM/dd', 'dd.MM.yyyy', 'shortDate'];
        $scope.format = $scope.formats[0];

        $scope.today = function() {
            $scope.dt = new Date();
            console.log($scope.dt);
            dataCheque.setData($scope.dt);
            dataCheque.setDataFormat($scope.dt);
        };
        $scope.today();

        $scope.clear = function () {
            $scope.dt = null;
        };

        // Disable weekend selection
        $scope.disabled = function(date, mode) {
            return ( mode === 'day' && ( date.getDay() === 0 || date.getDay() === 6 ) );
        };

        $scope.toggleMin = function() {
            $scope.minDate = $scope.minDate ? null : new Date();
        };
        $scope.toggleMin();

        $scope.open = function($event) {
            $event.preventDefault();
            $event.stopPropagation();

            $scope.opened = true;
        };

        $scope.dateOptions = {
            formatYear: 'yy',
            startingDay: 1
        };

        $scope.validaCpf = false;
    }
});