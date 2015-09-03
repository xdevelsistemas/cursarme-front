(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('pedagogico', ['$scope', '$resource', 'breadCrumb', '$timeout', function($scope, $resource, breadCrumb, $timeout){

            var vm = this;

            breadCrumb.title = 'Pedagógico';

            vm.options = [
                {
                    "text": "Pauta",
                    "icon": "entypo-clipboard",
                    "href": "#/secretaria/pauta",
                    "description": "Controle de pautas"
                },
                {
                    "text": "Adicionar Curso",
                    "icon": "entypo-plus",
                    "href": "#/secretaria/adicionar-curso",
                    "description": "Novos cursos"

                },
                {
                    "text": "Adicionar Disciplina",
                    "icon": "entypo-plus",
                    "href": "#/secretaria/adicionar-disciplina",
                    "description": "Novas disciplinas"
                }
            ];


        }])
})();