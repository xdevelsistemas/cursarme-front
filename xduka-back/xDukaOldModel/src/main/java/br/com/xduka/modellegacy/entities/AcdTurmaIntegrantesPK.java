package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdTurmaIntegrantesPK implements Serializable {
    private int anoLetivo;

    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    @Id
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    private String turma;

    @Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    @Id
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
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

    private int codCurso;

    @Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    private byte codÁrea;

    @Column(name = "CodÁrea", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodÁrea() {
        return codÁrea;
    }

    public void setCodÁrea(byte codÁrea) {
        this.codÁrea = codÁrea;
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

    private byte codCursoVest;

    @Column(name = "CodCursoVest", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodCursoVest() {
        return codCursoVest;
    }

    public void setCodCursoVest(byte codCursoVest) {
        this.codCursoVest = codCursoVest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdTurmaIntegrantesPK that = (AcdTurmaIntegrantesPK) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codCurso != that.codCurso) return false;
        if (codCursoVest != that.codCursoVest) return false;
        if (codUnidade != that.codUnidade) return false;
        if (codÁrea != that.codÁrea) return false;
        if (codGrupo != null ? !codGrupo.equals(that.codGrupo) : that.codGrupo != null) return false;
        if (turma != null ? !turma.equals(that.turma) : that.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = anoLetivo;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + (int) codÁrea;
        result = 31 * result + (codGrupo != null ? codGrupo.hashCode() : 0);
        result = 31 * result + (int) codCursoVest;
        return result;
    }
}
