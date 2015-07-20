package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdDisciplinaPK.class)
public class AcdDisciplina {
    private long disciplinaId;
    private int codUnidade;
    private int codDisciplina;
    private Short peso;
    private String disciplina;
    private String disciplinaDocumento;
    private Byte codDisciplinaBimestral;
    private boolean dispensa;
    private boolean classificação;
    private boolean língua;
    private String abreviatura;
    private Byte ordem;
    private boolean nãoMostrar;
    private boolean nãoCalcula;
    private String cargaHorária;
//    private List<AcdBlogProfessor> acdBlogProfessors;
//    private List<AcdGradeComponente> acdGradeComponentes;

    @Basic
    @Column(name = "Disciplina_ID", nullable = false, insertable = true, updatable = true)
    public long getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(long disciplinaId) {
        this.disciplinaId = disciplinaId;
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
    @Column(name = "CodDisciplina", nullable = false, insertable = true, updatable = true)
    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    @Basic
    @Column(name = "Peso", nullable = true, insertable = true, updatable = true)
    public Short getPeso() {
        return peso;
    }

    public void setPeso(Short peso) {
        this.peso = peso;
    }

    @Basic
    @Column(name = "Disciplina", nullable = true, insertable = true, updatable = true)
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Basic
    @Column(name = "DisciplinaDocumento", nullable = true, insertable = true, updatable = true)
    public String getDisciplinaDocumento() {
        return disciplinaDocumento;
    }

    public void setDisciplinaDocumento(String disciplinaDocumento) {
        this.disciplinaDocumento = disciplinaDocumento;
    }

    @Basic
    @Column(name = "CodDisciplinaBimestral", nullable = true, insertable = true, updatable = true)
    public Byte getCodDisciplinaBimestral() {
        return codDisciplinaBimestral;
    }

    public void setCodDisciplinaBimestral(Byte codDisciplinaBimestral) {
        this.codDisciplinaBimestral = codDisciplinaBimestral;
    }

    @Basic
    @Column(name = "Dispensa", nullable = false, insertable = true, updatable = true)
    public boolean isDispensa() {
        return dispensa;
    }

    public void setDispensa(boolean dispensa) {
        this.dispensa = dispensa;
    }

    @Basic
    @Column(name = "Classificação", nullable = false, insertable = true, updatable = true)
    public boolean isClassificação() {
        return classificação;
    }

    public void setClassificação(boolean classificação) {
        this.classificação = classificação;
    }

    @Basic
    @Column(name = "Língua", nullable = false, insertable = true, updatable = true)
    public boolean isLíngua() {
        return língua;
    }

    public void setLíngua(boolean língua) {
        this.língua = língua;
    }

    @Basic
    @Column(name = "Abreviatura", nullable = true, insertable = true, updatable = true)
    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @Basic
    @Column(name = "Ordem", nullable = true, insertable = true, updatable = true)
    public Byte getOrdem() {
        return ordem;
    }

    public void setOrdem(Byte ordem) {
        this.ordem = ordem;
    }

    @Basic
    @Column(name = "NãoMostrar", nullable = false, insertable = true, updatable = true)
    public boolean isNãoMostrar() {
        return nãoMostrar;
    }

    public void setNãoMostrar(boolean nãoMostrar) {
        this.nãoMostrar = nãoMostrar;
    }

    @Basic
    @Column(name = "NãoCalcula", nullable = false, insertable = true, updatable = true)
    public boolean isNãoCalcula() {
        return nãoCalcula;
    }

    public void setNãoCalcula(boolean nãoCalcula) {
        this.nãoCalcula = nãoCalcula;
    }

    @Basic
    @Column(name = "CargaHorária", nullable = true, insertable = true, updatable = true)
    public String getCargaHorária() {
        return cargaHorária;
    }

    public void setCargaHorária(String cargaHorária) {
        this.cargaHorária = cargaHorária;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdDisciplina that = (AcdDisciplina) o;

        if (classificação != that.classificação) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codUnidade != that.codUnidade) return false;
        if (disciplinaId != that.disciplinaId) return false;
        if (dispensa != that.dispensa) return false;
        if (língua != that.língua) return false;
        if (nãoCalcula != that.nãoCalcula) return false;
        if (nãoMostrar != that.nãoMostrar) return false;
        if (abreviatura != null ? !abreviatura.equals(that.abreviatura) : that.abreviatura != null) return false;
        if (cargaHorária != null ? !cargaHorária.equals(that.cargaHorária) : that.cargaHorária != null) return false;
        if (codDisciplinaBimestral != null ? !codDisciplinaBimestral.equals(that.codDisciplinaBimestral) : that.codDisciplinaBimestral != null)
            return false;
        if (disciplina != null ? !disciplina.equals(that.disciplina) : that.disciplina != null) return false;
        if (disciplinaDocumento != null ? !disciplinaDocumento.equals(that.disciplinaDocumento) : that.disciplinaDocumento != null)
            return false;
        if (ordem != null ? !ordem.equals(that.ordem) : that.ordem != null) return false;
        if (peso != null ? !peso.equals(that.peso) : that.peso != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (disciplinaId ^ (disciplinaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codDisciplina;
        result = 31 * result + (peso != null ? peso.hashCode() : 0);
        result = 31 * result + (disciplina != null ? disciplina.hashCode() : 0);
        result = 31 * result + (disciplinaDocumento != null ? disciplinaDocumento.hashCode() : 0);
        result = 31 * result + (codDisciplinaBimestral != null ? codDisciplinaBimestral.hashCode() : 0);
        result = 31 * result + (dispensa ? 1 : 0);
        result = 31 * result + (classificação ? 1 : 0);
        result = 31 * result + (língua ? 1 : 0);
        result = 31 * result + (abreviatura != null ? abreviatura.hashCode() : 0);
        result = 31 * result + (ordem != null ? ordem.hashCode() : 0);
        result = 31 * result + (nãoMostrar ? 1 : 0);
        result = 31 * result + (nãoCalcula ? 1 : 0);
        result = 31 * result + (cargaHorária != null ? cargaHorária.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "acdDisciplina")
//    public List<AcdBlogProfessor> getAcdBlogProfessors() {
//        return acdBlogProfessors;
//    }
//
//    public void setAcdBlogProfessors(List<AcdBlogProfessor> acdBlogProfessors) {
//        this.acdBlogProfessors = acdBlogProfessors;
//    }
//
//    @OneToMany(mappedBy = "acdDisciplina")
//    public List<AcdGradeComponente> getAcdGradeComponentes() {
//        return acdGradeComponentes;
//    }
//
//    public void setAcdGradeComponentes(List<AcdGradeComponente> acdGradeComponentes) {
//        this.acdGradeComponentes = acdGradeComponentes;
//    }
}
