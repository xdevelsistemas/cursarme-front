package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntRelacionamentoTipoPK implements Serializable {
    private int codUnidade;
    private int codRelacionamentoTipo;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodRelacionamentoTipo", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodRelacionamentoTipo() {
        return codRelacionamentoTipo;
    }

    public void setCodRelacionamentoTipo(int codRelacionamentoTipo) {
        this.codRelacionamentoTipo = codRelacionamentoTipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntRelacionamentoTipoPK that = (CntRelacionamentoTipoPK) o;

        if (codRelacionamentoTipo != that.codRelacionamentoTipo) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codRelacionamentoTipo;
        return result;
    }
}
