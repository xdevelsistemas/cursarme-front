package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class AcdBlogProfessorTurma {
    private long idBlogProfessorTurma;
    private Long idBlogProfessor;
    private Integer codUnidade;
    private Integer anoLetivo;
    private Integer codCurso;
    private String turma;
    private List<AcdBlogProfessor> acdBlogProfessores;

    @Id
    @Column(name = "IDBlogProfessorTurma", nullable = false, insertable = true, updatable = true)
    public long getIdBlogProfessorTurma() {
        return idBlogProfessorTurma;
    }

    public void setIdBlogProfessorTurma(long idBlogProfessorTurma) {
        this.idBlogProfessorTurma = idBlogProfessorTurma;
    }

    @Basic
    @Column(name = "IDBlogProfessor", nullable = true, insertable = true, updatable = true)
    public Long getIdBlogProfessor() {
        return idBlogProfessor;
    }

    public void setIdBlogProfessor(Long idBlogProfessor) {
        this.idBlogProfessor = idBlogProfessor;
    }

    @Basic
    @Column(name = "CodUnidade", nullable = true, insertable = true, updatable = true)
    public Integer getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(Integer codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Basic
    @Column(name = "AnoLetivo", nullable = true, insertable = true, updatable = true)
    public Integer getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(Integer anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Basic
    @Column(name = "CodCurso", nullable = true, insertable = true, updatable = true)
    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    @Basic
    @Column(name = "Turma", nullable = true, insertable = true, updatable = true)
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdBlogProfessorTurma that = (AcdBlogProfessorTurma) o;

        if (idBlogProfessorTurma != that.idBlogProfessorTurma) return false;
        if (anoLetivo != null ? !anoLetivo.equals(that.anoLetivo) : that.anoLetivo != null) return false;
        if (codCurso != null ? !codCurso.equals(that.codCurso) : that.codCurso != null) return false;
        if (codUnidade != null ? !codUnidade.equals(that.codUnidade) : that.codUnidade != null) return false;
        if (idBlogProfessor != null ? !idBlogProfessor.equals(that.idBlogProfessor) : that.idBlogProfessor != null)
            return false;
        if (turma != null ? !turma.equals(that.turma) : that.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idBlogProfessorTurma ^ (idBlogProfessorTurma >>> 32));
        result = 31 * result + (idBlogProfessor != null ? idBlogProfessor.hashCode() : 0);
        result = 31 * result + (codUnidade != null ? codUnidade.hashCode() : 0);
        result = 31 * result + (anoLetivo != null ? anoLetivo.hashCode() : 0);
        result = 31 * result + (codCurso != null ? codCurso.hashCode() : 0);
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "acdBlogProfessorTurmaByIdBlogProfessor")
    public List<AcdBlogProfessor> getAcdBlogProfessores() {
        return acdBlogProfessores;
    }

    public void setAcdBlogProfessores(List<AcdBlogProfessor> acdBlogProfessores) {
        this.acdBlogProfessores = acdBlogProfessores;
    }
}
