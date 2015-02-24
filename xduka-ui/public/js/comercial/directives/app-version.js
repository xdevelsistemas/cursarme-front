define(['./__module__'], function (directives) {
    'use strict';
    directives.directive('appVersion', ['version', function (version) {
        return function (scope, elm) {
            elm.text(version);
        };
    }]);
});
