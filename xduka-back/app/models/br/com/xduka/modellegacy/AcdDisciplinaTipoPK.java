package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdDisciplinaTipoPK implements Serializable {
    private int codUnidade;
    private byte codDisciplinaTipo;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodDisciplinaTipo", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodDisciplinaTipo() {
        return codDisciplinaTipo;
    }

    public void setCodDisciplinaTipo(byte codDisciplinaTipo) {
        this.codDisciplinaTipo = codDisciplinaTipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdDisciplinaTipoPK that = (AcdDisciplinaTipoPK) o;

        if (codDisciplinaTipo != that.codDisciplinaTipo) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) codDisciplinaTipo;
        return result;
    }
}
