describe('Service common: tipoTelefone test', function() {

    var tt;

    beforeEach(function() {
        module('app');
        inject(function ($injector) {
            tt = $injector.get('tipoTelefone');
        });
    });

    it('-> tipoTelefone definido', function() {
        expect(tt).toBeDefined();
    });

    it('-> Testando aplicação de máscara para celular', function() {
        expect(tt.getMaskPhone('cel')).toEqual('?(99) 9 9999-9999');
    });

    it('-> Testando aplicação de máscara para telefone normal', function() {
        expect(tt.getMaskPhone('cel')).toEqual('?(99) 9 9999-9999');
        expect(tt.getMaskPhone('phone')).toEqual('?(99) 9999-9999');
    });
});