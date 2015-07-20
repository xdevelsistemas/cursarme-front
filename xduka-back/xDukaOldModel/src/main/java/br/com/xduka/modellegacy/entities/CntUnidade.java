package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class CntUnidade {
    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private String unidade;

    @Basic
    @javax.persistence.Column(name = "Unidade", nullable = true, insertable = true, updatable = true)
    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    private String empresaDocumento;

    @Basic
    @javax.persistence.Column(name = "EmpresaDocumento", nullable = true, insertable = true, updatable = true)
    public String getEmpresaDocumento() {
        return empresaDocumento;
    }

    public void setEmpresaDocumento(String empresaDocumento) {
        this.empresaDocumento = empresaDocumento;
    }

    private String empresaFinanceiro;

    @Basic
    @javax.persistence.Column(name = "EmpresaFinanceiro", nullable = true, insertable = true, updatable = true)
    public String getEmpresaFinanceiro() {
        return empresaFinanceiro;
    }

    public void setEmpresaFinanceiro(String empresaFinanceiro) {
        this.empresaFinanceiro = empresaFinanceiro;
    }

    private String empresaComplemento;

    @Basic
    @javax.persistence.Column(name = "EmpresaComplemento", nullable = true, insertable = true, updatable = true)
    public String getEmpresaComplemento() {
        return empresaComplemento;
    }

    public void setEmpresaComplemento(String empresaComplemento) {
        this.empresaComplemento = empresaComplemento;
    }

    private Integer matrículaInício;

    @Basic
    @javax.persistence.Column(name = "MatrículaInício", nullable = true, insertable = true, updatable = true)
    public Integer getMatrículaInício() {
        return matrículaInício;
    }

    public void setMatrículaInício(Integer matrículaInício) {
        this.matrículaInício = matrículaInício;
    }

    private Integer matrículaFim;

    @Basic
    @javax.persistence.Column(name = "MatrículaFim", nullable = true, insertable = true, updatable = true)
    public Integer getMatrículaFim() {
        return matrículaFim;
    }

    public void setMatrículaFim(Integer matrículaFim) {
        this.matrículaFim = matrículaFim;
    }

    private Integer matrículaUtilizada;

    @Basic
    @javax.persistence.Column(name = "MatrículaUtilizada", nullable = true, insertable = true, updatable = true)
    public Integer getMatrículaUtilizada() {
        return matrículaUtilizada;
    }

    public void setMatrículaUtilizada(Integer matrículaUtilizada) {
        this.matrículaUtilizada = matrículaUtilizada;
    }

    private int codRelacionamentoUtilizado;

    @Basic
    @javax.persistence.Column(name = "CodRelacionamentoUtilizado", nullable = false, insertable = true, updatable = true)
    public int getCodRelacionamentoUtilizado() {
        return codRelacionamentoUtilizado;
    }

    public void setCodRelacionamentoUtilizado(int codRelacionamentoUtilizado) {
        this.codRelacionamentoUtilizado = codRelacionamentoUtilizado;
    }

    private Byte codSituaçãoNãoMatrículado;

    @Basic
    @javax.persistence.Column(name = "CodSituaçãoNãoMatrículado", nullable = true, insertable = true, updatable = true)
    public Byte getCodSituaçãoNãoMatrículado() {
        return codSituaçãoNãoMatrículado;
    }

    public void setCodSituaçãoNãoMatrículado(Byte codSituaçãoNãoMatrículado) {
        this.codSituaçãoNãoMatrículado = codSituaçãoNãoMatrículado;
    }

    private Byte codSituaçãoMatrículaFinanceira;

    @Basic
    @javax.persistence.Column(name = "CodSituaçãoMatrículaFinanceira", nullable = true, insertable = true, updatable = true)
    public Byte getCodSituaçãoMatrículaFinanceira() {
        return codSituaçãoMatrículaFinanceira;
    }

    public void setCodSituaçãoMatrículaFinanceira(Byte codSituaçãoMatrículaFinanceira) {
        this.codSituaçãoMatrículaFinanceira = codSituaçãoMatrículaFinanceira;
    }

    private Byte codSituaçãoNormal;

    @Basic
    @javax.persistence.Column(name = "CodSituaçãoNormal", nullable = true, insertable = true, updatable = true)
    public Byte getCodSituaçãoNormal() {
        return codSituaçãoNormal;
    }

    public void setCodSituaçãoNormal(Byte codSituaçãoNormal) {
        this.codSituaçãoNormal = codSituaçãoNormal;
    }

    private String unidadeSigla;

    @Basic
    @javax.persistence.Column(name = "UnidadeSigla", nullable = true, insertable = true, updatable = true)
    public String getUnidadeSigla() {
        return unidadeSigla;
    }

    public void setUnidadeSigla(String unidadeSigla) {
        this.unidadeSigla = unidadeSigla;
    }

    private String unidadeEndereço;

    @Basic
    @javax.persistence.Column(name = "UnidadeEndereço", nullable = true, insertable = true, updatable = true)
    public String getUnidadeEndereço() {
        return unidadeEndereço;
    }

    public void setUnidadeEndereço(String unidadeEndereço) {
        this.unidadeEndereço = unidadeEndereço;
    }

    private String unidadeBairro;

    @Basic
    @javax.persistence.Column(name = "UnidadeBairro", nullable = true, insertable = true, updatable = true)
    public String getUnidadeBairro() {
        return unidadeBairro;
    }

    public void setUnidadeBairro(String unidadeBairro) {
        this.unidadeBairro = unidadeBairro;
    }

    private String unidadeCidade;

    @Basic
    @javax.persistence.Column(name = "UnidadeCidade", nullable = true, insertable = true, updatable = true)
    public String getUnidadeCidade() {
        return unidadeCidade;
    }

    public void setUnidadeCidade(String unidadeCidade) {
        this.unidadeCidade = unidadeCidade;
    }

    private String unidadeUf;

    @Basic
    @javax.persistence.Column(name = "UnidadeUF", nullable = true, insertable = true, updatable = true)
    public String getUnidadeUf() {
        return unidadeUf;
    }

    public void setUnidadeUf(String unidadeUf) {
        this.unidadeUf = unidadeUf;
    }

    private String unidadeAutorização;

    @Basic
    @javax.persistence.Column(name = "UnidadeAutorização", nullable = true, insertable = true, updatable = true)
    public String getUnidadeAutorização() {
        return unidadeAutorização;
    }

    public void setUnidadeAutorização(String unidadeAutorização) {
        this.unidadeAutorização = unidadeAutorização;
    }

    private String unidadeObservação;

    @Basic
    @javax.persistence.Column(name = "UnidadeObservação", nullable = true, insertable = true, updatable = true)
    public String getUnidadeObservação() {
        return unidadeObservação;
    }

    public void setUnidadeObservação(String unidadeObservação) {
        this.unidadeObservação = unidadeObservação;
    }

    private boolean matriculaInadimplente;

    @Basic
    @javax.persistence.Column(name = "MatriculaInadimplente", nullable = false, insertable = true, updatable = true)
    public boolean isMatriculaInadimplente() {
        return matriculaInadimplente;
    }

    public void setMatriculaInadimplente(boolean matriculaInadimplente) {
        this.matriculaInadimplente = matriculaInadimplente;
    }

    private boolean informatizada;

    @Basic
    @javax.persistence.Column(name = "Informatizada", nullable = false, insertable = true, updatable = true)
    public boolean isInformatizada() {
        return informatizada;
    }

    public void setInformatizada(boolean informatizada) {
        this.informatizada = informatizada;
    }

    private boolean incluindoAlunosPauta;

    @Basic
    @javax.persistence.Column(name = "IncluindoAlunosPauta", nullable = false, insertable = true, updatable = true)
    public boolean isIncluindoAlunosPauta() {
        return incluindoAlunosPauta;
    }

    public void setIncluindoAlunosPauta(boolean incluindoAlunosPauta) {
        this.incluindoAlunosPauta = incluindoAlunosPauta;
    }

    private byte[] logotipo;

    @Basic
    @javax.persistence.Column(name = "Logotipo", nullable = true, insertable = true, updatable = true)
    public byte[] getLogotipo() {
        return logotipo;
    }

    public void setLogotipo(byte[] logotipo) {
        this.logotipo = logotipo;
    }

    private Byte logotipoForma;

    @Basic
    @javax.persistence.Column(name = "LogotipoForma", nullable = true, insertable = true, updatable = true)
    public Byte getLogotipoForma() {
        return logotipoForma;
    }

    public void setLogotipoForma(Byte logotipoForma) {
        this.logotipoForma = logotipoForma;
    }

    private Integer logotipoLargura;

    @Basic
    @javax.persistence.Column(name = "LogotipoLargura", nullable = true, insertable = true, updatable = true)
    public Integer getLogotipoLargura() {
        return logotipoLargura;
    }

    public void setLogotipoLargura(Integer logotipoLargura) {
        this.logotipoLargura = logotipoLargura;
    }

    private Integer logotipoAltura;

    @Basic
    @javax.persistence.Column(name = "LogotipoAltura", nullable = true, insertable = true, updatable = true)
    public Integer getLogotipoAltura() {
        return logotipoAltura;
    }

    public void setLogotipoAltura(Integer logotipoAltura) {
        this.logotipoAltura = logotipoAltura;
    }

    private String cgc;

    @Basic
    @javax.persistence.Column(name = "CGC", nullable = true, insertable = true, updatable = true)
    public String getCgc() {
        return cgc;
    }

    public void setCgc(String cgc) {
        this.cgc = cgc;
    }

    private String inscriçãoMunicipal;

    @Basic
    @javax.persistence.Column(name = "InscriçãoMunicipal", nullable = true, insertable = true, updatable = true)
    public String getInscriçãoMunicipal() {
        return inscriçãoMunicipal;
    }

    public void setInscriçãoMunicipal(String inscriçãoMunicipal) {
        this.inscriçãoMunicipal = inscriçãoMunicipal;
    }

    private String bloquetoAutorização;

    @Basic
    @javax.persistence.Column(name = "BloquetoAutorização", nullable = true, insertable = true, updatable = true)
    public String getBloquetoAutorização() {
        return bloquetoAutorização;
    }

    public void setBloquetoAutorização(String bloquetoAutorização) {
        this.bloquetoAutorização = bloquetoAutorização;
    }

    private String autorização;

    @Basic
    @javax.persistence.Column(name = "Autorização", nullable = true, insertable = true, updatable = true)
    public String getAutorização() {
        return autorização;
    }

    public void setAutorização(String autorização) {
        this.autorização = autorização;
    }

    private Timestamp autorizaçãoPublicação;

    @Basic
    @javax.persistence.Column(name = "AutorizaçãoPublicação", nullable = true, insertable = true, updatable = true)
    public Timestamp getAutorizaçãoPublicação() {
        return autorizaçãoPublicação;
    }

    public void setAutorizaçãoPublicação(Timestamp autorizaçãoPublicação) {
        this.autorizaçãoPublicação = autorizaçãoPublicação;
    }

    private String reconhecimento;

    @Basic
    @javax.persistence.Column(name = "Reconhecimento", nullable = true, insertable = true, updatable = true)
    public String getReconhecimento() {
        return reconhecimento;
    }

    public void setReconhecimento(String reconhecimento) {
        this.reconhecimento = reconhecimento;
    }

    private Timestamp reconhecimentoPublicação;

    @Basic
    @javax.persistence.Column(name = "ReconhecimentoPublicação", nullable = true, insertable = true, updatable = true)
    public Timestamp getReconhecimentoPublicação() {
        return reconhecimentoPublicação;
    }

    public void setReconhecimentoPublicação(Timestamp reconhecimentoPublicação) {
        this.reconhecimentoPublicação = reconhecimentoPublicação;
    }

    private String diretor;

    @Basic
    @javax.persistence.Column(name = "Diretor", nullable = true, insertable = true, updatable = true)
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    private String diretorRegistro;

    @Basic
    @javax.persistence.Column(name = "DiretorRegistro", nullable = true, insertable = true, updatable = true)
    public String getDiretorRegistro() {
        return diretorRegistro;
    }

    public void setDiretorRegistro(String diretorRegistro) {
        this.diretorRegistro = diretorRegistro;
    }

    private String diretorAutorização;

    @Basic
    @javax.persistence.Column(name = "DiretorAutorização", nullable = true, insertable = true, updatable = true)
    public String getDiretorAutorização() {
        return diretorAutorização;
    }

    public void setDiretorAutorização(String diretorAutorização) {
        this.diretorAutorização = diretorAutorização;
    }

    private String secretário;

    @Basic
    @javax.persistence.Column(name = "Secretário", nullable = true, insertable = true, updatable = true)
    public String getSecretário() {
        return secretário;
    }

    public void setSecretário(String secretário) {
        this.secretário = secretário;
    }

    private String secretárioRegistro;

    @Basic
    @javax.persistence.Column(name = "SecretárioRegistro", nullable = true, insertable = true, updatable = true)
    public String getSecretárioRegistro() {
        return secretárioRegistro;
    }

    public void setSecretárioRegistro(String secretárioRegistro) {
        this.secretárioRegistro = secretárioRegistro;
    }

    private String secretárioAutorização;

    @Basic
    @javax.persistence.Column(name = "SecretárioAutorização", nullable = true, insertable = true, updatable = true)
    public String getSecretárioAutorização() {
        return secretárioAutorização;
    }

    public void setSecretárioAutorização(String secretárioAutorização) {
        this.secretárioAutorização = secretárioAutorização;
    }

    private String unidadeCep;

    @Basic
    @javax.persistence.Column(name = "UnidadeCEP", nullable = true, insertable = true, updatable = true)
    public String getUnidadeCep() {
        return unidadeCep;
    }

    public void setUnidadeCep(String unidadeCep) {
        this.unidadeCep = unidadeCep;
    }

    private String codNegativação;

    @Basic
    @javax.persistence.Column(name = "CodNegativação", nullable = true, insertable = true, updatable = true)
    public String getCodNegativação() {
        return codNegativação;
    }

    public void setCodNegativação(String codNegativação) {
        this.codNegativação = codNegativação;
    }

    private boolean bloquearMovimento;

    @Basic
    @javax.persistence.Column(name = "BloquearMovimento", nullable = false, insertable = true, updatable = true)
    public boolean isBloquearMovimento() {
        return bloquearMovimento;
    }

    public void setBloquearMovimento(boolean bloquearMovimento) {
        this.bloquearMovimento = bloquearMovimento;
    }

    private boolean utilizarAf;

    @Basic
    @javax.persistence.Column(name = "UtilizarAF", nullable = false, insertable = true, updatable = true)
    public boolean isUtilizarAf() {
        return utilizarAf;
    }

    public void setUtilizarAf(boolean utilizarAf) {
        this.utilizarAf = utilizarAf;
    }

    private Double valorLivreAf;

    @Basic
    @javax.persistence.Column(name = "ValorLivreAF", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getValorLivreAf() {
        return valorLivreAf;
    }

    public void setValorLivreAf(Double valorLivreAf) {
        this.valorLivreAf = valorLivreAf;
    }

    private boolean utilizarOrçamento;

    @Basic
    @javax.persistence.Column(name = "UtilizarOrçamento", nullable = false, insertable = true, updatable = true)
    public boolean isUtilizarOrçamento() {
        return utilizarOrçamento;
    }

    public void setUtilizarOrçamento(boolean utilizarOrçamento) {
        this.utilizarOrçamento = utilizarOrçamento;
    }

    private Double valorLivreOrçamento;

    @Basic
    @javax.persistence.Column(name = "ValorLivreOrçamento", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getValorLivreOrçamento() {
        return valorLivreOrçamento;
    }

    public void setValorLivreOrçamento(Double valorLivreOrçamento) {
        this.valorLivreOrçamento = valorLivreOrçamento;
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

    private boolean semSábado;

    @Basic
    @javax.persistence.Column(name = "SemSábado", nullable = false, insertable = true, updatable = true)
    public boolean isSemSábado() {
        return semSábado;
    }

    public void setSemSábado(boolean semSábado) {
        this.semSábado = semSábado;
    }

    private boolean semDomingo;

    @Basic
    @javax.persistence.Column(name = "SemDomingo", nullable = false, insertable = true, updatable = true)
    public boolean isSemDomingo() {
        return semDomingo;
    }

    public void setSemDomingo(boolean semDomingo) {
        this.semDomingo = semDomingo;
    }

    private boolean lançarDiferença;

    @Basic
    @javax.persistence.Column(name = "LançarDiferença", nullable = false, insertable = true, updatable = true)
    public boolean isLançarDiferença() {
        return lançarDiferença;
    }

    public void setLançarDiferença(boolean lançarDiferença) {
        this.lançarDiferença = lançarDiferença;
    }

    private Byte tipoCobrançaCrédito;

    @Basic
    @javax.persistence.Column(name = "TipoCobrançaCrédito", nullable = true, insertable = true, updatable = true)
    public Byte getTipoCobrançaCrédito() {
        return tipoCobrançaCrédito;
    }

    public void setTipoCobrançaCrédito(Byte tipoCobrançaCrédito) {
        this.tipoCobrançaCrédito = tipoCobrançaCrédito;
    }

    private Byte tipoCobrançaDébito;

    @Basic
    @javax.persistence.Column(name = "TipoCobrançaDébito", nullable = true, insertable = true, updatable = true)
    public Byte getTipoCobrançaDébito() {
        return tipoCobrançaDébito;
    }

    public void setTipoCobrançaDébito(Byte tipoCobrançaDébito) {
        this.tipoCobrançaDébito = tipoCobrançaDébito;
    }

    private boolean valorPagoMenor;

    @Basic
    @javax.persistence.Column(name = "ValorPagoMenor", nullable = false, insertable = true, updatable = true)
    public boolean isValorPagoMenor() {
        return valorPagoMenor;
    }

    public void setValorPagoMenor(boolean valorPagoMenor) {
        this.valorPagoMenor = valorPagoMenor;
    }

    private String unidadeFax;

    @Basic
    @javax.persistence.Column(name = "UnidadeFax", nullable = true, insertable = true, updatable = true)
    public String getUnidadeFax() {
        return unidadeFax;
    }

    public void setUnidadeFax(String unidadeFax) {
        this.unidadeFax = unidadeFax;
    }

    private String unidadeTelefone;

    @Basic
    @javax.persistence.Column(name = "UnidadeTelefone", nullable = true, insertable = true, updatable = true)
    public String getUnidadeTelefone() {
        return unidadeTelefone;
    }

    public void setUnidadeTelefone(String unidadeTelefone) {
        this.unidadeTelefone = unidadeTelefone;
    }

    private Byte codSituaçãoNãoRematricular;

    @Basic
    @javax.persistence.Column(name = "CodSituaçãoNãoRematricular", nullable = true, insertable = true, updatable = true)
    public Byte getCodSituaçãoNãoRematricular() {
        return codSituaçãoNãoRematricular;
    }

    public void setCodSituaçãoNãoRematricular(Byte codSituaçãoNãoRematricular) {
        this.codSituaçãoNãoRematricular = codSituaçãoNãoRematricular;
    }

    private String negativaçãoCidade;

    @Basic
    @javax.persistence.Column(name = "NegativaçãoCidade", nullable = true, insertable = true, updatable = true)
    public String getNegativaçãoCidade() {
        return negativaçãoCidade;
    }

    public void setNegativaçãoCidade(String negativaçãoCidade) {
        this.negativaçãoCidade = negativaçãoCidade;
    }

    private String negativaçãoUf;

    @Basic
    @javax.persistence.Column(name = "NegativaçãoUF", nullable = true, insertable = true, updatable = true)
    public String getNegativaçãoUf() {
        return negativaçãoUf;
    }

    public void setNegativaçãoUf(String negativaçãoUf) {
        this.negativaçãoUf = negativaçãoUf;
    }

    private boolean nãoAdiantarPagto;

    @Basic
    @javax.persistence.Column(name = "NãoAdiantarPagto", nullable = false, insertable = true, updatable = true)
    public boolean isNãoAdiantarPagto() {
        return nãoAdiantarPagto;
    }

    public void setNãoAdiantarPagto(boolean nãoAdiantarPagto) {
        this.nãoAdiantarPagto = nãoAdiantarPagto;
    }

    private boolean bloquearAdiantamentoPagto;

    @Basic
    @javax.persistence.Column(name = "BloquearAdiantamentoPagto", nullable = false, insertable = true, updatable = true)
    public boolean isBloquearAdiantamentoPagto() {
        return bloquearAdiantamentoPagto;
    }

    public void setBloquearAdiantamentoPagto(boolean bloquearAdiantamentoPagto) {
        this.bloquearAdiantamentoPagto = bloquearAdiantamentoPagto;
    }

    private Byte créditoTipoCobrança;

    @Basic
    @javax.persistence.Column(name = "CréditoTipoCobrança", nullable = true, insertable = true, updatable = true)
    public Byte getCréditoTipoCobrança() {
        return créditoTipoCobrança;
    }

    public void setCréditoTipoCobrança(Byte créditoTipoCobrança) {
        this.créditoTipoCobrança = créditoTipoCobrança;
    }

    private Integer codMovimento;

    @Basic
    @javax.persistence.Column(name = "CodMovimento", nullable = true, insertable = true, updatable = true)
    public Integer getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(Integer codMovimento) {
        this.codMovimento = codMovimento;
    }

    private Integer codAutorização;

    @Basic
    @javax.persistence.Column(name = "CodAutorização", nullable = true, insertable = true, updatable = true)
    public Integer getCodAutorização() {
        return codAutorização;
    }

    public void setCodAutorização(Integer codAutorização) {
        this.codAutorização = codAutorização;
    }

    private Integer codRelacionamentoCobrançaUtilizado;

    @Basic
    @javax.persistence.Column(name = "CodRelacionamentoCobrançaUtilizado", nullable = true, insertable = true, updatable = true)
    public Integer getCodRelacionamentoCobrançaUtilizado() {
        return codRelacionamentoCobrançaUtilizado;
    }

    public void setCodRelacionamentoCobrançaUtilizado(Integer codRelacionamentoCobrançaUtilizado) {
        this.codRelacionamentoCobrançaUtilizado = codRelacionamentoCobrançaUtilizado;
    }

    private boolean autenticada;

    @Basic
    @javax.persistence.Column(name = "Autenticada", nullable = false, insertable = true, updatable = true)
    public boolean isAutenticada() {
        return autenticada;
    }

    public void setAutenticada(boolean autenticada) {
        this.autenticada = autenticada;
    }

    private boolean autenticadaSemImpressão;

    @Basic
    @javax.persistence.Column(name = "AutenticadaSemImpressão", nullable = false, insertable = true, updatable = true)
    public boolean isAutenticadaSemImpressão() {
        return autenticadaSemImpressão;
    }

    public void setAutenticadaSemImpressão(boolean autenticadaSemImpressão) {
        this.autenticadaSemImpressão = autenticadaSemImpressão;
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

    private BigDecimal jurosValor;

    @Basic
    @javax.persistence.Column(name = "JurosValor", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getJurosValor() {
        return jurosValor;
    }

    public void setJurosValor(BigDecimal jurosValor) {
        this.jurosValor = jurosValor;
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

    private Integer jurosTipo;

    @Basic
    @javax.persistence.Column(name = "JurosTipo", nullable = true, insertable = true, updatable = true)
    public Integer getJurosTipo() {
        return jurosTipo;
    }

    public void setJurosTipo(Integer jurosTipo) {
        this.jurosTipo = jurosTipo;
    }

    private Boolean jurosSobreJuros;

    @Basic
    @javax.persistence.Column(name = "JurosSobreJuros", nullable = true, insertable = true, updatable = true)
    public Boolean getJurosSobreJuros() {
        return jurosSobreJuros;
    }

    public void setJurosSobreJuros(Boolean jurosSobreJuros) {
        this.jurosSobreJuros = jurosSobreJuros;
    }

    private int codMantenedora;

    @Basic
    @javax.persistence.Column(name = "CodMantenedora", nullable = false, insertable = true, updatable = true)
    public int getCodMantenedora() {
        return codMantenedora;
    }

    public void setCodMantenedora(int codMantenedora) {
        this.codMantenedora = codMantenedora;
    }

    private int codAgrupamento;

    @Basic
    @javax.persistence.Column(name = "CodAgrupamento", nullable = false, insertable = true, updatable = true)
    public int getCodAgrupamento() {
        return codAgrupamento;
    }

    public void setCodAgrupamento(int codAgrupamento) {
        this.codAgrupamento = codAgrupamento;
    }

    private String agrupamento;

    @Basic
    @javax.persistence.Column(name = "Agrupamento", nullable = true, insertable = true, updatable = true)
    public String getAgrupamento() {
        return agrupamento;
    }

    public void setAgrupamento(String agrupamento) {
        this.agrupamento = agrupamento;
    }

    private Integer codSituaçãoApto;

    @Basic
    @javax.persistence.Column(name = "CodSituaçãoApto", nullable = true, insertable = true, updatable = true)
    public Integer getCodSituaçãoApto() {
        return codSituaçãoApto;
    }

    public void setCodSituaçãoApto(Integer codSituaçãoApto) {
        this.codSituaçãoApto = codSituaçãoApto;
    }

    private int codTipoCobrançaPadrão;

    @Basic
    @javax.persistence.Column(name = "CodTipoCobrançaPadrão", nullable = false, insertable = true, updatable = true)
    public int getCodTipoCobrançaPadrão() {
        return codTipoCobrançaPadrão;
    }

    public void setCodTipoCobrançaPadrão(int codTipoCobrançaPadrão) {
        this.codTipoCobrançaPadrão = codTipoCobrançaPadrão;
    }

    private String gerente;

    @Basic
    @javax.persistence.Column(name = "Gerente", nullable = true, insertable = true, updatable = true)
    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    private String gerenteRegistro;

    @Basic
    @javax.persistence.Column(name = "GerenteRegistro", nullable = true, insertable = true, updatable = true)
    public String getGerenteRegistro() {
        return gerenteRegistro;
    }

    public void setGerenteRegistro(String gerenteRegistro) {
        this.gerenteRegistro = gerenteRegistro;
    }

    private String gerenteAutorização;

    @Basic
    @javax.persistence.Column(name = "GerenteAutorização", nullable = true, insertable = true, updatable = true)
    public String getGerenteAutorização() {
        return gerenteAutorização;
    }

    public void setGerenteAutorização(String gerenteAutorização) {
        this.gerenteAutorização = gerenteAutorização;
    }

    private Long codSegurança;

    @Basic
    @javax.persistence.Column(name = "CodSegurança", nullable = true, insertable = true, updatable = true)
    public Long getCodSegurança() {
        return codSegurança;
    }

    public void setCodSegurança(Long codSegurança) {
        this.codSegurança = codSegurança;
    }

    private boolean licença;

    @Basic
    @javax.persistence.Column(name = "Licença", nullable = false, insertable = true, updatable = true)
    public boolean isLicença() {
        return licença;
    }

    public void setLicença(boolean licença) {
        this.licença = licença;
    }

    private boolean rateioJuros;

    @Basic
    @javax.persistence.Column(name = "RateioJuros", nullable = false, insertable = true, updatable = true)
    public boolean isRateioJuros() {
        return rateioJuros;
    }

    public void setRateioJuros(boolean rateioJuros) {
        this.rateioJuros = rateioJuros;
    }

    private Long codSpe;

    @Basic
    @javax.persistence.Column(name = "CodSPE", nullable = true, insertable = true, updatable = true)
    public Long getCodSpe() {
        return codSpe;
    }

    public void setCodSpe(Long codSpe) {
        this.codSpe = codSpe;
    }

    private Boolean bolsaVencimento;

    @Basic
    @javax.persistence.Column(name = "BolsaVencimento", nullable = true, insertable = true, updatable = true)
    public Boolean getBolsaVencimento() {
        return bolsaVencimento;
    }

    public void setBolsaVencimento(Boolean bolsaVencimento) {
        this.bolsaVencimento = bolsaVencimento;
    }

    private String unidadeQuitação;

    @Basic
    @javax.persistence.Column(name = "UnidadeQuitação", nullable = true, insertable = true, updatable = true)
    public String getUnidadeQuitação() {
        return unidadeQuitação;
    }

    public void setUnidadeQuitação(String unidadeQuitação) {
        this.unidadeQuitação = unidadeQuitação;
    }

    private String mecCódigo;

    @Basic
    @javax.persistence.Column(name = "MEC_Código", nullable = true, insertable = true, updatable = true)
    public String getMecCódigo() {
        return mecCódigo;
    }

    public void setMecCódigo(String mecCódigo) {
        this.mecCódigo = mecCódigo;
    }

    private String mecModalidade;

    @Basic
    @javax.persistence.Column(name = "MEC_Modalidade", nullable = true, insertable = true, updatable = true)
    public String getMecModalidade() {
        return mecModalidade;
    }

    public void setMecModalidade(String mecModalidade) {
        this.mecModalidade = mecModalidade;
    }

    private String mecEja;

    @Basic
    @javax.persistence.Column(name = "MEC_EJA", nullable = true, insertable = true, updatable = true)
    public String getMecEja() {
        return mecEja;
    }

    public void setMecEja(String mecEja) {
        this.mecEja = mecEja;
    }

    private Integer codCliente;

    @Basic
    @javax.persistence.Column(name = "CodCliente", nullable = true, insertable = true, updatable = true)
    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    private Boolean cobrançaSequencial;

    @Basic
    @javax.persistence.Column(name = "CobrançaSequencial", nullable = true, insertable = true, updatable = true)
    public Boolean getCobrançaSequencial() {
        return cobrançaSequencial;
    }

    public void setCobrançaSequencial(Boolean cobrançaSequencial) {
        this.cobrançaSequencial = cobrançaSequencial;
    }

    private boolean excluído;

    @Basic
    @javax.persistence.Column(name = "Excluído", nullable = false, insertable = true, updatable = true)
    public boolean isExcluído() {
        return excluído;
    }

    public void setExcluído(boolean excluído) {
        this.excluído = excluído;
    }

    private Boolean anúncio;

    @Basic
    @javax.persistence.Column(name = "Anúncio", nullable = true, insertable = true, updatable = true)
    public Boolean getAnúncio() {
        return anúncio;
    }

    public void setAnúncio(Boolean anúncio) {
        this.anúncio = anúncio;
    }

    private String alunoUsuárioFormato;

    @Basic
    @javax.persistence.Column(name = "AlunoUsuárioFormato", nullable = true, insertable = true, updatable = true)
    public String getAlunoUsuárioFormato() {
        return alunoUsuárioFormato;
    }

    public void setAlunoUsuárioFormato(String alunoUsuárioFormato) {
        this.alunoUsuárioFormato = alunoUsuárioFormato;
    }

    private boolean senhaResponsável;

    @Basic
    @javax.persistence.Column(name = "SenhaResponsável", nullable = false, insertable = true, updatable = true)
    public boolean isSenhaResponsável() {
        return senhaResponsável;
    }

    public void setSenhaResponsável(boolean senhaResponsável) {
        this.senhaResponsável = senhaResponsável;
    }

    private Long nfSeNúmero;

    @Basic
    @javax.persistence.Column(name = "NFSeNúmero", nullable = true, insertable = true, updatable = true)
    public Long getNfSeNúmero() {
        return nfSeNúmero;
    }

    public void setNfSeNúmero(Long nfSeNúmero) {
        this.nfSeNúmero = nfSeNúmero;
    }

    private Long nfSeAno;

    @Basic
    @javax.persistence.Column(name = "NFSeAno", nullable = true, insertable = true, updatable = true)
    public Long getNfSeAno() {
        return nfSeAno;
    }

    public void setNfSeAno(Long nfSeAno) {
        this.nfSeAno = nfSeAno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntUnidade that = (CntUnidade) o;

        if (autenticada != that.autenticada) return false;
        if (autenticadaSemImpressão != that.autenticadaSemImpressão) return false;
        if (bloquearAdiantamentoPagto != that.bloquearAdiantamentoPagto) return false;
        if (bloquearMovimento != that.bloquearMovimento) return false;
        if (codAgrupamento != that.codAgrupamento) return false;
        if (codMantenedora != that.codMantenedora) return false;
        if (codRelacionamentoUtilizado != that.codRelacionamentoUtilizado) return false;
        if (codTipoCobrançaPadrão != that.codTipoCobrançaPadrão) return false;
        if (codUnidade != that.codUnidade) return false;
        if (excluído != that.excluído) return false;
        if (incluindoAlunosPauta != that.incluindoAlunosPauta) return false;
        if (informatizada != that.informatizada) return false;
        if (lançarDiferença != that.lançarDiferença) return false;
        if (licença != that.licença) return false;
        if (matriculaInadimplente != that.matriculaInadimplente) return false;
        if (nãoAdiantarPagto != that.nãoAdiantarPagto) return false;
        if (rateioJuros != that.rateioJuros) return false;
        if (semDomingo != that.semDomingo) return false;
        if (semSábado != that.semSábado) return false;
        if (senhaResponsável != that.senhaResponsável) return false;
        if (utilizarAf != that.utilizarAf) return false;
        if (utilizarOrçamento != that.utilizarOrçamento) return false;
        if (valorPagoMenor != that.valorPagoMenor) return false;
        if (agrupamento != null ? !agrupamento.equals(that.agrupamento) : that.agrupamento != null) return false;
        if (alunoUsuárioFormato != null ? !alunoUsuárioFormato.equals(that.alunoUsuárioFormato) : that.alunoUsuárioFormato != null)
            return false;
        if (anúncio != null ? !anúncio.equals(that.anúncio) : that.anúncio != null) return false;
        if (autorização != null ? !autorização.equals(that.autorização) : that.autorização != null) return false;
        if (autorizaçãoPublicação != null ? !autorizaçãoPublicação.equals(that.autorizaçãoPublicação) : that.autorizaçãoPublicação != null)
            return false;
        if (bloquetoAutorização != null ? !bloquetoAutorização.equals(that.bloquetoAutorização) : that.bloquetoAutorização != null)
            return false;
        if (bolsaVencimento != null ? !bolsaVencimento.equals(that.bolsaVencimento) : that.bolsaVencimento != null)
            return false;
        if (cgc != null ? !cgc.equals(that.cgc) : that.cgc != null) return false;
        if (cobrançaSequencial != null ? !cobrançaSequencial.equals(that.cobrançaSequencial) : that.cobrançaSequencial != null)
            return false;
        if (codAutorização != null ? !codAutorização.equals(that.codAutorização) : that.codAutorização != null)
            return false;
        if (codCliente != null ? !codCliente.equals(that.codCliente) : that.codCliente != null) return false;
        if (codDepartamento != null ? !codDepartamento.equals(that.codDepartamento) : that.codDepartamento != null)
            return false;
        if (codMovimento != null ? !codMovimento.equals(that.codMovimento) : that.codMovimento != null) return false;
        if (codNegativação != null ? !codNegativação.equals(that.codNegativação) : that.codNegativação != null)
            return false;
        if (codRelacionamentoCobrançaUtilizado != null ? !codRelacionamentoCobrançaUtilizado.equals(that.codRelacionamentoCobrançaUtilizado) : that.codRelacionamentoCobrançaUtilizado != null)
            return false;
        if (codSegurança != null ? !codSegurança.equals(that.codSegurança) : that.codSegurança != null) return false;
        if (codSituaçãoApto != null ? !codSituaçãoApto.equals(that.codSituaçãoApto) : that.codSituaçãoApto != null)
            return false;
        if (codSituaçãoMatrículaFinanceira != null ? !codSituaçãoMatrículaFinanceira.equals(that.codSituaçãoMatrículaFinanceira) : that.codSituaçãoMatrículaFinanceira != null)
            return false;
        if (codSituaçãoNormal != null ? !codSituaçãoNormal.equals(that.codSituaçãoNormal) : that.codSituaçãoNormal != null)
            return false;
        if (codSituaçãoNãoMatrículado != null ? !codSituaçãoNãoMatrículado.equals(that.codSituaçãoNãoMatrículado) : that.codSituaçãoNãoMatrículado != null)
            return false;
        if (codSituaçãoNãoRematricular != null ? !codSituaçãoNãoRematricular.equals(that.codSituaçãoNãoRematricular) : that.codSituaçãoNãoRematricular != null)
            return false;
        if (codSpe != null ? !codSpe.equals(that.codSpe) : that.codSpe != null) return false;
        if (créditoTipoCobrança != null ? !créditoTipoCobrança.equals(that.créditoTipoCobrança) : that.créditoTipoCobrança != null)
            return false;
        if (diretor != null ? !diretor.equals(that.diretor) : that.diretor != null) return false;
        if (diretorAutorização != null ? !diretorAutorização.equals(that.diretorAutorização) : that.diretorAutorização != null)
            return false;
        if (diretorRegistro != null ? !diretorRegistro.equals(that.diretorRegistro) : that.diretorRegistro != null)
            return false;
        if (empresaComplemento != null ? !empresaComplemento.equals(that.empresaComplemento) : that.empresaComplemento != null)
            return false;
        if (empresaDocumento != null ? !empresaDocumento.equals(that.empresaDocumento) : that.empresaDocumento != null)
            return false;
        if (empresaFinanceiro != null ? !empresaFinanceiro.equals(that.empresaFinanceiro) : that.empresaFinanceiro != null)
            return false;
        if (gerente != null ? !gerente.equals(that.gerente) : that.gerente != null) return false;
        if (gerenteAutorização != null ? !gerenteAutorização.equals(that.gerenteAutorização) : that.gerenteAutorização != null)
            return false;
        if (gerenteRegistro != null ? !gerenteRegistro.equals(that.gerenteRegistro) : that.gerenteRegistro != null)
            return false;
        if (inscriçãoMunicipal != null ? !inscriçãoMunicipal.equals(that.inscriçãoMunicipal) : that.inscriçãoMunicipal != null)
            return false;
        if (juros != null ? !juros.equals(that.juros) : that.juros != null) return false;
        if (jurosSobreJuros != null ? !jurosSobreJuros.equals(that.jurosSobreJuros) : that.jurosSobreJuros != null)
            return false;
        if (jurosTipo != null ? !jurosTipo.equals(that.jurosTipo) : that.jurosTipo != null) return false;
        if (jurosValor != null ? !jurosValor.equals(that.jurosValor) : that.jurosValor != null) return false;
        if (!Arrays.equals(logotipo, that.logotipo)) return false;
        if (logotipoAltura != null ? !logotipoAltura.equals(that.logotipoAltura) : that.logotipoAltura != null)
            return false;
        if (logotipoForma != null ? !logotipoForma.equals(that.logotipoForma) : that.logotipoForma != null)
            return false;
        if (logotipoLargura != null ? !logotipoLargura.equals(that.logotipoLargura) : that.logotipoLargura != null)
            return false;
        if (matrículaFim != null ? !matrículaFim.equals(that.matrículaFim) : that.matrículaFim != null) return false;
        if (matrículaInício != null ? !matrículaInício.equals(that.matrículaInício) : that.matrículaInício != null)
            return false;
        if (matrículaUtilizada != null ? !matrículaUtilizada.equals(that.matrículaUtilizada) : that.matrículaUtilizada != null)
            return false;
        if (mecCódigo != null ? !mecCódigo.equals(that.mecCódigo) : that.mecCódigo != null) return false;
        if (mecEja != null ? !mecEja.equals(that.mecEja) : that.mecEja != null) return false;
        if (mecModalidade != null ? !mecModalidade.equals(that.mecModalidade) : that.mecModalidade != null)
            return false;
        if (multa != null ? !multa.equals(that.multa) : that.multa != null) return false;
        if (negativaçãoCidade != null ? !negativaçãoCidade.equals(that.negativaçãoCidade) : that.negativaçãoCidade != null)
            return false;
        if (negativaçãoUf != null ? !negativaçãoUf.equals(that.negativaçãoUf) : that.negativaçãoUf != null)
            return false;
        if (nfSeAno != null ? !nfSeAno.equals(that.nfSeAno) : that.nfSeAno != null) return false;
        if (nfSeNúmero != null ? !nfSeNúmero.equals(that.nfSeNúmero) : that.nfSeNúmero != null) return false;
        if (reconhecimento != null ? !reconhecimento.equals(that.reconhecimento) : that.reconhecimento != null)
            return false;
        if (reconhecimentoPublicação != null ? !reconhecimentoPublicação.equals(that.reconhecimentoPublicação) : that.reconhecimentoPublicação != null)
            return false;
        if (secretário != null ? !secretário.equals(that.secretário) : that.secretário != null) return false;
        if (secretárioAutorização != null ? !secretárioAutorização.equals(that.secretárioAutorização) : that.secretárioAutorização != null)
            return false;
        if (secretárioRegistro != null ? !secretárioRegistro.equals(that.secretárioRegistro) : that.secretárioRegistro != null)
            return false;
        if (tipoCobrançaCrédito != null ? !tipoCobrançaCrédito.equals(that.tipoCobrançaCrédito) : that.tipoCobrançaCrédito != null)
            return false;
        if (tipoCobrançaDébito != null ? !tipoCobrançaDébito.equals(that.tipoCobrançaDébito) : that.tipoCobrançaDébito != null)
            return false;
        if (unidade != null ? !unidade.equals(that.unidade) : that.unidade != null) return false;
        if (unidadeAutorização != null ? !unidadeAutorização.equals(that.unidadeAutorização) : that.unidadeAutorização != null)
            return false;
        if (unidadeBairro != null ? !unidadeBairro.equals(that.unidadeBairro) : that.unidadeBairro != null)
            return false;
        if (unidadeCep != null ? !unidadeCep.equals(that.unidadeCep) : that.unidadeCep != null) return false;
        if (unidadeCidade != null ? !unidadeCidade.equals(that.unidadeCidade) : that.unidadeCidade != null)
            return false;
        if (unidadeEndereço != null ? !unidadeEndereço.equals(that.unidadeEndereço) : that.unidadeEndereço != null)
            return false;
        if (unidadeFax != null ? !unidadeFax.equals(that.unidadeFax) : that.unidadeFax != null) return false;
        if (unidadeObservação != null ? !unidadeObservação.equals(that.unidadeObservação) : that.unidadeObservação != null)
            return false;
        if (unidadeQuitação != null ? !unidadeQuitação.equals(that.unidadeQuitação) : that.unidadeQuitação != null)
            return false;
        if (unidadeSigla != null ? !unidadeSigla.equals(that.unidadeSigla) : that.unidadeSigla != null) return false;
        if (unidadeTelefone != null ? !unidadeTelefone.equals(that.unidadeTelefone) : that.unidadeTelefone != null)
            return false;
        if (unidadeUf != null ? !unidadeUf.equals(that.unidadeUf) : that.unidadeUf != null) return false;
        if (valorLivreAf != null ? !valorLivreAf.equals(that.valorLivreAf) : that.valorLivreAf != null) return false;
        if (valorLivreOrçamento != null ? !valorLivreOrçamento.equals(that.valorLivreOrçamento) : that.valorLivreOrçamento != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (unidade != null ? unidade.hashCode() : 0);
        result = 31 * result + (empresaDocumento != null ? empresaDocumento.hashCode() : 0);
        result = 31 * result + (empresaFinanceiro != null ? empresaFinanceiro.hashCode() : 0);
        result = 31 * result + (empresaComplemento != null ? empresaComplemento.hashCode() : 0);
        result = 31 * result + (matrículaInício != null ? matrículaInício.hashCode() : 0);
        result = 31 * result + (matrículaFim != null ? matrículaFim.hashCode() : 0);
        result = 31 * result + (matrículaUtilizada != null ? matrículaUtilizada.hashCode() : 0);
        result = 31 * result + codRelacionamentoUtilizado;
        result = 31 * result + (codSituaçãoNãoMatrículado != null ? codSituaçãoNãoMatrículado.hashCode() : 0);
        result = 31 * result + (codSituaçãoMatrículaFinanceira != null ? codSituaçãoMatrículaFinanceira.hashCode() : 0);
        result = 31 * result + (codSituaçãoNormal != null ? codSituaçãoNormal.hashCode() : 0);
        result = 31 * result + (unidadeSigla != null ? unidadeSigla.hashCode() : 0);
        result = 31 * result + (unidadeEndereço != null ? unidadeEndereço.hashCode() : 0);
        result = 31 * result + (unidadeBairro != null ? unidadeBairro.hashCode() : 0);
        result = 31 * result + (unidadeCidade != null ? unidadeCidade.hashCode() : 0);
        result = 31 * result + (unidadeUf != null ? unidadeUf.hashCode() : 0);
        result = 31 * result + (unidadeAutorização != null ? unidadeAutorização.hashCode() : 0);
        result = 31 * result + (unidadeObservação != null ? unidadeObservação.hashCode() : 0);
        result = 31 * result + (matriculaInadimplente ? 1 : 0);
        result = 31 * result + (informatizada ? 1 : 0);
        result = 31 * result + (incluindoAlunosPauta ? 1 : 0);
        result = 31 * result + (logotipo != null ? Arrays.hashCode(logotipo) : 0);
        result = 31 * result + (logotipoForma != null ? logotipoForma.hashCode() : 0);
        result = 31 * result + (logotipoLargura != null ? logotipoLargura.hashCode() : 0);
        result = 31 * result + (logotipoAltura != null ? logotipoAltura.hashCode() : 0);
        result = 31 * result + (cgc != null ? cgc.hashCode() : 0);
        result = 31 * result + (inscriçãoMunicipal != null ? inscriçãoMunicipal.hashCode() : 0);
        result = 31 * result + (bloquetoAutorização != null ? bloquetoAutorização.hashCode() : 0);
        result = 31 * result + (autorização != null ? autorização.hashCode() : 0);
        result = 31 * result + (autorizaçãoPublicação != null ? autorizaçãoPublicação.hashCode() : 0);
        result = 31 * result + (reconhecimento != null ? reconhecimento.hashCode() : 0);
        result = 31 * result + (reconhecimentoPublicação != null ? reconhecimentoPublicação.hashCode() : 0);
        result = 31 * result + (diretor != null ? diretor.hashCode() : 0);
        result = 31 * result + (diretorRegistro != null ? diretorRegistro.hashCode() : 0);
        result = 31 * result + (diretorAutorização != null ? diretorAutorização.hashCode() : 0);
        result = 31 * result + (secretário != null ? secretário.hashCode() : 0);
        result = 31 * result + (secretárioRegistro != null ? secretárioRegistro.hashCode() : 0);
        result = 31 * result + (secretárioAutorização != null ? secretárioAutorização.hashCode() : 0);
        result = 31 * result + (unidadeCep != null ? unidadeCep.hashCode() : 0);
        result = 31 * result + (codNegativação != null ? codNegativação.hashCode() : 0);
        result = 31 * result + (bloquearMovimento ? 1 : 0);
        result = 31 * result + (utilizarAf ? 1 : 0);
        result = 31 * result + (valorLivreAf != null ? valorLivreAf.hashCode() : 0);
        result = 31 * result + (utilizarOrçamento ? 1 : 0);
        result = 31 * result + (valorLivreOrçamento != null ? valorLivreOrçamento.hashCode() : 0);
        result = 31 * result + (codDepartamento != null ? codDepartamento.hashCode() : 0);
        result = 31 * result + (semSábado ? 1 : 0);
        result = 31 * result + (semDomingo ? 1 : 0);
        result = 31 * result + (lançarDiferença ? 1 : 0);
        result = 31 * result + (tipoCobrançaCrédito != null ? tipoCobrançaCrédito.hashCode() : 0);
        result = 31 * result + (tipoCobrançaDébito != null ? tipoCobrançaDébito.hashCode() : 0);
        result = 31 * result + (valorPagoMenor ? 1 : 0);
        result = 31 * result + (unidadeFax != null ? unidadeFax.hashCode() : 0);
        result = 31 * result + (unidadeTelefone != null ? unidadeTelefone.hashCode() : 0);
        result = 31 * result + (codSituaçãoNãoRematricular != null ? codSituaçãoNãoRematricular.hashCode() : 0);
        result = 31 * result + (negativaçãoCidade != null ? negativaçãoCidade.hashCode() : 0);
        result = 31 * result + (negativaçãoUf != null ? negativaçãoUf.hashCode() : 0);
        result = 31 * result + (nãoAdiantarPagto ? 1 : 0);
        result = 31 * result + (bloquearAdiantamentoPagto ? 1 : 0);
        result = 31 * result + (créditoTipoCobrança != null ? créditoTipoCobrança.hashCode() : 0);
        result = 31 * result + (codMovimento != null ? codMovimento.hashCode() : 0);
        result = 31 * result + (codAutorização != null ? codAutorização.hashCode() : 0);
        result = 31 * result + (codRelacionamentoCobrançaUtilizado != null ? codRelacionamentoCobrançaUtilizado.hashCode() : 0);
        result = 31 * result + (autenticada ? 1 : 0);
        result = 31 * result + (autenticadaSemImpressão ? 1 : 0);
        result = 31 * result + (juros != null ? juros.hashCode() : 0);
        result = 31 * result + (jurosValor != null ? jurosValor.hashCode() : 0);
        result = 31 * result + (multa != null ? multa.hashCode() : 0);
        result = 31 * result + (jurosTipo != null ? jurosTipo.hashCode() : 0);
        result = 31 * result + (jurosSobreJuros != null ? jurosSobreJuros.hashCode() : 0);
        result = 31 * result + codMantenedora;
        result = 31 * result + codAgrupamento;
        result = 31 * result + (agrupamento != null ? agrupamento.hashCode() : 0);
        result = 31 * result + (codSituaçãoApto != null ? codSituaçãoApto.hashCode() : 0);
        result = 31 * result + codTipoCobrançaPadrão;
        result = 31 * result + (gerente != null ? gerente.hashCode() : 0);
        result = 31 * result + (gerenteRegistro != null ? gerenteRegistro.hashCode() : 0);
        result = 31 * result + (gerenteAutorização != null ? gerenteAutorização.hashCode() : 0);
        result = 31 * result + (codSegurança != null ? codSegurança.hashCode() : 0);
        result = 31 * result + (licença ? 1 : 0);
        result = 31 * result + (rateioJuros ? 1 : 0);
        result = 31 * result + (codSpe != null ? codSpe.hashCode() : 0);
        result = 31 * result + (bolsaVencimento != null ? bolsaVencimento.hashCode() : 0);
        result = 31 * result + (unidadeQuitação != null ? unidadeQuitação.hashCode() : 0);
        result = 31 * result + (mecCódigo != null ? mecCódigo.hashCode() : 0);
        result = 31 * result + (mecModalidade != null ? mecModalidade.hashCode() : 0);
        result = 31 * result + (mecEja != null ? mecEja.hashCode() : 0);
        result = 31 * result + (codCliente != null ? codCliente.hashCode() : 0);
        result = 31 * result + (cobrançaSequencial != null ? cobrançaSequencial.hashCode() : 0);
        result = 31 * result + (excluído ? 1 : 0);
        result = 31 * result + (anúncio != null ? anúncio.hashCode() : 0);
        result = 31 * result + (alunoUsuárioFormato != null ? alunoUsuárioFormato.hashCode() : 0);
        result = 31 * result + (senhaResponsável ? 1 : 0);
        result = 31 * result + (nfSeNúmero != null ? nfSeNúmero.hashCode() : 0);
        result = 31 * result + (nfSeAno != null ? nfSeAno.hashCode() : 0);
        return result;
    }
}
