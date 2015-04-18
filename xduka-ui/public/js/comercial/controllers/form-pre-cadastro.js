define(['./__module__', "jquery"], function (controllers, $) {
    'use strict';
    controllers.controller('FormPreCadastro', [
        '$scope', '$timeout', '$modal', '$http', 'lista_cheques',
        function ($scope, $timeout, $modal, $http, lista_cheques) {
            // ==== MODELOS ==== //
            $scope._model = {};
            $scope._model.aluno = {
                "label": "Foto",
                "name": "foto",
                "nome": {
                    "label": "Nome",
                    "type": "text",
                    "name": "nome",
                    "help": "Campo obrigatório",
                    "required": true,
                    "model": {"err": "", "val": ""}
                },
                "endereco": {
                    "label": "Edereço",
                    "type": "text",
                    "name": "endereco",
                    "help": "Campo obrigatório",
                    "required": true,
                    "model": {"err": "", "val": ""}
                },
                "tipo_telefone": {
                    "label": "Tipo de telefone",
                    "type": "select",
                    "name": "tipo_telefone",
                    "help": "Campo obrigatório",
                    "placeholder": "Selecione uma opção",
                    "required": true,
                    "list": [
                        {
                            "id": "res",
                            "text": "Residencial"
                        },
                        {
                            "id": "com",
                            "text": "Comercial"
                        },
                        {
                            "id": "cel",
                            "text": "Celular"
                        }
                    ],
                    "model": {"err": "", "val": ""}
                },
                "telefone": {
                    "label": "Telefone",
                    "type": "text",
                    "mask": "(99) 9999-9999",
                    "name": "telefone",
                    "help": "Campo obrigatório",
                    "required": true,
                    "model": {"err": "", "val": ""}
                },
                "email": {
                    "label": "Email",
                    "type": "email",
                    "name": "email",
                    "help": "Campo obrigatório",
                    "required": true,
                    "model": {"err": "", "val": ""}
                }
            };
            $scope._model.curso = {
                label: "Informações do Curso",
                name: "curso",
                unidade: {
                    label: "Unidade",
                    type: "select",
                    name: 'unidade',
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma opção",
                    required: true,
                    list: [
                        {
                            id: "1",
                            text: "Unidade 01"
                        },
                        {
                            id: "2",
                            text: "Unidade 02"
                        },
                        {
                            id: "3",
                            text: "Unidade 03"
                        }
                    ],
                    model: {err: "", val: ""}
                },
                area: {
                    label: "Área",
                    type: "select",
                    name: "area",
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma opção",
                    required: true,
                    list: [{id: 1, text: "Area 00"}],
                    model: {err: "", val: ""}
                },
                curso: {
                    label: "Curso",
                    type: "select",
                    name: "curso",
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma opção",
                    required: true,
                    list: [{id: 1, text: "Curso 00"}],
                    model: {err: "", val: ""}
                },
                vagas: {
                    str: {
                        totais: "vagas totais",
                        disponiveis: "Vagas disponíveis"
                    },
                    preenchidas: 50,
                    totais: 100,
                    isEnding: function () {
                        return (this.preenchidas / (this.totais == 0 ? 1 : this.totais) >= 0.9 ? true : false);
                    },
                    getDisponiveis: function () {
                        return (parseInt(this.totais) - parseInt(this.preenchidas));
                    }
                }
            };
            $scope._model.inscr = {
                label: "Informações de Inscrição",
                inscricao: {
                    label: "Inscrição",
                    type: "text",
                    name: "inscr",
                    help: "Campo obrigatório",
                    model: {err: "", val: ""},
                    required: true,
                    mask: ""
                },
                desconto: {
                    label: "Desconto",
                    type: "select",
                    model: {err: "", val: ""},
                    help: "Campo obrigatório",
                    required: true,
                    name: "descontoInscr",
                    list: [
                        {id: 1, text: "Sem desconto"},
                        {id: 2, text: "10%"},
                        {id: 3, text: "20%"}
                    ]
                },
                formaPagamento: {
                    label: "Forma de pagamento",
                    type: "select",
                    model: {err: "", val: ""},
                    help: "Campo obrigatório",
                    required: true,
                    name: "formaPagamento",
                    list: [
                        {id: 1, text: "Dinheiro"},
                        {id: 2, text: "Cheque"},
                        {id: 3, text: "Cartão de Crédito"}
                    ]
                },
                qtdParcelas: {
                    label: "Quantidade de parcelas",
                    type: "select",
                    model: {err: "", val: ""},
                    help: "Campo obrigatório",
                    required: true,
                    name: "qtdParcelas",
                    list: [
                        {id: 1, text:"1"},
                        {id: 2, text: "3"},
                        {id: 3, text: "6"}
                    ]
                },
                melhorData: {
                    label: "Melhor data de vencimento",
                    type: "select",
                    model: {err: "", text:""},
                    help: "Campo obrigatório",
                    name: "melhorData",
                    list: [
                        {id: 1, text: "05"},
                        {id: 2, text: "10"},
                        {id: 3, text: "25"}
                    ]
                }
            };
            $scope._model.documentacao = {
                "label": "Informações complementares do Aluno",
                "label2": "Escolaridade",
                "escolaEm": {
                    "label": "Escola que cursou Ensino Médio",
                    "type": "text",
                    "name": "escolaEm",
                    "help": "Campo obrigatório",
                    "required": false,
                    "model": {"err": "", "val": ""}
                },
                "anoEm": {
                    "label": "Ano de Conclusão",
                    "type": "text",
                    "name": "anoEm",
                    "help": "Campo obrigatório",
                    "required": false,
                    "model": {"err": "", "val": ""}
                },
                "cursoGrad": {
                    "label": "Curso de Graduação",
                    "type": "text",
                    "name": "cursoGrad",
                    "help": "Campo obrigatório",
                    "required": false,
                    "model": {"err": "", "val": ""}
                },
                "anoGrad": {
                    "label": "Ano de Conclusão",
                    "type": "text",
                    "name": "anoGrad",
                    "help": "Campo obrigatório",
                    "required": false,
                    "model": {"err": "", "val": ""}
                },
                "instituicao": {
                    "label": "Nome da instituição onde graduou",
                    "type": "text",
                    "name": "instituicao",
                    "help": "Campo obrigatório",
                    "required": false,
                    "model": {"err": "", "val": ""}
                }
            };
            $scope._model.pagamento = {
                label: "Informações de Pagamento",
                name: "pagamento",
                valorIntegral: {
                    "label": "Valor Integral",
                    "type": "text",
                    "model": {err: "", val: ""},
                    "name": "valorIntegral",
                    "help": "Campo obrigatório",
                    "required": false
                },
                entrada: {
                    label: "Entrada",
                    type: "text",
                    name: 'entrada',
                    help: "Campo obrigatório",
                    required: true,
                    model: {err: "", val: ""}
                },
                desconto: {
                    label: "Desconto",
                    type: "text",
                    name: 'desconto',
                    help: "Campo obrigatório",
                    required: true,
                    model: {err: "", val: ""}
                },
                forma: {
                    label: "Forma de pagamento",
                    type: "select",
                    name: "forma",
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma opção",
                    required: true,
                    list: [
                        {id: "cheque", text: "Cheque"},
                        {id: "cartao", text: "Cartão"}
                    ],
                    model: {err: "", val: ""}
                },
                parcelamento: {
                    label: "Quantidade de parcelas",
                    type: "text",
                    name: 'parcelamento',
                    help: "Campo obrigatório",
                    required: true,
                    model: {err: "", val: ""}
                },
                melhor_data: {
                    label: "Melhor data de vencimento",
                    type: "text",
                    name: 'melhor_data',
                    help: "Campo obrigatório",
                    required: true,
                    format: 'dd/MM/yyyy',
                    opened: false,
                    open: function ($event) {
                        $event.preventDefault();
                        $event.stopPropagation();
                        this.opened = true;
                    },
                    model: {err: "", val: ""}
                },
                observacoes: {
                    label: "Observações",
                    type: "text",
                    name: 'observacoes',
                    help: "Campo obrigatório",
                    required: true,
                    model: {err: "", val: ""}
                }
            };
            $scope._model.controle = {
                label: "Controle Interno",
                name: "controle",
                numero_bloco: {
                    label: "Número do Bloco",
                    type: "text",
                    name: 'numero_bloco',
                    help: "Campo obrigatório",
                    required: true
                }
            };
//            // ==== FORM DATA ==== //
//
//            $scope._novo_cheque = {};
//            $scope.cleanForm();
//            $scope._data = {
//                curso: {
//                    unidade: ''
//                },
//                pagamento: {
//                    lista_cheques: lista_cheques
//                },
//                controle: {}
//            };

            // ==== MÉTODOS ==== //

            $scope.selectPhoneType = function (view) {
                console.log("trocou!");
                console.log("data tipo_telefone", $scope._data.aluno.tipo_telefone);
                $scope._model.aluno.telefone.mask = $scope._data.aluno.tipo_telefone == 'cel' ? '(99) 99999-9999' : '(99) 9999-9999';
            };

            $scope.openModalCheque = function () {
                var modalInstance = $modal.open({
                    templateUrl: '../html/comercial/modal-cheques.html',
                    controller: 'ModalCheques',
                    size: 'lg',
                    id: 'teste'
                });
            };

            $scope.cleanForm = function () {
                lista_cheques.clean();
                $scope._data = {
                    aluno: {},
                    curso: {
                        unidade: ''
                    },
                    pagamento: {
                        lista_cheques: lista_cheques
                    },
                    controle: {}
                };
                $timeout(function () {
                    $('select').select2('destroy');
                    $('select').select2({width: "100%", placeholder: "Selecione uma opção"});
                });
            };

            $scope.sendForm = function () {
                console.log('//=== Formuário enviado:');
                console.log(JSON.stringify($scope._data));
                console.log('====//');
            };

            // ==== REQUISIÇÕES ==== //

            $scope.getAreas = function (view) {
                $timeout(function () {
                    $scope._model.curso.area.list = [
                        {
                            id: "1",
                            text: $scope._data.curso.unidade + " - Área 01"
                        },
                        {
                            id: "2",
                            text: $scope._data.curso.unidade + " - Área 02"
                        },
                        {
                            id: "3",
                            text: $scope._data.curso.unidade + " - Área 03"
                        }
                    ];
                    $scope._data.curso.area = '';
                    $scope._data.curso.curso = '';
                    view.remake('#f_curso_area select');
                }, 1);
            };
            $scope.getCursos = function (view) {
                $timeout(function () {
                    $scope._model.curso.curso.list = [
                        {
                            id: "1",
                            text: $scope._data.curso.unidade + ' - ' +
                                $scope._data.curso.area + " - Curso 01"
                        },
                        {
                            id: "2",
                            text: $scope._data.curso.unidade + ' - ' +
                                $scope._data.curso.area + " - Curso 02"
                        },
                        {
                            id: "3",
                            text: $scope._data.curso.unidade + ' - ' +
                                $scope._data.curso.area + " - Curso 03"
                        }
                    ];
                    $scope._data.curso.curso = '';
                    view.remake('#f_curso_curso select');
                }, 1);
            };
            $scope.getVagas = function (view) {
                $timeout(function () {
                    function getRandomInt(min, max) {
                        return Math.floor(Math.random() * (max - min)) + min;
                    }

                    var a = getRandomInt(100, 201), b = getRandomInt(0, 101);
                    $scope._model.curso.vagas.totais = a;
                    $scope._model.curso.vagas.preenchidas = Math.floor(b * a / 100);
                }, 1);
            };

            $http.get('mock/comercial/info-aluno.json')
                .success(function (data) {
                    $scope._model.aluno = $.extend(true, {}, data.object);
                });

            // ==== FORM DATA ==== //

            $scope._novo_cheque = {};
            $scope.cleanForm();




        }
    ]);
});