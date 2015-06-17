package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "cntQuitaçãoLog", schema = "dbo")
@IdClass(CntQuitacaoLogPK.class)
public class CntQuitacaoLog {
    private Timestamp movimentoData;
    private String conta;
    private BigDecimal valorQuitadoBanco;
    private Short títulosQuitadosBanco;

    @Id
    @Column(name = "MovimentoData", nullable = false, insertable = true, updatable = true)
    public Timestamp getMovimentoData() {
        return movimentoData;
    }

    public void setMovimentoData(Timestamp movimentoData) {
        this.movimentoData = movimentoData;
    }

    @Id
    @Column(name = "Conta", nullable = false, insertable = true, updatable = true)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Basic
    @Column(name = "ValorQuitadoBanco", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorQuitadoBanco() {
        return valorQuitadoBanco;
    }

    public void setValorQuitadoBanco(BigDecimal valorQuitadoBanco) {
        this.valorQuitadoBanco = valorQuitadoBanco;
    }

    @Basic
    @Column(name = "TítulosQuitadosBanco", nullable = true, insertable = true, updatable = true)
    public Short getTítulosQuitadosBanco() {
        return títulosQuitadosBanco;
    }

    public void setTítulosQuitadosBanco(Short títulosQuitadosBanco) {
        this.títulosQuitadosBanco = títulosQuitadosBanco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntQuitacaoLog that = (CntQuitacaoLog) o;

        if (conta != null ? !conta.equals(that.conta) : that.conta != null) return false;
        if (movimentoData != null ? !movimentoData.equals(that.movimentoData) : that.movimentoData != null)
            return false;
        if (títulosQuitadosBanco != null ? !títulosQuitadosBanco.equals(that.títulosQuitadosBanco) : that.títulosQuitadosBanco != null)
            return false;
        if (valorQuitadoBanco != null ? !valorQuitadoBanco.equals(that.valorQuitadoBanco) : that.valorQuitadoBanco != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = movimentoData != null ? movimentoData.hashCode() : 0;
        result = 31 * result + (conta != null ? conta.hashCode() : 0);
        result = 31 * result + (valorQuitadoBanco != null ? valorQuitadoBanco.hashCode() : 0);
        result = 31 * result + (títulosQuitadosBanco != null ? títulosQuitadosBanco.hashCode() : 0);
        return result;
    }
}
