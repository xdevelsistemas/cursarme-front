package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntDiaAbertoPK.class)
public class CntDiaAberto {
    private int codUnidade;
    private Timestamp movimentoData;
    private Timestamp dataValidade;

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "MovimentoData", nullable = false, insertable = true, updatable = true)
    public Timestamp getMovimentoData() {
        return movimentoData;
    }

    public void setMovimentoData(Timestamp movimentoData) {
        this.movimentoData = movimentoData;
    }

    @Basic
    @Column(name = "DataValidade", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Timestamp dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntDiaAberto that = (CntDiaAberto) o;

        if (codUnidade != that.codUnidade) return false;
        if (dataValidade != null ? !dataValidade.equals(that.dataValidade) : that.dataValidade != null) return false;
        if (movimentoData != null ? !movimentoData.equals(that.movimentoData) : that.movimentoData != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (movimentoData != null ? movimentoData.hashCode() : 0);
        result = 31 * result + (dataValidade != null ? dataValidade.hashCode() : 0);
        return result;
    }
}
