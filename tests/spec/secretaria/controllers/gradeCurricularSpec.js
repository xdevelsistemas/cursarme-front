(function() {
    'use strict';

    describe('Controller: gradeCurricular test', function() {

        var $scope, vm, modalInstance, $httpBackend, area, curso, grade,
            template = {"template":{"tipoCurso":{"label":"Tipo Curso","type":"select","name":"tipoCurso","placeholder":"Selecione uma opção","list":[{"id":"pos1","text":"Pós Graduação"},{"id":"mes1","text":"Mestrado"}],"model":{"val":"","err":""}},"area":{"label":"Área","type":"select","name":"area","placeholder":"Selecione uma opção","list":[],"model":{"val":"","err":""}},"curso":{"label":"Curso","type":"select","name":"curso","placeholder":"Selecione uma opção","required":false,"list":[],"model":{"val":"","err":""}},"grade":{"label":"Grade Curricular","type":"select","name":"grade","placeholder":"Selecione uma opção","required":false,"list":[],"model":{"val":"","err":""}}},"grid":{"columnDefs":[{"name":"nome da Disciplina","field":"nome","cellTemplate":"<div class=\"ui-grid-cell-contents\" ng-bind=\"row.entity.nome.text\"></div>"},{"name":"tipo Disciplina","field":"tipo","cellTemplate":"<div class=\"ui-grid-cell-contents\" ng-bind=\"row.entity.tipo.text\"></div>"},{"name":"CH","field":"ch"}],"data":[]},"modalGrade":{"tipoCurso":{"label":"Tipo Curso","type":"select","name":"tipoCurso","placeholder":"Selecione uma opção","list":[{"id":"0","text":"Pós Graduação"},{"id":"1","text":"Mestrado"}],"model":{"val":"","err":""}},"area":{"label":"Área","type":"text","name":"area","placeholder":"Selecione uma opção","list":[{"id":"0","text":"Área 1"},{"id":"1","text":"Área 2"}],"model":{"val":"","err":""}},"curso":{"label":"Curso","type":"select","name":"curso","placeholder":"Selecione uma opção","list":[{"id":"0","text":"Curso 1"},{"id":"1","text":"Curso 2"}],"model":{"val":"","err":""}},"nome":{"label":"Grade Curricular","type":"text","name":"grade","model":{"val":"","err":""}}},"modalDisciplina":{"disciplina":{"label":"Disciplina","type":"text","name":"disciplina","list":[{"id":"a1","text":"Circuitos Elétricos"},{"id":"a2","text":"Cálculo 1"},{"id":"a3","text":"Elétrica Avançada"},{"id":"a4","text":"Gianomo Guilizzoni Founder"},{"id":"a5","text":"Marco Botton"},{"id":"a6","text":"Mariah Maclachian"},{"id":"a7","text":"Geografia 1"},{"id":"a8","text":"Geografia 2"},{"id":"a9","text":"Geografia 3"},{"id":"a10","text":"Mecânica 1"},{"id":"a11","text":"Elétrônica Avançada"},{"id":"a12","text":"Marco Botton 2"},{"id":"a13","text":"Mariah Maclachian 2"},{"id":"a14","text":"Circuitos Elétricos 2"},{"id":"a15","text":"Mecânica Avançada"},{"id":"a16","text":"Programação 1"},{"id":"a17","text":"Administração Financeira"},{"id":"a18","text":"História 1"},{"id":"a19","text":"História 2"},{"id":"a20","text":"História 3"},{"id":"a21","text":"Estatística 1"},{"id":"a22","text":"Programação 2"},{"id":"a23","text":"Cálculo 2"},{"id":"a24","text":"Metodologia da Pesquisa"},{"id":"a25","text":"História 4"},{"id":"a26","text":"História 5"},{"id":"a27","text":"História 6"},{"id":"a28","text":"Estatística 2"}],"model":{"val":"","err":""}},"tipoDisciplina":{"label":"Tipo Disciplina","type":"text","name":"tipoDisciplina","list":[{"id":"b1","text":"Eixo Comum"},{"id":"b2","text":"Eixo Específico"}],"model":{"val":"","err":""}},"ch":{"label":"CH","type":"text","name":"ch","model":{"val":"","err":""}}}};


        beforeEach(function() {
            module('app');
            inject(function($injector, _$controller_, _$httpBackend_) {
                $scope = $injector.get('$rootScope').$new();
                $httpBackend = _$httpBackend_;

                // Requisição do servidor
                $httpBackend.when('GET','html/secretaria.html').respond(200);
                $httpBackend.when('GET','/api/secretaria/template-grade-curricular').respond(200, template);

                // Definindo controller
                vm = _$controller_('gradeCurricular', {"$scope": $scope});
            });
        });


        describe('-> Definição do gradeCurricular', function() {
            it('-> gradeCurricular definido', function () {
                expect(vm).toBeDefined();
            });
        });


        describe('-> Variáveis comuns', function() {
            it('-> verificando as variáveis comuns do controller', function () {
                expect(vm._model).toBeDefined();
                expect(vm._modalGrade).toBeDefined();
                expect(vm._modalDisciplina).toBeDefined();
                expect(vm.disableArea).toBeTruthy();
                expect(vm.disableCurso).toBeTruthy();
                expect(vm.disableGrade).toBeTruthy();
                expect(vm.showGrid).toBeTruthy();
                expect(vm.disableAreaModal).toBeTruthy();
                expect(vm.disableCursoModal).toBeTruthy();
                expect(vm.disableGradeModal).toBeTruthy();
                expect(vm.tableCronograma).toBeDefined();
                expect(vm.tableCronograma.id).toBeDefined();
                expect(vm.tableCronograma.columnDefs).toBeDefined();
            });
        });


        describe('-> Variáveis da promise', function() {
            it('-> Verificando variáveis da promise', function () {
                $httpBackend.flush();
                expect(vm.tableCronograma.columnDefs).toEqual(template.grid.columnDefs);
                expect(vm._model).toEqual(template.template);
                expect(vm._modalGrade).toEqual(template.modalGrade);
                expect(vm._modalDisciplina).toEqual(template.modalDisciplina);
            });
        });


        describe('-> Modal disciplina', function() {
            it('-> Abrindo modal de disciplina com os campos de _model em branco e validando eles', function () {
                $httpBackend.flush();
                expect(vm.addDisc()).not.toBeTruthy();
                expect(vm._model.tipoCurso.model.err).not.toEqual('');
                expect(vm._model.area.model.err).not.toEqual('');
                expect(vm._model.curso.model.err).not.toEqual('');
                expect(vm._model.grade.model.err).not.toEqual('');
            });
        });


        describe('-> Filtrando grade', function() {
            it('-> Selecionando os dados para filtrar a grade', function () {
                $httpBackend.flush();
            // selecionando tipo de curso
                vm.changeTipoCurso(vm._model.tipoCurso.list[0], vm._model.tipoCurso.list[0].id);
                expect(vm._model.tipoCurso.model.err).toEqual('');
                expect(vm.disableArea).not.toBeTruthy();
                expect(vm.disableCurso).toBeTruthy();
                expect(vm.disableGrade).toBeTruthy();
                expect(vm.showGrid).toBeTruthy();
                expect(vm.tableCronograma.data).toBeDefined();

                area = {"success":true,"list":[{"id":"exa1","text":"Exatas","tipoCurso":"pos1"},{"id":"hum1","text":"Humanas","tipoCurso":"pos1"}]};
                $httpBackend.when('GET', '/api/secretaria/template-area-grade-curricular/' + vm._model.tipoCurso.list[0].id)
                    .respond(200, area);

                $httpBackend.flush();
                expect(vm._model.area.list).toEqual(area.list);
            });
        });
    });
})();