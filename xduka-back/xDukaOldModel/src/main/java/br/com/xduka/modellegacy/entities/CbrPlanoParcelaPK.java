package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CbrPlanoParcelaPK implements Serializable {
    private int codUnidade;

    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int anoLetivo;

    @Column(name = "AnoLetivo", nullable = false, insertable = false, updatable = false)
    @Id
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    private String plano;

    @Column(name = "Plano", nullable = false, insertable = false, updatable = false)
    @Id
    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    private byte parcela;

    @Column(name = "Parcela", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getParcela() {
        return parcela;
    }

    public void setParcela(byte parcela) {
        this.parcela = parcela;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrPlanoParcelaPK that = (CbrPlanoParcelaPK) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (parcela != that.parcela) return false;
        if (plano != null ? !plano.equals(that.plano) : that.plano != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + (plano != null ? plano.hashCode() : 0);
        result = 31 * result + (int) parcela;
        return result;
    }
}
