(function() {
    'use strict';

    describe('Controller: enviarCircular test', function() {

        var $scope, vm, modalInstance, $httpBackend,
            dadosCursos = {"id":1,"list":[{"id":1,"text":"Sistemas de Informação","turmas":[{"id":11,"text":"SI1","disciplinas":[{"id":111,"text":"Cálculo I"},{"id":222,"text":"Programação I"}]},{"id":22,"text":"SI2","disciplinas":[{"id":111,"text":"Cálculo II"},{"id":222,"text":"Programação II"}]}]},{"id":2,"text":"Engenharia Elétrica","turmas":[{"id":11,"text":"EE1","disciplinas":[{"id":111,"text":"Geometria Analítica"},{"id":222,"text":"Cálculo I"}]},{"id":22,"text":"EE2","disciplinas":[{"id":111,"text":"Cálculo II"},{"id":222,"text":"Circuitos Elétricos"}]}]}]},
            template = {"template":{"curso":{"label":"Curso","type":"select","name":"curso","placeholder":"Selecione...","model":{"val":"","err":""},"list":[]},"turma":{"label":"Turma","type":"select","name":"turma","placeholder":"Selecione...","model":{"val":"","err":""},"list":[]},"disciplina":{"label":"Disciplina","type":"select","name":"disciplina","placeholder":"Selecione...","model":{"val":"","err":""},"list":[]},"titulo":{"label":"Título","type":"text","name":"titulo","model":{"val":"","err":""}},"numero":{"label":"Número","type":"text","name":"numero","model":{"val":"","err":""}},"data":{"label":"Data","type":"text","model":{"val":"","err":""},"name":"data","format":"dd/MM/yyyy"},"texto":{"label":"Texto","type":"textarea","name":"texto","rows":7,"model":{"val":"","err":""}}}};


        beforeEach(function() {
            module('app');
            inject(function($injector, _$controller_, _$httpBackend_) {
                $scope = $injector.get('$rootScope').$new();
                $httpBackend = _$httpBackend_;

                // Requisição do servidor
                $httpBackend.when('GET','/api/secretaria/dados-enviar-circular').respond(200, dadosCursos);
                $httpBackend.when('GET','/api/secretaria/template-enviar-circular').respond(200, template);

                // Definindo controller
                vm = _$controller_('enviarCircular', {"$scope": $scope});
            });
        });


        describe('-> Definição do enviarCircular', function() {
            it('-> enviarCircular definido', function () {
                expect(vm).toBeDefined();
            });
        });


        describe('-> Definição das variáveis comuns do controller', function() {
            it('-> Verificando variáveis', function () {
                expect(vm._model).toBeDefined();
                expect(vm.disableTurma).toBeTruthy();
                expect(vm.disableDisciplina).toBeTruthy();
            });
        });


        describe('-> Definindo _model', function() {
            it('-> Verificando _model', function () {
                // fazendo a atribuição dos cursos para o modelo
                template.template.curso.list = dadosCursos.list;

                $httpBackend.flush();
                expect(vm._model).toEqual(template.template);
            });
        });


        describe('-> Definindo cadastro', function() {
            it('-> Preenchendo os campos e validando', function () {
                $httpBackend.flush();
            // Selecionando curso
                vm.changeCurso(vm._model.curso.list[0], vm._model.curso.list[0].id);
                expect(vm._model.turma.list).toEqual(vm._model.curso.list[0].turmas);
                expect(vm.disableTurma).not.toBeTruthy();
                expect(vm.disableDisciplina).toBeTruthy();

            // Selecionando curso
                vm.changeTurma(vm._model.turma.list[0], vm._model.turma.list[0].id);
                expect(vm._model.disciplina.list).toEqual(vm._model.turma.list[0].disciplinas);
                expect(vm.disableDisciplina).not.toBeTruthy();

            // Selecionando disciplina
                vm._model.disciplina.model.val = vm._model.disciplina.list[0].id;
            // Preenchendo o restante dos campos
                vm._model.titulo.model.val = "Teste unitário";
                vm._model.numero.model.val = 1001;
                vm._model.data.model.val = new Date();
                vm._model.texto.model.val = "Teste unitário - enviarCirculat";

                vm.limpar();
            });
        });
    });
})();