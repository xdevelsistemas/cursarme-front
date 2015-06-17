package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(SgrUsuarioUnidadePK.class)
public class SgrUsuarioUnidade {
    private int idUsuário;
    private int codUnidade;
    private Integer codRelacionamento;
    private Boolean professor;
    private Long matrícula;
    private Boolean convidado;
    private Integer controle;
    private List<SgrUsuarioFeed> sgrUsuarioFeeds;

    @Id
    @Column(name = "IDUsuário", nullable = false, insertable = true, updatable = true)
    public int getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(int idUsuário) {
        this.idUsuário = idUsuário;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Basic
    @Column(name = "CodRelacionamento", nullable = true, insertable = true, updatable = true)
    public Integer getCodRelacionamento() {
        return codRelacionamento;
    }

    public void setCodRelacionamento(Integer codRelacionamento) {
        this.codRelacionamento = codRelacionamento;
    }

    @Basic
    @Column(name = "Professor", nullable = true, insertable = true, updatable = true)
    public Boolean getProfessor() {
        return professor;
    }

    public void setProfessor(Boolean professor) {
        this.professor = professor;
    }

    @Basic
    @Column(name = "Matrícula", nullable = true, insertable = true, updatable = true)
    public Long getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(Long matrícula) {
        this.matrícula = matrícula;
    }

    @Basic
    @Column(name = "Convidado", nullable = true, insertable = true, updatable = true)
    public Boolean getConvidado() {
        return convidado;
    }

    public void setConvidado(Boolean convidado) {
        this.convidado = convidado;
    }

    @Basic
    @Column(name = "Controle", nullable = true, insertable = true, updatable = true)
    public Integer getControle() {
        return controle;
    }

    public void setControle(Integer controle) {
        this.controle = controle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrUsuarioUnidade that = (SgrUsuarioUnidade) o;

        if (codUnidade != that.codUnidade) return false;
        if (idUsuário != that.idUsuário) return false;
        if (codRelacionamento != null ? !codRelacionamento.equals(that.codRelacionamento) : that.codRelacionamento != null)
            return false;
        if (controle != null ? !controle.equals(that.controle) : that.controle != null) return false;
        if (convidado != null ? !convidado.equals(that.convidado) : that.convidado != null) return false;
        if (matrícula != null ? !matrícula.equals(that.matrícula) : that.matrícula != null) return false;
        if (professor != null ? !professor.equals(that.professor) : that.professor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuário;
        result = 31 * result + codUnidade;
        result = 31 * result + (codRelacionamento != null ? codRelacionamento.hashCode() : 0);
        result = 31 * result + (professor != null ? professor.hashCode() : 0);
        result = 31 * result + (matrícula != null ? matrícula.hashCode() : 0);
        result = 31 * result + (convidado != null ? convidado.hashCode() : 0);
        result = 31 * result + (controle != null ? controle.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "sgrUsuarioUnidade")
    public List<SgrUsuarioFeed> getSgrUsuarioFeeds() {
        return sgrUsuarioFeeds;
    }

    public void setSgrUsuarioFeeds(List<SgrUsuarioFeed> sgrUsuarioFeeds) {
        this.sgrUsuarioFeeds = sgrUsuarioFeeds;
    }
}
