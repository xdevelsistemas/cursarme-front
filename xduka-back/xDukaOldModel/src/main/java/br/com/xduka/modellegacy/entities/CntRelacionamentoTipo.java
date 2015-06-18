package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntRelacionamentoTipoPK.class)
public class CntRelacionamentoTipo {
    private long relacionamentoTipoId;
    private int codUnidade;
    private int codRelacionamentoTipo;
    private String relacionamentoTipo;

    @Basic
    @Column(name = "RelacionamentoTipo_ID", nullable = false, insertable = true, updatable = true)
    public long getRelacionamentoTipoId() {
        return relacionamentoTipoId;
    }

    public void setRelacionamentoTipoId(long relacionamentoTipoId) {
        this.relacionamentoTipoId = relacionamentoTipoId;
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
    @Column(name = "CodRelacionamentoTipo", nullable = false, insertable = true, updatable = true)
    public int getCodRelacionamentoTipo() {
        return codRelacionamentoTipo;
    }

    public void setCodRelacionamentoTipo(int codRelacionamentoTipo) {
        this.codRelacionamentoTipo = codRelacionamentoTipo;
    }

    @Basic
    @Column(name = "RelacionamentoTipo", nullable = true, insertable = true, updatable = true)
    public String getRelacionamentoTipo() {
        return relacionamentoTipo;
    }

    public void setRelacionamentoTipo(String relacionamentoTipo) {
        this.relacionamentoTipo = relacionamentoTipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntRelacionamentoTipo that = (CntRelacionamentoTipo) o;

        if (codRelacionamentoTipo != that.codRelacionamentoTipo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (relacionamentoTipoId != that.relacionamentoTipoId) return false;
        if (relacionamentoTipo != null ? !relacionamentoTipo.equals(that.relacionamentoTipo) : that.relacionamentoTipo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (relacionamentoTipoId ^ (relacionamentoTipoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codRelacionamentoTipo;
        result = 31 * result + (relacionamentoTipo != null ? relacionamentoTipo.hashCode() : 0);
        return result;
    }
}
