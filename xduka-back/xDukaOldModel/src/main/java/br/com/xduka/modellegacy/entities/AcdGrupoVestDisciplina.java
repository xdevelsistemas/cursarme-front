package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdGrupoVestDisciplinaPK.class)
public class AcdGrupoVestDisciplina {
    private long grupoVestId;
    private int anoLetivo;
    private int codUnidade;
    private String codGrupo;
    private int codDisciplina;

    @Basic
    @Column(name = "GrupoVest_ID", nullable = false, insertable = true, updatable = true)
    public long getGrupoVestId() {
        return grupoVestId;
    }

    public void setGrupoVestId(long grupoVestId) {
        this.grupoVestId = grupoVestId;
    }

    @Id
    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
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
    @Column(name = "CodGrupo", nullable = false, insertable = true, updatable = true)
    public String getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(String codGrupo) {
        this.codGrupo = codGrupo;
    }

    @Id
    @Column(name = "CodDisciplina", nullable = false, insertable = true, updatable = true)
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

        AcdGrupoVestDisciplina that = (AcdGrupoVestDisciplina) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codUnidade != that.codUnidade) return false;
        if (grupoVestId != that.grupoVestId) return false;
        if (codGrupo != null ? !codGrupo.equals(that.codGrupo) : that.codGrupo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (grupoVestId ^ (grupoVestId >>> 32));
        result = 31 * result + anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + (codGrupo != null ? codGrupo.hashCode() : 0);
        result = 31 * result + codDisciplina;
        return result;
    }
}
