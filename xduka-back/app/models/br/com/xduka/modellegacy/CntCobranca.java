package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "cntCobrança", schema = "dbo", catalog = "xDuka")
@IdClass(CntCobrancaPK.class)
public class CntCobranca {
    private long cobrançaId;
    private int codUnidade;
    private long númeroCobrança;
    private long codMovimento;
    private int parcela;
    private String linhaDigitável;
    private String códigoBarra;
    private String códigoBarraFormatada;
    private String nossoNúmero;
    private String asbace;
    private String agênciaConta;

    @Basic
    @Column(name = "Cobrança_ID", nullable = false, insertable = true, updatable = true)
    public long getCobrançaId() {
        return cobrançaId;
    }

    public void setCobrançaId(long cobrançaId) {
        this.cobrançaId = cobrançaId;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "NúmeroCobrança", nullable = false, insertable = true, updatable = true)
    public long getNúmeroCobrança() {
        return númeroCobrança;
    }

    public void setNúmeroCobrança(long númeroCobrança) {
        this.númeroCobrança = númeroCobrança;
    }

    @Basic
    @Column(name = "CodMovimento", nullable = false, insertable = true, updatable = true)
    public long getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(long codMovimento) {
        this.codMovimento = codMovimento;
    }

    @Basic
    @Column(name = "Parcela", nullable = false, insertable = true, updatable = true)
    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    @Basic
    @Column(name = "LinhaDigitável", nullable = true, insertable = true, updatable = true)
    public String getLinhaDigitável() {
        return linhaDigitável;
    }

    public void setLinhaDigitável(String linhaDigitável) {
        this.linhaDigitável = linhaDigitável;
    }

    @Basic
    @Column(name = "CódigoBarra", nullable = true, insertable = true, updatable = true)
    public String getCódigoBarra() {
        return códigoBarra;
    }

    public void setCódigoBarra(String códigoBarra) {
        this.códigoBarra = códigoBarra;
    }

    @Basic
    @Column(name = "CódigoBarraFormatada", nullable = true, insertable = true, updatable = true)
    public String getCódigoBarraFormatada() {
        return códigoBarraFormatada;
    }

    public void setCódigoBarraFormatada(String códigoBarraFormatada) {
        this.códigoBarraFormatada = códigoBarraFormatada;
    }

    @Basic
    @Column(name = "NossoNúmero", nullable = true, insertable = true, updatable = true)
    public String getNossoNúmero() {
        return nossoNúmero;
    }

    public void setNossoNúmero(String nossoNúmero) {
        this.nossoNúmero = nossoNúmero;
    }

    @Basic
    @Column(name = "Asbace", nullable = true, insertable = true, updatable = true)
    public String getAsbace() {
        return asbace;
    }

    public void setAsbace(String asbace) {
        this.asbace = asbace;
    }

    @Basic
    @Column(name = "AgênciaConta", nullable = true, insertable = true, updatable = true)
    public String getAgênciaConta() {
        return agênciaConta;
    }

    public void setAgênciaConta(String agênciaConta) {
        this.agênciaConta = agênciaConta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntCobranca that = (CntCobranca) o;

        if (cobrançaId != that.cobrançaId) return false;
        if (codMovimento != that.codMovimento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (númeroCobrança != that.númeroCobrança) return false;
        if (parcela != that.parcela) return false;
        if (agênciaConta != null ? !agênciaConta.equals(that.agênciaConta) : that.agênciaConta != null) return false;
        if (asbace != null ? !asbace.equals(that.asbace) : that.asbace != null) return false;
        if (códigoBarra != null ? !códigoBarra.equals(that.códigoBarra) : that.códigoBarra != null) return false;
        if (códigoBarraFormatada != null ? !códigoBarraFormatada.equals(that.códigoBarraFormatada) : that.códigoBarraFormatada != null)
            return false;
        if (linhaDigitável != null ? !linhaDigitável.equals(that.linhaDigitável) : that.linhaDigitável != null)
            return false;
        if (nossoNúmero != null ? !nossoNúmero.equals(that.nossoNúmero) : that.nossoNúmero != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cobrançaId ^ (cobrançaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) (númeroCobrança ^ (númeroCobrança >>> 32));
        result = 31 * result + (int) (codMovimento ^ (codMovimento >>> 32));
        result = 31 * result + parcela;
        result = 31 * result + (linhaDigitável != null ? linhaDigitável.hashCode() : 0);
        result = 31 * result + (códigoBarra != null ? códigoBarra.hashCode() : 0);
        result = 31 * result + (códigoBarraFormatada != null ? códigoBarraFormatada.hashCode() : 0);
        result = 31 * result + (nossoNúmero != null ? nossoNúmero.hashCode() : 0);
        result = 31 * result + (asbace != null ? asbace.hashCode() : 0);
        result = 31 * result + (agênciaConta != null ? agênciaConta.hashCode() : 0);
        return result;
    }
}
