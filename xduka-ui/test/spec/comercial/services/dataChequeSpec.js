describe('dataCheque test', function() {

    var dc;

    beforeEach(function() {
        module('app');
        inject(function ($injector) {
            dc = $injector.get('dataCheque');
        });
    });

    it('Testando inserção e requisição da data', function() {
        var data = "2015-06-10T22:08:15.633Z";

        expect(dc.setData(data));
        expect(dc.getData()).toEqual(data);
    });
});