package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdTurnoPK implements Serializable {
    private int codUnidade;
    private String codTurno;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodTurno", nullable = false, insertable = true, updatable = true)
    @Id
    public String getCodTurno() {
        return codTurno;
    }

    public void setCodTurno(String codTurno) {
        this.codTurno = codTurno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdTurnoPK that = (AcdTurnoPK) o;

        if (codUnidade != that.codUnidade) return false;
        if (codTurno != null ? !codTurno.equals(that.codTurno) : that.codTurno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (codTurno != null ? codTurno.hashCode() : 0);
        return result;
    }
}
