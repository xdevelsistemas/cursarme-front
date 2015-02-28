define([], function () {

    var config = {
        paths: {
            'domReady': '../../lib/requirejs-domready/domReady',
            'jquery': '../../lib/jquery/dist/jquery',
            'jqueryUi': '../../lib/jquery-ui/jquery-ui',
            'jqueryMaskedinput': '../../lib/jquery-maskedinput/dist/jquery.maskedinput',
            'bootstrap': '../../lib/bootstrap/dist/js/bootstrap',
            'select2': '../../lib/select2/select2',
            'select2localePtBR': '../../lib/select2/select2_locale_pt-BR',
            'angular': '../../lib/angular/angular',
            'angularRoute': '../../lib/angular-route/angular-route',
            'angularSanitize': '../../lib/angular-sanitize/angular-sanitize',
            "uiUtils": '../../lib/angular-ui-utils/ui-utils',
            "uiSelect": '../../lib/angular-ui-select/dist/select',
            'uiBootstrap': '../../lib/angular-bootstrap/ui-bootstrap-tpls',
            'ngImgCrop': '../../lib/ngImgCrop/compile/unminified/ng-img-crop',
            //NEON
            'gsap': '../../assets/neon/js/gsap/main-gsap',
            'resizeable': '../../assets/neon/js/resizeable',
            'joinable': '../../assets/neon/js/joinable',
            'neonApi': '../../assets/neon/js/neon-api',
            'neonChat': '../../assets/neon/js/neon-chat',
            'neonCustom': '../../assets/neon/js/neon-custom',
            'neonDemo': '../../assets/neon/js/neon-demo'
        },
        shim: {
            'jqueryMaskedinput': {
                deps: ['jquery']
            },
            'jqueryUi': {
                deps: ['jquery']
            },
            'bootstrap': {
                deps: ['jquery']
            },
            'select2': {
                deps: ['jquery']
            },
            'select2localePtBR': {
                deps: ['select2']
            },
            'angular': {
                exports: 'angular',
                deps: ['jquery']
            },
            'angularSanitize': {
                deps: ['angular']
            },
            'angularRoute': {
                deps: ['angular']
            },
            "uiUtils": {
                deps: ['angular']
            },
            "uiSelect": {
                deps: ['select2localePtBR', 'angular']
            },
            'uiBootstrap': {
                deps: ['angular', 'bootstrap']
            },
            "ngImgCrop": {
                deps: ['angular']
            },
            //NEON
            'gsap': {
                deps: ['jquery']
            },
            'resizeable': {
                deps: ['jquery']
            },
            'joinable': {
                deps: ['jquery']
            },
            'neonApi': {
                deps: ['gsap', 'resizeable', 'joinable']
            },
            'neonChat': {
                deps: ['neonApi']
            },
            'neonCustom': {
                deps: ['neonApi']
            },
            'neonDemo': {
                deps: ['neonApi']
            }
        },
        deps: [
            './app-bootstrap'
        ]
    };

    return require.config(config);
});