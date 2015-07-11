describe('Controller: FormPreCadastro test', function() {

    var $scope, pre, $httpbackend;

    beforeEach(function() {
        module('app');
        inject(function($injector, $controller) {
            $scope = $injector.get('$rootScope').$new();
            //$httpbackend = $injector.get('$httpBackend');
            pre = $controller('FormPreCadastro', {"$scope": $scope});
            //$httpbackend.when('GET', '/api/comercial/view-inscr').responde([{}]);
        });
    });

    it('-> controller FormPreCadastro foi definido', function() {
        expect(pre).toBeDefined();
    });

    it('-> Buscando pre-cadastros ativos', function() {
        //$httpbackend.flush();
        expect(pre._viewInscr.list).toEqual([
                {
                    "validacoes":[{}],
                    "nome":{
                        "model":{
                            "val":"João das Couves"
                        }
                    },
                    "endereco":{
                        "model":{
                            "val":""
                        }
                    },
                    "tipoTelefone":{
                        "model":{
                            "val":"cel"
                        }
                    },
                    "telefone":{
                        "model":{
                            "val":"27999999999"
                        }
                    },
                    "email":{
                        "model":{
                            "val":"comercial@email.com"
                        }
                    },
                    "cidade":{
                        "model":{
                            "val":"Serra"
                        }
                    },
                    "cep":{
                        "model":{
                            "val":"29290000"
                        }
                    },
                    "rg":{
                        "model":{
                            "val":"0123450"
                        }
                    },
                    "dataExp":{
                        "model":{
                            "val":""
                        }
                    },
                    "orgaoEmissor":{
                        "model":{
                            "val":""
                        }
                    },
                    "cpf":{
                        "model":{
                            "val":"01234567890"
                        }
                    },
                    "tituloEleitor":{
                        "model":{
                            "val":""
                        }
                    },
                    "zona":{
                        "model":{
                            "val":""
                        }
                    },
                    "secao":{
                        "model":{
                            "val":""
                        }
                    },
                    "ufTitulo":{
                        "model":{
                            "val":""
                        }
                    },
                    "certidaoNc":{
                        "model":{
                            "val":""
                        }
                    },
                    "folha":{
                        "model":{
                            "val":""
                        }
                    },
                    "livro":{
                        "model":{
                            "val":""
                        }
                    },
                    "cartorio":{
                        "model":{
                            "val":""
                        }
                    },
                    "certificadoRes":{
                        "model":{
                            "val":""
                        }
                    },
                    "registro":{
                        "model":{
                            "val":""
                        }
                    },
                    "ufReservista":{
                        "model":{
                            "val":""
                        }
                    },
                    "categoria":{
                        "model":{
                            "val":""
                        }
                    },
                    "sexo":{
                        "model":{
                            "val":""
                        }
                    },
                    "dataNasc":{
                        "model":{
                            "val":""
                        }
                    },
                    "raca":{
                        "model":{
                            "val":""
                        }
                    },
                    "estadoCivil":{
                        "model":{
                            "val":""
                        }
                    },
                    "pai":{
                        "model":{
                            "val":""
                        }
                    },
                    "mae":{
                        "model":{
                            "val":""
                        }
                    },
                    "avRua":{
                        "model":{
                            "val":""
                        }
                    },
                    "endNum":{
                        "model":{
                            "val":""
                        }
                    },
                    "apt":{
                        "model":{
                            "val":""
                        }
                    },
                    "bairro":{
                        "model":{
                            "val":""
                        }
                    },
                    "endUf":{
                        "model":{
                            "val":""
                        }
                    },
                    "nacionalidade":{
                        "model":{
                            "val":""
                        }
                    },
                    "naturalidade":{
                        "model":{
                            "val":""
                        }
                    },
                    "natUf":{
                        "model":{
                            "val":""
                        }
                    },
                    "unidade":{
                        "model":{
                            "val":1,
                            "text":"Vitória"
                        }
                    },
                    "tipoCurso":{
                        "model":{
                            "val":11
                        }
                    },
                    "area":{
                        "model":{
                            "val":11
                        }
                    },
                    "curso":{
                        "model":{
                            "val":222,
                            "text":"Economia"
                        }
                    },
                    "vagas":{
                        "turma":"Turma A",
                        "preenchidas": 12,
                        "totais": 20
                    },
                    "escolaEm":{
                        "model":{
                            "val":""
                        }
                    },
                    "anoEm":{
                        "model":{
                            "val":""
                        }
                    },
                    "cursoGrad":{
                        "model":{
                            "val":""
                        }
                    },
                    "anoGrad":{
                        "model":{
                            "val":""
                        }
                    },
                    "instituicao":{
                        "model":{
                            "val":""
                        }
                    },
                    "valorInscricao":{
                        "model":{
                            "val":190
                        }
                    },
                    "formaPagamentoInscr":{
                        "model":{
                            "val":1
                        }
                    },
                    "descontoInscr":{
                        "model":{
                            "val":0
                        }
                    },
                    "valorIntegral":{
                        "model":{
                            "val":12762
                        }
                    },
                    "desconto":{
                        "model":{
                            "val":22.09
                        }
                    },
                    "formaPagamentoPag":{
                        "model":{
                            "val":1
                        }
                    },
                    "qtdParcelas":{
                        "model":{
                            "val":5
                        }
                    },
                    "valorParcela":{
                        "model":{
                            "val":2552.4
                        }
                    },
                    "melhorData":{
                        "model":{
                            "val":12
                        }
                    },
                    "observacoes":{
                        "model":{
                            "val":""
                        }
                    },
                    "listaCheques":[

                    ]
                },
                {
                    "validacoes":[{}],
                    "nome":{
                        "model":{
                            "val":"Mariana Ramos"
                        }
                    },
                    "endereco":{
                        "model":{
                            "val":""
                        }
                    },
                    "tipoTelefone":{
                        "model":{
                            "val":"cel"
                        }
                    },
                    "telefone":{
                        "model":{
                            "val":"27999999999"
                        }
                    },
                    "email":{
                        "model":{
                            "val":"comercial@email.com"
                        }
                    },
                    "cidade":{
                        "model":{
                            "val":"Serra"
                        }
                    },
                    "cep":{
                        "model":{
                            "val":"29156030"
                        }
                    },
                    "rg":{
                        "model":{
                            "val":"0123450"
                        }
                    },
                    "dataExp":{
                        "model":{
                            "val":""
                        }
                    },
                    "orgaoEmissor":{
                        "model":{
                            "val":""
                        }
                    },
                    "cpf":{
                        "model":{
                            "val":"65854570564"
                        }
                    },
                    "tituloEleitor":{
                        "model":{
                            "val":""
                        }
                    },
                    "zona":{
                        "model":{
                            "val":""
                        }
                    },
                    "secao":{
                        "model":{
                            "val":""
                        }
                    },
                    "ufTitulo":{
                        "model":{
                            "val":""
                        }
                    },
                    "certidaoNc":{
                        "model":{
                            "val":""
                        }
                    },
                    "folha":{
                        "model":{
                            "val":""
                        }
                    },
                    "livro":{
                        "model":{
                            "val":""
                        }
                    },
                    "cartorio":{
                        "model":{
                            "val":""
                        }
                    },
                    "certificadoRes":{
                        "model":{
                            "val":""
                        }
                    },
                    "registro":{
                        "model":{
                            "val":""
                        }
                    },
                    "ufReservista":{
                        "model":{
                            "val":""
                        }
                    },
                    "categoria":{
                        "model":{
                            "val":""
                        }
                    },
                    "sexo":{
                        "model":{
                            "val":""
                        }
                    },
                    "dataNasc":{
                        "model":{
                            "val":""
                        }
                    },
                    "raca":{
                        "model":{
                            "val":""
                        }
                    },
                    "estadoCivil":{
                        "model":{
                            "val":""
                        }
                    },
                    "pai":{
                        "model":{
                            "val":""
                        }
                    },
                    "mae":{
                        "model":{
                            "val":""
                        }
                    },
                    "avRua":{
                        "model":{
                            "val":""
                        }
                    },
                    "endNum":{
                        "model":{
                            "val":""
                        }
                    },
                    "apt":{
                        "model":{
                            "val":""
                        }
                    },
                    "bairro":{
                        "model":{
                            "val":""
                        }
                    },
                    "endUf":{
                        "model":{
                            "val":""
                        }
                    },
                    "nacionalidade":{
                        "model":{
                            "val":""
                        }
                    },
                    "naturalidade":{
                        "model":{
                            "val":""
                        }
                    },
                    "natUf":{
                        "model":{
                            "val":""
                        }
                    },
                    "unidade":{
                        "model":{
                            "val":2,
                            "text": "Cariacica"
                        }
                    },
                    "tipoCurso":{
                        "model":{
                            "val":11
                        }
                    },
                    "area":{
                        "model":{
                            "val":11
                        }
                    },
                    "curso":{
                        "model":{
                            "val":111,
                            "text" :"Medicina"
                        }
                    },
                    "vagas":{
                        "turma":"Turma B",
                        "preenchidas": 25,
                        "totais": 30
                    },
                    "escolaEm":{
                        "model":{
                            "val":""
                        }
                    },
                    "anoEm":{
                        "model":{
                            "val":""
                        }
                    },
                    "cursoGrad":{
                        "model":{
                            "val":""
                        }
                    },
                    "anoGrad":{
                        "model":{
                            "val":""
                        }
                    },
                    "instituicao":{
                        "model":{
                            "val":""
                        }
                    },
                    "valorInscricao":{
                        "model":{
                            "val":190
                        }
                    },
                    "formaPagamentoInscr":{
                        "model":{
                            "val":2
                        }
                    },
                    "descontoInscr":{
                        "model":{
                            "val":0
                        }
                    },
                    "valorIntegral":{
                        "model":{
                            "val":930
                        }
                    },
                    "desconto":{
                        "model":{
                            "val":25.5
                        }
                    },
                    "formaPagamentoPag":{
                        "model":{
                            "val":1
                        }
                    },
                    "qtdParcelas":{
                        "model":{
                            "val":3
                        }
                    },
                    "valorParcela":{
                        "model":{
                            "val":310
                        }
                    },
                    "melhorData":{
                        "model":{
                            "val":10
                        }
                    },
                    "observacoes":{
                        "model":{
                            "val":""
                        }
                    },
                    "listaCheques":[
                        {
                            "banco":{
                                "id":"012",
                                "text":"012 - BANCO GUANABARA S.A."
                            },
                            "agencia":"123",
                            "conta":"4657",
                            "numero":"817648716487165",
                            "data":1436929200000,
                            "valor":123.03,
                            "titular":"Mariana Ramos"
                        }
                    ]
                },
                {
                    "validacoes":[{}],
                    "nome":{
                        "model":{
                            "val":"Pedro Nascimento"
                        }
                    },
                    "endereco":{
                        "model":{
                            "val":""
                        }
                    },
                    "tipoTelefone":{
                        "model":{
                            "val":"cel"
                        }
                    },
                    "telefone":{
                        "model":{
                            "val":"27999999999"
                        }
                    },
                    "email":{
                        "model":{
                            "val":"comercial@email.com"
                        }
                    },
                    "cidade":{
                        "model":{
                            "val":"Serra"
                        }
                    },
                    "cep":{
                        "model":{
                            "val":"29175254"
                        }
                    },
                    "rg":{
                        "model":{
                            "val":"0123450"
                        }
                    },
                    "dataExp":{
                        "model":{
                            "val":""
                        }
                    },
                    "orgaoEmissor":{
                        "model":{
                            "val":""
                        }
                    },
                    "cpf":{
                        "model":{
                            "val":"19504036708"
                        }
                    },
                    "tituloEleitor":{
                        "model":{
                            "val":""
                        }
                    },
                    "zona":{
                        "model":{
                            "val":""
                        }
                    },
                    "secao":{
                        "model":{
                            "val":""
                        }
                    },
                    "ufTitulo":{
                        "model":{
                            "val":""
                        }
                    },
                    "certidaoNc":{
                        "model":{
                            "val":""
                        }
                    },
                    "folha":{
                        "model":{
                            "val":""
                        }
                    },
                    "livro":{
                        "model":{
                            "val":""
                        }
                    },
                    "cartorio":{
                        "model":{
                            "val":""
                        }
                    },
                    "certificadoRes":{
                        "model":{
                            "val":""
                        }
                    },
                    "registro":{
                        "model":{
                            "val":""
                        }
                    },
                    "ufReservista":{
                        "model":{
                            "val":""
                        }
                    },
                    "categoria":{
                        "model":{
                            "val":""
                        }
                    },
                    "sexo":{
                        "model":{
                            "val":""
                        }
                    },
                    "dataNasc":{
                        "model":{
                            "val":""
                        }
                    },
                    "raca":{
                        "model":{
                            "val":""
                        }
                    },
                    "estadoCivil":{
                        "model":{
                            "val":""
                        }
                    },
                    "pai":{
                        "model":{
                            "val":""
                        }
                    },
                    "mae":{
                        "model":{
                            "val":""
                        }
                    },
                    "avRua":{
                        "model":{
                            "val":""
                        }
                    },
                    "endNum":{
                        "model":{
                            "val":""
                        }
                    },
                    "apt":{
                        "model":{
                            "val":""
                        }
                    },
                    "bairro":{
                        "model":{
                            "val":""
                        }
                    },
                    "endUf":{
                        "model":{
                            "val":""
                        }
                    },
                    "nacionalidade":{
                        "model":{
                            "val":""
                        }
                    },
                    "naturalidade":{
                        "model":{
                            "val":""
                        }
                    },
                    "natUf":{
                        "model":{
                            "val":""
                        }
                    },
                    "unidade":{
                        "model":{
                            "val":3,
                            "text":"São Mateus"
                        }
                    },
                    "tipoCurso":{
                        "model":{
                            "val":22
                        }
                    },
                    "area":{
                        "model":{
                            "val":11
                        }
                    },
                    "curso":{
                        "model":{
                            "val":111,
                            "text":"Matemática"
                        }
                    },
                    "vagas":{
                        "turma":"Turma C",
                        "preenchidas": 14,
                        "totais": 22
                    },
                    "escolaEm":{
                        "model":{
                            "val":""
                        }
                    },
                    "anoEm":{
                        "model":{
                            "val":""
                        }
                    },
                    "cursoGrad":{
                        "model":{
                            "val":""
                        }
                    },
                    "anoGrad":{
                        "model":{
                            "val":""
                        }
                    },
                    "instituicao":{
                        "model":{
                            "val":""
                        }
                    },
                    "valorInscricao":{
                        "model":{
                            "val":190
                        }
                    },
                    "formaPagamentoInscr":{
                        "model":{
                            "val":2
                        }
                    },
                    "descontoInscr":{
                        "model":{
                            "val":0
                        }
                    },
                    "valorIntegral":{
                        "model":{
                            "val":930
                        }
                    },
                    "desconto":{
                        "model":{
                            "val":25.5
                        }
                    },
                    "formaPagamentoPag":{
                        "model":{
                            "val":1
                        }
                    },
                    "qtdParcelas":{
                        "model":{
                            "val":10
                        }
                    },
                    "valorParcela":{
                        "model":{
                            "val":93
                        }
                    },
                    "melhorData":{
                        "model":{
                            "val":12
                        }
                    },
                    "observacoes":{
                        "model":{
                            "val":""
                        }
                    },
                    "listaCheques":[
                        {
                            "banco":{
                                "id":"012",
                                "text":"012 - BANCO GUANABARA S.A."
                            },
                            "agencia":"123",
                            "conta":"4657",
                            "numero":"817648716487165",
                            "data":1436929200000,
                            "valor":123.03,
                            "titular":"Pedro Nascimento"
                        },
                        {
                            "banco":{
                                "id":"012",
                                "text":"012 - BANCO GUANABARA S.A."
                            },
                            "agencia":"123",
                            "conta":"4657",
                            "numero":"817665465468464",
                            "data":1436929200000,
                            "valor":132.03,
                            "titular":"Pedro Nascimento"
                        }
                    ]
                },
                {
                    "validacoes":[],
                    "nome":{
                        "model":{
                            "val":"Abner dos Santos"
                        }
                    },
                    "endereco":{
                        "model":{
                            "val":""
                        }
                    },
                    "tipoTelefone":{
                        "model":{
                            "val":"cel"
                        }
                    },
                    "telefone":{
                        "model":{
                            "val":"27999999999"
                        }
                    },
                    "email":{
                        "model":{
                            "val":"comercial@email.com"
                        }
                    },
                    "cidade":{
                        "model":{
                            "val":"Serra"
                        }
                    },
                    "cep":{
                        "model":{
                            "val":"29170010"
                        }
                    },
                    "rg":{
                        "model":{
                            "val":"0123450"
                        }
                    },
                    "dataExp":{
                        "model":{
                            "val":""
                        }
                    },
                    "orgaoEmissor":{
                        "model":{
                            "val":""
                        }
                    },
                    "cpf":{
                        "model":{
                            "val":"44158457700"
                        }
                    },
                    "tituloEleitor":{
                        "model":{
                            "val":""
                        }
                    },
                    "zona":{
                        "model":{
                            "val":""
                        }
                    },
                    "secao":{
                        "model":{
                            "val":""
                        }
                    },
                    "ufTitulo":{
                        "model":{
                            "val":""
                        }
                    },
                    "certidaoNc":{
                        "model":{
                            "val":""
                        }
                    },
                    "folha":{
                        "model":{
                            "val":""
                        }
                    },
                    "livro":{
                        "model":{
                            "val":""
                        }
                    },
                    "cartorio":{
                        "model":{
                            "val":""
                        }
                    },
                    "certificadoRes":{
                        "model":{
                            "val":""
                        }
                    },
                    "registro":{
                        "model":{
                            "val":""
                        }
                    },
                    "ufReservista":{
                        "model":{
                            "val":""
                        }
                    },
                    "categoria":{
                        "model":{
                            "val":""
                        }
                    },
                    "sexo":{
                        "model":{
                            "val":""
                        }
                    },
                    "dataNasc":{
                        "model":{
                            "val":""
                        }
                    },
                    "raca":{
                        "model":{
                            "val":""
                        }
                    },
                    "estadoCivil":{
                        "model":{
                            "val":""
                        }
                    },
                    "pai":{
                        "model":{
                            "val":""
                        }
                    },
                    "mae":{
                        "model":{
                            "val":""
                        }
                    },
                    "avRua":{
                        "model":{
                            "val":""
                        }
                    },
                    "endNum":{
                        "model":{
                            "val":""
                        }
                    },
                    "apt":{
                        "model":{
                            "val":""
                        }
                    },
                    "bairro":{
                        "model":{
                            "val":""
                        }
                    },
                    "endUf":{
                        "model":{
                            "val":""
                        }
                    },
                    "nacionalidade":{
                        "model":{
                            "val":""
                        }
                    },
                    "naturalidade":{
                        "model":{
                            "val":""
                        }
                    },
                    "natUf":{
                        "model":{
                            "val":""
                        }
                    },
                    "unidade":{
                        "model":{
                            "val":1,
                            "text":"Vitória"
                        }
                    },
                    "tipoCurso":{
                        "model":{
                            "val":11
                        }
                    },
                    "area":{
                        "model":{
                            "val":11
                        }
                    },
                    "curso":{
                        "model":{
                            "val":222,
                            "text":"Economia"
                        }
                    },
                    "vagas":{
                        "turma":"Turma A",
                        "preenchidas":12,
                        "totais":20
                    },
                    "escolaEm":{
                        "model":{
                            "val":""
                        }
                    },
                    "anoEm":{
                        "model":{
                            "val":""
                        }
                    },
                    "cursoGrad":{
                        "model":{
                            "val":""
                        }
                    },
                    "anoGrad":{
                        "model":{
                            "val":""
                        }
                    },
                    "instituicao":{
                        "model":{
                            "val":""
                        }
                    },
                    "valorInscricao":{
                        "model":{
                            "val":190
                        }
                    },
                    "formaPagamentoInscr":{
                        "model":{
                            "val":1
                        }
                    },
                    "descontoInscr":{
                        "model":{
                            "val":0
                        }
                    },
                    "valorIntegral":{
                        "model":{
                            "val":14400
                        }
                    },
                    "desconto":{
                        "model":{
                            "val":12.09
                        }
                    },
                    "formaPagamentoPag":{
                        "model":{
                            "val":1
                        }
                    },
                    "qtdParcelas":{
                        "model":{
                            "val":3
                        }
                    },
                    "valorParcela":{
                        "model":{
                            "val":4800
                        }
                    },
                    "melhorData":{
                        "model":{
                            "val":12
                        }
                    },
                    "observacoes":{
                        "model":{
                            "val":""
                        }
                    },
                    "listaCheques":[

                    ]
                }
            ]);
    });

});