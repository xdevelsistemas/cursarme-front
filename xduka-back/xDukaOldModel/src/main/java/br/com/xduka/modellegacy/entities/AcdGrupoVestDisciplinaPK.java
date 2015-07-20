package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdGrupoVestDisciplinaPK implements Serializable {
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

    private String codGrupo;

    @Column(name = "CodGrupo", nullable = false, insertable = true, updatable = true)
    @Id
    public String getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(String codGrupo) {
        this.codGrupo = codGrupo;
    }

    private int codDisciplina;

    @Column(name = "CodDisciplina", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdGrupoVestDisciplinaPK that = (AcdGrupoVestDisciplinaPK) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codUnidade != that.codUnidade) return false;
        if (codGrupo != null ? !codGrupo.equals(that.codGrupo) : that.codGrupo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + (codGrupo != null ? codGrupo.hashCode() : 0);
        result = 31 * result + codDisciplina;
        return result;
    }
}
