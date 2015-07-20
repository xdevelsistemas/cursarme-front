package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class InsCandidatoCursoPK implements Serializable {
    private int codUnidade;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codInscrição;

    @Column(name = "CodInscrição", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodInscrição() {
        return codInscrição;
    }

    public void setCodInscrição(int codInscrição) {
        this.codInscrição = codInscrição;
    }

    private int codCandidato;

    @Column(name = "CodCandidato", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodCandidato() {
        return codCandidato;
    }

    public void setCodCandidato(int codCandidato) {
        this.codCandidato = codCandidato;
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

    private String turma;

    @Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    @Id
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    private String codTurno;

    @Column(name = "CodTurno", nullable = false, insertable = true, updatable = true)
    @Id
    public String getCodTurno() {
        return codTurno;
    }

    public void setCodTurno(String codTurno) {
        this.codTurno = codTurno;
    }

    private int codPeríodo;

    @Column(name = "CodPeríodo", nullable = false, insertable = true, updatable = true)
    @Id
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

        InsCandidatoCursoPK that = (InsCandidatoCursoPK) o;

        if (codCandidato != that.codCandidato) return false;
        if (codCurso != that.codCurso) return false;
        if (codInscrição != that.codInscrição) return false;
        if (codPeríodo != that.codPeríodo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (codTurno != null ? !codTurno.equals(that.codTurno) : that.codTurno != null) return false;
        if (turma != null ? !turma.equals(that.turma) : that.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codInscrição;
        result = 31 * result + codCandidato;
        result = 31 * result + codCurso;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + (codTurno != null ? codTurno.hashCode() : 0);
        result = 31 * result + codPeríodo;
        return result;
    }
}
