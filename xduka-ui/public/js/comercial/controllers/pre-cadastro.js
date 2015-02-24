define(['./__module__'], function (controllers) {
    'use strict';
    controllers
        .controller('PreCadastro', [
            '$scope', 'breadCrumb', '$http',
            function ($scope, breadCrumb, $http) {

                breadCrumb.title = 'Pré Cadastro';

                var strings = {
                    "info_aluno": "Informações do Aluno",
                    "nome": "Nome",
                    "endereco": "Endereço",
                    "tipo_telefone": "Tipo de Telefone",
                    "selecione_tipo": "Selecione um tipo",
                    "telefone": "Telefone",
                    "email": "E-mail",
                    "info_curso": "Informações do Curso",
                    "unidade": "Unidade",
                    "tipo_curso": "Tipo do Curso",
                    "curso": "Curso",
                    "info_pagamento": "Informações de Pagamento",
                    "parcelamento": "Parcelamento",
                    "melhor_data": "Melhor data de vencimento",
                    "observacoes": "Observações",
                    "efetuar_matricula": "Efetuar Matrícula",
                    "limpar_formulario": "Limpar Formulário"
                };
            }]);
});
