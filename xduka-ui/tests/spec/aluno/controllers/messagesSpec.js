(function() {
    'use strict';

    describe('Messages test', function () {
        var httpBackend,
            sm, // service serviceMessages
            dc, // service defineCurso
            msg, // msg de mensagem mesmo
            msg2;

        beforeEach(function() {
            module('app');

            // get your service, also get $httpBackend
            // $httpBackend will be a mock, thanks to angular-mocks.js
            inject(function($injector, $httpBackend, _serviceMessages_) {
                sm = _serviceMessages_;
                httpBackend = $httpBackend;
                dc = $injector.get('defineCurso');
            });
        });

        // make sure no expectations were missed in your tests.
        // (e.g. expectGET or expectPOST)
        afterEach(function() {
            httpBackend.verifyNoOutstandingExpectation();
            httpBackend.verifyNoOutstandingRequest();
        });

        describe('Testando msgs do curso: ', function() {
            msg = {
                "idCurso": "11",
                "today": [{
                    "date": "28/10/2014",
                    "time": "10:45 AM"
                }],
                "list": [
                    {
                        "date": "04/8/2014",
                        "time": "08:22 AM",
                        "from": "John Doe",
                        "text": "Tolerably earnestly middleton extremely distrusts she boy now not. Add and offered prepare how cordial two promise. Greatly who affixed suppose but enquire compact prepare all put. Added forth chief trees but rooms think may.",
                        "attachment": ""
                    },
                    {
                        "date": "07/06/2014",
                        "time": "13:18 PM",
                        "from": "John Doe",
                        "text": "Tolerably earnestly middleton extremely distrusts she boy now not. Add and offered prepare how cordial two promise. Greatly who affixed suppose but enquire compact prepare all put. Added forth chief trees but rooms think may.",
                        "attachment": ""
                    },
                    {
                        "date": "13/03/2014",
                        "time": "09:45 AM",
                        "from": "John Doe",
                        "text": "Tolerably earnestly middleton extremely distrusts she boy now not. Add and offered prepare how cordial two promise. Greatly who affixed suppose but enquire compact prepare all put. Added forth chief trees but rooms think may.",
                        "attachment": ""
                    }
                ]
            };
            msg2 = {
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

            it('Curso com id 11', function() {
                var result,
                    returnedPromise,
                    idCurso = 11;

                dc.setIdCurso(idCurso);

                httpBackend.expectGET('/api/aluno/mensagens/11').respond(msg);

                returnedPromise = sm.get({id: dc.getIdCurso()}).$promise;

                returnedPromise.then(function(data){
                    result = data;
                });

                /*serviceMsg = serviceMessages.get({id: dc.getIdCurso()}).$promise;*/
                httpBackend.flush();
                expect(result.list).toEqual(msg.list);
            });

            it('Curso com id 33', function() {
                var result2,
                    returnedPromise2,
                    idCurso2 = 33;

                dc.setIdCurso(idCurso2);

                httpBackend.expectGET('/api/aluno/mensagens/33').respond(msg2);

                returnedPromise2 = sm.get({id: dc.getIdCurso()}).$promise;

                returnedPromise2.then(function(data){
                    result2 = data;
                });

                /*serviceMsg = serviceMessages.get({id: dc.getIdCurso()}).$promise;*/
                httpBackend.flush();
                alert(result2.list[0].text);
                expect(result2.list).toEqual(msg2.list);
            })
        });
    })
})();