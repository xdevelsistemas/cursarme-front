package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(SgrAberturaPK.class)
public class SgrAbertura {
    private int idUsuário;
    private int codObjeto;
    private int codUnidade;
    private Boolean excluído;
    private Integer controle;
    private SgrObjetoUnidade sgrObjetoUnidade;

    @Id
    @Column(name = "IDUsuário", nullable = false, insertable = true, updatable = true)
    public int getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(int idUsuário) {
        this.idUsuário = idUsuário;
    }

    @Id
    @Column(name = "CodObjeto", nullable = false, insertable = false, updatable = false)
    public int getCodObjeto() {
        return codObjeto;
    }

    public void setCodObjeto(int codObjeto) {
        this.codObjeto = codObjeto;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Basic
    @Column(name = "Excluído", nullable = true, insertable = true, updatable = true)
    public Boolean getExcluído() {
        return excluído;
    }

    public void setExcluído(Boolean excluído) {
        this.excluído = excluído;
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

        SgrAbertura that = (SgrAbertura) o;

        if (codObjeto != that.codObjeto) return false;
        if (codUnidade != that.codUnidade) return false;
        if (idUsuário != that.idUsuário) return false;
        if (controle != null ? !controle.equals(that.controle) : that.controle != null) return false;
        if (excluído != null ? !excluído.equals(that.excluído) : that.excluído != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuário;
        result = 31 * result + codObjeto;
        result = 31 * result + codUnidade;
        result = 31 * result + (excluído != null ? excluído.hashCode() : 0);
        result = 31 * result + (controle != null ? controle.hashCode() : 0);
        return result;
    }

//    @ManyToOne
//    @JoinColumns({@JoinColumn(name = "CodObjeto", referencedColumnName = "CodObjeto", nullable = false), @JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false)})
//    public SgrObjetoUnidade getSgrObjetoUnidade() {
//        return sgrObjetoUnidade;
//    }
//
//    public void setSgrObjetoUnidade(SgrObjetoUnidade sgrObjetoUnidade) {
//        this.sgrObjetoUnidade = sgrObjetoUnidade;
//    }
}
