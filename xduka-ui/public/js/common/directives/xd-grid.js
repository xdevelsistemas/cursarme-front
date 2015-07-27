(function () {
    'use strict';
    angular.module('common.directives').directive('xdGrid', ['$timeout',
            function ($timeout) {
                var language = {
                    "lengthMenu": "Mostrar _MENU_ resultados por página",
                    "zeroRecords": "Não encontrado - desculpe",
                    "info": "Vendo a página _PAGE_ de _PAGES_",
                    "infoEmpty": "Resultados não encontrados",
                    "infoFiltered": "(Filtrados de _MAX_ totais)",
                    "search": "Pesquisar",
                    "paginate": {
                        "first": "Primeiro",
                        "last": "Último",
                        "next": "Próximo",
                        "previous": "Anterior"
                    }
                };

                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-grid.html',
                    scope: {
                        disable: '=',
                        params: '='
                    },
                    link: function(scope){
                        try{if (!!scope.params.dataTable&&!!scope.params.id){
                            /* SE A TRADUÇÃO NÃO FOI ALTERADA ASSUMO O PADRÃO DEFINIDO ACIMA */
                            if(!scope.params.dataTable.language){scope.params.dataTable.language = language}

                            $timeout(function(){
                                window['dataTable_'+scope.params.id] = $('#'+scope.params.id).dataTable(
                                    scope.params.dataTable
                                );
                            },2000)
                        }}catch(err){
                            console.log('xdGrid directive: Params provavelmente não está definido! Insira um objeto válido e use data-params no html.')
                        }

                    }
                };

            }
        ]);
})();

//