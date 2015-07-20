package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdLinguaEstrangeiraPK.class)
public class AcdLinguaEstrangeira {
    private int codUnidade;
    private byte codLíngua;
    private String línguaEstrangeira;

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodLíngua", nullable = false, insertable = true, updatable = true)
    public byte getCodLíngua() {
        return codLíngua;
    }

    public void setCodLíngua(byte codLíngua) {
        this.codLíngua = codLíngua;
    }

    @Basic
    @Column(name = "LínguaEstrangeira", nullable = true, insertable = true, updatable = true)
    public String getLínguaEstrangeira() {
        return línguaEstrangeira;
    }

    public void setLínguaEstrangeira(String línguaEstrangeira) {
        this.línguaEstrangeira = línguaEstrangeira;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdLinguaEstrangeira that = (AcdLinguaEstrangeira) o;

        if (codLíngua != that.codLíngua) return false;
        if (codUnidade != that.codUnidade) return false;
        if (línguaEstrangeira != null ? !línguaEstrangeira.equals(that.línguaEstrangeira) : that.línguaEstrangeira != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) codLíngua;
        result = 31 * result + (línguaEstrangeira != null ? línguaEstrangeira.hashCode() : 0);
        return result;
    }
}
