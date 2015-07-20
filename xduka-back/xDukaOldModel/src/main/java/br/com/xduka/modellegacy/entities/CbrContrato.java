package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CbrContratoPK.class)
public class CbrContrato {
    private int codUnidade;
    private int anoLetivo;
    private byte codContrato;
    private String parte1;

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Id
    @Column(name = "CodContrato", nullable = false, insertable = true, updatable = true)
    public byte getCodContrato() {
        return codContrato;
    }

    public void setCodContrato(byte codContrato) {
        this.codContrato = codContrato;
    }

    @Basic
    @Column(name = "Parte1", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getParte1() {
        return parte1;
    }

    public void setParte1(String parte1) {
        this.parte1 = parte1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrContrato that = (CbrContrato) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codContrato != that.codContrato) return false;
        if (codUnidade != that.codUnidade) return false;
        if (parte1 != null ? !parte1.equals(that.parte1) : that.parte1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + (int) codContrato;
        result = 31 * result + (parte1 != null ? parte1.hashCode() : 0);
        return result;
    }
}
