package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdBimestrePK implements Serializable {
    private int codunidade;
    private int anoLetivo;
    private short bimestre;

    @Column(name = "Codunidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodunidade() {
        return codunidade;
    }

    public void setCodunidade(int codunidade) {
        this.codunidade = codunidade;
    }

    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    @Id
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Column(name = "Bimestre", nullable = false, insertable = true, updatable = true)
    @Id
    public short getBimestre() {
        return bimestre;
    }

    public void setBimestre(short bimestre) {
        this.bimestre = bimestre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdBimestrePK that = (AcdBimestrePK) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (bimestre != that.bimestre) return false;
        if (codunidade != that.codunidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codunidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + (int) bimestre;
        return result;
    }
}
