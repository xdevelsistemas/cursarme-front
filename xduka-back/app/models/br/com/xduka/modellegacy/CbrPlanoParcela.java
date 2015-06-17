package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CbrPlanoParcelaPK.class)
public class CbrPlanoParcela {
    private long planoParcelaId;
    private int codUnidade;
    private int anoLetivo;
    private String plano;
    private byte parcela;
    private Integer mês;
    private Double multiplicador;
    private Double divisor;
    private Timestamp dataVencimento;
    private Timestamp dataLimite;
    private CbrMes cbrMêsByMes;
    private CbrPlano cbrPlano;

    @Basic
    @Column(name = "PlanoParcela_ID", nullable = false, insertable = true, updatable = true)
    public long getPlanoParcelaId() {
        return planoParcelaId;
    }

    public void setPlanoParcelaId(long planoParcelaId) {
        this.planoParcelaId = planoParcelaId;
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
    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Id
    @Column(name = "Plano", nullable = false, insertable = false, updatable = false)
    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    @Id
    @Column(name = "Parcela", nullable = false, insertable = true, updatable = true)
    public byte getParcela() {
        return parcela;
    }

    public void setParcela(byte parcela) {
        this.parcela = parcela;
    }

    @Basic
    @Column(name = "Mês", nullable = true, insertable = false, updatable = false)
    public Integer getMês() {
        return mês;
    }

    public void setMês(Integer mês) {
        this.mês = mês;
    }

    @Basic
    @Column(name = "Multiplicador", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(Double multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Basic
    @Column(name = "Divisor", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getDivisor() {
        return divisor;
    }

    public void setDivisor(Double divisor) {
        this.divisor = divisor;
    }

    @Basic
    @Column(name = "DataVencimento", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Timestamp dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Basic
    @Column(name = "DataLimite", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Timestamp dataLimite) {
        this.dataLimite = dataLimite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrPlanoParcela that = (CbrPlanoParcela) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (parcela != that.parcela) return false;
        if (planoParcelaId != that.planoParcelaId) return false;
        if (dataLimite != null ? !dataLimite.equals(that.dataLimite) : that.dataLimite != null) return false;
        if (dataVencimento != null ? !dataVencimento.equals(that.dataVencimento) : that.dataVencimento != null)
            return false;
        if (divisor != null ? !divisor.equals(that.divisor) : that.divisor != null) return false;
        if (multiplicador != null ? !multiplicador.equals(that.multiplicador) : that.multiplicador != null)
            return false;
        if (mês != null ? !mês.equals(that.mês) : that.mês != null) return false;
        if (plano != null ? !plano.equals(that.plano) : that.plano != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (planoParcelaId ^ (planoParcelaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + (plano != null ? plano.hashCode() : 0);
        result = 31 * result + (int) parcela;
        result = 31 * result + (mês != null ? mês.hashCode() : 0);
        result = 31 * result + (multiplicador != null ? multiplicador.hashCode() : 0);
        result = 31 * result + (divisor != null ? divisor.hashCode() : 0);
        result = 31 * result + (dataVencimento != null ? dataVencimento.hashCode() : 0);
        result = 31 * result + (dataLimite != null ? dataLimite.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Mês", referencedColumnName = "Mês")
    public CbrMes getCbrMêsByMes() {
        return cbrMêsByMes;
    }

    public void setCbrMêsByMes(CbrMes cbrMêsByMes) {
        this.cbrMêsByMes = cbrMêsByMes;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "AnoLetivo", referencedColumnName = "AnoLetivo", nullable = false), @JoinColumn(name = "Plano", referencedColumnName = "Plano", nullable = false)})
    public CbrPlano getCbrPlano() {
        return cbrPlano;
    }

    public void setCbrPlano(CbrPlano cbrPlano) {
        this.cbrPlano = cbrPlano;
    }
}
