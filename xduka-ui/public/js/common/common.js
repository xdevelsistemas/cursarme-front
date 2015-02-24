define([
    'angular',
    './services/__index__'
], function (angular) {
    'use strict';

    return angular.module('xDuka.common', [
        'xDuka.common.services'
    ]);
});