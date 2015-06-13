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
                        if (date.length == 10){
                            return /^(?:(?:31(\/|-|\.)(?:0?[13578]|1[02]))\1|(?:(?:29|30)(\/|-|\.)(?:0?[1,3-9]|1[0-2])\2))(?:(?:1[6-9]|[2-9]\d)?\d{2})$|^(?:29(\/|-|\.)0?2\3(?:(?:(?:1[6-9]|[2-9]\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\d|2[0-8])(\/|-|\.)(?:(?:0?[1-9])|(?:1[0-2]))\4(?:(?:1[6-9]|[2-9]\d)?\d{2})$/gm.test(date)
                        }else{
                            return false
                        }
                    }
                }

            }
        ]);
})();