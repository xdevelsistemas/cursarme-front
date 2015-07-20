package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CbrPlanoPK implements Serializable {
    private int codUnidade;
    private int anoLetivo;
    private String plano;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    @Id
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Column(name = "Plano", nullable = false, insertable = true, updatable = true)
    @Id
    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrPlanoPK that = (CbrPlanoPK) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (plano != null ? !plano.equals(that.plano) : that.plano != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + (plano != null ? plano.hashCode() : 0);
        return result;
    }
}
