package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdAtividadeExtraPK.class)
public class AcdAtividadeExtra {
    private long atividadeExtraId;
    private int anoLetivo;
    private int codUnidade;
    private int codExtra;
    private String extra;

    @Basic
    @Column(name = "AtividadeExtra_ID", nullable = false, insertable = true, updatable = true)
    public long getAtividadeExtraId() {
        return atividadeExtraId;
    }

    public void setAtividadeExtraId(long atividadeExtraId) {
        this.atividadeExtraId = atividadeExtraId;
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
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodExtra", nullable = false, insertable = true, updatable = true)
    public int getCodExtra() {
        return codExtra;
    }

    public void setCodExtra(int codExtra) {
        this.codExtra = codExtra;
    }

    @Basic
    @Column(name = "Extra", nullable = true, insertable = true, updatable = true)
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAtividadeExtra that = (AcdAtividadeExtra) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (atividadeExtraId != that.atividadeExtraId) return false;
        if (codExtra != that.codExtra) return false;
        if (codUnidade != that.codUnidade) return false;
        if (extra != null ? !extra.equals(that.extra) : that.extra != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (atividadeExtraId ^ (atividadeExtraId >>> 32));
        result = 31 * result + anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + codExtra;
        result = 31 * result + (extra != null ? extra.hashCode() : 0);
        return result;
    }
}
