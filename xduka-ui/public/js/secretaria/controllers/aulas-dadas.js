(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('aulasDadas', ['$scope', '$resource', '$timeout', '$route', 'breadCrumb', 'modelStrings', 'defineUnidade', 'modelMenu', '$location', 'alunoService', 'ngProgressFactory', 'dataUser',
        function($scope, $resource, $timeout, $route, breadCrumb, modelStrings, defineUnidade, modelMenu, $location, alunoService, ngProgressFactory, dataUser) {

            /* PROGRESS BAR */
            $scope.progressbar = ngProgressFactory.createInstance();
            $scope.progressbar.setColor('#45A0CF');
            $scope.progressbar.start();

            var dadosAulasPromise = $resource('/api/secretaria/dados-aulas-dadas').get().$promise;

            /* jshint validthis: true */
            var vm = this;

            // VARIÁVEIS COMUNS
            vm._model = {};
            vm.tableCronograma = {
                id: 'tableCronograma',
                columnDefs: []
            };

            //Variáveis de funções
            vm.limpar = limpar;
            vm.salvar = salvar;
            vm.voltar = voltar;


            dadosAulasPromise
                .then(function(data){
                    vm.tableCronograma.data = data.template.body;
                    vm.tableCronograma.columnDefs = data.template.columnDefs;
                        /*.map(function(el){
                        var data = new Date(el.data);
                        //el.data = data.toLocaleDateString();
                        return el;
                    });*/
                    vm._model = data.modal;
                })
                .catch(function(err){
                    console.log(err);
                });

            function _valida(){
                var ret = true;
                for(var i in vm._model){
                    if(!vm._model[i].model.val){
                        vm._model[i].model.err = 'Campo obrigatório!';
                        ret = false;
                    }else{
                        vm._model[i].model.err = '';
                    }
                }
                return ret;
            }

            function limpar(){
                var el;
                for(el in vm._model){
                    if(angular.isDefined(vm._model[el].model)){
                        vm._model[el].model.val = "";
                        vm._model[el].model.err = "";
                    }
                }
            }

            function salvar(){
                if(_valida()){
                    $resource('/api/secretaria/save-aulas-dadas').save({},vm._model).$promise
                        .then(function(data){
                            limpar();
                            vm.tableCronograma.data = data.dados;
                            $('#modalNovoProf').modal('hide');
                        })
                        .catch(function(err){
                            console.log(err);
                        });
                }
            }

            function voltar(){
                $location.path('/pedagogico');
                $location.replace();
            }

            $scope.progressbar.complete();
        }]);
})();