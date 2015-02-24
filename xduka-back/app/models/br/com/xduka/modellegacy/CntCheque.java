package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntChequePK.class)
public class CntCheque {
    private long chequeId;
    private int codUnidade;
    private short banco;
    private String agência;
    private String conta;
    private int cheque;
    private Timestamp data;
    private BigDecimal valor;
    private Integer codRelacionamento;
    private String situação;
    private List<CntChequeParcela> cntChequeParcelas;

    @Basic
    @Column(name = "Cheque_ID", nullable = false, insertable = true, updatable = true)
    public long getChequeId() {
        return chequeId;
    }

    public void setChequeId(long chequeId) {
        this.chequeId = chequeId;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "Banco", nullable = false, insertable = true, updatable = true)
    public short getBanco() {
        return banco;
    }

    public void setBanco(short banco) {
        this.banco = banco;
    }

    @Id
    @Column(name = "Agência", nullable = false, insertable = true, updatable = true)
    public String getAgência() {
        return agência;
    }

    public void setAgência(String agência) {
        this.agência = agência;
    }

    @Id
    @Column(name = "Conta", nullable = false, insertable = true, updatable = true)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Id
    @Column(name = "Cheque", nullable = false, insertable = true, updatable = true)
    public int getCheque() {
        return cheque;
    }

    public void setCheque(int cheque) {
        this.cheque = cheque;
    }

    @Basic
    @Column(name = "Data", nullable = true, insertable = true, updatable = true)
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Basic
    @Column(name = "Valor", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Basic
    @Column(name = "CodRelacionamento", nullable = true, insertable = true, updatable = true)
    public Integer getCodRelacionamento() {
        return codRelacionamento;
    }

    public void setCodRelacionamento(Integer codRelacionamento) {
        this.codRelacionamento = codRelacionamento;
    }

    @Basic
    @Column(name = "Situação", nullable = false, insertable = true, updatable = true)
    public String getSituação() {
        return situação;
    }

    public void setSituação(String situação) {
        this.situação = situação;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntCheque cntCheque = (CntCheque) o;

        if (banco != cntCheque.banco) return false;
        if (cheque != cntCheque.cheque) return false;
        if (chequeId != cntCheque.chequeId) return false;
        if (codUnidade != cntCheque.codUnidade) return false;
        if (agência != null ? !agência.equals(cntCheque.agência) : cntCheque.agência != null) return false;
        if (codRelacionamento != null ? !codRelacionamento.equals(cntCheque.codRelacionamento) : cntCheque.codRelacionamento != null)
            return false;
        if (conta != null ? !conta.equals(cntCheque.conta) : cntCheque.conta != null) return false;
        if (data != null ? !data.equals(cntCheque.data) : cntCheque.data != null) return false;
        if (situação != null ? !situação.equals(cntCheque.situação) : cntCheque.situação != null) return false;
        if (valor != null ? !valor.equals(cntCheque.valor) : cntCheque.valor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (chequeId ^ (chequeId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) banco;
        result = 31 * result + (agência != null ? agência.hashCode() : 0);
        result = 31 * result + (conta != null ? conta.hashCode() : 0);
        result = 31 * result + cheque;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (codRelacionamento != null ? codRelacionamento.hashCode() : 0);
        result = 31 * result + (situação != null ? situação.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "cntCheque")
    public List<CntChequeParcela> getCntChequeParcelas() {
        return cntChequeParcelas;
    }

    public void setCntChequeParcelas(List<CntChequeParcela> cntChequeParcelas) {
        this.cntChequeParcelas = cntChequeParcelas;
    }
}
