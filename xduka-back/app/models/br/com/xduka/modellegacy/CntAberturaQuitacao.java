package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class CntAberturaQuitacao {
    private long aberturaQuitaçãoId;
    private int codAbertura;
    private int codUnidade;
    private long codMovimento;
    private int parcela;
    private int recibo;
    private BigDecimal pagarValor;
    private Timestamp pagoData;
    private BigDecimal pagoValor;
    private BigDecimal valor;
    private Boolean estorno;
    private Timestamp data;
    private int idUsuário;
    private CntAbertura cntAbertura;

    @Id
    @Column(name = "AberturaQuitação_ID", nullable = false, insertable = true, updatable = true)
    public long getAberturaQuitaçãoId() {
        return aberturaQuitaçãoId;
    }

    public void setAberturaQuitaçãoId(long aberturaQuitaçãoId) {
        this.aberturaQuitaçãoId = aberturaQuitaçãoId;
    }

    @Basic
    @Column(name = "CodAbertura", nullable = false, insertable = true, updatable = true)
    public int getCodAbertura() {
        return codAbertura;
    }

    public void setCodAbertura(int codAbertura) {
        this.codAbertura = codAbertura;
    }

    @Basic
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
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
    @Column(name = "Recibo", nullable = false, insertable = true, updatable = true)
    public int getRecibo() {
        return recibo;
    }

    public void setRecibo(int recibo) {
        this.recibo = recibo;
    }

    @Basic
    @Column(name = "PagarValor", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPagarValor() {
        return pagarValor;
    }

    public void setPagarValor(BigDecimal pagarValor) {
        this.pagarValor = pagarValor;
    }

    @Basic
    @Column(name = "PagoData", nullable = true, insertable = true, updatable = true)
    public Timestamp getPagoData() {
        return pagoData;
    }

    public void setPagoData(Timestamp pagoData) {
        this.pagoData = pagoData;
    }

    @Basic
    @Column(name = "PagoValor", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPagoValor() {
        return pagoValor;
    }

    public void setPagoValor(BigDecimal pagoValor) {
        this.pagoValor = pagoValor;
    }

    @Basic
    @Column(name = "Valor", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Basic
    @Column(name = "Estorno", nullable = true, insertable = true, updatable = true)
    public Boolean getEstorno() {
        return estorno;
    }

    public void setEstorno(Boolean estorno) {
        this.estorno = estorno;
    }

    @Basic
    @Column(name = "Data", nullable = true, insertable = true, updatable = true)
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Basic
    @Column(name = "IDUsuário", nullable = false, insertable = true, updatable = true)
    public int getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(int idUsuário) {
        this.idUsuário = idUsuário;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntAberturaQuitacao that = (CntAberturaQuitacao) o;

        if (aberturaQuitaçãoId != that.aberturaQuitaçãoId) return false;
        if (codAbertura != that.codAbertura) return false;
        if (codMovimento != that.codMovimento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (idUsuário != that.idUsuário) return false;
        if (parcela != that.parcela) return false;
        if (recibo != that.recibo) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (estorno != null ? !estorno.equals(that.estorno) : that.estorno != null) return false;
        if (pagarValor != null ? !pagarValor.equals(that.pagarValor) : that.pagarValor != null) return false;
        if (pagoData != null ? !pagoData.equals(that.pagoData) : that.pagoData != null) return false;
        if (pagoValor != null ? !pagoValor.equals(that.pagoValor) : that.pagoValor != null) return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (aberturaQuitaçãoId ^ (aberturaQuitaçãoId >>> 32));
        result = 31 * result + codAbertura;
        result = 31 * result + codUnidade;
        result = 31 * result + (int) (codMovimento ^ (codMovimento >>> 32));
        result = 31 * result + parcela;
        result = 31 * result + recibo;
        result = 31 * result + (pagarValor != null ? pagarValor.hashCode() : 0);
        result = 31 * result + (pagoData != null ? pagoData.hashCode() : 0);
        result = 31 * result + (pagoValor != null ? pagoValor.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (estorno != null ? estorno.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + idUsuário;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CodAbertura", referencedColumnName = "CodAbertura", nullable = false)
    public CntAbertura getCntAbertura() {
        return cntAbertura;
    }

    public void setCntAbertura(CntAbertura cntAbertura) {
        this.cntAbertura = cntAbertura;
    }
}
