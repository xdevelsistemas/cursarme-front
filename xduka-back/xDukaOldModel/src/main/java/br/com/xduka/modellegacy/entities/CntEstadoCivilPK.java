package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntEstadoCivilPK implements Serializable {
    private int codUnidade;
    private int codEstadoCivil;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodEstadoCivil", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodEstadoCivil() {
        return codEstadoCivil;
    }

    public void setCodEstadoCivil(int codEstadoCivil) {
        this.codEstadoCivil = codEstadoCivil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntEstadoCivilPK that = (CntEstadoCivilPK) o;

        if (codEstadoCivil != that.codEstadoCivil) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codEstadoCivil;
        return result;
    }
}
