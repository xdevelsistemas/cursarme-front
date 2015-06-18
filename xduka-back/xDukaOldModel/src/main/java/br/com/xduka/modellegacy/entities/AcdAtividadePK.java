package br.com.xduka.modellegacy.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class AcdAtividadePK implements Serializable {




    private int anoLetivo;

    @Id
    @javax.persistence.Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codTipo;

    @Id
    @javax.persistence.Column(name = "CodTipo", nullable = false, insertable = true, updatable = true)
    public int getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(int codTipo) {
        this.codTipo = codTipo;
    }

    private int codModalidade;

    @Id
    @javax.persistence.Column(name = "CodModalidade", nullable = false, insertable = true, updatable = true)
    public int getCodModalidade() {
        return codModalidade;
    }

    public void setCodModalidade(int codModalidade) {
        this.codModalidade = codModalidade;
    }

    private long codPauta;

    @Id
    @javax.persistence.Column(name = "CodPauta", nullable = false, insertable = true, updatable = true)
    public long getCodPauta() {
        return codPauta;
    }

    public void setCodPauta(long codPauta) {
        this.codPauta = codPauta;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAtividadePK that = (AcdAtividadePK) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codModalidade != that.codModalidade) return false;
        if (codPauta != that.codPauta) return false;
        if (codTipo != that.codTipo) return false;
        if (codUnidade != that.codUnidade) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result =  anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + codTipo;
        result = 31 * result + codModalidade;
        result = 31 * result + (int) (codPauta ^ (codPauta >>> 32));
        return result;
    }
}
