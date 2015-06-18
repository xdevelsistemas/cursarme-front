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
@IdClass(AcdAnoLetivoPK.class)
public class AcdAnoLetivo {
    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int anoLetivo;

    @Id
    @javax.persistence.Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    private int anoLetivoAnterior;

    @Basic
    @javax.persistence.Column(name = "AnoLetivoAnterior", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivoAnterior() {
        return anoLetivoAnterior;
    }

    public void setAnoLetivoAnterior(int anoLetivoAnterior) {
        this.anoLetivoAnterior = anoLetivoAnterior;
    }

    private boolean pautaPorDisciplina;

    @Basic
    @javax.persistence.Column(name = "PautaPorDisciplina", nullable = false, insertable = true, updatable = true)
    public boolean isPautaPorDisciplina() {
        return pautaPorDisciplina;
    }

    public void setPautaPorDisciplina(boolean pautaPorDisciplina) {
        this.pautaPorDisciplina = pautaPorDisciplina;
    }

    private BigDecimal multa;

    @Basic
    @javax.persistence.Column(name = "Multa", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMulta() {
        return multa;
    }

    public void setMulta(BigDecimal multa) {
        this.multa = multa;
    }

    private BigDecimal juros;

    @Basic
    @javax.persistence.Column(name = "Juros", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getJuros() {
        return juros;
    }

    public void setJuros(BigDecimal juros) {
        this.juros = juros;
    }

    private Short jurosTipo;

    @Basic
    @javax.persistence.Column(name = "JurosTipo", nullable = true, insertable = true, updatable = true)
    public Short getJurosTipo() {
        return jurosTipo;
    }

    public void setJurosTipo(Short jurosTipo) {
        this.jurosTipo = jurosTipo;
    }

    private boolean jurosSobreJuros;

    @Basic
    @javax.persistence.Column(name = "JurosSobreJuros", nullable = false, insertable = true, updatable = true)
    public boolean isJurosSobreJuros() {
        return jurosSobreJuros;
    }

    public void setJurosSobreJuros(boolean jurosSobreJuros) {
        this.jurosSobreJuros = jurosSobreJuros;
    }

    private BigDecimal jurosValor;

    @Basic
    @javax.persistence.Column(name = "JurosValor", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getJurosValor() {
        return jurosValor;
    }

    public void setJurosValor(BigDecimal jurosValor) {
        this.jurosValor = jurosValor;
    }

    private Boolean rateioJuros;

    @Basic
    @javax.persistence.Column(name = "RateioJuros", nullable = true, insertable = true, updatable = true)
    public Boolean getRateioJuros() {
        return rateioJuros;
    }

    public void setRateioJuros(Boolean rateioJuros) {
        this.rateioJuros = rateioJuros;
    }

    private boolean cobrançaAvançada;

    @Basic
    @javax.persistence.Column(name = "CobrançaAvançada", nullable = false, insertable = true, updatable = true)
    public boolean isCobrançaAvançada() {
        return cobrançaAvançada;
    }

    public void setCobrançaAvançada(boolean cobrançaAvançada) {
        this.cobrançaAvançada = cobrançaAvançada;
    }

    private boolean usarVencimento;

    @Basic
    @javax.persistence.Column(name = "UsarVencimento", nullable = false, insertable = true, updatable = true)
    public boolean isUsarVencimento() {
        return usarVencimento;
    }

    public void setUsarVencimento(boolean usarVencimento) {
        this.usarVencimento = usarVencimento;
    }

    private Short docDiasValidade;

    @Basic
    @javax.persistence.Column(name = "DocDiasValidade", nullable = true, insertable = true, updatable = true)
    public Short getDocDiasValidade() {
        return docDiasValidade;
    }

    public void setDocDiasValidade(Short docDiasValidade) {
        this.docDiasValidade = docDiasValidade;
    }

    private boolean usarCarteirinha;

    @Basic
    @javax.persistence.Column(name = "UsarCarteirinha", nullable = false, insertable = true, updatable = true)
    public boolean isUsarCarteirinha() {
        return usarCarteirinha;
    }

    public void setUsarCarteirinha(boolean usarCarteirinha) {
        this.usarCarteirinha = usarCarteirinha;
    }

    private Integer diasLetivos;

    @Basic
    @javax.persistence.Column(name = "DiasLetivos", nullable = true, insertable = true, updatable = true)
    public Integer getDiasLetivos() {
        return diasLetivos;
    }

    public void setDiasLetivos(Integer diasLetivos) {
        this.diasLetivos = diasLetivos;
    }

    private int quantidadeDependência;

    @Basic
    @javax.persistence.Column(name = "QuantidadeDependência", nullable = false, insertable = true, updatable = true)
    public int getQuantidadeDependência() {
        return quantidadeDependência;
    }

    public void setQuantidadeDependência(int quantidadeDependência) {
        this.quantidadeDependência = quantidadeDependência;
    }

    private int quantidadeAdaptação;

    @Basic
    @javax.persistence.Column(name = "QuantidadeAdaptação", nullable = false, insertable = true, updatable = true)
    public int getQuantidadeAdaptação() {
        return quantidadeAdaptação;
    }

    public void setQuantidadeAdaptação(int quantidadeAdaptação) {
        this.quantidadeAdaptação = quantidadeAdaptação;
    }

    private String históricoObs;

    @Basic
    @javax.persistence.Column(name = "HistóricoObs", nullable = true, insertable = true, updatable = true)
    public String getHistóricoObs() {
        return históricoObs;
    }

    public void setHistóricoObs(String históricoObs) {
        this.históricoObs = históricoObs;
    }

    private String critérioPromossão;

    @Basic
    @javax.persistence.Column(name = "CritérioPromossão", nullable = true, insertable = true, updatable = true)
    public String getCritérioPromossão() {
        return critérioPromossão;
    }

    public void setCritérioPromossão(String critérioPromossão) {
        this.critérioPromossão = critérioPromossão;
    }

    private String processoAvaliação;

    @Basic
    @javax.persistence.Column(name = "ProcessoAvaliação", nullable = true, insertable = true, updatable = true)
    public String getProcessoAvaliação() {
        return processoAvaliação;
    }

    public void setProcessoAvaliação(String processoAvaliação) {
        this.processoAvaliação = processoAvaliação;
    }

    private boolean reclassificar;

    @Basic
    @javax.persistence.Column(name = "-Reclassificar", nullable = false, insertable = true, updatable = true)
    public boolean isReclassificar() {
        return reclassificar;
    }

    public void setReclassificar(boolean reclassificar) {
        this.reclassificar = reclassificar;
    }

    private Byte quantidadeRecuperação;

    @Basic
    @javax.persistence.Column(name = "-QuantidadeRecuperação", nullable = true, insertable = true, updatable = true)
    public Byte getQuantidadeRecuperação() {
        return quantidadeRecuperação;
    }

    public void setQuantidadeRecuperação(Byte quantidadeRecuperação) {
        this.quantidadeRecuperação = quantidadeRecuperação;
    }

    private Byte codUnidadePadrão;

    @Basic
    @javax.persistence.Column(name = "-CodUnidadePadrão", nullable = true, insertable = true, updatable = true)
    public Byte getCodUnidadePadrão() {
        return codUnidadePadrão;
    }

    public void setCodUnidadePadrão(Byte codUnidadePadrão) {
        this.codUnidadePadrão = codUnidadePadrão;
    }

    private String mensagemBoletim;

    @Basic
    @javax.persistence.Column(name = "-MensagemBoletim", nullable = true, insertable = true, updatable = true)
    public String getMensagemBoletim() {
        return mensagemBoletim;
    }

    public void setMensagemBoletim(String mensagemBoletim) {
        this.mensagemBoletim = mensagemBoletim;
    }

    private Byte aaalQuantidadeAdaptação;

    @Basic
    @javax.persistence.Column(name = "-QuantidadeAdaptação", nullable = true, insertable = true, updatable = true)
    public Byte getAaalQuantidadeAdaptação() {
        return aaalQuantidadeAdaptação;
    }

    public void setAaalQuantidadeAdaptação(Byte aaalQuantidadeAdaptação) {
        this.aaalQuantidadeAdaptação = aaalQuantidadeAdaptação;
    }

    private Double percentualAdaptação;

    @Basic
    @javax.persistence.Column(name = "-PercentualAdaptação", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getPercentualAdaptação() {
        return percentualAdaptação;
    }

    public void setPercentualAdaptação(Double percentualAdaptação) {
        this.percentualAdaptação = percentualAdaptação;
    }

    private Byte aalQuantidadeDependência;

    @Basic
    @javax.persistence.Column(name = "-QuantidadeDependência", nullable = true, insertable = true, updatable = true)
    public Byte getAalQuantidadeDependência() {
        return aalQuantidadeDependência;
    }

    public void setAalQuantidadeDependência(Byte aalQuantidadeDependência) {
        this.aalQuantidadeDependência = aalQuantidadeDependência;
    }

    private Double percentualDependência;

    @Basic
    @javax.persistence.Column(name = "-PercentualDependência", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getPercentualDependência() {
        return percentualDependência;
    }

    public void setPercentualDependência(Double percentualDependência) {
        this.percentualDependência = percentualDependência;
    }

    private boolean aalEncerrado;

    @Basic
    @javax.persistence.Column(name = "-Encerrado", nullable = false, insertable = true, updatable = true)
    public boolean isAalEncerrado() {
        return aalEncerrado;
    }

    public void setAalEncerrado(boolean aalEncerrado) {
        this.aalEncerrado = aalEncerrado;
    }

    private boolean avaliação;

    @Basic
    @javax.persistence.Column(name = "-Avaliação", nullable = false, insertable = true, updatable = true)
    public boolean isAvaliação() {
        return avaliação;
    }

    public void setAvaliação(boolean avaliação) {
        this.avaliação = avaliação;
    }

    private boolean disciplinaGerminada;

    @Basic
    @javax.persistence.Column(name = "-DisciplinaGerminada", nullable = false, insertable = true, updatable = true)
    public boolean isDisciplinaGerminada() {
        return disciplinaGerminada;
    }

    public void setDisciplinaGerminada(boolean disciplinaGerminada) {
        this.disciplinaGerminada = disciplinaGerminada;
    }

    private Boolean notaColorida;

    @Basic
    @javax.persistence.Column(name = "-NotaColorida", nullable = true, insertable = true, updatable = true)
    public Boolean getNotaColorida() {
        return notaColorida;
    }

    public void setNotaColorida(Boolean notaColorida) {
        this.notaColorida = notaColorida;
    }

    private String período;

    @Basic
    @javax.persistence.Column(name = "-Período", nullable = true, insertable = true, updatable = true)
    public String getPeríodo() {
        return período;
    }

    public void setPeríodo(String período) {
        this.período = período;
    }

    private String períodoPlural;

    @Basic
    @javax.persistence.Column(name = "-PeríodoPlural", nullable = true, insertable = true, updatable = true)
    public String getPeríodoPlural() {
        return períodoPlural;
    }

    public void setPeríodoPlural(String períodoPlural) {
        this.períodoPlural = períodoPlural;
    }

    private String períodoAbreviado;

    @Basic
    @javax.persistence.Column(name = "-PeríodoAbreviado", nullable = true, insertable = true, updatable = true)
    public String getPeríodoAbreviado() {
        return períodoAbreviado;
    }

    public void setPeríodoAbreviado(String períodoAbreviado) {
        this.períodoAbreviado = períodoAbreviado;
    }

    private String períodoSAbreviado;

    @Basic
    @javax.persistence.Column(name = "-PeríodoSAbreviado", nullable = true, insertable = true, updatable = true)
    public String getPeríodoSAbreviado() {
        return períodoSAbreviado;
    }

    public void setPeríodoSAbreviado(String períodoSAbreviado) {
        this.períodoSAbreviado = períodoSAbreviado;
    }

    private String períodoSexo;

    @Basic
    @javax.persistence.Column(name = "-PeríodoSexo", nullable = true, insertable = true, updatable = true)
    public String getPeríodoSexo() {
        return períodoSexo;
    }

    public void setPeríodoSexo(String períodoSexo) {
        this.períodoSexo = períodoSexo;
    }

    private String aalNota;

    @Basic
    @javax.persistence.Column(name = "-Nota", nullable = true, insertable = true, updatable = true)
    public String getAalNota() {
        return aalNota;
    }

    public void setAalNota(String aalNota) {
        this.aalNota = aalNota;
    }

    private String notaPlural;

    @Basic
    @javax.persistence.Column(name = "-NotaPlural", nullable = true, insertable = true, updatable = true)
    public String getNotaPlural() {
        return notaPlural;
    }

    public void setNotaPlural(String notaPlural) {
        this.notaPlural = notaPlural;
    }

    private String notaAbreviada;

    @Basic
    @javax.persistence.Column(name = "-NotaAbreviada", nullable = true, insertable = true, updatable = true)
    public String getNotaAbreviada() {
        return notaAbreviada;
    }

    public void setNotaAbreviada(String notaAbreviada) {
        this.notaAbreviada = notaAbreviada;
    }

    private String notaSAbreviada;

    @Basic
    @javax.persistence.Column(name = "-NotaSAbreviada", nullable = true, insertable = true, updatable = true)
    public String getNotaSAbreviada() {
        return notaSAbreviada;
    }

    public void setNotaSAbreviada(String notaSAbreviada) {
        this.notaSAbreviada = notaSAbreviada;
    }

    private String notaSexo;

    @Basic
    @javax.persistence.Column(name = "-NotaSexo", nullable = true, insertable = true, updatable = true)
    public String getNotaSexo() {
        return notaSexo;
    }

    public void setNotaSexo(String notaSexo) {
        this.notaSexo = notaSexo;
    }

    private String anoNome;

    @Basic
    @javax.persistence.Column(name = "-AnoNome", nullable = true, insertable = true, updatable = true)
    public String getAnoNome() {
        return anoNome;
    }

    public void setAnoNome(String anoNome) {
        this.anoNome = anoNome;
    }

    private String anoAbreviado;

    @Basic
    @javax.persistence.Column(name = "-AnoAbreviado", nullable = true, insertable = true, updatable = true)
    public String getAnoAbreviado() {
        return anoAbreviado;
    }

    public void setAnoAbreviado(String anoAbreviado) {
        this.anoAbreviado = anoAbreviado;
    }

    private String aalRecuperação;

    @Basic
    @javax.persistence.Column(name = "-Recuperação", nullable = true, insertable = true, updatable = true)
    public String getAalRecuperação() {
        return aalRecuperação;
    }

    public void setAalRecuperação(String aalRecuperação) {
        this.aalRecuperação = aalRecuperação;
    }

    private String recuperaçãoAbreviada;

    @Basic
    @javax.persistence.Column(name = "-RecuperaçãoAbreviada", nullable = true, insertable = true, updatable = true)
    public String getRecuperaçãoAbreviada() {
        return recuperaçãoAbreviada;
    }

    public void setRecuperaçãoAbreviada(String recuperaçãoAbreviada) {
        this.recuperaçãoAbreviada = recuperaçãoAbreviada;
    }

    private String endereçoEletrônico;

    @Basic
    @javax.persistence.Column(name = "-EndereçoEletrônico", nullable = true, insertable = true, updatable = true)
    public String getEndereçoEletrônico() {
        return endereçoEletrônico;
    }

    public void setEndereçoEletrônico(String endereçoEletrônico) {
        this.endereçoEletrônico = endereçoEletrônico;
    }

    private boolean médiaTruncada;

    @Basic
    @javax.persistence.Column(name = "-MédiaTruncada", nullable = false, insertable = true, updatable = true)
    public boolean isMédiaTruncada() {
        return médiaTruncada;
    }

    public void setMédiaTruncada(boolean médiaTruncada) {
        this.médiaTruncada = médiaTruncada;
    }

    private boolean histórico1Dividido;

    @Basic
    @javax.persistence.Column(name = "-Histórico1Dividido", nullable = false, insertable = true, updatable = true)
    public boolean isHistórico1Dividido() {
        return histórico1Dividido;
    }

    public void setHistórico1Dividido(boolean histórico1Dividido) {
        this.histórico1Dividido = histórico1Dividido;
    }

    private boolean aalBloquearSemVaga;

    @Basic
    @javax.persistence.Column(name = "-BloquearSemVaga", nullable = false, insertable = true, updatable = true)
    public boolean isAalBloquearSemVaga() {
        return aalBloquearSemVaga;
    }

    public void setAalBloquearSemVaga(boolean aalBloquearSemVaga) {
        this.aalBloquearSemVaga = aalBloquearSemVaga;
    }

    private boolean gradeIndividual;

    @Basic
    @javax.persistence.Column(name = "-GradeIndividual", nullable = false, insertable = true, updatable = true)
    public boolean isGradeIndividual() {
        return gradeIndividual;
    }

    public void setGradeIndividual(boolean gradeIndividual) {
        this.gradeIndividual = gradeIndividual;
    }

    private boolean autenticadaSemImpressão;

    @Basic
    @javax.persistence.Column(name = "-AutenticadaSemImpressão", nullable = false, insertable = true, updatable = true)
    public boolean isAutenticadaSemImpressão() {
        return autenticadaSemImpressão;
    }

    public void setAutenticadaSemImpressão(boolean autenticadaSemImpressão) {
        this.autenticadaSemImpressão = autenticadaSemImpressão;
    }

    private Byte rendimentoTipoCobrança;

    @Basic
    @javax.persistence.Column(name = "-RendimentoTipoCobrança", nullable = true, insertable = true, updatable = true)
    public Byte getRendimentoTipoCobrança() {
        return rendimentoTipoCobrança;
    }

    public void setRendimentoTipoCobrança(Byte rendimentoTipoCobrança) {
        this.rendimentoTipoCobrança = rendimentoTipoCobrança;
    }

    private boolean rendimentoMédia;

    @Basic
    @javax.persistence.Column(name = "-RendimentoMédia", nullable = false, insertable = true, updatable = true)
    public boolean isRendimentoMédia() {
        return rendimentoMédia;
    }

    public void setRendimentoMédia(boolean rendimentoMédia) {
        this.rendimentoMédia = rendimentoMédia;
    }

    private boolean nãoImprimirControlParcela;

    @Basic
    @javax.persistence.Column(name = "-NãoImprimirControlParcela", nullable = false, insertable = true, updatable = true)
    public boolean isNãoImprimirControlParcela() {
        return nãoImprimirControlParcela;
    }

    public void setNãoImprimirControlParcela(boolean nãoImprimirControlParcela) {
        this.nãoImprimirControlParcela = nãoImprimirControlParcela;
    }

    private boolean pautaPontoFrequência;

    @Basic
    @javax.persistence.Column(name = "-PautaPontoFrequência", nullable = false, insertable = true, updatable = true)
    public boolean isPautaPontoFrequência() {
        return pautaPontoFrequência;
    }

    public void setPautaPontoFrequência(boolean pautaPontoFrequência) {
        this.pautaPontoFrequência = pautaPontoFrequência;
    }

    private boolean assinaturaDiretor;

    @Basic
    @javax.persistence.Column(name = "-AssinaturaDiretor", nullable = false, insertable = true, updatable = true)
    public boolean isAssinaturaDiretor() {
        return assinaturaDiretor;
    }

    public void setAssinaturaDiretor(boolean assinaturaDiretor) {
        this.assinaturaDiretor = assinaturaDiretor;
    }

    private Short duraçãoAula;

    @Basic
    @javax.persistence.Column(name = "-DuraçãoAula", nullable = true, insertable = true, updatable = true)
    public Short getDuraçãoAula() {
        return duraçãoAula;
    }

    public void setDuraçãoAula(Short duraçãoAula) {
        this.duraçãoAula = duraçãoAula;
    }

    private boolean usarChGrade;

    @Basic
    @javax.persistence.Column(name = "-UsarCHGrade", nullable = false, insertable = true, updatable = true)
    public boolean isUsarChGrade() {
        return usarChGrade;
    }

    public void setUsarChGrade(boolean usarChGrade) {
        this.usarChGrade = usarChGrade;
    }

    private boolean mensagemBoletoPadrão;

    @Basic
    @javax.persistence.Column(name = "-MensagemBoletoPadrão", nullable = false, insertable = true, updatable = true)
    public boolean isMensagemBoletoPadrão() {
        return mensagemBoletoPadrão;
    }

    public void setMensagemBoletoPadrão(boolean mensagemBoletoPadrão) {
        this.mensagemBoletoPadrão = mensagemBoletoPadrão;
    }

    private boolean pautaNãoCancelado;

    @Basic
    @javax.persistence.Column(name = "-PautaNãoCancelado", nullable = false, insertable = true, updatable = true)
    public boolean isPautaNãoCancelado() {
        return pautaNãoCancelado;
    }

    public void setPautaNãoCancelado(boolean pautaNãoCancelado) {
        this.pautaNãoCancelado = pautaNãoCancelado;
    }

    private String recuperação2;

    @Basic
    @javax.persistence.Column(name = "-Recuperação2", nullable = true, insertable = true, updatable = true)
    public String getRecuperação2() {
        return recuperação2;
    }

    public void setRecuperação2(String recuperação2) {
        this.recuperação2 = recuperação2;
    }

    private String recuperação2Abreviada;

    @Basic
    @javax.persistence.Column(name = "-Recuperação2Abreviada", nullable = true, insertable = true, updatable = true)
    public String getRecuperação2Abreviada() {
        return recuperação2Abreviada;
    }

    public void setRecuperação2Abreviada(String recuperação2Abreviada) {
        this.recuperação2Abreviada = recuperação2Abreviada;
    }

    private boolean ordenarDependência;

    @Basic
    @javax.persistence.Column(name = "-OrdenarDependência", nullable = false, insertable = true, updatable = true)
    public boolean isOrdenarDependência() {
        return ordenarDependência;
    }

    public void setOrdenarDependência(boolean ordenarDependência) {
        this.ordenarDependência = ordenarDependência;
    }

    private boolean pautaVisualizarDependência;

    @Basic
    @javax.persistence.Column(name = "-PautaVisualizarDependência", nullable = false, insertable = true, updatable = true)
    public boolean isPautaVisualizarDependência() {
        return pautaVisualizarDependência;
    }

    public void setPautaVisualizarDependência(boolean pautaVisualizarDependência) {
        this.pautaVisualizarDependência = pautaVisualizarDependência;
    }

    private byte[] carteirinha;

    @Basic
    @javax.persistence.Column(name = "-Carteirinha", nullable = true, insertable = true, updatable = true)
    public byte[] getCarteirinha() {
        return carteirinha;
    }

    public void setCarteirinha(byte[] carteirinha) {
        this.carteirinha = carteirinha;
    }

    private boolean carteirinhaLogo;

    @Basic
    @javax.persistence.Column(name = "-CarteirinhaLogo", nullable = false, insertable = true, updatable = true)
    public boolean isCarteirinhaLogo() {
        return carteirinhaLogo;
    }

    public void setCarteirinhaLogo(boolean carteirinhaLogo) {
        this.carteirinhaLogo = carteirinhaLogo;
    }

    private boolean carteirinhaBarra;

    @Basic
    @javax.persistence.Column(name = "-CarteirinhaBarra", nullable = false, insertable = true, updatable = true)
    public boolean isCarteirinhaBarra() {
        return carteirinhaBarra;
    }

    public void setCarteirinhaBarra(boolean carteirinhaBarra) {
        this.carteirinhaBarra = carteirinhaBarra;
    }

    private byte[] logoMarca;

    @Basic
    @javax.persistence.Column(name = "-LogoMarca", nullable = true, insertable = true, updatable = true)
    public byte[] getLogoMarca() {
        return logoMarca;
    }

    public void setLogoMarca(byte[] logoMarca) {
        this.logoMarca = logoMarca;
    }

    private String observação;

    @Basic
    @javax.persistence.Column(name = "-Observação", nullable = true, insertable = true, updatable = true)
    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

    private String tipoCobrança;

    @Basic
    @javax.persistence.Column(name = "-TipoCobrança", nullable = true, insertable = true, updatable = true)
    public String getTipoCobrança() {
        return tipoCobrança;
    }

    public void setTipoCobrança(String tipoCobrança) {
        this.tipoCobrança = tipoCobrança;
    }

    private String cartaInadimplente1;

    @Basic
    @javax.persistence.Column(name = "-CartaInadimplente1", nullable = true, insertable = true, updatable = true)
    public String getCartaInadimplente1() {
        return cartaInadimplente1;
    }

    public void setCartaInadimplente1(String cartaInadimplente1) {
        this.cartaInadimplente1 = cartaInadimplente1;
    }

    private String cartaInadimplente2;

    @Basic
    @javax.persistence.Column(name = "-CartaInadimplente2", nullable = true, insertable = true, updatable = true)
    public String getCartaInadimplente2() {
        return cartaInadimplente2;
    }

    public void setCartaInadimplente2(String cartaInadimplente2) {
        this.cartaInadimplente2 = cartaInadimplente2;
    }

    private Byte númeroSistema;

    @Basic
    @javax.persistence.Column(name = "-NúmeroSistema", nullable = true, insertable = true, updatable = true)
    public Byte getNúmeroSistema() {
        return númeroSistema;
    }

    public void setNúmeroSistema(Byte númeroSistema) {
        this.númeroSistema = númeroSistema;
    }

    private boolean semCorreção;

    @Basic
    @javax.persistence.Column(name = "-SemCorreção", nullable = false, insertable = true, updatable = true)
    public boolean isSemCorreção() {
        return semCorreção;
    }

    public void setSemCorreção(boolean semCorreção) {
        this.semCorreção = semCorreção;
    }

    private boolean financeiro;

    @Basic
    @javax.persistence.Column(name = "-Financeiro", nullable = false, insertable = true, updatable = true)
    public boolean isFinanceiro() {
        return financeiro;
    }

    public void setFinanceiro(boolean financeiro) {
        this.financeiro = financeiro;
    }

    private boolean cobrançaAutenticada;

    @Basic
    @javax.persistence.Column(name = "-CobrançaAutenticada", nullable = false, insertable = true, updatable = true)
    public boolean isCobrançaAutenticada() {
        return cobrançaAutenticada;
    }

    public void setCobrançaAutenticada(boolean cobrançaAutenticada) {
        this.cobrançaAutenticada = cobrançaAutenticada;
    }

    private Short codClienteAdvogado;

    @Basic
    @javax.persistence.Column(name = "-CodClienteAdvogado", nullable = true, insertable = true, updatable = true)
    public Short getCodClienteAdvogado() {
        return codClienteAdvogado;
    }

    public void setCodClienteAdvogado(Short codClienteAdvogado) {
        this.codClienteAdvogado = codClienteAdvogado;
    }

    private Short codTipoContratoAdvogado;

    @Basic
    @javax.persistence.Column(name = "-CodTipoContratoAdvogado", nullable = true, insertable = true, updatable = true)
    public Short getCodTipoContratoAdvogado() {
        return codTipoContratoAdvogado;
    }

    public void setCodTipoContratoAdvogado(Short codTipoContratoAdvogado) {
        this.codTipoContratoAdvogado = codTipoContratoAdvogado;
    }

    private String contratoFicha;

    @Basic
    @javax.persistence.Column(name = "-ContratoFicha", nullable = true, insertable = true, updatable = true)
    public String getContratoFicha() {
        return contratoFicha;
    }

    public void setContratoFicha(String contratoFicha) {
        this.contratoFicha = contratoFicha;
    }

    private Short rateioPrejuízo;

    @Basic
    @javax.persistence.Column(name = "-RateioPrejuízo", nullable = true, insertable = true, updatable = true)
    public Short getRateioPrejuízo() {
        return rateioPrejuízo;
    }

    public void setRateioPrejuízo(Short rateioPrejuízo) {
        this.rateioPrejuízo = rateioPrejuízo;
    }

    private String banco;

    @Basic
    @javax.persistence.Column(name = "-Banco", nullable = true, insertable = true, updatable = true)
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    private boolean aalRateioJuros;

    @Basic
    @javax.persistence.Column(name = "-RateioJuros", nullable = false, insertable = true, updatable = true)
    public boolean isAalRateioJuros() {
        return aalRateioJuros;
    }

    public void setAalRateioJuros(boolean aalRateioJuros) {
        this.aalRateioJuros = aalRateioJuros;
    }

    private boolean testemunhaContrato;

    @Basic
    @javax.persistence.Column(name = "-TestemunhaContrato", nullable = false, insertable = true, updatable = true)
    public boolean isTestemunhaContrato() {
        return testemunhaContrato;
    }

    public void setTestemunhaContrato(boolean testemunhaContrato) {
        this.testemunhaContrato = testemunhaContrato;
    }

    private Byte fonteContrato;

    @Basic
    @javax.persistence.Column(name = "-FonteContrato", nullable = true, insertable = true, updatable = true)
    public Byte getFonteContrato() {
        return fonteContrato;
    }

    public void setFonteContrato(Byte fonteContrato) {
        this.fonteContrato = fonteContrato;
    }

    private boolean boletimDependênica;

    @Basic
    @javax.persistence.Column(name = "-BoletimDependênica", nullable = false, insertable = true, updatable = true)
    public boolean isBoletimDependênica() {
        return boletimDependênica;
    }

    public void setBoletimDependênica(boolean boletimDependênica) {
        this.boletimDependênica = boletimDependênica;
    }

    private Byte númeroBimestre;

    @Basic
    @javax.persistence.Column(name = "-NúmeroBimestre", nullable = true, insertable = true, updatable = true)
    public Byte getNúmeroBimestre() {
        return númeroBimestre;
    }

    public void setNúmeroBimestre(Byte númeroBimestre) {
        this.númeroBimestre = númeroBimestre;
    }

    private Boolean classificaçãoAtualizada;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoAtualizada", nullable = true, insertable = true, updatable = true)
    public Boolean getClassificaçãoAtualizada() {
        return classificaçãoAtualizada;
    }

    public void setClassificaçãoAtualizada(Boolean classificaçãoAtualizada) {
        this.classificaçãoAtualizada = classificaçãoAtualizada;
    }

    private Boolean classificaçãoUsar;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoUsar", nullable = true, insertable = true, updatable = true)
    public Boolean getClassificaçãoUsar() {
        return classificaçãoUsar;
    }

    public void setClassificaçãoUsar(Boolean classificaçãoUsar) {
        this.classificaçãoUsar = classificaçãoUsar;
    }

    private boolean encerrado;

    @Basic
    @javax.persistence.Column(name = "Encerrado", nullable = false, insertable = true, updatable = true)
    public boolean isEncerrado() {
        return encerrado;
    }

    public void setEncerrado(boolean encerrado) {
        this.encerrado = encerrado;
    }

    private String ataAbertura;

    @Basic
    @javax.persistence.Column(name = "AtaAbertura", nullable = true, insertable = true, updatable = true)
    public String getAtaAbertura() {
        return ataAbertura;
    }

    public void setAtaAbertura(String ataAbertura) {
        this.ataAbertura = ataAbertura;
    }

    private String ataFechamento;

    @Basic
    @javax.persistence.Column(name = "AtaFechamento", nullable = true, insertable = true, updatable = true)
    public String getAtaFechamento() {
        return ataFechamento;
    }

    public void setAtaFechamento(String ataFechamento) {
        this.ataFechamento = ataFechamento;
    }

    private Timestamp dataEncerramento;

    @Basic
    @javax.persistence.Column(name = "DataEncerramento", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(Timestamp dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    private boolean usarAvaliações;

    @Basic
    @javax.persistence.Column(name = "UsarAvaliações", nullable = false, insertable = true, updatable = true)
    public boolean isUsarAvaliações() {
        return usarAvaliações;
    }

    public void setUsarAvaliações(boolean usarAvaliações) {
        this.usarAvaliações = usarAvaliações;
    }

    private boolean usarFrequência;

    @Basic
    @javax.persistence.Column(name = "UsarFrequência", nullable = false, insertable = true, updatable = true)
    public boolean isUsarFrequência() {
        return usarFrequência;
    }

    public void setUsarFrequência(boolean usarFrequência) {
        this.usarFrequência = usarFrequência;
    }

    private Integer codFórmulaAvaliação;

    @Basic
    @javax.persistence.Column(name = "CodFórmulaAvaliação", nullable = true, insertable = true, updatable = true)
    public Integer getCodFórmulaAvaliação() {
        return codFórmulaAvaliação;
    }

    public void setCodFórmulaAvaliação(Integer codFórmulaAvaliação) {
        this.codFórmulaAvaliação = codFórmulaAvaliação;
    }

    private boolean atualizandoMédia;

    @Basic
    @javax.persistence.Column(name = "AtualizandoMédia", nullable = false, insertable = true, updatable = true)
    public boolean isAtualizandoMédia() {
        return atualizandoMédia;
    }

    public void setAtualizandoMédia(boolean atualizandoMédia) {
        this.atualizandoMédia = atualizandoMédia;
    }

    private boolean médiaDisciplinas;

    @Basic
    @javax.persistence.Column(name = "MédiaDisciplinas", nullable = false, insertable = true, updatable = true)
    public boolean isMédiaDisciplinas() {
        return médiaDisciplinas;
    }

    public void setMédiaDisciplinas(boolean médiaDisciplinas) {
        this.médiaDisciplinas = médiaDisciplinas;
    }

    private Integer quantidadeReprovação;

    @Basic
    @javax.persistence.Column(name = "QuantidadeReprovação", nullable = true, insertable = true, updatable = true)
    public Integer getQuantidadeReprovação() {
        return quantidadeReprovação;
    }

    public void setQuantidadeReprovação(Integer quantidadeReprovação) {
        this.quantidadeReprovação = quantidadeReprovação;
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

    private boolean ativo;

    @Basic
    @javax.persistence.Column(name = "Ativo", nullable = false, insertable = true, updatable = true)
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    private Timestamp dataCriaAula;

    @Basic
    @javax.persistence.Column(name = "DataCriaAula", nullable = false, insertable = true, updatable = true)
    public Timestamp getDataCriaAula() {
        return dataCriaAula;
    }

    public void setDataCriaAula(Timestamp dataCriaAula) {
        this.dataCriaAula = dataCriaAula;
    }

    private int pautaQuebra;

    @Basic
    @javax.persistence.Column(name = "PautaQuebra", nullable = false, insertable = true, updatable = true)
    public int getPautaQuebra() {
        return pautaQuebra;
    }

    public void setPautaQuebra(int pautaQuebra) {
        this.pautaQuebra = pautaQuebra;
    }

    private Timestamp atualizandoMédiaData;

    @Basic
    @javax.persistence.Column(name = "AtualizandoMédiaData", nullable = true, insertable = true, updatable = true)
    public Timestamp getAtualizandoMédiaData() {
        return atualizandoMédiaData;
    }

    public void setAtualizandoMédiaData(Timestamp atualizandoMédiaData) {
        this.atualizandoMédiaData = atualizandoMédiaData;
    }

    private Byte casasDecimais;

    @Basic
    @javax.persistence.Column(name = "CasasDecimais", nullable = true, insertable = true, updatable = true)
    public Byte getCasasDecimais() {
        return casasDecimais;
    }

    public void setCasasDecimais(Byte casasDecimais) {
        this.casasDecimais = casasDecimais;
    }

    private Boolean arredondarAvaliação;

    @Basic
    @javax.persistence.Column(name = "ArredondarAvaliação", nullable = true, insertable = true, updatable = true)
    public Boolean getArredondarAvaliação() {
        return arredondarAvaliação;
    }

    public void setArredondarAvaliação(Boolean arredondarAvaliação) {
        this.arredondarAvaliação = arredondarAvaliação;
    }

    private Integer codFórmula;

    @Basic
    @javax.persistence.Column(name = "CodFórmula", nullable = true, insertable = true, updatable = true)
    public Integer getCodFórmula() {
        return codFórmula;
    }

    public void setCodFórmula(Integer codFórmula) {
        this.codFórmula = codFórmula;
    }

    private Integer aulaDuração;

    @Basic
    @javax.persistence.Column(name = "AulaDuração", nullable = true, insertable = true, updatable = true)
    public Integer getAulaDuração() {
        return aulaDuração;
    }

    public void setAulaDuração(Integer aulaDuração) {
        this.aulaDuração = aulaDuração;
    }

    private Boolean bloquearSemVaga;

    @Basic
    @javax.persistence.Column(name = "BloquearSemVaga", nullable = true, insertable = true, updatable = true)
    public Boolean getBloquearSemVaga() {
        return bloquearSemVaga;
    }

    public void setBloquearSemVaga(Boolean bloquearSemVaga) {
        this.bloquearSemVaga = bloquearSemVaga;
    }

    private Byte quantidadeAvaliação;

    @Basic
    @javax.persistence.Column(name = "QuantidadeAvaliação", nullable = true, insertable = true, updatable = true)
    public Byte getQuantidadeAvaliação() {
        return quantidadeAvaliação;
    }

    public void setQuantidadeAvaliação(Byte quantidadeAvaliação) {
        this.quantidadeAvaliação = quantidadeAvaliação;
    }

    private String avaliação1;

    @Basic
    @javax.persistence.Column(name = "Avaliação1", nullable = true, insertable = true, updatable = true)
    public String getAvaliação1() {
        return avaliação1;
    }

    public void setAvaliação1(String avaliação1) {
        this.avaliação1 = avaliação1;
    }

    private String avaliação2;

    @Basic
    @javax.persistence.Column(name = "Avaliação2", nullable = true, insertable = true, updatable = true)
    public String getAvaliação2() {
        return avaliação2;
    }

    public void setAvaliação2(String avaliação2) {
        this.avaliação2 = avaliação2;
    }

    private String avaliação3;

    @Basic
    @javax.persistence.Column(name = "Avaliação3", nullable = true, insertable = true, updatable = true)
    public String getAvaliação3() {
        return avaliação3;
    }

    public void setAvaliação3(String avaliação3) {
        this.avaliação3 = avaliação3;
    }

    private String avaliação4;

    @Basic
    @javax.persistence.Column(name = "Avaliação4", nullable = true, insertable = true, updatable = true)
    public String getAvaliação4() {
        return avaliação4;
    }

    public void setAvaliação4(String avaliação4) {
        this.avaliação4 = avaliação4;
    }

    private String avaliação5;

    @Basic
    @javax.persistence.Column(name = "Avaliação5", nullable = true, insertable = true, updatable = true)
    public String getAvaliação5() {
        return avaliação5;
    }

    public void setAvaliação5(String avaliação5) {
        this.avaliação5 = avaliação5;
    }

    private String avaliação6;

    @Basic
    @javax.persistence.Column(name = "Avaliação6", nullable = true, insertable = true, updatable = true)
    public String getAvaliação6() {
        return avaliação6;
    }

    public void setAvaliação6(String avaliação6) {
        this.avaliação6 = avaliação6;
    }

    private String avaliação7;

    @Basic
    @javax.persistence.Column(name = "Avaliação7", nullable = true, insertable = true, updatable = true)
    public String getAvaliação7() {
        return avaliação7;
    }

    public void setAvaliação7(String avaliação7) {
        this.avaliação7 = avaliação7;
    }

    private String avaliaçãoRecuperação;

    @Basic
    @javax.persistence.Column(name = "AvaliaçãoRecuperação", nullable = true, insertable = true, updatable = true)
    public String getAvaliaçãoRecuperação() {
        return avaliaçãoRecuperação;
    }

    public void setAvaliaçãoRecuperação(String avaliaçãoRecuperação) {
        this.avaliaçãoRecuperação = avaliaçãoRecuperação;
    }

    private String nota;

    @Basic
    @javax.persistence.Column(name = "Nota", nullable = true, insertable = true, updatable = true)
    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    private String recuperação;

    @Basic
    @javax.persistence.Column(name = "Recuperação", nullable = true, insertable = true, updatable = true)
    public String getRecuperação() {
        return recuperação;
    }

    public void setRecuperação(String recuperação) {
        this.recuperação = recuperação;
    }

    private String falta;

    @Basic
    @javax.persistence.Column(name = "Falta", nullable = true, insertable = true, updatable = true)
    public String getFalta() {
        return falta;
    }

    public void setFalta(String falta) {
        this.falta = falta;
    }

    private String médiaAnual;

    @Basic
    @javax.persistence.Column(name = "MédiaAnual", nullable = true, insertable = true, updatable = true)
    public String getMédiaAnual() {
        return médiaAnual;
    }

    public void setMédiaAnual(String médiaAnual) {
        this.médiaAnual = médiaAnual;
    }

    private String notaRecuperação;

    @Basic
    @javax.persistence.Column(name = "NotaRecuperação", nullable = true, insertable = true, updatable = true)
    public String getNotaRecuperação() {
        return notaRecuperação;
    }

    public void setNotaRecuperação(String notaRecuperação) {
        this.notaRecuperação = notaRecuperação;
    }

    private String notaRecuperação2;

    @Basic
    @javax.persistence.Column(name = "NotaRecuperação2", nullable = true, insertable = true, updatable = true)
    public String getNotaRecuperação2() {
        return notaRecuperação2;
    }

    public void setNotaRecuperação2(String notaRecuperação2) {
        this.notaRecuperação2 = notaRecuperação2;
    }

    private String médiaFinal;

    @Basic
    @javax.persistence.Column(name = "MédiaFinal", nullable = true, insertable = true, updatable = true)
    public String getMédiaFinal() {
        return médiaFinal;
    }

    public void setMédiaFinal(String médiaFinal) {
        this.médiaFinal = médiaFinal;
    }

    private String notaRecuperação3;

    @Basic
    @javax.persistence.Column(name = "NotaRecuperação3", nullable = true, insertable = true, updatable = true)
    public String getNotaRecuperação3() {
        return notaRecuperação3;
    }

    public void setNotaRecuperação3(String notaRecuperação3) {
        this.notaRecuperação3 = notaRecuperação3;
    }

    private boolean secretaria;

    @Basic
    @javax.persistence.Column(name = "Secretaria", nullable = false, insertable = true, updatable = true)
    public boolean isSecretaria() {
        return secretaria;
    }

    public void setSecretaria(boolean secretaria) {
        this.secretaria = secretaria;
    }

    private boolean tesouraria;

    @Basic
    @javax.persistence.Column(name = "Tesouraria", nullable = false, insertable = true, updatable = true)
    public boolean isTesouraria() {
        return tesouraria;
    }

    public void setTesouraria(boolean tesouraria) {
        this.tesouraria = tesouraria;
    }

    private boolean administrativo;

    @Basic
    @javax.persistence.Column(name = "Administrativo", nullable = false, insertable = true, updatable = true)
    public boolean isAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(boolean administrativo) {
        this.administrativo = administrativo;
    }

    private boolean biblioteca;

    @Basic
    @javax.persistence.Column(name = "Biblioteca", nullable = false, insertable = true, updatable = true)
    public boolean isBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(boolean biblioteca) {
        this.biblioteca = biblioteca;
    }

    private boolean inscrição;

    @Basic
    @javax.persistence.Column(name = "Inscrição", nullable = false, insertable = true, updatable = true)
    public boolean isInscrição() {
        return inscrição;
    }

    public void setInscrição(boolean inscrição) {
        this.inscrição = inscrição;
    }

    private boolean professor;

    @Basic
    @javax.persistence.Column(name = "Professor", nullable = false, insertable = true, updatable = true)
    public boolean isProfessor() {
        return professor;
    }

    public void setProfessor(boolean professor) {
        this.professor = professor;
    }

    private boolean aluno;

    @Basic
    @javax.persistence.Column(name = "Aluno", nullable = false, insertable = true, updatable = true)
    public boolean isAluno() {
        return aluno;
    }

    public void setAluno(boolean aluno) {
        this.aluno = aluno;
    }

    private boolean reserva;

    @Basic
    @javax.persistence.Column(name = "Reserva", nullable = false, insertable = true, updatable = true)
    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    private Long controle;

    @Basic
    @javax.persistence.Column(name = "Controle", nullable = true, insertable = true, updatable = true)
    public Long getControle() {
        return controle;
    }

    public void setControle(Long controle) {
        this.controle = controle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAnoLetivo that = (AcdAnoLetivo) o;

        if (aalBloquearSemVaga != that.aalBloquearSemVaga) return false;
        if (aalEncerrado != that.aalEncerrado) return false;
        if (aalRateioJuros != that.aalRateioJuros) return false;
        if (administrativo != that.administrativo) return false;
        if (aluno != that.aluno) return false;
        if (anoLetivo != that.anoLetivo) return false;
        if (anoLetivoAnterior != that.anoLetivoAnterior) return false;
        if (assinaturaDiretor != that.assinaturaDiretor) return false;
        if (ativo != that.ativo) return false;
        if (atualizandoMédia != that.atualizandoMédia) return false;
        if (autenticadaSemImpressão != that.autenticadaSemImpressão) return false;
        if (avaliação != that.avaliação) return false;
        if (biblioteca != that.biblioteca) return false;
        if (boletimDependênica != that.boletimDependênica) return false;
        if (carteirinhaBarra != that.carteirinhaBarra) return false;
        if (carteirinhaLogo != that.carteirinhaLogo) return false;
        if (cobrançaAutenticada != that.cobrançaAutenticada) return false;
        if (cobrançaAvançada != that.cobrançaAvançada) return false;
        if (codUnidade != that.codUnidade) return false;
        if (disciplinaGerminada != that.disciplinaGerminada) return false;
        if (encerrado != that.encerrado) return false;
        if (financeiro != that.financeiro) return false;
        if (gradeIndividual != that.gradeIndividual) return false;
        if (histórico1Dividido != that.histórico1Dividido) return false;
        if (inscrição != that.inscrição) return false;
        if (jurosSobreJuros != that.jurosSobreJuros) return false;
        if (mensagemBoletoPadrão != that.mensagemBoletoPadrão) return false;
        if (médiaDisciplinas != that.médiaDisciplinas) return false;
        if (médiaTruncada != that.médiaTruncada) return false;
        if (nãoImprimirControlParcela != that.nãoImprimirControlParcela) return false;
        if (ordenarDependência != that.ordenarDependência) return false;
        if (pautaNãoCancelado != that.pautaNãoCancelado) return false;
        if (pautaPontoFrequência != that.pautaPontoFrequência) return false;
        if (pautaPorDisciplina != that.pautaPorDisciplina) return false;
        if (pautaQuebra != that.pautaQuebra) return false;
        if (pautaVisualizarDependência != that.pautaVisualizarDependência) return false;
        if (professor != that.professor) return false;
        if (quantidadeAdaptação != that.quantidadeAdaptação) return false;
        if (quantidadeDependência != that.quantidadeDependência) return false;
        if (reclassificar != that.reclassificar) return false;
        if (rendimentoMédia != that.rendimentoMédia) return false;
        if (reserva != that.reserva) return false;
        if (secretaria != that.secretaria) return false;
        if (semCorreção != that.semCorreção) return false;
        if (tesouraria != that.tesouraria) return false;
        if (testemunhaContrato != that.testemunhaContrato) return false;
        if (usarAvaliações != that.usarAvaliações) return false;
        if (usarCarteirinha != that.usarCarteirinha) return false;
        if (usarChGrade != that.usarChGrade) return false;
        if (usarFrequência != that.usarFrequência) return false;
        if (usarVencimento != that.usarVencimento) return false;
        if (aaalQuantidadeAdaptação != null ? !aaalQuantidadeAdaptação.equals(that.aaalQuantidadeAdaptação) : that.aaalQuantidadeAdaptação != null)
            return false;
        if (aalNota != null ? !aalNota.equals(that.aalNota) : that.aalNota != null) return false;
        if (aalQuantidadeDependência != null ? !aalQuantidadeDependência.equals(that.aalQuantidadeDependência) : that.aalQuantidadeDependência != null)
            return false;
        if (aalRecuperação != null ? !aalRecuperação.equals(that.aalRecuperação) : that.aalRecuperação != null)
            return false;
        if (anoAbreviado != null ? !anoAbreviado.equals(that.anoAbreviado) : that.anoAbreviado != null) return false;
        if (anoNome != null ? !anoNome.equals(that.anoNome) : that.anoNome != null) return false;
        if (arredondarAvaliação != null ? !arredondarAvaliação.equals(that.arredondarAvaliação) : that.arredondarAvaliação != null)
            return false;
        if (ataAbertura != null ? !ataAbertura.equals(that.ataAbertura) : that.ataAbertura != null) return false;
        if (ataFechamento != null ? !ataFechamento.equals(that.ataFechamento) : that.ataFechamento != null)
            return false;
        if (atualizandoMédiaData != null ? !atualizandoMédiaData.equals(that.atualizandoMédiaData) : that.atualizandoMédiaData != null)
            return false;
        if (aulaDuração != null ? !aulaDuração.equals(that.aulaDuração) : that.aulaDuração != null) return false;
        if (avaliação1 != null ? !avaliação1.equals(that.avaliação1) : that.avaliação1 != null) return false;
        if (avaliação2 != null ? !avaliação2.equals(that.avaliação2) : that.avaliação2 != null) return false;
        if (avaliação3 != null ? !avaliação3.equals(that.avaliação3) : that.avaliação3 != null) return false;
        if (avaliação4 != null ? !avaliação4.equals(that.avaliação4) : that.avaliação4 != null) return false;
        if (avaliação5 != null ? !avaliação5.equals(that.avaliação5) : that.avaliação5 != null) return false;
        if (avaliação6 != null ? !avaliação6.equals(that.avaliação6) : that.avaliação6 != null) return false;
        if (avaliação7 != null ? !avaliação7.equals(that.avaliação7) : that.avaliação7 != null) return false;
        if (avaliaçãoRecuperação != null ? !avaliaçãoRecuperação.equals(that.avaliaçãoRecuperação) : that.avaliaçãoRecuperação != null)
            return false;
        if (banco != null ? !banco.equals(that.banco) : that.banco != null) return false;
        if (bloquearSemVaga != null ? !bloquearSemVaga.equals(that.bloquearSemVaga) : that.bloquearSemVaga != null)
            return false;
        if (cartaInadimplente1 != null ? !cartaInadimplente1.equals(that.cartaInadimplente1) : that.cartaInadimplente1 != null)
            return false;
        if (cartaInadimplente2 != null ? !cartaInadimplente2.equals(that.cartaInadimplente2) : that.cartaInadimplente2 != null)
            return false;
        if (!Arrays.equals(carteirinha, that.carteirinha)) return false;
        if (casasDecimais != null ? !casasDecimais.equals(that.casasDecimais) : that.casasDecimais != null)
            return false;
        if (classificaçãoAtualizada != null ? !classificaçãoAtualizada.equals(that.classificaçãoAtualizada) : that.classificaçãoAtualizada != null)
            return false;
        if (classificaçãoUsar != null ? !classificaçãoUsar.equals(that.classificaçãoUsar) : that.classificaçãoUsar != null)
            return false;
        if (codClienteAdvogado != null ? !codClienteAdvogado.equals(that.codClienteAdvogado) : that.codClienteAdvogado != null)
            return false;
        if (codFórmula != null ? !codFórmula.equals(that.codFórmula) : that.codFórmula != null) return false;
        if (codFórmulaAvaliação != null ? !codFórmulaAvaliação.equals(that.codFórmulaAvaliação) : that.codFórmulaAvaliação != null)
            return false;
        if (codTipoContratoAdvogado != null ? !codTipoContratoAdvogado.equals(that.codTipoContratoAdvogado) : that.codTipoContratoAdvogado != null)
            return false;
        if (codUnidadePadrão != null ? !codUnidadePadrão.equals(that.codUnidadePadrão) : that.codUnidadePadrão != null)
            return false;
        if (contratoFicha != null ? !contratoFicha.equals(that.contratoFicha) : that.contratoFicha != null)
            return false;
        if (controle != null ? !controle.equals(that.controle) : that.controle != null) return false;
        if (critérioPromossão != null ? !critérioPromossão.equals(that.critérioPromossão) : that.critérioPromossão != null)
            return false;
        if (dataCriaAula != null ? !dataCriaAula.equals(that.dataCriaAula) : that.dataCriaAula != null) return false;
        if (dataEncerramento != null ? !dataEncerramento.equals(that.dataEncerramento) : that.dataEncerramento != null)
            return false;
        if (diasLetivos != null ? !diasLetivos.equals(that.diasLetivos) : that.diasLetivos != null) return false;
        if (docDiasValidade != null ? !docDiasValidade.equals(that.docDiasValidade) : that.docDiasValidade != null)
            return false;
        if (duraçãoAula != null ? !duraçãoAula.equals(that.duraçãoAula) : that.duraçãoAula != null) return false;
        if (endereçoEletrônico != null ? !endereçoEletrônico.equals(that.endereçoEletrônico) : that.endereçoEletrônico != null)
            return false;
        if (falta != null ? !falta.equals(that.falta) : that.falta != null) return false;
        if (fonteContrato != null ? !fonteContrato.equals(that.fonteContrato) : that.fonteContrato != null)
            return false;
        if (históricoObs != null ? !históricoObs.equals(that.históricoObs) : that.históricoObs != null) return false;
        if (juros != null ? !juros.equals(that.juros) : that.juros != null) return false;
        if (jurosTipo != null ? !jurosTipo.equals(that.jurosTipo) : that.jurosTipo != null) return false;
        if (jurosValor != null ? !jurosValor.equals(that.jurosValor) : that.jurosValor != null) return false;
        if (!Arrays.equals(logoMarca, that.logoMarca)) return false;
        if (mensagemAtraso != null ? !mensagemAtraso.equals(that.mensagemAtraso) : that.mensagemAtraso != null)
            return false;
        if (mensagemBoletim != null ? !mensagemBoletim.equals(that.mensagemBoletim) : that.mensagemBoletim != null)
            return false;
        if (mensagemCompensação != null ? !mensagemCompensação.equals(that.mensagemCompensação) : that.mensagemCompensação != null)
            return false;
        if (mensagemSacado != null ? !mensagemSacado.equals(that.mensagemSacado) : that.mensagemSacado != null)
            return false;
        if (multa != null ? !multa.equals(that.multa) : that.multa != null) return false;
        if (médiaAnual != null ? !médiaAnual.equals(that.médiaAnual) : that.médiaAnual != null) return false;
        if (médiaFinal != null ? !médiaFinal.equals(that.médiaFinal) : that.médiaFinal != null) return false;
        if (nota != null ? !nota.equals(that.nota) : that.nota != null) return false;
        if (notaAbreviada != null ? !notaAbreviada.equals(that.notaAbreviada) : that.notaAbreviada != null)
            return false;
        if (notaColorida != null ? !notaColorida.equals(that.notaColorida) : that.notaColorida != null) return false;
        if (notaPlural != null ? !notaPlural.equals(that.notaPlural) : that.notaPlural != null) return false;
        if (notaRecuperação != null ? !notaRecuperação.equals(that.notaRecuperação) : that.notaRecuperação != null)
            return false;
        if (notaRecuperação2 != null ? !notaRecuperação2.equals(that.notaRecuperação2) : that.notaRecuperação2 != null)
            return false;
        if (notaRecuperação3 != null ? !notaRecuperação3.equals(that.notaRecuperação3) : that.notaRecuperação3 != null)
            return false;
        if (notaSAbreviada != null ? !notaSAbreviada.equals(that.notaSAbreviada) : that.notaSAbreviada != null)
            return false;
        if (notaSexo != null ? !notaSexo.equals(that.notaSexo) : that.notaSexo != null) return false;
        if (númeroBimestre != null ? !númeroBimestre.equals(that.númeroBimestre) : that.númeroBimestre != null)
            return false;
        if (númeroSistema != null ? !númeroSistema.equals(that.númeroSistema) : that.númeroSistema != null)
            return false;
        if (observação != null ? !observação.equals(that.observação) : that.observação != null) return false;
        if (percentualAdaptação != null ? !percentualAdaptação.equals(that.percentualAdaptação) : that.percentualAdaptação != null)
            return false;
        if (percentualDependência != null ? !percentualDependência.equals(that.percentualDependência) : that.percentualDependência != null)
            return false;
        if (período != null ? !período.equals(that.período) : that.período != null) return false;
        if (períodoAbreviado != null ? !períodoAbreviado.equals(that.períodoAbreviado) : that.períodoAbreviado != null)
            return false;
        if (períodoPlural != null ? !períodoPlural.equals(that.períodoPlural) : that.períodoPlural != null)
            return false;
        if (períodoSAbreviado != null ? !períodoSAbreviado.equals(that.períodoSAbreviado) : that.períodoSAbreviado != null)
            return false;
        if (períodoSexo != null ? !períodoSexo.equals(that.períodoSexo) : that.períodoSexo != null) return false;
        if (processoAvaliação != null ? !processoAvaliação.equals(that.processoAvaliação) : that.processoAvaliação != null)
            return false;
        if (quantidadeAvaliação != null ? !quantidadeAvaliação.equals(that.quantidadeAvaliação) : that.quantidadeAvaliação != null)
            return false;
        if (quantidadeRecuperação != null ? !quantidadeRecuperação.equals(that.quantidadeRecuperação) : that.quantidadeRecuperação != null)
            return false;
        if (quantidadeReprovação != null ? !quantidadeReprovação.equals(that.quantidadeReprovação) : that.quantidadeReprovação != null)
            return false;
        if (rateioJuros != null ? !rateioJuros.equals(that.rateioJuros) : that.rateioJuros != null) return false;
        if (rateioPrejuízo != null ? !rateioPrejuízo.equals(that.rateioPrejuízo) : that.rateioPrejuízo != null)
            return false;
        if (recuperação != null ? !recuperação.equals(that.recuperação) : that.recuperação != null) return false;
        if (recuperação2 != null ? !recuperação2.equals(that.recuperação2) : that.recuperação2 != null) return false;
        if (recuperação2Abreviada != null ? !recuperação2Abreviada.equals(that.recuperação2Abreviada) : that.recuperação2Abreviada != null)
            return false;
        if (recuperaçãoAbreviada != null ? !recuperaçãoAbreviada.equals(that.recuperaçãoAbreviada) : that.recuperaçãoAbreviada != null)
            return false;
        if (rendimentoTipoCobrança != null ? !rendimentoTipoCobrança.equals(that.rendimentoTipoCobrança) : that.rendimentoTipoCobrança != null)
            return false;
        if (tipoCobrança != null ? !tipoCobrança.equals(that.tipoCobrança) : that.tipoCobrança != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + anoLetivoAnterior;
        result = 31 * result + (pautaPorDisciplina ? 1 : 0);
        result = 31 * result + (multa != null ? multa.hashCode() : 0);
        result = 31 * result + (juros != null ? juros.hashCode() : 0);
        result = 31 * result + (jurosTipo != null ? jurosTipo.hashCode() : 0);
        result = 31 * result + (jurosSobreJuros ? 1 : 0);
        result = 31 * result + (jurosValor != null ? jurosValor.hashCode() : 0);
        result = 31 * result + (rateioJuros != null ? rateioJuros.hashCode() : 0);
        result = 31 * result + (cobrançaAvançada ? 1 : 0);
        result = 31 * result + (usarVencimento ? 1 : 0);
        result = 31 * result + (docDiasValidade != null ? docDiasValidade.hashCode() : 0);
        result = 31 * result + (usarCarteirinha ? 1 : 0);
        result = 31 * result + (diasLetivos != null ? diasLetivos.hashCode() : 0);
        result = 31 * result + quantidadeDependência;
        result = 31 * result + quantidadeAdaptação;
        result = 31 * result + (históricoObs != null ? históricoObs.hashCode() : 0);
        result = 31 * result + (critérioPromossão != null ? critérioPromossão.hashCode() : 0);
        result = 31 * result + (processoAvaliação != null ? processoAvaliação.hashCode() : 0);
        result = 31 * result + (reclassificar ? 1 : 0);
        result = 31 * result + (quantidadeRecuperação != null ? quantidadeRecuperação.hashCode() : 0);
        result = 31 * result + (codUnidadePadrão != null ? codUnidadePadrão.hashCode() : 0);
        result = 31 * result + (mensagemBoletim != null ? mensagemBoletim.hashCode() : 0);
        result = 31 * result + (aaalQuantidadeAdaptação != null ? aaalQuantidadeAdaptação.hashCode() : 0);
        result = 31 * result + (percentualAdaptação != null ? percentualAdaptação.hashCode() : 0);
        result = 31 * result + (aalQuantidadeDependência != null ? aalQuantidadeDependência.hashCode() : 0);
        result = 31 * result + (percentualDependência != null ? percentualDependência.hashCode() : 0);
        result = 31 * result + (aalEncerrado ? 1 : 0);
        result = 31 * result + (avaliação ? 1 : 0);
        result = 31 * result + (disciplinaGerminada ? 1 : 0);
        result = 31 * result + (notaColorida != null ? notaColorida.hashCode() : 0);
        result = 31 * result + (período != null ? período.hashCode() : 0);
        result = 31 * result + (períodoPlural != null ? períodoPlural.hashCode() : 0);
        result = 31 * result + (períodoAbreviado != null ? períodoAbreviado.hashCode() : 0);
        result = 31 * result + (períodoSAbreviado != null ? períodoSAbreviado.hashCode() : 0);
        result = 31 * result + (períodoSexo != null ? períodoSexo.hashCode() : 0);
        result = 31 * result + (aalNota != null ? aalNota.hashCode() : 0);
        result = 31 * result + (notaPlural != null ? notaPlural.hashCode() : 0);
        result = 31 * result + (notaAbreviada != null ? notaAbreviada.hashCode() : 0);
        result = 31 * result + (notaSAbreviada != null ? notaSAbreviada.hashCode() : 0);
        result = 31 * result + (notaSexo != null ? notaSexo.hashCode() : 0);
        result = 31 * result + (anoNome != null ? anoNome.hashCode() : 0);
        result = 31 * result + (anoAbreviado != null ? anoAbreviado.hashCode() : 0);
        result = 31 * result + (aalRecuperação != null ? aalRecuperação.hashCode() : 0);
        result = 31 * result + (recuperaçãoAbreviada != null ? recuperaçãoAbreviada.hashCode() : 0);
        result = 31 * result + (endereçoEletrônico != null ? endereçoEletrônico.hashCode() : 0);
        result = 31 * result + (médiaTruncada ? 1 : 0);
        result = 31 * result + (histórico1Dividido ? 1 : 0);
        result = 31 * result + (aalBloquearSemVaga ? 1 : 0);
        result = 31 * result + (gradeIndividual ? 1 : 0);
        result = 31 * result + (autenticadaSemImpressão ? 1 : 0);
        result = 31 * result + (rendimentoTipoCobrança != null ? rendimentoTipoCobrança.hashCode() : 0);
        result = 31 * result + (rendimentoMédia ? 1 : 0);
        result = 31 * result + (nãoImprimirControlParcela ? 1 : 0);
        result = 31 * result + (pautaPontoFrequência ? 1 : 0);
        result = 31 * result + (assinaturaDiretor ? 1 : 0);
        result = 31 * result + (duraçãoAula != null ? duraçãoAula.hashCode() : 0);
        result = 31 * result + (usarChGrade ? 1 : 0);
        result = 31 * result + (mensagemBoletoPadrão ? 1 : 0);
        result = 31 * result + (pautaNãoCancelado ? 1 : 0);
        result = 31 * result + (recuperação2 != null ? recuperação2.hashCode() : 0);
        result = 31 * result + (recuperação2Abreviada != null ? recuperação2Abreviada.hashCode() : 0);
        result = 31 * result + (ordenarDependência ? 1 : 0);
        result = 31 * result + (pautaVisualizarDependência ? 1 : 0);
        result = 31 * result + (carteirinha != null ? Arrays.hashCode(carteirinha) : 0);
        result = 31 * result + (carteirinhaLogo ? 1 : 0);
        result = 31 * result + (carteirinhaBarra ? 1 : 0);
        result = 31 * result + (logoMarca != null ? Arrays.hashCode(logoMarca) : 0);
        result = 31 * result + (observação != null ? observação.hashCode() : 0);
        result = 31 * result + (tipoCobrança != null ? tipoCobrança.hashCode() : 0);
        result = 31 * result + (cartaInadimplente1 != null ? cartaInadimplente1.hashCode() : 0);
        result = 31 * result + (cartaInadimplente2 != null ? cartaInadimplente2.hashCode() : 0);
        result = 31 * result + (númeroSistema != null ? númeroSistema.hashCode() : 0);
        result = 31 * result + (semCorreção ? 1 : 0);
        result = 31 * result + (financeiro ? 1 : 0);
        result = 31 * result + (cobrançaAutenticada ? 1 : 0);
        result = 31 * result + (codClienteAdvogado != null ? codClienteAdvogado.hashCode() : 0);
        result = 31 * result + (codTipoContratoAdvogado != null ? codTipoContratoAdvogado.hashCode() : 0);
        result = 31 * result + (contratoFicha != null ? contratoFicha.hashCode() : 0);
        result = 31 * result + (rateioPrejuízo != null ? rateioPrejuízo.hashCode() : 0);
        result = 31 * result + (banco != null ? banco.hashCode() : 0);
        result = 31 * result + (aalRateioJuros ? 1 : 0);
        result = 31 * result + (testemunhaContrato ? 1 : 0);
        result = 31 * result + (fonteContrato != null ? fonteContrato.hashCode() : 0);
        result = 31 * result + (boletimDependênica ? 1 : 0);
        result = 31 * result + (númeroBimestre != null ? númeroBimestre.hashCode() : 0);
        result = 31 * result + (classificaçãoAtualizada != null ? classificaçãoAtualizada.hashCode() : 0);
        result = 31 * result + (classificaçãoUsar != null ? classificaçãoUsar.hashCode() : 0);
        result = 31 * result + (encerrado ? 1 : 0);
        result = 31 * result + (ataAbertura != null ? ataAbertura.hashCode() : 0);
        result = 31 * result + (ataFechamento != null ? ataFechamento.hashCode() : 0);
        result = 31 * result + (dataEncerramento != null ? dataEncerramento.hashCode() : 0);
        result = 31 * result + (usarAvaliações ? 1 : 0);
        result = 31 * result + (usarFrequência ? 1 : 0);
        result = 31 * result + (codFórmulaAvaliação != null ? codFórmulaAvaliação.hashCode() : 0);
        result = 31 * result + (atualizandoMédia ? 1 : 0);
        result = 31 * result + (médiaDisciplinas ? 1 : 0);
        result = 31 * result + (quantidadeReprovação != null ? quantidadeReprovação.hashCode() : 0);
        result = 31 * result + (mensagemSacado != null ? mensagemSacado.hashCode() : 0);
        result = 31 * result + (mensagemAtraso != null ? mensagemAtraso.hashCode() : 0);
        result = 31 * result + (mensagemCompensação != null ? mensagemCompensação.hashCode() : 0);
        result = 31 * result + (ativo ? 1 : 0);
        result = 31 * result + (dataCriaAula != null ? dataCriaAula.hashCode() : 0);
        result = 31 * result + pautaQuebra;
        result = 31 * result + (atualizandoMédiaData != null ? atualizandoMédiaData.hashCode() : 0);
        result = 31 * result + (casasDecimais != null ? casasDecimais.hashCode() : 0);
        result = 31 * result + (arredondarAvaliação != null ? arredondarAvaliação.hashCode() : 0);
        result = 31 * result + (codFórmula != null ? codFórmula.hashCode() : 0);
        result = 31 * result + (aulaDuração != null ? aulaDuração.hashCode() : 0);
        result = 31 * result + (bloquearSemVaga != null ? bloquearSemVaga.hashCode() : 0);
        result = 31 * result + (quantidadeAvaliação != null ? quantidadeAvaliação.hashCode() : 0);
        result = 31 * result + (avaliação1 != null ? avaliação1.hashCode() : 0);
        result = 31 * result + (avaliação2 != null ? avaliação2.hashCode() : 0);
        result = 31 * result + (avaliação3 != null ? avaliação3.hashCode() : 0);
        result = 31 * result + (avaliação4 != null ? avaliação4.hashCode() : 0);
        result = 31 * result + (avaliação5 != null ? avaliação5.hashCode() : 0);
        result = 31 * result + (avaliação6 != null ? avaliação6.hashCode() : 0);
        result = 31 * result + (avaliação7 != null ? avaliação7.hashCode() : 0);
        result = 31 * result + (avaliaçãoRecuperação != null ? avaliaçãoRecuperação.hashCode() : 0);
        result = 31 * result + (nota != null ? nota.hashCode() : 0);
        result = 31 * result + (recuperação != null ? recuperação.hashCode() : 0);
        result = 31 * result + (falta != null ? falta.hashCode() : 0);
        result = 31 * result + (médiaAnual != null ? médiaAnual.hashCode() : 0);
        result = 31 * result + (notaRecuperação != null ? notaRecuperação.hashCode() : 0);
        result = 31 * result + (notaRecuperação2 != null ? notaRecuperação2.hashCode() : 0);
        result = 31 * result + (médiaFinal != null ? médiaFinal.hashCode() : 0);
        result = 31 * result + (notaRecuperação3 != null ? notaRecuperação3.hashCode() : 0);
        result = 31 * result + (secretaria ? 1 : 0);
        result = 31 * result + (tesouraria ? 1 : 0);
        result = 31 * result + (administrativo ? 1 : 0);
        result = 31 * result + (biblioteca ? 1 : 0);
        result = 31 * result + (inscrição ? 1 : 0);
        result = 31 * result + (professor ? 1 : 0);
        result = 31 * result + (aluno ? 1 : 0);
        result = 31 * result + (reserva ? 1 : 0);
        result = 31 * result + (controle != null ? controle.hashCode() : 0);
        return result;
    }
}
