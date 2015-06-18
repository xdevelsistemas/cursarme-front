package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class InsSalaPK implements Serializable {
    private int codUnidade;
    private int codInscrição;
    private short sala;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodInscrição", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodInscrição() {
        return codInscrição;
    }

    public void setCodInscrição(int codInscrição) {
        this.codInscrição = codInscrição;
    }

    @Column(name = "Sala", nullable = false, insertable = true, updatable = true)
    @Id
    public short getSala() {
        return sala;
    }

    public void setSala(short sala) {
        this.sala = sala;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsSalaPK insSalaPK = (InsSalaPK) o;

        if (codInscrição != insSalaPK.codInscrição) return false;
        if (codUnidade != insSalaPK.codUnidade) return false;
        if (sala != insSalaPK.sala) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codInscrição;
        result = 31 * result + (int) sala;
        return result;
    }
}
