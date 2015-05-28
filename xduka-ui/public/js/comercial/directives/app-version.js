(function () {
    'use strict';
    angular.module('app.directives').directive('appVersion', ['version', function (version) {
        return function (scope, elm) {
            elm.text(version);
        };
    }]);
})();
