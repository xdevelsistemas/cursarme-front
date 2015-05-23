define(['./__module__', 'jquery'], function (controllers, $) {
    'use strict';
    controllers.controller('ModalCheques', [
        '$scope', '$http', 'lista_cheques', '$modalInstance', 'dataCheque', 'allCheques',
        function ($scope, $http, lista_cheques, $modalInstance, dataCheque, allCheques) {

            /* jshint validthis: true */
            var vm = this;
            vm._data = {};
            vm._model = {
                label: "Adicionar Cheques",
                name: "modal_cheques",
                banco: {
                    label: "Banco",
                    type: "select",
                    name: 'banco',
                    value: "",
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma opção",
                    required: false,
                    list: [
                        {"id": "001",  "text": "001 - BANCO DO BRASIL S.A."},
                        {"id": "003",  "text": "003 - BANCO DA AMAZONIA S.A."},
                        {"id": "004",  "text": "004 - BANCO DO NORDESTE DO BRASIL S.A."},
                        {"id": "019",  "text": "019 - BANCO AZTECA DO BRASIL S.A."},
                        {"id": "021",  "text": "021 - BANESTES S.A. BANCO DO ESTADO DO ESPIRITO SANTO"},
                        {"id": "025",  "text": "025 - BANCO ALFA S.A"},
                        {"id": "033",  "text": "033 - BANCO SANTANDER BANESPA S.A."},
                        {"id": "037",  "text": "037 - BANCO DO ESTADO DO PARÁ S.A."},
                        {"id": "040",  "text": "040 - BANCO CARGILL S.A."},
                        {"id": "041",  "text": "041 - BANCO DO ESTADO DO RIO GRANDE DO SUL S.A."},
                        {"id": "044",  "text": "044 - BANCO BVA S.A."},
                        {"id": "045",  "text": "045 - BANCO OPPORTUNITY S.A."},
                        {"id": "047",  "text": "047 - BANCO DO ESTADO DE SERGIPE S.A."},
                        {"id": "062",  "text": "062 - HIPERCARD BANCO MÚLTIPLO S.A."},
                        {"id": "063",  "text": "063 - BANCO IBI S.A. - BANCO MÚLTIPLO"},
                        {"id": "065",  "text": "065 - BANCO LEMON S.A."},
                        {"id": "066",  "text": "066 - BANCO MORGAN STANLEY S.A."},
                        {"id": "069",  "text": "069 - BPN BRASIL BANCO MÚLTIPLO S.A."},
                        {"id": "070",  "text": "070 - BRB - BANCO DE BRASILIA S.A."},
                        {"id": "072",  "text": "072 - BANCO RURAL MAIS S.A."},
                        {"id": "073",  "text": "073 - BB BANCO POPULAR DO BRASIL S.A."},
                        {"id": "074",  "text": "074 - BANCO J. SAFRA S.A."},
                        {"id": "075",  "text": "075 - BANCO CR2 S/A"},
                        {"id": "076",  "text": "076 - BANCO KDB DO BRASIL S.A."},
                        {"id": "077",  "text": "077 - BANCO INTERMEDIUM S/A"},
                        {"id": "079",  "text": "079 - JBS BANCO S/A"},
                        {"id": "081",  "text": "081 - CONCÓRDIA BANCO S.A."},
                        {"id": "096",  "text": "096 - BANCO BM&F DE SERVIÇOS DE LIQUIDAÇÃO E CUSTÓDIA S.A."},
                        {"id": "004",  "text": "004 - CAIXA ECONOMICA FEDERAL"},
                        {"id": "007",  "text": "007 - BANCO BBM S/A"},
                        {"id": "051",  "text": "051 - BANCO NOSSA CAIXA S.A."},
                        {"id": "008",  "text": "008 - BANCO UBS PACTUAL S.A."},
                        {"id": "012",  "text": "012 - BANCO MATONE S.A."},
                        {"id": "013",  "text": "013 - BANCO ARBI S.A."},
                        {"id": "014",  "text": "014 - BANCO DIBENS S.A."},
                        {"id": "017",  "text": "017 - BANCO JOHN DEERE S.A."},
                        {"id": "018",  "text": "018 - BANCO BONSUCESSO S.A."},
                        {"id": "022",  "text": "022 - BANCO CALYON BRASIL S.A."},
                        {"id": "024",  "text": "024 - BANCO FIBRA S.A."},
                        {"id": "025",  "text": "025 - BANCO BRASCAN S.A."},
                        {"id": "029",  "text": "029 - BANCO CRUZEIRO DO SUL S.A."},
                        {"id": "030",  "text": "030 - UNICARD BANCO MÚLTIPLO S.A."},
                        {"id": "033",  "text": "033 - BANCO GE CAPITAL S.A."},
                        {"id": "037",  "text": "037 - BANCO BRADESCO S.A."},
                        {"id": "041",  "text": "041 - BANCO CLASSICO S.A."},
                        {"id": "043",  "text": "043 - BANCO MÁXIMA S.A."},
                        {"id": "046",  "text": "046 - BANCO ABC BRASIL S.A."},
                        {"id": "048",  "text": "048 - BANCO BOAVISTA INTERATLANTICO S.A."},
                        {"id": "049",  "text": "049 - BANCO INVESTCRED UNIBANCO S.A."},
                        {"id": "050",  "text": "050 - BANCO SCHAHIN S.A."},
                        {"id": "054",  "text": "054 - PARANÁ BANCO S.A."},
                        {"id": "063",  "text": "063 - BANCO CACIQUE S.A."},
                        {"id": "065",  "text": "065 - BANCO FATOR S.A."},
                        {"id": "066",  "text": "066 - BANCO CEDULA S.A."},
                        {"id": "000",  "text": "000 - BANCO DE LA NACION ARGENTINA"},
                        {"id": "018",  "text": "018 - BANCO BMG S.A."},
                        {"id": "041",  "text": "041 - BANCO ITAÚ S.A."},
                        {"id": "056",  "text": "056 - BANCO ABN AMRO REAL S.A."},
                        {"id": "066",  "text": "066 - BANCO SOCIETE GENERALE BRASIL S.A."},
                        {"id": "070",  "text": "070 - BANCO WESTLB DO BRASIL S.A."},
                        {"id": "076",  "text": "076 - BANCO J.P. MORGAN S.A."},
                        {"id": "089",  "text": "089 - BANCO MERCANTIL DO BRASIL S.A."},
                        {"id": "094",  "text": "094 - BANCO FINASA BMC S.A."},
                        {"id": "099",  "text": "099 - HSBC BANK BRASIL S.A. - BANCO MULTIPLO"},
                        {"id": "009",  "text": "009 - UNIBANCO-UNIAO DE BANCOS BRASILEIROS S.A."},
                        {"id": "012",  "text": "012 - BANCO CAPITAL S.A."},
                        {"id": "022",  "text": "022 - BANCO SAFRA S.A."},
                        {"id": "053",  "text": "053 - BANCO RURAL S.A."},
                        {"id": "056",  "text": "056 - BANCO DE TOKYO-MITSUBISHI UFJ BRASIL S/A"},
                        {"id": "064",  "text": "064 - BANCO SUMITOMO MITSUI BRASILEIRO S.A."},
                        {"id": "077",  "text": "077 - CITIBANK N.A."},
                        {"id": "087",  "text": "087 - DEUTSCHE BANK S.A. - BANCO ALEMAO"},
                        {"id": "088",  "text": "088 - JPMORGAN CHASE BAN"},
                        {"id": "092",  "text": "092 - ING BANK N.V."},
                        {"id": "094",  "text": "094 - BANCO DE LA REPUBLICA ORIENTAL DEL URUGUAY"},
                        {"id": "095",  "text": "095 - BANCO DE LA PROVINCIA DE BUENOS AIRES"},
                        {"id": "005",  "text": "005 - BANCO CREDIT SUISSE (BRASIL) S.A."},
                        {"id": "000",  "text": "000 - BANCO LUSO BRASILEIRO S.A."},
                        {"id": "004",  "text": "004 - BANCO INDUSTRIAL DO BRASIL S.A."},
                        {"id": "010",  "text": "010 - BANCO VR S.A."},
                        {"id": "011",  "text": "011 - BANCO PAULISTA S.A."},
                        {"id": "012",  "text": "012 - BANCO GUANABARA S.A."},
                        {"id": "013",  "text": "013 - BANCO PECUNIA S.A."},
                        {"id": "023",  "text": "023 - BANCO PANAMERICANO S.A."},
                        {"id": "026",  "text": "026 - BANCO FICSA S.A."},
                        {"id": "030",  "text": "030 - BANCO INTERCAP S.A."},
                        {"id": "033",  "text": "033 - BANCO RENDIMENTO S.A."},
                        {"id": "034",  "text": "034 - BANCO TRIANGULO S.A."},
                        {"id": "037",  "text": "037 - BANCO SOFISA S.A."},
                        {"id": "038",  "text": "038 - BANCO PROSPER S.A."},
                        {"id": "043",  "text": "043 - BANCO PINE S.A."},
                        {"id": "053",  "text": "053 - BANCO INDUSVAL S.A."},
                        {"id": "054",  "text": "054 - BANCO A.J. RENNER S.A."},
                        {"id": "055",  "text": "055 - BANCO VOTORANTIM S.A."},
                        {"id": "007",  "text": "007 - BANCO DAYCOVAL S.A."},
                        {"id": "019",  "text": "019 - BANIF - BANCO INTERNACIONAL DO FUNCHAL (BRASIL"},
                        {"id": "021",  "text": "021 - BANCO CREDIBEL S.A."},
                        {"id": "034",  "text": "034 - BANCO GERDAU S.A"},
                        {"id": "035",  "text": "035 - BANCO POTTENCIAL S.A."},
                        {"id": "038",  "text": "038 - BANCO MORADA S.A."},
                        {"id": "039",  "text": "039 - BANCO BGN S.A."},
                        {"id": "040",  "text": "040 - BANCO BARCLAYS S.A."},
                        {"id": "041",  "text": "041 - BANCO RIBEIRAO PRETO S.A."},
                        {"id": "043",  "text": "043 - BANCO EMBLEMA S.A."},
                        {"id": "045",  "text": "045 - BANCO CITIBANK S.A."},
                        {"id": "046",  "text": "046 - BANCO MODAL S.A."},
                        {"id": "047",  "text": "047 - BANCO RABOBANK INTERNATIONAL BRASIL S.A."},
                        {"id": "048",  "text": "048 - BANCO COOPERATIVO SICREDI S.A."},
                        {"id": "049",  "text": "049 - BANCO SIMPLES S.A."},
                        {"id": "051",  "text": "051 - DRESDNER BANK BRASIL S.A. BANCO MULTIPLO"},
                        {"id": "052",  "text": "052 - BANCO BNP PARIBAS BRASIL S.A."},
                        {"id": "053",  "text": "053 - NBC BANK BRASIL S. A. - BANCO MÚLTIPLO"},
                        {"id": "056",  "text": "056 - BANCO COOPERATIVO DO BRASIL S.A. - BANCOOB"},
                        {"id": "057",  "text": "057 - BANCO KEB DO BRASIL S.A"}
                    ],
                    model: {err: "", val: ""}
                },
                agencia: {
                    label: "Agência",
                    type: "text",
                    name: 'agencia',
                    help: "Campo obrigatório",
                    required: false,
                    model: {err: "", val: ""}
                },
                conta: {
                    label: "Conta",
                    type: "text",
                    name: 'conta',
                    help: "Campo obrigatório",
                    required: false,
                    model: {err: "", val: ""}
                },
                numero: {
                    label: "Número",
                    type: "text",
                    name: 'numero',
                    help: "Campo obrigatório",
                    required: false,
                    model: {err: "", val: ""}
                },
                data: {
                    label: "Data",
                    type: "text",
                    name: 'data',
                    help: "Campo obrigatório",
                    placeholder: "Selecione uma Data",
                    format: "dd/MM/yyyy",
                    required: false,
                    model: {err: "", val: ""}
                },
                valor: {
                    label: "Valor",
                    type: "text",
                    name: 'valor',
                    help: "Campo obrigatório",
                    required: false,
                    model: {err: "", val: ""}
                },
                titular: {
                    label: "Nome do titular",
                    type: "text",
                    name: 'titular',
                    help: "Campo obrigatório",
                    required: false,
                    model: {err: "", val: ""}
                }
            };

            vm.new_cheque = function(){
                if ((!!vm._model.banco.model.val&&
                    !!vm._model.agencia.model.val&&
                    !!vm._model.conta.model.val&&
                    !!vm._model.numero.model.val&&
                    !!vm._model.data.model.val &&
                    !!vm._model.valor.model.val&&
                    !!vm._model.titular.model.val)&&(!vm._model.data.model.err)){
                    /*LIMPANDO CAMPOS DE ERRO*/
                    vm._model.banco.model.err = '';
                    vm._model.agencia.model.err = '';
                    vm._model.conta.model.err = '';
                    vm._model.numero.model.err = '';
                    vm._model.data.model.err = '';
                    vm._model.valor.model.err = '';
                    vm._model.titular.model.err = '';

                    /*FIM CAMPOS DE ERRO*/

                    dataCheque.setData(vm._model.data.model.val);
                    $.extend(vm._data, {

                        "agencia": vm._model.agencia.model.val,
                        "conta": vm._model.conta.model.val,
                        "numero": vm._model.numero.model.val,
                        "data": dataCheque.getData(),
                        "valor": vm._model.valor.model.val,
                        "titular": vm._model.titular.model.val
                    });
                    vm._novo_cheque = vm._data;
                    vm.lista_cheques.add(vm._novo_cheque)

                }else{
                    if (!vm._model.banco.model.val){
                        vm._model.banco.model.err = 'Campo obrigatório'
                    }else{vm._model.banco.model.err = ''}
                    if (!vm._model.agencia.model.val){
                        vm._model.agencia.model.err = 'Campo obrigatório'
                    }else{vm._model.agencia.model.err = ''}
                    if (!vm._model.conta.model.val){
                        vm._model.conta.model.err = 'Campo obrigatório'
                    }else{vm._model.conta.model.err = ''}
                    if (!vm._model.numero.model.val){
                        vm._model.numero.model.err = 'Campo obrigatório'
                    }else{vm._model.numero.model.err = ''}
                    if (!vm._model.data.model.val || !!vm._model.data.model.err){
                        vm._model.data.model.err = 'Campo obrigatório'
                    }else{vm._model.data.model.err = ''}
                    if (!vm._model.valor.model.val){
                        vm._model.valor.model.err = 'Campo obrigatório'
                    }else{vm._model.valor.model.err = ''}
                    if (!vm._model.titular.model.val){
                        vm._model.titular.model.err = 'Campo obrigatório'
                    }else{vm._model.titular.model.err = ''}
                }
            };

            vm.lista_cheques = lista_cheques;
            vm.voltar = function () {
                $modalInstance.dismiss('cancel');
                allCheques.setAllCheques(vm.lista_cheques.lista);
                console.log(allCheques.getAllCheques());
            };
            vm.changeBanco = function(item,model){
                console.log(item);
                vm._data.banco = item
            };
            vm.validaData = function(){
                if (isDate($('#input_data').val())){
                    vm._model.data.model.err = '';
                }
            };
            function isDate(date){
                return /^(0[1-9]|[12][0-9]|3[01])[\/](0[1-9]|1[012])[\/](19|20)\d\d$/gm.test(date)
            }
        }]);
});
