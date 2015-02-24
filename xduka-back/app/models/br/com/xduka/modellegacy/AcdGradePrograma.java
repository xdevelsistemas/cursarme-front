package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdGradeProgramaPK.class)
public class AcdGradePrograma {
    private long gradeProgramaId;
    private int codUnidade;
    private int codCurso;
    private int codGrade;
    private int codPeríodo;
    private int codDisciplina;
    private int codPrograma;
    private String programa;
    private AcdGradeComponente acdGradeComponente;

    @Basic
    @Column(name = "GradePrograma_ID", nullable = false, insertable = true, updatable = true)
    public long getGradeProgramaId() {
        return gradeProgramaId;
    }

    public void setGradeProgramaId(long gradeProgramaId) {
        this.gradeProgramaId = gradeProgramaId;
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

    @Basic
    @Column(name = "CodPeríodo", nullable = false, insertable = true, updatable = true)
    public int getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(int codPeríodo) {
        this.codPeríodo = codPeríodo;
    }

    @Basic
    @Column(name = "CodDisciplina", nullable = false, insertable = true, updatable = true)
    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    @Id
    @Column(name = "CodPrograma", nullable = false, insertable = true, updatable = true)
    public int getCodPrograma() {
        return codPrograma;
    }

    public void setCodPrograma(int codPrograma) {
        this.codPrograma = codPrograma;
    }

    @Basic
    @Column(name = "Programa", nullable = true, insertable = true, updatable = true)
    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdGradePrograma that = (AcdGradePrograma) o;

        if (codCurso != that.codCurso) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codGrade != that.codGrade) return false;
        if (codPeríodo != that.codPeríodo) return false;
        if (codPrograma != that.codPrograma) return false;
        if (codUnidade != that.codUnidade) return false;
        if (gradeProgramaId != that.gradeProgramaId) return false;
        if (programa != null ? !programa.equals(that.programa) : that.programa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (gradeProgramaId ^ (gradeProgramaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + codGrade;
        result = 31 * result + codPeríodo;
        result = 31 * result + codDisciplina;
        result = 31 * result + codPrograma;
        result = 31 * result + (programa != null ? programa.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodCurso", referencedColumnName = "CodCurso", nullable = false), @JoinColumn(name = "CodGrade", referencedColumnName = "CodGrade", nullable = false), @JoinColumn(name = "CodPeríodo", referencedColumnName = "CodPeríodo", nullable = false), @JoinColumn(name = "CodDisciplina", referencedColumnName = "CodDisciplina", nullable = false)})
    public AcdGradeComponente getAcdGradeComponente() {
        return acdGradeComponente;
    }

    public void setAcdGradeComponente(AcdGradeComponente acdGradeComponente) {
        this.acdGradeComponente = acdGradeComponente;
    }
}
