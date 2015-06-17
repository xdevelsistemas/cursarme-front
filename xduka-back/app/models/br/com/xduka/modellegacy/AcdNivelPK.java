package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdNivelPK implements Serializable {
    private int codUnidade;
    private byte codNível;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodNível", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodNível() {
        return codNível;
    }

    public void setCodNível(byte codNível) {
        this.codNível = codNível;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdNivelPK that = (AcdNivelPK) o;

        if (codNível != that.codNível) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) codNível;
        return result;
    }
}
