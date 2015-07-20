package br.com.xduka.modellegacy.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class AcdAnoLetivoPK implements Serializable {
    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int anoLetivo;

    @Id
    @javax.persistence.Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAnoLetivoPK that = (AcdAnoLetivoPK) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codUnidade != that.codUnidade) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + anoLetivo;

        return result;
    }
}
