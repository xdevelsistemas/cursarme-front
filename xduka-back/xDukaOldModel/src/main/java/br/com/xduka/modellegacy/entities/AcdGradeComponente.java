package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdGradeComponentePK.class)
public class AcdGradeComponente {
    private long gradeComponenteId;
    private int codUnidade;
    private int codCurso;
    private int codGrade;
    private int codPeríodo;
    private int codDisciplina;
    private int gradeÚnica;
    private Short ordem;
    private Short cargaHorária;
    private Short cálculo;
    private Byte codDisciplinaTipo;
    private String ementa;
    private long nãoReprova;
    private Integer codDisciplinaAnterior;
    private Integer codDisciplinaEquivalência;
    private boolean nãoMostra;
//    private List<AcdFormulaComponente> acdFórmulaComponentes;
//    private AcdDisciplina acdDisciplina;
//    private AcdDisciplinaTipo acdDisciplinaTipo;
//    private AcdGrade acdGrade;
//    private List<AcdGradeComponenteAv> acdGradeComponenteAvs;
//    private List<AcdGradePrograma> acdGradeProgramas;

    @Basic
    @Column(name = "GradeComponente_ID", nullable = false, insertable = true, updatable = true)
    public long getGradeComponenteId() {
        return gradeComponenteId;
    }

    public void setGradeComponenteId(long gradeComponenteId) {
        this.gradeComponenteId = gradeComponenteId;
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
    @Column(name = "CodPeríodo", nullable = false, insertable = true, updatable = true)
    public int getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(int codPeríodo) {
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

    @Basic
    @Column(name = "GradeÚnica", nullable = false, insertable = true, updatable = true)
    public int getGradeÚnica() {
        return gradeÚnica;
    }

    public void setGradeÚnica(int gradeÚnica) {
        this.gradeÚnica = gradeÚnica;
    }

    @Basic
    @Column(name = "Ordem", nullable = true, insertable = true, updatable = true)
    public Short getOrdem() {
        return ordem;
    }

    public void setOrdem(Short ordem) {
        this.ordem = ordem;
    }

    @Basic
    @Column(name = "CargaHorária", nullable = true, insertable = true, updatable = true)
    public Short getCargaHorária() {
        return cargaHorária;
    }

    public void setCargaHorária(Short cargaHorária) {
        this.cargaHorária = cargaHorária;
    }

    @Basic
    @Column(name = "Cálculo", nullable = true, insertable = true, updatable = true)
    public Short getCálculo() {
        return cálculo;
    }

    public void setCálculo(Short cálculo) {
        this.cálculo = cálculo;
    }

    @Basic
    @Column(name = "CodDisciplinaTipo", nullable = true, insertable = true, updatable = true)
    public Byte getCodDisciplinaTipo() {
        return codDisciplinaTipo;
    }

    public void setCodDisciplinaTipo(Byte codDisciplinaTipo) {
        this.codDisciplinaTipo = codDisciplinaTipo;
    }

    @Basic
    @Column(name = "Ementa", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    @Basic
    @Column(name = "NãoReprova", nullable = false, insertable = true, updatable = true)
    public long getNãoReprova() {
        return nãoReprova;
    }

    public void setNãoReprova(long nãoReprova) {
        this.nãoReprova = nãoReprova;
    }

    @Basic
    @Column(name = "CodDisciplinaAnterior", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplinaAnterior() {
        return codDisciplinaAnterior;
    }

    public void setCodDisciplinaAnterior(Integer codDisciplinaAnterior) {
        this.codDisciplinaAnterior = codDisciplinaAnterior;
    }

    @Basic
    @Column(name = "CodDisciplinaEquivalência", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplinaEquivalência() {
        return codDisciplinaEquivalência;
    }

    public void setCodDisciplinaEquivalência(Integer codDisciplinaEquivalência) {
        this.codDisciplinaEquivalência = codDisciplinaEquivalência;
    }

    @Basic
    @Column(name = "NãoMostra", nullable = false, insertable = true, updatable = true)
    public boolean isNãoMostra() {
        return nãoMostra;
    }

    public void setNãoMostra(boolean nãoMostra) {
        this.nãoMostra = nãoMostra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdGradeComponente that = (AcdGradeComponente) o;

        if (codCurso != that.codCurso) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codGrade != that.codGrade) return false;
        if (codPeríodo != that.codPeríodo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (gradeComponenteId != that.gradeComponenteId) return false;
        if (gradeÚnica != that.gradeÚnica) return false;
        if (nãoMostra != that.nãoMostra) return false;
        if (nãoReprova != that.nãoReprova) return false;
        if (cargaHorária != null ? !cargaHorária.equals(that.cargaHorária) : that.cargaHorária != null) return false;
        if (codDisciplinaAnterior != null ? !codDisciplinaAnterior.equals(that.codDisciplinaAnterior) : that.codDisciplinaAnterior != null)
            return false;
        if (codDisciplinaEquivalência != null ? !codDisciplinaEquivalência.equals(that.codDisciplinaEquivalência) : that.codDisciplinaEquivalência != null)
            return false;
        if (codDisciplinaTipo != null ? !codDisciplinaTipo.equals(that.codDisciplinaTipo) : that.codDisciplinaTipo != null)
            return false;
        if (cálculo != null ? !cálculo.equals(that.cálculo) : that.cálculo != null) return false;
        if (ementa != null ? !ementa.equals(that.ementa) : that.ementa != null) return false;
        if (ordem != null ? !ordem.equals(that.ordem) : that.ordem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (gradeComponenteId ^ (gradeComponenteId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + codGrade;
        result = 31 * result + codPeríodo;
        result = 31 * result + codDisciplina;
        result = 31 * result + gradeÚnica;
        result = 31 * result + (ordem != null ? ordem.hashCode() : 0);
        result = 31 * result + (cargaHorária != null ? cargaHorária.hashCode() : 0);
        result = 31 * result + (cálculo != null ? cálculo.hashCode() : 0);
        result = 31 * result + (codDisciplinaTipo != null ? codDisciplinaTipo.hashCode() : 0);
        result = 31 * result + (ementa != null ? ementa.hashCode() : 0);
        result = 31 * result + (int) (nãoReprova ^ (nãoReprova >>> 32));
        result = 31 * result + (codDisciplinaAnterior != null ? codDisciplinaAnterior.hashCode() : 0);
        result = 31 * result + (codDisciplinaEquivalência != null ? codDisciplinaEquivalência.hashCode() : 0);
        result = 31 * result + (nãoMostra ? 1 : 0);
        return result;
    }

//    @OneToMany(mappedBy = "acdGradeComponente")
//    public List<AcdFormulaComponente> getAcdFórmulaComponentes() {
//        return acdFórmulaComponentes;
//    }
//
//    public void setAcdFórmulaComponentes(List<AcdFormulaComponente> acdFórmulaComponentes) {
//        this.acdFórmulaComponentes = acdFórmulaComponentes;
//    }
//
//    @ManyToOne
//    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodDisciplina", referencedColumnName = "CodDisciplina", nullable = false)})
//    public AcdDisciplina getAcdDisciplina() {
//        return acdDisciplina;
//    }
//
//    public void setAcdDisciplina(AcdDisciplina acdDisciplina) {
//        this.acdDisciplina = acdDisciplina;
//    }
//
//    @ManyToOne
//    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodDisciplinaTipo", referencedColumnName = "CodDisciplinaTipo", nullable = false)})
//    public AcdDisciplinaTipo getAcdDisciplinaTipo() {
//        return acdDisciplinaTipo;
//    }
//
//    public void setAcdDisciplinaTipo(AcdDisciplinaTipo acdDisciplinaTipo) {
//        this.acdDisciplinaTipo = acdDisciplinaTipo;
//    }
//
//    @ManyToOne
//    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodCurso", referencedColumnName = "CodCurso", nullable = false), @JoinColumn(name = "CodGrade", referencedColumnName = "CodGrade", nullable = false)})
//    public AcdGrade getAcdGrade() {
//        return acdGrade;
//    }
//
//    public void setAcdGrade(AcdGrade acdGrade) {
//        this.acdGrade = acdGrade;
//    }
//
//    @OneToMany(mappedBy = "acdGradeComponente")
//    public List<AcdGradeComponenteAv> getAcdGradeComponenteAvs() {
//        return acdGradeComponenteAvs;
//    }
//
//    public void setAcdGradeComponenteAvs(List<AcdGradeComponenteAv> acdGradeComponenteAvs) {
//        this.acdGradeComponenteAvs = acdGradeComponenteAvs;
//    }
//
//    @OneToMany(mappedBy = "acdGradeComponente")
//    public List<AcdGradePrograma> getAcdGradeProgramas() {
//        return acdGradeProgramas;
//    }
//
//    public void setAcdGradeProgramas(List<AcdGradePrograma> acdGradeProgramas) {
//        this.acdGradeProgramas = acdGradeProgramas;
//    }
}
