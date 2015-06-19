package br.com.xduka.modellegacy.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class AcdFormulaPK implements Serializable{


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

    private int codFórmula;

    @Id
    @javax.persistence.Column(name = "CodFórmula", nullable = false, insertable = true, updatable = true)
    public int getCodFórmula() {
        return codFórmula;
    }

    public void setCodFórmula(int codFórmula) {
        this.codFórmula = codFórmula;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdFormulaPK that = (AcdFormulaPK) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codFórmula != that.codFórmula) return false;
        if (codUnidade != that.codUnidade) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + codFórmula;
        return result;
    }
}
