package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdAtividadeTipoPK.class)
public class AcdAtividadeTipo {
    private long atendimentoTipoId;
    private int anoLetivo;
    private int codUnidade;
    private int codTipo;
    private String tipo;
//    private List<AcdAtividadeTipoModalidade> acdAtividadeTipoModalidades;

    @Basic
    @Column(name = "AtendimentoTipo_ID", nullable = false, insertable = true, updatable = true)
    public long getAtendimentoTipoId() {
        return atendimentoTipoId;
    }

    public void setAtendimentoTipoId(long atendimentoTipoId) {
        this.atendimentoTipoId = atendimentoTipoId;
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
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodTipo", nullable = false, insertable = true, updatable = true)
    public int getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(int codTipo) {
        this.codTipo = codTipo;
    }

    @Basic
    @Column(name = "Tipo", nullable = true, insertable = true, updatable = true)
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAtividadeTipo that = (AcdAtividadeTipo) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (atendimentoTipoId != that.atendimentoTipoId) return false;
        if (codTipo != that.codTipo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (tipo != null ? !tipo.equals(that.tipo) : that.tipo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (atendimentoTipoId ^ (atendimentoTipoId >>> 32));
        result = 31 * result + anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + codTipo;
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "acdAtividadeTipo")
//    public List<AcdAtividadeTipoModalidade> getAcdAtividadeTipoModalidades() {
//        return acdAtividadeTipoModalidades;
//    }
//
//    public void setAcdAtividadeTipoModalidades(List<AcdAtividadeTipoModalidade> acdAtividadeTipoModalidades) {
//        this.acdAtividadeTipoModalidades = acdAtividadeTipoModalidades;
//    }
}
