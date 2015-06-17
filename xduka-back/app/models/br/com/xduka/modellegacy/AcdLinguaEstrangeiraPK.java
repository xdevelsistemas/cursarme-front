package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdLinguaEstrangeiraPK implements Serializable {
    private int codUnidade;
    private byte codLíngua;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodLíngua", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodLíngua() {
        return codLíngua;
    }

    public void setCodLíngua(byte codLíngua) {
        this.codLíngua = codLíngua;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdLinguaEstrangeiraPK that = (AcdLinguaEstrangeiraPK) o;

        if (codLíngua != that.codLíngua) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) codLíngua;
        return result;
    }
}
