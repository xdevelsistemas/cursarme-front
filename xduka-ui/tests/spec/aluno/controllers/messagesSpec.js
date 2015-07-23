(function() {
    'use strict';

    describe('Messages test', function () {
        var $scope, $httpBackend, msg, dc;

        beforeEach(function() {
            module('app');
            inject(function($injector, _$httpBackend_, $controller) {
                $scope = $injector.get('$rootScope').$new();
                $httpBackend = _$httpBackend_;
                $httpBackend.when('GET', '/api/aluno/mensagens/33').respond({idCurso: '33'});
                //
                //dc = $injector.get('defineCurso');
            });
        });

        it('Curso com id 33', inject(
            function ($controller) {
                $controller('Messages', {
                    "$routeParams": {"id": 33},
                    "$scope": $scope
                });

                $httpBackend.flush();
                expect(dc.setIdCurso(id));
                expect($scope.mensagens)//.toBeDefined();
                    .toEqual({
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
                    });
            }
        ))
    })
})();