package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
public class CntDiaAbertoPK implements Serializable {
    private int codUnidade;
    private Timestamp movimentoData;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "MovimentoData", nullable = false, insertable = true, updatable = true)
    @Id
    public Timestamp getMovimentoData() {
        return movimentoData;
    }

    public void setMovimentoData(Timestamp movimentoData) {
        this.movimentoData = movimentoData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntDiaAbertoPK that = (CntDiaAbertoPK) o;

        if (codUnidade != that.codUnidade) return false;
        if (movimentoData != null ? !movimentoData.equals(that.movimentoData) : that.movimentoData != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (movimentoData != null ? movimentoData.hashCode() : 0);
        return result;
    }
}
