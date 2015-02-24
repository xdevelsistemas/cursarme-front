package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntRacaPK implements Serializable {
    private int codUnidade;
    private int codRaça;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodRaça", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodRaça() {
        return codRaça;
    }

    public void setCodRaça(int codRaça) {
        this.codRaça = codRaça;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntRacaPK cntRacaPK = (CntRacaPK) o;

        if (codRaça != cntRacaPK.codRaça) return false;
        if (codUnidade != cntRacaPK.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codRaça;
        return result;
    }
}
