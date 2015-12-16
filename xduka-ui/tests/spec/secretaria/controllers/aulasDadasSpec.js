(function() {
    'use strict';

    describe('Controller: aulasDadas test', function() {
        beforeEach(module('app'));
        var $scope, $httpBackend, vm, dadosCep, dadosCpf, cep, cpf, itemSexo,

        // Variáveis para resposta do servidor
            template = {"template":{"columnDefs":[{"name":"nome"},{"name":"data","cellTemplate":"<div class=\"ui-grid-cell-contents\" ng-bind=\"row.entity.data | date: 'dd/MM/yyyy'\"></div>"},{"name":"valor","cellTemplate":"<div class=\"ui-grid-cell-contents\">{{ 'R$ ' + row.entity.valor }}</div>"},{"name":"conta bancária","field":"conta"},{"name":"CPF","cellTemplate":"<div class=\"ui-grid-cell-contents\" ng-bind=\"row.entity.cpf | cpfFilter\"></div>"},{"name":"disciplina"},{"name":"aula"}],"body":[{"nome":"Gianomo Guilizzoni Founder & CEO","data":1367550000000,"valor":"100.00","conta":"1234545","cpf":"01234567899","curso":"Complementação","disciplina":"Didática","aula":1},{"nome":"Marco Botton Tuttofare","data":1361588400000,"valor":"200.00","conta":"12243","cpf":"01234567899","curso":"","disciplina":"","aula":""},{"nome":"Mariah Maclachian Better Half","data":1378782000000,"valor":"300.00","conta":"1223","cpf":"01234567899","curso":"","disciplina":"","aula":""},{"nome":"Valerie Liberty Head Chef","data":1377140400000,"valor":"400.00","conta":"12123","cpf":"01234567899","curso":"","disciplina":"","aula":""},{"nome":"Guido Jack Guilizzoni","data":1333162800000,"valor":"500.00","conta":"123223","cpf":"01234567899","curso":"","disciplina":"","aula":""}]},"modal":{"nome":{"label":"Nome","type":"text","name":"nome","model":{"val":"","err":""}},"conta":{"label":"Conta Bancária","type":"text","name":"conta","model":{"val":"","err":""}},"cpf":{"label":"CPF","type":"text","name":"cpf","mask":"?999.999.999-99","model":{"val":"","err":""}},"data":{"label":"Data","type":"text","name":"data","format":"dd/MM/yyyy","model":{"val":"","err":""}},"aula":{"label":"Aulas","type":"text","name":"aula","model":{"val":"","err":""}},"curso":{"label":"Curso","type":"select","name":"curso","list":[{"id":"0","text":"Curso 1"}],"model":{"val":"","err":""}},"disciplina":{"label":"Disciplina","type":"select","name":"disciplina","list":[{"id":"0","text":"Disciplina 1"}],"model":{"val":"","err":""}}}};


        beforeEach(function() {
            inject(function(_$injector_, _$controller_, _$httpBackend_) {
                $scope = _$injector_.get('$rootScope').$new();
                $httpBackend = _$httpBackend_;

                // Buscando dados servidor
                $httpBackend.when('GET', '/api/secretaria/dados-aulas-dadas').respond(200, template);
                $httpBackend.when('GET', 'html/secretaria/secretaria.html').respond(200);

                vm = _$controller_('aulasDadas', {"$scope": $scope});
            });
        });


        describe('-> Definição de aulasDadas', function() {
            it('-> controller aulasDadas foi definido', function() {
                expect(vm).toBeDefined();
            });
        });


        describe('-> Testando modelo e controle do grid estão definidos', function() {
            it('-> Verificando se _model está definido', function() {
                expect(vm._model).toBeDefined();
            });

            it('-> Verificando se tableCronograma está definido', function() {
                expect(vm.tableCronograma).toBeDefined();
            });
        });


        describe('-> Testando modelo e controle do grid', function() {
            it('-> Verificando se _model está definido', function() {
                $httpBackend.flush();
                expect(vm._model).toEqual(template.modal);
            });

            it('-> Verificando se tableCronograma está definido', function() {
                $httpBackend.flush();
                expect(vm.tableCronograma.columnDefs).toEqual(template.template.columnDefs);
                expect(vm.tableCronograma.data).toEqual(template.template.body);
            });
        });


        describe('-> Validando os campos', function() {
            it('-> Validando os campos com os dados em branco', function() {
                $httpBackend.flush();
                expect(vm._valida()).not.toBeTruthy();
                expect(vm._model.aula.model.err).not.toEqual('');
                expect(vm._model.conta.model.err).not.toEqual('');
                expect(vm._model.cpf.model.err).not.toEqual('');
                expect(vm._model.curso.model.err).not.toEqual('');
                expect(vm._model.data.model.err).not.toEqual('');
                expect(vm._model.disciplina.model.err).not.toEqual('');
                expect(vm._model.nome.model.err).not.toEqual('');
            });

            it('-> Adicionando valores nos campos e validando', function() {
                $httpBackend.flush();
                // Adicionando os valores equivalentes a cada tipo de campo
                vm._model.nome.model.val = 'Teste unitário';
                vm._model.conta.model.val = '012450';
                vm._model.cpf.model.val = '01234567890';
                vm._model.data.model.val = new Date();
                vm._model.aula.model.val = 20;
                vm._model.curso.model.val = '0123';
                vm._model.disciplina.model.val = '0123';

                // validando os campos
                expect(vm._valida()).toBeTruthy();
                expect(vm._model.aula.model.err).toEqual('');
                expect(vm._model.conta.model.err).toEqual('');
                expect(vm._model.cpf.model.err).toEqual('');
                expect(vm._model.curso.model.err).toEqual('');
                expect(vm._model.data.model.err).toEqual('');
                expect(vm._model.disciplina.model.err).toEqual('');
                expect(vm._model.nome.model.err).toEqual('');
            });

            it('-> Limpando os campos e validando', function() {
                $httpBackend.flush();
                // Limpando campos e chamando vm.salvar só para verificar a validação
                vm.limpar();
                vm.salvar();
                expect(vm._model.aula.model.err).not.toEqual('');
                expect(vm._model.conta.model.err).not.toEqual('');
                expect(vm._model.cpf.model.err).not.toEqual('');
                expect(vm._model.curso.model.err).not.toEqual('');
                expect(vm._model.data.model.err).not.toEqual('');
                expect(vm._model.disciplina.model.err).not.toEqual('');
                expect(vm._model.nome.model.err).not.toEqual('');
            });
        });
    });
})();