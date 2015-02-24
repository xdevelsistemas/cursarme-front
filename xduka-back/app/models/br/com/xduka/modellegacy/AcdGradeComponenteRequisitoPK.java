package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdGradeComponenteRequisitoPK implements Serializable {
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

    private int codGrade;

    @Column(name = "CodGrade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodGrade() {
        return codGrade;
    }

    public void setCodGrade(int codGrade) {
        this.codGrade = codGrade;
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

        AcdGradeComponenteRequisitoPK that = (AcdGradeComponenteRequisitoPK) o;

        if (codCurso != that.codCurso) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codGrade != that.codGrade) return false;
        if (codPréRequisito != that.codPréRequisito) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + codGrade;
        result = 31 * result + codDisciplina;
        result = 31 * result + codPréRequisito;
        return result;
    }
}
