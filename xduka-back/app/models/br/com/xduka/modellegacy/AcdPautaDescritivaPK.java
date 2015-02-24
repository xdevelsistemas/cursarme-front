package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdPautaDescritivaPK implements Serializable {
    private int codUnidade;
    private long codPauta;
    private short bimestre;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodPauta", nullable = false, insertable = true, updatable = true)
    @Id
    public long getCodPauta() {
        return codPauta;
    }

    public void setCodPauta(long codPauta) {
        this.codPauta = codPauta;
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

        AcdPautaDescritivaPK that = (AcdPautaDescritivaPK) o;

        if (bimestre != that.bimestre) return false;
        if (codPauta != that.codPauta) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) (codPauta ^ (codPauta >>> 32));
        result = 31 * result + (int) bimestre;
        return result;
    }
}
