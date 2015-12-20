(function() {
    'use strict';

    describe('Messages test', function () {
        var $scope,
            $rootScope,
            $httpBackend,
            messages,
            serviceMsg,
            msg,
            url_get,
            dc;

        beforeEach(function() {
            module('app');
            inject(function ($injector, $controller) {
                url_get = "/api/aluno/mensagens/33";
                msg = {
                    "idCurso": "33",
                    "today": [{
                        "date": "28/10/2014",
                        "time": "10:45 AM"
                    }],
                    "list": [{
                        "date": "02/04/2015",
                        "time": "19:45 PM",
                        "from": "João da Silva",
                        "text": "Tolerably earnestly middleton extremely distrusts she boy now not. Add and offered prepare how cordial two promise. Greatly who affixed suppose but enquire compact prepare all put. Added forth chief trees but rooms think may.",
                        "attachment": ""
                    }]
                };

                $httpBackend = $injector.get('$httpBackend');
                $httpBackend.whenGET(url_get).respond(msg);
                dc = $injector.get('defineCurso');

                /*$rootScope = $injector.get('$rootScope');
                 $scope = $rootScope.$new();
                 serviceMsg = $injector.get('serviceMessages');*/
            });
        });

        describe('Testando service: ', function() {
            it('Curso com id 33', inject(function($controller) {
                var idCurso = 33;
                dc.setIdCurso(idCurso);

                messages = $controller('Messages', {
                    '$scope': $scope
                });

                /*serviceMsg = serviceMessages.get({id: dc.getIdCurso()}).$promise;*/
                $httpBackend.flush();
                alert(messages.mensagens);
                alert(msg);
                expect(messages.mensagens.idCurso).toEqual(msg.idCurso);
            }))
        });
    })
})();


/*

 // - teste year of moo

 // test/unit/controllers/controllersSpec.js
 //
 describe("Unit: Testing Controllers", function() {

 beforeEach(module('App'));

 it('should have a VideosCtrl controller', function() {
 expect(App.VideosCtrl).not.to.equal(null);
 });

 it('should have a VideoCtrl controller', function() {
 expect(App.VideoCtrl).not.to.equal(null);
 });

 it('should have a WatchedVideosCtrl controller', function() {
 expect(App.WatchedVideosCtrl).not.to.equal(null);
 });

 it('should have a properly working VideosCtrl controller', inject(function($rootScope, $controller, $httpBackend) {
 var searchTestAtr = 'cars';
 var response = $httpBackend.expectJSONP(
 'https://gdata.youtube.com/feeds/api/videos?q=' + searchTestAtr + '&v=2&alt=json&callback=JSON_CALLBACK');
 response.respond(null);

 var $scope = $rootScope.$new();
 var ctrl = $controller('VideosCtrl', {
 $scope : $scope,
 $routeParams : {
 q : searchTestAtr
 }
 });
 }));

 it('should have a properly working VideoCtrl controller', inject(function($rootScope, $controller, $httpBackend) {
 var searchID = 'cars';
 var response = $httpBackend.expectJSONP(
 'https://gdata.youtube.com/feeds/api/videos/' + searchID + '?v=2&alt=json&callback=JSON_CALLBACK');
 response.respond(null);

 var $scope = $rootScope.$new();
 var ctrl = $controller('VideoCtrl', {
 $scope : $scope,
 $routeParams : {
 id : searchID
 }
 });
 }));

 it('should have a properly working WatchedVideosCtrl controller', inject(function($rootScope, $controller, $httpBackend) {
 var $scope = $rootScope.$new();

 //we're stubbing the onReady event
 $scope.onReady = function() { };
 var ctrl = $controller('WatchedVideosCtrl', {
 $scope : $scope
 });
 }));

 });


 */