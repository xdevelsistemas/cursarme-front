package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CbrDiferencaMesPK implements Serializable {
    private int codUnidade;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private long codMovimento;

    @Column(name = "CodMovimento", nullable = false, insertable = true, updatable = true)
    @Id
    public long getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(long codMovimento) {
        this.codMovimento = codMovimento;
    }

    private int codDiferença;

    @Column(name = "CodDiferença", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodDiferença() {
        return codDiferença;
    }

    public void setCodDiferença(int codDiferença) {
        this.codDiferença = codDiferença;
    }

    private int mês;

    @Column(name = "Mês", nullable = false, insertable = true, updatable = true)
    @Id
    public int getMês() {
        return mês;
    }

    public void setMês(int mês) {
        this.mês = mês;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrDiferencaMesPK that = (CbrDiferencaMesPK) o;

        if (codDiferença != that.codDiferença) return false;
        if (codMovimento != that.codMovimento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (mês != that.mês) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) (codMovimento ^ (codMovimento >>> 32));
        result = 31 * result + codDiferença;
        result = 31 * result + mês;
        return result;
    }
}
