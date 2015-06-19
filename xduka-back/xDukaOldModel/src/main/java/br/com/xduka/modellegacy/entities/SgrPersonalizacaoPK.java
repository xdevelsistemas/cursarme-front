package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class SgrPersonalizacaoPK implements Serializable {
    private int idControle;
    private int idUsuário;

    @Column(name = "IDControle", nullable = false, insertable = false, updatable = false)
    @Id
    public int getIdControle() {
        return idControle;
    }

    public void setIdControle(int idControle) {
        this.idControle = idControle;
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

        SgrPersonalizacaoPK that = (SgrPersonalizacaoPK) o;

        if (idControle != that.idControle) return false;
        if (idUsuário != that.idUsuário) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idControle;
        result = 31 * result + idUsuário;
        return result;
    }
}
