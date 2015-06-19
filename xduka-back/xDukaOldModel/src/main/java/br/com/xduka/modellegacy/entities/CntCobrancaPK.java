package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntCobrancaPK implements Serializable {
    private int codUnidade;
    private long númeroCobrança;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "NúmeroCobrança", nullable = false, insertable = true, updatable = true)
    @Id
    public long getNúmeroCobrança() {
        return númeroCobrança;
    }

    public void setNúmeroCobrança(long númeroCobrança) {
        this.númeroCobrança = númeroCobrança;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntCobrancaPK that = (CntCobrancaPK) o;

        if (codUnidade != that.codUnidade) return false;
        if (númeroCobrança != that.númeroCobrança) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) (númeroCobrança ^ (númeroCobrança >>> 32));
        return result;
    }
}
