package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdPautaPk.class)
public class AcdPauta {
    private long pautaId;

    @Basic
    @javax.persistence.Column(name = "Pauta_ID", nullable = false, insertable = true, updatable = true)
    public long getPautaId() {
        return pautaId;
    }

    public void setPautaId(long pautaId) {
        this.pautaId = pautaId;
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

    private long codPauta;

    @Id
    @javax.persistence.Column(name = "CodPauta", nullable = false, insertable = true, updatable = true)
    public long getCodPauta() {
        return codPauta;
    }

    public void setCodPauta(long codPauta) {
        this.codPauta = codPauta;
    }

    private Boolean cancelada;

    @Basic
    @javax.persistence.Column(name = "Cancelada", nullable = true, insertable = true, updatable = true)
    public Boolean getCancelada() {
        return cancelada;
    }

    public void setCancelada(Boolean cancelada) {
        this.cancelada = cancelada;
    }

    private Long codPautaOrigem;

    @Basic
    @javax.persistence.Column(name = "CodPautaOrigem", nullable = true, insertable = true, updatable = true)
    public Long getCodPautaOrigem() {
        return codPautaOrigem;
    }

    public void setCodPautaOrigem(Long codPautaOrigem) {
        this.codPautaOrigem = codPautaOrigem;
    }

    private Long codPautaDestino;

    @Basic
    @javax.persistence.Column(name = "CodPautaDestino", nullable = true, insertable = true, updatable = true)
    public Long getCodPautaDestino() {
        return codPautaDestino;
    }

    public void setCodPautaDestino(Long codPautaDestino) {
        this.codPautaDestino = codPautaDestino;
    }

    private Integer codResponsávelAcad;

    @Basic
    @javax.persistence.Column(name = "CodResponsávelAcad", nullable = true, insertable = true, updatable = true)
    public Integer getCodResponsávelAcad() {
        return codResponsávelAcad;
    }

    public void setCodResponsávelAcad(Integer codResponsávelAcad) {
        this.codResponsávelAcad = codResponsávelAcad;
    }

    private Integer codResponsável;

    @Basic
    @javax.persistence.Column(name = "CodResponsável", nullable = true, insertable = true, updatable = true)
    public Integer getCodResponsável() {
        return codResponsável;
    }

    public void setCodResponsável(Integer codResponsável) {
        this.codResponsável = codResponsável;
    }

    private Integer codAvalista;

    @Basic
    @javax.persistence.Column(name = "CodAvalista", nullable = true, insertable = true, updatable = true)
    public Integer getCodAvalista() {
        return codAvalista;
    }

    public void setCodAvalista(Integer codAvalista) {
        this.codAvalista = codAvalista;
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

    private int codCursoVest;

    @Basic
    @javax.persistence.Column(name = "CodCursoVest", nullable = false, insertable = true, updatable = true)
    public int getCodCursoVest() {
        return codCursoVest;
    }

    public void setCodCursoVest(int codCursoVest) {
        this.codCursoVest = codCursoVest;
    }

    private int codCurso;

    @Basic
    @javax.persistence.Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    private int codPeríodo;

    @Basic
    @javax.persistence.Column(name = "CodPeríodo", nullable = false, insertable = true, updatable = true)
    public int getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(int codPeríodo) {
        this.codPeríodo = codPeríodo;
    }

    private int codGrade;

    @Basic
    @javax.persistence.Column(name = "CodGrade", nullable = false, insertable = true, updatable = true)
    public int getCodGrade() {
        return codGrade;
    }

    public void setCodGrade(int codGrade) {
        this.codGrade = codGrade;
    }

    private String turma;

    @Basic
    @javax.persistence.Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    private byte númeroPauta;

    @Basic
    @javax.persistence.Column(name = "NúmeroPauta", nullable = false, insertable = true, updatable = true)
    public byte getNúmeroPauta() {
        return númeroPauta;
    }

    public void setNúmeroPauta(byte númeroPauta) {
        this.númeroPauta = númeroPauta;
    }

    private Timestamp matrículaData;

    @Basic
    @javax.persistence.Column(name = "MatrículaData", nullable = true, insertable = true, updatable = true)
    public Timestamp getMatrículaData() {
        return matrículaData;
    }

    public void setMatrículaData(Timestamp matrículaData) {
        this.matrículaData = matrículaData;
    }

    private Byte codSituação;

    @Basic
    @javax.persistence.Column(name = "CodSituação", nullable = true, insertable = true, updatable = true)
    public Byte getCodSituação() {
        return codSituação;
    }

    public void setCodSituação(Byte codSituação) {
        this.codSituação = codSituação;
    }

    private Timestamp situaçãoData;

    @Basic
    @javax.persistence.Column(name = "SituaçãoData", nullable = true, insertable = true, updatable = true)
    public Timestamp getSituaçãoData() {
        return situaçãoData;
    }

    public void setSituaçãoData(Timestamp situaçãoData) {
        this.situaçãoData = situaçãoData;
    }

    private boolean apto;

    @Basic
    @javax.persistence.Column(name = "Apto", nullable = false, insertable = true, updatable = true)
    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

    private Timestamp estágioInício;

    @Basic
    @javax.persistence.Column(name = "EstágioInício", nullable = true, insertable = true, updatable = true)
    public Timestamp getEstágioInício() {
        return estágioInício;
    }

    public void setEstágioInício(Timestamp estágioInício) {
        this.estágioInício = estágioInício;
    }

    private Timestamp estágioFim;

    @Basic
    @javax.persistence.Column(name = "EstágioFim", nullable = true, insertable = true, updatable = true)
    public Timestamp getEstágioFim() {
        return estágioFim;
    }

    public void setEstágioFim(Timestamp estágioFim) {
        this.estágioFim = estágioFim;
    }

    private Integer estágioCh;

    @Basic
    @javax.persistence.Column(name = "EstágioCH", nullable = true, insertable = true, updatable = true)
    public Integer getEstágioCh() {
        return estágioCh;
    }

    public void setEstágioCh(Integer estágioCh) {
        this.estágioCh = estágioCh;
    }

    private Boolean estágioAprovado;

    @Basic
    @javax.persistence.Column(name = "EstágioAprovado", nullable = true, insertable = true, updatable = true)
    public Boolean getEstágioAprovado() {
        return estágioAprovado;
    }

    public void setEstágioAprovado(Boolean estágioAprovado) {
        this.estágioAprovado = estágioAprovado;
    }

    private Boolean docEspecial;

    @Basic
    @javax.persistence.Column(name = "DocEspecial", nullable = true, insertable = true, updatable = true)
    public Boolean getDocEspecial() {
        return docEspecial;
    }

    public void setDocEspecial(Boolean docEspecial) {
        this.docEspecial = docEspecial;
    }

    private Integer docEspecialMêsValidade;

    @Basic
    @javax.persistence.Column(name = "DocEspecialMêsValidade", nullable = true, insertable = true, updatable = true)
    public Integer getDocEspecialMêsValidade() {
        return docEspecialMêsValidade;
    }

    public void setDocEspecialMêsValidade(Integer docEspecialMêsValidade) {
        this.docEspecialMêsValidade = docEspecialMêsValidade;
    }

    private Timestamp docEspecialData;

    @Basic
    @javax.persistence.Column(name = "DocEspecialData", nullable = true, insertable = true, updatable = true)
    public Timestamp getDocEspecialData() {
        return docEspecialData;
    }

    public void setDocEspecialData(Timestamp docEspecialData) {
        this.docEspecialData = docEspecialData;
    }

    private String docEspecialObservação;

    @Basic
    @javax.persistence.Column(name = "DocEspecialObservação", nullable = true, insertable = true, updatable = true)
    public String getDocEspecialObservação() {
        return docEspecialObservação;
    }

    public void setDocEspecialObservação(String docEspecialObservação) {
        this.docEspecialObservação = docEspecialObservação;
    }

    private Short docEspecialDiaVencimento;

    @Basic
    @javax.persistence.Column(name = "DocEspecialDiaVencimento", nullable = true, insertable = true, updatable = true)
    public Short getDocEspecialDiaVencimento() {
        return docEspecialDiaVencimento;
    }

    public void setDocEspecialDiaVencimento(Short docEspecialDiaVencimento) {
        this.docEspecialDiaVencimento = docEspecialDiaVencimento;
    }

    private Integer númeroSérie;

    @Basic
    @javax.persistence.Column(name = "NúmeroSérie", nullable = true, insertable = true, updatable = true)
    public Integer getNúmeroSérie() {
        return númeroSérie;
    }

    public void setNúmeroSérie(Integer númeroSérie) {
        this.númeroSérie = númeroSérie;
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

    private Short totalParcelaCarnet;

    @Basic
    @javax.persistence.Column(name = "TotalParcelaCarnet", nullable = true, insertable = true, updatable = true)
    public Short getTotalParcelaCarnet() {
        return totalParcelaCarnet;
    }

    public void setTotalParcelaCarnet(Short totalParcelaCarnet) {
        this.totalParcelaCarnet = totalParcelaCarnet;
    }

    private Short cota;

    @Basic
    @javax.persistence.Column(name = "Cota", nullable = true, insertable = true, updatable = true)
    public Short getCota() {
        return cota;
    }

    public void setCota(Short cota) {
        this.cota = cota;
    }

    private Integer codCooperado;

    @Basic
    @javax.persistence.Column(name = "CodCooperado", nullable = true, insertable = true, updatable = true)
    public Integer getCodCooperado() {
        return codCooperado;
    }

    public void setCodCooperado(Integer codCooperado) {
        this.codCooperado = codCooperado;
    }

    private String textoUnificada;

    @Basic
    @javax.persistence.Column(name = "TextoUnificada", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getTextoUnificada() {
        return textoUnificada;
    }

    public void setTextoUnificada(String textoUnificada) {
        this.textoUnificada = textoUnificada;
    }

    private String cobrançaObservação;

    @Basic
    @javax.persistence.Column(name = "CobrançaObservação", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getCobrançaObservação() {
        return cobrançaObservação;
    }

    public void setCobrançaObservação(String cobrançaObservação) {
        this.cobrançaObservação = cobrançaObservação;
    }

    private Integer matrículaOrigem;

    @Basic
    @javax.persistence.Column(name = "MatrículaOrigem", nullable = true, insertable = true, updatable = true)
    public Integer getMatrículaOrigem() {
        return matrículaOrigem;
    }

    public void setMatrículaOrigem(Integer matrículaOrigem) {
        this.matrículaOrigem = matrículaOrigem;
    }

    private Integer matrículaDestino;

    @Basic
    @javax.persistence.Column(name = "MatrículaDestino", nullable = true, insertable = true, updatable = true)
    public Integer getMatrículaDestino() {
        return matrículaDestino;
    }

    public void setMatrículaDestino(Integer matrículaDestino) {
        this.matrículaDestino = matrículaDestino;
    }

    private Long codMovimento;

    @Basic
    @javax.persistence.Column(name = "CodMovimento", nullable = true, insertable = true, updatable = true)
    public Long getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(Long codMovimento) {
        this.codMovimento = codMovimento;
    }

    private Long créditoCodMovimento;

    @Basic
    @javax.persistence.Column(name = "CréditoCodMovimento", nullable = true, insertable = true, updatable = true)
    public Long getCréditoCodMovimento() {
        return créditoCodMovimento;
    }

    public void setCréditoCodMovimento(Long créditoCodMovimento) {
        this.créditoCodMovimento = créditoCodMovimento;
    }

    private String contrato;

    @Basic
    @javax.persistence.Column(name = "Contrato", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    private String obsFinanceira;

    @Basic
    @javax.persistence.Column(name = "OBSFinanceira", nullable = true, insertable = true, updatable = true)
    public String getObsFinanceira() {
        return obsFinanceira;
    }

    public void setObsFinanceira(String obsFinanceira) {
        this.obsFinanceira = obsFinanceira;
    }

    private String obsFinanceiroCurto;

    @Basic
    @javax.persistence.Column(name = "OBSFinanceiroCurto", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getObsFinanceiroCurto() {
        return obsFinanceiroCurto;
    }

    public void setObsFinanceiroCurto(String obsFinanceiroCurto) {
        this.obsFinanceiroCurto = obsFinanceiroCurto;
    }

    private Timestamp dataCadastro;

    @Basic
    @javax.persistence.Column(name = "DataCadastro", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Timestamp dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    private Byte codLíngua;

    @Basic
    @javax.persistence.Column(name = "CodLíngua", nullable = true, insertable = true, updatable = true)
    public Byte getCodLíngua() {
        return codLíngua;
    }

    public void setCodLíngua(Byte codLíngua) {
        this.codLíngua = codLíngua;
    }

    private Integer matrículaUnificada;

    @Basic
    @javax.persistence.Column(name = "MatrículaUnificada", nullable = true, insertable = true, updatable = true)
    public Integer getMatrículaUnificada() {
        return matrículaUnificada;
    }

    public void setMatrículaUnificada(Integer matrículaUnificada) {
        this.matrículaUnificada = matrículaUnificada;
    }

    private Boolean cobrançaUnificada;

    @Basic
    @javax.persistence.Column(name = "CobrançaUnificada", nullable = true, insertable = true, updatable = true)
    public Boolean getCobrançaUnificada() {
        return cobrançaUnificada;
    }

    public void setCobrançaUnificada(Boolean cobrançaUnificada) {
        this.cobrançaUnificada = cobrançaUnificada;
    }

    private Boolean ativa;

    @Basic
    @javax.persistence.Column(name = "Ativa", nullable = true, insertable = true, updatable = true)
    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    private Boolean histórico;

    @Basic
    @javax.persistence.Column(name = "Histórico", nullable = true, insertable = true, updatable = true)
    public Boolean getHistórico() {
        return histórico;
    }

    public void setHistórico(Boolean histórico) {
        this.histórico = histórico;
    }

    private String históricoEscola;

    @Basic
    @javax.persistence.Column(name = "HistóricoEscola", nullable = true, insertable = true, updatable = true)
    public String getHistóricoEscola() {
        return históricoEscola;
    }

    public void setHistóricoEscola(String históricoEscola) {
        this.históricoEscola = históricoEscola;
    }

    private String históricoCidade;

    @Basic
    @javax.persistence.Column(name = "HistóricoCidade", nullable = true, insertable = true, updatable = true)
    public String getHistóricoCidade() {
        return históricoCidade;
    }

    public void setHistóricoCidade(String históricoCidade) {
        this.históricoCidade = históricoCidade;
    }

    private String históricoUf;

    @Basic
    @javax.persistence.Column(name = "HistóricoUF", nullable = true, insertable = true, updatable = true)
    public String getHistóricoUf() {
        return históricoUf;
    }

    public void setHistóricoUf(String históricoUf) {
        this.históricoUf = históricoUf;
    }

    private String históricoDiretor;

    @Basic
    @javax.persistence.Column(name = "HistóricoDiretor", nullable = true, insertable = true, updatable = true)
    public String getHistóricoDiretor() {
        return históricoDiretor;
    }

    public void setHistóricoDiretor(String históricoDiretor) {
        this.históricoDiretor = históricoDiretor;
    }

    private Timestamp históricoExame1Data;

    @Basic
    @javax.persistence.Column(name = "HistóricoExame1Data", nullable = true, insertable = true, updatable = true)
    public Timestamp getHistóricoExame1Data() {
        return históricoExame1Data;
    }

    public void setHistóricoExame1Data(Timestamp históricoExame1Data) {
        this.históricoExame1Data = históricoExame1Data;
    }

    private Double históricoExame1Peso;

    @Basic
    @javax.persistence.Column(name = "HistóricoExame1Peso", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getHistóricoExame1Peso() {
        return históricoExame1Peso;
    }

    public void setHistóricoExame1Peso(Double históricoExame1Peso) {
        this.históricoExame1Peso = históricoExame1Peso;
    }

    private Double históricoExame1Altura;

    @Basic
    @javax.persistence.Column(name = "HistóricoExame1Altura", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getHistóricoExame1Altura() {
        return históricoExame1Altura;
    }

    public void setHistóricoExame1Altura(Double históricoExame1Altura) {
        this.históricoExame1Altura = históricoExame1Altura;
    }

    private Timestamp históricoExame2Data;

    @Basic
    @javax.persistence.Column(name = "HistóricoExame2Data", nullable = true, insertable = true, updatable = true)
    public Timestamp getHistóricoExame2Data() {
        return históricoExame2Data;
    }

    public void setHistóricoExame2Data(Timestamp históricoExame2Data) {
        this.históricoExame2Data = históricoExame2Data;
    }

    private Double históricoExame2Peso;

    @Basic
    @javax.persistence.Column(name = "HistóricoExame2Peso", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getHistóricoExame2Peso() {
        return históricoExame2Peso;
    }

    public void setHistóricoExame2Peso(Double históricoExame2Peso) {
        this.históricoExame2Peso = históricoExame2Peso;
    }

    private Double históricoExame2Altura;

    @Basic
    @javax.persistence.Column(name = "HistóricoExame2Altura", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getHistóricoExame2Altura() {
        return históricoExame2Altura;
    }

    public void setHistóricoExame2Altura(Double históricoExame2Altura) {
        this.históricoExame2Altura = históricoExame2Altura;
    }

    private String históricoResultado;

    @Basic
    @javax.persistence.Column(name = "HistóricoResultado", nullable = true, insertable = true, updatable = true)
    public String getHistóricoResultado() {
        return históricoResultado;
    }

    public void setHistóricoResultado(String históricoResultado) {
        this.históricoResultado = históricoResultado;
    }

    private String históricoDiasLetivos;

    @Basic
    @javax.persistence.Column(name = "HistóricoDiasLetivos", nullable = true, insertable = true, updatable = true)
    public String getHistóricoDiasLetivos() {
        return históricoDiasLetivos;
    }

    public void setHistóricoDiasLetivos(String históricoDiasLetivos) {
        this.históricoDiasLetivos = históricoDiasLetivos;
    }

    private String históricoFaltas;

    @Basic
    @javax.persistence.Column(name = "HistóricoFaltas", nullable = true, insertable = true, updatable = true)
    public String getHistóricoFaltas() {
        return históricoFaltas;
    }

    public void setHistóricoFaltas(String históricoFaltas) {
        this.históricoFaltas = históricoFaltas;
    }

    private String históricoHorasAnual;

    @Basic
    @javax.persistence.Column(name = "HistóricoHorasAnual", nullable = true, insertable = true, updatable = true)
    public String getHistóricoHorasAnual() {
        return históricoHorasAnual;
    }

    public void setHistóricoHorasAnual(String históricoHorasAnual) {
        this.históricoHorasAnual = históricoHorasAnual;
    }

    private BigDecimal classificaçãoPontos;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPontos", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getClassificaçãoPontos() {
        return classificaçãoPontos;
    }

    public void setClassificaçãoPontos(BigDecimal classificaçãoPontos) {
        this.classificaçãoPontos = classificaçãoPontos;
    }

    private Integer classificaçãoUnidade;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoUnidade", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoUnidade() {
        return classificaçãoUnidade;
    }

    public void setClassificaçãoUnidade(Integer classificaçãoUnidade) {
        this.classificaçãoUnidade = classificaçãoUnidade;
    }

    private Integer classificaçãoCurso;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoCurso", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoCurso() {
        return classificaçãoCurso;
    }

    public void setClassificaçãoCurso(Integer classificaçãoCurso) {
        this.classificaçãoCurso = classificaçãoCurso;
    }

    private Integer classificaçãoPeríodo;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPeríodo", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoPeríodo() {
        return classificaçãoPeríodo;
    }

    public void setClassificaçãoPeríodo(Integer classificaçãoPeríodo) {
        this.classificaçãoPeríodo = classificaçãoPeríodo;
    }

    private Integer classificaçãoTurma;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoTurma", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoTurma() {
        return classificaçãoTurma;
    }

    public void setClassificaçãoTurma(Integer classificaçãoTurma) {
        this.classificaçãoTurma = classificaçãoTurma;
    }

    private Integer classificaçãoUnidade1;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoUnidade1", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoUnidade1() {
        return classificaçãoUnidade1;
    }

    public void setClassificaçãoUnidade1(Integer classificaçãoUnidade1) {
        this.classificaçãoUnidade1 = classificaçãoUnidade1;
    }

    private Integer classificaçãoCurso1;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoCurso1", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoCurso1() {
        return classificaçãoCurso1;
    }

    public void setClassificaçãoCurso1(Integer classificaçãoCurso1) {
        this.classificaçãoCurso1 = classificaçãoCurso1;
    }

    private Integer classificaçãoPeríodo1;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPeríodo1", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoPeríodo1() {
        return classificaçãoPeríodo1;
    }

    public void setClassificaçãoPeríodo1(Integer classificaçãoPeríodo1) {
        this.classificaçãoPeríodo1 = classificaçãoPeríodo1;
    }

    private Integer classificaçãoTurma1;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoTurma1", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoTurma1() {
        return classificaçãoTurma1;
    }

    public void setClassificaçãoTurma1(Integer classificaçãoTurma1) {
        this.classificaçãoTurma1 = classificaçãoTurma1;
    }

    private Integer classificaçãoUnidade2;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoUnidade2", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoUnidade2() {
        return classificaçãoUnidade2;
    }

    public void setClassificaçãoUnidade2(Integer classificaçãoUnidade2) {
        this.classificaçãoUnidade2 = classificaçãoUnidade2;
    }

    private Integer classificaçãoCurso2;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoCurso2", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoCurso2() {
        return classificaçãoCurso2;
    }

    public void setClassificaçãoCurso2(Integer classificaçãoCurso2) {
        this.classificaçãoCurso2 = classificaçãoCurso2;
    }

    private Integer classificaçãoPeríodo2;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPeríodo2", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoPeríodo2() {
        return classificaçãoPeríodo2;
    }

    public void setClassificaçãoPeríodo2(Integer classificaçãoPeríodo2) {
        this.classificaçãoPeríodo2 = classificaçãoPeríodo2;
    }

    private Integer classificaçãoTurma2;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoTurma2", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoTurma2() {
        return classificaçãoTurma2;
    }

    public void setClassificaçãoTurma2(Integer classificaçãoTurma2) {
        this.classificaçãoTurma2 = classificaçãoTurma2;
    }

    private Integer classificaçãoUnidade3;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoUnidade3", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoUnidade3() {
        return classificaçãoUnidade3;
    }

    public void setClassificaçãoUnidade3(Integer classificaçãoUnidade3) {
        this.classificaçãoUnidade3 = classificaçãoUnidade3;
    }

    private Integer classificaçãoCurso3;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoCurso3", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoCurso3() {
        return classificaçãoCurso3;
    }

    public void setClassificaçãoCurso3(Integer classificaçãoCurso3) {
        this.classificaçãoCurso3 = classificaçãoCurso3;
    }

    private Integer classificaçãoPeríodo3;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPeríodo3", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoPeríodo3() {
        return classificaçãoPeríodo3;
    }

    public void setClassificaçãoPeríodo3(Integer classificaçãoPeríodo3) {
        this.classificaçãoPeríodo3 = classificaçãoPeríodo3;
    }

    private Integer classificaçãoTurma3;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoTurma3", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoTurma3() {
        return classificaçãoTurma3;
    }

    public void setClassificaçãoTurma3(Integer classificaçãoTurma3) {
        this.classificaçãoTurma3 = classificaçãoTurma3;
    }

    private Integer classificaçãoUnidade4;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoUnidade4", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoUnidade4() {
        return classificaçãoUnidade4;
    }

    public void setClassificaçãoUnidade4(Integer classificaçãoUnidade4) {
        this.classificaçãoUnidade4 = classificaçãoUnidade4;
    }

    private Integer classificaçãoCurso4;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoCurso4", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoCurso4() {
        return classificaçãoCurso4;
    }

    public void setClassificaçãoCurso4(Integer classificaçãoCurso4) {
        this.classificaçãoCurso4 = classificaçãoCurso4;
    }

    private Integer classificaçãoPeríodo4;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPeríodo4", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoPeríodo4() {
        return classificaçãoPeríodo4;
    }

    public void setClassificaçãoPeríodo4(Integer classificaçãoPeríodo4) {
        this.classificaçãoPeríodo4 = classificaçãoPeríodo4;
    }

    private Integer classificaçãoTurma4;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoTurma4", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoTurma4() {
        return classificaçãoTurma4;
    }

    public void setClassificaçãoTurma4(Integer classificaçãoTurma4) {
        this.classificaçãoTurma4 = classificaçãoTurma4;
    }

    private Integer classificaçãoUnidade5;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoUnidade5", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoUnidade5() {
        return classificaçãoUnidade5;
    }

    public void setClassificaçãoUnidade5(Integer classificaçãoUnidade5) {
        this.classificaçãoUnidade5 = classificaçãoUnidade5;
    }

    private Integer classificaçãoCurso5;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoCurso5", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoCurso5() {
        return classificaçãoCurso5;
    }

    public void setClassificaçãoCurso5(Integer classificaçãoCurso5) {
        this.classificaçãoCurso5 = classificaçãoCurso5;
    }

    private Integer classificaçãoPeríodo5;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPeríodo5", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoPeríodo5() {
        return classificaçãoPeríodo5;
    }

    public void setClassificaçãoPeríodo5(Integer classificaçãoPeríodo5) {
        this.classificaçãoPeríodo5 = classificaçãoPeríodo5;
    }

    private Integer classificaçãoTurma5;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoTurma5", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoTurma5() {
        return classificaçãoTurma5;
    }

    public void setClassificaçãoTurma5(Integer classificaçãoTurma5) {
        this.classificaçãoTurma5 = classificaçãoTurma5;
    }

    private Integer classificaçãoUnidade6;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoUnidade6", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoUnidade6() {
        return classificaçãoUnidade6;
    }

    public void setClassificaçãoUnidade6(Integer classificaçãoUnidade6) {
        this.classificaçãoUnidade6 = classificaçãoUnidade6;
    }

    private Integer classificaçãoCurso6;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoCurso6", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoCurso6() {
        return classificaçãoCurso6;
    }

    public void setClassificaçãoCurso6(Integer classificaçãoCurso6) {
        this.classificaçãoCurso6 = classificaçãoCurso6;
    }

    private Integer classificaçãoPeríodo6;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPeríodo6", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoPeríodo6() {
        return classificaçãoPeríodo6;
    }

    public void setClassificaçãoPeríodo6(Integer classificaçãoPeríodo6) {
        this.classificaçãoPeríodo6 = classificaçãoPeríodo6;
    }

    private Integer classificaçãoTurma6;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoTurma6", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoTurma6() {
        return classificaçãoTurma6;
    }

    public void setClassificaçãoTurma6(Integer classificaçãoTurma6) {
        this.classificaçãoTurma6 = classificaçãoTurma6;
    }

    private Integer classificaçãoUnidade7;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoUnidade7", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoUnidade7() {
        return classificaçãoUnidade7;
    }

    public void setClassificaçãoUnidade7(Integer classificaçãoUnidade7) {
        this.classificaçãoUnidade7 = classificaçãoUnidade7;
    }

    private Integer classificaçãoCurso7;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoCurso7", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoCurso7() {
        return classificaçãoCurso7;
    }

    public void setClassificaçãoCurso7(Integer classificaçãoCurso7) {
        this.classificaçãoCurso7 = classificaçãoCurso7;
    }

    private Integer classificaçãoPeríodo7;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPeríodo7", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoPeríodo7() {
        return classificaçãoPeríodo7;
    }

    public void setClassificaçãoPeríodo7(Integer classificaçãoPeríodo7) {
        this.classificaçãoPeríodo7 = classificaçãoPeríodo7;
    }

    private Integer classificaçãoTurma7;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoTurma7", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoTurma7() {
        return classificaçãoTurma7;
    }

    public void setClassificaçãoTurma7(Integer classificaçãoTurma7) {
        this.classificaçãoTurma7 = classificaçãoTurma7;
    }

    private Integer classificaçãoUnidade8;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoUnidade8", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoUnidade8() {
        return classificaçãoUnidade8;
    }

    public void setClassificaçãoUnidade8(Integer classificaçãoUnidade8) {
        this.classificaçãoUnidade8 = classificaçãoUnidade8;
    }

    private Integer classificaçãoCurso8;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoCurso8", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoCurso8() {
        return classificaçãoCurso8;
    }

    public void setClassificaçãoCurso8(Integer classificaçãoCurso8) {
        this.classificaçãoCurso8 = classificaçãoCurso8;
    }

    private Integer classificaçãoPeríodo8;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPeríodo8", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoPeríodo8() {
        return classificaçãoPeríodo8;
    }

    public void setClassificaçãoPeríodo8(Integer classificaçãoPeríodo8) {
        this.classificaçãoPeríodo8 = classificaçãoPeríodo8;
    }

    private Integer classificaçãoTurma8;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoTurma8", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoTurma8() {
        return classificaçãoTurma8;
    }

    public void setClassificaçãoTurma8(Integer classificaçãoTurma8) {
        this.classificaçãoTurma8 = classificaçãoTurma8;
    }

    private BigDecimal classificaçãoPontos1;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPontos1", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getClassificaçãoPontos1() {
        return classificaçãoPontos1;
    }

    public void setClassificaçãoPontos1(BigDecimal classificaçãoPontos1) {
        this.classificaçãoPontos1 = classificaçãoPontos1;
    }

    private BigDecimal classificaçãoPontos2;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPontos2", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getClassificaçãoPontos2() {
        return classificaçãoPontos2;
    }

    public void setClassificaçãoPontos2(BigDecimal classificaçãoPontos2) {
        this.classificaçãoPontos2 = classificaçãoPontos2;
    }

    private BigDecimal classificaçãoPontos3;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPontos3", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getClassificaçãoPontos3() {
        return classificaçãoPontos3;
    }

    public void setClassificaçãoPontos3(BigDecimal classificaçãoPontos3) {
        this.classificaçãoPontos3 = classificaçãoPontos3;
    }

    private BigDecimal classificaçãoPontos4;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPontos4", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getClassificaçãoPontos4() {
        return classificaçãoPontos4;
    }

    public void setClassificaçãoPontos4(BigDecimal classificaçãoPontos4) {
        this.classificaçãoPontos4 = classificaçãoPontos4;
    }

    private BigDecimal classificaçãoPontos5;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPontos5", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getClassificaçãoPontos5() {
        return classificaçãoPontos5;
    }

    public void setClassificaçãoPontos5(BigDecimal classificaçãoPontos5) {
        this.classificaçãoPontos5 = classificaçãoPontos5;
    }

    private BigDecimal classificaçãoPontos6;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPontos6", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getClassificaçãoPontos6() {
        return classificaçãoPontos6;
    }

    public void setClassificaçãoPontos6(BigDecimal classificaçãoPontos6) {
        this.classificaçãoPontos6 = classificaçãoPontos6;
    }

    private BigDecimal classificaçãoPontos7;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPontos7", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getClassificaçãoPontos7() {
        return classificaçãoPontos7;
    }

    public void setClassificaçãoPontos7(BigDecimal classificaçãoPontos7) {
        this.classificaçãoPontos7 = classificaçãoPontos7;
    }

    private BigDecimal classificaçãoPontos8;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoPontos8", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getClassificaçãoPontos8() {
        return classificaçãoPontos8;
    }

    public void setClassificaçãoPontos8(BigDecimal classificaçãoPontos8) {
        this.classificaçãoPontos8 = classificaçãoPontos8;
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

    private Integer codAvalista2;

    @Basic
    @javax.persistence.Column(name = "CodAvalista2", nullable = true, insertable = true, updatable = true)
    public Integer getCodAvalista2() {
        return codAvalista2;
    }

    public void setCodAvalista2(Integer codAvalista2) {
        this.codAvalista2 = codAvalista2;
    }

    private int históricoTipo;

    @Basic
    @javax.persistence.Column(name = "HistóricoTipo", nullable = false, insertable = true, updatable = true)
    public int getHistóricoTipo() {
        return históricoTipo;
    }

    public void setHistóricoTipo(int históricoTipo) {
        this.históricoTipo = históricoTipo;
    }

    private String onLineAgenda;

    @Basic
    @javax.persistence.Column(name = "OnLineAgenda", nullable = true, insertable = true, updatable = true)
    public String getOnLineAgenda() {
        return onLineAgenda;
    }

    public void setOnLineAgenda(String onLineAgenda) {
        this.onLineAgenda = onLineAgenda;
    }

    private Boolean prouni;

    @Basic
    @javax.persistence.Column(name = "Prouni", nullable = true, insertable = true, updatable = true)
    public Boolean getProuni() {
        return prouni;
    }

    public void setProuni(Boolean prouni) {
        this.prouni = prouni;
    }

    private String observaçãoPedagógica;

    @Basic
    @javax.persistence.Column(name = "ObservaçãoPedagógica", nullable = true, insertable = true, updatable = true)
    public String getObservaçãoPedagógica() {
        return observaçãoPedagógica;
    }

    public void setObservaçãoPedagógica(String observaçãoPedagógica) {
        this.observaçãoPedagógica = observaçãoPedagógica;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdPauta acdPauta = (AcdPauta) o;

        if (anoLetivo != acdPauta.anoLetivo) return false;
        if (apto != acdPauta.apto) return false;
        if (codCurso != acdPauta.codCurso) return false;
        if (codCursoVest != acdPauta.codCursoVest) return false;
        if (codGrade != acdPauta.codGrade) return false;
        if (codPauta != acdPauta.codPauta) return false;
        if (codPeríodo != acdPauta.codPeríodo) return false;
        if (codUnidade != acdPauta.codUnidade) return false;
        if (excluído != acdPauta.excluído) return false;
        if (históricoTipo != acdPauta.históricoTipo) return false;
        if (matrícula != acdPauta.matrícula) return false;
        if (númeroPauta != acdPauta.númeroPauta) return false;
        if (pautaId != acdPauta.pautaId) return false;
        if (ativa != null ? !ativa.equals(acdPauta.ativa) : acdPauta.ativa != null) return false;
        if (cancelada != null ? !cancelada.equals(acdPauta.cancelada) : acdPauta.cancelada != null) return false;
        if (classificaçãoCurso != null ? !classificaçãoCurso.equals(acdPauta.classificaçãoCurso) : acdPauta.classificaçãoCurso != null)
            return false;
        if (classificaçãoCurso1 != null ? !classificaçãoCurso1.equals(acdPauta.classificaçãoCurso1) : acdPauta.classificaçãoCurso1 != null)
            return false;
        if (classificaçãoCurso2 != null ? !classificaçãoCurso2.equals(acdPauta.classificaçãoCurso2) : acdPauta.classificaçãoCurso2 != null)
            return false;
        if (classificaçãoCurso3 != null ? !classificaçãoCurso3.equals(acdPauta.classificaçãoCurso3) : acdPauta.classificaçãoCurso3 != null)
            return false;
        if (classificaçãoCurso4 != null ? !classificaçãoCurso4.equals(acdPauta.classificaçãoCurso4) : acdPauta.classificaçãoCurso4 != null)
            return false;
        if (classificaçãoCurso5 != null ? !classificaçãoCurso5.equals(acdPauta.classificaçãoCurso5) : acdPauta.classificaçãoCurso5 != null)
            return false;
        if (classificaçãoCurso6 != null ? !classificaçãoCurso6.equals(acdPauta.classificaçãoCurso6) : acdPauta.classificaçãoCurso6 != null)
            return false;
        if (classificaçãoCurso7 != null ? !classificaçãoCurso7.equals(acdPauta.classificaçãoCurso7) : acdPauta.classificaçãoCurso7 != null)
            return false;
        if (classificaçãoCurso8 != null ? !classificaçãoCurso8.equals(acdPauta.classificaçãoCurso8) : acdPauta.classificaçãoCurso8 != null)
            return false;
        if (classificaçãoPeríodo != null ? !classificaçãoPeríodo.equals(acdPauta.classificaçãoPeríodo) : acdPauta.classificaçãoPeríodo != null)
            return false;
        if (classificaçãoPeríodo1 != null ? !classificaçãoPeríodo1.equals(acdPauta.classificaçãoPeríodo1) : acdPauta.classificaçãoPeríodo1 != null)
            return false;
        if (classificaçãoPeríodo2 != null ? !classificaçãoPeríodo2.equals(acdPauta.classificaçãoPeríodo2) : acdPauta.classificaçãoPeríodo2 != null)
            return false;
        if (classificaçãoPeríodo3 != null ? !classificaçãoPeríodo3.equals(acdPauta.classificaçãoPeríodo3) : acdPauta.classificaçãoPeríodo3 != null)
            return false;
        if (classificaçãoPeríodo4 != null ? !classificaçãoPeríodo4.equals(acdPauta.classificaçãoPeríodo4) : acdPauta.classificaçãoPeríodo4 != null)
            return false;
        if (classificaçãoPeríodo5 != null ? !classificaçãoPeríodo5.equals(acdPauta.classificaçãoPeríodo5) : acdPauta.classificaçãoPeríodo5 != null)
            return false;
        if (classificaçãoPeríodo6 != null ? !classificaçãoPeríodo6.equals(acdPauta.classificaçãoPeríodo6) : acdPauta.classificaçãoPeríodo6 != null)
            return false;
        if (classificaçãoPeríodo7 != null ? !classificaçãoPeríodo7.equals(acdPauta.classificaçãoPeríodo7) : acdPauta.classificaçãoPeríodo7 != null)
            return false;
        if (classificaçãoPeríodo8 != null ? !classificaçãoPeríodo8.equals(acdPauta.classificaçãoPeríodo8) : acdPauta.classificaçãoPeríodo8 != null)
            return false;
        if (classificaçãoPontos != null ? !classificaçãoPontos.equals(acdPauta.classificaçãoPontos) : acdPauta.classificaçãoPontos != null)
            return false;
        if (classificaçãoPontos1 != null ? !classificaçãoPontos1.equals(acdPauta.classificaçãoPontos1) : acdPauta.classificaçãoPontos1 != null)
            return false;
        if (classificaçãoPontos2 != null ? !classificaçãoPontos2.equals(acdPauta.classificaçãoPontos2) : acdPauta.classificaçãoPontos2 != null)
            return false;
        if (classificaçãoPontos3 != null ? !classificaçãoPontos3.equals(acdPauta.classificaçãoPontos3) : acdPauta.classificaçãoPontos3 != null)
            return false;
        if (classificaçãoPontos4 != null ? !classificaçãoPontos4.equals(acdPauta.classificaçãoPontos4) : acdPauta.classificaçãoPontos4 != null)
            return false;
        if (classificaçãoPontos5 != null ? !classificaçãoPontos5.equals(acdPauta.classificaçãoPontos5) : acdPauta.classificaçãoPontos5 != null)
            return false;
        if (classificaçãoPontos6 != null ? !classificaçãoPontos6.equals(acdPauta.classificaçãoPontos6) : acdPauta.classificaçãoPontos6 != null)
            return false;
        if (classificaçãoPontos7 != null ? !classificaçãoPontos7.equals(acdPauta.classificaçãoPontos7) : acdPauta.classificaçãoPontos7 != null)
            return false;
        if (classificaçãoPontos8 != null ? !classificaçãoPontos8.equals(acdPauta.classificaçãoPontos8) : acdPauta.classificaçãoPontos8 != null)
            return false;
        if (classificaçãoTurma != null ? !classificaçãoTurma.equals(acdPauta.classificaçãoTurma) : acdPauta.classificaçãoTurma != null)
            return false;
        if (classificaçãoTurma1 != null ? !classificaçãoTurma1.equals(acdPauta.classificaçãoTurma1) : acdPauta.classificaçãoTurma1 != null)
            return false;
        if (classificaçãoTurma2 != null ? !classificaçãoTurma2.equals(acdPauta.classificaçãoTurma2) : acdPauta.classificaçãoTurma2 != null)
            return false;
        if (classificaçãoTurma3 != null ? !classificaçãoTurma3.equals(acdPauta.classificaçãoTurma3) : acdPauta.classificaçãoTurma3 != null)
            return false;
        if (classificaçãoTurma4 != null ? !classificaçãoTurma4.equals(acdPauta.classificaçãoTurma4) : acdPauta.classificaçãoTurma4 != null)
            return false;
        if (classificaçãoTurma5 != null ? !classificaçãoTurma5.equals(acdPauta.classificaçãoTurma5) : acdPauta.classificaçãoTurma5 != null)
            return false;
        if (classificaçãoTurma6 != null ? !classificaçãoTurma6.equals(acdPauta.classificaçãoTurma6) : acdPauta.classificaçãoTurma6 != null)
            return false;
        if (classificaçãoTurma7 != null ? !classificaçãoTurma7.equals(acdPauta.classificaçãoTurma7) : acdPauta.classificaçãoTurma7 != null)
            return false;
        if (classificaçãoTurma8 != null ? !classificaçãoTurma8.equals(acdPauta.classificaçãoTurma8) : acdPauta.classificaçãoTurma8 != null)
            return false;
        if (classificaçãoUnidade != null ? !classificaçãoUnidade.equals(acdPauta.classificaçãoUnidade) : acdPauta.classificaçãoUnidade != null)
            return false;
        if (classificaçãoUnidade1 != null ? !classificaçãoUnidade1.equals(acdPauta.classificaçãoUnidade1) : acdPauta.classificaçãoUnidade1 != null)
            return false;
        if (classificaçãoUnidade2 != null ? !classificaçãoUnidade2.equals(acdPauta.classificaçãoUnidade2) : acdPauta.classificaçãoUnidade2 != null)
            return false;
        if (classificaçãoUnidade3 != null ? !classificaçãoUnidade3.equals(acdPauta.classificaçãoUnidade3) : acdPauta.classificaçãoUnidade3 != null)
            return false;
        if (classificaçãoUnidade4 != null ? !classificaçãoUnidade4.equals(acdPauta.classificaçãoUnidade4) : acdPauta.classificaçãoUnidade4 != null)
            return false;
        if (classificaçãoUnidade5 != null ? !classificaçãoUnidade5.equals(acdPauta.classificaçãoUnidade5) : acdPauta.classificaçãoUnidade5 != null)
            return false;
        if (classificaçãoUnidade6 != null ? !classificaçãoUnidade6.equals(acdPauta.classificaçãoUnidade6) : acdPauta.classificaçãoUnidade6 != null)
            return false;
        if (classificaçãoUnidade7 != null ? !classificaçãoUnidade7.equals(acdPauta.classificaçãoUnidade7) : acdPauta.classificaçãoUnidade7 != null)
            return false;
        if (classificaçãoUnidade8 != null ? !classificaçãoUnidade8.equals(acdPauta.classificaçãoUnidade8) : acdPauta.classificaçãoUnidade8 != null)
            return false;
        if (cobrançaObservação != null ? !cobrançaObservação.equals(acdPauta.cobrançaObservação) : acdPauta.cobrançaObservação != null)
            return false;
        if (cobrançaUnificada != null ? !cobrançaUnificada.equals(acdPauta.cobrançaUnificada) : acdPauta.cobrançaUnificada != null)
            return false;
        if (codAvalista != null ? !codAvalista.equals(acdPauta.codAvalista) : acdPauta.codAvalista != null)
            return false;
        if (codAvalista2 != null ? !codAvalista2.equals(acdPauta.codAvalista2) : acdPauta.codAvalista2 != null)
            return false;
        if (codCooperado != null ? !codCooperado.equals(acdPauta.codCooperado) : acdPauta.codCooperado != null)
            return false;
        if (codLíngua != null ? !codLíngua.equals(acdPauta.codLíngua) : acdPauta.codLíngua != null) return false;
        if (codMovimento != null ? !codMovimento.equals(acdPauta.codMovimento) : acdPauta.codMovimento != null)
            return false;
        if (codPautaDestino != null ? !codPautaDestino.equals(acdPauta.codPautaDestino) : acdPauta.codPautaDestino != null)
            return false;
        if (codPautaOrigem != null ? !codPautaOrigem.equals(acdPauta.codPautaOrigem) : acdPauta.codPautaOrigem != null)
            return false;
        if (codResponsável != null ? !codResponsável.equals(acdPauta.codResponsável) : acdPauta.codResponsável != null)
            return false;
        if (codResponsávelAcad != null ? !codResponsávelAcad.equals(acdPauta.codResponsávelAcad) : acdPauta.codResponsávelAcad != null)
            return false;
        if (codSituação != null ? !codSituação.equals(acdPauta.codSituação) : acdPauta.codSituação != null)
            return false;
        if (contrato != null ? !contrato.equals(acdPauta.contrato) : acdPauta.contrato != null) return false;
        if (cota != null ? !cota.equals(acdPauta.cota) : acdPauta.cota != null) return false;
        if (créditoCodMovimento != null ? !créditoCodMovimento.equals(acdPauta.créditoCodMovimento) : acdPauta.créditoCodMovimento != null)
            return false;
        if (dataCadastro != null ? !dataCadastro.equals(acdPauta.dataCadastro) : acdPauta.dataCadastro != null)
            return false;
        if (docEspecial != null ? !docEspecial.equals(acdPauta.docEspecial) : acdPauta.docEspecial != null)
            return false;
        if (docEspecialData != null ? !docEspecialData.equals(acdPauta.docEspecialData) : acdPauta.docEspecialData != null)
            return false;
        if (docEspecialDiaVencimento != null ? !docEspecialDiaVencimento.equals(acdPauta.docEspecialDiaVencimento) : acdPauta.docEspecialDiaVencimento != null)
            return false;
        if (docEspecialMêsValidade != null ? !docEspecialMêsValidade.equals(acdPauta.docEspecialMêsValidade) : acdPauta.docEspecialMêsValidade != null)
            return false;
        if (docEspecialObservação != null ? !docEspecialObservação.equals(acdPauta.docEspecialObservação) : acdPauta.docEspecialObservação != null)
            return false;
        if (estágioAprovado != null ? !estágioAprovado.equals(acdPauta.estágioAprovado) : acdPauta.estágioAprovado != null)
            return false;
        if (estágioCh != null ? !estágioCh.equals(acdPauta.estágioCh) : acdPauta.estágioCh != null) return false;
        if (estágioFim != null ? !estágioFim.equals(acdPauta.estágioFim) : acdPauta.estágioFim != null) return false;
        if (estágioInício != null ? !estágioInício.equals(acdPauta.estágioInício) : acdPauta.estágioInício != null)
            return false;
        if (histórico != null ? !histórico.equals(acdPauta.histórico) : acdPauta.histórico != null) return false;
        if (históricoCidade != null ? !históricoCidade.equals(acdPauta.históricoCidade) : acdPauta.históricoCidade != null)
            return false;
        if (históricoDiasLetivos != null ? !históricoDiasLetivos.equals(acdPauta.históricoDiasLetivos) : acdPauta.históricoDiasLetivos != null)
            return false;
        if (históricoDiretor != null ? !históricoDiretor.equals(acdPauta.históricoDiretor) : acdPauta.históricoDiretor != null)
            return false;
        if (históricoEscola != null ? !históricoEscola.equals(acdPauta.históricoEscola) : acdPauta.históricoEscola != null)
            return false;
        if (históricoExame1Altura != null ? !históricoExame1Altura.equals(acdPauta.históricoExame1Altura) : acdPauta.históricoExame1Altura != null)
            return false;
        if (históricoExame1Data != null ? !históricoExame1Data.equals(acdPauta.históricoExame1Data) : acdPauta.históricoExame1Data != null)
            return false;
        if (históricoExame1Peso != null ? !históricoExame1Peso.equals(acdPauta.históricoExame1Peso) : acdPauta.históricoExame1Peso != null)
            return false;
        if (históricoExame2Altura != null ? !históricoExame2Altura.equals(acdPauta.históricoExame2Altura) : acdPauta.históricoExame2Altura != null)
            return false;
        if (históricoExame2Data != null ? !históricoExame2Data.equals(acdPauta.históricoExame2Data) : acdPauta.históricoExame2Data != null)
            return false;
        if (históricoExame2Peso != null ? !históricoExame2Peso.equals(acdPauta.históricoExame2Peso) : acdPauta.históricoExame2Peso != null)
            return false;
        if (históricoFaltas != null ? !históricoFaltas.equals(acdPauta.históricoFaltas) : acdPauta.históricoFaltas != null)
            return false;
        if (históricoHorasAnual != null ? !históricoHorasAnual.equals(acdPauta.históricoHorasAnual) : acdPauta.históricoHorasAnual != null)
            return false;
        if (históricoResultado != null ? !históricoResultado.equals(acdPauta.históricoResultado) : acdPauta.históricoResultado != null)
            return false;
        if (históricoUf != null ? !históricoUf.equals(acdPauta.históricoUf) : acdPauta.históricoUf != null)
            return false;
        if (matrículaData != null ? !matrículaData.equals(acdPauta.matrículaData) : acdPauta.matrículaData != null)
            return false;
        if (matrículaDestino != null ? !matrículaDestino.equals(acdPauta.matrículaDestino) : acdPauta.matrículaDestino != null)
            return false;
        if (matrículaOrigem != null ? !matrículaOrigem.equals(acdPauta.matrículaOrigem) : acdPauta.matrículaOrigem != null)
            return false;
        if (matrículaUnificada != null ? !matrículaUnificada.equals(acdPauta.matrículaUnificada) : acdPauta.matrículaUnificada != null)
            return false;
        if (númeroCarnet != null ? !númeroCarnet.equals(acdPauta.númeroCarnet) : acdPauta.númeroCarnet != null)
            return false;
        if (númeroSérie != null ? !númeroSérie.equals(acdPauta.númeroSérie) : acdPauta.númeroSérie != null)
            return false;
        if (obsFinanceira != null ? !obsFinanceira.equals(acdPauta.obsFinanceira) : acdPauta.obsFinanceira != null)
            return false;
        if (obsFinanceiroCurto != null ? !obsFinanceiroCurto.equals(acdPauta.obsFinanceiroCurto) : acdPauta.obsFinanceiroCurto != null)
            return false;
        if (observação != null ? !observação.equals(acdPauta.observação) : acdPauta.observação != null) return false;
        if (observaçãoPedagógica != null ? !observaçãoPedagógica.equals(acdPauta.observaçãoPedagógica) : acdPauta.observaçãoPedagógica != null)
            return false;
        if (onLineAgenda != null ? !onLineAgenda.equals(acdPauta.onLineAgenda) : acdPauta.onLineAgenda != null)
            return false;
        if (prouni != null ? !prouni.equals(acdPauta.prouni) : acdPauta.prouni != null) return false;
        if (situaçãoData != null ? !situaçãoData.equals(acdPauta.situaçãoData) : acdPauta.situaçãoData != null)
            return false;
        if (textoUnificada != null ? !textoUnificada.equals(acdPauta.textoUnificada) : acdPauta.textoUnificada != null)
            return false;
        if (totalParcelaCarnet != null ? !totalParcelaCarnet.equals(acdPauta.totalParcelaCarnet) : acdPauta.totalParcelaCarnet != null)
            return false;
        if (turma != null ? !turma.equals(acdPauta.turma) : acdPauta.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pautaId ^ (pautaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) (codPauta ^ (codPauta >>> 32));
        result = 31 * result + (cancelada != null ? cancelada.hashCode() : 0);
        result = 31 * result + (codPautaOrigem != null ? codPautaOrigem.hashCode() : 0);
        result = 31 * result + (codPautaDestino != null ? codPautaDestino.hashCode() : 0);
        result = 31 * result + (codResponsávelAcad != null ? codResponsávelAcad.hashCode() : 0);
        result = 31 * result + (codResponsável != null ? codResponsável.hashCode() : 0);
        result = 31 * result + (codAvalista != null ? codAvalista.hashCode() : 0);
        result = 31 * result + anoLetivo;
        result = 31 * result + matrícula;
        result = 31 * result + codCursoVest;
        result = 31 * result + codCurso;
        result = 31 * result + codPeríodo;
        result = 31 * result + codGrade;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + (int) númeroPauta;
        result = 31 * result + (matrículaData != null ? matrículaData.hashCode() : 0);
        result = 31 * result + (codSituação != null ? codSituação.hashCode() : 0);
        result = 31 * result + (situaçãoData != null ? situaçãoData.hashCode() : 0);
        result = 31 * result + (apto ? 1 : 0);
        result = 31 * result + (estágioInício != null ? estágioInício.hashCode() : 0);
        result = 31 * result + (estágioFim != null ? estágioFim.hashCode() : 0);
        result = 31 * result + (estágioCh != null ? estágioCh.hashCode() : 0);
        result = 31 * result + (estágioAprovado != null ? estágioAprovado.hashCode() : 0);
        result = 31 * result + (docEspecial != null ? docEspecial.hashCode() : 0);
        result = 31 * result + (docEspecialMêsValidade != null ? docEspecialMêsValidade.hashCode() : 0);
        result = 31 * result + (docEspecialData != null ? docEspecialData.hashCode() : 0);
        result = 31 * result + (docEspecialObservação != null ? docEspecialObservação.hashCode() : 0);
        result = 31 * result + (docEspecialDiaVencimento != null ? docEspecialDiaVencimento.hashCode() : 0);
        result = 31 * result + (númeroSérie != null ? númeroSérie.hashCode() : 0);
        result = 31 * result + (númeroCarnet != null ? númeroCarnet.hashCode() : 0);
        result = 31 * result + (totalParcelaCarnet != null ? totalParcelaCarnet.hashCode() : 0);
        result = 31 * result + (cota != null ? cota.hashCode() : 0);
        result = 31 * result + (codCooperado != null ? codCooperado.hashCode() : 0);
        result = 31 * result + (textoUnificada != null ? textoUnificada.hashCode() : 0);
        result = 31 * result + (cobrançaObservação != null ? cobrançaObservação.hashCode() : 0);
        result = 31 * result + (matrículaOrigem != null ? matrículaOrigem.hashCode() : 0);
        result = 31 * result + (matrículaDestino != null ? matrículaDestino.hashCode() : 0);
        result = 31 * result + (codMovimento != null ? codMovimento.hashCode() : 0);
        result = 31 * result + (créditoCodMovimento != null ? créditoCodMovimento.hashCode() : 0);
        result = 31 * result + (contrato != null ? contrato.hashCode() : 0);
        result = 31 * result + (obsFinanceira != null ? obsFinanceira.hashCode() : 0);
        result = 31 * result + (obsFinanceiroCurto != null ? obsFinanceiroCurto.hashCode() : 0);
        result = 31 * result + (dataCadastro != null ? dataCadastro.hashCode() : 0);
        result = 31 * result + (codLíngua != null ? codLíngua.hashCode() : 0);
        result = 31 * result + (matrículaUnificada != null ? matrículaUnificada.hashCode() : 0);
        result = 31 * result + (cobrançaUnificada != null ? cobrançaUnificada.hashCode() : 0);
        result = 31 * result + (ativa != null ? ativa.hashCode() : 0);
        result = 31 * result + (histórico != null ? histórico.hashCode() : 0);
        result = 31 * result + (históricoEscola != null ? históricoEscola.hashCode() : 0);
        result = 31 * result + (históricoCidade != null ? históricoCidade.hashCode() : 0);
        result = 31 * result + (históricoUf != null ? históricoUf.hashCode() : 0);
        result = 31 * result + (históricoDiretor != null ? históricoDiretor.hashCode() : 0);
        result = 31 * result + (históricoExame1Data != null ? históricoExame1Data.hashCode() : 0);
        result = 31 * result + (históricoExame1Peso != null ? históricoExame1Peso.hashCode() : 0);
        result = 31 * result + (históricoExame1Altura != null ? históricoExame1Altura.hashCode() : 0);
        result = 31 * result + (históricoExame2Data != null ? históricoExame2Data.hashCode() : 0);
        result = 31 * result + (históricoExame2Peso != null ? históricoExame2Peso.hashCode() : 0);
        result = 31 * result + (históricoExame2Altura != null ? históricoExame2Altura.hashCode() : 0);
        result = 31 * result + (históricoResultado != null ? históricoResultado.hashCode() : 0);
        result = 31 * result + (históricoDiasLetivos != null ? históricoDiasLetivos.hashCode() : 0);
        result = 31 * result + (históricoFaltas != null ? históricoFaltas.hashCode() : 0);
        result = 31 * result + (históricoHorasAnual != null ? históricoHorasAnual.hashCode() : 0);
        result = 31 * result + (classificaçãoPontos != null ? classificaçãoPontos.hashCode() : 0);
        result = 31 * result + (classificaçãoUnidade != null ? classificaçãoUnidade.hashCode() : 0);
        result = 31 * result + (classificaçãoCurso != null ? classificaçãoCurso.hashCode() : 0);
        result = 31 * result + (classificaçãoPeríodo != null ? classificaçãoPeríodo.hashCode() : 0);
        result = 31 * result + (classificaçãoTurma != null ? classificaçãoTurma.hashCode() : 0);
        result = 31 * result + (classificaçãoUnidade1 != null ? classificaçãoUnidade1.hashCode() : 0);
        result = 31 * result + (classificaçãoCurso1 != null ? classificaçãoCurso1.hashCode() : 0);
        result = 31 * result + (classificaçãoPeríodo1 != null ? classificaçãoPeríodo1.hashCode() : 0);
        result = 31 * result + (classificaçãoTurma1 != null ? classificaçãoTurma1.hashCode() : 0);
        result = 31 * result + (classificaçãoUnidade2 != null ? classificaçãoUnidade2.hashCode() : 0);
        result = 31 * result + (classificaçãoCurso2 != null ? classificaçãoCurso2.hashCode() : 0);
        result = 31 * result + (classificaçãoPeríodo2 != null ? classificaçãoPeríodo2.hashCode() : 0);
        result = 31 * result + (classificaçãoTurma2 != null ? classificaçãoTurma2.hashCode() : 0);
        result = 31 * result + (classificaçãoUnidade3 != null ? classificaçãoUnidade3.hashCode() : 0);
        result = 31 * result + (classificaçãoCurso3 != null ? classificaçãoCurso3.hashCode() : 0);
        result = 31 * result + (classificaçãoPeríodo3 != null ? classificaçãoPeríodo3.hashCode() : 0);
        result = 31 * result + (classificaçãoTurma3 != null ? classificaçãoTurma3.hashCode() : 0);
        result = 31 * result + (classificaçãoUnidade4 != null ? classificaçãoUnidade4.hashCode() : 0);
        result = 31 * result + (classificaçãoCurso4 != null ? classificaçãoCurso4.hashCode() : 0);
        result = 31 * result + (classificaçãoPeríodo4 != null ? classificaçãoPeríodo4.hashCode() : 0);
        result = 31 * result + (classificaçãoTurma4 != null ? classificaçãoTurma4.hashCode() : 0);
        result = 31 * result + (classificaçãoUnidade5 != null ? classificaçãoUnidade5.hashCode() : 0);
        result = 31 * result + (classificaçãoCurso5 != null ? classificaçãoCurso5.hashCode() : 0);
        result = 31 * result + (classificaçãoPeríodo5 != null ? classificaçãoPeríodo5.hashCode() : 0);
        result = 31 * result + (classificaçãoTurma5 != null ? classificaçãoTurma5.hashCode() : 0);
        result = 31 * result + (classificaçãoUnidade6 != null ? classificaçãoUnidade6.hashCode() : 0);
        result = 31 * result + (classificaçãoCurso6 != null ? classificaçãoCurso6.hashCode() : 0);
        result = 31 * result + (classificaçãoPeríodo6 != null ? classificaçãoPeríodo6.hashCode() : 0);
        result = 31 * result + (classificaçãoTurma6 != null ? classificaçãoTurma6.hashCode() : 0);
        result = 31 * result + (classificaçãoUnidade7 != null ? classificaçãoUnidade7.hashCode() : 0);
        result = 31 * result + (classificaçãoCurso7 != null ? classificaçãoCurso7.hashCode() : 0);
        result = 31 * result + (classificaçãoPeríodo7 != null ? classificaçãoPeríodo7.hashCode() : 0);
        result = 31 * result + (classificaçãoTurma7 != null ? classificaçãoTurma7.hashCode() : 0);
        result = 31 * result + (classificaçãoUnidade8 != null ? classificaçãoUnidade8.hashCode() : 0);
        result = 31 * result + (classificaçãoCurso8 != null ? classificaçãoCurso8.hashCode() : 0);
        result = 31 * result + (classificaçãoPeríodo8 != null ? classificaçãoPeríodo8.hashCode() : 0);
        result = 31 * result + (classificaçãoTurma8 != null ? classificaçãoTurma8.hashCode() : 0);
        result = 31 * result + (classificaçãoPontos1 != null ? classificaçãoPontos1.hashCode() : 0);
        result = 31 * result + (classificaçãoPontos2 != null ? classificaçãoPontos2.hashCode() : 0);
        result = 31 * result + (classificaçãoPontos3 != null ? classificaçãoPontos3.hashCode() : 0);
        result = 31 * result + (classificaçãoPontos4 != null ? classificaçãoPontos4.hashCode() : 0);
        result = 31 * result + (classificaçãoPontos5 != null ? classificaçãoPontos5.hashCode() : 0);
        result = 31 * result + (classificaçãoPontos6 != null ? classificaçãoPontos6.hashCode() : 0);
        result = 31 * result + (classificaçãoPontos7 != null ? classificaçãoPontos7.hashCode() : 0);
        result = 31 * result + (classificaçãoPontos8 != null ? classificaçãoPontos8.hashCode() : 0);
        result = 31 * result + (excluído ? 1 : 0);
        result = 31 * result + (codAvalista2 != null ? codAvalista2.hashCode() : 0);
        result = 31 * result + históricoTipo;
        result = 31 * result + (onLineAgenda != null ? onLineAgenda.hashCode() : 0);
        result = 31 * result + (prouni != null ? prouni.hashCode() : 0);
        result = 31 * result + (observaçãoPedagógica != null ? observaçãoPedagógica.hashCode() : 0);
        result = 31 * result + (observação != null ? observação.hashCode() : 0);
        return result;
    }
}
