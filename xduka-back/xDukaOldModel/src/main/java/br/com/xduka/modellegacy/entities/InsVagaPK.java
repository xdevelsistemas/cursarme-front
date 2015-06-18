package br.com.xduka.modellegacy.entities;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class InsVagaPK implements Serializable{

    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codInscrição;

    @Id
    @javax.persistence.Column(name = "CodInscrição", nullable = false, insertable = true, updatable = true)
    public int getCodInscrição() {
        return codInscrição;
    }

    public void setCodInscrição(int codInscrição) {
        this.codInscrição = codInscrição;
    }

    private int codCurso;

    @Id
    @javax.persistence.Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    private String codTurno;

    @Id
    @javax.persistence.Column(name = "CodTurno", nullable = false, insertable = true, updatable = true)
    public String getCodTurno() {
        return codTurno;
    }

    public void setCodTurno(String codTurno) {
        this.codTurno = codTurno;
    }

    private String turma;

    @Id
    @javax.persistence.Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }


    private int codPeríodo;

    @Id
    @javax.persistence.Column(name = "CodPeríodo", nullable = false, insertable = true, updatable = true)
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

        InsVagaPK insVaga = (InsVagaPK) o;

        if (codCurso != insVaga.codCurso) return false;
        if (codInscrição != insVaga.codInscrição) return false;
        if (codPeríodo != insVaga.codPeríodo) return false;
        if (codUnidade != insVaga.codUnidade) return false;
        if (codTurno != null ? !codTurno.equals(insVaga.codTurno) : insVaga.codTurno != null) return false;
        if (turma != null ? !turma.equals(insVaga.turma) : insVaga.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codInscrição;
        result = 31 * result + codCurso;
        result = 31 * result + (codTurno != null ? codTurno.hashCode() : 0);
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + codPeríodo;

        return result;
    }
}
