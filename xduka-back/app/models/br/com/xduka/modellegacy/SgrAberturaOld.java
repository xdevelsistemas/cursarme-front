package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(SgrAberturaOldPK.class)
@Table(name = "sgrAbertura_OLD", schema = "dbo")
public class SgrAberturaOld {
    private int idFormulário;
    private int idUsuário;
    private int codUnidade;
    private Integer controle;

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

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Basic
    @Column(name = "Controle", nullable = true, insertable = true, updatable = true)
    public Integer getControle() {
        return controle;
    }

    public void setControle(Integer controle) {
        this.controle = controle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrAberturaOld that = (SgrAberturaOld) o;

        if (codUnidade != that.codUnidade) return false;
        if (idFormulário != that.idFormulário) return false;
        if (idUsuário != that.idUsuário) return false;
        if (controle != null ? !controle.equals(that.controle) : that.controle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFormulário;
        result = 31 * result + idUsuário;
        result = 31 * result + codUnidade;
        result = 31 * result + (controle != null ? controle.hashCode() : 0);
        return result;
    }
}
