define([
    './__module__', 'jqueryUi', '../../common/models/strings', '../models/menu'
], function (controllers, $, modelStrings, modelMenu) {

    'use strict';

    controllers
        .controller('Main', Main);

    Main.$inject = ['$scope', '$resource', 'breadCrumb'];

    /* @ngInject */
    function Main($scope, $resource, breadCrumb) {
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

        /*vm.formats = ['dd/MM/yyyy', 'yyyy/MM/dd', 'dd.MM.yyyy', 'shortDate'];
        vm.format = vm.formats[0];

        vm.clear = function () {
            vm.dt = null;
        };

        // Disable weekend selection
        /!*vm.disabled = function(date, mode) {
            return ( mode === 'day' && ( date.getDay() === 0 || date.getDay() === 6 ) );
        };*!/

        vm.toggleMin = function() {
            vm.minDate = vm.minDate ? null : new Date();
        };
        vm.toggleMin();

        vm.open = function($event) {
            $event.preventDefault();
            $event.stopPropagation();

            vm.opened = true;
        };

        vm.dateOptions = {
            formatYear: 'yyyy',
            startingDay: 1
        };*/
    }
});