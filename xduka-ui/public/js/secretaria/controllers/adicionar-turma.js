(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('adicionarTurma', ['$scope', '$resource', 'breadCrumb', '$timeout', '$route', 'modelStrings', 'defineUnidade', '$http',
        function($scope, $resource, breadCrumb, $timeout, $route, modelStrings, defineUnidade, $http){

            var vm = this,
                templateAdicionarTurma = $resource('/api/secretaria/template-add-turma/:id').get({"id": defineUnidade.getIdUnidade()}).$promise;

            //VARIÁVEIS COMUNS
            breadCrumb.title = 'Adicionar Turma';
            vm._model = {};
            vm.disableCurso = true;
            vm.disablePeriodo = true;
            vm.tableTurmas = {
                "id": "tableTurmas",
                "dataTable": false,
                "class": "table table-striped table-bordered table-hover",
                "head": ["Nome","Descrição/Apelido", "Turno", "Modalidade", "Grade", ""],
                "list": []
            };


            //VARIÁVEIS TIPO FUNÇÕES
            vm.cursoChange = cursoChange;
            vm.periodoChange = periodoChange;
            vm.tipoCursoChange = tipoCursoChange;



            /* PROMISES */
            templateAdicionarTurma
                .then(function(data){
                    vm._model = data;
                })
                .catch(function(err){
                    console.log(err);
                });


            /* FUNÇÕES */

            function cursoChange(item, model){
                vm._model.periodo.listAux.forEach(function(elem, index, array){

                    if (elem.length == 1) {
                        if (elem[0].id.indexOf(model) != -1) {
                            vm._model.periodo.list.push(elem[0])
                        }
                    }else{
                        for (var i = 0; i < elem.length; i++) {
                            if (elem[i].indexOf(model) != -1) {
                                vm._model.periodo.list.push(elem[i])
                            }
                        }
                    }

                });
                vm._model.periodo.listAux = [];

                vm._model.periodo.model.val = '';
                vm.disablePeriodo = false;

            }

            function editTurma(args, line){
                console.log('Editar: \n', line);
            }

            function periodoChange(item, model) {
                vm.tableTurmas.list = [];
                $http({
                    url: '/api/secretaria/showTurmas/',
                    method: "GET",
                    params: {
                        curso: vm._model.curso.model.val,
                        periodo: model
                    }
                }).then(
                    function(data){
                        data.data.forEach(function (elem, index, array) {
                            vm.tableTurmas.list.push({
                                'anome': elem.nome,
                                'bdescricao': elem.apelido,
                                'cturno': elem.turno.text,
                                'dmodalidade': elem.modalidade.text,
                                'egrade': elem.grade,
                                'fbtn': {
                                    btn: true,
                                    list: [
                                        {
                                            class: 'btn btn-white',
                                            entypo: 'entypo-pencil',
                                            click: editTurma
                                        }
                                    ]
                                }
                            })
                        })
                    },
                    function(err){
                        console.log(err)
                    });
            }

            function tipoCursoChange(item, model) {
                var getCursos = $http({
                    url: '/api/secretaria/cursos/'+model,
                    method: "GET"
                }).then(
                    function(data){
                        vm._model.curso.list = data.data.listCursos;
                        vm._model.curso.model.val = '';

                        vm._model.periodo.model.val = '';
                        vm._model.periodo.list = [];
                        vm._model.periodo.listAux = data.data.listPeriodos;
                        
                        vm.disableCurso = false;
                        vm.disablePeriodo = true;
                    },
                    function(err) {
                        console.log(err)
                    }
                )

            }

        }])
})();