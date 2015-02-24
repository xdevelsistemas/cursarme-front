package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdSituaçãoPK implements Serializable {
    private int codUnidade;
    private byte codSituação;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodSituação", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodSituação() {
        return codSituação;
    }

    public void setCodSituação(byte codSituação) {
        this.codSituação = codSituação;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdSituaçãoPK that = (AcdSituaçãoPK) o;

        if (codSituação != that.codSituação) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) codSituação;
        return result;
    }
}
