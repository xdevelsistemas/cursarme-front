describe('FormPreCadastro', function() {
    // load the relevant application modules then load a special
    // test module which overrides the $window with a mock version,
    // so that calling window.alert() will not block the test
    // runner with a real alert box. This is an example of overriding
    // configuration information in tests.

    var $scope, pre;

    beforeEach(function() {
        module('app');
        inject(function($injector, $controller) {
            $scope = $injector.get('$rootScope').$new();
            pre = $controller('FormPreCadastro', {"$scope": $scope});
        });
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