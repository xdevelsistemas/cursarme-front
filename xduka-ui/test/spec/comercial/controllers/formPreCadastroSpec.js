describe('Controller: FormPreCadastro test', function() {

    var $scope, pre;

    beforeEach(function() {
        module('app');
        inject(function($injector, $controller) {
            $scope = $injector.get('$rootScope').$new();
            pre = $controller('FormPreCadastro', {"$scope": $scope});
        });
    });

    it('FormPreCadastro definido', function() {
        expect(pre).toBeDefined();
    });

    it('cor definida', function() {
        expect(pre.cor).toBeDefined();
    });

    it('minha casa é azul', function() {
        expect(pre.cor).toEqual('blue');
    });

    it('minha casa é um ape', function() {
        expect(pre.casa).toEqual('ape');
    });

    it('variable undefined', function() {
        expect(pre.inventeiAgora).toBeUndefined();
    });
});