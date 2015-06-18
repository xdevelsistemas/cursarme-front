package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdGrupoVestPK implements Serializable {
    private int anoLetivo;
    private int codUnidade;
    private String codGrupo;

    @Column(name = "AnoLetivo", nullable = false, insertable = false, updatable = false)
    @Id
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodGrupo", nullable = false, insertable = true, updatable = true)
    @Id
    public String getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(String codGrupo) {
        this.codGrupo = codGrupo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdGrupoVestPK that = (AcdGrupoVestPK) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (codGrupo != null ? !codGrupo.equals(that.codGrupo) : that.codGrupo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + (codGrupo != null ? codGrupo.hashCode() : 0);
        return result;
    }
}
