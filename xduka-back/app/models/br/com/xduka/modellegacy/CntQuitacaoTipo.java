package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "cntQuitaçãoTipo", schema = "dbo", catalog = "xDuka")
public class CntQuitacaoTipo {
    private int codTipo;
    private String tipo;

    @Id
    @Column(name = "CodTipo", nullable = false, insertable = true, updatable = true)
    public int getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(int codTipo) {
        this.codTipo = codTipo;
    }

    @Basic
    @Column(name = "Tipo", nullable = true, insertable = true, updatable = true)
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntQuitacaoTipo that = (CntQuitacaoTipo) o;

        if (codTipo != that.codTipo) return false;
        if (tipo != null ? !tipo.equals(that.tipo) : that.tipo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codTipo;
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        return result;
    }
}
