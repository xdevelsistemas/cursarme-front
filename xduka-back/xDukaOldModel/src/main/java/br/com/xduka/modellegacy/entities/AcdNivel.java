package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdNivelPK.class)
public class AcdNivel {
    private int codUnidade;
    private byte codNível;
    private String nível;
//    private List<AcdPeriodo> acdPeriodos;

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

        AcdNivel acdNivel = (AcdNivel) o;

        if (codNível != acdNivel.codNível) return false;
        if (codUnidade != acdNivel.codUnidade) return false;
        if (nível != null ? !nível.equals(acdNivel.nível) : acdNivel.nível != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) codNível;
        result = 31 * result + (nível != null ? nível.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "acdNivel")
//    public List<AcdPeriodo> getAcdPeriodos() {
//        return acdPeriodos;
//    }
//
//    public void setAcdPeriodos(List<AcdPeriodo> acdPeriodos) {
//        this.acdPeriodos = acdPeriodos;
//    }
}
