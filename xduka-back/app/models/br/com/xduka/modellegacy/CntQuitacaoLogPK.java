package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
public class CntQuitacaoLogPK implements Serializable {
    private Timestamp movimentoData;
    private String conta;

    @Column(name = "MovimentoData", nullable = false, insertable = true, updatable = true)
    @Id
    public Timestamp getMovimentoData() {
        return movimentoData;
    }

    public void setMovimentoData(Timestamp movimentoData) {
        this.movimentoData = movimentoData;
    }

    @Column(name = "Conta", nullable = false, insertable = true, updatable = true)
    @Id
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntQuitacaoLogPK that = (CntQuitacaoLogPK) o;

        if (conta != null ? !conta.equals(that.conta) : that.conta != null) return false;
        if (movimentoData != null ? !movimentoData.equals(that.movimentoData) : that.movimentoData != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = movimentoData != null ? movimentoData.hashCode() : 0;
        result = 31 * result + (conta != null ? conta.hashCode() : 0);
        return result;
    }
}
