define([
    'angular',
    'angularInputMasks',
    'angularRoute',
    'angularResource',
    'uiSelect',
    'angularSanitize',
    'uiUtils',
    'uiBootstrap',
    'ngImgCrop',
    './services/__index__',
    './filters/__index__',
    './directives/__index__',
    './controllers/__index__',
    '../common/services/__index__',
    '../common/filters/__index__',
    '../common/directives/__index__'
], function (angular) {
    'use strict';

    return angular.module('app', [
        'ui.utils.masks',
        'ngRoute',
        'ngResource',
        'ui.select',
        'ngSanitize',
        'ui.utils',
        'ui.bootstrap',
        'ngImgCrop',
        'app.services',
        'app.filters',
        'app.directives',
        'app.controllers',
        'common.services',
        'common.filters',
        'common.directives'
    ]);
});