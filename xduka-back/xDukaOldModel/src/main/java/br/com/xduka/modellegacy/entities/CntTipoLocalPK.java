package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntTipoLocalPK implements Serializable {
    private int codUnidade;
    private int codTipoLocal;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodTipoLocal", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodTipoLocal() {
        return codTipoLocal;
    }

    public void setCodTipoLocal(int codTipoLocal) {
        this.codTipoLocal = codTipoLocal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntTipoLocalPK that = (CntTipoLocalPK) o;

        if (codTipoLocal != that.codTipoLocal) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codTipoLocal;
        return result;
    }
}
