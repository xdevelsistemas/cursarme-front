package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntMovimentoAfPK implements Serializable {
    private int codUnidade;
    private int autorizaçãoFornecimento;
    private String autorizaçãoFornecimentoLetra;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "AutorizaçãoFornecimento", nullable = false, insertable = true, updatable = true)
    @Id
    public int getAutorizaçãoFornecimento() {
        return autorizaçãoFornecimento;
    }

    public void setAutorizaçãoFornecimento(int autorizaçãoFornecimento) {
        this.autorizaçãoFornecimento = autorizaçãoFornecimento;
    }

    @Column(name = "AutorizaçãoFornecimentoLetra", nullable = false, insertable = true, updatable = true)
    @Id
    public String getAutorizaçãoFornecimentoLetra() {
        return autorizaçãoFornecimentoLetra;
    }

    public void setAutorizaçãoFornecimentoLetra(String autorizaçãoFornecimentoLetra) {
        this.autorizaçãoFornecimentoLetra = autorizaçãoFornecimentoLetra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntMovimentoAfPK that = (CntMovimentoAfPK) o;

        if (autorizaçãoFornecimento != that.autorizaçãoFornecimento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (autorizaçãoFornecimentoLetra != null ? !autorizaçãoFornecimentoLetra.equals(that.autorizaçãoFornecimentoLetra) : that.autorizaçãoFornecimentoLetra != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + autorizaçãoFornecimento;
        result = 31 * result + (autorizaçãoFornecimentoLetra != null ? autorizaçãoFornecimentoLetra.hashCode() : 0);
        return result;
    }
}
