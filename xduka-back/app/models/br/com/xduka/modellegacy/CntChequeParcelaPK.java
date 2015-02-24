package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntChequeParcelaPK implements Serializable {
    private int codUnidade;

    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private long codMovimento;

    @Column(name = "CodMovimento", nullable = false, insertable = true, updatable = true)
    @Id
    public long getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(long codMovimento) {
        this.codMovimento = codMovimento;
    }

    private int parcela;

    @Column(name = "Parcela", nullable = false, insertable = true, updatable = true)
    @Id
    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    private short banco;

    @Column(name = "Banco", nullable = false, insertable = false, updatable = false)
    @Id
    public short getBanco() {
        return banco;
    }

    public void setBanco(short banco) {
        this.banco = banco;
    }

    private String agência;

    @Column(name = "Agência", nullable = false, insertable = false, updatable = false)
    @Id
    public String getAgência() {
        return agência;
    }

    public void setAgência(String agência) {
        this.agência = agência;
    }

    private String conta;

    @Column(name = "Conta", nullable = false, insertable = false, updatable = false)
    @Id
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    private int cheque;

    @Column(name = "Cheque", nullable = false, insertable = false, updatable = false)
    @Id
    public int getCheque() {
        return cheque;
    }

    public void setCheque(int cheque) {
        this.cheque = cheque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntChequeParcelaPK that = (CntChequeParcelaPK) o;

        if (banco != that.banco) return false;
        if (cheque != that.cheque) return false;
        if (codMovimento != that.codMovimento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (parcela != that.parcela) return false;
        if (agência != null ? !agência.equals(that.agência) : that.agência != null) return false;
        if (conta != null ? !conta.equals(that.conta) : that.conta != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) (codMovimento ^ (codMovimento >>> 32));
        result = 31 * result + parcela;
        result = 31 * result + (int) banco;
        result = 31 * result + (agência != null ? agência.hashCode() : 0);
        result = 31 * result + (conta != null ? conta.hashCode() : 0);
        result = 31 * result + cheque;
        return result;
    }
}
