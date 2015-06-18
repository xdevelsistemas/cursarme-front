package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdBimestrePK.class)
public class AcdBimestre {
    private long bimestreId;
    private int codunidade;
    private int anoLetivo;
    private short bimestre;
    private String bimestreNome;

    @Basic
    @Column(name = "Bimestre_ID", nullable = false, insertable = true, updatable = true)
    public long getBimestreId() {
        return bimestreId;
    }

    public void setBimestreId(long bimestreId) {
        this.bimestreId = bimestreId;
    }

    @Id
    @Column(name = "Codunidade", nullable = false, insertable = true, updatable = true)
    public int getCodunidade() {
        return codunidade;
    }

    public void setCodunidade(int codunidade) {
        this.codunidade = codunidade;
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
    @Column(name = "Bimestre", nullable = false, insertable = true, updatable = true)
    public short getBimestre() {
        return bimestre;
    }

    public void setBimestre(short bimestre) {
        this.bimestre = bimestre;
    }

    @Basic
    @Column(name = "BimestreNome", nullable = false, insertable = true, updatable = true)
    public String getBimestreNome() {
        return bimestreNome;
    }

    public void setBimestreNome(String bimestreNome) {
        this.bimestreNome = bimestreNome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdBimestre that = (AcdBimestre) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (bimestre != that.bimestre) return false;
        if (bimestreId != that.bimestreId) return false;
        if (codunidade != that.codunidade) return false;
        if (bimestreNome != null ? !bimestreNome.equals(that.bimestreNome) : that.bimestreNome != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (bimestreId ^ (bimestreId >>> 32));
        result = 31 * result + codunidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + (int) bimestre;
        result = 31 * result + (bimestreNome != null ? bimestreNome.hashCode() : 0);
        return result;
    }
}
