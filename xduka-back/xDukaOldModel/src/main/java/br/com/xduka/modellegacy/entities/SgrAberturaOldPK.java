package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class SgrAberturaOldPK implements Serializable {
    private int idFormulário;
    private int idUsuário;
    private int codUnidade;

    @Id
    @Column(name = "IDFormulário", nullable = false, insertable = true, updatable = true)
    public int getIdFormulário() {
        return idFormulário;
    }

    public void setIdFormulário(int idFormulário) {
        this.idFormulário = idFormulário;
    }

    @Id
    @Column(name = "IDUsuário", nullable = false, insertable = true, updatable = true)
    public int getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(int idUsuário) {
        this.idUsuário = idUsuário;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrAberturaOldPK that = (SgrAberturaOldPK) o;

        if (codUnidade != that.codUnidade) return false;
        if (idFormulário != that.idFormulário) return false;
        if (idUsuário != that.idUsuário) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFormulário;
        result = 31 * result + idUsuário;
        result = 31 * result + codUnidade;
        return result;
    }
}
