package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CbrDiferencaMesPK.class)
public class CbrDiferencaMes {
    private long diferençaMêsId;
    private int codUnidade;
    private long codMovimento;
    private int codDiferença;
    private int mês;
    private BigDecimal valor;
    private CbrDiferenca cbrDiferenca;

    @Basic
    @Column(name = "DiferençaMês_ID", nullable = false, insertable = true, updatable = true)
    public long getDiferençaMêsId() {
        return diferençaMêsId;
    }

    public void setDiferençaMêsId(long diferençaMêsId) {
        this.diferençaMêsId = diferençaMêsId;
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
    @Column(name = "CodMovimento", nullable = false, insertable = true, updatable = true)
    public long getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(long codMovimento) {
        this.codMovimento = codMovimento;
    }

    @Id
    @Column(name = "CodDiferença", nullable = false, insertable = true, updatable = true)
    public int getCodDiferença() {
        return codDiferença;
    }

    public void setCodDiferença(int codDiferença) {
        this.codDiferença = codDiferença;
    }

    @Id
    @Column(name = "Mês", nullable = false, insertable = true, updatable = true)
    public int getMês() {
        return mês;
    }

    public void setMês(int mês) {
        this.mês = mês;
    }

    @Basic
    @Column(name = "Valor", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrDiferencaMes that = (CbrDiferencaMes) o;

        if (codDiferença != that.codDiferença) return false;
        if (codMovimento != that.codMovimento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (diferençaMêsId != that.diferençaMêsId) return false;
        if (mês != that.mês) return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (diferençaMêsId ^ (diferençaMêsId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) (codMovimento ^ (codMovimento >>> 32));
        result = 31 * result + codDiferença;
        result = 31 * result + mês;
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodMovimento", referencedColumnName = "CodMovimento", nullable = false), @JoinColumn(name = "CodDiferença", referencedColumnName = "CodDiferença", nullable = false)})
    public CbrDiferenca getCbrDiferenca() {
        return cbrDiferenca;
    }

    public void setCbrDiferenca(CbrDiferenca cbrDiferenca) {
        this.cbrDiferenca = cbrDiferenca;
    }
}
