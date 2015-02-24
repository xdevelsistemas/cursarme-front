package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class SgrNívelAdm {
    private Integer id;
    private byte codNívelAdm;
    private String nívelAdm;

    @Basic
    @Column(name = "ID", nullable = true, insertable = true, updatable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @Column(name = "CodNívelADM", nullable = false, insertable = true, updatable = true)
    public byte getCodNívelAdm() {
        return codNívelAdm;
    }

    public void setCodNívelAdm(byte codNívelAdm) {
        this.codNívelAdm = codNívelAdm;
    }

    @Basic
    @Column(name = "NívelADM", nullable = true, insertable = true, updatable = true)
    public String getNívelAdm() {
        return nívelAdm;
    }

    public void setNívelAdm(String nívelAdm) {
        this.nívelAdm = nívelAdm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrNívelAdm that = (SgrNívelAdm) o;

        if (codNívelAdm != that.codNívelAdm) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nívelAdm != null ? !nívelAdm.equals(that.nívelAdm) : that.nívelAdm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (int) codNívelAdm;
        result = 31 * result + (nívelAdm != null ? nívelAdm.hashCode() : 0);
        return result;
    }
}
