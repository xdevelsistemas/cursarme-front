package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class SgrUsuarioFeedPK implements Serializable {
    private int idUsuário;
    private int codUnidade;
    private int codFeed;

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

    @Column(name = "CodFeed", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodFeed() {
        return codFeed;
    }

    public void setCodFeed(int codFeed) {
        this.codFeed = codFeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrUsuarioFeedPK that = (SgrUsuarioFeedPK) o;

        if (codFeed != that.codFeed) return false;
        if (codUnidade != that.codUnidade) return false;
        if (idUsuário != that.idUsuário) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuário;
        result = 31 * result + codUnidade;
        result = 31 * result + codFeed;
        return result;
    }
}
