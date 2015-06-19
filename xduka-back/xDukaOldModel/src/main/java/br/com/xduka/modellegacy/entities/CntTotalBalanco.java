package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "cntTotalBalanço", schema = "dbo")
@IdClass(CntTotalBalancoPK.class)
public class CntTotalBalanco {
    private long totalBalançoId;
    private int codUnidade;
    private byte codTotalBalanço;
    private String totalBalanço;

    @Basic
    @Column(name = "TotalBalanço_ID", nullable = false, insertable = true, updatable = true)
    public long getTotalBalançoId() {
        return totalBalançoId;
    }

    public void setTotalBalançoId(long totalBalançoId) {
        this.totalBalançoId = totalBalançoId;
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
    @Column(name = "CodTotalBalanço", nullable = false, insertable = true, updatable = true)
    public byte getCodTotalBalanço() {
        return codTotalBalanço;
    }

    public void setCodTotalBalanço(byte codTotalBalanço) {
        this.codTotalBalanço = codTotalBalanço;
    }

    @Basic
    @Column(name = "TotalBalanço", nullable = true, insertable = true, updatable = true)
    public String getTotalBalanço() {
        return totalBalanço;
    }

    public void setTotalBalanço(String totalBalanço) {
        this.totalBalanço = totalBalanço;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntTotalBalanco that = (CntTotalBalanco) o;

        if (codTotalBalanço != that.codTotalBalanço) return false;
        if (codUnidade != that.codUnidade) return false;
        if (totalBalançoId != that.totalBalançoId) return false;
        if (totalBalanço != null ? !totalBalanço.equals(that.totalBalanço) : that.totalBalanço != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (totalBalançoId ^ (totalBalançoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) codTotalBalanço;
        result = 31 * result + (totalBalanço != null ? totalBalanço.hashCode() : 0);
        return result;
    }
}
