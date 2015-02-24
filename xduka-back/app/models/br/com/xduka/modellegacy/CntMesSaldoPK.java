package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntMesSaldoPK implements Serializable {
    private int codUnidade;
    private int mês;
    private int codCaixa;

    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "Mês", nullable = false, insertable = false, updatable = false)
    @Id
    public int getMês() {
        return mês;
    }

    public void setMês(int mês) {
        this.mês = mês;
    }

    @Column(name = "CodCaixa", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodCaixa() {
        return codCaixa;
    }

    public void setCodCaixa(int codCaixa) {
        this.codCaixa = codCaixa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntMesSaldoPK that = (CntMesSaldoPK) o;

        if (codCaixa != that.codCaixa) return false;
        if (codUnidade != that.codUnidade) return false;
        if (mês != that.mês) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + mês;
        result = 31 * result + codCaixa;
        return result;
    }
}
