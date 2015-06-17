package models.br.com.xduka.modellegacy;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdPautaFrequenciaMaisPK implements Serializable {


    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
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

    private int codDisciplina;

    @Id
    @javax.persistence.Column(name = "CodDisciplina", nullable = false, insertable = true, updatable = true)
    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    private byte dependência;

    @Id
    @javax.persistence.Column(name = "Dependência", nullable = false, insertable = true, updatable = true)
    public byte getDependência() {
        return dependência;
    }

    public void setDependência(byte dependência) {
        this.dependência = dependência;
    }

    private short bimestre;

    @Id
    @javax.persistence.Column(name = "Bimestre", nullable = false, insertable = true, updatable = true)
    public short getBimestre() {
        return bimestre;
    }

    public void setBimestre(short bimestre) {
        this.bimestre = bimestre;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdPautaFrequenciaMaisPK that = (AcdPautaFrequenciaMaisPK) o;


        if (bimestre != that.bimestre) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codPauta != that.codPauta) return false;
        if (codUnidade != that.codUnidade) return false;
        if (dependência != that.dependência) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade ;
        result = 31 * result + (int) (codPauta ^ (codPauta >>> 32));
        result = 31 * result + codDisciplina;
        result = 31 * result + (int) dependência;
        result = 31 * result + (int) bimestre;

        return result;
    }
}
