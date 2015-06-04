describe('lista_cheques', function() {

    var factory;

    beforeEach(function() {
        module('app');
        inject(function($injector) {
            factory = $injector.get('lista_cheques');
        });
    });

    it('testando as funções de lista_cheques', function() {
        var obj = {
            "banco":{"id":"012","text":"012 - BANCO GUANABARA S.A."},
            "conta":"4657",
            "numero":"817665465468464",
            "data":1436929200000,
            "valor":132.03,
            "titular":"Pedro Nascimento"
        };

        expect(factory.add(obj));
        expect(factory.lista.length).toEqual(1);
        expect(factory.lista[0]).not().toEqual({
            "banco":{"id":"012","text":"012 - BANCO GUANABARA S.A."},
            "agencia":"123",
            "conta":"4657",
            "numero":"817665465468464",
            "data":1436929200000,
            "valor":132.03,
            "titular":"Pedro Nascimento"
        });
        /*expect(factory.remove(obj));
        expect(factory.lista.length).toEqual(0);*/
    });
});