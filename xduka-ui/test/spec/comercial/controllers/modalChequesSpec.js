describe('Controller: ModalCheques test', function() {

    var $scope, modal, modalInstance;

    beforeEach(function() {
        module('app');
        inject(function($injector, $controller) {
            $scope = $injector.get('$rootScope').$new();
            modalInstance = {                    // Create a mock object using spies
                "close": jasmine.createSpy('modalInstance.close'),
                "dismiss": jasmine.createSpy('modalInstance.dismiss'),
                "result": {
                    "then": jasmine.createSpy('modalInstance.result.then')
                }
            };
            modal = $controller('ModalCheques', {
                "$scope": $scope,
                "$modalInstance": modalInstance,
                "itemArray": function () { return ['a', 'b', 'c']; }
            });
        });
    });

    it('ModalCheque definido', function () {
        expect(modal).toBeDefined();
    });

    it('25/13/2015 não é valida', function() {
        expect(modal.isDate('25/13/2015')).toEqual(false);
    });

    it('00/00/2015 não é valido', function() {
        expect(modal.isDate('00/00/2015')).toEqual(false);
    });

    it('01/02/2015 é valido', function() {
        expect(modal.isDate('01/02/2015')).toEqual(true);
    });
});