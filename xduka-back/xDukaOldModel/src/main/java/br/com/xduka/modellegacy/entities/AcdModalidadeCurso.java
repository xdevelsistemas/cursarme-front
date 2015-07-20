package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdModalidadeCursoPK.class)
public class AcdModalidadeCurso {
    private long modalidadeCursoId;
    private int codUnidade;
    private int codModalidade;
    private int codCurso;
    //private AcdModalidade acdModalidade;

    @Basic
    @Column(name = "ModalidadeCurso_ID", nullable = false, insertable = true, updatable = true)
    public long getModalidadeCursoId() {
        return modalidadeCursoId;
    }

    public void setModalidadeCursoId(long modalidadeCursoId) {
        this.modalidadeCursoId = modalidadeCursoId;
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
    @Column(name = "CodModalidade", nullable = false, insertable = false, updatable = false)
    public int getCodModalidade() {
        return codModalidade;
    }

    public void setCodModalidade(int codModalidade) {
        this.codModalidade = codModalidade;
    }

    @Id
    @Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdModalidadeCurso that = (AcdModalidadeCurso) o;

        if (codCurso != that.codCurso) return false;
        if (codModalidade != that.codModalidade) return false;
        if (codUnidade != that.codUnidade) return false;
        if (modalidadeCursoId != that.modalidadeCursoId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (modalidadeCursoId ^ (modalidadeCursoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codModalidade;
        result = 31 * result + codCurso;
        return result;
    }

//    @ManyToOne
//    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodModalidade", referencedColumnName = "CodModalidade", nullable = false)})
//    public AcdModalidade getAcdModalidade() {
//        return acdModalidade;
//    }
//
//    public void setAcdModalidade(AcdModalidade acdModalidade) {
//        this.acdModalidade = acdModalidade;
//    }
}
