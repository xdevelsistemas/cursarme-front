(function () {
    'use strict';
    angular.module('common.directives').directive('xdPanelCollapse', function () {


        function link(scope){

            if(angular.isUndefined(scope.id)){
                scope.id = 'panel_'+Math.round(Math.random()*1000);
            }

            // Panels
            $('body').on('click', '#collapse_'+scope.id, function(ev)
            {
                ev.preventDefault();

                var $this = $(this),
                    $panel = $this.closest('.panel'),
                    $body = $panel.children('.panel-body, .table'),
                    do_collapse = ! $panel.hasClass('panel-collapse');

                if($panel.is('[data-collapsed="1"]'))
                {
                    $panel.attr('data-collapsed', 0);
                    $body.hide();
                    do_collapse = false;
                }

                if(do_collapse)
                {
                    $body.slideUp('normal', fit_main_content_height);
                    $panel.addClass('panel-collapse');
                }
                else
                {
                    $body.slideDown('normal', fit_main_content_height);
                    $panel.removeClass('panel-collapse');
                }
            });

        }

        return {
            restrict: 'E',
            transclude: true,
            replace: true,
            templateUrl: '../../common/html/xd-painel-collapse.html',
            scope: {
                title: '='
            },
            link: link
        };


        function fit_main_content_height()
        {
            if(public_vars.$sidebarMenu.length && public_vars.$sidebarMenu.hasClass('fixed') == false)
            {
                public_vars.$sidebarMenu.css('min-height', '');
                public_vars.$mainContent.css('min-height', '');

                if(isxs())
                {
                    if(typeof reset_mail_container_height != 'undefined')
                        reset_mail_container_height();
                    return;

                    if(typeof fit_calendar_container_height != 'undefined')
                        reset_calendar_container_height();
                    return;
                }

                var sm_height  = public_vars.$sidebarMenu.outerHeight(),
                    mc_height  = public_vars.$mainContent.outerHeight(),
                    doc_height = $(document).height(),
                    win_height = $(window).height();

                if(win_height > doc_height)
                {
                    doc_height = win_height;
                }

                if(public_vars.$horizontalMenu.length > 0)
                {
                    var hm_height = public_vars.$horizontalMenu.outerHeight();

                    doc_height -= hm_height;
                    sm_height -= hm_height;
                }


                public_vars.$mainContent.css('min-height', doc_height);
                public_vars.$sidebarMenu.css('min-height', doc_height);
                public_vars.$chat.css('min-height', doc_height);

                if(typeof fit_mail_container_height != 'undefined')
                    fit_mail_container_height();

                if(typeof fit_calendar_container_height != 'undefined')
                    fit_calendar_container_height();
            }
        }


    });
})();