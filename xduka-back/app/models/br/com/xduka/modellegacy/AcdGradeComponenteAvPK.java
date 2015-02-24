package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdGradeComponenteAvPK implements Serializable {
    private int codUnidade;

    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codCurso;

    @Column(name = "CodCurso", nullable = false, insertable = false, updatable = false)
    @Id
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    private int codPeríodo;

    @Column(name = "CodPeríodo", nullable = false, insertable = false, updatable = false)
    @Id
    public int getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(int codPeríodo) {
        this.codPeríodo = codPeríodo;
    }

    private int codGrade;

    @Column(name = "CodGrade", nullable = false, insertable = false, updatable = false)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdGradeComponenteAvPK that = (AcdGradeComponenteAvPK) o;

        if (codCurso != that.codCurso) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codGrade != that.codGrade) return false;
        if (codPeríodo != that.codPeríodo) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + codPeríodo;
        result = 31 * result + codGrade;
        result = 31 * result + codDisciplina;
        return result;
    }
}
