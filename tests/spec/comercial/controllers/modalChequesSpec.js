describe('Controller: ModalCheques test', function() {

    var $scope, vm, modalInstance, $httpBackend,
        fieldsModal = ["banco", "agencia", "conta", "numero", "data", "valor", "titular"],
        modalCheque = {"label": "Adicionar Cheques", "name": "modal_cheques", "banco": {"label": "Banco", "type": "select", "name": "banco", "placeholder": "Selecione uma opção", "required": false, "list": [], "model": {"err": "", "val": ""}}, "agencia": {"label": "Agência", "type": "text", "name": "agencia", "required": false, "model": {"err": "", "val": ""}}, "conta": {"label": "Conta", "type": "text", "name": "conta", "required": false, "model": {"err": "", "val": ""}}, "numero": {"label": "Número", "type": "text", "name": "numero", "required": false, "model": {"err": "", "val": ""}}, "data": {"label": "Data", "type": "text", "name": "data", "placeholder": "Selecione uma Data", "format": "dd/MM/yyyy", "required": false, "model": {"err": "", "val": ""}}, "valor": {"label": "Valor", "type": "text", "name": "valor", "required": false, "model": {"err": "", "val": ""}}, "titular": {"label": "Nome do titular", "type": "text", "name": "titular", "required": false, "model": {"err": "", "val": ""}}},
        dadosBancosFinanceiros = {"list": [{"id": "001",  "text": "001 - BANCO DO BRASIL S.A."}, {"id": "003",  "text": "003 - BANCO DA AMAZONIA S.A."}, {"id": "004",  "text": "004 - BANCO DO NORDESTE DO BRASIL S.A."}, {"id": "019",  "text": "019 - BANCO AZTECA DO BRASIL S.A."}, {"id": "021",  "text": "021 - BANESTES S.A. BANCO DO ESTADO DO ESPIRITO SANTO"}, {"id": "025",  "text": "025 - BANCO ALFA S.A"}, {"id": "033",  "text": "033 - BANCO SANTANDER BANESPA S.A."}, {"id": "037",  "text": "037 - BANCO DO ESTADO DO PARÁ S.A."}, {"id": "040",  "text": "040 - BANCO CARGILL S.A."}, {"id": "041",  "text": "041 - BANCO DO ESTADO DO RIO GRANDE DO SUL S.A."}, {"id": "044",  "text": "044 - BANCO BVA S.A."}, {"id": "045",  "text": "045 - BANCO OPPORTUNITY S.A."}, {"id": "047",  "text": "047 - BANCO DO ESTADO DE SERGIPE S.A."}, {"id": "062",  "text": "062 - HIPERCARD BANCO MÚLTIPLO S.A."}, {"id": "063",  "text": "063 - BANCO IBI S.A. - BANCO MÚLTIPLO"}, {"id": "065",  "text": "065 - BANCO LEMON S.A."}, {"id": "066",  "text": "066 - BANCO MORGAN STANLEY S.A."}, {"id": "069",  "text": "069 - BPN BRASIL BANCO MÚLTIPLO S.A."}, {"id": "070",  "text": "070 - BRB - BANCO DE BRASILIA S.A."}, {"id": "072",  "text": "072 - BANCO RURAL MAIS S.A."}, {"id": "073",  "text": "073 - BB BANCO POPULAR DO BRASIL S.A."}, {"id": "074",  "text": "074 - BANCO J. SAFRA S.A."}, {"id": "075",  "text": "075 - BANCO CR2 S/A"}, {"id": "076",  "text": "076 - BANCO KDB DO BRASIL S.A."}, {"id": "077",  "text": "077 - BANCO INTERMEDIUM S/A"}, {"id": "079",  "text": "079 - JBS BANCO S/A"}, {"id": "081",  "text": "081 - CONCÓRDIA BANCO S.A."}, {"id": "096",  "text": "096 - BANCO BM&F DE SERVIÇOS DE LIQUIDAÇÃO E CUSTÓDIA S.A."}, {"id": "004",  "text": "004 - CAIXA ECONOMICA FEDERAL"}, {"id": "007",  "text": "007 - BANCO BBM S/A"}, {"id": "051",  "text": "051 - BANCO NOSSA CAIXA S.A."}, {"id": "008",  "text": "008 - BANCO UBS PACTUAL S.A."}, {"id": "012",  "text": "012 - BANCO MATONE S.A."}, {"id": "013",  "text": "013 - BANCO ARBI S.A."}, {"id": "014",  "text": "014 - BANCO DIBENS S.A."}, {"id": "017",  "text": "017 - BANCO JOHN DEERE S.A."}, {"id": "018",  "text": "018 - BANCO BONSUCESSO S.A."}, {"id": "022",  "text": "022 - BANCO CALYON BRASIL S.A."}, {"id": "024",  "text": "024 - BANCO FIBRA S.A."}, {"id": "029",  "text": "029 - BANCO CRUZEIRO DO SUL S.A."}, {"id": "030",  "text": "030 - UNICARD BANCO MÚLTIPLO S.A."}, {"id": "033",  "text": "033 - BANCO GE CAPITAL S.A."}, {"id": "037",  "text": "037 - BANCO BRADESCO S.A."}, {"id": "041",  "text": "041 - BANCO CLASSICO S.A."}, {"id": "043",  "text": "043 - BANCO MÁXIMA S.A."}, {"id": "046",  "text": "046 - BANCO ABC BRASIL S.A."}, {"id": "048",  "text": "048 - BANCO BOAVISTA INTERATLANTICO S.A."}, {"id": "049",  "text": "049 - BANCO INVESTCRED UNIBANCO S.A."}, {"id": "050",  "text": "050 - BANCO SCHAHIN S.A."}, {"id": "054",  "text": "054 - PARANÁ BANCO S.A."}, {"id": "063",  "text": "063 - BANCO CACIQUE S.A."}, {"id": "065",  "text": "065 - BANCO FATOR S.A."}, {"id": "066",  "text": "066 - BANCO CEDULA S.A."}, {"id": "000",  "text": "000 - BANCO DE LA NACION ARGENTINA"}, {"id": "018",  "text": "018 - BANCO BMG S.A."}, {"id": "041",  "text": "041 - BANCO ITAÚ S.A."}, {"id": "056",  "text": "056 - BANCO ABN AMRO REAL S.A."}, {"id": "066",  "text": "066 - BANCO SOCIETE GENERALE BRASIL S.A."}, {"id": "070",  "text": "070 - BANCO WESTLB DO BRASIL S.A."}, {"id": "076",  "text": "076 - BANCO J.P. MORGAN S.A."}, {"id": "089",  "text": "089 - BANCO MERCANTIL DO BRASIL S.A."}, {"id": "094",  "text": "094 - BANCO FINASA BMC S.A."}, {"id": "099",  "text": "099 - HSBC BANK BRASIL S.A. - BANCO MULTIPLO"}, {"id": "009",  "text": "009 - UNIBANCO-UNIAO DE BANCOS BRASILEIROS S.A."}, {"id": "012",  "text": "012 - BANCO CAPITAL S.A."}, {"id": "022",  "text": "022 - BANCO SAFRA S.A."}, {"id": "053",  "text": "053 - BANCO RURAL S.A."}, {"id": "056",  "text": "056 - BANCO DE TOKYO-MITSUBISHI UFJ BRASIL S/A"}, {"id": "064",  "text": "064 - BANCO SUMITOMO MITSUI BRASILEIRO S.A."}, {"id": "077",  "text": "077 - CITIBANK N.A."}, {"id": "087",  "text": "087 - DEUTSCHE BANK S.A. - BANCO ALEMAO"}, {"id": "088",  "text": "088 - JPMORGAN CHASE BAN"}, {"id": "092",  "text": "092 - ING BANK N.V."}, {"id": "094",  "text": "094 - BANCO DE LA REPUBLICA ORIENTAL DEL URUGUAY"}, {"id": "095",  "text": "095 - BANCO DE LA PROVINCIA DE BUENOS AIRES"}, {"id": "005",  "text": "005 - BANCO CREDIT SUISSE (BRASIL) S.A."}, {"id": "000",  "text": "000 - BANCO LUSO BRASILEIRO S.A."}, {"id": "004",  "text": "004 - BANCO INDUSTRIAL DO BRASIL S.A."}, {"id": "010",  "text": "010 - BANCO VR S.A."}, {"id": "011",  "text": "011 - BANCO PAULISTA S.A."}, {"id": "012",  "text": "012 - BANCO GUANABARA S.A."}, {"id": "013",  "text": "013 - BANCO PECUNIA S.A."}, {"id": "023",  "text": "023 - BANCO PANAMERICANO S.A."}, {"id": "026",  "text": "026 - BANCO FICSA S.A."}, {"id": "030",  "text": "030 - BANCO INTERCAP S.A."}, {"id": "033",  "text": "033 - BANCO RENDIMENTO S.A."}, {"id": "034",  "text": "034 - BANCO TRIANGULO S.A."}, {"id": "037",  "text": "037 - BANCO SOFISA S.A."}, {"id": "038",  "text": "038 - BANCO PROSPER S.A."}, {"id": "043",  "text": "043 - BANCO PINE S.A."}, {"id": "053",  "text": "053 - BANCO INDUSVAL S.A."}, {"id": "054",  "text": "054 - BANCO A.J. RENNER S.A."}, {"id": "055",  "text": "055 - BANCO VOTORANTIM S.A."}, {"id": "007",  "text": "007 - BANCO DAYCOVAL S.A."}, {"id": "019",  "text": "019 - BANIF - BANCO INTERNACIONAL DO FUNCHAL (BRASIL"}, {"id": "021",  "text": "021 - BANCO CREDIBEL S.A."}, {"id": "034",  "text": "034 - BANCO GERDAU S.A"}, {"id": "035",  "text": "035 - BANCO POTTENCIAL S.A."}, {"id": "038",  "text": "038 - BANCO MORADA S.A."}, {"id": "039",  "text": "039 - BANCO BGN S.A."}, {"id": "040",  "text": "040 - BANCO BARCLAYS S.A."}, {"id": "041",  "text": "041 - BANCO RIBEIRAO PRETO S.A."}, {"id": "043",  "text": "043 - BANCO EMBLEMA S.A."}, {"id": "045",  "text": "045 - BANCO CITIBANK S.A."}, {"id": "046",  "text": "046 - BANCO MODAL S.A."}, {"id": "047",  "text": "047 - BANCO RABOBANK INTERNATIONAL BRASIL S.A."}, {"id": "048",  "text": "048 - BANCO COOPERATIVO SICREDI S.A."}, {"id": "049",  "text": "049 - BANCO SIMPLES S.A."}, {"id": "051",  "text": "051 - DRESDNER BANK BRASIL S.A. BANCO MULTIPLO"}, {"id": "052",  "text": "052 - BANCO BNP PARIBAS BRASIL S.A."}, {"id": "053",  "text": "053 - NBC BANK BRASIL S. A. - BANCO MÚLTIPLO"}, {"id": "056",  "text": "056 - BANCO COOPERATIVO DO BRASIL S.A. - BANCOOB"}, {"id": "057",  "text": "057 - BANCO KEB DO BRASIL S.A"}]};

    beforeEach(function() {
        module('app');
        inject(function($injector, _$controller_, _$httpBackend_) {
            $scope = $injector.get('$rootScope').$new();
            $httpBackend = _$httpBackend_;

        // Create a mock object using spies
            modalInstance = {
                "close": jasmine.createSpy('modalInstance.close'),
                "dismiss": jasmine.createSpy('modalInstance.dismiss'),
                "result": {
                    "then": jasmine.createSpy('modalInstance.result.then')
                }
            };

        // Requisição do servidor
            modalCheque.banco.list = dadosBancosFinanceiros.list;
            $httpBackend.when('GET','/api/comercial/modal-cheque')
                .respond(200, modalCheque);

        // Definindo controller
            vm = _$controller_('ModalCheques', {
                "$scope": $scope,
                "$modalInstance": modalInstance,
                "itemArray": function () { return ['a', 'b', 'c']; }
            });
        });
    });

    describe('-> Definição do ModalCheque', function() {
        it('-> ModalCheque definido', function () {
            expect(vm).toBeDefined();
        });
    });

    describe('-> Adicionando novo cheque', function() {
        it('-> Novo cheque com os dados em branco(vazio)', function() {
            $httpBackend.flush();

        // Novo cheque com os dados em branco(vazio)
            vm.new_cheque();

            fieldsModal.forEach(function(field) {
                expect(vm._model[field].model.err).not.toEqual("");
            });

        // Selecionando banco
            vm.changeBanco(vm._model.banco.list[0], vm._model.banco.list[0].id);
            expect(vm._data.banco).toEqual(modalCheque.banco.list[0]);

        // Preenchendo os campos do modal
            vm._model.banco.model.val = vm._data.banco.id;
            vm._model.agencia.model.val = 123;
            vm._model.conta.model.val = 456;
            vm._model.numero.model.val = 789;
            vm._model.data.model.val = new Date();
            vm._model.valor.model.val = 1011.12;
            vm._model.titular.model.val = "João das Couves";
            vm._model.data.model.err = "";

        // Novo cheque com os dados completos
            vm.new_cheque();

            fieldsModal.forEach(function(field) {
                expect(vm._model[field].model.err).toEqual("");
            });
        });
    });

    describe('-> Testando datas', function() {
        it('-> 25/13/2015 não é valida', function() {
            expect(vm.isDate('25/13/2015')).toEqual(false);
        });

        it('-> 00/00/2015 não é valido', function() {
            expect(vm.isDate('00/00/2015')).toEqual(false);
        });

        it('-> 01/02/2015 é valido', function() {
            expect(vm.isDate('01/02/2015')).toEqual(true);
        });

        it('-> 29/02/2015 não é valido', function() {
            expect(vm.isDate('29/02/2015')).toEqual(false);
        });

        it('-> 29/02/2016 é valido', function() {
            expect(vm.isDate('29/02/2016')).toEqual(true);
        });
    });
});