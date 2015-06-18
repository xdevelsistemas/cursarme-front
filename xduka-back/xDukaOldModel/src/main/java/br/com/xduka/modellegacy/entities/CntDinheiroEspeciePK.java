package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntDinheiroEspeciePK implements Serializable {
    private int codUnidade;
    private byte codDinheiro;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodDinheiro", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodDinheiro() {
        return codDinheiro;
    }

    public void setCodDinheiro(byte codDinheiro) {
        this.codDinheiro = codDinheiro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntDinheiroEspeciePK that = (CntDinheiroEspeciePK) o;

        if (codDinheiro != that.codDinheiro) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) codDinheiro;
        return result;
    }
}
