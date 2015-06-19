package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntDepartamentoPK implements Serializable {
    private int codUnidade;
    private String codDepartamento;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodDepartamento", nullable = false, insertable = true, updatable = true)
    @Id
    public String getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(String codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntDepartamentoPK that = (CntDepartamentoPK) o;

        if (codUnidade != that.codUnidade) return false;
        if (codDepartamento != null ? !codDepartamento.equals(that.codDepartamento) : that.codDepartamento != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (codDepartamento != null ? codDepartamento.hashCode() : 0);
        return result;
    }
}
