describe('Service: lista_cheques test', function() {

    var lc, cheque;

    beforeEach(function() {
        module('app');
        inject(function($injector) {
            lc = $injector.get('lista_cheques');
        });
    });

    it('lista_cheques definido', function() {
        expect(lc).toBeDefined();
    });

    it('Adicionando cheque', function() {
        cheque = {
            "banco": {"id": "012", "text": "012 - BANCO GUANABARA S.A."},
            "agencia": "123",
            "conta": "4657",
            "numero": "817665465468464",
            "data": 1436929200000,
            "valor": 132.03,
            "titular": "Pedro Nascimento"
        };
        expect(lc.add(cheque));
        cheque.numero = "817665465468465";
        cheque.valor = 200;
        expect(lc.add(cheque));
        cheque.numero = "817665465468466";
        cheque.valor = 220;
        expect(lc.add(cheque));
    });

    it('Verificando a qtd de cheques', function() {
        expect(lc.lista.length).toEqual(3);
    });

    it('Verificando se o cheque existe', function() {
        expect(lc.lista[0]).toEqual({
            "banco":{"id":"012","text":"012 - BANCO GUANABARA S.A."},
            "agencia":"123",
            "conta":"4657",
            "numero":"817665465468464",
            "data":1436929200000,
            "valor":132.03,
            "titular":"Pedro Nascimento"
        });
    });

    it('Removendo apenas um cheque', function () {
        expect(lc.remove(cheque));
        expect(lc.lista.length).toEqual(2);
    });

    it('Removendo todos os cheque', function () {
        expect(lc.clean());
        expect(lc.lista.length).toEqual(0);
    });
});