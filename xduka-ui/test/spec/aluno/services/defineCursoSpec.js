describe('defineCurso test', function() {

    var dc;

    beforeEach(function() {
        module('app');
        inject(function ($injector) {
            dc = $injector.get('defineCurso');
        });
    });

    it('Testando inserção e requisição do id do curso', function() {
        var id = 11;

        expect(dc.setIdCurso(id));
        expect(dc.getIdCurso()).toEqual(id);
    });
});