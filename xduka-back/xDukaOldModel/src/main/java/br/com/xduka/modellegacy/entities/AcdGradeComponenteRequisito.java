package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdGradeComponenteRequisitoPK.class)
public class AcdGradeComponenteRequisito {
    private long requisitoId;
    private int codUnidade;
    private int codCurso;
    private int codGrade;
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
    @Column(name = "CodGrade", nullable = false, insertable = true, updatable = true)
    public int getCodGrade() {
        return codGrade;
    }

    public void setCodGrade(int codGrade) {
        this.codGrade = codGrade;
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

        AcdGradeComponenteRequisito that = (AcdGradeComponenteRequisito) o;

        if (codCurso != that.codCurso) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codGrade != that.codGrade) return false;
        if (codPréRequisito != that.codPréRequisito) return false;
        if (codUnidade != that.codUnidade) return false;
        if (requisitoId != that.requisitoId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (requisitoId ^ (requisitoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + codGrade;
        result = 31 * result + codDisciplina;
        result = 31 * result + codPréRequisito;
        return result;
    }
}
