package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntChequeParcelaPK.class)
public class CntChequeParcela {
    private long chequeParcelaId;
    private int codUnidade;
    private long codMovimento;
    private int parcela;
    private short banco;
    private String agência;
    private String conta;
    private int cheque;
    private CntCheque cntCheque;

    @Basic
    @Column(name = "ChequeParcela_ID", nullable = false, insertable = true, updatable = true)
    public long getChequeParcelaId() {
        return chequeParcelaId;
    }

    public void setChequeParcelaId(long chequeParcelaId) {
        this.chequeParcelaId = chequeParcelaId;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodMovimento", nullable = false, insertable = true, updatable = true)
    public long getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(long codMovimento) {
        this.codMovimento = codMovimento;
    }

    @Id
    @Column(name = "Parcela", nullable = false, insertable = true, updatable = true)
    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    @Id
    @Column(name = "Banco", nullable = false, insertable = false, updatable = false)
    public short getBanco() {
        return banco;
    }

    public void setBanco(short banco) {
        this.banco = banco;
    }

    @Id
    @Column(name = "Agência", nullable = false, insertable = false, updatable = false)
    public String getAgência() {
        return agência;
    }

    public void setAgência(String agência) {
        this.agência = agência;
    }

    @Id
    @Column(name = "Conta", nullable = false, insertable = false, updatable = false)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Id
    @Column(name = "Cheque", nullable = false, insertable = false, updatable = false)
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

        CntChequeParcela that = (CntChequeParcela) o;

        if (banco != that.banco) return false;
        if (cheque != that.cheque) return false;
        if (chequeParcelaId != that.chequeParcelaId) return false;
        if (codMovimento != that.codMovimento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (parcela != that.parcela) return false;
        if (agência != null ? !agência.equals(that.agência) : that.agência != null) return false;
        if (conta != null ? !conta.equals(that.conta) : that.conta != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (chequeParcelaId ^ (chequeParcelaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) (codMovimento ^ (codMovimento >>> 32));
        result = 31 * result + parcela;
        result = 31 * result + (int) banco;
        result = 31 * result + (agência != null ? agência.hashCode() : 0);
        result = 31 * result + (conta != null ? conta.hashCode() : 0);
        result = 31 * result + cheque;
        return result;
    }

//    @ManyToOne
//    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "Banco", referencedColumnName = "Banco", nullable = false), @JoinColumn(name = "Agência", referencedColumnName = "Agência", nullable = false), @JoinColumn(name = "Conta", referencedColumnName = "Conta", nullable = false), @JoinColumn(name = "Cheque", referencedColumnName = "Cheque", nullable = false)})
//    public CntCheque getCntCheque() {
//        return cntCheque;
//    }
//
//    public void setCntCheque(CntCheque cntCheque) {
//        this.cntCheque = cntCheque;
//    }
}
