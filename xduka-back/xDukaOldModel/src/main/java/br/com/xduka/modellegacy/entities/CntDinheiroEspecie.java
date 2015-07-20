package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "cntDinheiroEspécie", schema = "dbo")
@IdClass(CntDinheiroEspeciePK.class)
public class CntDinheiroEspecie {
    private long dinheiroEspécieId;
    private int codUnidade;
    private byte codDinheiro;
    private String dinheiro;
    private String abreviatura;

    @Basic
    @Column(name = "DinheiroEspécie_ID", nullable = false, insertable = true, updatable = true)
    public long getDinheiroEspécieId() {
        return dinheiroEspécieId;
    }

    public void setDinheiroEspécieId(long dinheiroEspécieId) {
        this.dinheiroEspécieId = dinheiroEspécieId;
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
    @Column(name = "CodDinheiro", nullable = false, insertable = true, updatable = true)
    public byte getCodDinheiro() {
        return codDinheiro;
    }

    public void setCodDinheiro(byte codDinheiro) {
        this.codDinheiro = codDinheiro;
    }

    @Basic
    @Column(name = "Dinheiro", nullable = true, insertable = true, updatable = true)
    public String getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(String dinheiro) {
        this.dinheiro = dinheiro;
    }

    @Basic
    @Column(name = "Abreviatura", nullable = true, insertable = true, updatable = true)
    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntDinheiroEspecie that = (CntDinheiroEspecie) o;

        if (codDinheiro != that.codDinheiro) return false;
        if (codUnidade != that.codUnidade) return false;
        if (dinheiroEspécieId != that.dinheiroEspécieId) return false;
        if (abreviatura != null ? !abreviatura.equals(that.abreviatura) : that.abreviatura != null) return false;
        if (dinheiro != null ? !dinheiro.equals(that.dinheiro) : that.dinheiro != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (dinheiroEspécieId ^ (dinheiroEspécieId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) codDinheiro;
        result = 31 * result + (dinheiro != null ? dinheiro.hashCode() : 0);
        result = 31 * result + (abreviatura != null ? abreviatura.hashCode() : 0);
        return result;
    }
}
