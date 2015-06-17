package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "cntRelacionamentoEndereço", schema = "dbo")
@IdClass(CntRelacionamentoEnderecoPK.class)
public class CntRelacionamentoEndereco {
    private long relacionamentoEndereçoId;
    private int codUnidade;
    private int codRelacionamento;
    private int índice;
    private String endereço;
    private String bairro;
    private Integer codCidade;
    private String cep;
    private boolean correspondência;
    private Integer codTipoLocal;
    private boolean cobrança;
    private CntCidade cntCidade;
    private CntTipoLocal cntTipoLocal;

    @Basic
    @Column(name = "RelacionamentoEndereço_ID", nullable = false, insertable = true, updatable = true)
    public long getRelacionamentoEndereçoId() {
        return relacionamentoEndereçoId;
    }

    public void setRelacionamentoEndereçoId(long relacionamentoEndereçoId) {
        this.relacionamentoEndereçoId = relacionamentoEndereçoId;
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
    @Column(name = "CodRelacionamento", nullable = false, insertable = true, updatable = true)
    public int getCodRelacionamento() {
        return codRelacionamento;
    }

    public void setCodRelacionamento(int codRelacionamento) {
        this.codRelacionamento = codRelacionamento;
    }

    @Id
    @Column(name = "Índice", nullable = false, insertable = true, updatable = true)
    public int getÍndice() {
        return índice;
    }

    public void setÍndice(int índice) {
        this.índice = índice;
    }

    @Basic
    @Column(name = "Endereço", nullable = true, insertable = true, updatable = true)
    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    @Basic
    @Column(name = "Bairro", nullable = true, insertable = true, updatable = true)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Basic
    @Column(name = "CodCidade", nullable = true, insertable = true, updatable = true)
    public Integer getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(Integer codCidade) {
        this.codCidade = codCidade;
    }

    @Basic
    @Column(name = "CEP", nullable = true, insertable = true, updatable = true)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Basic
    @Column(name = "Correspondência", nullable = false, insertable = true, updatable = true)
    public boolean isCorrespondência() {
        return correspondência;
    }

    public void setCorrespondência(boolean correspondência) {
        this.correspondência = correspondência;
    }

    @Basic
    @Column(name = "CodTipoLocal", nullable = true, insertable = true, updatable = true)
    public Integer getCodTipoLocal() {
        return codTipoLocal;
    }

    public void setCodTipoLocal(Integer codTipoLocal) {
        this.codTipoLocal = codTipoLocal;
    }

    @Basic
    @Column(name = "Cobrança", nullable = false, insertable = true, updatable = true)
    public boolean isCobrança() {
        return cobrança;
    }

    public void setCobrança(boolean cobrança) {
        this.cobrança = cobrança;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntRelacionamentoEndereco that = (CntRelacionamentoEndereco) o;

        if (cobrança != that.cobrança) return false;
        if (codRelacionamento != that.codRelacionamento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (correspondência != that.correspondência) return false;
        if (relacionamentoEndereçoId != that.relacionamentoEndereçoId) return false;
        if (índice != that.índice) return false;
        if (bairro != null ? !bairro.equals(that.bairro) : that.bairro != null) return false;
        if (cep != null ? !cep.equals(that.cep) : that.cep != null) return false;
        if (codCidade != null ? !codCidade.equals(that.codCidade) : that.codCidade != null) return false;
        if (codTipoLocal != null ? !codTipoLocal.equals(that.codTipoLocal) : that.codTipoLocal != null) return false;
        if (endereço != null ? !endereço.equals(that.endereço) : that.endereço != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (relacionamentoEndereçoId ^ (relacionamentoEndereçoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codRelacionamento;
        result = 31 * result + índice;
        result = 31 * result + (endereço != null ? endereço.hashCode() : 0);
        result = 31 * result + (bairro != null ? bairro.hashCode() : 0);
        result = 31 * result + (codCidade != null ? codCidade.hashCode() : 0);
        result = 31 * result + (cep != null ? cep.hashCode() : 0);
        result = 31 * result + (correspondência ? 1 : 0);
        result = 31 * result + (codTipoLocal != null ? codTipoLocal.hashCode() : 0);
        result = 31 * result + (cobrança ? 1 : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodCidade", referencedColumnName = "CodCidade" , nullable = false)})
    public CntCidade getCntCidade() {
        return cntCidade;
    }

    public void setCntCidade(CntCidade cntCidade) {
        this.cntCidade = cntCidade;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodTipoLocal", referencedColumnName = "CodTipoLocal", nullable = false)})
    public CntTipoLocal getCntTipoLocal() {
        return cntTipoLocal;
    }

    public void setCntTipoLocal(CntTipoLocal cntTipoLocal) {
        this.cntTipoLocal = cntTipoLocal;
    }
}
