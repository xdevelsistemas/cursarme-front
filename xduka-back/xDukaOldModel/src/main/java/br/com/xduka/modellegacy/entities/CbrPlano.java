package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CbrPlanoPK.class)
public class CbrPlano {
    private long planoId;
    private int codUnidade;
    private int anoLetivo;
    private String plano;
    private Byte quantidadeParcelas;
    private Timestamp dataInício;
//    private List<CbrPlanoParcela> cbrPlanoParcelas;

    @Basic
    @Column(name = "Plano_ID", nullable = false, insertable = true, updatable = true)
    public long getPlanoId() {
        return planoId;
    }

    public void setPlanoId(long planoId) {
        this.planoId = planoId;
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
    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Id
    @Column(name = "Plano", nullable = false, insertable = true, updatable = true)
    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    @Basic
    @Column(name = "QuantidadeParcelas", nullable = true, insertable = true, updatable = true)
    public Byte getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(Byte quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    @Basic
    @Column(name = "DataInício", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataInício() {
        return dataInício;
    }

    public void setDataInício(Timestamp dataInício) {
        this.dataInício = dataInício;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrPlano cbrPlano = (CbrPlano) o;

        if (anoLetivo != cbrPlano.anoLetivo) return false;
        if (codUnidade != cbrPlano.codUnidade) return false;
        if (planoId != cbrPlano.planoId) return false;
        if (dataInício != null ? !dataInício.equals(cbrPlano.dataInício) : cbrPlano.dataInício != null) return false;
        if (plano != null ? !plano.equals(cbrPlano.plano) : cbrPlano.plano != null) return false;
        if (quantidadeParcelas != null ? !quantidadeParcelas.equals(cbrPlano.quantidadeParcelas) : cbrPlano.quantidadeParcelas != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (planoId ^ (planoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + (plano != null ? plano.hashCode() : 0);
        result = 31 * result + (quantidadeParcelas != null ? quantidadeParcelas.hashCode() : 0);
        result = 31 * result + (dataInício != null ? dataInício.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "cbrPlano")
//    public List<CbrPlanoParcela> getCbrPlanoParcelas() {
//        return cbrPlanoParcelas;
//    }
//
//    public void setCbrPlanoParcelas(List<CbrPlanoParcela> cbrPlanoParcelas) {
//        this.cbrPlanoParcelas = cbrPlanoParcelas;
//    }
}
