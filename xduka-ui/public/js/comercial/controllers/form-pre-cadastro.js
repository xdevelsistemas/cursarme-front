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
                    "required": true
                },
                "endereco": {
                    "label": "Edereço",
                    "type": "text",
                    "name": "endereco",
                    "help": "Campo obrigatório",
                    "required": true
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
                    ]
                },
                "telefone": {
                    "label": "Telefone",
                    "type": "text",
                    "mask": "(99) 9999-9999",
                    "name": "telefone",
                    "help": "Campo obrigatório",
                    "required": true
                },
                "email": {
                    "label": "Email",
                    "type": "email",
                    "name": "email",
                    "help": "Campo obrigatório",
                    "required": true
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
                    ]
                },
                area: {
                    label: "Área",
                    type: "select",
                    name: "area",
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma opção",
                    required: true,
                    list: []
                },
                curso: {
                    label: "Curso",
                    type: "select",
                    name: "curso",
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma opção",
                    required: true,
                    list: []
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
            $scope._model.pagamento = {
                label: "Informações de Pagamento",
                name: "pagamento",
                entrada: {
                    label: "Entrada",
                    type: "text",
                    name: 'entrada',
                    help: "Campo obrigatório",
                    required: true
                },
                desconto: {
                    label: "Desconto",
                    type: "text",
                    name: 'desconto',
                    help: "Campo obrigatório",
                    required: true
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
                    ]
                },
                parcelamento: {
                    label: "Parcelamento",
                    type: "text",
                    name: 'parcelamento',
                    help: "Campo obrigatório",
                    required: true
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
                    }
                },
                observacoes: {
                    label: "Observações",
                    type: "text",
                    name: 'observacoes',
                    help: "Campo obrigatório",
                    required: true
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
                    size: 'lg'
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
                    ]
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
                    ]
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
            /*$http.get('mock/comercial/info-aluno.json')
                .success(function (data) {
                    $scope._model.aluno = $.extend(true, {}, data.object);
                });*/

            // ==== FORM DATA ==== //

            $scope._novo_cheque = {};
            $scope.cleanForm();
        }
    ]);
});