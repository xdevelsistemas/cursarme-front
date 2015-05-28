(function () {
    'use strict';

    angular.module('app.services').value('lista_cheques', {
        lista: [],
        add: function (cheque) {
            this.lista.push($.extend({}, cheque));
            console.log('//=== Cheque adicionado:');
            console.log(cheque);
            console.log('====//');
        },
        remove: function (cheque) {
            var i = this.lista.indexOf(cheque);
            this.lista.splice(i, 1);
            console.log('//=== Cheque removido:');
            console.log(cheque);
            console.log('====//');
        },
        clean: function () {
            this.lista = [];
        }
    });
})();