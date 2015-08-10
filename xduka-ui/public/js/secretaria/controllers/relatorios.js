(function(){
    'use strict';

    angular.module('app.controllers')
        .controller('relatorios', ['$scope', '$resource', 'breadCrumb', '$timeout', '$http', '$sce', function($scope, $resource, breadCrumb, $timeout,$http,$sce){

            var vm = this,
                dados = $resource('/api/secretaria/view-inscr').get().$promise;

            breadCrumb.title = 'Relatórios';

            vm._viewInscr = {};
            vm.data = {persons: []};
            vm.gerar = gerar;
            vm.template = '';


            //Report
            vm.template = "<meta charset=\"utf8\">\n"+
                "<h2>Demonstração</h2>\n"+
                "<table style=\"width:90%;border-style:solid; text-align:left;\">\n"+
                "   <tr>\n"+
                "       <th>Nome</th>\n"+
                "       <th>Turma</th>\n"+
                "       <th>Curso</th>\n"+
                "       <th>Unidade</th>\n"+
                "    </tr>\n"+
                "    {{#each persons}}\n"+
                "        <tr>\n"+
                "            <td>{{Nome}}</td>\n"+
                "            <td>{{Turma}}</td>\n"+
                "            <td>{{Curso}}</td>\n"+
                "            <td>{{Unidade}}</td>\n"+
                "        </tr>\n"+
                "    {{/each}}\n"+
                "</table>";

            dados
                .then(function (data2) {
                    vm._viewInscr = data2;

                    for (var i = 0; i < data2.list.length; i++) {
                        for (var j = 0; j < data2.list[i].listaCheques.length; j++) {
                            vm._viewInscr.list[i].listaCheques[j].data = new Date(data2.list[i].listaCheques[j].data);
                        }
                    }

                    reportData();

                    vm._viewInscr.naoEhComercial = true;
                })
                .catch(function (erro) {
                    console.log("\n" + erro.data + "\n");
                });


            function gerar() {

                var myParams = {
                    "template": {"content": vm.template, "recipe": "phantom-pdf"},
                    "data": JSON.stringify(vm.data)
                };

                $http.post('https://localhost/api/report',myParams, {responseType:'arraybuffer'})
                    .success(function (response) {
                        var file = new Blob([response], {type: 'application/pdf'});
                        var fileURL = URL.createObjectURL(file);

                        vm.content = $sce.trustAsResourceUrl(fileURL);
                    });
            }

            function reportData() {
                for (var i = 0; i < vm._viewInscr.list.length;i++){
                    vm.data.persons.push({
                        Nome: vm._viewInscr.list[i].nome.model.val,
                        Turma: vm._viewInscr.list[i].vagas.turma,
                        Curso: vm._viewInscr.list[i].curso.model.text,
                        Unidade: vm._viewInscr.list[i].unidade.model.text
                    })
                }
                console.log(JSON.stringify(vm.data))
            }


        }])
})();