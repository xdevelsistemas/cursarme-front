package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdPautaDescritivaPK.class)
public class AcdPautaDescritiva {
    private long pautaDescritivaId;
    private int codUnidade;
    private long codPauta;
    private short bimestre;
    private String descrição;
    private Timestamp dataCriação;
    private Timestamp dataModificação;

    @Basic
    @Column(name = "PautaDescritiva_ID", nullable = false, insertable = true, updatable = true)
    public long getPautaDescritivaId() {
        return pautaDescritivaId;
    }

    public void setPautaDescritivaId(long pautaDescritivaId) {
        this.pautaDescritivaId = pautaDescritivaId;
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
    @Column(name = "CodPauta", nullable = false, insertable = true, updatable = true)
    public long getCodPauta() {
        return codPauta;
    }

    public void setCodPauta(long codPauta) {
        this.codPauta = codPauta;
    }

    @Id
    @Column(name = "Bimestre", nullable = false, insertable = true, updatable = true)
    public short getBimestre() {
        return bimestre;
    }

    public void setBimestre(short bimestre) {
        this.bimestre = bimestre;
    }

    @Basic
    @Column(name = "Descrição", nullable = true, insertable = true, updatable = true)
    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    @Basic
    @Column(name = "DataCriação", nullable = false, insertable = true, updatable = true)
    public Timestamp getDataCriação() {
        return dataCriação;
    }

    public void setDataCriação(Timestamp dataCriação) {
        this.dataCriação = dataCriação;
    }

    @Basic
    @Column(name = "DataModificação", nullable = false, insertable = true, updatable = true)
    public Timestamp getDataModificação() {
        return dataModificação;
    }

    public void setDataModificação(Timestamp dataModificação) {
        this.dataModificação = dataModificação;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdPautaDescritiva that = (AcdPautaDescritiva) o;

        if (bimestre != that.bimestre) return false;
        if (codPauta != that.codPauta) return false;
        if (codUnidade != that.codUnidade) return false;
        if (pautaDescritivaId != that.pautaDescritivaId) return false;
        if (dataCriação != null ? !dataCriação.equals(that.dataCriação) : that.dataCriação != null) return false;
        if (dataModificação != null ? !dataModificação.equals(that.dataModificação) : that.dataModificação != null)
            return false;
        if (descrição != null ? !descrição.equals(that.descrição) : that.descrição != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pautaDescritivaId ^ (pautaDescritivaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) (codPauta ^ (codPauta >>> 32));
        result = 31 * result + (int) bimestre;
        result = 31 * result + (descrição != null ? descrição.hashCode() : 0);
        result = 31 * result + (dataCriação != null ? dataCriação.hashCode() : 0);
        result = 31 * result + (dataModificação != null ? dataModificação.hashCode() : 0);
        return result;
    }
}
