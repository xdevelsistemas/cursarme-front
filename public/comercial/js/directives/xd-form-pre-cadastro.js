(function () {
    'use strict';
    angular.module('app.directives').directive('xdFormPreCadastro', function () {

        function link() {
            // Form Wizard
            if($.isFunction($.fn.bootstrapWizard))
            {
                $(".form-wizard").each(function(i, el)
                {
                    var $this = $(el),
                        $progress = $this.find(".steps-progress div"),
                        _index = $this.find('> ul > li.active').index();

                    // Validation
                    var checkFormWizardValidaion = function(tab, navigation, index)
                    {
                        if($this.hasClass('validate'))
                        {
                            var $valid = $this.valid();

                            if( ! $valid)
                            {
                                $this.data('validator').focusInvalid();
                                return false;
                            }
                        }

                        return true;
                    };


                    $this.bootstrapWizard({
                        tabClass: "",
                        onTabShow: function($tab, $navigation, index)
                        {
                            setCurrentProgressTab($this, $navigation, $tab, $progress, index);
                        },

                        onNext: checkFormWizardValidaion,
                        onTabClick: checkFormWizardValidaion
                    });

                    $this.data('bootstrapWizard').show( _index );

                    $(window).on('neon.resize', function()
                    {
                        $this.data('bootstrapWizard').show( _index );
                    });
                });
            }
        }

        return {
            restrict: 'E',
            replace: true,
            templateUrl: 'html/xd-form-pre-cadastro.html',
            transclude: true,
            scope: {
                params: '='
            },
            link: link
        };
    });
})();