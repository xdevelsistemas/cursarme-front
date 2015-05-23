var tests = Object.keys(window.__karma__.files).filter(function (file) {
    return (/Spec\.js$/).test(file);
});
requirejs.config({
    // Karma serves files from '/base'
    baseUrl: '/base/public/js/comercial',
    paths: {
        'angular': '../../lib/angular/angular',
        'angularResource': '../../lib/angular-resource/angular-resource',
        'angularMocks': '../../lib/angular-mocks/angular-mocks',
        'app': '../../js/require-config'
    },

    shim: {
        'app': {
            deps: ['angular', 'angularResource']
        },
        'angularResource': {
            deps: ['angular']
        },
        'angularMocks': {
            deps: ['angularResource']
        }
    },
    // ask Require.js to load these files (all our tests)
    deps: tests,
    // start test run, once Require.js is done
    callback: window.__karma__.start
});