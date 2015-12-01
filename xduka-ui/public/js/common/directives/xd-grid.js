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
                    link: link
                };

                function link(scope,n){
                    if(angular.isUndefined(n) || n===null){
                        n = 0;
                    }
                    try{if (!!scope.params.dataTable&&!!scope.params.id){
                        /* SE A TRADUÇÃO NÃO FOI ALTERADA ASSUMO O PADRÃO DEFINIDO ACIMA */
                        if(!scope.params.dataTable.language){scope.params.dataTable.language = language}

                        $timeout(function(){
                            window['dataTable_'+scope.params.id] = $('#'+scope.params.id).dataTable(
                                scope.params.dataTable
                            );
                            $('#'+'tableLoading_'+scope.params.id).attr({'style': 'display: none'});
                        },2000)
                    }else{$('#'+'tableLoading_'+scope.params.id).attr({'style': 'display: none'});}
                    }catch(err){
                        if(n === 14){
                            $timeout(function(){
                                $('#'+'tableLoading_'+scope.params.id).attr({'style': 'display: none'});
                            }, 2000);
                        }else{
                            return $timeout(link(scope,n+=1),800);
                        }
                    }

                }

            }
        ]);
})();

//