package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdDisciplinaRequisitoPK.class)
public class AcdDisciplinaRequisito {
    private long requisitoId;
    private byte codUnidade;
    private byte codCurso;
    private String codGrade;
    private String codPeríodo;
    private int codDisciplina;
    private int codPréRequisito;

    @Basic
    @Column(name = "Requisito_ID", nullable = false, insertable = true, updatable = true)
    public long getRequisitoId() {
        return requisitoId;
    }

    public void setRequisitoId(long requisitoId) {
        this.requisitoId = requisitoId;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public byte getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(byte codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    public byte getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(byte codCurso) {
        this.codCurso = codCurso;
    }

    @Id
    @Column(name = "CodGrade", nullable = false, insertable = true, updatable = true, length = 10)
    public String getCodGrade() {
        return codGrade;
    }

    public void setCodGrade(String codGrade) {
        this.codGrade = codGrade;
    }

    @Id
    @Column(name = "CodPeríodo", nullable = false, insertable = true, updatable = true)
    public String getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(String codPeríodo) {
        this.codPeríodo = codPeríodo;
    }

    @Id
    @Column(name = "CodDisciplina", nullable = false, insertable = true, updatable = true)
    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    @Id
    @Column(name = "CodPréRequisito", nullable = false, insertable = true, updatable = true)
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

        AcdDisciplinaRequisito that = (AcdDisciplinaRequisito) o;

        if (codCurso != that.codCurso) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codPréRequisito != that.codPréRequisito) return false;
        if (codUnidade != that.codUnidade) return false;
        if (requisitoId != that.requisitoId) return false;
        if (codGrade != null ? !codGrade.equals(that.codGrade) : that.codGrade != null) return false;
        if (codPeríodo != null ? !codPeríodo.equals(that.codPeríodo) : that.codPeríodo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (requisitoId ^ (requisitoId >>> 32));
        result = 31 * result + (int) codUnidade;
        result = 31 * result + (int) codCurso;
        result = 31 * result + (codGrade != null ? codGrade.hashCode() : 0);
        result = 31 * result + (codPeríodo != null ? codPeríodo.hashCode() : 0);
        result = 31 * result + codDisciplina;
        result = 31 * result + codPréRequisito;
        return result;
    }
}
