package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdGradeComponenteAvPK.class)
public class AcdGradeComponenteAv {
    private long gradeComponenteAvId;
    private int codUnidade;
    private int codCurso;
    private int codPeríodo;
    private int codGrade;
    private int codDisciplina;
    private Integer codDisciplinaPrincipal;
    private String gradeÚnica;
    private AcdGradeComponente acdGradeComponente;

    @Basic
    @Column(name = "GradeComponenteAv_ID", nullable = false, insertable = true, updatable = true)
    public long getGradeComponenteAvId() {
        return gradeComponenteAvId;
    }

    public void setGradeComponenteAvId(long gradeComponenteAvId) {
        this.gradeComponenteAvId = gradeComponenteAvId;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodCurso", nullable = false, insertable = false, updatable = false)
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    @Id
    @Column(name = "CodPeríodo", nullable = false, insertable = false, updatable = false)
    public int getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(int codPeríodo) {
        this.codPeríodo = codPeríodo;
    }

    @Id
    @Column(name = "CodGrade", nullable = false, insertable = false, updatable = false)
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

    @Basic
    @Column(name = "CodDisciplinaPrincipal", nullable = true, insertable = false, updatable = false)
    public Integer getCodDisciplinaPrincipal() {
        return codDisciplinaPrincipal;
    }

    public void setCodDisciplinaPrincipal(Integer codDisciplinaPrincipal) {
        this.codDisciplinaPrincipal = codDisciplinaPrincipal;
    }

    @Basic
    @Column(name = "GradeÚnica", nullable = false, insertable = true, updatable = true)
    public String getGradeÚnica() {
        return gradeÚnica;
    }

    public void setGradeÚnica(String gradeÚnica) {
        this.gradeÚnica = gradeÚnica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdGradeComponenteAv that = (AcdGradeComponenteAv) o;

        if (codCurso != that.codCurso) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codGrade != that.codGrade) return false;
        if (codPeríodo != that.codPeríodo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (gradeComponenteAvId != that.gradeComponenteAvId) return false;
        if (codDisciplinaPrincipal != null ? !codDisciplinaPrincipal.equals(that.codDisciplinaPrincipal) : that.codDisciplinaPrincipal != null)
            return false;
        if (gradeÚnica != null ? !gradeÚnica.equals(that.gradeÚnica) : that.gradeÚnica != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (gradeComponenteAvId ^ (gradeComponenteAvId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + codPeríodo;
        result = 31 * result + codGrade;
        result = 31 * result + codDisciplina;
        result = 31 * result + (codDisciplinaPrincipal != null ? codDisciplinaPrincipal.hashCode() : 0);
        result = 31 * result + (gradeÚnica != null ? gradeÚnica.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodCurso", referencedColumnName = "CodCurso", nullable = false), @JoinColumn(name = "CodGrade", referencedColumnName = "CodGrade", nullable = false), @JoinColumn(name = "CodPeríodo", referencedColumnName = "CodPeríodo", nullable = false), @JoinColumn(name = "CodDisciplinaPrincipal", referencedColumnName = "CodDisciplina" , nullable = false)})
    public AcdGradeComponente getAcdGradeComponente() {
        return acdGradeComponente;
    }

    public void setAcdGradeComponente(AcdGradeComponente acdGradeComponente) {
        this.acdGradeComponente = acdGradeComponente;
    }
}
