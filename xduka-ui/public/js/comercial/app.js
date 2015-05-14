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
    '../common/directives/__index__',
    '../common/filters/__index__',
    '../common/services/__index__',
    './controllers/__index__',
    './directives/__index__',
    './filters/__index__',
    './services/__index__'
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
        'common.directives',
        'common.filters',
        'common.services',
        'app.controllers',
        'app.directives',
        'app.filters',
        'app.services'
    ]);
});