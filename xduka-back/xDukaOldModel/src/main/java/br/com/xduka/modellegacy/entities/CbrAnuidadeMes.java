package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CbrAnuidadeMesPK.class)
public class CbrAnuidadeMes {
    private long anuidadeMêsId;
    private int codUnidade;
    private byte codAnuidade;
    private int anoLetivo;
    private int mês;
    private BigDecimal valorAnuidade;
//    private CbrAnuidade cbrAnuidade;
//    private CbrMes cbrMêsByMes;

    @Basic
    @Column(name = "AnuidadeMês_ID", nullable = false, insertable = true, updatable = true)
    public long getAnuidadeMêsId() {
        return anuidadeMêsId;
    }

    public void setAnuidadeMêsId(long anuidadeMêsId) {
        this.anuidadeMêsId = anuidadeMêsId;
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
    @Column(name = "CodAnuidade", nullable = false, insertable = true, updatable = true)
    public byte getCodAnuidade() {
        return codAnuidade;
    }

    public void setCodAnuidade(byte codAnuidade) {
        this.codAnuidade = codAnuidade;
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
    @Column(name = "Mês", nullable = false, insertable = true, updatable = true)
    public int getMês() {
        return mês;
    }

    public void setMês(int mês) {
        this.mês = mês;
    }

    @Basic
    @Column(name = "ValorAnuidade", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorAnuidade() {
        return valorAnuidade;
    }

    public void setValorAnuidade(BigDecimal valorAnuidade) {
        this.valorAnuidade = valorAnuidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrAnuidadeMes that = (CbrAnuidadeMes) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (anuidadeMêsId != that.anuidadeMêsId) return false;
        if (codAnuidade != that.codAnuidade) return false;
        if (codUnidade != that.codUnidade) return false;
        if (mês != that.mês) return false;
        if (valorAnuidade != null ? !valorAnuidade.equals(that.valorAnuidade) : that.valorAnuidade != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (anuidadeMêsId ^ (anuidadeMêsId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) codAnuidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + mês;
        result = 31 * result + (valorAnuidade != null ? valorAnuidade.hashCode() : 0);
        return result;
    }

//    @ManyToOne
//    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "AnoLetivo", referencedColumnName = "AnoLetivo", nullable = false), @JoinColumn(name = "CodAnuidade", referencedColumnName = "CodAnuidade", nullable = false)})
//    public CbrAnuidade getCbrAnuidade() {
//        return cbrAnuidade;
//    }
//
//    public void setCbrAnuidade(CbrAnuidade cbrAnuidade) {
//        this.cbrAnuidade = cbrAnuidade;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "Mês", referencedColumnName = "Mês", nullable = false)
//    public CbrMes getCbrMêsByMes() {
//        return cbrMêsByMes;
//    }
//
//    public void setCbrMêsByMes(CbrMes cbrMêsByMes) {
//        this.cbrMêsByMes = cbrMêsByMes;
//    }
}
