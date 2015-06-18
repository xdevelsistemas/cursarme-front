package br.com.xduka.modellegacy.entities;

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
@IdClass(CntMovimentoParcelaPK.class)
public class CntMovimentoParcela {
    private long movimentoParcelaId;

    @Basic
    @javax.persistence.Column(name = "MovimentoParcela_ID", nullable = false, insertable = true, updatable = true)
    public long getMovimentoParcelaId() {
        return movimentoParcelaId;
    }

    public void setMovimentoParcelaId(long movimentoParcelaId) {
        this.movimentoParcelaId = movimentoParcelaId;
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

    private int parcela;

    @Id
    @javax.persistence.Column(name = "Parcela", nullable = false, insertable = true, updatable = true)
    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
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

    private Integer codCaixaInverso;

    @Basic
    @javax.persistence.Column(name = "CodCaixaInverso", nullable = true, insertable = true, updatable = true)
    public Integer getCodCaixaInverso() {
        return codCaixaInverso;
    }

    public void setCodCaixaInverso(Integer codCaixaInverso) {
        this.codCaixaInverso = codCaixaInverso;
    }

    private String documento;

    @Basic
    @javax.persistence.Column(name = "Documento", nullable = true, insertable = true, updatable = true)
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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

    private Integer mês;

    @Basic
    @javax.persistence.Column(name = "Mês", nullable = true, insertable = true, updatable = true)
    public Integer getMês() {
        return mês;
    }

    public void setMês(Integer mês) {
        this.mês = mês;
    }

    private Integer mêsPagamento;

    @Basic
    @javax.persistence.Column(name = "MêsPagamento", nullable = true, insertable = true, updatable = true)
    public Integer getMêsPagamento() {
        return mêsPagamento;
    }

    public void setMêsPagamento(Integer mêsPagamento) {
        this.mêsPagamento = mêsPagamento;
    }

    private BigDecimal bolsa;

    @Basic
    @javax.persistence.Column(name = "Bolsa", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getBolsa() {
        return bolsa;
    }

    public void setBolsa(BigDecimal bolsa) {
        this.bolsa = bolsa;
    }

    private String bolsaMotivo;

    @Basic
    @javax.persistence.Column(name = "BolsaMotivo", nullable = true, insertable = true, updatable = true)
    public String getBolsaMotivo() {
        return bolsaMotivo;
    }

    public void setBolsaMotivo(String bolsaMotivo) {
        this.bolsaMotivo = bolsaMotivo;
    }

    private BigDecimal bolsaCondicional;

    @Basic
    @javax.persistence.Column(name = "BolsaCondicional", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getBolsaCondicional() {
        return bolsaCondicional;
    }

    public void setBolsaCondicional(BigDecimal bolsaCondicional) {
        this.bolsaCondicional = bolsaCondicional;
    }

    private String bolsaCondicionalMotivo;

    @Basic
    @javax.persistence.Column(name = "BolsaCondicionalMotivo", nullable = true, insertable = true, updatable = true)
    public String getBolsaCondicionalMotivo() {
        return bolsaCondicionalMotivo;
    }

    public void setBolsaCondicionalMotivo(String bolsaCondicionalMotivo) {
        this.bolsaCondicionalMotivo = bolsaCondicionalMotivo;
    }

    private BigDecimal créditoTerceiro;

    @Basic
    @javax.persistence.Column(name = "CréditoTerceiro", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getCréditoTerceiro() {
        return créditoTerceiro;
    }

    public void setCréditoTerceiro(BigDecimal créditoTerceiro) {
        this.créditoTerceiro = créditoTerceiro;
    }

    private String créditoTerceiroMotivo;

    @Basic
    @javax.persistence.Column(name = "CréditoTerceiroMotivo", nullable = true, insertable = true, updatable = true)
    public String getCréditoTerceiroMotivo() {
        return créditoTerceiroMotivo;
    }

    public void setCréditoTerceiroMotivo(String créditoTerceiroMotivo) {
        this.créditoTerceiroMotivo = créditoTerceiroMotivo;
    }

    private BigDecimal abatimento;

    @Basic
    @javax.persistence.Column(name = "Abatimento", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAbatimento() {
        return abatimento;
    }

    public void setAbatimento(BigDecimal abatimento) {
        this.abatimento = abatimento;
    }

    private String abatimentoMotivo;

    @Basic
    @javax.persistence.Column(name = "AbatimentoMotivo", nullable = true, insertable = true, updatable = true)
    public String getAbatimentoMotivo() {
        return abatimentoMotivo;
    }

    public void setAbatimentoMotivo(String abatimentoMotivo) {
        this.abatimentoMotivo = abatimentoMotivo;
    }

    private BigDecimal acréscimo;

    @Basic
    @javax.persistence.Column(name = "Acréscimo", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAcréscimo() {
        return acréscimo;
    }

    public void setAcréscimo(BigDecimal acréscimo) {
        this.acréscimo = acréscimo;
    }

    private String acréscimoMotivo;

    @Basic
    @javax.persistence.Column(name = "AcréscimoMotivo", nullable = true, insertable = true, updatable = true)
    public String getAcréscimoMotivo() {
        return acréscimoMotivo;
    }

    public void setAcréscimoMotivo(String acréscimoMotivo) {
        this.acréscimoMotivo = acréscimoMotivo;
    }

    private BigDecimal acréscimoProgramado;

    @Basic
    @javax.persistence.Column(name = "AcréscimoProgramado", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAcréscimoProgramado() {
        return acréscimoProgramado;
    }

    public void setAcréscimoProgramado(BigDecimal acréscimoProgramado) {
        this.acréscimoProgramado = acréscimoProgramado;
    }

    private String acréscimoProgramadoMotivo;

    @Basic
    @javax.persistence.Column(name = "AcréscimoProgramadoMotivo", nullable = true, insertable = true, updatable = true)
    public String getAcréscimoProgramadoMotivo() {
        return acréscimoProgramadoMotivo;
    }

    public void setAcréscimoProgramadoMotivo(String acréscimoProgramadoMotivo) {
        this.acréscimoProgramadoMotivo = acréscimoProgramadoMotivo;
    }

    private BigDecimal pagarValor;

    @Basic
    @javax.persistence.Column(name = "PagarValor", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPagarValor() {
        return pagarValor;
    }

    public void setPagarValor(BigDecimal pagarValor) {
        this.pagarValor = pagarValor;
    }

    private BigDecimal pagoValor;

    @Basic
    @javax.persistence.Column(name = "PagoValor", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPagoValor() {
        return pagoValor;
    }

    public void setPagoValor(BigDecimal pagoValor) {
        this.pagoValor = pagoValor;
    }

    private BigDecimal pagoDiferença;

    @Basic
    @javax.persistence.Column(name = "PagoDiferença", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPagoDiferença() {
        return pagoDiferença;
    }

    public void setPagoDiferença(BigDecimal pagoDiferença) {
        this.pagoDiferença = pagoDiferença;
    }

    private Timestamp pagoData;

    @Basic
    @javax.persistence.Column(name = "PagoData", nullable = true, insertable = true, updatable = true)
    public Timestamp getPagoData() {
        return pagoData;
    }

    public void setPagoData(Timestamp pagoData) {
        this.pagoData = pagoData;
    }

    private Timestamp dataLimite;

    @Basic
    @javax.persistence.Column(name = "DataLimite", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Timestamp dataLimite) {
        this.dataLimite = dataLimite;
    }

    private Timestamp dataVencimento;

    @Basic
    @javax.persistence.Column(name = "DataVencimento", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Timestamp dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    private boolean docEmitido;

    @Basic
    @javax.persistence.Column(name = "DocEmitido", nullable = false, insertable = true, updatable = true)
    public boolean isDocEmitido() {
        return docEmitido;
    }

    public void setDocEmitido(boolean docEmitido) {
        this.docEmitido = docEmitido;
    }

    private Timestamp docData;

    @Basic
    @javax.persistence.Column(name = "DocData", nullable = true, insertable = true, updatable = true)
    public Timestamp getDocData() {
        return docData;
    }

    public void setDocData(Timestamp docData) {
        this.docData = docData;
    }

    private boolean cancelada;

    @Basic
    @javax.persistence.Column(name = "Cancelada", nullable = false, insertable = true, updatable = true)
    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    private Timestamp canceladaData;

    @Basic
    @javax.persistence.Column(name = "CanceladaData", nullable = true, insertable = true, updatable = true)
    public Timestamp getCanceladaData() {
        return canceladaData;
    }

    public void setCanceladaData(Timestamp canceladaData) {
        this.canceladaData = canceladaData;
    }

    private Byte quitaçãoTipo;

    @Basic
    @javax.persistence.Column(name = "QuitaçãoTipo", nullable = true, insertable = true, updatable = true)
    public Byte getQuitaçãoTipo() {
        return quitaçãoTipo;
    }

    public void setQuitaçãoTipo(Byte quitaçãoTipo) {
        this.quitaçãoTipo = quitaçãoTipo;
    }

    private String espécie;

    @Basic
    @javax.persistence.Column(name = "Espécie", nullable = true, insertable = true, updatable = true)
    public String getEspécie() {
        return espécie;
    }

    public void setEspécie(String espécie) {
        this.espécie = espécie;
    }

    private String espécieDescrição;

    @Basic
    @javax.persistence.Column(name = "EspécieDescrição", nullable = true, insertable = true, updatable = true)
    public String getEspécieDescrição() {
        return espécieDescrição;
    }

    public void setEspécieDescrição(String espécieDescrição) {
        this.espécieDescrição = espécieDescrição;
    }

    private Byte docVia;

    @Basic
    @javax.persistence.Column(name = "DocVia", nullable = true, insertable = true, updatable = true)
    public Byte getDocVia() {
        return docVia;
    }

    public void setDocVia(Byte docVia) {
        this.docVia = docVia;
    }

    private boolean ativa;

    @Basic
    @javax.persistence.Column(name = "Ativa", nullable = false, insertable = true, updatable = true)
    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    private boolean desatualizada;

    @Basic
    @javax.persistence.Column(name = "Desatualizada", nullable = false, insertable = true, updatable = true)
    public boolean isDesatualizada() {
        return desatualizada;
    }

    public void setDesatualizada(boolean desatualizada) {
        this.desatualizada = desatualizada;
    }

    private boolean segundaVia;

    @Basic
    @javax.persistence.Column(name = "SegundaVia", nullable = false, insertable = true, updatable = true)
    public boolean isSegundaVia() {
        return segundaVia;
    }

    public void setSegundaVia(boolean segundaVia) {
        this.segundaVia = segundaVia;
    }

    private String quitaçãoArquivo;

    @Basic
    @javax.persistence.Column(name = "QuitaçãoArquivo", nullable = true, insertable = true, updatable = true)
    public String getQuitaçãoArquivo() {
        return quitaçãoArquivo;
    }

    public void setQuitaçãoArquivo(String quitaçãoArquivo) {
        this.quitaçãoArquivo = quitaçãoArquivo;
    }

    private boolean nãoAtualizavel;

    @Basic
    @javax.persistence.Column(name = "NãoAtualizavel", nullable = false, insertable = true, updatable = true)
    public boolean isNãoAtualizavel() {
        return nãoAtualizavel;
    }

    public void setNãoAtualizavel(boolean nãoAtualizavel) {
        this.nãoAtualizavel = nãoAtualizavel;
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

    private Timestamp dataNegativação;

    @Basic
    @javax.persistence.Column(name = "DataNegativação", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataNegativação() {
        return dataNegativação;
    }

    public void setDataNegativação(Timestamp dataNegativação) {
        this.dataNegativação = dataNegativação;
    }

    private boolean negativado;

    @Basic
    @javax.persistence.Column(name = "Negativado", nullable = false, insertable = true, updatable = true)
    public boolean isNegativado() {
        return negativado;
    }

    public void setNegativado(boolean negativado) {
        this.negativado = negativado;
    }

    private Timestamp dataLançamento;

    @Basic
    @javax.persistence.Column(name = "DataLançamento", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataLançamento() {
        return dataLançamento;
    }

    public void setDataLançamento(Timestamp dataLançamento) {
        this.dataLançamento = dataLançamento;
    }

    private Byte codDinheiro;

    @Basic
    @javax.persistence.Column(name = "CodDinheiro", nullable = true, insertable = true, updatable = true)
    public Byte getCodDinheiro() {
        return codDinheiro;
    }

    public void setCodDinheiro(Byte codDinheiro) {
        this.codDinheiro = codDinheiro;
    }

    private boolean semOrçamento;

    @Basic
    @javax.persistence.Column(name = "SemOrçamento", nullable = false, insertable = true, updatable = true)
    public boolean isSemOrçamento() {
        return semOrçamento;
    }

    public void setSemOrçamento(boolean semOrçamento) {
        this.semOrçamento = semOrçamento;
    }

    private boolean ajuizada;

    @Basic
    @javax.persistence.Column(name = "Ajuizada", nullable = false, insertable = true, updatable = true)
    public boolean isAjuizada() {
        return ajuizada;
    }

    public void setAjuizada(boolean ajuizada) {
        this.ajuizada = ajuizada;
    }

    private Timestamp ajuizadaData;

    @Basic
    @javax.persistence.Column(name = "AjuizadaData", nullable = true, insertable = true, updatable = true)
    public Timestamp getAjuizadaData() {
        return ajuizadaData;
    }

    public void setAjuizadaData(Timestamp ajuizadaData) {
        this.ajuizadaData = ajuizadaData;
    }

    private Integer idUsuário;

    @Basic
    @javax.persistence.Column(name = "IDUsuário", nullable = true, insertable = true, updatable = true)
    public Integer getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(Integer idUsuário) {
        this.idUsuário = idUsuário;
    }

    private String fatorOnLine;

    @Basic
    @javax.persistence.Column(name = "FatorOnLine", nullable = true, insertable = true, updatable = true)
    public String getFatorOnLine() {
        return fatorOnLine;
    }

    public void setFatorOnLine(String fatorOnLine) {
        this.fatorOnLine = fatorOnLine;
    }

    private BigDecimal bolsaCondicionalAnterior;

    @Basic
    @javax.persistence.Column(name = "BolsaCondicionalAnterior", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getBolsaCondicionalAnterior() {
        return bolsaCondicionalAnterior;
    }

    public void setBolsaCondicionalAnterior(BigDecimal bolsaCondicionalAnterior) {
        this.bolsaCondicionalAnterior = bolsaCondicionalAnterior;
    }

    private boolean diferençaCobrada;

    @Basic
    @javax.persistence.Column(name = "DiferençaCobrada", nullable = false, insertable = true, updatable = true)
    public boolean isDiferençaCobrada() {
        return diferençaCobrada;
    }

    public void setDiferençaCobrada(boolean diferençaCobrada) {
        this.diferençaCobrada = diferençaCobrada;
    }

    private BigDecimal bolsaAnterior;

    @Basic
    @javax.persistence.Column(name = "BolsaAnterior", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getBolsaAnterior() {
        return bolsaAnterior;
    }

    public void setBolsaAnterior(BigDecimal bolsaAnterior) {
        this.bolsaAnterior = bolsaAnterior;
    }

    private boolean pagtoLiberado;

    @Basic
    @javax.persistence.Column(name = "PagtoLiberado", nullable = false, insertable = true, updatable = true)
    public boolean isPagtoLiberado() {
        return pagtoLiberado;
    }

    public void setPagtoLiberado(boolean pagtoLiberado) {
        this.pagtoLiberado = pagtoLiberado;
    }

    private boolean liberarAdiantamento;

    @Basic
    @javax.persistence.Column(name = "LiberarAdiantamento", nullable = false, insertable = true, updatable = true)
    public boolean isLiberarAdiantamento() {
        return liberarAdiantamento;
    }

    public void setLiberarAdiantamento(boolean liberarAdiantamento) {
        this.liberarAdiantamento = liberarAdiantamento;
    }

    private Timestamp dataCrédito;

    @Basic
    @javax.persistence.Column(name = "DataCrédito", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataCrédito() {
        return dataCrédito;
    }

    public void setDataCrédito(Timestamp dataCrédito) {
        this.dataCrédito = dataCrédito;
    }

    private Short codRevista;

    @Basic
    @javax.persistence.Column(name = "CodRevista", nullable = true, insertable = true, updatable = true)
    public Short getCodRevista() {
        return codRevista;
    }

    public void setCodRevista(Short codRevista) {
        this.codRevista = codRevista;
    }

    private Short revistaEdição;

    @Basic
    @javax.persistence.Column(name = "RevistaEdição", nullable = true, insertable = true, updatable = true)
    public Short getRevistaEdição() {
        return revistaEdição;
    }

    public void setRevistaEdição(Short revistaEdição) {
        this.revistaEdição = revistaEdição;
    }

    private boolean diferençaCobradaCriada;

    @Basic
    @javax.persistence.Column(name = "DiferençaCobradaCriada", nullable = false, insertable = true, updatable = true)
    public boolean isDiferençaCobradaCriada() {
        return diferençaCobradaCriada;
    }

    public void setDiferençaCobradaCriada(boolean diferençaCobradaCriada) {
        this.diferençaCobradaCriada = diferençaCobradaCriada;
    }

    private Integer codMovimentoOrigem;

    @Basic
    @javax.persistence.Column(name = "CodMovimentoOrigem", nullable = true, insertable = true, updatable = true)
    public Integer getCodMovimentoOrigem() {
        return codMovimentoOrigem;
    }

    public void setCodMovimentoOrigem(Integer codMovimentoOrigem) {
        this.codMovimentoOrigem = codMovimentoOrigem;
    }

    private boolean diferençaCriadaBanco;

    @Basic
    @javax.persistence.Column(name = "DiferençaCriadaBanco", nullable = false, insertable = true, updatable = true)
    public boolean isDiferençaCriadaBanco() {
        return diferençaCriadaBanco;
    }

    public void setDiferençaCriadaBanco(boolean diferençaCriadaBanco) {
        this.diferençaCriadaBanco = diferençaCriadaBanco;
    }

    private Timestamp diferençaCriadaData;

    @Basic
    @javax.persistence.Column(name = "DiferençaCriadaData", nullable = true, insertable = true, updatable = true)
    public Timestamp getDiferençaCriadaData() {
        return diferençaCriadaData;
    }

    public void setDiferençaCriadaData(Timestamp diferençaCriadaData) {
        this.diferençaCriadaData = diferençaCriadaData;
    }

    private String pi;

    @Basic
    @javax.persistence.Column(name = "PI", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    private Integer codProduto;

    @Basic
    @javax.persistence.Column(name = "CodProduto", nullable = true, insertable = true, updatable = true)
    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    private String página;

    @Basic
    @javax.persistence.Column(name = "Página", nullable = true, insertable = true, updatable = true, length = 15)
    public String getPágina() {
        return página;
    }

    public void setPágina(String página) {
        this.página = página;
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

    private String nomes;

    @Basic
    @javax.persistence.Column(name = "Nomes", nullable = true, insertable = true, updatable = true)
    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    private String caixaOnLine;

    @Basic
    @javax.persistence.Column(name = "CaixaOnLine", nullable = true, insertable = true, updatable = true)
    public String getCaixaOnLine() {
        return caixaOnLine;
    }

    public void setCaixaOnLine(String caixaOnLine) {
        this.caixaOnLine = caixaOnLine;
    }

    private Integer recibo;

    @Basic
    @javax.persistence.Column(name = "Recibo", nullable = true, insertable = true, updatable = true)
    public Integer getRecibo() {
        return recibo;
    }

    public void setRecibo(Integer recibo) {
        this.recibo = recibo;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntMovimentoParcela that = (CntMovimentoParcela) o;

        if (ajuizada != that.ajuizada) return false;
        if (ativa != that.ativa) return false;
        if (cancelada != that.cancelada) return false;
        if (codMovimento != that.codMovimento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (desatualizada != that.desatualizada) return false;
        if (diferençaCobrada != that.diferençaCobrada) return false;
        if (diferençaCobradaCriada != that.diferençaCobradaCriada) return false;
        if (diferençaCriadaBanco != that.diferençaCriadaBanco) return false;
        if (docEmitido != that.docEmitido) return false;
        if (liberarAdiantamento != that.liberarAdiantamento) return false;
        if (movimentoParcelaId != that.movimentoParcelaId) return false;
        if (negativado != that.negativado) return false;
        if (nãoAtualizavel != that.nãoAtualizavel) return false;
        if (pagtoLiberado != that.pagtoLiberado) return false;
        if (parcela != that.parcela) return false;
        if (segundaVia != that.segundaVia) return false;
        if (semOrçamento != that.semOrçamento) return false;
        if (abatimento != null ? !abatimento.equals(that.abatimento) : that.abatimento != null) return false;
        if (abatimentoMotivo != null ? !abatimentoMotivo.equals(that.abatimentoMotivo) : that.abatimentoMotivo != null)
            return false;
        if (acréscimo != null ? !acréscimo.equals(that.acréscimo) : that.acréscimo != null) return false;
        if (acréscimoMotivo != null ? !acréscimoMotivo.equals(that.acréscimoMotivo) : that.acréscimoMotivo != null)
            return false;
        if (acréscimoProgramado != null ? !acréscimoProgramado.equals(that.acréscimoProgramado) : that.acréscimoProgramado != null)
            return false;
        if (acréscimoProgramadoMotivo != null ? !acréscimoProgramadoMotivo.equals(that.acréscimoProgramadoMotivo) : that.acréscimoProgramadoMotivo != null)
            return false;
        if (ajuizadaData != null ? !ajuizadaData.equals(that.ajuizadaData) : that.ajuizadaData != null) return false;
        if (bolsa != null ? !bolsa.equals(that.bolsa) : that.bolsa != null) return false;
        if (bolsaAnterior != null ? !bolsaAnterior.equals(that.bolsaAnterior) : that.bolsaAnterior != null)
            return false;
        if (bolsaCondicional != null ? !bolsaCondicional.equals(that.bolsaCondicional) : that.bolsaCondicional != null)
            return false;
        if (bolsaCondicionalAnterior != null ? !bolsaCondicionalAnterior.equals(that.bolsaCondicionalAnterior) : that.bolsaCondicionalAnterior != null)
            return false;
        if (bolsaCondicionalMotivo != null ? !bolsaCondicionalMotivo.equals(that.bolsaCondicionalMotivo) : that.bolsaCondicionalMotivo != null)
            return false;
        if (bolsaMotivo != null ? !bolsaMotivo.equals(that.bolsaMotivo) : that.bolsaMotivo != null) return false;
        if (caixaOnLine != null ? !caixaOnLine.equals(that.caixaOnLine) : that.caixaOnLine != null) return false;
        if (canceladaData != null ? !canceladaData.equals(that.canceladaData) : that.canceladaData != null)
            return false;
        if (codAnuidade != null ? !codAnuidade.equals(that.codAnuidade) : that.codAnuidade != null) return false;
        if (codCaixaInverso != null ? !codCaixaInverso.equals(that.codCaixaInverso) : that.codCaixaInverso != null)
            return false;
        if (codDinheiro != null ? !codDinheiro.equals(that.codDinheiro) : that.codDinheiro != null) return false;
        if (codMovimentoOrigem != null ? !codMovimentoOrigem.equals(that.codMovimentoOrigem) : that.codMovimentoOrigem != null)
            return false;
        if (codProduto != null ? !codProduto.equals(that.codProduto) : that.codProduto != null) return false;
        if (codRevista != null ? !codRevista.equals(that.codRevista) : that.codRevista != null) return false;
        if (créditoTerceiro != null ? !créditoTerceiro.equals(that.créditoTerceiro) : that.créditoTerceiro != null)
            return false;
        if (créditoTerceiroMotivo != null ? !créditoTerceiroMotivo.equals(that.créditoTerceiroMotivo) : that.créditoTerceiroMotivo != null)
            return false;
        if (!Arrays.equals(cts, that.cts)) return false;
        if (dataCrédito != null ? !dataCrédito.equals(that.dataCrédito) : that.dataCrédito != null) return false;
        if (dataLançamento != null ? !dataLançamento.equals(that.dataLançamento) : that.dataLançamento != null)
            return false;
        if (dataLimite != null ? !dataLimite.equals(that.dataLimite) : that.dataLimite != null) return false;
        if (dataNegativação != null ? !dataNegativação.equals(that.dataNegativação) : that.dataNegativação != null)
            return false;
        if (dataVencimento != null ? !dataVencimento.equals(that.dataVencimento) : that.dataVencimento != null)
            return false;
        if (diferençaCriadaData != null ? !diferençaCriadaData.equals(that.diferençaCriadaData) : that.diferençaCriadaData != null)
            return false;
        if (docData != null ? !docData.equals(that.docData) : that.docData != null) return false;
        if (docVia != null ? !docVia.equals(that.docVia) : that.docVia != null) return false;
        if (documento != null ? !documento.equals(that.documento) : that.documento != null) return false;
        if (espécie != null ? !espécie.equals(that.espécie) : that.espécie != null) return false;
        if (espécieDescrição != null ? !espécieDescrição.equals(that.espécieDescrição) : that.espécieDescrição != null)
            return false;
        if (fatorOnLine != null ? !fatorOnLine.equals(that.fatorOnLine) : that.fatorOnLine != null) return false;
        if (idUsuário != null ? !idUsuário.equals(that.idUsuário) : that.idUsuário != null) return false;
        if (mês != null ? !mês.equals(that.mês) : that.mês != null) return false;
        if (mêsPagamento != null ? !mêsPagamento.equals(that.mêsPagamento) : that.mêsPagamento != null) return false;
        if (nomes != null ? !nomes.equals(that.nomes) : that.nomes != null) return false;
        if (notaFiscal != null ? !notaFiscal.equals(that.notaFiscal) : that.notaFiscal != null) return false;
        if (pagarValor != null ? !pagarValor.equals(that.pagarValor) : that.pagarValor != null) return false;
        if (pagoData != null ? !pagoData.equals(that.pagoData) : that.pagoData != null) return false;
        if (pagoDiferença != null ? !pagoDiferença.equals(that.pagoDiferença) : that.pagoDiferença != null)
            return false;
        if (pagoValor != null ? !pagoValor.equals(that.pagoValor) : that.pagoValor != null) return false;
        if (pi != null ? !pi.equals(that.pi) : that.pi != null) return false;
        if (plano != null ? !plano.equals(that.plano) : that.plano != null) return false;
        if (página != null ? !página.equals(that.página) : that.página != null) return false;
        if (quitaçãoArquivo != null ? !quitaçãoArquivo.equals(that.quitaçãoArquivo) : that.quitaçãoArquivo != null)
            return false;
        if (quitaçãoTipo != null ? !quitaçãoTipo.equals(that.quitaçãoTipo) : that.quitaçãoTipo != null) return false;
        if (recibo != null ? !recibo.equals(that.recibo) : that.recibo != null) return false;
        if (revistaEdição != null ? !revistaEdição.equals(that.revistaEdição) : that.revistaEdição != null)
            return false;
        if (valorParcela != null ? !valorParcela.equals(that.valorParcela) : that.valorParcela != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (movimentoParcelaId ^ (movimentoParcelaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) (codMovimento ^ (codMovimento >>> 32));
        result = 31 * result + parcela;
        result = 31 * result + (plano != null ? plano.hashCode() : 0);
        result = 31 * result + (codCaixaInverso != null ? codCaixaInverso.hashCode() : 0);
        result = 31 * result + (documento != null ? documento.hashCode() : 0);
        result = 31 * result + (codAnuidade != null ? codAnuidade.hashCode() : 0);
        result = 31 * result + (mês != null ? mês.hashCode() : 0);
        result = 31 * result + (mêsPagamento != null ? mêsPagamento.hashCode() : 0);
        result = 31 * result + (bolsa != null ? bolsa.hashCode() : 0);
        result = 31 * result + (bolsaMotivo != null ? bolsaMotivo.hashCode() : 0);
        result = 31 * result + (bolsaCondicional != null ? bolsaCondicional.hashCode() : 0);
        result = 31 * result + (bolsaCondicionalMotivo != null ? bolsaCondicionalMotivo.hashCode() : 0);
        result = 31 * result + (créditoTerceiro != null ? créditoTerceiro.hashCode() : 0);
        result = 31 * result + (créditoTerceiroMotivo != null ? créditoTerceiroMotivo.hashCode() : 0);
        result = 31 * result + (abatimento != null ? abatimento.hashCode() : 0);
        result = 31 * result + (abatimentoMotivo != null ? abatimentoMotivo.hashCode() : 0);
        result = 31 * result + (acréscimo != null ? acréscimo.hashCode() : 0);
        result = 31 * result + (acréscimoMotivo != null ? acréscimoMotivo.hashCode() : 0);
        result = 31 * result + (acréscimoProgramado != null ? acréscimoProgramado.hashCode() : 0);
        result = 31 * result + (acréscimoProgramadoMotivo != null ? acréscimoProgramadoMotivo.hashCode() : 0);
        result = 31 * result + (pagarValor != null ? pagarValor.hashCode() : 0);
        result = 31 * result + (pagoValor != null ? pagoValor.hashCode() : 0);
        result = 31 * result + (pagoDiferença != null ? pagoDiferença.hashCode() : 0);
        result = 31 * result + (pagoData != null ? pagoData.hashCode() : 0);
        result = 31 * result + (dataLimite != null ? dataLimite.hashCode() : 0);
        result = 31 * result + (dataVencimento != null ? dataVencimento.hashCode() : 0);
        result = 31 * result + (docEmitido ? 1 : 0);
        result = 31 * result + (docData != null ? docData.hashCode() : 0);
        result = 31 * result + (cancelada ? 1 : 0);
        result = 31 * result + (canceladaData != null ? canceladaData.hashCode() : 0);
        result = 31 * result + (quitaçãoTipo != null ? quitaçãoTipo.hashCode() : 0);
        result = 31 * result + (espécie != null ? espécie.hashCode() : 0);
        result = 31 * result + (espécieDescrição != null ? espécieDescrição.hashCode() : 0);
        result = 31 * result + (docVia != null ? docVia.hashCode() : 0);
        result = 31 * result + (ativa ? 1 : 0);
        result = 31 * result + (desatualizada ? 1 : 0);
        result = 31 * result + (segundaVia ? 1 : 0);
        result = 31 * result + (quitaçãoArquivo != null ? quitaçãoArquivo.hashCode() : 0);
        result = 31 * result + (nãoAtualizavel ? 1 : 0);
        result = 31 * result + (valorParcela != null ? valorParcela.hashCode() : 0);
        result = 31 * result + (dataNegativação != null ? dataNegativação.hashCode() : 0);
        result = 31 * result + (negativado ? 1 : 0);
        result = 31 * result + (dataLançamento != null ? dataLançamento.hashCode() : 0);
        result = 31 * result + (codDinheiro != null ? codDinheiro.hashCode() : 0);
        result = 31 * result + (semOrçamento ? 1 : 0);
        result = 31 * result + (ajuizada ? 1 : 0);
        result = 31 * result + (ajuizadaData != null ? ajuizadaData.hashCode() : 0);
        result = 31 * result + (idUsuário != null ? idUsuário.hashCode() : 0);
        result = 31 * result + (fatorOnLine != null ? fatorOnLine.hashCode() : 0);
        result = 31 * result + (bolsaCondicionalAnterior != null ? bolsaCondicionalAnterior.hashCode() : 0);
        result = 31 * result + (diferençaCobrada ? 1 : 0);
        result = 31 * result + (bolsaAnterior != null ? bolsaAnterior.hashCode() : 0);
        result = 31 * result + (pagtoLiberado ? 1 : 0);
        result = 31 * result + (liberarAdiantamento ? 1 : 0);
        result = 31 * result + (dataCrédito != null ? dataCrédito.hashCode() : 0);
        result = 31 * result + (codRevista != null ? codRevista.hashCode() : 0);
        result = 31 * result + (revistaEdição != null ? revistaEdição.hashCode() : 0);
        result = 31 * result + (diferençaCobradaCriada ? 1 : 0);
        result = 31 * result + (codMovimentoOrigem != null ? codMovimentoOrigem.hashCode() : 0);
        result = 31 * result + (diferençaCriadaBanco ? 1 : 0);
        result = 31 * result + (diferençaCriadaData != null ? diferençaCriadaData.hashCode() : 0);
        result = 31 * result + (pi != null ? pi.hashCode() : 0);
        result = 31 * result + (codProduto != null ? codProduto.hashCode() : 0);
        result = 31 * result + (página != null ? página.hashCode() : 0);
        result = 31 * result + (cts != null ? Arrays.hashCode(cts) : 0);
        result = 31 * result + (nomes != null ? nomes.hashCode() : 0);
        result = 31 * result + (caixaOnLine != null ? caixaOnLine.hashCode() : 0);
        result = 31 * result + (recibo != null ? recibo.hashCode() : 0);
        result = 31 * result + (notaFiscal != null ? notaFiscal.hashCode() : 0);
        return result;
    }
}
