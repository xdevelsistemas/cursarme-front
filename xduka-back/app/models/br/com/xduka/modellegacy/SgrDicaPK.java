package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class SgrDicaPK implements Serializable {
    private int idFormulário;
    private int idUsuário;

    @Column(name = "IDFormulário", nullable = false, insertable = true, updatable = true)
    @Id
    public int getIdFormulário() {
        return idFormulário;
    }

    public void setIdFormulário(int idFormulário) {
        this.idFormulário = idFormulário;
    }

    @Column(name = "IDUsuário", nullable = false, insertable = true, updatable = true)
    @Id
    public int getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(int idUsuário) {
        this.idUsuário = idUsuário;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrDicaPK sgrDicaPK = (SgrDicaPK) o;

        if (idFormulário != sgrDicaPK.idFormulário) return false;
        if (idUsuário != sgrDicaPK.idUsuário) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFormulário;
        result = 31 * result + idUsuário;
        return result;
    }
}
