package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "cntTotalBalançoConta", schema = "dbo")
@IdClass(CntTotalBalancoContaPK.class)
public class CntTotalBalancoConta {
    private long totalBalançoContaId;
    private int codUnidade;
    private byte codTotalBalanço;
    private int codConta;

    @Basic
    @Column(name = "TotalBalançoConta_ID", nullable = false, insertable = true, updatable = true)
    public long getTotalBalançoContaId() {
        return totalBalançoContaId;
    }

    public void setTotalBalançoContaId(long totalBalançoContaId) {
        this.totalBalançoContaId = totalBalançoContaId;
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

    @Id
    @Column(name = "CodConta", nullable = false, insertable = true, updatable = true)
    public int getCodConta() {
        return codConta;
    }

    public void setCodConta(int codConta) {
        this.codConta = codConta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntTotalBalancoConta that = (CntTotalBalancoConta) o;

        if (codConta != that.codConta) return false;
        if (codTotalBalanço != that.codTotalBalanço) return false;
        if (codUnidade != that.codUnidade) return false;
        if (totalBalançoContaId != that.totalBalançoContaId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (totalBalançoContaId ^ (totalBalançoContaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) codTotalBalanço;
        result = 31 * result + codConta;
        return result;
    }
}
