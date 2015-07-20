package br.com.xduka.modellegacy.entities;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntCaixaPK implements Serializable {


    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codCaixa;

    @Id
    @javax.persistence.Column(name = "CodCaixa", nullable = false, insertable = true, updatable = true)
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

        CntCaixaPK cntCaixa = (CntCaixaPK) o;

        if (codCaixa != cntCaixa.codCaixa) return false;
        if (codUnidade != cntCaixa.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codCaixa;

        return result;
    }
}
