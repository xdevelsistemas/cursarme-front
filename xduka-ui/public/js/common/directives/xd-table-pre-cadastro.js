(function () {
    'use strict';
    angular.module('common.directives').directive('xdTablePreCadastro', ['$timeout',
            function ($timeout) {

                var dataTable = function(){
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

                            }
                        });
                    }catch(err){
                        $('.tableOnError').attr({'style': 'display: block'});
                    }
                };


                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-table-pre-cadastro.html',
                    scope: {
                        disable: '=',
                        params: '=',
                        cond: '='
                    },
                    link: function(elem, attr){
                        $timeout(function(){
                            dataTable();
                            $('.tableLoading').attr({'style': 'display: none'});
                        },1500)
                    }
                };

            }
        ]);
})();