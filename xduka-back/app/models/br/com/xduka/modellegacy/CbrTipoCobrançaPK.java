package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CbrTipoCobrançaPK implements Serializable {
    private int codUnidade;
    private int codTipoCobrança;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodTipoCobrança", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodTipoCobrança() {
        return codTipoCobrança;
    }

    public void setCodTipoCobrança(int codTipoCobrança) {
        this.codTipoCobrança = codTipoCobrança;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrTipoCobrançaPK that = (CbrTipoCobrançaPK) o;

        if (codTipoCobrança != that.codTipoCobrança) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codTipoCobrança;
        return result;
    }
}
