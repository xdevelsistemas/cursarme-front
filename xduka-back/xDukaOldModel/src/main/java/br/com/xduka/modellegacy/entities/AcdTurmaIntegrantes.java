package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdTurmaIntegrantesPK.class)
public class AcdTurmaIntegrantes {
    private long turmaIntegrantesId;
    private int anoLetivo;
    private String turma;
    private int codUnidade;
    private int codCurso;
    private byte codÁrea;
    private String codGrupo;
    private byte codCursoVest;
    private byte[] cts;

    @Basic
    @Column(name = "TurmaIntegrantes_ID", nullable = false, insertable = true, updatable = true)
    public long getTurmaIntegrantesId() {
        return turmaIntegrantesId;
    }

    public void setTurmaIntegrantesId(long turmaIntegrantesId) {
        this.turmaIntegrantesId = turmaIntegrantesId;
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
    @Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
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
    @Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    @Id
    @Column(name = "CodÁrea", nullable = false, insertable = true, updatable = true)
    public byte getCodÁrea() {
        return codÁrea;
    }

    public void setCodÁrea(byte codÁrea) {
        this.codÁrea = codÁrea;
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
    @Column(name = "CodCursoVest", nullable = false, insertable = true, updatable = true)
    public byte getCodCursoVest() {
        return codCursoVest;
    }

    public void setCodCursoVest(byte codCursoVest) {
        this.codCursoVest = codCursoVest;
    }

    @Basic
    @Column(name = "CTS", nullable = true, insertable = true, updatable = true)
    public byte[] getCts() {
        return cts;
    }

    public void setCts(byte[] cts) {
        this.cts = cts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdTurmaIntegrantes that = (AcdTurmaIntegrantes) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codCurso != that.codCurso) return false;
        if (codCursoVest != that.codCursoVest) return false;
        if (codUnidade != that.codUnidade) return false;
        if (codÁrea != that.codÁrea) return false;
        if (turmaIntegrantesId != that.turmaIntegrantesId) return false;
        if (codGrupo != null ? !codGrupo.equals(that.codGrupo) : that.codGrupo != null) return false;
        if (!Arrays.equals(cts, that.cts)) return false;
        if (turma != null ? !turma.equals(that.turma) : that.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (turmaIntegrantesId ^ (turmaIntegrantesId >>> 32));
        result = 31 * result + anoLetivo;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + (int) codÁrea;
        result = 31 * result + (codGrupo != null ? codGrupo.hashCode() : 0);
        result = 31 * result + (int) codCursoVest;
        result = 31 * result + (cts != null ? Arrays.hashCode(cts) : 0);
        return result;
    }
}
