package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntMovimentoAfPK.class)
public class CntMovimentoAf {
    private long movimentoAfId;
    private int codUnidade;
    private int autorizaçãoFornecimento;
    private String autorizaçãoFornecimentoLetra;
    private long codMovimento;
    private Integer codUsuárioAutorização;

    @Basic
    @Column(name = "MovimentoAF_ID", nullable = false, insertable = true, updatable = true)
    public long getMovimentoAfId() {
        return movimentoAfId;
    }

    public void setMovimentoAfId(long movimentoAfId) {
        this.movimentoAfId = movimentoAfId;
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
    @Column(name = "AutorizaçãoFornecimento", nullable = false, insertable = true, updatable = true)
    public int getAutorizaçãoFornecimento() {
        return autorizaçãoFornecimento;
    }

    public void setAutorizaçãoFornecimento(int autorizaçãoFornecimento) {
        this.autorizaçãoFornecimento = autorizaçãoFornecimento;
    }

    @Id
    @Column(name = "AutorizaçãoFornecimentoLetra", nullable = false, insertable = true, updatable = true)
    public String getAutorizaçãoFornecimentoLetra() {
        return autorizaçãoFornecimentoLetra;
    }

    public void setAutorizaçãoFornecimentoLetra(String autorizaçãoFornecimentoLetra) {
        this.autorizaçãoFornecimentoLetra = autorizaçãoFornecimentoLetra;
    }

    @Basic
    @Column(name = "CodMovimento", nullable = false, insertable = true, updatable = true)
    public long getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(long codMovimento) {
        this.codMovimento = codMovimento;
    }

    @Basic
    @Column(name = "CodUsuárioAutorização", nullable = true, insertable = true, updatable = true)
    public Integer getCodUsuárioAutorização() {
        return codUsuárioAutorização;
    }

    public void setCodUsuárioAutorização(Integer codUsuárioAutorização) {
        this.codUsuárioAutorização = codUsuárioAutorização;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntMovimentoAf that = (CntMovimentoAf) o;

        if (autorizaçãoFornecimento != that.autorizaçãoFornecimento) return false;
        if (codMovimento != that.codMovimento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (movimentoAfId != that.movimentoAfId) return false;
        if (autorizaçãoFornecimentoLetra != null ? !autorizaçãoFornecimentoLetra.equals(that.autorizaçãoFornecimentoLetra) : that.autorizaçãoFornecimentoLetra != null)
            return false;
        if (codUsuárioAutorização != null ? !codUsuárioAutorização.equals(that.codUsuárioAutorização) : that.codUsuárioAutorização != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (movimentoAfId ^ (movimentoAfId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + autorizaçãoFornecimento;
        result = 31 * result + (autorizaçãoFornecimentoLetra != null ? autorizaçãoFornecimentoLetra.hashCode() : 0);
        result = 31 * result + (int) (codMovimento ^ (codMovimento >>> 32));
        result = 31 * result + (codUsuárioAutorização != null ? codUsuárioAutorização.hashCode() : 0);
        return result;
    }
}
