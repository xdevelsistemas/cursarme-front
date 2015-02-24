package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CbrAnuidadePK implements Serializable {
    private int codUnidade;
    private int anoLetivo;
    private byte codAnuidade;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    @Id
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Column(name = "CodAnuidade", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodAnuidade() {
        return codAnuidade;
    }

    public void setCodAnuidade(byte codAnuidade) {
        this.codAnuidade = codAnuidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrAnuidadePK that = (CbrAnuidadePK) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codAnuidade != that.codAnuidade) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + (int) codAnuidade;
        return result;
    }
}
