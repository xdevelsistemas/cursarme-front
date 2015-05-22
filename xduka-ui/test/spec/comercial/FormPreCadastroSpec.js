define(['angular', 'angularResource', 'angularMocks'], function() {
//define([], function() {
    describe('Controller: FormPreCadastro', function() {
        // load the relevant application modules then load a special
        // test module which overrides the $window with a mock version,
        // so that calling window.alert() will not block the test
        // runner with a real alert box. This is an example of overriding
        // configuration information in tests.

        beforeEach(function () {
            //module(app);
        });

        it("1 + 1 === 2", function (){
            expect(1 + 1).toEqual(2);
        });

        it("tes test teste", function(){
            expect(12%4).toEqual(0);
        });
    });
});