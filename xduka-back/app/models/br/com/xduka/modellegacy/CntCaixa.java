package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntCaixaPK.class)
public class CntCaixa {
    private long caixaId;

    @Basic
    @javax.persistence.Column(name = "Caixa_ID", nullable = false, insertable = true, updatable = true)
    public long getCaixaId() {
        return caixaId;
    }

    public void setCaixaId(long caixaId) {
        this.caixaId = caixaId;
    }

    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codCaixa;

    @Id
    @javax.persistence.Column(name = "CodCaixa", nullable = false, insertable = true, updatable = true)
    public int getCodCaixa() {
        return codCaixa;
    }

    public void setCodCaixa(int codCaixa) {
        this.codCaixa = codCaixa;
    }

    private String descrição;

    @Basic
    @javax.persistence.Column(name = "Descrição", nullable = true, insertable = true, updatable = true)
    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    private Integer codRelacionamento;

    @Basic
    @javax.persistence.Column(name = "CodRelacionamento", nullable = true, insertable = true, updatable = true)
    public Integer getCodRelacionamento() {
        return codRelacionamento;
    }

    public void setCodRelacionamento(Integer codRelacionamento) {
        this.codRelacionamento = codRelacionamento;
    }

    private String númeroBanco;

    @Basic
    @javax.persistence.Column(name = "NúmeroBanco", nullable = true, insertable = true, updatable = true)
    public String getNúmeroBanco() {
        return númeroBanco;
    }

    public void setNúmeroBanco(String númeroBanco) {
        this.númeroBanco = númeroBanco;
    }

    private String conta;

    @Basic
    @javax.persistence.Column(name = "Conta", nullable = true, insertable = true, updatable = true)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    private String dígitoConta;

    @Basic
    @javax.persistence.Column(name = "DígitoConta", nullable = true, insertable = true, updatable = true)
    public String getDígitoConta() {
        return dígitoConta;
    }

    public void setDígitoConta(String dígitoConta) {
        this.dígitoConta = dígitoConta;
    }

    private String agência;

    @Basic
    @javax.persistence.Column(name = "Agência", nullable = true, insertable = true, updatable = true)
    public String getAgência() {
        return agência;
    }

    public void setAgência(String agência) {
        this.agência = agência;
    }

    private String dígitoAgência;

    @Basic
    @javax.persistence.Column(name = "DígitoAgência", nullable = true, insertable = true, updatable = true)
    public String getDígitoAgência() {
        return dígitoAgência;
    }

    public void setDígitoAgência(String dígitoAgência) {
        this.dígitoAgência = dígitoAgência;
    }

    private String códigoCedente;

    @Basic
    @javax.persistence.Column(name = "CódigoCedente", nullable = true, insertable = true, updatable = true)
    public String getCódigoCedente() {
        return códigoCedente;
    }

    public void setCódigoCedente(String códigoCedente) {
        this.códigoCedente = códigoCedente;
    }

    private String dígitoCódigoCedente;

    @Basic
    @javax.persistence.Column(name = "DígitoCódigoCedente", nullable = true, insertable = true, updatable = true)
    public String getDígitoCódigoCedente() {
        return dígitoCódigoCedente;
    }

    public void setDígitoCódigoCedente(String dígitoCódigoCedente) {
        this.dígitoCódigoCedente = dígitoCódigoCedente;
    }

    private Double saldo;

    @Basic
    @javax.persistence.Column(name = "Saldo", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    private Short operação;

    @Basic
    @javax.persistence.Column(name = "Operação", nullable = true, insertable = true, updatable = true)
    public Short getOperação() {
        return operação;
    }

    public void setOperação(Short operação) {
        this.operação = operação;
    }

    private String códigoCarteira;

    @Basic
    @javax.persistence.Column(name = "CódigoCarteira", nullable = true, insertable = true, updatable = true)
    public String getCódigoCarteira() {
        return códigoCarteira;
    }

    public void setCódigoCarteira(String códigoCarteira) {
        this.códigoCarteira = códigoCarteira;
    }

    private String carteira;

    @Basic
    @javax.persistence.Column(name = "Carteira", nullable = true, insertable = true, updatable = true)
    public String getCarteira() {
        return carteira;
    }

    public void setCarteira(String carteira) {
        this.carteira = carteira;
    }

    private String aceite;

    @Basic
    @javax.persistence.Column(name = "Aceite", nullable = true, insertable = true, updatable = true)
    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

    private String espécie;

    @Basic
    @javax.persistence.Column(name = "Espécie", nullable = true, insertable = true, updatable = true)
    public String getEspécie() {
        return espécie;
    }

    public void setEspécie(String espécie) {
        this.espécie = espécie;
    }

    private String espécieDoc;

    @Basic
    @javax.persistence.Column(name = "EspécieDoc", nullable = true, insertable = true, updatable = true)
    public String getEspécieDoc() {
        return espécieDoc;
    }

    public void setEspécieDoc(String espécieDoc) {
        this.espécieDoc = espécieDoc;
    }

    private String agênciaConta;

    @Basic
    @javax.persistence.Column(name = "AgênciaConta", nullable = true, insertable = true, updatable = true)
    public String getAgênciaConta() {
        return agênciaConta;
    }

    public void setAgênciaConta(String agênciaConta) {
        this.agênciaConta = agênciaConta;
    }

    private Short númeroArquivo;

    @Basic
    @javax.persistence.Column(name = "NúmeroArquivo", nullable = true, insertable = true, updatable = true)
    public Short getNúmeroArquivo() {
        return númeroArquivo;
    }

    public void setNúmeroArquivo(Short númeroArquivo) {
        this.númeroArquivo = númeroArquivo;
    }

    private boolean nãoConta;

    @Basic
    @javax.persistence.Column(name = "NãoConta", nullable = false, insertable = true, updatable = true)
    public boolean isNãoConta() {
        return nãoConta;
    }

    public void setNãoConta(boolean nãoConta) {
        this.nãoConta = nãoConta;
    }

    private boolean foraRelatório;

    @Basic
    @javax.persistence.Column(name = "ForaRelatório", nullable = false, insertable = true, updatable = true)
    public boolean isForaRelatório() {
        return foraRelatório;
    }

    public void setForaRelatório(boolean foraRelatório) {
        this.foraRelatório = foraRelatório;
    }

    private String endereço;

    @Basic
    @javax.persistence.Column(name = "Endereço", nullable = true, insertable = true, updatable = true)
    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    private String bairro;

    @Basic
    @javax.persistence.Column(name = "Bairro", nullable = true, insertable = true, updatable = true)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    private String cep;

    @Basic
    @javax.persistence.Column(name = "CEP", nullable = true, insertable = true, updatable = true)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    private String cidade;

    @Basic
    @javax.persistence.Column(name = "Cidade", nullable = true, insertable = true, updatable = true)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private String uf;

    @Basic
    @javax.persistence.Column(name = "UF", nullable = true, insertable = true, updatable = true)
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    private String nomeAgência;

    @Basic
    @javax.persistence.Column(name = "NomeAgência", nullable = true, insertable = true, updatable = true)
    public String getNomeAgência() {
        return nomeAgência;
    }

    public void setNomeAgência(String nomeAgência) {
        this.nomeAgência = nomeAgência;
    }

    private String centralCodAgência;

    @Basic
    @javax.persistence.Column(name = "CentralCodAgência", nullable = true, insertable = true, updatable = true)
    public String getCentralCodAgência() {
        return centralCodAgência;
    }

    public void setCentralCodAgência(String centralCodAgência) {
        this.centralCodAgência = centralCodAgência;
    }

    private String centralEndereço;

    @Basic
    @javax.persistence.Column(name = "CentralEndereço", nullable = true, insertable = true, updatable = true)
    public String getCentralEndereço() {
        return centralEndereço;
    }

    public void setCentralEndereço(String centralEndereço) {
        this.centralEndereço = centralEndereço;
    }

    private String centralBairro;

    @Basic
    @javax.persistence.Column(name = "CentralBairro", nullable = true, insertable = true, updatable = true)
    public String getCentralBairro() {
        return centralBairro;
    }

    public void setCentralBairro(String centralBairro) {
        this.centralBairro = centralBairro;
    }

    private String centralCep;

    @Basic
    @javax.persistence.Column(name = "CentralCEP", nullable = true, insertable = true, updatable = true)
    public String getCentralCep() {
        return centralCep;
    }

    public void setCentralCep(String centralCep) {
        this.centralCep = centralCep;
    }

    private String centralCidade;

    @Basic
    @javax.persistence.Column(name = "CentralCidade", nullable = true, insertable = true, updatable = true)
    public String getCentralCidade() {
        return centralCidade;
    }

    public void setCentralCidade(String centralCidade) {
        this.centralCidade = centralCidade;
    }

    private String centralUf;

    @Basic
    @javax.persistence.Column(name = "CentralUF", nullable = true, insertable = true, updatable = true)
    public String getCentralUf() {
        return centralUf;
    }

    public void setCentralUf(String centralUf) {
        this.centralUf = centralUf;
    }

    private String centralNome;

    @Basic
    @javax.persistence.Column(name = "CentralNome", nullable = true, insertable = true, updatable = true)
    public String getCentralNome() {
        return centralNome;
    }

    public void setCentralNome(String centralNome) {
        this.centralNome = centralNome;
    }

    private boolean registrada;

    @Basic
    @javax.persistence.Column(name = "Registrada", nullable = false, insertable = true, updatable = true)
    public boolean isRegistrada() {
        return registrada;
    }

    public void setRegistrada(boolean registrada) {
        this.registrada = registrada;
    }

    private boolean boletoCarnet;

    @Basic
    @javax.persistence.Column(name = "BoletoCarnet", nullable = false, insertable = true, updatable = true)
    public boolean isBoletoCarnet() {
        return boletoCarnet;
    }

    public void setBoletoCarnet(boolean boletoCarnet) {
        this.boletoCarnet = boletoCarnet;
    }

    private boolean gerarNossoNúmero;

    @Basic
    @javax.persistence.Column(name = "GerarNossoNúmero", nullable = false, insertable = true, updatable = true)
    public boolean isGerarNossoNúmero() {
        return gerarNossoNúmero;
    }

    public void setGerarNossoNúmero(boolean gerarNossoNúmero) {
        this.gerarNossoNúmero = gerarNossoNúmero;
    }

    private Integer númeroCarnetUtilizado;

    @Basic
    @javax.persistence.Column(name = "NúmeroCarnetUtilizado", nullable = true, insertable = true, updatable = true)
    public Integer getNúmeroCarnetUtilizado() {
        return númeroCarnetUtilizado;
    }

    public void setNúmeroCarnetUtilizado(Integer númeroCarnetUtilizado) {
        this.númeroCarnetUtilizado = númeroCarnetUtilizado;
    }

    private String contrato;

    @Basic
    @javax.persistence.Column(name = "Contrato", nullable = true, insertable = true, updatable = true)
    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    private Boolean sinco;

    @Basic
    @javax.persistence.Column(name = "Sinco", nullable = true, insertable = true, updatable = true)
    public Boolean getSinco() {
        return sinco;
    }

    public void setSinco(Boolean sinco) {
        this.sinco = sinco;
    }

    private Long codContaBancaria;

    @Basic
    @javax.persistence.Column(name = "CodContaBancaria", nullable = true, insertable = true, updatable = true)
    public Long getCodContaBancaria() {
        return codContaBancaria;
    }

    public void setCodContaBancaria(Long codContaBancaria) {
        this.codContaBancaria = codContaBancaria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntCaixa cntCaixa = (CntCaixa) o;

        if (boletoCarnet != cntCaixa.boletoCarnet) return false;
        if (caixaId != cntCaixa.caixaId) return false;
        if (codCaixa != cntCaixa.codCaixa) return false;
        if (codUnidade != cntCaixa.codUnidade) return false;
        if (foraRelatório != cntCaixa.foraRelatório) return false;
        if (gerarNossoNúmero != cntCaixa.gerarNossoNúmero) return false;
        if (nãoConta != cntCaixa.nãoConta) return false;
        if (registrada != cntCaixa.registrada) return false;
        if (aceite != null ? !aceite.equals(cntCaixa.aceite) : cntCaixa.aceite != null) return false;
        if (agência != null ? !agência.equals(cntCaixa.agência) : cntCaixa.agência != null) return false;
        if (agênciaConta != null ? !agênciaConta.equals(cntCaixa.agênciaConta) : cntCaixa.agênciaConta != null)
            return false;
        if (bairro != null ? !bairro.equals(cntCaixa.bairro) : cntCaixa.bairro != null) return false;
        if (carteira != null ? !carteira.equals(cntCaixa.carteira) : cntCaixa.carteira != null) return false;
        if (centralBairro != null ? !centralBairro.equals(cntCaixa.centralBairro) : cntCaixa.centralBairro != null)
            return false;
        if (centralCep != null ? !centralCep.equals(cntCaixa.centralCep) : cntCaixa.centralCep != null) return false;
        if (centralCidade != null ? !centralCidade.equals(cntCaixa.centralCidade) : cntCaixa.centralCidade != null)
            return false;
        if (centralCodAgência != null ? !centralCodAgência.equals(cntCaixa.centralCodAgência) : cntCaixa.centralCodAgência != null)
            return false;
        if (centralEndereço != null ? !centralEndereço.equals(cntCaixa.centralEndereço) : cntCaixa.centralEndereço != null)
            return false;
        if (centralNome != null ? !centralNome.equals(cntCaixa.centralNome) : cntCaixa.centralNome != null)
            return false;
        if (centralUf != null ? !centralUf.equals(cntCaixa.centralUf) : cntCaixa.centralUf != null) return false;
        if (cep != null ? !cep.equals(cntCaixa.cep) : cntCaixa.cep != null) return false;
        if (cidade != null ? !cidade.equals(cntCaixa.cidade) : cntCaixa.cidade != null) return false;
        if (codContaBancaria != null ? !codContaBancaria.equals(cntCaixa.codContaBancaria) : cntCaixa.codContaBancaria != null)
            return false;
        if (codRelacionamento != null ? !codRelacionamento.equals(cntCaixa.codRelacionamento) : cntCaixa.codRelacionamento != null)
            return false;
        if (conta != null ? !conta.equals(cntCaixa.conta) : cntCaixa.conta != null) return false;
        if (contrato != null ? !contrato.equals(cntCaixa.contrato) : cntCaixa.contrato != null) return false;
        if (códigoCarteira != null ? !códigoCarteira.equals(cntCaixa.códigoCarteira) : cntCaixa.códigoCarteira != null)
            return false;
        if (códigoCedente != null ? !códigoCedente.equals(cntCaixa.códigoCedente) : cntCaixa.códigoCedente != null)
            return false;
        if (descrição != null ? !descrição.equals(cntCaixa.descrição) : cntCaixa.descrição != null) return false;
        if (dígitoAgência != null ? !dígitoAgência.equals(cntCaixa.dígitoAgência) : cntCaixa.dígitoAgência != null)
            return false;
        if (dígitoConta != null ? !dígitoConta.equals(cntCaixa.dígitoConta) : cntCaixa.dígitoConta != null)
            return false;
        if (dígitoCódigoCedente != null ? !dígitoCódigoCedente.equals(cntCaixa.dígitoCódigoCedente) : cntCaixa.dígitoCódigoCedente != null)
            return false;
        if (endereço != null ? !endereço.equals(cntCaixa.endereço) : cntCaixa.endereço != null) return false;
        if (espécie != null ? !espécie.equals(cntCaixa.espécie) : cntCaixa.espécie != null) return false;
        if (espécieDoc != null ? !espécieDoc.equals(cntCaixa.espécieDoc) : cntCaixa.espécieDoc != null) return false;
        if (nomeAgência != null ? !nomeAgência.equals(cntCaixa.nomeAgência) : cntCaixa.nomeAgência != null)
            return false;
        if (númeroArquivo != null ? !númeroArquivo.equals(cntCaixa.númeroArquivo) : cntCaixa.númeroArquivo != null)
            return false;
        if (númeroBanco != null ? !númeroBanco.equals(cntCaixa.númeroBanco) : cntCaixa.númeroBanco != null)
            return false;
        if (númeroCarnetUtilizado != null ? !númeroCarnetUtilizado.equals(cntCaixa.númeroCarnetUtilizado) : cntCaixa.númeroCarnetUtilizado != null)
            return false;
        if (operação != null ? !operação.equals(cntCaixa.operação) : cntCaixa.operação != null) return false;
        if (saldo != null ? !saldo.equals(cntCaixa.saldo) : cntCaixa.saldo != null) return false;
        if (sinco != null ? !sinco.equals(cntCaixa.sinco) : cntCaixa.sinco != null) return false;
        if (uf != null ? !uf.equals(cntCaixa.uf) : cntCaixa.uf != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (caixaId ^ (caixaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codCaixa;
        result = 31 * result + (descrição != null ? descrição.hashCode() : 0);
        result = 31 * result + (codRelacionamento != null ? codRelacionamento.hashCode() : 0);
        result = 31 * result + (númeroBanco != null ? númeroBanco.hashCode() : 0);
        result = 31 * result + (conta != null ? conta.hashCode() : 0);
        result = 31 * result + (dígitoConta != null ? dígitoConta.hashCode() : 0);
        result = 31 * result + (agência != null ? agência.hashCode() : 0);
        result = 31 * result + (dígitoAgência != null ? dígitoAgência.hashCode() : 0);
        result = 31 * result + (códigoCedente != null ? códigoCedente.hashCode() : 0);
        result = 31 * result + (dígitoCódigoCedente != null ? dígitoCódigoCedente.hashCode() : 0);
        result = 31 * result + (saldo != null ? saldo.hashCode() : 0);
        result = 31 * result + (operação != null ? operação.hashCode() : 0);
        result = 31 * result + (códigoCarteira != null ? códigoCarteira.hashCode() : 0);
        result = 31 * result + (carteira != null ? carteira.hashCode() : 0);
        result = 31 * result + (aceite != null ? aceite.hashCode() : 0);
        result = 31 * result + (espécie != null ? espécie.hashCode() : 0);
        result = 31 * result + (espécieDoc != null ? espécieDoc.hashCode() : 0);
        result = 31 * result + (agênciaConta != null ? agênciaConta.hashCode() : 0);
        result = 31 * result + (númeroArquivo != null ? númeroArquivo.hashCode() : 0);
        result = 31 * result + (nãoConta ? 1 : 0);
        result = 31 * result + (foraRelatório ? 1 : 0);
        result = 31 * result + (endereço != null ? endereço.hashCode() : 0);
        result = 31 * result + (bairro != null ? bairro.hashCode() : 0);
        result = 31 * result + (cep != null ? cep.hashCode() : 0);
        result = 31 * result + (cidade != null ? cidade.hashCode() : 0);
        result = 31 * result + (uf != null ? uf.hashCode() : 0);
        result = 31 * result + (nomeAgência != null ? nomeAgência.hashCode() : 0);
        result = 31 * result + (centralCodAgência != null ? centralCodAgência.hashCode() : 0);
        result = 31 * result + (centralEndereço != null ? centralEndereço.hashCode() : 0);
        result = 31 * result + (centralBairro != null ? centralBairro.hashCode() : 0);
        result = 31 * result + (centralCep != null ? centralCep.hashCode() : 0);
        result = 31 * result + (centralCidade != null ? centralCidade.hashCode() : 0);
        result = 31 * result + (centralUf != null ? centralUf.hashCode() : 0);
        result = 31 * result + (centralNome != null ? centralNome.hashCode() : 0);
        result = 31 * result + (registrada ? 1 : 0);
        result = 31 * result + (boletoCarnet ? 1 : 0);
        result = 31 * result + (gerarNossoNúmero ? 1 : 0);
        result = 31 * result + (númeroCarnetUtilizado != null ? númeroCarnetUtilizado.hashCode() : 0);
        result = 31 * result + (contrato != null ? contrato.hashCode() : 0);
        result = 31 * result + (sinco != null ? sinco.hashCode() : 0);
        result = 31 * result + (codContaBancaria != null ? codContaBancaria.hashCode() : 0);
        return result;
    }
}
