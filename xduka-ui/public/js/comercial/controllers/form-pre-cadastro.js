define(['./__module__', "jquery"], function (controllers, $) {
    'use strict';
    
    controllers.controller('FormPreCadastro', [
        '$scope', '$timeout', '$modal', '$http', 'lista_cheques',
        function ($scope, $timeout, $modal, $http, lista_cheques) {
            var vm = this;

            // ==== MODELOS ==== //

            vm._model = {};
            vm._model.aluno = {};
            vm._model.curso = {
                label: "Informações do Curso",
                name: "curso",
                unidade: {
                    label: "Unidade",
                    type: "select",
                    name: 'unidade',
                    value: "1",
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
                    value: "1",
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma opção",
                    required: true,
                    list: [{id: 1, text: "Area 01"}, {id: 2, text: "Area 02"}],
                    model: {err: "", val: ""}
                },
                curso: {
                    label: "Curso",
                    type: "select",
                    name: "curso",
                    value: "1",
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma opção",
                    required: true,
                    list: [{id: 1, text: "Curso 01"}, {id: 2, text: "Curso 02"}],
                    model: {err: "", val: ""}
                },
                vagas: {
                    str: {
                        totais: "vagas totais",
                        disponiveis: "Vagas disponíveis"
                    },
                    preenchidas: 40,
                    totais: 100,
                    isEnding: function () {
                        return (this.preenchidas / (this.totais == 0 ? 1 : this.totais) >= 0.9 ? true : false);
                    },
                    getDisponiveis: function () {
                        return (parseInt(this.totais) - parseInt(this.preenchidas));
                    }
                }
            };
            vm._model.inscr = {
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
            vm._model.documentacao = {
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
            vm._model.pagamento = {
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
            vm._model.controle = {
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
//            vm._novo_cheque = {};
//            vm.cleanForm();
//            vm._data = {
//                curso: {
//                    unidade: ''
//                },
//                pagamento: {
//                    lista_cheques: lista_cheques
//                },
//                controle: {}
//            };

            // ==== MÉTODOS ==== //

            vm.selectPhoneType = function (view) {
                console.log("trocou!");
                console.log("data tipo_telefone", vm._data.aluno.tipo_telefone);
                vm._model.aluno.telefone.mask = vm._data.aluno.tipo_telefone == 'cel' ? '(99) 99999-9999' : '(99) 9999-9999';
            };

            vm.openModalCheque = function () {
                var modalInstance = $modal.open({
                    templateUrl: '../html/comercial/modal-cheques.html',
                    controller: 'ModalCheques',
                    size: 'lg'
                });
            };

            vm.cleanForm = function () {
                lista_cheques.clean();
                vm._data = {
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

            vm.sendForm = function () {
                console.log('//=== Formuário enviado:');
                console.log(JSON.stringify(vm._data));
                console.log('====//');
            };

            // ==== REQUISIÇÕES ==== //

            vm.getAreas = function (view) {
                $timeout(function () {
                    vm._model.curso.area.list = [
                        {
                            id: "1",
                            text: vm._data.curso.unidade + " - Área 01"
                        },
                        {
                            id: "2",
                            text: vm._data.curso.unidade + " - Área 02"
                        },
                        {
                            id: "3",
                            text: vm._data.curso.unidade + " - Área 03"
                        }
                    ];
                    vm._data.curso.area = '';
                    vm._data.curso.curso = '';
                    view.remake('#f_curso_area select');
                }, 1);
            };
            vm.getCursos = function (view) {
                $timeout(function () {
                    vm._model.curso.curso.list = [
                        {
                            id: "1",
                            text: vm._data.curso.unidade + ' - ' +
                                vm._data.curso.area + " - Curso 01"
                        },
                        {
                            id: "2",
                            text: vm._data.curso.unidade + ' - ' +
                                vm._data.curso.area + " - Curso 02"
                        },
                        {
                            id: "3",
                            text: vm._data.curso.unidade + ' - ' +
                                vm._data.curso.area + " - Curso 03"
                        }
                    ];
                    vm._data.curso.curso = '';
                    view.remake('#f_curso_curso select');
                }, 1);
            };
            vm.getVagas = function (view, view2) {
                $timeout(function () {
                    function getRandomInt(min, max) {
                        return Math.floor(Math.random() * (max - min)) + min;
                    }

                    var a = getRandomInt(100, 201), b = getRandomInt(0, 101);
                    vm._model.curso.vagas.totais = a;
                    vm._model.curso.vagas.preenchidas = Math.floor(b * a / 100);
                }, 1);
            };

            $http.get('mock/comercial/info-aluno.json')
                .success(function (data) {
                    vm._model.aluno = data.object;
                });

            // ==== FORM DATA ==== //

            vm._novo_cheque = {};
            vm.cleanForm();
            vm.tipoPagamento = false;
            vm.teste = function(){
                vm.tipoPagamento = true;
            };




        }
    ]);
});