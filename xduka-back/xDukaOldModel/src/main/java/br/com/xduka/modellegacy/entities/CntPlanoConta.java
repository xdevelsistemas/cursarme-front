package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntPlanoContaPK.class)
public class CntPlanoConta {
    private long planoContaId;
    private int codUnidade;
    private int codConta;
    private Integer codContaPrincipal;
    private String conta;
    private boolean entrada;
    private boolean transferência;
    private boolean autorização;
    private String planoContaContábil;
    private Integer menorPrazoAf;

    @Basic
    @Column(name = "PlanoConta_ID", nullable = false, insertable = true, updatable = true)
    public long getPlanoContaId() {
        return planoContaId;
    }

    public void setPlanoContaId(long planoContaId) {
        this.planoContaId = planoContaId;
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
    @Column(name = "CodConta", nullable = false, insertable = true, updatable = true)
    public int getCodConta() {
        return codConta;
    }

    public void setCodConta(int codConta) {
        this.codConta = codConta;
    }

    @Basic
    @Column(name = "CodContaPrincipal", nullable = true, insertable = true, updatable = true)
    public Integer getCodContaPrincipal() {
        return codContaPrincipal;
    }

    public void setCodContaPrincipal(Integer codContaPrincipal) {
        this.codContaPrincipal = codContaPrincipal;
    }

    @Basic
    @Column(name = "Conta", nullable = true, insertable = true, updatable = true)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Basic
    @Column(name = "Entrada", nullable = false, insertable = true, updatable = true)
    public boolean isEntrada() {
        return entrada;
    }

    public void setEntrada(boolean entrada) {
        this.entrada = entrada;
    }

    @Basic
    @Column(name = "Transferência", nullable = false, insertable = true, updatable = true)
    public boolean isTransferência() {
        return transferência;
    }

    public void setTransferência(boolean transferência) {
        this.transferência = transferência;
    }

    @Basic
    @Column(name = "Autorização", nullable = false, insertable = true, updatable = true)
    public boolean isAutorização() {
        return autorização;
    }

    public void setAutorização(boolean autorização) {
        this.autorização = autorização;
    }

    @Basic
    @Column(name = "PlanoContaContábil", nullable = true, insertable = true, updatable = true, length = 30)
    public String getPlanoContaContábil() {
        return planoContaContábil;
    }

    public void setPlanoContaContábil(String planoContaContábil) {
        this.planoContaContábil = planoContaContábil;
    }

    @Basic
    @Column(name = "MenorPrazoAF", nullable = true, insertable = true, updatable = true)
    public Integer getMenorPrazoAf() {
        return menorPrazoAf;
    }

    public void setMenorPrazoAf(Integer menorPrazoAf) {
        this.menorPrazoAf = menorPrazoAf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntPlanoConta that = (CntPlanoConta) o;

        if (autorização != that.autorização) return false;
        if (codConta != that.codConta) return false;
        if (codUnidade != that.codUnidade) return false;
        if (entrada != that.entrada) return false;
        if (planoContaId != that.planoContaId) return false;
        if (transferência != that.transferência) return false;
        if (codContaPrincipal != null ? !codContaPrincipal.equals(that.codContaPrincipal) : that.codContaPrincipal != null)
            return false;
        if (conta != null ? !conta.equals(that.conta) : that.conta != null) return false;
        if (menorPrazoAf != null ? !menorPrazoAf.equals(that.menorPrazoAf) : that.menorPrazoAf != null) return false;
        if (planoContaContábil != null ? !planoContaContábil.equals(that.planoContaContábil) : that.planoContaContábil != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (planoContaId ^ (planoContaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codConta;
        result = 31 * result + (codContaPrincipal != null ? codContaPrincipal.hashCode() : 0);
        result = 31 * result + (conta != null ? conta.hashCode() : 0);
        result = 31 * result + (entrada ? 1 : 0);
        result = 31 * result + (transferência ? 1 : 0);
        result = 31 * result + (autorização ? 1 : 0);
        result = 31 * result + (planoContaContábil != null ? planoContaContábil.hashCode() : 0);
        result = 31 * result + (menorPrazoAf != null ? menorPrazoAf.hashCode() : 0);
        return result;
    }


}
