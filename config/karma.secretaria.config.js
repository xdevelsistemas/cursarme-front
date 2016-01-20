// Karma configuration
// Generated on Wed Jun 03 2015 16:53:30 GMT-0300 (BRT)

module.exports = function(config) {
  config.set({

    // base path that will be used to resolve all patterns (eg. files, exclude)
    basePath: '..',


    // frameworks to use
    // available frameworks: https://npmjs.org/browse/keyword/karma-adapter


    frameworks: ['jasmine'],

    // list of files / patterns to load in the browser
    files: [
        'public/lib/jquery/dist/jquery.js',
        'public/lib/angular/angular.js',
        'public/lib/angular-route/angular-route.js',
        'public/lib/angular-resource/angular-resource.js',
        'public/lib/angular-mocks/angular-mocks.js',
        'public/lib/angular-ui-grid/ui-grid.js',
        'public/lib/jquery-maskedinput/dist/jquery.maskedinput.js',
        'public/lib/jquery-ui/jquery-ui.js',
        'public/lib/bootstrap/dist/js/bootstrap.js',
        'public/lib/angular-input-masks/angular-input-masks.br.js',
        'public/lib/angular-sanitize/angular-sanitize.js',
        'public/lib/ngImgCrop/compile/unminified/ng-img-crop.js',
        'public/lib/select2/select2.js',
        'public/lib/select2/select2_locale_pt-BR.js',
        'public/lib/angular-bootstrap/ui-bootstrap-tpls.js',
        'public/lib/angular-ui-utils/ui-utils.js',
        'public/lib/angular-ui-select/dist/select.js',
        'public/lib/ngprogress/build/ngprogress.js',
        'public/lib/c3-angular/c3-angular.min.js',
        'public/lib/c3/c3.min.js',
        'public/lib/d3/d3.min.js',
        'public/lib/angular-file-upload/dist/angular-file-upload.min.js',
        'public/assets/js/jquery.mask.min.js',
        'public/secretaria/js/routes/routes.js',
        'public/secretaria/js/**/*.js',
        'public/common/js/**/*.js',
        'tests/spec/secretaria/controllers/gradeCurricularSpec.js'
    ],

    // list of files to exclude
    exclude: [
    ],

      // coverage reporter generates the coverage
      reporters: ['progress', 'coverage'],

      preprocessors: {
          // source files, that you wanna generate coverage for
          // do not include tests or libraries
          // (these files will be instrumented by Istanbul)
          'public/secretaria/js/**/*.js': ['coverage']
      },

      // optionally, configure the reporter
      coverageReporter: {
          type : 'html',
          dir : 'tests/spec/secretaria/coverage'
      },

    // web server port
    port: 9876,


    // enable / disable colors in the output (reporters and logs)
    colors: true,


    // level of logging
    // possible values: config.LOG_DISABLE || config.LOG_ERROR || config.LOG_WARN || config.LOG_INFO || config.LOG_DEBUG
    logLevel: config.LOG_INFO,


    // enable / disable watching file and executing tests whenever any file changes
    autoWatch: true,


    // start these browsers
    // available browser launchers: https://npmjs.org/browse/keyword/karma-launcher
    browsers: ['PhantomJS'],


    // Continuous Integration mode
    // if true, Karma captures browsers, runs the tests and exits
    singleRun: true
  });
};
