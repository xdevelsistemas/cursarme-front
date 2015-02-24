package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdNívelPK.class)
public class AcdNível {
    private int codUnidade;
    private byte codNível;
    private String nível;
    private List<AcdPeríodo> acdPeríodos;

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodNível", nullable = false, insertable = true, updatable = true)
    public byte getCodNível() {
        return codNível;
    }

    public void setCodNível(byte codNível) {
        this.codNível = codNível;
    }

    @Basic
    @Column(name = "Nível", nullable = true, insertable = true, updatable = true)
    public String getNível() {
        return nível;
    }

    public void setNível(String nível) {
        this.nível = nível;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdNível acdNível = (AcdNível) o;

        if (codNível != acdNível.codNível) return false;
        if (codUnidade != acdNível.codUnidade) return false;
        if (nível != null ? !nível.equals(acdNível.nível) : acdNível.nível != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) codNível;
        result = 31 * result + (nível != null ? nível.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "acdNível")
    public List<AcdPeríodo> getAcdPeríodos() {
        return acdPeríodos;
    }

    public void setAcdPeríodos(List<AcdPeríodo> acdPeríodos) {
        this.acdPeríodos = acdPeríodos;
    }
}
