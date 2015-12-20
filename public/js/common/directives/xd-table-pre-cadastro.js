(function () {
    'use strict';
    angular.module('common.directives').directive('xdTablePreCadastro', ['$timeout',
            function ($timeout) {


                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-table-pre-cadastro.html',
                    scope: {
                        disable: '=',
                        params: '=',
                        cond: '=',
                        pos: '=',
                        pdf: '='
                    },
                    link: function(elem, attr,scope){
                        $timeout(function(){
                            dataTable(scope);
                            $('.tableLoading').attr({'style': 'display: none'});
                            $('.divTable').attr({'style': 'display: block'});
                        },2000)
                    }
                };

                function dataTable(scope){
                    try {
                        $('.xd-table-pre').DataTable({
                            "language": {
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

                            },
                            "order": [[ (scope.pos||0), "asc" ]]
                        });
                    }catch(err){
                        $('.tableOnError').attr({'style': 'display: block'});
                    }
                }



            }
        ]);
})();