package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CbrDiferencaMotivoPK.class)
public class CbrDiferencaMotivo {
    private long diferençaMotivoId;
    private int codUnidade;
    private int codMotivo;
    private String motivo;
    private boolean acréscimo;
    private String observação;
    private boolean rendimento;
    private Byte ordem;
    private Boolean convênio;
//    private List<AcdAtividadeTipoModalidade> acdAtividadeTipoModalidades;
//    private List<CbrDiferenca> cbrDiferencas;

    @Basic
    @Column(name = "DiferençaMotivo_ID", nullable = false, insertable = true, updatable = true)
    public long getDiferençaMotivoId() {
        return diferençaMotivoId;
    }

    public void setDiferençaMotivoId(long diferençaMotivoId) {
        this.diferençaMotivoId = diferençaMotivoId;
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
    @Column(name = "CodMotivo", nullable = false, insertable = true, updatable = true)
    public int getCodMotivo() {
        return codMotivo;
    }

    public void setCodMotivo(int codMotivo) {
        this.codMotivo = codMotivo;
    }

    @Basic
    @Column(name = "Motivo", nullable = false, insertable = true, updatable = true)
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Basic
    @Column(name = "Acréscimo", nullable = false, insertable = true, updatable = true)
    public boolean isAcréscimo() {
        return acréscimo;
    }

    public void setAcréscimo(boolean acréscimo) {
        this.acréscimo = acréscimo;
    }

    @Basic
    @Column(name = "Observação", nullable = true, insertable = true, updatable = true)
    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

    @Basic
    @Column(name = "Rendimento", nullable = false, insertable = true, updatable = true)
    public boolean isRendimento() {
        return rendimento;
    }

    public void setRendimento(boolean rendimento) {
        this.rendimento = rendimento;
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
    @Column(name = "Convênio", nullable = true, insertable = true, updatable = true)
    public Boolean getConvênio() {
        return convênio;
    }

    public void setConvênio(Boolean convênio) {
        this.convênio = convênio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrDiferencaMotivo that = (CbrDiferencaMotivo) o;

        if (acréscimo != that.acréscimo) return false;
        if (codMotivo != that.codMotivo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (diferençaMotivoId != that.diferençaMotivoId) return false;
        if (rendimento != that.rendimento) return false;
        if (convênio != null ? !convênio.equals(that.convênio) : that.convênio != null) return false;
        if (motivo != null ? !motivo.equals(that.motivo) : that.motivo != null) return false;
        if (observação != null ? !observação.equals(that.observação) : that.observação != null) return false;
        if (ordem != null ? !ordem.equals(that.ordem) : that.ordem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (diferençaMotivoId ^ (diferençaMotivoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codMotivo;
        result = 31 * result + (motivo != null ? motivo.hashCode() : 0);
        result = 31 * result + (acréscimo ? 1 : 0);
        result = 31 * result + (observação != null ? observação.hashCode() : 0);
        result = 31 * result + (rendimento ? 1 : 0);
        result = 31 * result + (ordem != null ? ordem.hashCode() : 0);
        result = 31 * result + (convênio != null ? convênio.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "cbrDiferencaMotivo")
//    public List<AcdAtividadeTipoModalidade> getAcdAtividadeTipoModalidades() {
//        return acdAtividadeTipoModalidades;
//    }
//
//    public void setAcdAtividadeTipoModalidades(List<AcdAtividadeTipoModalidade> acdAtividadeTipoModalidades) {
//        this.acdAtividadeTipoModalidades = acdAtividadeTipoModalidades;
//    }
//
//    @OneToMany(mappedBy = "cbrDiferencaMotivo")
//    public List<CbrDiferenca> getCbrDiferencas() {
//        return cbrDiferencas;
//    }
//
//    public void setCbrDiferencas(List<CbrDiferenca> cbrDiferencas) {
//        this.cbrDiferencas = cbrDiferencas;
//    }
}
