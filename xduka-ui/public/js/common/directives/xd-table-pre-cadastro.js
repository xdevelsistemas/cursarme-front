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
                /* LOAD BASEADO EM SEQUÊNCIAS DE TIMEOUT */
                (function(){
                    var completo;
                    var timer = $timeout(function (){
                        $('.xd-table-pre').ready(function(){
                            completo = !!$('.xd-table-pre').length;
                        },3000)
                    });
                    timer.then(
                        function(){
                            if (completo){
                                $timeout(function(){
                                    completo = !!$('.xd-table-pre').length;
                                }).then(function(){
                                    if (completo){
                                        dataTable();
                                        $('.tableLoading').attr({'style': 'display: none'});
                                        /*$('.divTable').attr({'style': 'display: block'});*/
                                    }
                                })
                            }else{
                                $timeout(function(){
                                    completo = !!$('.xd-table-pre').length;
                                },5000).then(function(){
                                    if (completo){
                                        dataTable();
                                        $('.tableLoading').attr({'style': 'display: none'});
                                        /*$('.divTable').attr({'style': 'display: block'});*/
                                    }else{
                                        $timeout(function(){
                                            dataTable();
                                            $('.tableLoading').attr({'style': 'display: none'});
                                            /*$('.divTable').attr({'style': 'display: block'});*/
                                            $('.tableOnError').attr({'style': 'display: block'});
                                        },10000)
                                    }
                                })
                            }
                        }
                    );
                    $timeout(function(){
                        if($('.tableLoading').attr('style') == 'display: block'){
                            $('.tableLoading').attr({'style': 'display: none'});
                            $('.tableOnError').attr({'style': 'display: block'});
                        }
                    },20000)
                })();


                return {
                    restrict: "E",
                    replace: true,
                    templateUrl: 'html/common/xd-table-pre-cadastro.html',
                    scope: {
                        disable: '=',
                        params: '=',
                        cond: '='
                    }
                };

            }
        ]);
})();