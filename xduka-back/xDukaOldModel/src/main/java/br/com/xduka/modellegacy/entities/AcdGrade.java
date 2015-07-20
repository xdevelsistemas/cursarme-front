package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdGradePK.class)
public class AcdGrade {
    private long gradeId;
    private int codUnidade;
    private int codCurso;
    private int codGrade;
    private String grade;
    private Integer anoInício;
    private Integer anoFim;
    private int cargaHoráriaTotal;
    private Integer codGradeEquivalência;
    private String habilitação;
//    private List<AcdGradeComponente> acdGradeComponentes;

    @Basic
    @Column(name = "Grade_ID", nullable = false, insertable = true, updatable = true)
    public long getGradeId() {
        return gradeId;
    }

    public void setGradeId(long gradeId) {
        this.gradeId = gradeId;
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
    @Column(name = "Grade", nullable = true, insertable = true, updatable = true)
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "AnoInício", nullable = true, insertable = true, updatable = true)
    public Integer getAnoInício() {
        return anoInício;
    }

    public void setAnoInício(Integer anoInício) {
        this.anoInício = anoInício;
    }

    @Basic
    @Column(name = "AnoFim", nullable = true, insertable = true, updatable = true)
    public Integer getAnoFim() {
        return anoFim;
    }

    public void setAnoFim(Integer anoFim) {
        this.anoFim = anoFim;
    }

    @Basic
    @Column(name = "CargaHoráriaTotal", nullable = false, insertable = true, updatable = true)
    public int getCargaHoráriaTotal() {
        return cargaHoráriaTotal;
    }

    public void setCargaHoráriaTotal(int cargaHoráriaTotal) {
        this.cargaHoráriaTotal = cargaHoráriaTotal;
    }

    @Basic
    @Column(name = "CodGradeEquivalência", nullable = true, insertable = true, updatable = true)
    public Integer getCodGradeEquivalência() {
        return codGradeEquivalência;
    }

    public void setCodGradeEquivalência(Integer codGradeEquivalência) {
        this.codGradeEquivalência = codGradeEquivalência;
    }

    @Basic
    @Column(name = "Habilitação", nullable = true, insertable = true, updatable = true)
    public String getHabilitação() {
        return habilitação;
    }

    public void setHabilitação(String habilitação) {
        this.habilitação = habilitação;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdGrade acdGrade = (AcdGrade) o;

        if (cargaHoráriaTotal != acdGrade.cargaHoráriaTotal) return false;
        if (codCurso != acdGrade.codCurso) return false;
        if (codGrade != acdGrade.codGrade) return false;
        if (codUnidade != acdGrade.codUnidade) return false;
        if (gradeId != acdGrade.gradeId) return false;
        if (anoFim != null ? !anoFim.equals(acdGrade.anoFim) : acdGrade.anoFim != null) return false;
        if (anoInício != null ? !anoInício.equals(acdGrade.anoInício) : acdGrade.anoInício != null) return false;
        if (codGradeEquivalência != null ? !codGradeEquivalência.equals(acdGrade.codGradeEquivalência) : acdGrade.codGradeEquivalência != null)
            return false;
        if (grade != null ? !grade.equals(acdGrade.grade) : acdGrade.grade != null) return false;
        if (habilitação != null ? !habilitação.equals(acdGrade.habilitação) : acdGrade.habilitação != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (gradeId ^ (gradeId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + codGrade;
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + (anoInício != null ? anoInício.hashCode() : 0);
        result = 31 * result + (anoFim != null ? anoFim.hashCode() : 0);
        result = 31 * result + cargaHoráriaTotal;
        result = 31 * result + (codGradeEquivalência != null ? codGradeEquivalência.hashCode() : 0);
        result = 31 * result + (habilitação != null ? habilitação.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "acdGrade")
//    public List<AcdGradeComponente> getAcdGradeComponentes() {
//        return acdGradeComponentes;
//    }
//
//    public void setAcdGradeComponentes(List<AcdGradeComponente> acdGradeComponentes) {
//        this.acdGradeComponentes = acdGradeComponentes;
//    }
}
