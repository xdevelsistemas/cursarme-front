package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class AnaliseRemessa {
    private int id;
    private String remessa;
    private String codMov;
    private Date vencimento;
    private BigDecimal valorPago;
    private Date dtaPto;
    private BigDecimal valorParc;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "remessa", nullable = false, insertable = true, updatable = true, length = 50)
    public String getRemessa() {
        return remessa;
    }

    public void setRemessa(String remessa) {
        this.remessa = remessa;
    }

    @Basic
    @Column(name = "codMov", nullable = false, insertable = true, updatable = true, length = 50)
    public String getCodMov() {
        return codMov;
    }

    public void setCodMov(String codMov) {
        this.codMov = codMov;
    }

    @Basic
    @Column(name = "vencimento", nullable = false, insertable = true, updatable = true)
    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    @Basic
    @Column(name = "valorPago", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    @Basic
    @Column(name = "dtaPto", nullable = true, insertable = true, updatable = true)
    public Date getDtaPto() {
        return dtaPto;
    }

    public void setDtaPto(Date dtaPto) {
        this.dtaPto = dtaPto;
    }

    @Basic
    @Column(name = "valorParc", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorParc() {
        return valorParc;
    }

    public void setValorParc(BigDecimal valorParc) {
        this.valorParc = valorParc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnaliseRemessa that = (AnaliseRemessa) o;

        if (id != that.id) return false;
        if (codMov != null ? !codMov.equals(that.codMov) : that.codMov != null) return false;
        if (dtaPto != null ? !dtaPto.equals(that.dtaPto) : that.dtaPto != null) return false;
        if (remessa != null ? !remessa.equals(that.remessa) : that.remessa != null) return false;
        if (valorPago != null ? !valorPago.equals(that.valorPago) : that.valorPago != null) return false;
        if (valorParc != null ? !valorParc.equals(that.valorParc) : that.valorParc != null) return false;
        if (vencimento != null ? !vencimento.equals(that.vencimento) : that.vencimento != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (remessa != null ? remessa.hashCode() : 0);
        result = 31 * result + (codMov != null ? codMov.hashCode() : 0);
        result = 31 * result + (vencimento != null ? vencimento.hashCode() : 0);
        result = 31 * result + (valorPago != null ? valorPago.hashCode() : 0);
        result = 31 * result + (dtaPto != null ? dtaPto.hashCode() : 0);
        result = 31 * result + (valorParc != null ? valorParc.hashCode() : 0);
        return result;
    }
}
