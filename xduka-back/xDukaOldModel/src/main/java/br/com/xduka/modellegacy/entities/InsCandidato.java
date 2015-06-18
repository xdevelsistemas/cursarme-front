package br.com.xduka.modellegacy.entities;

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
@IdClass(InsCandidatoPK.class)
public class InsCandidato {
    private long candidatoId;

    @Basic
    @javax.persistence.Column(name = "Candidato_ID", nullable = false, insertable = true, updatable = true)
    public long getCandidatoId() {
        return candidatoId;
    }

    public void setCandidatoId(long candidatoId) {
        this.candidatoId = candidatoId;
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

    private int codInscrição;

    @Id
    @javax.persistence.Column(name = "CodInscrição", nullable = false, insertable = true, updatable = true)
    public int getCodInscrição() {
        return codInscrição;
    }

    public void setCodInscrição(int codInscrição) {
        this.codInscrição = codInscrição;
    }

    private int codCandidato;

    @Id
    @javax.persistence.Column(name = "CodCandidato", nullable = false, insertable = true, updatable = true)
    public int getCodCandidato() {
        return codCandidato;
    }

    public void setCodCandidato(int codCandidato) {
        this.codCandidato = codCandidato;
    }

    private Integer codAluno;

    @Basic
    @javax.persistence.Column(name = "CodAluno", nullable = true, insertable = true, updatable = true)
    public Integer getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Integer codAluno) {
        this.codAluno = codAluno;
    }

    private Integer codPai;

    @Basic
    @javax.persistence.Column(name = "CodPai", nullable = true, insertable = true, updatable = true)
    public Integer getCodPai() {
        return codPai;
    }

    public void setCodPai(Integer codPai) {
        this.codPai = codPai;
    }

    private Integer codMãe;

    @Basic
    @javax.persistence.Column(name = "CodMãe", nullable = true, insertable = true, updatable = true)
    public Integer getCodMãe() {
        return codMãe;
    }

    public void setCodMãe(Integer codMãe) {
        this.codMãe = codMãe;
    }

    private Short anoLetivo;

    @Basic
    @javax.persistence.Column(name = "AnoLetivo", nullable = true, insertable = true, updatable = true)
    public Short getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(Short anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    private Byte codLínguaEstrangeira;

    @Basic
    @javax.persistence.Column(name = "CodLínguaEstrangeira", nullable = true, insertable = true, updatable = true)
    public Byte getCodLínguaEstrangeira() {
        return codLínguaEstrangeira;
    }

    public void setCodLínguaEstrangeira(Byte codLínguaEstrangeira) {
        this.codLínguaEstrangeira = codLínguaEstrangeira;
    }

    private Short sala;

    @Basic
    @javax.persistence.Column(name = "Sala", nullable = true, insertable = true, updatable = true)
    public Short getSala() {
        return sala;
    }

    public void setSala(Short sala) {
        this.sala = sala;
    }

    private Short classificação;

    @Basic
    @javax.persistence.Column(name = "Classificação", nullable = true, insertable = true, updatable = true)
    public Short getClassificação() {
        return classificação;
    }

    public void setClassificação(Short classificação) {
        this.classificação = classificação;
    }

    private boolean desclassificado;

    @Basic
    @javax.persistence.Column(name = "Desclassificado", nullable = false, insertable = true, updatable = true)
    public boolean isDesclassificado() {
        return desclassificado;
    }

    public void setDesclassificado(boolean desclassificado) {
        this.desclassificado = desclassificado;
    }

    private Integer matrículaAluno;

    @Basic
    @javax.persistence.Column(name = "MatrículaAluno", nullable = true, insertable = true, updatable = true)
    public Integer getMatrículaAluno() {
        return matrículaAluno;
    }

    public void setMatrículaAluno(Integer matrículaAluno) {
        this.matrículaAluno = matrículaAluno;
    }

    private Integer codGrau;

    @Basic
    @javax.persistence.Column(name = "CodGrau", nullable = true, insertable = true, updatable = true)
    public Integer getCodGrau() {
        return codGrau;
    }

    public void setCodGrau(Integer codGrau) {
        this.codGrau = codGrau;
    }

    private Integer codPeríodo;

    @Basic
    @javax.persistence.Column(name = "CodPeríodo", nullable = true, insertable = true, updatable = true)
    public Integer getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(Integer codPeríodo) {
        this.codPeríodo = codPeríodo;
    }

    private Short codOrigem;

    @Basic
    @javax.persistence.Column(name = "CodOrigem", nullable = true, insertable = true, updatable = true)
    public Short getCodOrigem() {
        return codOrigem;
    }

    public void setCodOrigem(Short codOrigem) {
        this.codOrigem = codOrigem;
    }

    private Double bolsa;

    @Basic
    @javax.persistence.Column(name = "Bolsa", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getBolsa() {
        return bolsa;
    }

    public void setBolsa(Double bolsa) {
        this.bolsa = bolsa;
    }

    private Double bônus;

    @Basic
    @javax.persistence.Column(name = "Bônus", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getBônus() {
        return bônus;
    }

    public void setBônus(Double bônus) {
        this.bônus = bônus;
    }

    private Double bolsaV;

    @Basic
    @javax.persistence.Column(name = "BolsaV", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getBolsaV() {
        return bolsaV;
    }

    public void setBolsaV(Double bolsaV) {
        this.bolsaV = bolsaV;
    }

    private Double bônusV;

    @Basic
    @javax.persistence.Column(name = "BônusV", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getBônusV() {
        return bônusV;
    }

    public void setBônusV(Double bônusV) {
        this.bônusV = bônusV;
    }

    private Double bolsaN;

    @Basic
    @javax.persistence.Column(name = "BolsaN", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getBolsaN() {
        return bolsaN;
    }

    public void setBolsaN(Double bolsaN) {
        this.bolsaN = bolsaN;
    }

    private Double bônusN;

    @Basic
    @javax.persistence.Column(name = "BônusN", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getBônusN() {
        return bônusN;
    }

    public void setBônusN(Double bônusN) {
        this.bônusN = bônusN;
    }

    private Timestamp instante;

    @Basic
    @javax.persistence.Column(name = "Instante", nullable = true, insertable = true, updatable = true)
    public Timestamp getInstante() {
        return instante;
    }

    public void setInstante(Timestamp instante) {
        this.instante = instante;
    }

    private Byte codCompRes;

    @Basic
    @javax.persistence.Column(name = "CodCompRes", nullable = true, insertable = true, updatable = true)
    public Byte getCodCompRes() {
        return codCompRes;
    }

    public void setCodCompRes(Byte codCompRes) {
        this.codCompRes = codCompRes;
    }

    private String licença;

    @Basic
    @javax.persistence.Column(name = "Licença", nullable = true, insertable = true, updatable = true)
    public String getLicença() {
        return licença;
    }

    public void setLicença(String licença) {
        this.licença = licença;
    }

    private boolean enemUsar;

    @Basic
    @javax.persistence.Column(name = "ENEMUsar", nullable = false, insertable = true, updatable = true)
    public boolean isEnemUsar() {
        return enemUsar;
    }

    public void setEnemUsar(boolean enemUsar) {
        this.enemUsar = enemUsar;
    }

    private String enemNúmero;

    @Basic
    @javax.persistence.Column(name = "ENEMNúmero", nullable = true, insertable = true, updatable = true)
    public String getEnemNúmero() {
        return enemNúmero;
    }

    public void setEnemNúmero(String enemNúmero) {
        this.enemNúmero = enemNúmero;
    }

    private Integer matrículaWeb;

    @Basic
    @javax.persistence.Column(name = "MatrículaWeb", nullable = true, insertable = true, updatable = true)
    public Integer getMatrículaWeb() {
        return matrículaWeb;
    }

    public void setMatrículaWeb(Integer matrículaWeb) {
        this.matrículaWeb = matrículaWeb;
    }

    private Boolean inscriçãoWeb;

    @Basic
    @javax.persistence.Column(name = "InscriçãoWeb", nullable = true, insertable = true, updatable = true)
    public Boolean getInscriçãoWeb() {
        return inscriçãoWeb;
    }

    public void setInscriçãoWeb(Boolean inscriçãoWeb) {
        this.inscriçãoWeb = inscriçãoWeb;
    }

    private Short classificação2;

    @Basic
    @javax.persistence.Column(name = "Classificação2", nullable = true, insertable = true, updatable = true)
    public Short getClassificação2() {
        return classificação2;
    }

    public void setClassificação2(Short classificação2) {
        this.classificação2 = classificação2;
    }

    private Byte posiçãoEscrita;

    @Basic
    @javax.persistence.Column(name = "PosiçãoEscrita", nullable = true, insertable = true, updatable = true)
    public Byte getPosiçãoEscrita() {
        return posiçãoEscrita;
    }

    public void setPosiçãoEscrita(Byte posiçãoEscrita) {
        this.posiçãoEscrita = posiçãoEscrita;
    }

    private Integer codCurso;

    @Basic
    @javax.persistence.Column(name = "CodCurso", nullable = true, insertable = true, updatable = true)
    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    private Boolean apto;

    @Basic
    @javax.persistence.Column(name = "Apto", nullable = true, insertable = true, updatable = true)
    public Boolean getApto() {
        return apto;
    }

    public void setApto(Boolean apto) {
        this.apto = apto;
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

    private Integer codUnidadeOrigem;

    @Basic
    @javax.persistence.Column(name = "CodUnidadeOrigem", nullable = true, insertable = true, updatable = true)
    public Integer getCodUnidadeOrigem() {
        return codUnidadeOrigem;
    }

    public void setCodUnidadeOrigem(Integer codUnidadeOrigem) {
        this.codUnidadeOrigem = codUnidadeOrigem;
    }

    private Integer codCursoVest;

    @Basic
    @javax.persistence.Column(name = "CodCursoVest", nullable = true, insertable = true, updatable = true)
    public Integer getCodCursoVest() {
        return codCursoVest;
    }

    public void setCodCursoVest(Integer codCursoVest) {
        this.codCursoVest = codCursoVest;
    }

    private BigDecimal pontuação01;

    @Basic
    @javax.persistence.Column(name = "Pontuação01", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação01() {
        return pontuação01;
    }

    public void setPontuação01(BigDecimal pontuação01) {
        this.pontuação01 = pontuação01;
    }

    private BigDecimal pontuação02;

    @Basic
    @javax.persistence.Column(name = "Pontuação02", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação02() {
        return pontuação02;
    }

    public void setPontuação02(BigDecimal pontuação02) {
        this.pontuação02 = pontuação02;
    }

    private BigDecimal pontuação03;

    @Basic
    @javax.persistence.Column(name = "Pontuação03", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação03() {
        return pontuação03;
    }

    public void setPontuação03(BigDecimal pontuação03) {
        this.pontuação03 = pontuação03;
    }

    private BigDecimal pontuação04;

    @Basic
    @javax.persistence.Column(name = "Pontuação04", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação04() {
        return pontuação04;
    }

    public void setPontuação04(BigDecimal pontuação04) {
        this.pontuação04 = pontuação04;
    }

    private BigDecimal pontuação05;

    @Basic
    @javax.persistence.Column(name = "Pontuação05", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação05() {
        return pontuação05;
    }

    public void setPontuação05(BigDecimal pontuação05) {
        this.pontuação05 = pontuação05;
    }

    private BigDecimal pontuação06;

    @Basic
    @javax.persistence.Column(name = "Pontuação06", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação06() {
        return pontuação06;
    }

    public void setPontuação06(BigDecimal pontuação06) {
        this.pontuação06 = pontuação06;
    }

    private BigDecimal pontuação07;

    @Basic
    @javax.persistence.Column(name = "Pontuação07", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação07() {
        return pontuação07;
    }

    public void setPontuação07(BigDecimal pontuação07) {
        this.pontuação07 = pontuação07;
    }

    private BigDecimal pontuação08;

    @Basic
    @javax.persistence.Column(name = "Pontuação08", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação08() {
        return pontuação08;
    }

    public void setPontuação08(BigDecimal pontuação08) {
        this.pontuação08 = pontuação08;
    }

    private BigDecimal pontuação09;

    @Basic
    @javax.persistence.Column(name = "Pontuação09", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação09() {
        return pontuação09;
    }

    public void setPontuação09(BigDecimal pontuação09) {
        this.pontuação09 = pontuação09;
    }

    private BigDecimal pontuação10;

    @Basic
    @javax.persistence.Column(name = "Pontuação10", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação10() {
        return pontuação10;
    }

    public void setPontuação10(BigDecimal pontuação10) {
        this.pontuação10 = pontuação10;
    }

    private BigDecimal pontuação11;

    @Basic
    @javax.persistence.Column(name = "Pontuação11", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação11() {
        return pontuação11;
    }

    public void setPontuação11(BigDecimal pontuação11) {
        this.pontuação11 = pontuação11;
    }

    private BigDecimal pontuação12;

    @Basic
    @javax.persistence.Column(name = "Pontuação12", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação12() {
        return pontuação12;
    }

    public void setPontuação12(BigDecimal pontuação12) {
        this.pontuação12 = pontuação12;
    }

    private BigDecimal pontuação13;

    @Basic
    @javax.persistence.Column(name = "Pontuação13", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação13() {
        return pontuação13;
    }

    public void setPontuação13(BigDecimal pontuação13) {
        this.pontuação13 = pontuação13;
    }

    private BigDecimal pontuação14;

    @Basic
    @javax.persistence.Column(name = "Pontuação14", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação14() {
        return pontuação14;
    }

    public void setPontuação14(BigDecimal pontuação14) {
        this.pontuação14 = pontuação14;
    }

    private BigDecimal pontuação15;

    @Basic
    @javax.persistence.Column(name = "Pontuação15", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação15() {
        return pontuação15;
    }

    public void setPontuação15(BigDecimal pontuação15) {
        this.pontuação15 = pontuação15;
    }

    private BigDecimal pontuação16;

    @Basic
    @javax.persistence.Column(name = "Pontuação16", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação16() {
        return pontuação16;
    }

    public void setPontuação16(BigDecimal pontuação16) {
        this.pontuação16 = pontuação16;
    }

    private BigDecimal pontuação17;

    @Basic
    @javax.persistence.Column(name = "Pontuação17", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação17() {
        return pontuação17;
    }

    public void setPontuação17(BigDecimal pontuação17) {
        this.pontuação17 = pontuação17;
    }

    private BigDecimal pontuação18;

    @Basic
    @javax.persistence.Column(name = "Pontuação18", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação18() {
        return pontuação18;
    }

    public void setPontuação18(BigDecimal pontuação18) {
        this.pontuação18 = pontuação18;
    }

    private BigDecimal pontuação19;

    @Basic
    @javax.persistence.Column(name = "Pontuação19", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação19() {
        return pontuação19;
    }

    public void setPontuação19(BigDecimal pontuação19) {
        this.pontuação19 = pontuação19;
    }

    private BigDecimal pontuação20;

    @Basic
    @javax.persistence.Column(name = "Pontuação20", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuação20() {
        return pontuação20;
    }

    public void setPontuação20(BigDecimal pontuação20) {
        this.pontuação20 = pontuação20;
    }

    private BigDecimal pontuaçãoTotal;

    @Basic
    @javax.persistence.Column(name = "PontuaçãoTotal", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPontuaçãoTotal() {
        return pontuaçãoTotal;
    }

    public void setPontuaçãoTotal(BigDecimal pontuaçãoTotal) {
        this.pontuaçãoTotal = pontuaçãoTotal;
    }

    private Integer classificaçãoGeral;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoGeral", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoGeral() {
        return classificaçãoGeral;
    }

    public void setClassificaçãoGeral(Integer classificaçãoGeral) {
        this.classificaçãoGeral = classificaçãoGeral;
    }

    private Integer classificaçãoCorreção;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoCorreção", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoCorreção() {
        return classificaçãoCorreção;
    }

    public void setClassificaçãoCorreção(Integer classificaçãoCorreção) {
        this.classificaçãoCorreção = classificaçãoCorreção;
    }

    private Timestamp dataInscrição;

    @Basic
    @javax.persistence.Column(name = "DataInscrição", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataInscrição() {
        return dataInscrição;
    }

    public void setDataInscrição(Timestamp dataInscrição) {
        this.dataInscrição = dataInscrição;
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

    private Integer classificaçãoTurno;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoTurno", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoTurno() {
        return classificaçãoTurno;
    }

    public void setClassificaçãoTurno(Integer classificaçãoTurno) {
        this.classificaçãoTurno = classificaçãoTurno;
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

    private Integer classificaçãoTurno2;

    @Basic
    @javax.persistence.Column(name = "ClassificaçãoTurno2", nullable = true, insertable = true, updatable = true)
    public Integer getClassificaçãoTurno2() {
        return classificaçãoTurno2;
    }

    public void setClassificaçãoTurno2(Integer classificaçãoTurno2) {
        this.classificaçãoTurno2 = classificaçãoTurno2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsCandidato that = (InsCandidato) o;

        if (candidatoId != that.candidatoId) return false;
        if (codCandidato != that.codCandidato) return false;
        if (codInscrição != that.codInscrição) return false;
        if (codUnidade != that.codUnidade) return false;
        if (desclassificado != that.desclassificado) return false;
        if (enemUsar != that.enemUsar) return false;
        if (anoLetivo != null ? !anoLetivo.equals(that.anoLetivo) : that.anoLetivo != null) return false;
        if (apto != null ? !apto.equals(that.apto) : that.apto != null) return false;
        if (bolsa != null ? !bolsa.equals(that.bolsa) : that.bolsa != null) return false;
        if (bolsaN != null ? !bolsaN.equals(that.bolsaN) : that.bolsaN != null) return false;
        if (bolsaV != null ? !bolsaV.equals(that.bolsaV) : that.bolsaV != null) return false;
        if (bônus != null ? !bônus.equals(that.bônus) : that.bônus != null) return false;
        if (bônusN != null ? !bônusN.equals(that.bônusN) : that.bônusN != null) return false;
        if (bônusV != null ? !bônusV.equals(that.bônusV) : that.bônusV != null) return false;
        if (classificação != null ? !classificação.equals(that.classificação) : that.classificação != null)
            return false;
        if (classificação2 != null ? !classificação2.equals(that.classificação2) : that.classificação2 != null)
            return false;
        if (classificaçãoCorreção != null ? !classificaçãoCorreção.equals(that.classificaçãoCorreção) : that.classificaçãoCorreção != null)
            return false;
        if (classificaçãoCurso != null ? !classificaçãoCurso.equals(that.classificaçãoCurso) : that.classificaçãoCurso != null)
            return false;
        if (classificaçãoCurso2 != null ? !classificaçãoCurso2.equals(that.classificaçãoCurso2) : that.classificaçãoCurso2 != null)
            return false;
        if (classificaçãoGeral != null ? !classificaçãoGeral.equals(that.classificaçãoGeral) : that.classificaçãoGeral != null)
            return false;
        if (classificaçãoPeríodo != null ? !classificaçãoPeríodo.equals(that.classificaçãoPeríodo) : that.classificaçãoPeríodo != null)
            return false;
        if (classificaçãoPeríodo2 != null ? !classificaçãoPeríodo2.equals(that.classificaçãoPeríodo2) : that.classificaçãoPeríodo2 != null)
            return false;
        if (classificaçãoTurma != null ? !classificaçãoTurma.equals(that.classificaçãoTurma) : that.classificaçãoTurma != null)
            return false;
        if (classificaçãoTurma2 != null ? !classificaçãoTurma2.equals(that.classificaçãoTurma2) : that.classificaçãoTurma2 != null)
            return false;
        if (classificaçãoTurno != null ? !classificaçãoTurno.equals(that.classificaçãoTurno) : that.classificaçãoTurno != null)
            return false;
        if (classificaçãoTurno2 != null ? !classificaçãoTurno2.equals(that.classificaçãoTurno2) : that.classificaçãoTurno2 != null)
            return false;
        if (codAluno != null ? !codAluno.equals(that.codAluno) : that.codAluno != null) return false;
        if (codCompRes != null ? !codCompRes.equals(that.codCompRes) : that.codCompRes != null) return false;
        if (codCurso != null ? !codCurso.equals(that.codCurso) : that.codCurso != null) return false;
        if (codCursoVest != null ? !codCursoVest.equals(that.codCursoVest) : that.codCursoVest != null) return false;
        if (codGrau != null ? !codGrau.equals(that.codGrau) : that.codGrau != null) return false;
        if (codLínguaEstrangeira != null ? !codLínguaEstrangeira.equals(that.codLínguaEstrangeira) : that.codLínguaEstrangeira != null)
            return false;
        if (codMovimento != null ? !codMovimento.equals(that.codMovimento) : that.codMovimento != null) return false;
        if (codMãe != null ? !codMãe.equals(that.codMãe) : that.codMãe != null) return false;
        if (codOrigem != null ? !codOrigem.equals(that.codOrigem) : that.codOrigem != null) return false;
        if (codPai != null ? !codPai.equals(that.codPai) : that.codPai != null) return false;
        if (codPeríodo != null ? !codPeríodo.equals(that.codPeríodo) : that.codPeríodo != null) return false;
        if (codUnidadeOrigem != null ? !codUnidadeOrigem.equals(that.codUnidadeOrigem) : that.codUnidadeOrigem != null)
            return false;
        if (dataInscrição != null ? !dataInscrição.equals(that.dataInscrição) : that.dataInscrição != null)
            return false;
        if (enemNúmero != null ? !enemNúmero.equals(that.enemNúmero) : that.enemNúmero != null) return false;
        if (inscriçãoWeb != null ? !inscriçãoWeb.equals(that.inscriçãoWeb) : that.inscriçãoWeb != null) return false;
        if (instante != null ? !instante.equals(that.instante) : that.instante != null) return false;
        if (licença != null ? !licença.equals(that.licença) : that.licença != null) return false;
        if (matrículaAluno != null ? !matrículaAluno.equals(that.matrículaAluno) : that.matrículaAluno != null)
            return false;
        if (matrículaWeb != null ? !matrículaWeb.equals(that.matrículaWeb) : that.matrículaWeb != null) return false;
        if (pontuação01 != null ? !pontuação01.equals(that.pontuação01) : that.pontuação01 != null) return false;
        if (pontuação02 != null ? !pontuação02.equals(that.pontuação02) : that.pontuação02 != null) return false;
        if (pontuação03 != null ? !pontuação03.equals(that.pontuação03) : that.pontuação03 != null) return false;
        if (pontuação04 != null ? !pontuação04.equals(that.pontuação04) : that.pontuação04 != null) return false;
        if (pontuação05 != null ? !pontuação05.equals(that.pontuação05) : that.pontuação05 != null) return false;
        if (pontuação06 != null ? !pontuação06.equals(that.pontuação06) : that.pontuação06 != null) return false;
        if (pontuação07 != null ? !pontuação07.equals(that.pontuação07) : that.pontuação07 != null) return false;
        if (pontuação08 != null ? !pontuação08.equals(that.pontuação08) : that.pontuação08 != null) return false;
        if (pontuação09 != null ? !pontuação09.equals(that.pontuação09) : that.pontuação09 != null) return false;
        if (pontuação10 != null ? !pontuação10.equals(that.pontuação10) : that.pontuação10 != null) return false;
        if (pontuação11 != null ? !pontuação11.equals(that.pontuação11) : that.pontuação11 != null) return false;
        if (pontuação12 != null ? !pontuação12.equals(that.pontuação12) : that.pontuação12 != null) return false;
        if (pontuação13 != null ? !pontuação13.equals(that.pontuação13) : that.pontuação13 != null) return false;
        if (pontuação14 != null ? !pontuação14.equals(that.pontuação14) : that.pontuação14 != null) return false;
        if (pontuação15 != null ? !pontuação15.equals(that.pontuação15) : that.pontuação15 != null) return false;
        if (pontuação16 != null ? !pontuação16.equals(that.pontuação16) : that.pontuação16 != null) return false;
        if (pontuação17 != null ? !pontuação17.equals(that.pontuação17) : that.pontuação17 != null) return false;
        if (pontuação18 != null ? !pontuação18.equals(that.pontuação18) : that.pontuação18 != null) return false;
        if (pontuação19 != null ? !pontuação19.equals(that.pontuação19) : that.pontuação19 != null) return false;
        if (pontuação20 != null ? !pontuação20.equals(that.pontuação20) : that.pontuação20 != null) return false;
        if (pontuaçãoTotal != null ? !pontuaçãoTotal.equals(that.pontuaçãoTotal) : that.pontuaçãoTotal != null)
            return false;
        if (posiçãoEscrita != null ? !posiçãoEscrita.equals(that.posiçãoEscrita) : that.posiçãoEscrita != null)
            return false;
        if (sala != null ? !sala.equals(that.sala) : that.sala != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (candidatoId ^ (candidatoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codInscrição;
        result = 31 * result + codCandidato;
        result = 31 * result + (codAluno != null ? codAluno.hashCode() : 0);
        result = 31 * result + (codPai != null ? codPai.hashCode() : 0);
        result = 31 * result + (codMãe != null ? codMãe.hashCode() : 0);
        result = 31 * result + (anoLetivo != null ? anoLetivo.hashCode() : 0);
        result = 31 * result + (codLínguaEstrangeira != null ? codLínguaEstrangeira.hashCode() : 0);
        result = 31 * result + (sala != null ? sala.hashCode() : 0);
        result = 31 * result + (classificação != null ? classificação.hashCode() : 0);
        result = 31 * result + (desclassificado ? 1 : 0);
        result = 31 * result + (matrículaAluno != null ? matrículaAluno.hashCode() : 0);
        result = 31 * result + (codGrau != null ? codGrau.hashCode() : 0);
        result = 31 * result + (codPeríodo != null ? codPeríodo.hashCode() : 0);
        result = 31 * result + (codOrigem != null ? codOrigem.hashCode() : 0);
        result = 31 * result + (bolsa != null ? bolsa.hashCode() : 0);
        result = 31 * result + (bônus != null ? bônus.hashCode() : 0);
        result = 31 * result + (bolsaV != null ? bolsaV.hashCode() : 0);
        result = 31 * result + (bônusV != null ? bônusV.hashCode() : 0);
        result = 31 * result + (bolsaN != null ? bolsaN.hashCode() : 0);
        result = 31 * result + (bônusN != null ? bônusN.hashCode() : 0);
        result = 31 * result + (instante != null ? instante.hashCode() : 0);
        result = 31 * result + (codCompRes != null ? codCompRes.hashCode() : 0);
        result = 31 * result + (licença != null ? licença.hashCode() : 0);
        result = 31 * result + (enemUsar ? 1 : 0);
        result = 31 * result + (enemNúmero != null ? enemNúmero.hashCode() : 0);
        result = 31 * result + (matrículaWeb != null ? matrículaWeb.hashCode() : 0);
        result = 31 * result + (inscriçãoWeb != null ? inscriçãoWeb.hashCode() : 0);
        result = 31 * result + (classificação2 != null ? classificação2.hashCode() : 0);
        result = 31 * result + (posiçãoEscrita != null ? posiçãoEscrita.hashCode() : 0);
        result = 31 * result + (codCurso != null ? codCurso.hashCode() : 0);
        result = 31 * result + (apto != null ? apto.hashCode() : 0);
        result = 31 * result + (codMovimento != null ? codMovimento.hashCode() : 0);
        result = 31 * result + (codUnidadeOrigem != null ? codUnidadeOrigem.hashCode() : 0);
        result = 31 * result + (codCursoVest != null ? codCursoVest.hashCode() : 0);
        result = 31 * result + (pontuação01 != null ? pontuação01.hashCode() : 0);
        result = 31 * result + (pontuação02 != null ? pontuação02.hashCode() : 0);
        result = 31 * result + (pontuação03 != null ? pontuação03.hashCode() : 0);
        result = 31 * result + (pontuação04 != null ? pontuação04.hashCode() : 0);
        result = 31 * result + (pontuação05 != null ? pontuação05.hashCode() : 0);
        result = 31 * result + (pontuação06 != null ? pontuação06.hashCode() : 0);
        result = 31 * result + (pontuação07 != null ? pontuação07.hashCode() : 0);
        result = 31 * result + (pontuação08 != null ? pontuação08.hashCode() : 0);
        result = 31 * result + (pontuação09 != null ? pontuação09.hashCode() : 0);
        result = 31 * result + (pontuação10 != null ? pontuação10.hashCode() : 0);
        result = 31 * result + (pontuação11 != null ? pontuação11.hashCode() : 0);
        result = 31 * result + (pontuação12 != null ? pontuação12.hashCode() : 0);
        result = 31 * result + (pontuação13 != null ? pontuação13.hashCode() : 0);
        result = 31 * result + (pontuação14 != null ? pontuação14.hashCode() : 0);
        result = 31 * result + (pontuação15 != null ? pontuação15.hashCode() : 0);
        result = 31 * result + (pontuação16 != null ? pontuação16.hashCode() : 0);
        result = 31 * result + (pontuação17 != null ? pontuação17.hashCode() : 0);
        result = 31 * result + (pontuação18 != null ? pontuação18.hashCode() : 0);
        result = 31 * result + (pontuação19 != null ? pontuação19.hashCode() : 0);
        result = 31 * result + (pontuação20 != null ? pontuação20.hashCode() : 0);
        result = 31 * result + (pontuaçãoTotal != null ? pontuaçãoTotal.hashCode() : 0);
        result = 31 * result + (classificaçãoGeral != null ? classificaçãoGeral.hashCode() : 0);
        result = 31 * result + (classificaçãoCorreção != null ? classificaçãoCorreção.hashCode() : 0);
        result = 31 * result + (dataInscrição != null ? dataInscrição.hashCode() : 0);
        result = 31 * result + (classificaçãoCurso != null ? classificaçãoCurso.hashCode() : 0);
        result = 31 * result + (classificaçãoPeríodo != null ? classificaçãoPeríodo.hashCode() : 0);
        result = 31 * result + (classificaçãoTurma != null ? classificaçãoTurma.hashCode() : 0);
        result = 31 * result + (classificaçãoTurno != null ? classificaçãoTurno.hashCode() : 0);
        result = 31 * result + (classificaçãoCurso2 != null ? classificaçãoCurso2.hashCode() : 0);
        result = 31 * result + (classificaçãoPeríodo2 != null ? classificaçãoPeríodo2.hashCode() : 0);
        result = 31 * result + (classificaçãoTurma2 != null ? classificaçãoTurma2.hashCode() : 0);
        result = 31 * result + (classificaçãoTurno2 != null ? classificaçãoTurno2.hashCode() : 0);
        return result;
    }
}
