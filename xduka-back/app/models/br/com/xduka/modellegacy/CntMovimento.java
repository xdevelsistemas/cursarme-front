package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntMovimentoPK.class)
public class CntMovimento {
    private long movimentoId;

    @Basic
    @javax.persistence.Column(name = "Movimento_ID", nullable = false, insertable = true, updatable = true)
    public long getMovimentoId() {
        return movimentoId;
    }

    public void setMovimentoId(long movimentoId) {
        this.movimentoId = movimentoId;
    }

    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private long codMovimento;

    @Id
    @javax.persistence.Column(name = "CodMovimento", nullable = false, insertable = true, updatable = true)
    public long getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(long codMovimento) {
        this.codMovimento = codMovimento;
    }

    private Integer codConta;

    @Basic
    @javax.persistence.Column(name = "CodConta", nullable = true, insertable = true, updatable = true)
    public Integer getCodConta() {
        return codConta;
    }

    public void setCodConta(Integer codConta) {
        this.codConta = codConta;
    }

    private String codDepartamento;

    @Basic
    @javax.persistence.Column(name = "CodDepartamento", nullable = true, insertable = true, updatable = true)
    public String getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(String codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    private int codRelacionamento;

    @Basic
    @javax.persistence.Column(name = "CodRelacionamento", nullable = false, insertable = true, updatable = true)
    public int getCodRelacionamento() {
        return codRelacionamento;
    }

    public void setCodRelacionamento(int codRelacionamento) {
        this.codRelacionamento = codRelacionamento;
    }

    private int anoLetivo;

    @Basic
    @javax.persistence.Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    private int matrícula;

    @Basic
    @javax.persistence.Column(name = "Matrícula", nullable = false, insertable = true, updatable = true)
    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }

    private long codPauta;

    @Basic
    @javax.persistence.Column(name = "CodPauta", nullable = false, insertable = true, updatable = true)
    public long getCodPauta() {
        return codPauta;
    }

    public void setCodPauta(long codPauta) {
        this.codPauta = codPauta;
    }

    private String notaFiscal;

    @Basic
    @javax.persistence.Column(name = "NotaFiscal", nullable = true, insertable = true, updatable = true)
    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    private Timestamp dataMovimento;

    @Basic
    @javax.persistence.Column(name = "DataMovimento", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Timestamp dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    private String histórico;

    @Basic
    @javax.persistence.Column(name = "Histórico", nullable = true, insertable = true, updatable = true)
    public String getHistórico() {
        return histórico;
    }

    public void setHistórico(String histórico) {
        this.histórico = histórico;
    }

    private Short númeroParcela;

    @Basic
    @javax.persistence.Column(name = "NúmeroParcela", nullable = true, insertable = true, updatable = true)
    public Short getNúmeroParcela() {
        return númeroParcela;
    }

    public void setNúmeroParcela(Short númeroParcela) {
        this.númeroParcela = númeroParcela;
    }

    private Boolean parcelaVista;

    @Basic
    @javax.persistence.Column(name = "ParcelaVista", nullable = true, insertable = true, updatable = true)
    public Boolean getParcelaVista() {
        return parcelaVista;
    }

    public void setParcelaVista(Boolean parcelaVista) {
        this.parcelaVista = parcelaVista;
    }

    private BigDecimal percentualEntrada;

    @Basic
    @javax.persistence.Column(name = "PercentualEntrada", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPercentualEntrada() {
        return percentualEntrada;
    }

    public void setPercentualEntrada(BigDecimal percentualEntrada) {
        this.percentualEntrada = percentualEntrada;
    }

    private BigDecimal percentualJuros;

    @Basic
    @javax.persistence.Column(name = "PercentualJuros", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPercentualJuros() {
        return percentualJuros;
    }

    public void setPercentualJuros(BigDecimal percentualJuros) {
        this.percentualJuros = percentualJuros;
    }

    private BigDecimal valorBruto;

    @Basic
    @javax.persistence.Column(name = "ValorBruto", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(BigDecimal valorBruto) {
        this.valorBruto = valorBruto;
    }

    private BigDecimal valorEntrada;

    @Basic
    @javax.persistence.Column(name = "ValorEntrada", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(BigDecimal valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    private BigDecimal valorFinanciado;

    @Basic
    @javax.persistence.Column(name = "ValorFinanciado", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorFinanciado() {
        return valorFinanciado;
    }

    public void setValorFinanciado(BigDecimal valorFinanciado) {
        this.valorFinanciado = valorFinanciado;
    }

    private BigDecimal valorLíquido;

    @Basic
    @javax.persistence.Column(name = "ValorLíquido", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorLíquido() {
        return valorLíquido;
    }

    public void setValorLíquido(BigDecimal valorLíquido) {
        this.valorLíquido = valorLíquido;
    }

    private BigDecimal valorParcela;

    @Basic
    @javax.persistence.Column(name = "ValorParcela", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(BigDecimal valorParcela) {
        this.valorParcela = valorParcela;
    }

    private Timestamp vencimento;

    @Basic
    @javax.persistence.Column(name = "Vencimento", nullable = true, insertable = true, updatable = true)
    public Timestamp getVencimento() {
        return vencimento;
    }

    public void setVencimento(Timestamp vencimento) {
        this.vencimento = vencimento;
    }

    private Byte movimentoTipo;

    @Basic
    @javax.persistence.Column(name = "MovimentoTipo", nullable = true, insertable = true, updatable = true)
    public Byte getMovimentoTipo() {
        return movimentoTipo;
    }

    public void setMovimentoTipo(Byte movimentoTipo) {
        this.movimentoTipo = movimentoTipo;
    }

    private Integer codTipoCobrança;

    @Basic
    @javax.persistence.Column(name = "CodTipoCobrança", nullable = true, insertable = true, updatable = true)
    public Integer getCodTipoCobrança() {
        return codTipoCobrança;
    }

    public void setCodTipoCobrança(Integer codTipoCobrança) {
        this.codTipoCobrança = codTipoCobrança;
    }

    private Integer codUsuário;

    @Basic
    @javax.persistence.Column(name = "CodUsuário", nullable = true, insertable = true, updatable = true)
    public Integer getCodUsuário() {
        return codUsuário;
    }

    public void setCodUsuário(Integer codUsuário) {
        this.codUsuário = codUsuário;
    }

    private Integer codCotação;

    @Basic
    @javax.persistence.Column(name = "CodCotação", nullable = true, insertable = true, updatable = true)
    public Integer getCodCotação() {
        return codCotação;
    }

    public void setCodCotação(Integer codCotação) {
        this.codCotação = codCotação;
    }

    private String observação;

    @Basic
    @javax.persistence.Column(name = "Observação", nullable = true, insertable = true, updatable = true)
    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

    private Short prazoEntrega;

    @Basic
    @javax.persistence.Column(name = "PrazoEntrega", nullable = true, insertable = true, updatable = true)
    public Short getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(Short prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    private Integer codComissionado;

    @Basic
    @javax.persistence.Column(name = "CodComissionado", nullable = true, insertable = true, updatable = true)
    public Integer getCodComissionado() {
        return codComissionado;
    }

    public void setCodComissionado(Integer codComissionado) {
        this.codComissionado = codComissionado;
    }

    private Double comissão;

    @Basic
    @javax.persistence.Column(name = "Comissão", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getComissão() {
        return comissão;
    }

    public void setComissão(Double comissão) {
        this.comissão = comissão;
    }

    private Boolean nãoImprimirJuros;

    @Basic
    @javax.persistence.Column(name = "NãoImprimirJuros", nullable = true, insertable = true, updatable = true)
    public Boolean getNãoImprimirJuros() {
        return nãoImprimirJuros;
    }

    public void setNãoImprimirJuros(Boolean nãoImprimirJuros) {
        this.nãoImprimirJuros = nãoImprimirJuros;
    }

    private Boolean automáticoMorto;

    @Basic
    @javax.persistence.Column(name = "AutomáticoMorto", nullable = true, insertable = true, updatable = true)
    public Boolean getAutomáticoMorto() {
        return automáticoMorto;
    }

    public void setAutomáticoMorto(Boolean automáticoMorto) {
        this.automáticoMorto = automáticoMorto;
    }

    private Double comissãoAgência;

    @Basic
    @javax.persistence.Column(name = "ComissãoAgência", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getComissãoAgência() {
        return comissãoAgência;
    }

    public void setComissãoAgência(Double comissãoAgência) {
        this.comissãoAgência = comissãoAgência;
    }

    private boolean produtoEntregue;

    @Basic
    @javax.persistence.Column(name = "ProdutoEntregue", nullable = false, insertable = true, updatable = true)
    public boolean isProdutoEntregue() {
        return produtoEntregue;
    }

    public void setProdutoEntregue(boolean produtoEntregue) {
        this.produtoEntregue = produtoEntregue;
    }

    private boolean afDiferença;

    @Basic
    @javax.persistence.Column(name = "AFDiferença", nullable = false, insertable = true, updatable = true)
    public boolean isAfDiferença() {
        return afDiferença;
    }

    public void setAfDiferença(boolean afDiferença) {
        this.afDiferença = afDiferença;
    }

    private int ultimoCodDiferença;

    @Basic
    @javax.persistence.Column(name = "UltimoCodDiferença", nullable = false, insertable = true, updatable = true)
    public int getUltimoCodDiferença() {
        return ultimoCodDiferença;
    }

    public void setUltimoCodDiferença(int ultimoCodDiferença) {
        this.ultimoCodDiferença = ultimoCodDiferença;
    }

    private String plano;

    @Basic
    @javax.persistence.Column(name = "Plano", nullable = true, insertable = true, updatable = true)
    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    private Byte codAnuidade;

    @Basic
    @javax.persistence.Column(name = "CodAnuidade", nullable = true, insertable = true, updatable = true)
    public Byte getCodAnuidade() {
        return codAnuidade;
    }

    public void setCodAnuidade(Byte codAnuidade) {
        this.codAnuidade = codAnuidade;
    }

    private Integer codCaixa;

    @Basic
    @javax.persistence.Column(name = "CodCaixa", nullable = true, insertable = true, updatable = true)
    public Integer getCodCaixa() {
        return codCaixa;
    }

    public void setCodCaixa(Integer codCaixa) {
        this.codCaixa = codCaixa;
    }

    private byte[] cts;

    @Basic
    @javax.persistence.Column(name = "CTS", nullable = true, insertable = true, updatable = true)
    public byte[] getCts() {
        return cts;
    }

    public void setCts(byte[] cts) {
        this.cts = cts;
    }

    private Integer númeroCarnet;

    @Basic
    @javax.persistence.Column(name = "NúmeroCarnet", nullable = true, insertable = true, updatable = true)
    public Integer getNúmeroCarnet() {
        return númeroCarnet;
    }

    public void setNúmeroCarnet(Integer númeroCarnet) {
        this.númeroCarnet = númeroCarnet;
    }

    private Long codMovimentoCobrança;

    @Basic
    @javax.persistence.Column(name = "CodMovimentoCobrança", nullable = true, insertable = true, updatable = true)
    public Long getCodMovimentoCobrança() {
        return codMovimentoCobrança;
    }

    public void setCodMovimentoCobrança(Long codMovimentoCobrança) {
        this.codMovimentoCobrança = codMovimentoCobrança;
    }

    private Integer diaVencimento;

    @Basic
    @javax.persistence.Column(name = "DiaVencimento", nullable = true, insertable = true, updatable = true)
    public Integer getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(Integer diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    private Integer diaLimite;

    @Basic
    @javax.persistence.Column(name = "DiaLimite", nullable = true, insertable = true, updatable = true)
    public Integer getDiaLimite() {
        return diaLimite;
    }

    public void setDiaLimite(Integer diaLimite) {
        this.diaLimite = diaLimite;
    }

    private String mensagemSacado;

    @Basic
    @javax.persistence.Column(name = "MensagemSacado", nullable = true, insertable = true, updatable = true)
    public String getMensagemSacado() {
        return mensagemSacado;
    }

    public void setMensagemSacado(String mensagemSacado) {
        this.mensagemSacado = mensagemSacado;
    }

    private String mensagemAtraso;

    @Basic
    @javax.persistence.Column(name = "MensagemAtraso", nullable = true, insertable = true, updatable = true)
    public String getMensagemAtraso() {
        return mensagemAtraso;
    }

    public void setMensagemAtraso(String mensagemAtraso) {
        this.mensagemAtraso = mensagemAtraso;
    }

    private String mensagemCompensação;

    @Basic
    @javax.persistence.Column(name = "MensagemCompensação", nullable = true, insertable = true, updatable = true)
    public String getMensagemCompensação() {
        return mensagemCompensação;
    }

    public void setMensagemCompensação(String mensagemCompensação) {
        this.mensagemCompensação = mensagemCompensação;
    }

    private String contrato;

    @Basic
    @javax.persistence.Column(name = "Contrato", nullable = true, insertable = true, updatable = true)
    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    private boolean confidencial;

    @Basic
    @javax.persistence.Column(name = "Confidencial", nullable = false, insertable = true, updatable = true)
    public boolean isConfidencial() {
        return confidencial;
    }

    public void setConfidencial(boolean confidencial) {
        this.confidencial = confidencial;
    }

    private Integer codContaOld;

    @Basic
    @javax.persistence.Column(name = "CodContaOld", nullable = true, insertable = true, updatable = true)
    public Integer getCodContaOld() {
        return codContaOld;
    }

    public void setCodContaOld(Integer codContaOld) {
        this.codContaOld = codContaOld;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntMovimento that = (CntMovimento) o;

        if (afDiferença != that.afDiferença) return false;
        if (anoLetivo != that.anoLetivo) return false;
        if (codMovimento != that.codMovimento) return false;
        if (codPauta != that.codPauta) return false;
        if (codRelacionamento != that.codRelacionamento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (confidencial != that.confidencial) return false;
        if (matrícula != that.matrícula) return false;
        if (movimentoId != that.movimentoId) return false;
        if (produtoEntregue != that.produtoEntregue) return false;
        if (ultimoCodDiferença != that.ultimoCodDiferença) return false;
        if (automáticoMorto != null ? !automáticoMorto.equals(that.automáticoMorto) : that.automáticoMorto != null)
            return false;
        if (codAnuidade != null ? !codAnuidade.equals(that.codAnuidade) : that.codAnuidade != null) return false;
        if (codCaixa != null ? !codCaixa.equals(that.codCaixa) : that.codCaixa != null) return false;
        if (codComissionado != null ? !codComissionado.equals(that.codComissionado) : that.codComissionado != null)
            return false;
        if (codConta != null ? !codConta.equals(that.codConta) : that.codConta != null) return false;
        if (codContaOld != null ? !codContaOld.equals(that.codContaOld) : that.codContaOld != null) return false;
        if (codCotação != null ? !codCotação.equals(that.codCotação) : that.codCotação != null) return false;
        if (codDepartamento != null ? !codDepartamento.equals(that.codDepartamento) : that.codDepartamento != null)
            return false;
        if (codMovimentoCobrança != null ? !codMovimentoCobrança.equals(that.codMovimentoCobrança) : that.codMovimentoCobrança != null)
            return false;
        if (codTipoCobrança != null ? !codTipoCobrança.equals(that.codTipoCobrança) : that.codTipoCobrança != null)
            return false;
        if (codUsuário != null ? !codUsuário.equals(that.codUsuário) : that.codUsuário != null) return false;
        if (comissão != null ? !comissão.equals(that.comissão) : that.comissão != null) return false;
        if (comissãoAgência != null ? !comissãoAgência.equals(that.comissãoAgência) : that.comissãoAgência != null)
            return false;
        if (contrato != null ? !contrato.equals(that.contrato) : that.contrato != null) return false;
        if (!Arrays.equals(cts, that.cts)) return false;
        if (dataMovimento != null ? !dataMovimento.equals(that.dataMovimento) : that.dataMovimento != null)
            return false;
        if (diaLimite != null ? !diaLimite.equals(that.diaLimite) : that.diaLimite != null) return false;
        if (diaVencimento != null ? !diaVencimento.equals(that.diaVencimento) : that.diaVencimento != null)
            return false;
        if (histórico != null ? !histórico.equals(that.histórico) : that.histórico != null) return false;
        if (mensagemAtraso != null ? !mensagemAtraso.equals(that.mensagemAtraso) : that.mensagemAtraso != null)
            return false;
        if (mensagemCompensação != null ? !mensagemCompensação.equals(that.mensagemCompensação) : that.mensagemCompensação != null)
            return false;
        if (mensagemSacado != null ? !mensagemSacado.equals(that.mensagemSacado) : that.mensagemSacado != null)
            return false;
        if (movimentoTipo != null ? !movimentoTipo.equals(that.movimentoTipo) : that.movimentoTipo != null)
            return false;
        if (notaFiscal != null ? !notaFiscal.equals(that.notaFiscal) : that.notaFiscal != null) return false;
        if (nãoImprimirJuros != null ? !nãoImprimirJuros.equals(that.nãoImprimirJuros) : that.nãoImprimirJuros != null)
            return false;
        if (númeroCarnet != null ? !númeroCarnet.equals(that.númeroCarnet) : that.númeroCarnet != null) return false;
        if (númeroParcela != null ? !númeroParcela.equals(that.númeroParcela) : that.númeroParcela != null)
            return false;
        if (observação != null ? !observação.equals(that.observação) : that.observação != null) return false;
        if (parcelaVista != null ? !parcelaVista.equals(that.parcelaVista) : that.parcelaVista != null) return false;
        if (percentualEntrada != null ? !percentualEntrada.equals(that.percentualEntrada) : that.percentualEntrada != null)
            return false;
        if (percentualJuros != null ? !percentualJuros.equals(that.percentualJuros) : that.percentualJuros != null)
            return false;
        if (plano != null ? !plano.equals(that.plano) : that.plano != null) return false;
        if (prazoEntrega != null ? !prazoEntrega.equals(that.prazoEntrega) : that.prazoEntrega != null) return false;
        if (valorBruto != null ? !valorBruto.equals(that.valorBruto) : that.valorBruto != null) return false;
        if (valorEntrada != null ? !valorEntrada.equals(that.valorEntrada) : that.valorEntrada != null) return false;
        if (valorFinanciado != null ? !valorFinanciado.equals(that.valorFinanciado) : that.valorFinanciado != null)
            return false;
        if (valorLíquido != null ? !valorLíquido.equals(that.valorLíquido) : that.valorLíquido != null) return false;
        if (valorParcela != null ? !valorParcela.equals(that.valorParcela) : that.valorParcela != null) return false;
        if (vencimento != null ? !vencimento.equals(that.vencimento) : that.vencimento != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (movimentoId ^ (movimentoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) (codMovimento ^ (codMovimento >>> 32));
        result = 31 * result + (codConta != null ? codConta.hashCode() : 0);
        result = 31 * result + (codDepartamento != null ? codDepartamento.hashCode() : 0);
        result = 31 * result + codRelacionamento;
        result = 31 * result + anoLetivo;
        result = 31 * result + matrícula;
        result = 31 * result + (int) (codPauta ^ (codPauta >>> 32));
        result = 31 * result + (notaFiscal != null ? notaFiscal.hashCode() : 0);
        result = 31 * result + (dataMovimento != null ? dataMovimento.hashCode() : 0);
        result = 31 * result + (histórico != null ? histórico.hashCode() : 0);
        result = 31 * result + (númeroParcela != null ? númeroParcela.hashCode() : 0);
        result = 31 * result + (parcelaVista != null ? parcelaVista.hashCode() : 0);
        result = 31 * result + (percentualEntrada != null ? percentualEntrada.hashCode() : 0);
        result = 31 * result + (percentualJuros != null ? percentualJuros.hashCode() : 0);
        result = 31 * result + (valorBruto != null ? valorBruto.hashCode() : 0);
        result = 31 * result + (valorEntrada != null ? valorEntrada.hashCode() : 0);
        result = 31 * result + (valorFinanciado != null ? valorFinanciado.hashCode() : 0);
        result = 31 * result + (valorLíquido != null ? valorLíquido.hashCode() : 0);
        result = 31 * result + (valorParcela != null ? valorParcela.hashCode() : 0);
        result = 31 * result + (vencimento != null ? vencimento.hashCode() : 0);
        result = 31 * result + (movimentoTipo != null ? movimentoTipo.hashCode() : 0);
        result = 31 * result + (codTipoCobrança != null ? codTipoCobrança.hashCode() : 0);
        result = 31 * result + (codUsuário != null ? codUsuário.hashCode() : 0);
        result = 31 * result + (codCotação != null ? codCotação.hashCode() : 0);
        result = 31 * result + (observação != null ? observação.hashCode() : 0);
        result = 31 * result + (prazoEntrega != null ? prazoEntrega.hashCode() : 0);
        result = 31 * result + (codComissionado != null ? codComissionado.hashCode() : 0);
        result = 31 * result + (comissão != null ? comissão.hashCode() : 0);
        result = 31 * result + (nãoImprimirJuros != null ? nãoImprimirJuros.hashCode() : 0);
        result = 31 * result + (automáticoMorto != null ? automáticoMorto.hashCode() : 0);
        result = 31 * result + (comissãoAgência != null ? comissãoAgência.hashCode() : 0);
        result = 31 * result + (produtoEntregue ? 1 : 0);
        result = 31 * result + (afDiferença ? 1 : 0);
        result = 31 * result + ultimoCodDiferença;
        result = 31 * result + (plano != null ? plano.hashCode() : 0);
        result = 31 * result + (codAnuidade != null ? codAnuidade.hashCode() : 0);
        result = 31 * result + (codCaixa != null ? codCaixa.hashCode() : 0);
        result = 31 * result + (cts != null ? Arrays.hashCode(cts) : 0);
        result = 31 * result + (númeroCarnet != null ? númeroCarnet.hashCode() : 0);
        result = 31 * result + (codMovimentoCobrança != null ? codMovimentoCobrança.hashCode() : 0);
        result = 31 * result + (diaVencimento != null ? diaVencimento.hashCode() : 0);
        result = 31 * result + (diaLimite != null ? diaLimite.hashCode() : 0);
        result = 31 * result + (mensagemSacado != null ? mensagemSacado.hashCode() : 0);
        result = 31 * result + (mensagemAtraso != null ? mensagemAtraso.hashCode() : 0);
        result = 31 * result + (mensagemCompensação != null ? mensagemCompensação.hashCode() : 0);
        result = 31 * result + (contrato != null ? contrato.hashCode() : 0);
        result = 31 * result + (confidencial ? 1 : 0);
        result = 31 * result + (codContaOld != null ? codContaOld.hashCode() : 0);
        return result;
    }
}
