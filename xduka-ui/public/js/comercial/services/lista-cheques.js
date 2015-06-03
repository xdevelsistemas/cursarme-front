(function () {
    'use strict';

    angular.module('app.services').value('lista_cheques', {
        lista: [],
        add: function (cheque) {
            this.lista.push($.extend({}, cheque));
        },
        remove: function (cheque) {
            var i = this.lista.indexOf(cheque);
            this.lista.splice(i, 1);
        },
        addAll: function (cheques) {
            this.lista = cheques;
        },
        clean: function () {
            this.lista = [];
        }
    });
})();