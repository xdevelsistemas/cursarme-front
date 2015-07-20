package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdAtividadeExtraPK implements Serializable {
    private int anoLetivo;
    private int codUnidade;
    private int codExtra;

    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    @Id
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodExtra", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodExtra() {
        return codExtra;
    }

    public void setCodExtra(int codExtra) {
        this.codExtra = codExtra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAtividadeExtraPK that = (AcdAtividadeExtraPK) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codExtra != that.codExtra) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + codExtra;
        return result;
    }
}
