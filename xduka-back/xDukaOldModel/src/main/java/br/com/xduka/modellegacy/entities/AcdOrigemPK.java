package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdOrigemPK implements Serializable {
    private int codUnidade;
    private short codOrigem;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodOrigem", nullable = false, insertable = true, updatable = true)
    @Id
    public short getCodOrigem() {
        return codOrigem;
    }

    public void setCodOrigem(short codOrigem) {
        this.codOrigem = codOrigem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdOrigemPK that = (AcdOrigemPK) o;

        if (codOrigem != that.codOrigem) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) codOrigem;
        return result;
    }
}
