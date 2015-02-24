package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class CbrMês {
    private int mês;
    private Byte codMês;
    private Short codAno;
    private String mêsDescrição;
    private Timestamp dataLimite;
    private String mêsImpressoraMatricial;
    private boolean cobrançaAtiva;
    private Timestamp dataVencimento;
    private List<CbrAnuidadeMês> cbrAnuidadeMêsesByMês;
    private List<CbrPlanoParcela> cbrPlanoParcelasByMês;

    @Id
    @Column(name = "Mês", nullable = false, insertable = true, updatable = true)
    public int getMês() {
        return mês;
    }

    public void setMês(int mês) {
        this.mês = mês;
    }

    @Basic
    @Column(name = "CodMês", nullable = true, insertable = true, updatable = true)
    public Byte getCodMês() {
        return codMês;
    }

    public void setCodMês(Byte codMês) {
        this.codMês = codMês;
    }

    @Basic
    @Column(name = "CodAno", nullable = true, insertable = true, updatable = true)
    public Short getCodAno() {
        return codAno;
    }

    public void setCodAno(Short codAno) {
        this.codAno = codAno;
    }

    @Basic
    @Column(name = "MêsDescrição", nullable = true, insertable = true, updatable = true)
    public String getMêsDescrição() {
        return mêsDescrição;
    }

    public void setMêsDescrição(String mêsDescrição) {
        this.mêsDescrição = mêsDescrição;
    }

    @Basic
    @Column(name = "DataLimite", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Timestamp dataLimite) {
        this.dataLimite = dataLimite;
    }

    @Basic
    @Column(name = "MêsImpressoraMatricial", nullable = true, insertable = true, updatable = true)
    public String getMêsImpressoraMatricial() {
        return mêsImpressoraMatricial;
    }

    public void setMêsImpressoraMatricial(String mêsImpressoraMatricial) {
        this.mêsImpressoraMatricial = mêsImpressoraMatricial;
    }

    @Basic
    @Column(name = "CobrançaAtiva", nullable = false, insertable = true, updatable = true)
    public boolean isCobrançaAtiva() {
        return cobrançaAtiva;
    }

    public void setCobrançaAtiva(boolean cobrançaAtiva) {
        this.cobrançaAtiva = cobrançaAtiva;
    }

    @Basic
    @Column(name = "DataVencimento", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Timestamp dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrMês cbrMês = (CbrMês) o;

        if (cobrançaAtiva != cbrMês.cobrançaAtiva) return false;
        if (mês != cbrMês.mês) return false;
        if (codAno != null ? !codAno.equals(cbrMês.codAno) : cbrMês.codAno != null) return false;
        if (codMês != null ? !codMês.equals(cbrMês.codMês) : cbrMês.codMês != null) return false;
        if (dataLimite != null ? !dataLimite.equals(cbrMês.dataLimite) : cbrMês.dataLimite != null) return false;
        if (dataVencimento != null ? !dataVencimento.equals(cbrMês.dataVencimento) : cbrMês.dataVencimento != null)
            return false;
        if (mêsDescrição != null ? !mêsDescrição.equals(cbrMês.mêsDescrição) : cbrMês.mêsDescrição != null)
            return false;
        if (mêsImpressoraMatricial != null ? !mêsImpressoraMatricial.equals(cbrMês.mêsImpressoraMatricial) : cbrMês.mêsImpressoraMatricial != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mês;
        result = 31 * result + (codMês != null ? codMês.hashCode() : 0);
        result = 31 * result + (codAno != null ? codAno.hashCode() : 0);
        result = 31 * result + (mêsDescrição != null ? mêsDescrição.hashCode() : 0);
        result = 31 * result + (dataLimite != null ? dataLimite.hashCode() : 0);
        result = 31 * result + (mêsImpressoraMatricial != null ? mêsImpressoraMatricial.hashCode() : 0);
        result = 31 * result + (cobrançaAtiva ? 1 : 0);
        result = 31 * result + (dataVencimento != null ? dataVencimento.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "cbrMêsByMês")
    public List<CbrAnuidadeMês> getCbrAnuidadeMêsesByMês() {
        return cbrAnuidadeMêsesByMês;
    }

    public void setCbrAnuidadeMêsesByMês(List<CbrAnuidadeMês> cbrAnuidadeMêsesByMês) {
        this.cbrAnuidadeMêsesByMês = cbrAnuidadeMêsesByMês;
    }

    @OneToMany(mappedBy = "cbrMêsByMês")
    public List<CbrPlanoParcela> getCbrPlanoParcelasByMês() {
        return cbrPlanoParcelasByMês;
    }

    public void setCbrPlanoParcelasByMês(List<CbrPlanoParcela> cbrPlanoParcelasByMês) {
        this.cbrPlanoParcelasByMês = cbrPlanoParcelasByMês;
    }
}
