(function() {
    'use strict';

    angular.module('common.services').factory('reportService', ['$resource', '$sce', function($resource,$sce) {
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
                    vm.dadosReport = {};

                    vm.dadosReport.myParams = {
                        "template": {"content": vm.report.template, "recipe": "phantom-pdf"},
                        "data": vm.report.data
                    };
                    vm.dadosReport.responseType = 'arraybuffer';

                    $resource('/api/common/dados-template-report').get(vm.dadosReport).$promise
                        .then(function(response){
                            if (response.statusResponse) {
                                var file = new Blob([response.data], {type: 'application/pdf'});
                                var fileURL = URL.createObjectURL(file);

                                vm.report.content = $sce.trustAsResourceUrl(fileURL);
                            } else {
                                console.log('Service report error');
                                console.log(response);
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