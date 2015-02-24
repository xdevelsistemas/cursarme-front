package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdCursoAreaPK implements Serializable {
    private int codUnidade;
    private int codÁrea;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodÁrea", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodÁrea() {
        return codÁrea;
    }

    public void setCodÁrea(int codÁrea) {
        this.codÁrea = codÁrea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdCursoAreaPK that = (AcdCursoAreaPK) o;

        if (codUnidade != that.codUnidade) return false;
        if (codÁrea != that.codÁrea) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codÁrea;
        return result;
    }
}
