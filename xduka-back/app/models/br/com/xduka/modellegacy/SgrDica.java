package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(SgrDicaPK.class)
public class SgrDica {
    private int idFormulário;
    private int idUsuário;
    private String dica;

    @Id
    @Column(name = "IDFormulário", nullable = false, insertable = true, updatable = true)
    public int getIdFormulário() {
        return idFormulário;
    }

    public void setIdFormulário(int idFormulário) {
        this.idFormulário = idFormulário;
    }

    @Id
    @Column(name = "IDUsuário", nullable = false, insertable = true, updatable = true)
    public int getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(int idUsuário) {
        this.idUsuário = idUsuário;
    }

    @Basic
    @Column(name = "Dica", nullable = true, insertable = true, updatable = true)
    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrDica sgrDica = (SgrDica) o;

        if (idFormulário != sgrDica.idFormulário) return false;
        if (idUsuário != sgrDica.idUsuário) return false;
        if (dica != null ? !dica.equals(sgrDica.dica) : sgrDica.dica != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFormulário;
        result = 31 * result + idUsuário;
        result = 31 * result + (dica != null ? dica.hashCode() : 0);
        return result;
    }
}
