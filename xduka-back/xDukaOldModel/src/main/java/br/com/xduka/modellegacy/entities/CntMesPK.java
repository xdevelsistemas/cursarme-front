package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntMesPK implements Serializable {
    private int codUnidade;
    private int mês;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "Mês", nullable = false, insertable = true, updatable = true)
    @Id
    public int getMês() {
        return mês;
    }

    public void setMês(int mês) {
        this.mês = mês;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntMesPK cntMesPK = (CntMesPK) o;

        if (codUnidade != cntMesPK.codUnidade) return false;
        if (mês != cntMesPK.mês) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + mês;
        return result;
    }
}
