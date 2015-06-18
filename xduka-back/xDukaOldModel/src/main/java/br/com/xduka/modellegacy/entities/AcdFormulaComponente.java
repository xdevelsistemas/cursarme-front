package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "acdFórmulaComponente", schema = "dbo")
@IdClass(AcdFormulaComponentePK.class)
public class AcdFormulaComponente {
    private long fórmulaComponenteId;
    private int codUnidade;
    private int anoLetivo;
    private int codCurso;
    private int codGrade;
    private int codPeríodo;
    private int codDisciplina;
    private int codFórmula;
//    private AcdGradeComponente acdGradeComponente;

    @Basic
    @Column(name = "FórmulaComponente_ID", nullable = false, insertable = true, updatable = true)
    public long getFórmulaComponenteId() {
        return fórmulaComponenteId;
    }

    public void setFórmulaComponenteId(long fórmulaComponenteId) {
        this.fórmulaComponenteId = fórmulaComponenteId;
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
    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
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
    @Column(name = "CodGrade", nullable = false, insertable = false, updatable = false)
    public int getCodGrade() {
        return codGrade;
    }

    public void setCodGrade(int codGrade) {
        this.codGrade = codGrade;
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
    @Column(name = "CodDisciplina", nullable = false, insertable = false, updatable = false)
    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    @Basic
    @Column(name = "CodFórmula", nullable = false, insertable = true, updatable = true)
    public int getCodFórmula() {
        return codFórmula;
    }

    public void setCodFórmula(int codFórmula) {
        this.codFórmula = codFórmula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdFormulaComponente that = (AcdFormulaComponente) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codCurso != that.codCurso) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codFórmula != that.codFórmula) return false;
        if (codGrade != that.codGrade) return false;
        if (codPeríodo != that.codPeríodo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (fórmulaComponenteId != that.fórmulaComponenteId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (fórmulaComponenteId ^ (fórmulaComponenteId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + codCurso;
        result = 31 * result + codGrade;
        result = 31 * result + codPeríodo;
        result = 31 * result + codDisciplina;
        result = 31 * result + codFórmula;
        return result;
    }

//    @ManyToOne
//    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodCurso", referencedColumnName = "CodCurso", nullable = false), @JoinColumn(name = "CodGrade", referencedColumnName = "CodGrade", nullable = false), @JoinColumn(name = "CodPeríodo", referencedColumnName = "CodPeríodo", nullable = false), @JoinColumn(name = "CodDisciplina", referencedColumnName = "CodDisciplina", nullable = false)})
//    public AcdGradeComponente getAcdGradeComponente() {
//        return acdGradeComponente;
//    }
//
//    public void setAcdGradeComponente(AcdGradeComponente acdGradeComponente) {
//        this.acdGradeComponente = acdGradeComponente;
//    }
}
