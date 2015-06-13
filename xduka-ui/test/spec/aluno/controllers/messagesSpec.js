describe('Messages test', function () {
    var $scope, $httpBackend, msg, dc;

    beforeEach(function() {
        module('app');
        inject(function($injector, $controller, _$httpBackend_) {
            $scope = $injector.get('$rootScope').$new();
            $httpBackend = _$httpBackend_;
            dc = $injector.get('defineCurso');

            msg = $controller('Messages', {"$scope": $scope});
        });
    });

    it('Curso com id 33', function () {
        var id = 33;

        expect(dc.setIdCurso(id));
        expect(msg.mensagens).toBeUndefined();
            /*toEqual({
                "idCurso": "33",
                "today": [{
                    "date": "28/10/2014",
                    "time": "10:45 AM"
                }],
                "list": [
                    {
                        "date": "02/04/2015",
                        "time": "19:45 PM",
                        "from": "João da Silva",
                        "text": "Tolerably earnestly middleton extremely distrusts she boy now not. Add and offered prepare how cordial two promise. Greatly who affixed suppose but enquire compact prepare all put. Added forth chief trees but rooms think may.",
                        "attachment": ""
                    }
                ]
            }
        );*/
    })

});