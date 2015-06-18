package br.com.xduka.modellegacy.entities;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class InsGabaritoPK implements Serializable {


    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codInscrição;

    @Id
    @javax.persistence.Column(name = "CodInscrição", nullable = false, insertable = true, updatable = true)
    public int getCodInscrição() {
        return codInscrição;
    }

    public void setCodInscrição(int codInscrição) {
        this.codInscrição = codInscrição;
    }

    private byte codGabarito;

    @Id
    @javax.persistence.Column(name = "CodGabarito", nullable = false, insertable = true, updatable = true)
    public byte getCodGabarito() {
        return codGabarito;
    }

    public void setCodGabarito(byte codGabarito) {
        this.codGabarito = codGabarito;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsGabaritoPK that = (InsGabaritoPK) o;

        if (codGabarito != that.codGabarito) return false;
        if (codInscrição != that.codInscrição) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codInscrição;
        result = 31 * result + (int) codGabarito;

        return result;
    }
}
