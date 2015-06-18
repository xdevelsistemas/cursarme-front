package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(InsCandidatoCursoPK.class)
public class InsCandidatoCurso {
    private long candidatoCursoId;
    private int codUnidade;
    private int codInscrição;
    private int codCandidato;
    private int codCurso;
    private String turma;
    private int anoLetivo;
    private Byte opção;
    private String codTurno;
    private Boolean apto;
    private String turmaMatriculado;
    private int codPeríodo;

    @Basic
    @Column(name = "CandidatoCurso_ID", nullable = false, insertable = true, updatable = true)
    public long getCandidatoCursoId() {
        return candidatoCursoId;
    }

    public void setCandidatoCursoId(long candidatoCursoId) {
        this.candidatoCursoId = candidatoCursoId;
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
    @Column(name = "CodInscrição", nullable = false, insertable = true, updatable = true)
    public int getCodInscrição() {
        return codInscrição;
    }

    public void setCodInscrição(int codInscrição) {
        this.codInscrição = codInscrição;
    }

    @Id
    @Column(name = "CodCandidato", nullable = false, insertable = true, updatable = true)
    public int getCodCandidato() {
        return codCandidato;
    }

    public void setCodCandidato(int codCandidato) {
        this.codCandidato = codCandidato;
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
    @Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Basic
    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Basic
    @Column(name = "Opção", nullable = true, insertable = true, updatable = true)
    public Byte getOpção() {
        return opção;
    }

    public void setOpção(Byte opção) {
        this.opção = opção;
    }

    @Id
    @Column(name = "CodTurno", nullable = false, insertable = true, updatable = true)
    public String getCodTurno() {
        return codTurno;
    }

    public void setCodTurno(String codTurno) {
        this.codTurno = codTurno;
    }

    @Basic
    @Column(name = "Apto", nullable = true, insertable = true, updatable = true)
    public Boolean getApto() {
        return apto;
    }

    public void setApto(Boolean apto) {
        this.apto = apto;
    }

    @Basic
    @Column(name = "TurmaMatriculado", nullable = true, insertable = true, updatable = true)
    public String getTurmaMatriculado() {
        return turmaMatriculado;
    }

    public void setTurmaMatriculado(String turmaMatriculado) {
        this.turmaMatriculado = turmaMatriculado;
    }

    @Id
    @Column(name = "CodPeríodo", nullable = false, insertable = true, updatable = true)
    public int getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(int codPeríodo) {
        this.codPeríodo = codPeríodo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsCandidatoCurso that = (InsCandidatoCurso) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (candidatoCursoId != that.candidatoCursoId) return false;
        if (codCandidato != that.codCandidato) return false;
        if (codCurso != that.codCurso) return false;
        if (codInscrição != that.codInscrição) return false;
        if (codPeríodo != that.codPeríodo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (apto != null ? !apto.equals(that.apto) : that.apto != null) return false;
        if (codTurno != null ? !codTurno.equals(that.codTurno) : that.codTurno != null) return false;
        if (opção != null ? !opção.equals(that.opção) : that.opção != null) return false;
        if (turma != null ? !turma.equals(that.turma) : that.turma != null) return false;
        if (turmaMatriculado != null ? !turmaMatriculado.equals(that.turmaMatriculado) : that.turmaMatriculado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (candidatoCursoId ^ (candidatoCursoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codInscrição;
        result = 31 * result + codCandidato;
        result = 31 * result + codCurso;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + anoLetivo;
        result = 31 * result + (opção != null ? opção.hashCode() : 0);
        result = 31 * result + (codTurno != null ? codTurno.hashCode() : 0);
        result = 31 * result + (apto != null ? apto.hashCode() : 0);
        result = 31 * result + (turmaMatriculado != null ? turmaMatriculado.hashCode() : 0);
        result = 31 * result + codPeríodo;
        return result;
    }
}
