(function () {
    'use strict';
    angular.module('common.directives').directive('xdInputDate', [
            function () {

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-input-date.html',
                    scope: {
                        //click: "=",
                        disable: '=',
                        //opened: "=",
                        params: '='
                        //dateOptions: "="
                    },
                    link: link
                };

                function link(scope, elem, attr) {
                    scope.opened = false;
                    elem.bind('click', function() {
                        scope.$apply(attr.xdInputDate);
                    });

                    scope.fnOpen = function($event) {
                        $event.preventDefault();
                        $event.stopPropagation();

                        scope.opened = true;
                    };
                    // ===Date picker ==//

                    scope.formats = ['dd/MM/yyyy', 'yyyy/MM/dd', 'dd.MM.yyyy', 'shortDate'];
                    scope.format = scope.formats[0];

                    scope.clear = function () {
                        scope.dt = null;
                    };

                    // Disable weekend selection
                    /*scope.disabled = function(date, mode) {
                     return ( mode === 'day' && ( date.getDay() === 0 || date.getDay() === 6 ) );
                     };*/

                    scope.toggleMin = function() {
                        scope.minDate = scope.minDate ? null : new Date();
                    };
                    scope.toggleMin();

                    scope.dateOptions = {
                        formatYear: 'yyyy',
                        startingDay: 1
                    };
                    scope.setMask = function(name){
                        $('#input_'+name).mask("99/99/9999",{completed:function(){
                            //if ((parseInt(this.val().substr(0,2)) > 31)||(parseInt(this.val().substr(3,2)) > 12)||(parseInt(this.val().substr(0,2)) == 0)||(parseInt(this.val().substr(3,2)) == 0)){
                            if (!isDate(this.val())){
                                $('#input_'+name)
                                    .removeAttr('checked')
                                    .removeAttr('selected');
                                scope.params.model.err = 'Data inválida!';

                            }else{
                                scope.params.model.err = ''
                            }
                        }});
                    };
                    function isDate(date){
                        return /^(0[1-9]|[12][0-9]|3[01])[\/](0[1-9]|1[012])[\/](19|20)\d\d$/gm.test(date)
                    }
                }

            }
        ]);
})();