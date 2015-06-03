describe('FormPreCadastro', function() {
    // load the relevant application modules then load a special
    // test module which overrides the $window with a mock version,
    // so that calling window.alert() will not block the test
    // runner with a real alert box. This is an example of overriding
    // configuration information in tests.

    var $scope;

    beforeEach(function() {
        module('app');
        inject(function($injector) {
            $scope = $injector.get('$rootScope').$new();
        });
    });

    it('cor definida', inject(function($controller) {
        $controller('FormPreCadastro', {"$scope": $scope});
        expect($scope.cor).toBeDefined();
    }));

    it('minha casa é azul', inject(function($controller) {
        $controller('FormPreCadastro', {"$scope": $scope});
        expect($scope.cor).toEqual('blue');
    }));

    it('minha casa é um ape', inject(function($controller) {
        $controller('FormPreCadastro', {"$scope": $scope});
        expect($scope.casa).toEqual('ape');
    }));
});

/*
 define(['app', 'angular', 'angularResource', 'angularMocks'], function(app, angular) {
 console.log("\n\n'Running test to controller FormPreCadastro");

 describe('Controller: FormPreCadastro', function() {
 // load the relevant application modules then load a special
 // test module which overrides the $window with a mock version,
 // so that calling window.alert() will not block the test
 // runner with a real alert box. This is an example of overriding
 // configuration information in tests.

 var $scope, ctrl;

 beforeEach(module('app'), inject(function($injector, $controller){
 $scope = $injector('$routeScope').$new();
 ctrl = $controller('FormPreCadastro', {"$scope": $scope})
 }));

 it("Controller FormPreCadastro defined", function() {
 console.log("Controller FormPreCadastro undefined");
 expect($scope).toBeUndefined();
 });

it("A casa é um apê", inject(function($controller){
 $controller("FormPreCadastro", {"$scope": $scope});
 expect($scope.casa).toEqual('ape');
 }));
});
});
 */