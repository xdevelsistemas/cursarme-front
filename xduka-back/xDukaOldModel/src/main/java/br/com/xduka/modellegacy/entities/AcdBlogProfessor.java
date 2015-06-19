package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class AcdBlogProfessor {
    private long idBlogProfessor;
    private Integer idUsuário;
    private Integer codUnidade;
    private Integer codProfessor;
    private Integer codDisciplina;
    private Timestamp data;
    private Timestamp validade;
    private String mensagem;
//    private AcdDisciplina acdDisciplina;
//    private AcdBlogProfessorTurma acdBlogProfessorTurmaByIdBlogProfessor;

    @Id
    @Column(name = "IDBlogProfessor", nullable = false, insertable = true, updatable = true)
    public long getIdBlogProfessor() {
        return idBlogProfessor;
    }

    public void setIdBlogProfessor(long idBlogProfessor) {
        this.idBlogProfessor = idBlogProfessor;
    }

    @Basic
    @Column(name = "IDUsuário", nullable = true, insertable = true, updatable = true)
    public Integer getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(Integer idUsuário) {
        this.idUsuário = idUsuário;
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
    @Column(name = "CodProfessor", nullable = true, insertable = true, updatable = true)
    public Integer getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(Integer codProfessor) {
        this.codProfessor = codProfessor;
    }

    @Basic
    @Column(name = "CodDisciplina", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(Integer codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    @Basic
    @Column(name = "Data", nullable = true, insertable = true, updatable = true)
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Basic
    @Column(name = "Validade", nullable = true, insertable = true, updatable = true)
    public Timestamp getValidade() {
        return validade;
    }

    public void setValidade(Timestamp validade) {
        this.validade = validade;
    }

    @Basic
    @Column(name = "Mensagem", nullable = true, insertable = true, updatable = true, length = 8000)
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdBlogProfessor that = (AcdBlogProfessor) o;

        if (idBlogProfessor != that.idBlogProfessor) return false;
        if (codDisciplina != null ? !codDisciplina.equals(that.codDisciplina) : that.codDisciplina != null)
            return false;
        if (codProfessor != null ? !codProfessor.equals(that.codProfessor) : that.codProfessor != null) return false;
        if (codUnidade != null ? !codUnidade.equals(that.codUnidade) : that.codUnidade != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (idUsuário != null ? !idUsuário.equals(that.idUsuário) : that.idUsuário != null) return false;
        if (mensagem != null ? !mensagem.equals(that.mensagem) : that.mensagem != null) return false;
        if (validade != null ? !validade.equals(that.validade) : that.validade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idBlogProfessor ^ (idBlogProfessor >>> 32));
        result = 31 * result + (idUsuário != null ? idUsuário.hashCode() : 0);
        result = 31 * result + (codUnidade != null ? codUnidade.hashCode() : 0);
        result = 31 * result + (codProfessor != null ? codProfessor.hashCode() : 0);
        result = 31 * result + (codDisciplina != null ? codDisciplina.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (validade != null ? validade.hashCode() : 0);
        result = 31 * result + (mensagem != null ? mensagem.hashCode() : 0);
        return result;
    }

//    @ManyToOne
//    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade"), @JoinColumn(name = "CodDisciplina", referencedColumnName = "CodDisciplina")})
//    public AcdDisciplina getAcdDisciplina() {
//        return acdDisciplina;
//    }
//
//    public void setAcdDisciplina(AcdDisciplina acdDisciplina) {
//        this.acdDisciplina = acdDisciplina;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "IDBlogProfessor", referencedColumnName = "IDBlogProfessor", nullable = false)
//    public AcdBlogProfessorTurma getAcdBlogProfessorTurmaByIdBlogProfessor() {
//        return acdBlogProfessorTurmaByIdBlogProfessor;
//    }

//    public void setAcdBlogProfessorTurmaByIdBlogProfessor(AcdBlogProfessorTurma acdBlogProfessorTurmaByIdBlogProfessor) {
//        this.acdBlogProfessorTurmaByIdBlogProfessor = acdBlogProfessorTurmaByIdBlogProfessor;
//    }
}
