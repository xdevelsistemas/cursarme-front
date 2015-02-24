package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntTotalBalancoPK implements Serializable {
    private int codUnidade;
    private byte codTotalBalanço;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodTotalBalanço", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodTotalBalanço() {
        return codTotalBalanço;
    }

    public void setCodTotalBalanço(byte codTotalBalanço) {
        this.codTotalBalanço = codTotalBalanço;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntTotalBalancoPK that = (CntTotalBalancoPK) o;

        if (codTotalBalanço != that.codTotalBalanço) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) codTotalBalanço;
        return result;
    }
}
