package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CbrCartaInadimplentesPK implements Serializable {
    private int codUnidade;
    private byte codCarta;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodCarta", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodCarta() {
        return codCarta;
    }

    public void setCodCarta(byte codCarta) {
        this.codCarta = codCarta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrCartaInadimplentesPK that = (CbrCartaInadimplentesPK) o;

        if (codCarta != that.codCarta) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) codCarta;
        return result;
    }
}
