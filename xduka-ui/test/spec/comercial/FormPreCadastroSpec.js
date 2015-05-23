define(['app', 'angular', 'angularResource', 'angularMocks'], function(app, angular) {
    console.log("Running test to controller FormPreCadastro");

    describe('Controller: FormPreCadastro', function() {
        // load the relevant application modules then load a special
        // test module which overrides the $window with a mock version,
        // so that calling window.alert() will not block the test
        // runner with a real alert box. This is an example of overriding
        // configuration information in tests.

        //var ctrl, $scope, rootScope, httpBackend;
        var $scope;

        /*beforeEach(function(){
            module(app);
            /!*inject(function($injector, _$httpBackend_, $rootScope) {
                $scope = $injector.get('$rootScope').$new();
                /!*rootScope = $rootScope;
                httpBackend = _$httpBackend_;
                httpBackend.when('GET', '/api/contatos/1').respond({_id: '1', nome: "Contato Exemplo 123"});
                httpBackend.when('GET', '/api/contatos').respond([{}]);*!/
            })*!/
        });*/

        /*beforeEach(module(app), inject(function($injector, $rootScope, $controller){
            $scope = $injector.get('$rootScope').$new();
            rootScope = $rootScope;
            ctrl = $controller("FormPreCadastro", {"$scope": $scope});
        }));*/

        beforeEach(module('app'), inject(function($injector){
            $scope = $injector.get('$rootScope').$new();
        }));

        /*it("tes test teste", function(){
            expect(12%4).toEqual(0);
        });

        it("A cor é azul", function() {
            expect($scope.cor).toEqual('blue');
        });

        it("A casa é um apê", function() {
            expect($scope.casa).toEqual('ape');
        });*/

        it("Controller FormPreCadastro defined", inject(function($controller){
            console.log("Controller FormPreCadastro defined");
            rootScope = $rootScope;
            ctrl = $controller("FormPreCadastro", {"$scope": $scope});
            expect($scope.cor).toEqual('red');
        }));

        /*it("A casa é um apê", inject(function($controller){
            $controller("FormPreCadastro", {"$scope": $scope});
            expect($scope.casa).toEqual('ape');
        }));*/
    });
});