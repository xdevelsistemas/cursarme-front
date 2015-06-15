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

    it('variable undefined', function() {
        expect(pre.inventeiAgora).toBeUndefined();
    });
});