define(['./__module__', 'jquery'], function (services, $) {
    'use strict';
    services.value('lista_cheques', {
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
});
/*{
 "banco": "Banco do Brasil",
 "agencia": "035",
 "conta": "154.456.54-4",
 "numero": "54823",
 "data": "18/12/2014",
 "valor": "R$ 300,00",
 "titular": "João Botelho"
 }*/
