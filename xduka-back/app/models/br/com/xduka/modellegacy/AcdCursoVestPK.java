package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdCursoVestPK implements Serializable {
    private int anoLetivo;
    private int codUnidade;
    private int codCursoVest;

    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    @Id
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodCursoVest", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodCursoVest() {
        return codCursoVest;
    }

    public void setCodCursoVest(int codCursoVest) {
        this.codCursoVest = codCursoVest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdCursoVestPK that = (AcdCursoVestPK) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codCursoVest != that.codCursoVest) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + codCursoVest;
        return result;
    }
}
