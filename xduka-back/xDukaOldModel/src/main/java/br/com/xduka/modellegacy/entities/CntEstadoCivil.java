package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntEstadoCivilPK.class)
public class CntEstadoCivil {
    private long estadoCivilId;
    private int codUnidade;
    private int codEstadoCivil;
    private String estadoCivil;

    @Basic
    @Column(name = "EstadoCivil_Id", nullable = false, insertable = true, updatable = true)
    public long getEstadoCivilId() {
        return estadoCivilId;
    }

    public void setEstadoCivilId(long estadoCivilId) {
        this.estadoCivilId = estadoCivilId;
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
    @Column(name = "CodEstadoCivil", nullable = false, insertable = true, updatable = true)
    public int getCodEstadoCivil() {
        return codEstadoCivil;
    }

    public void setCodEstadoCivil(int codEstadoCivil) {
        this.codEstadoCivil = codEstadoCivil;
    }

    @Basic
    @Column(name = "EstadoCivil", nullable = true, insertable = true, updatable = true)
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntEstadoCivil that = (CntEstadoCivil) o;

        if (codEstadoCivil != that.codEstadoCivil) return false;
        if (codUnidade != that.codUnidade) return false;
        if (estadoCivilId != that.estadoCivilId) return false;
        if (estadoCivil != null ? !estadoCivil.equals(that.estadoCivil) : that.estadoCivil != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (estadoCivilId ^ (estadoCivilId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codEstadoCivil;
        result = 31 * result + (estadoCivil != null ? estadoCivil.hashCode() : 0);
        return result;
    }
}
