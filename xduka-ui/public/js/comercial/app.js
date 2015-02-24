define([
    'angular',
    'angularRoute',
    'angularSanitize',
    'uiUtils',
    'uiBootstrap',
    'ngImgCrop',
    './controllers/__index__',
    './directives/__index__',
    './filters/__index__',
    './services/__index__',
    '../common/directives/__index__',
    '../common/filters/__index__',
    '../common/services/__index__'
], function (angular) {
    'use strict';

    return angular.module('app', [
        'ngRoute',
        'ngSanitize',
        'ui.utils',
        'ui.bootstrap',
        'ngImgCrop',
        'app.controllers',
        'app.directives',
        'app.filters',
        'app.services',
        'common.directives',
        'common.filters',
        'common.services'

    ]);
});