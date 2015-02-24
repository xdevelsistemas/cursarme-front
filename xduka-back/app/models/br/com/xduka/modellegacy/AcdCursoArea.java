package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "acdCursoÁrea", schema = "dbo", catalog = "xDuka")
@IdClass(AcdCursoAreaPK.class)
public class AcdCursoArea {
    private long cursoÁreaId;
    private int codUnidade;
    private int codÁrea;
    private String área;

    @Basic
    @Column(name = "CursoÁrea_ID", nullable = false, insertable = true, updatable = true)
    public long getCursoÁreaId() {
        return cursoÁreaId;
    }

    public void setCursoÁreaId(long cursoÁreaId) {
        this.cursoÁreaId = cursoÁreaId;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodÁrea", nullable = false, insertable = true, updatable = true)
    public int getCodÁrea() {
        return codÁrea;
    }

    public void setCodÁrea(int codÁrea) {
        this.codÁrea = codÁrea;
    }

    @Basic
    @Column(name = "Área", nullable = true, insertable = true, updatable = true)
    public String getÁrea() {
        return área;
    }

    public void setÁrea(String área) {
        this.área = área;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdCursoArea that = (AcdCursoArea) o;

        if (codUnidade != that.codUnidade) return false;
        if (codÁrea != that.codÁrea) return false;
        if (cursoÁreaId != that.cursoÁreaId) return false;
        if (área != null ? !área.equals(that.área) : that.área != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cursoÁreaId ^ (cursoÁreaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codÁrea;
        result = 31 * result + (área != null ? área.hashCode() : 0);
        return result;
    }
}
