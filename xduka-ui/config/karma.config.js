// Karma configuration
// Generated on Fri May 15 2015 15:44:30 GMT-0300 (BRT)

module.exports = function(config) {
    config.set({

        // base path that will be used to resolve all patterns (eg. files, exclude)
        basePath: '..',


        // frameworks to use
        // available frameworks: https://npmjs.org/browse/keyword/karma-adapter
        frameworks: ['jasmine', 'requirejs'],


        // list of files / patterns to load in the browser
        files: [
            {pattern: 'public/lib/angular/angular.js', included: false},
            {pattern: 'public/lib/requirejs/require.js', included: false},
            {pattern: 'public/lib/angular-resource/angular-resource.js', included: false},
            {pattern: 'public/lib/angular-mocks/angular-mocks.js', included: false},
            'public/js/**/*.js',
            'public/js/*.js',
            'test/spec/**/*Spec.js',
            'test/spec/test-main.js'
        ],

        // list of files to exclude
        exclude: [
            'public/js/require-config.js'
        ],


        // preprocess matching files before serving them to the browser
        // available preprocessors: https://npmjs.org/browse/keyword/karma-preprocessor
        preprocessors: {
        },


        // test results reporter to use
        // possible values: 'dots', 'progress'
        // available reporters: https://npmjs.org/browse/keyword/karma-reporter
        reporters: ['progress'],


        // web server port
        port: 10001,


        // enable / disable colors in the output (reporters and logs)
        colors: true,


        // level of logging
        // possible values: config.LOG_DISABLE || config.LOG_ERROR || config.LOG_WARN || config.LOG_INFO || config.LOG_DEBUG
        logLevel: config.LOG_INFO,
        //logLevel = LOG_INFO;

        // enable / disable watching file and executing tests whenever any file changes
        autoWatch: true,
        //autoWatch = false;


        // start these browsers
        // available browser launchers: https://npmjs.org/browse/keyword/karma-launcher
        browsers: ['PhantomJS'],


        // If browser does not capture in given timeout [ms], kill it
        //captureTimeout = 60000;

        // Continuous Integration mode
        // if true, Karma captures browsers, runs the tests and exits
        singleRun: false
        //singleRun = true;
    });
};