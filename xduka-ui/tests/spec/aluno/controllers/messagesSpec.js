gi(function() {
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
                //alert(messages.mensagens);
                expect(messages.mensagens.idCurso).toEqual(msg.idCurso);
            }))
        });
    })
})();