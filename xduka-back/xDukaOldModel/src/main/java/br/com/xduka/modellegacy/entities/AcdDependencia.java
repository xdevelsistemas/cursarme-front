package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "acdDependência", schema = "dbo")
@IdClass(AcdDependenciaPK.class)
public class AcdDependencia {
    private long dependênciaId;
    private int codUnidade;
    private byte dependência;
    private String descrição;
    private String descriçãoPlural;
    private boolean boletim;
    private boolean histórico;
    private String descriçãoAbreviada;

    @Basic
    @Column(name = "Dependência_ID", nullable = false, insertable = true, updatable = true)
    public long getDependênciaId() {
        return dependênciaId;
    }

    public void setDependênciaId(long dependênciaId) {
        this.dependênciaId = dependênciaId;
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
    @Column(name = "Dependência", nullable = false, insertable = true, updatable = true)
    public byte getDependência() {
        return dependência;
    }

    public void setDependência(byte dependência) {
        this.dependência = dependência;
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
    @Column(name = "DescriçãoPlural", nullable = true, insertable = true, updatable = true)
    public String getDescriçãoPlural() {
        return descriçãoPlural;
    }

    public void setDescriçãoPlural(String descriçãoPlural) {
        this.descriçãoPlural = descriçãoPlural;
    }

    @Basic
    @Column(name = "Boletim", nullable = false, insertable = true, updatable = true)
    public boolean isBoletim() {
        return boletim;
    }

    public void setBoletim(boolean boletim) {
        this.boletim = boletim;
    }

    @Basic
    @Column(name = "Histórico", nullable = false, insertable = true, updatable = true)
    public boolean isHistórico() {
        return histórico;
    }

    public void setHistórico(boolean histórico) {
        this.histórico = histórico;
    }

    @Basic
    @Column(name = "DescriçãoAbreviada", nullable = true, insertable = true, updatable = true, length = 10)
    public String getDescriçãoAbreviada() {
        return descriçãoAbreviada;
    }

    public void setDescriçãoAbreviada(String descriçãoAbreviada) {
        this.descriçãoAbreviada = descriçãoAbreviada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdDependencia that = (AcdDependencia) o;

        if (boletim != that.boletim) return false;
        if (codUnidade != that.codUnidade) return false;
        if (dependência != that.dependência) return false;
        if (dependênciaId != that.dependênciaId) return false;
        if (histórico != that.histórico) return false;
        if (descrição != null ? !descrição.equals(that.descrição) : that.descrição != null) return false;
        if (descriçãoAbreviada != null ? !descriçãoAbreviada.equals(that.descriçãoAbreviada) : that.descriçãoAbreviada != null)
            return false;
        if (descriçãoPlural != null ? !descriçãoPlural.equals(that.descriçãoPlural) : that.descriçãoPlural != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (dependênciaId ^ (dependênciaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) dependência;
        result = 31 * result + (descrição != null ? descrição.hashCode() : 0);
        result = 31 * result + (descriçãoPlural != null ? descriçãoPlural.hashCode() : 0);
        result = 31 * result + (boletim ? 1 : 0);
        result = 31 * result + (histórico ? 1 : 0);
        result = 31 * result + (descriçãoAbreviada != null ? descriçãoAbreviada.hashCode() : 0);
        return result;
    }
}
