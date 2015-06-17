package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class CbrAnoCobranca {
    private int anoCobrança;

    @Id
    @javax.persistence.Column(name = "AnoCobrança", nullable = false, insertable = true, updatable = true)
    public int getAnoCobrança() {
        return anoCobrança;
    }

    public void setAnoCobrança(int anoCobrança) {
        this.anoCobrança = anoCobrança;
    }

    private String tipoCobrança;

    @Basic
    @javax.persistence.Column(name = "TipoCobrança", nullable = true, insertable = true, updatable = true)
    public String getTipoCobrança() {
        return tipoCobrança;
    }

    public void setTipoCobrança(String tipoCobrança) {
        this.tipoCobrança = tipoCobrança;
    }

    private Short docDiasValidade;

    @Basic
    @javax.persistence.Column(name = "DocDiasValidade", nullable = true, insertable = true, updatable = true)
    public Short getDocDiasValidade() {
        return docDiasValidade;
    }

    public void setDocDiasValidade(Short docDiasValidade) {
        this.docDiasValidade = docDiasValidade;
    }

    private String cartaInadimplente1;

    @Basic
    @javax.persistence.Column(name = "CartaInadimplente1", nullable = true, insertable = true, updatable = true)
    public String getCartaInadimplente1() {
        return cartaInadimplente1;
    }

    public void setCartaInadimplente1(String cartaInadimplente1) {
        this.cartaInadimplente1 = cartaInadimplente1;
    }

    private String cartaInadimplente2;

    @Basic
    @javax.persistence.Column(name = "CartaInadimplente2", nullable = true, insertable = true, updatable = true)
    public String getCartaInadimplente2() {
        return cartaInadimplente2;
    }

    public void setCartaInadimplente2(String cartaInadimplente2) {
        this.cartaInadimplente2 = cartaInadimplente2;
    }

    private Double multa;

    @Basic
    @javax.persistence.Column(name = "Multa", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    private Double juros;

    @Basic
    @javax.persistence.Column(name = "Juros", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    private Short jurosTipo;

    @Basic
    @javax.persistence.Column(name = "JurosTipo", nullable = true, insertable = true, updatable = true)
    public Short getJurosTipo() {
        return jurosTipo;
    }

    public void setJurosTipo(Short jurosTipo) {
        this.jurosTipo = jurosTipo;
    }

    private Boolean jurosSobreJuros;

    @Basic
    @javax.persistence.Column(name = "JurosSobreJuros", nullable = true, insertable = true, updatable = true)
    public Boolean getJurosSobreJuros() {
        return jurosSobreJuros;
    }

    public void setJurosSobreJuros(Boolean jurosSobreJuros) {
        this.jurosSobreJuros = jurosSobreJuros;
    }

    private String cartaInadimplente21;

    @Basic
    @javax.persistence.Column(name = "CartaInadimplente21", nullable = true, insertable = true, updatable = true)
    public String getCartaInadimplente21() {
        return cartaInadimplente21;
    }

    public void setCartaInadimplente21(String cartaInadimplente21) {
        this.cartaInadimplente21 = cartaInadimplente21;
    }

    private String cartaInadimplente32;

    @Basic
    @javax.persistence.Column(name = "CartaInadimplente32", nullable = true, insertable = true, updatable = true)
    public String getCartaInadimplente32() {
        return cartaInadimplente32;
    }

    public void setCartaInadimplente32(String cartaInadimplente32) {
        this.cartaInadimplente32 = cartaInadimplente32;
    }

    private String cartaInadimplente31;

    @Basic
    @javax.persistence.Column(name = "CartaInadimplente31", nullable = true, insertable = true, updatable = true)
    public String getCartaInadimplente31() {
        return cartaInadimplente31;
    }

    public void setCartaInadimplente31(String cartaInadimplente31) {
        this.cartaInadimplente31 = cartaInadimplente31;
    }

    private String cartaInadimplente22;

    @Basic
    @javax.persistence.Column(name = "CartaInadimplente22", nullable = true, insertable = true, updatable = true)
    public String getCartaInadimplente22() {
        return cartaInadimplente22;
    }

    public void setCartaInadimplente22(String cartaInadimplente22) {
        this.cartaInadimplente22 = cartaInadimplente22;
    }

    private Byte númeroSistema;

    @Basic
    @javax.persistence.Column(name = "NúmeroSistema", nullable = true, insertable = true, updatable = true)
    public Byte getNúmeroSistema() {
        return númeroSistema;
    }

    public void setNúmeroSistema(Byte númeroSistema) {
        this.númeroSistema = númeroSistema;
    }

    private Boolean cobrançaAvançada;

    @Basic
    @javax.persistence.Column(name = "CobrançaAvançada", nullable = true, insertable = true, updatable = true)
    public Boolean getCobrançaAvançada() {
        return cobrançaAvançada;
    }

    public void setCobrançaAvançada(Boolean cobrançaAvançada) {
        this.cobrançaAvançada = cobrançaAvançada;
    }

    private Boolean semCorreção;

    @Basic
    @javax.persistence.Column(name = "SemCorreção", nullable = true, insertable = true, updatable = true)
    public Boolean getSemCorreção() {
        return semCorreção;
    }

    public void setSemCorreção(Boolean semCorreção) {
        this.semCorreção = semCorreção;
    }

    private Boolean usarVencimento;

    @Basic
    @javax.persistence.Column(name = "UsarVencimento", nullable = true, insertable = true, updatable = true)
    public Boolean getUsarVencimento() {
        return usarVencimento;
    }

    public void setUsarVencimento(Boolean usarVencimento) {
        this.usarVencimento = usarVencimento;
    }

    private Boolean financeiro;

    @Basic
    @javax.persistence.Column(name = "Financeiro", nullable = true, insertable = true, updatable = true)
    public Boolean getFinanceiro() {
        return financeiro;
    }

    public void setFinanceiro(Boolean financeiro) {
        this.financeiro = financeiro;
    }

    private Double jurosValor;

    @Basic
    @javax.persistence.Column(name = "JurosValor", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getJurosValor() {
        return jurosValor;
    }

    public void setJurosValor(Double jurosValor) {
        this.jurosValor = jurosValor;
    }

    private Boolean cobrançaAutenticada;

    @Basic
    @javax.persistence.Column(name = "CobrançaAutenticada", nullable = true, insertable = true, updatable = true)
    public Boolean getCobrançaAutenticada() {
        return cobrançaAutenticada;
    }

    public void setCobrançaAutenticada(Boolean cobrançaAutenticada) {
        this.cobrançaAutenticada = cobrançaAutenticada;
    }

    private Short codClienteAdvogado;

    @Basic
    @javax.persistence.Column(name = "CodClienteAdvogado", nullable = true, insertable = true, updatable = true)
    public Short getCodClienteAdvogado() {
        return codClienteAdvogado;
    }

    public void setCodClienteAdvogado(Short codClienteAdvogado) {
        this.codClienteAdvogado = codClienteAdvogado;
    }

    private Short codTipoContratoAdvogado;

    @Basic
    @javax.persistence.Column(name = "CodTipoContratoAdvogado", nullable = true, insertable = true, updatable = true)
    public Short getCodTipoContratoAdvogado() {
        return codTipoContratoAdvogado;
    }

    public void setCodTipoContratoAdvogado(Short codTipoContratoAdvogado) {
        this.codTipoContratoAdvogado = codTipoContratoAdvogado;
    }

    private String contratoFicha;

    @Basic
    @javax.persistence.Column(name = "ContratoFicha", nullable = true, insertable = true, updatable = true)
    public String getContratoFicha() {
        return contratoFicha;
    }

    public void setContratoFicha(String contratoFicha) {
        this.contratoFicha = contratoFicha;
    }

    private Short rateioPrejuízo;

    @Basic
    @javax.persistence.Column(name = "RateioPrejuízo", nullable = true, insertable = true, updatable = true)
    public Short getRateioPrejuízo() {
        return rateioPrejuízo;
    }

    public void setRateioPrejuízo(Short rateioPrejuízo) {
        this.rateioPrejuízo = rateioPrejuízo;
    }

    private String banco;

    @Basic
    @javax.persistence.Column(name = "Banco", nullable = true, insertable = true, updatable = true)
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    private Boolean rateioJuros;

    @Basic
    @javax.persistence.Column(name = "RateioJuros", nullable = true, insertable = true, updatable = true)
    public Boolean getRateioJuros() {
        return rateioJuros;
    }

    public void setRateioJuros(Boolean rateioJuros) {
        this.rateioJuros = rateioJuros;
    }

    private String contrato02;

    @Basic
    @javax.persistence.Column(name = "Contrato02", nullable = true, insertable = true, updatable = true)
    public String getContrato02() {
        return contrato02;
    }

    public void setContrato02(String contrato02) {
        this.contrato02 = contrato02;
    }

    private String contrato01;

    @Basic
    @javax.persistence.Column(name = "Contrato01", nullable = true, insertable = true, updatable = true)
    public String getContrato01() {
        return contrato01;
    }

    public void setContrato01(String contrato01) {
        this.contrato01 = contrato01;
    }

    private Boolean testemunhaContrato;

    @Basic
    @javax.persistence.Column(name = "TestemunhaContrato", nullable = true, insertable = true, updatable = true)
    public Boolean getTestemunhaContrato() {
        return testemunhaContrato;
    }

    public void setTestemunhaContrato(Boolean testemunhaContrato) {
        this.testemunhaContrato = testemunhaContrato;
    }

    private Byte fonteContrato;

    @Basic
    @javax.persistence.Column(name = "FonteContrato", nullable = true, insertable = true, updatable = true)
    public Byte getFonteContrato() {
        return fonteContrato;
    }

    public void setFonteContrato(Byte fonteContrato) {
        this.fonteContrato = fonteContrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrAnoCobranca that = (CbrAnoCobranca) o;

        if (anoCobrança != that.anoCobrança) return false;
        if (banco != null ? !banco.equals(that.banco) : that.banco != null) return false;
        if (cartaInadimplente1 != null ? !cartaInadimplente1.equals(that.cartaInadimplente1) : that.cartaInadimplente1 != null)
            return false;
        if (cartaInadimplente2 != null ? !cartaInadimplente2.equals(that.cartaInadimplente2) : that.cartaInadimplente2 != null)
            return false;
        if (cartaInadimplente21 != null ? !cartaInadimplente21.equals(that.cartaInadimplente21) : that.cartaInadimplente21 != null)
            return false;
        if (cartaInadimplente22 != null ? !cartaInadimplente22.equals(that.cartaInadimplente22) : that.cartaInadimplente22 != null)
            return false;
        if (cartaInadimplente31 != null ? !cartaInadimplente31.equals(that.cartaInadimplente31) : that.cartaInadimplente31 != null)
            return false;
        if (cartaInadimplente32 != null ? !cartaInadimplente32.equals(that.cartaInadimplente32) : that.cartaInadimplente32 != null)
            return false;
        if (cobrançaAutenticada != null ? !cobrançaAutenticada.equals(that.cobrançaAutenticada) : that.cobrançaAutenticada != null)
            return false;
        if (cobrançaAvançada != null ? !cobrançaAvançada.equals(that.cobrançaAvançada) : that.cobrançaAvançada != null)
            return false;
        if (codClienteAdvogado != null ? !codClienteAdvogado.equals(that.codClienteAdvogado) : that.codClienteAdvogado != null)
            return false;
        if (codTipoContratoAdvogado != null ? !codTipoContratoAdvogado.equals(that.codTipoContratoAdvogado) : that.codTipoContratoAdvogado != null)
            return false;
        if (contrato01 != null ? !contrato01.equals(that.contrato01) : that.contrato01 != null) return false;
        if (contrato02 != null ? !contrato02.equals(that.contrato02) : that.contrato02 != null) return false;
        if (contratoFicha != null ? !contratoFicha.equals(that.contratoFicha) : that.contratoFicha != null)
            return false;
        if (docDiasValidade != null ? !docDiasValidade.equals(that.docDiasValidade) : that.docDiasValidade != null)
            return false;
        if (financeiro != null ? !financeiro.equals(that.financeiro) : that.financeiro != null) return false;
        if (fonteContrato != null ? !fonteContrato.equals(that.fonteContrato) : that.fonteContrato != null)
            return false;
        if (juros != null ? !juros.equals(that.juros) : that.juros != null) return false;
        if (jurosSobreJuros != null ? !jurosSobreJuros.equals(that.jurosSobreJuros) : that.jurosSobreJuros != null)
            return false;
        if (jurosTipo != null ? !jurosTipo.equals(that.jurosTipo) : that.jurosTipo != null) return false;
        if (jurosValor != null ? !jurosValor.equals(that.jurosValor) : that.jurosValor != null) return false;
        if (multa != null ? !multa.equals(that.multa) : that.multa != null) return false;
        if (númeroSistema != null ? !númeroSistema.equals(that.númeroSistema) : that.númeroSistema != null)
            return false;
        if (rateioJuros != null ? !rateioJuros.equals(that.rateioJuros) : that.rateioJuros != null) return false;
        if (rateioPrejuízo != null ? !rateioPrejuízo.equals(that.rateioPrejuízo) : that.rateioPrejuízo != null)
            return false;
        if (semCorreção != null ? !semCorreção.equals(that.semCorreção) : that.semCorreção != null) return false;
        if (testemunhaContrato != null ? !testemunhaContrato.equals(that.testemunhaContrato) : that.testemunhaContrato != null)
            return false;
        if (tipoCobrança != null ? !tipoCobrança.equals(that.tipoCobrança) : that.tipoCobrança != null) return false;
        if (usarVencimento != null ? !usarVencimento.equals(that.usarVencimento) : that.usarVencimento != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = anoCobrança;
        result = 31 * result + (tipoCobrança != null ? tipoCobrança.hashCode() : 0);
        result = 31 * result + (docDiasValidade != null ? docDiasValidade.hashCode() : 0);
        result = 31 * result + (cartaInadimplente1 != null ? cartaInadimplente1.hashCode() : 0);
        result = 31 * result + (cartaInadimplente2 != null ? cartaInadimplente2.hashCode() : 0);
        result = 31 * result + (multa != null ? multa.hashCode() : 0);
        result = 31 * result + (juros != null ? juros.hashCode() : 0);
        result = 31 * result + (jurosTipo != null ? jurosTipo.hashCode() : 0);
        result = 31 * result + (jurosSobreJuros != null ? jurosSobreJuros.hashCode() : 0);
        result = 31 * result + (cartaInadimplente21 != null ? cartaInadimplente21.hashCode() : 0);
        result = 31 * result + (cartaInadimplente32 != null ? cartaInadimplente32.hashCode() : 0);
        result = 31 * result + (cartaInadimplente31 != null ? cartaInadimplente31.hashCode() : 0);
        result = 31 * result + (cartaInadimplente22 != null ? cartaInadimplente22.hashCode() : 0);
        result = 31 * result + (númeroSistema != null ? númeroSistema.hashCode() : 0);
        result = 31 * result + (cobrançaAvançada != null ? cobrançaAvançada.hashCode() : 0);
        result = 31 * result + (semCorreção != null ? semCorreção.hashCode() : 0);
        result = 31 * result + (usarVencimento != null ? usarVencimento.hashCode() : 0);
        result = 31 * result + (financeiro != null ? financeiro.hashCode() : 0);
        result = 31 * result + (jurosValor != null ? jurosValor.hashCode() : 0);
        result = 31 * result + (cobrançaAutenticada != null ? cobrançaAutenticada.hashCode() : 0);
        result = 31 * result + (codClienteAdvogado != null ? codClienteAdvogado.hashCode() : 0);
        result = 31 * result + (codTipoContratoAdvogado != null ? codTipoContratoAdvogado.hashCode() : 0);
        result = 31 * result + (contratoFicha != null ? contratoFicha.hashCode() : 0);
        result = 31 * result + (rateioPrejuízo != null ? rateioPrejuízo.hashCode() : 0);
        result = 31 * result + (banco != null ? banco.hashCode() : 0);
        result = 31 * result + (rateioJuros != null ? rateioJuros.hashCode() : 0);
        result = 31 * result + (contrato02 != null ? contrato02.hashCode() : 0);
        result = 31 * result + (contrato01 != null ? contrato01.hashCode() : 0);
        result = 31 * result + (testemunhaContrato != null ? testemunhaContrato.hashCode() : 0);
        result = 31 * result + (fonteContrato != null ? fonteContrato.hashCode() : 0);
        return result;
    }
}
