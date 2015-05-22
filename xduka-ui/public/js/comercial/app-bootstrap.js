/**
 * bootstraps angular onto the window.document node
 * NOTE: the ng-app attribute should not be on the index.html when using ng.bootstrap
 */
define(['require', 'angular', './app', './routes/routes'], function (require, angular) {
    'use strict';

    /*
     * place operations that need to initialize prior to app start here
     * using the `run` function on the top-level module
     */

    require(['domReady!'], function (document, $) {
        angular.bootstrap(document, ['app']);
        require([
            'neonApi',
            'neonChat',
            'neonCustom',
            'neonDemo'
        ]);
    });
});