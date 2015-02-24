package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "cntMêsSaldo", schema = "dbo", catalog = "xDuka")
@IdClass(CntMesSaldoPK.class)
public class CntMesSaldo {
    private int codUnidade;
    private int mês;
    private int codCaixa;
    private BigDecimal saldo;
    private CntMes cntMês;

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "Mês", nullable = false, insertable = false, updatable = false)
    public int getMês() {
        return mês;
    }

    public void setMês(int mês) {
        this.mês = mês;
    }

    @Id
    @Column(name = "CodCaixa", nullable = false, insertable = true, updatable = true)
    public int getCodCaixa() {
        return codCaixa;
    }

    public void setCodCaixa(int codCaixa) {
        this.codCaixa = codCaixa;
    }

    @Basic
    @Column(name = "Saldo", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntMesSaldo that = (CntMesSaldo) o;

        if (codCaixa != that.codCaixa) return false;
        if (codUnidade != that.codUnidade) return false;
        if (mês != that.mês) return false;
        if (saldo != null ? !saldo.equals(that.saldo) : that.saldo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + mês;
        result = 31 * result + codCaixa;
        result = 31 * result + (saldo != null ? saldo.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "Mês", referencedColumnName = "Mês", nullable = false)})
    public CntMes getCntMês() {
        return cntMês;
    }

    public void setCntMês(CntMes cntMês) {
        this.cntMês = cntMês;
    }
}
