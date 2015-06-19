package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdIngressoFormaPK implements Serializable {
    private int codUnidade;
    private int codIngressoForma;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodIngressoForma", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodIngressoForma() {
        return codIngressoForma;
    }

    public void setCodIngressoForma(int codIngressoForma) {
        this.codIngressoForma = codIngressoForma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdIngressoFormaPK that = (AcdIngressoFormaPK) o;

        if (codIngressoForma != that.codIngressoForma) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codIngressoForma;
        return result;
    }
}
