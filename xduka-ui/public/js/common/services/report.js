(function() {
    'use strict';

    angular.module('common.services').factory('reportService', ['$http', '$sce', function($http,$sce) {
        var vm = this;
        vm.report = {
            content: {}, //Conteúdo que vai na tag object para formar o PDF
            data: {}, //Objeto que vão os dados que interagem no template
            gerar: gerar, //Função para gerar o PDF passando a url do template como parametro
            template: '' //String do template (preenchida automaticamente caso use a função setTemplate)
        };
        return vm.report;

        function gerar(templateUrl) {
            /* REQ DO TEMPLATE */
            var reqTemp = $.ajax({
                type: "GET",
                url: templateUrl,
                dataType: "html"});

            reqTemp

                .success( function( data ) {

                    vm.report.template = data;


                    var myParams = {
                        "template": {"content": vm.report.template, "recipe": "phantom-pdf"},
                        "data": vm.report.data
                    };

                    $http.post('https://localhost/api/report',myParams, {responseType:'arraybuffer'})
                        .success(function (response) {
                            var file = new Blob([response], {type: 'application/pdf'});
                            var fileURL = URL.createObjectURL(file);

                            console.log(response.toString());
                            if(fileURL != ""){
                                // vm.report.content = $sce.trustAsResourceUrl(fileURL);
                                window.open($sce.trustAsResourceUrl(fileURL), '_blank');
                            }

                        })
                        .catch(function(err){
                            console.log('Service report error');
                            console.log(err)
                        });

                })
                .error(function(err){
                    console.log('Service report error (URL TEMPLATE)');
                    console.log(err)
                });
        }
    }]);
})();