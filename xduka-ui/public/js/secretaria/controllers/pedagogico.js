(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('pedagogico', ['$scope', '$resource', 'modelStrings', 'breadCrumb', '$timeout',
            function($scope, $resource, modelStrings, breadCrumb, $timeout){

            var vm = this;

            vm.STR = modelStrings;
            breadCrumb.title = vm.STR.PEDAGOGICO;

            vm.options = [
                {
                    "text": "Pauta",
                    "icon": "entypo-clipboard",
                    "href": "#/secretaria/pauta",
                    "description": "Controle de pautas"
                },
                {
                    "text": "Enviar Circular",
                    "icon": "glyphicon glyphicon-send",
                    "href": "#/secretaria/enviar-circular",
                    "description": "Enviar circular aos alunos"
                },
                {
                    "text": "Material Complementar",
                    "icon": "glyphicon glyphicon-file",
                    "href": "#/secretaria/material-complementar",
                    "description": "Enviar materiais referente ao curso"
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