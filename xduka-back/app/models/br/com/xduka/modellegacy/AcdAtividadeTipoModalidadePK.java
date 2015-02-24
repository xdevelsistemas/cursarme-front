package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdAtividadeTipoModalidadePK implements Serializable {
    private int anoLetivo;

    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    @Id
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    private int codUnidade;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codTipo;

    @Column(name = "CodTipo", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(int codTipo) {
        this.codTipo = codTipo;
    }

    private int codModalidade;

    @Column(name = "CodModalidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodModalidade() {
        return codModalidade;
    }

    public void setCodModalidade(int codModalidade) {
        this.codModalidade = codModalidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAtividadeTipoModalidadePK that = (AcdAtividadeTipoModalidadePK) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codModalidade != that.codModalidade) return false;
        if (codTipo != that.codTipo) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + codTipo;
        result = 31 * result + codModalidade;
        return result;
    }
}
