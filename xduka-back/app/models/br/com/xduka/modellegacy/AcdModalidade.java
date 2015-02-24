package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdModalidadePK.class)
public class AcdModalidade {
    private long modalidadeId;
    private int codUnidade;
    private int codModalidade;
    private String modalidade;
    private List<AcdModalidadeCurso> acdModalidadeCursos;

    @Basic
    @Column(name = "Modalidade_ID", nullable = false, insertable = true, updatable = true)
    public long getModalidadeId() {
        return modalidadeId;
    }

    public void setModalidadeId(long modalidadeId) {
        this.modalidadeId = modalidadeId;
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
    @Column(name = "CodModalidade", nullable = false, insertable = true, updatable = true)
    public int getCodModalidade() {
        return codModalidade;
    }

    public void setCodModalidade(int codModalidade) {
        this.codModalidade = codModalidade;
    }

    @Basic
    @Column(name = "Modalidade", nullable = true, insertable = true, updatable = true)
    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdModalidade that = (AcdModalidade) o;

        if (codModalidade != that.codModalidade) return false;
        if (codUnidade != that.codUnidade) return false;
        if (modalidadeId != that.modalidadeId) return false;
        if (modalidade != null ? !modalidade.equals(that.modalidade) : that.modalidade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (modalidadeId ^ (modalidadeId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codModalidade;
        result = 31 * result + (modalidade != null ? modalidade.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "acdModalidade")
    public List<AcdModalidadeCurso> getAcdModalidadeCursos() {
        return acdModalidadeCursos;
    }

    public void setAcdModalidadeCursos(List<AcdModalidadeCurso> acdModalidadeCursos) {
        this.acdModalidadeCursos = acdModalidadeCursos;
    }
}
