package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntCidadePK.class)
public class CntCidade {
    private long cidadeId;
    private int codUnidade;
    private int codCidade;
    private String cidade;
    private String uf;
    private String prefeito;
    private String cpf;
    private String rg;
    private Timestamp rgExpedidoData;
    private String rgExpedidoPor;
    private String mecUf;
    private String mecMunicípio;
    private List<CntRelacionamentoEndereco> cntRelacionamentoEnderecos;

    @Basic
    @Column(name = "Cidade_ID", nullable = false, insertable = true, updatable = true)
    public long getCidadeId() {
        return cidadeId;
    }

    public void setCidadeId(long cidadeId) {
        this.cidadeId = cidadeId;
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
    @Column(name = "CodCidade", nullable = false, insertable = true, updatable = true)
    public int getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(int codCidade) {
        this.codCidade = codCidade;
    }

    @Basic
    @Column(name = "Cidade", nullable = true, insertable = true, updatable = true)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Basic
    @Column(name = "UF", nullable = true, insertable = true, updatable = true)
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Basic
    @Column(name = "Prefeito", nullable = true, insertable = true, updatable = true)
    public String getPrefeito() {
        return prefeito;
    }

    public void setPrefeito(String prefeito) {
        this.prefeito = prefeito;
    }

    @Basic
    @Column(name = "CPF", nullable = true, insertable = true, updatable = true)
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Basic
    @Column(name = "RG", nullable = true, insertable = true, updatable = true)
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Basic
    @Column(name = "RGExpedidoData", nullable = true, insertable = true, updatable = true)
    public Timestamp getRgExpedidoData() {
        return rgExpedidoData;
    }

    public void setRgExpedidoData(Timestamp rgExpedidoData) {
        this.rgExpedidoData = rgExpedidoData;
    }

    @Basic
    @Column(name = "RGExpedidoPor", nullable = true, insertable = true, updatable = true)
    public String getRgExpedidoPor() {
        return rgExpedidoPor;
    }

    public void setRgExpedidoPor(String rgExpedidoPor) {
        this.rgExpedidoPor = rgExpedidoPor;
    }

    @Basic
    @Column(name = "MEC_UF", nullable = true, insertable = true, updatable = true)
    public String getMecUf() {
        return mecUf;
    }

    public void setMecUf(String mecUf) {
        this.mecUf = mecUf;
    }

    @Basic
    @Column(name = "MEC_Município", nullable = true, insertable = true, updatable = true)
    public String getMecMunicípio() {
        return mecMunicípio;
    }

    public void setMecMunicípio(String mecMunicípio) {
        this.mecMunicípio = mecMunicípio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntCidade cntCidade = (CntCidade) o;

        if (cidadeId != cntCidade.cidadeId) return false;
        if (codCidade != cntCidade.codCidade) return false;
        if (codUnidade != cntCidade.codUnidade) return false;
        if (cidade != null ? !cidade.equals(cntCidade.cidade) : cntCidade.cidade != null) return false;
        if (cpf != null ? !cpf.equals(cntCidade.cpf) : cntCidade.cpf != null) return false;
        if (mecMunicípio != null ? !mecMunicípio.equals(cntCidade.mecMunicípio) : cntCidade.mecMunicípio != null)
            return false;
        if (mecUf != null ? !mecUf.equals(cntCidade.mecUf) : cntCidade.mecUf != null) return false;
        if (prefeito != null ? !prefeito.equals(cntCidade.prefeito) : cntCidade.prefeito != null) return false;
        if (rg != null ? !rg.equals(cntCidade.rg) : cntCidade.rg != null) return false;
        if (rgExpedidoData != null ? !rgExpedidoData.equals(cntCidade.rgExpedidoData) : cntCidade.rgExpedidoData != null)
            return false;
        if (rgExpedidoPor != null ? !rgExpedidoPor.equals(cntCidade.rgExpedidoPor) : cntCidade.rgExpedidoPor != null)
            return false;
        if (uf != null ? !uf.equals(cntCidade.uf) : cntCidade.uf != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cidadeId ^ (cidadeId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codCidade;
        result = 31 * result + (cidade != null ? cidade.hashCode() : 0);
        result = 31 * result + (uf != null ? uf.hashCode() : 0);
        result = 31 * result + (prefeito != null ? prefeito.hashCode() : 0);
        result = 31 * result + (cpf != null ? cpf.hashCode() : 0);
        result = 31 * result + (rg != null ? rg.hashCode() : 0);
        result = 31 * result + (rgExpedidoData != null ? rgExpedidoData.hashCode() : 0);
        result = 31 * result + (rgExpedidoPor != null ? rgExpedidoPor.hashCode() : 0);
        result = 31 * result + (mecUf != null ? mecUf.hashCode() : 0);
        result = 31 * result + (mecMunicípio != null ? mecMunicípio.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "cntCidade")
    public List<CntRelacionamentoEndereco> getCntRelacionamentoEnderecos() {
        return cntRelacionamentoEnderecos;
    }

    public void setCntRelacionamentoEnderecos(List<CntRelacionamentoEndereco> cntRelacionamentoEnderecos) {
        this.cntRelacionamentoEnderecos = cntRelacionamentoEnderecos;
    }
}
