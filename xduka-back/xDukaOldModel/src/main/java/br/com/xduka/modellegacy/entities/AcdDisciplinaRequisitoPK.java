package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdDisciplinaRequisitoPK implements Serializable {
    private byte codUnidade;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(byte codUnidade) {
        this.codUnidade = codUnidade;
    }

    private byte codCurso;

    @Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(byte codCurso) {
        this.codCurso = codCurso;
    }

    private String codGrade;

    @Column(name = "CodGrade", nullable = false, insertable = true, updatable = true, length = 10)
    @Id
    public String getCodGrade() {
        return codGrade;
    }

    public void setCodGrade(String codGrade) {
        this.codGrade = codGrade;
    }

    private String codPeríodo;

    @Column(name = "CodPeríodo", nullable = false, insertable = true, updatable = true)
    @Id
    public String getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(String codPeríodo) {
        this.codPeríodo = codPeríodo;
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

    private int codPréRequisito;

    @Column(name = "CodPréRequisito", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodPréRequisito() {
        return codPréRequisito;
    }

    public void setCodPréRequisito(int codPréRequisito) {
        this.codPréRequisito = codPréRequisito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdDisciplinaRequisitoPK that = (AcdDisciplinaRequisitoPK) o;

        if (codCurso != that.codCurso) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codPréRequisito != that.codPréRequisito) return false;
        if (codUnidade != that.codUnidade) return false;
        if (codGrade != null ? !codGrade.equals(that.codGrade) : that.codGrade != null) return false;
        if (codPeríodo != null ? !codPeríodo.equals(that.codPeríodo) : that.codPeríodo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) codUnidade;
        result = 31 * result + (int) codCurso;
        result = 31 * result + (codGrade != null ? codGrade.hashCode() : 0);
        result = 31 * result + (codPeríodo != null ? codPeríodo.hashCode() : 0);
        result = 31 * result + codDisciplina;
        result = 31 * result + codPréRequisito;
        return result;
    }
}
