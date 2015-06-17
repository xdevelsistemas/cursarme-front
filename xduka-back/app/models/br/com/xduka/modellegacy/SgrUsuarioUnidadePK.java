package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class SgrUsuarioUnidadePK implements Serializable {
    private int idUsuário;
    private int codUnidade;

    @Column(name = "IDUsuário", nullable = false, insertable = true, updatable = true)
    @Id
    public int getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(int idUsuário) {
        this.idUsuário = idUsuário;
    }

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrUsuarioUnidadePK that = (SgrUsuarioUnidadePK) o;

        if (codUnidade != that.codUnidade) return false;
        if (idUsuário != that.idUsuário) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuário;
        result = 31 * result + codUnidade;
        return result;
    }
}
