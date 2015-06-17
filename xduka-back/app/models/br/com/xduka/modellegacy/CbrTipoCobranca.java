package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CbrTipoCobrancaPK.class)
public class CbrTipoCobranca {
    private long tipoCobrançaId;
    private int codUnidade;
    private int codTipoCobrança;
    private String tipoCobrança;
    private Integer codConta;
    private Integer codTipoOrigem;
    private boolean administrativo;
    private Double valorMínimo;
    private String tipoDescrição;
    private boolean notaPromissória;
    private Integer quantidadeParcelas;
    private Double valorParcela;
    private Integer codCaixa;
    private Timestamp vencimento;
    private boolean nãoCobrar;
    private Long codContaContabil;
    private Long codPessoa;

    @Basic
    @Column(name = "TipoCobrança_ID", nullable = false, insertable = true, updatable = true)
    public long getTipoCobrançaId() {
        return tipoCobrançaId;
    }

    public void setTipoCobrançaId(long tipoCobrançaId) {
        this.tipoCobrançaId = tipoCobrançaId;
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
    @Column(name = "CodTipoCobrança", nullable = false, insertable = true, updatable = true)
    public int getCodTipoCobrança() {
        return codTipoCobrança;
    }

    public void setCodTipoCobrança(int codTipoCobrança) {
        this.codTipoCobrança = codTipoCobrança;
    }

    @Basic
    @Column(name = "TipoCobrança", nullable = true, insertable = true, updatable = true)
    public String getTipoCobrança() {
        return tipoCobrança;
    }

    public void setTipoCobrança(String tipoCobrança) {
        this.tipoCobrança = tipoCobrança;
    }

    @Basic
    @Column(name = "CodConta", nullable = true, insertable = true, updatable = true)
    public Integer getCodConta() {
        return codConta;
    }

    public void setCodConta(Integer codConta) {
        this.codConta = codConta;
    }

    @Basic
    @Column(name = "CodTipoOrigem", nullable = true, insertable = true, updatable = true)
    public Integer getCodTipoOrigem() {
        return codTipoOrigem;
    }

    public void setCodTipoOrigem(Integer codTipoOrigem) {
        this.codTipoOrigem = codTipoOrigem;
    }

    @Basic
    @Column(name = "Administrativo", nullable = false, insertable = true, updatable = true)
    public boolean isAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(boolean administrativo) {
        this.administrativo = administrativo;
    }

    @Basic
    @Column(name = "ValorMínimo", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getValorMínimo() {
        return valorMínimo;
    }

    public void setValorMínimo(Double valorMínimo) {
        this.valorMínimo = valorMínimo;
    }

    @Basic
    @Column(name = "TipoDescrição", nullable = true, insertable = true, updatable = true)
    public String getTipoDescrição() {
        return tipoDescrição;
    }

    public void setTipoDescrição(String tipoDescrição) {
        this.tipoDescrição = tipoDescrição;
    }

    @Basic
    @Column(name = "NotaPromissória", nullable = false, insertable = true, updatable = true)
    public boolean isNotaPromissória() {
        return notaPromissória;
    }

    public void setNotaPromissória(boolean notaPromissória) {
        this.notaPromissória = notaPromissória;
    }

    @Basic
    @Column(name = "QuantidadeParcelas", nullable = true, insertable = true, updatable = true)
    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(Integer quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    @Basic
    @Column(name = "ValorParcela", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Basic
    @Column(name = "CodCaixa", nullable = true, insertable = true, updatable = true)
    public Integer getCodCaixa() {
        return codCaixa;
    }

    public void setCodCaixa(Integer codCaixa) {
        this.codCaixa = codCaixa;
    }

    @Basic
    @Column(name = "Vencimento", nullable = true, insertable = true, updatable = true)
    public Timestamp getVencimento() {
        return vencimento;
    }

    public void setVencimento(Timestamp vencimento) {
        this.vencimento = vencimento;
    }

    @Basic
    @Column(name = "NãoCobrar", nullable = false, insertable = true, updatable = true)
    public boolean isNãoCobrar() {
        return nãoCobrar;
    }

    public void setNãoCobrar(boolean nãoCobrar) {
        this.nãoCobrar = nãoCobrar;
    }

    @Basic
    @Column(name = "CodContaContabil", nullable = true, insertable = true, updatable = true)
    public Long getCodContaContabil() {
        return codContaContabil;
    }

    public void setCodContaContabil(Long codContaContabil) {
        this.codContaContabil = codContaContabil;
    }

    @Basic
    @Column(name = "CodPessoa", nullable = true, insertable = true, updatable = true)
    public Long getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(Long codPessoa) {
        this.codPessoa = codPessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrTipoCobranca that = (CbrTipoCobranca) o;

        if (administrativo != that.administrativo) return false;
        if (codTipoCobrança != that.codTipoCobrança) return false;
        if (codUnidade != that.codUnidade) return false;
        if (notaPromissória != that.notaPromissória) return false;
        if (nãoCobrar != that.nãoCobrar) return false;
        if (tipoCobrançaId != that.tipoCobrançaId) return false;
        if (codCaixa != null ? !codCaixa.equals(that.codCaixa) : that.codCaixa != null) return false;
        if (codConta != null ? !codConta.equals(that.codConta) : that.codConta != null) return false;
        if (codContaContabil != null ? !codContaContabil.equals(that.codContaContabil) : that.codContaContabil != null)
            return false;
        if (codPessoa != null ? !codPessoa.equals(that.codPessoa) : that.codPessoa != null) return false;
        if (codTipoOrigem != null ? !codTipoOrigem.equals(that.codTipoOrigem) : that.codTipoOrigem != null)
            return false;
        if (quantidadeParcelas != null ? !quantidadeParcelas.equals(that.quantidadeParcelas) : that.quantidadeParcelas != null)
            return false;
        if (tipoCobrança != null ? !tipoCobrança.equals(that.tipoCobrança) : that.tipoCobrança != null) return false;
        if (tipoDescrição != null ? !tipoDescrição.equals(that.tipoDescrição) : that.tipoDescrição != null)
            return false;
        if (valorMínimo != null ? !valorMínimo.equals(that.valorMínimo) : that.valorMínimo != null) return false;
        if (valorParcela != null ? !valorParcela.equals(that.valorParcela) : that.valorParcela != null) return false;
        if (vencimento != null ? !vencimento.equals(that.vencimento) : that.vencimento != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (tipoCobrançaId ^ (tipoCobrançaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codTipoCobrança;
        result = 31 * result + (tipoCobrança != null ? tipoCobrança.hashCode() : 0);
        result = 31 * result + (codConta != null ? codConta.hashCode() : 0);
        result = 31 * result + (codTipoOrigem != null ? codTipoOrigem.hashCode() : 0);
        result = 31 * result + (administrativo ? 1 : 0);
        result = 31 * result + (valorMínimo != null ? valorMínimo.hashCode() : 0);
        result = 31 * result + (tipoDescrição != null ? tipoDescrição.hashCode() : 0);
        result = 31 * result + (notaPromissória ? 1 : 0);
        result = 31 * result + (quantidadeParcelas != null ? quantidadeParcelas.hashCode() : 0);
        result = 31 * result + (valorParcela != null ? valorParcela.hashCode() : 0);
        result = 31 * result + (codCaixa != null ? codCaixa.hashCode() : 0);
        result = 31 * result + (vencimento != null ? vencimento.hashCode() : 0);
        result = 31 * result + (nãoCobrar ? 1 : 0);
        result = 31 * result + (codContaContabil != null ? codContaContabil.hashCode() : 0);
        result = 31 * result + (codPessoa != null ? codPessoa.hashCode() : 0);
        return result;
    }
}
