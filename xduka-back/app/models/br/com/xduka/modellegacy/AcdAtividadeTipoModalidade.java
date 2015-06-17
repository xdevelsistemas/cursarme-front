package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdAtividadeTipoModalidadePK.class)
public class AcdAtividadeTipoModalidade {
    private long atividadeModalidadeId;
    private int anoLetivo;
    private int codUnidade;
    private int codTipo;
    private int codModalidade;
    private int codMotivo;
    private String modalidade;
    private BigDecimal valor;
    private AcdAtividadeTipo acdAtividadeTipo;
    private CbrDiferencaMotivo cbrDiferencaMotivo;

    @Basic
    @Column(name = "AtividadeModalidade_ID", nullable = false, insertable = true, updatable = true)
    public long getAtividadeModalidadeId() {
        return atividadeModalidadeId;
    }

    public void setAtividadeModalidadeId(long atividadeModalidadeId) {
        this.atividadeModalidadeId = atividadeModalidadeId;
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

    @Id
    @Column(name = "CodModalidade", nullable = false, insertable = true, updatable = true)
    public int getCodModalidade() {
        return codModalidade;
    }

    public void setCodModalidade(int codModalidade) {
        this.codModalidade = codModalidade;
    }

    @Basic
    @Column(name = "CodMotivo", nullable = false, insertable = true, updatable = true)
    public int getCodMotivo() {
        return codMotivo;
    }

    public void setCodMotivo(int codMotivo) {
        this.codMotivo = codMotivo;
    }

    @Basic
    @Column(name = "Modalidade", nullable = true, insertable = true, updatable = true)
    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    @Basic
    @Column(name = "Valor", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAtividadeTipoModalidade that = (AcdAtividadeTipoModalidade) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (atividadeModalidadeId != that.atividadeModalidadeId) return false;
        if (codModalidade != that.codModalidade) return false;
        if (codMotivo != that.codMotivo) return false;
        if (codTipo != that.codTipo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (modalidade != null ? !modalidade.equals(that.modalidade) : that.modalidade != null) return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (atividadeModalidadeId ^ (atividadeModalidadeId >>> 32));
        result = 31 * result + anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + codTipo;
        result = 31 * result + codModalidade;
        result = 31 * result + codMotivo;
        result = 31 * result + (modalidade != null ? modalidade.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "AnoLetivo", referencedColumnName = "AnoLetivo", nullable = false), @JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodTipo", referencedColumnName = "CodTipo", nullable = false)})
    public AcdAtividadeTipo getAcdAtividadeTipo() {
        return acdAtividadeTipo;
    }

    public void setAcdAtividadeTipo(AcdAtividadeTipo acdAtividadeTipo) {
        this.acdAtividadeTipo = acdAtividadeTipo;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodMotivo", referencedColumnName = "CodMotivo", nullable = false)})
    public CbrDiferencaMotivo getCbrDiferencaMotivo() {
        return cbrDiferencaMotivo;
    }

    public void setCbrDiferencaMotivo(CbrDiferencaMotivo cbrDiferencaMotivo) {
        this.cbrDiferencaMotivo = cbrDiferencaMotivo;
    }
}
