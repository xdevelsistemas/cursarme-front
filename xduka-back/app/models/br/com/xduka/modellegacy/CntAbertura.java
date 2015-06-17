package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class CntAbertura {
    private long aberturaId;
    private int codAbertura;
    private String caixa;
    private Timestamp data;
    private Integer idUsuário;
    private Timestamp dataFechamento;
    private Integer idUsuárioFechamento;
    private boolean finalizado;
    private List<CntAberturaQuitacao> cntAberturaQuitacoes;

    @Basic
    @Column(name = "Abertura_ID", nullable = false, insertable = true, updatable = true)
    public long getAberturaId() {
        return aberturaId;
    }

    public void setAberturaId(long aberturaId) {
        this.aberturaId = aberturaId;
    }

    @Id
    @Column(name = "CodAbertura", nullable = false, insertable = true, updatable = true)
    public int getCodAbertura() {
        return codAbertura;
    }

    public void setCodAbertura(int codAbertura) {
        this.codAbertura = codAbertura;
    }

    @Basic
    @Column(name = "Caixa", nullable = false, insertable = true, updatable = true)
    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        this.caixa = caixa;
    }

    @Basic
    @Column(name = "Data", nullable = true, insertable = true, updatable = true)
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Basic
    @Column(name = "IDUsuário", nullable = true, insertable = true, updatable = true)
    public Integer getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(Integer idUsuário) {
        this.idUsuário = idUsuário;
    }

    @Basic
    @Column(name = "DataFechamento", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Timestamp dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    @Basic
    @Column(name = "IDUsuárioFechamento", nullable = true, insertable = true, updatable = true)
    public Integer getIdUsuárioFechamento() {
        return idUsuárioFechamento;
    }

    public void setIdUsuárioFechamento(Integer idUsuárioFechamento) {
        this.idUsuárioFechamento = idUsuárioFechamento;
    }

    @Basic
    @Column(name = "Finalizado", nullable = false, insertable = true, updatable = true)
    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntAbertura that = (CntAbertura) o;

        if (aberturaId != that.aberturaId) return false;
        if (codAbertura != that.codAbertura) return false;
        if (finalizado != that.finalizado) return false;
        if (caixa != null ? !caixa.equals(that.caixa) : that.caixa != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (dataFechamento != null ? !dataFechamento.equals(that.dataFechamento) : that.dataFechamento != null)
            return false;
        if (idUsuário != null ? !idUsuário.equals(that.idUsuário) : that.idUsuário != null) return false;
        if (idUsuárioFechamento != null ? !idUsuárioFechamento.equals(that.idUsuárioFechamento) : that.idUsuárioFechamento != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (aberturaId ^ (aberturaId >>> 32));
        result = 31 * result + codAbertura;
        result = 31 * result + (caixa != null ? caixa.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (idUsuário != null ? idUsuário.hashCode() : 0);
        result = 31 * result + (dataFechamento != null ? dataFechamento.hashCode() : 0);
        result = 31 * result + (idUsuárioFechamento != null ? idUsuárioFechamento.hashCode() : 0);
        result = 31 * result + (finalizado ? 1 : 0);
        return result;
    }

    @OneToMany(mappedBy = "cntAbertura")
    public List<CntAberturaQuitacao> getCntAberturaQuitacoes() {
        return cntAberturaQuitacoes;
    }

    public void setCntAberturaQuitacoes(List<CntAberturaQuitacao> cntAberturaQuitacoes) {
        this.cntAberturaQuitacoes = cntAberturaQuitacoes;
    }
}
