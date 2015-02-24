package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class AcdPautaNota {
    private long pautaNotaId;

    @Basic
    @javax.persistence.Column(name = "PautaNota_ID", nullable = false, insertable = true, updatable = true)
    public long getPautaNotaId() {
        return pautaNotaId;
    }

    public void setPautaNotaId(long pautaNotaId) {
        this.pautaNotaId = pautaNotaId;
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

    private int codDisciplina;

    @Id
    @javax.persistence.Column(name = "CodDisciplina", nullable = false, insertable = true, updatable = true)
    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    private byte dependência;

    @Id
    @javax.persistence.Column(name = "Dependência", nullable = false, insertable = true, updatable = true)
    public byte getDependência() {
        return dependência;
    }

    public void setDependência(byte dependência) {
        this.dependência = dependência;
    }

    private String históricoDisciplina;

    @Basic
    @javax.persistence.Column(name = "HistóricoDisciplina", nullable = true, insertable = true, updatable = true)
    public String getHistóricoDisciplina() {
        return históricoDisciplina;
    }

    public void setHistóricoDisciplina(String históricoDisciplina) {
        this.históricoDisciplina = históricoDisciplina;
    }

    private String históricoCh;

    @Basic
    @javax.persistence.Column(name = "HistóricoCH", nullable = true, insertable = true, updatable = true)
    public String getHistóricoCh() {
        return históricoCh;
    }

    public void setHistóricoCh(String históricoCh) {
        this.históricoCh = históricoCh;
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

    private String históricoConceito;

    @Basic
    @javax.persistence.Column(name = "HistóricoConceito", nullable = true, insertable = true, updatable = true)
    public String getHistóricoConceito() {
        return históricoConceito;
    }

    public void setHistóricoConceito(String históricoConceito) {
        this.históricoConceito = históricoConceito;
    }

    private String históricoFaltas;

    @Basic
    @javax.persistence.Column(name = "HistóricoFaltas", nullable = true, insertable = true, updatable = true, length = 10)
    public String getHistóricoFaltas() {
        return históricoFaltas;
    }

    public void setHistóricoFaltas(String históricoFaltas) {
        this.históricoFaltas = históricoFaltas;
    }

    private Integer matrícula;

    @Basic
    @javax.persistence.Column(name = "Matrícula", nullable = true, insertable = true, updatable = true)
    public Integer getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(Integer matrícula) {
        this.matrícula = matrícula;
    }

    private int gradeÚnica;

    @Basic
    @javax.persistence.Column(name = "GradeÚnica", nullable = false, insertable = true, updatable = true)
    public int getGradeÚnica() {
        return gradeÚnica;
    }

    public void setGradeÚnica(int gradeÚnica) {
        this.gradeÚnica = gradeÚnica;
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

    private String turma;

    @Basic
    @javax.persistence.Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    private Byte númeroPauta;

    @Basic
    @javax.persistence.Column(name = "NúmeroPauta", nullable = true, insertable = true, updatable = true)
    public Byte getNúmeroPauta() {
        return númeroPauta;
    }

    public void setNúmeroPauta(Byte númeroPauta) {
        this.númeroPauta = númeroPauta;
    }

    private long codInativa;

    @Basic
    @javax.persistence.Column(name = "CodInativa", nullable = false, insertable = true, updatable = true)
    public long getCodInativa() {
        return codInativa;
    }

    public void setCodInativa(long codInativa) {
        this.codInativa = codInativa;
    }

    private BigDecimal nota1;

    @Basic
    @javax.persistence.Column(name = "Nota1", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getNota1() {
        return nota1;
    }

    public void setNota1(BigDecimal nota1) {
        this.nota1 = nota1;
    }

    private BigDecimal nota2;

    @Basic
    @javax.persistence.Column(name = "Nota2", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getNota2() {
        return nota2;
    }

    public void setNota2(BigDecimal nota2) {
        this.nota2 = nota2;
    }

    private BigDecimal nota3;

    @Basic
    @javax.persistence.Column(name = "Nota3", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getNota3() {
        return nota3;
    }

    public void setNota3(BigDecimal nota3) {
        this.nota3 = nota3;
    }

    private BigDecimal nota4;

    @Basic
    @javax.persistence.Column(name = "Nota4", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getNota4() {
        return nota4;
    }

    public void setNota4(BigDecimal nota4) {
        this.nota4 = nota4;
    }

    private BigDecimal nota5;

    @Basic
    @javax.persistence.Column(name = "Nota5", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getNota5() {
        return nota5;
    }

    public void setNota5(BigDecimal nota5) {
        this.nota5 = nota5;
    }

    private BigDecimal nota6;

    @Basic
    @javax.persistence.Column(name = "Nota6", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getNota6() {
        return nota6;
    }

    public void setNota6(BigDecimal nota6) {
        this.nota6 = nota6;
    }

    private BigDecimal nota7;

    @Basic
    @javax.persistence.Column(name = "Nota7", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getNota7() {
        return nota7;
    }

    public void setNota7(BigDecimal nota7) {
        this.nota7 = nota7;
    }

    private BigDecimal nota8;

    @Basic
    @javax.persistence.Column(name = "Nota8", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getNota8() {
        return nota8;
    }

    public void setNota8(BigDecimal nota8) {
        this.nota8 = nota8;
    }

    private BigDecimal notaRecuperação;

    @Basic
    @javax.persistence.Column(name = "NotaRecuperação", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getNotaRecuperação() {
        return notaRecuperação;
    }

    public void setNotaRecuperação(BigDecimal notaRecuperação) {
        this.notaRecuperação = notaRecuperação;
    }

    private BigDecimal notaRecuperação2;

    @Basic
    @javax.persistence.Column(name = "NotaRecuperação2", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getNotaRecuperação2() {
        return notaRecuperação2;
    }

    public void setNotaRecuperação2(BigDecimal notaRecuperação2) {
        this.notaRecuperação2 = notaRecuperação2;
    }

    private BigDecimal médiaAnual;

    @Basic
    @javax.persistence.Column(name = "MédiaAnual", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédiaAnual() {
        return médiaAnual;
    }

    public void setMédiaAnual(BigDecimal médiaAnual) {
        this.médiaAnual = médiaAnual;
    }

    private BigDecimal médiaFinal;

    @Basic
    @javax.persistence.Column(name = "MédiaFinal", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédiaFinal() {
        return médiaFinal;
    }

    public void setMédiaFinal(BigDecimal médiaFinal) {
        this.médiaFinal = médiaFinal;
    }

    private Byte faltas1;

    @Basic
    @javax.persistence.Column(name = "Faltas1", nullable = true, insertable = true, updatable = true)
    public Byte getFaltas1() {
        return faltas1;
    }

    public void setFaltas1(Byte faltas1) {
        this.faltas1 = faltas1;
    }

    private Byte faltas2;

    @Basic
    @javax.persistence.Column(name = "Faltas2", nullable = true, insertable = true, updatable = true)
    public Byte getFaltas2() {
        return faltas2;
    }

    public void setFaltas2(Byte faltas2) {
        this.faltas2 = faltas2;
    }

    private Byte faltas3;

    @Basic
    @javax.persistence.Column(name = "Faltas3", nullable = true, insertable = true, updatable = true)
    public Byte getFaltas3() {
        return faltas3;
    }

    public void setFaltas3(Byte faltas3) {
        this.faltas3 = faltas3;
    }

    private Byte faltas4;

    @Basic
    @javax.persistence.Column(name = "Faltas4", nullable = true, insertable = true, updatable = true)
    public Byte getFaltas4() {
        return faltas4;
    }

    public void setFaltas4(Byte faltas4) {
        this.faltas4 = faltas4;
    }

    private Byte faltas5;

    @Basic
    @javax.persistence.Column(name = "Faltas5", nullable = true, insertable = true, updatable = true)
    public Byte getFaltas5() {
        return faltas5;
    }

    public void setFaltas5(Byte faltas5) {
        this.faltas5 = faltas5;
    }

    private Byte faltas6;

    @Basic
    @javax.persistence.Column(name = "Faltas6", nullable = true, insertable = true, updatable = true)
    public Byte getFaltas6() {
        return faltas6;
    }

    public void setFaltas6(Byte faltas6) {
        this.faltas6 = faltas6;
    }

    private Byte faltas7;

    @Basic
    @javax.persistence.Column(name = "Faltas7", nullable = true, insertable = true, updatable = true)
    public Byte getFaltas7() {
        return faltas7;
    }

    public void setFaltas7(Byte faltas7) {
        this.faltas7 = faltas7;
    }

    private Byte faltas8;

    @Basic
    @javax.persistence.Column(name = "Faltas8", nullable = true, insertable = true, updatable = true)
    public Byte getFaltas8() {
        return faltas8;
    }

    public void setFaltas8(Byte faltas8) {
        this.faltas8 = faltas8;
    }

    private Byte faltasTotal;

    @Basic
    @javax.persistence.Column(name = "FaltasTotal", nullable = true, insertable = true, updatable = true)
    public Byte getFaltasTotal() {
        return faltasTotal;
    }

    public void setFaltasTotal(Byte faltasTotal) {
        this.faltasTotal = faltasTotal;
    }

    private Short aulas1;

    @Basic
    @javax.persistence.Column(name = "Aulas1", nullable = true, insertable = true, updatable = true)
    public Short getAulas1() {
        return aulas1;
    }

    public void setAulas1(Short aulas1) {
        this.aulas1 = aulas1;
    }

    private Short aulas2;

    @Basic
    @javax.persistence.Column(name = "Aulas2", nullable = true, insertable = true, updatable = true)
    public Short getAulas2() {
        return aulas2;
    }

    public void setAulas2(Short aulas2) {
        this.aulas2 = aulas2;
    }

    private Short aulas3;

    @Basic
    @javax.persistence.Column(name = "Aulas3", nullable = true, insertable = true, updatable = true)
    public Short getAulas3() {
        return aulas3;
    }

    public void setAulas3(Short aulas3) {
        this.aulas3 = aulas3;
    }

    private Short aulas4;

    @Basic
    @javax.persistence.Column(name = "Aulas4", nullable = true, insertable = true, updatable = true)
    public Short getAulas4() {
        return aulas4;
    }

    public void setAulas4(Short aulas4) {
        this.aulas4 = aulas4;
    }

    private Short aulas5;

    @Basic
    @javax.persistence.Column(name = "Aulas5", nullable = true, insertable = true, updatable = true)
    public Short getAulas5() {
        return aulas5;
    }

    public void setAulas5(Short aulas5) {
        this.aulas5 = aulas5;
    }

    private Short aulas6;

    @Basic
    @javax.persistence.Column(name = "Aulas6", nullable = true, insertable = true, updatable = true)
    public Short getAulas6() {
        return aulas6;
    }

    public void setAulas6(Short aulas6) {
        this.aulas6 = aulas6;
    }

    private Short aulas7;

    @Basic
    @javax.persistence.Column(name = "Aulas7", nullable = true, insertable = true, updatable = true)
    public Short getAulas7() {
        return aulas7;
    }

    public void setAulas7(Short aulas7) {
        this.aulas7 = aulas7;
    }

    private Short aulas8;

    @Basic
    @javax.persistence.Column(name = "Aulas8", nullable = true, insertable = true, updatable = true)
    public Short getAulas8() {
        return aulas8;
    }

    public void setAulas8(Short aulas8) {
        this.aulas8 = aulas8;
    }

    private boolean aprovado;

    @Basic
    @javax.persistence.Column(name = "Aprovado", nullable = false, insertable = true, updatable = true)
    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    private boolean dispensado;

    @Basic
    @javax.persistence.Column(name = "Dispensado", nullable = false, insertable = true, updatable = true)
    public boolean isDispensado() {
        return dispensado;
    }

    public void setDispensado(boolean dispensado) {
        this.dispensado = dispensado;
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

    private Byte fm01;

    @Basic
    @javax.persistence.Column(name = "FM01", nullable = true, insertable = true, updatable = true)
    public Byte getFm01() {
        return fm01;
    }

    public void setFm01(Byte fm01) {
        this.fm01 = fm01;
    }

    private Byte fm02;

    @Basic
    @javax.persistence.Column(name = "FM02", nullable = true, insertable = true, updatable = true)
    public Byte getFm02() {
        return fm02;
    }

    public void setFm02(Byte fm02) {
        this.fm02 = fm02;
    }

    private Byte fm03;

    @Basic
    @javax.persistence.Column(name = "FM03", nullable = true, insertable = true, updatable = true)
    public Byte getFm03() {
        return fm03;
    }

    public void setFm03(Byte fm03) {
        this.fm03 = fm03;
    }

    private Byte fm04;

    @Basic
    @javax.persistence.Column(name = "FM04", nullable = true, insertable = true, updatable = true)
    public Byte getFm04() {
        return fm04;
    }

    public void setFm04(Byte fm04) {
        this.fm04 = fm04;
    }

    private Byte fm05;

    @Basic
    @javax.persistence.Column(name = "FM05", nullable = true, insertable = true, updatable = true)
    public Byte getFm05() {
        return fm05;
    }

    public void setFm05(Byte fm05) {
        this.fm05 = fm05;
    }

    private Byte fm06;

    @Basic
    @javax.persistence.Column(name = "FM06", nullable = true, insertable = true, updatable = true)
    public Byte getFm06() {
        return fm06;
    }

    public void setFm06(Byte fm06) {
        this.fm06 = fm06;
    }

    private Byte fm07;

    @Basic
    @javax.persistence.Column(name = "FM07", nullable = true, insertable = true, updatable = true)
    public Byte getFm07() {
        return fm07;
    }

    public void setFm07(Byte fm07) {
        this.fm07 = fm07;
    }

    private Byte fm08;

    @Basic
    @javax.persistence.Column(name = "FM08", nullable = true, insertable = true, updatable = true)
    public Byte getFm08() {
        return fm08;
    }

    public void setFm08(Byte fm08) {
        this.fm08 = fm08;
    }

    private Byte fm09;

    @Basic
    @javax.persistence.Column(name = "FM09", nullable = true, insertable = true, updatable = true)
    public Byte getFm09() {
        return fm09;
    }

    public void setFm09(Byte fm09) {
        this.fm09 = fm09;
    }

    private Byte fm10;

    @Basic
    @javax.persistence.Column(name = "FM10", nullable = true, insertable = true, updatable = true)
    public Byte getFm10() {
        return fm10;
    }

    public void setFm10(Byte fm10) {
        this.fm10 = fm10;
    }

    private Byte fm11;

    @Basic
    @javax.persistence.Column(name = "FM11", nullable = true, insertable = true, updatable = true)
    public Byte getFm11() {
        return fm11;
    }

    public void setFm11(Byte fm11) {
        this.fm11 = fm11;
    }

    private Byte fm12;

    @Basic
    @javax.persistence.Column(name = "FM12", nullable = true, insertable = true, updatable = true)
    public Byte getFm12() {
        return fm12;
    }

    public void setFm12(Byte fm12) {
        this.fm12 = fm12;
    }

    private BigDecimal recuperação1;

    @Basic
    @javax.persistence.Column(name = "Recuperação1", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getRecuperação1() {
        return recuperação1;
    }

    public void setRecuperação1(BigDecimal recuperação1) {
        this.recuperação1 = recuperação1;
    }

    private BigDecimal recuperação2;

    @Basic
    @javax.persistence.Column(name = "Recuperação2", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getRecuperação2() {
        return recuperação2;
    }

    public void setRecuperação2(BigDecimal recuperação2) {
        this.recuperação2 = recuperação2;
    }

    private BigDecimal recuperação3;

    @Basic
    @javax.persistence.Column(name = "Recuperação3", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getRecuperação3() {
        return recuperação3;
    }

    public void setRecuperação3(BigDecimal recuperação3) {
        this.recuperação3 = recuperação3;
    }

    private BigDecimal recuperação4;

    @Basic
    @javax.persistence.Column(name = "Recuperação4", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getRecuperação4() {
        return recuperação4;
    }

    public void setRecuperação4(BigDecimal recuperação4) {
        this.recuperação4 = recuperação4;
    }

    private BigDecimal recuperação5;

    @Basic
    @javax.persistence.Column(name = "Recuperação5", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getRecuperação5() {
        return recuperação5;
    }

    public void setRecuperação5(BigDecimal recuperação5) {
        this.recuperação5 = recuperação5;
    }

    private BigDecimal recuperação6;

    @Basic
    @javax.persistence.Column(name = "Recuperação6", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getRecuperação6() {
        return recuperação6;
    }

    public void setRecuperação6(BigDecimal recuperação6) {
        this.recuperação6 = recuperação6;
    }

    private BigDecimal recuperação7;

    @Basic
    @javax.persistence.Column(name = "Recuperação7", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getRecuperação7() {
        return recuperação7;
    }

    public void setRecuperação7(BigDecimal recuperação7) {
        this.recuperação7 = recuperação7;
    }

    private BigDecimal recuperação8;

    @Basic
    @javax.persistence.Column(name = "Recuperação8", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getRecuperação8() {
        return recuperação8;
    }

    public void setRecuperação8(BigDecimal recuperação8) {
        this.recuperação8 = recuperação8;
    }

    private Boolean processando;

    @Basic
    @javax.persistence.Column(name = "Processando", nullable = true, insertable = true, updatable = true)
    public Boolean getProcessando() {
        return processando;
    }

    public void setProcessando(Boolean processando) {
        this.processando = processando;
    }

    private String faltasHoras;

    @Basic
    @javax.persistence.Column(name = "FaltasHoras", nullable = true, insertable = true, updatable = true)
    public String getFaltasHoras() {
        return faltasHoras;
    }

    public void setFaltasHoras(String faltasHoras) {
        this.faltasHoras = faltasHoras;
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

    private boolean excluídoPauta;

    @Basic
    @javax.persistence.Column(name = "ExcluídoPauta", nullable = false, insertable = true, updatable = true)
    public boolean isExcluídoPauta() {
        return excluídoPauta;
    }

    public void setExcluídoPauta(boolean excluídoPauta) {
        this.excluídoPauta = excluídoPauta;
    }

    private Byte codDisciplinaTipo;

    @Basic
    @javax.persistence.Column(name = "CodDisciplinaTipo", nullable = true, insertable = true, updatable = true)
    public Byte getCodDisciplinaTipo() {
        return codDisciplinaTipo;
    }

    public void setCodDisciplinaTipo(Byte codDisciplinaTipo) {
        this.codDisciplinaTipo = codDisciplinaTipo;
    }

    private BigDecimal notaRecuperação3;

    @Basic
    @javax.persistence.Column(name = "NotaRecuperação3", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getNotaRecuperação3() {
        return notaRecuperação3;
    }

    public void setNotaRecuperação3(BigDecimal notaRecuperação3) {
        this.notaRecuperação3 = notaRecuperação3;
    }

    private String conceito1;

    @Basic
    @javax.persistence.Column(name = "Conceito1", nullable = true, insertable = true, updatable = true)
    public String getConceito1() {
        return conceito1;
    }

    public void setConceito1(String conceito1) {
        this.conceito1 = conceito1;
    }

    private String conceito2;

    @Basic
    @javax.persistence.Column(name = "Conceito2", nullable = true, insertable = true, updatable = true)
    public String getConceito2() {
        return conceito2;
    }

    public void setConceito2(String conceito2) {
        this.conceito2 = conceito2;
    }

    private String conceito3;

    @Basic
    @javax.persistence.Column(name = "Conceito3", nullable = true, insertable = true, updatable = true)
    public String getConceito3() {
        return conceito3;
    }

    public void setConceito3(String conceito3) {
        this.conceito3 = conceito3;
    }

    private String conceito4;

    @Basic
    @javax.persistence.Column(name = "Conceito4", nullable = true, insertable = true, updatable = true)
    public String getConceito4() {
        return conceito4;
    }

    public void setConceito4(String conceito4) {
        this.conceito4 = conceito4;
    }

    private String conceito5;

    @Basic
    @javax.persistence.Column(name = "Conceito5", nullable = true, insertable = true, updatable = true)
    public String getConceito5() {
        return conceito5;
    }

    public void setConceito5(String conceito5) {
        this.conceito5 = conceito5;
    }

    private String conceito6;

    @Basic
    @javax.persistence.Column(name = "Conceito6", nullable = true, insertable = true, updatable = true)
    public String getConceito6() {
        return conceito6;
    }

    public void setConceito6(String conceito6) {
        this.conceito6 = conceito6;
    }

    private String conceito7;

    @Basic
    @javax.persistence.Column(name = "Conceito7", nullable = true, insertable = true, updatable = true)
    public String getConceito7() {
        return conceito7;
    }

    public void setConceito7(String conceito7) {
        this.conceito7 = conceito7;
    }

    private String conceito8;

    @Basic
    @javax.persistence.Column(name = "Conceito8", nullable = true, insertable = true, updatable = true)
    public String getConceito8() {
        return conceito8;
    }

    public void setConceito8(String conceito8) {
        this.conceito8 = conceito8;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdPautaNota that = (AcdPautaNota) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (aprovado != that.aprovado) return false;
        if (codCurso != that.codCurso) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codInativa != that.codInativa) return false;
        if (codPauta != that.codPauta) return false;
        if (codPeríodo != that.codPeríodo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (dependência != that.dependência) return false;
        if (desatualizada != that.desatualizada) return false;
        if (dispensado != that.dispensado) return false;
        if (excluído != that.excluído) return false;
        if (excluídoPauta != that.excluídoPauta) return false;
        if (gradeÚnica != that.gradeÚnica) return false;
        if (pautaNotaId != that.pautaNotaId) return false;
        if (aulas1 != null ? !aulas1.equals(that.aulas1) : that.aulas1 != null) return false;
        if (aulas2 != null ? !aulas2.equals(that.aulas2) : that.aulas2 != null) return false;
        if (aulas3 != null ? !aulas3.equals(that.aulas3) : that.aulas3 != null) return false;
        if (aulas4 != null ? !aulas4.equals(that.aulas4) : that.aulas4 != null) return false;
        if (aulas5 != null ? !aulas5.equals(that.aulas5) : that.aulas5 != null) return false;
        if (aulas6 != null ? !aulas6.equals(that.aulas6) : that.aulas6 != null) return false;
        if (aulas7 != null ? !aulas7.equals(that.aulas7) : that.aulas7 != null) return false;
        if (aulas8 != null ? !aulas8.equals(that.aulas8) : that.aulas8 != null) return false;
        if (codDisciplinaTipo != null ? !codDisciplinaTipo.equals(that.codDisciplinaTipo) : that.codDisciplinaTipo != null)
            return false;
        if (conceito1 != null ? !conceito1.equals(that.conceito1) : that.conceito1 != null) return false;
        if (conceito2 != null ? !conceito2.equals(that.conceito2) : that.conceito2 != null) return false;
        if (conceito3 != null ? !conceito3.equals(that.conceito3) : that.conceito3 != null) return false;
        if (conceito4 != null ? !conceito4.equals(that.conceito4) : that.conceito4 != null) return false;
        if (conceito5 != null ? !conceito5.equals(that.conceito5) : that.conceito5 != null) return false;
        if (conceito6 != null ? !conceito6.equals(that.conceito6) : that.conceito6 != null) return false;
        if (conceito7 != null ? !conceito7.equals(that.conceito7) : that.conceito7 != null) return false;
        if (conceito8 != null ? !conceito8.equals(that.conceito8) : that.conceito8 != null) return false;
        if (faltas1 != null ? !faltas1.equals(that.faltas1) : that.faltas1 != null) return false;
        if (faltas2 != null ? !faltas2.equals(that.faltas2) : that.faltas2 != null) return false;
        if (faltas3 != null ? !faltas3.equals(that.faltas3) : that.faltas3 != null) return false;
        if (faltas4 != null ? !faltas4.equals(that.faltas4) : that.faltas4 != null) return false;
        if (faltas5 != null ? !faltas5.equals(that.faltas5) : that.faltas5 != null) return false;
        if (faltas6 != null ? !faltas6.equals(that.faltas6) : that.faltas6 != null) return false;
        if (faltas7 != null ? !faltas7.equals(that.faltas7) : that.faltas7 != null) return false;
        if (faltas8 != null ? !faltas8.equals(that.faltas8) : that.faltas8 != null) return false;
        if (faltasHoras != null ? !faltasHoras.equals(that.faltasHoras) : that.faltasHoras != null) return false;
        if (faltasTotal != null ? !faltasTotal.equals(that.faltasTotal) : that.faltasTotal != null) return false;
        if (fm01 != null ? !fm01.equals(that.fm01) : that.fm01 != null) return false;
        if (fm02 != null ? !fm02.equals(that.fm02) : that.fm02 != null) return false;
        if (fm03 != null ? !fm03.equals(that.fm03) : that.fm03 != null) return false;
        if (fm04 != null ? !fm04.equals(that.fm04) : that.fm04 != null) return false;
        if (fm05 != null ? !fm05.equals(that.fm05) : that.fm05 != null) return false;
        if (fm06 != null ? !fm06.equals(that.fm06) : that.fm06 != null) return false;
        if (fm07 != null ? !fm07.equals(that.fm07) : that.fm07 != null) return false;
        if (fm08 != null ? !fm08.equals(that.fm08) : that.fm08 != null) return false;
        if (fm09 != null ? !fm09.equals(that.fm09) : that.fm09 != null) return false;
        if (fm10 != null ? !fm10.equals(that.fm10) : that.fm10 != null) return false;
        if (fm11 != null ? !fm11.equals(that.fm11) : that.fm11 != null) return false;
        if (fm12 != null ? !fm12.equals(that.fm12) : that.fm12 != null) return false;
        if (históricoCh != null ? !históricoCh.equals(that.históricoCh) : that.históricoCh != null) return false;
        if (históricoConceito != null ? !históricoConceito.equals(that.históricoConceito) : that.históricoConceito != null)
            return false;
        if (históricoDisciplina != null ? !históricoDisciplina.equals(that.históricoDisciplina) : that.históricoDisciplina != null)
            return false;
        if (históricoFaltas != null ? !históricoFaltas.equals(that.históricoFaltas) : that.históricoFaltas != null)
            return false;
        if (históricoResultado != null ? !históricoResultado.equals(that.históricoResultado) : that.históricoResultado != null)
            return false;
        if (matrícula != null ? !matrícula.equals(that.matrícula) : that.matrícula != null) return false;
        if (médiaAnual != null ? !médiaAnual.equals(that.médiaAnual) : that.médiaAnual != null) return false;
        if (médiaFinal != null ? !médiaFinal.equals(that.médiaFinal) : that.médiaFinal != null) return false;
        if (nota1 != null ? !nota1.equals(that.nota1) : that.nota1 != null) return false;
        if (nota2 != null ? !nota2.equals(that.nota2) : that.nota2 != null) return false;
        if (nota3 != null ? !nota3.equals(that.nota3) : that.nota3 != null) return false;
        if (nota4 != null ? !nota4.equals(that.nota4) : that.nota4 != null) return false;
        if (nota5 != null ? !nota5.equals(that.nota5) : that.nota5 != null) return false;
        if (nota6 != null ? !nota6.equals(that.nota6) : that.nota6 != null) return false;
        if (nota7 != null ? !nota7.equals(that.nota7) : that.nota7 != null) return false;
        if (nota8 != null ? !nota8.equals(that.nota8) : that.nota8 != null) return false;
        if (notaRecuperação != null ? !notaRecuperação.equals(that.notaRecuperação) : that.notaRecuperação != null)
            return false;
        if (notaRecuperação2 != null ? !notaRecuperação2.equals(that.notaRecuperação2) : that.notaRecuperação2 != null)
            return false;
        if (notaRecuperação3 != null ? !notaRecuperação3.equals(that.notaRecuperação3) : that.notaRecuperação3 != null)
            return false;
        if (númeroPauta != null ? !númeroPauta.equals(that.númeroPauta) : that.númeroPauta != null) return false;
        if (processando != null ? !processando.equals(that.processando) : that.processando != null) return false;
        if (recuperação1 != null ? !recuperação1.equals(that.recuperação1) : that.recuperação1 != null) return false;
        if (recuperação2 != null ? !recuperação2.equals(that.recuperação2) : that.recuperação2 != null) return false;
        if (recuperação3 != null ? !recuperação3.equals(that.recuperação3) : that.recuperação3 != null) return false;
        if (recuperação4 != null ? !recuperação4.equals(that.recuperação4) : that.recuperação4 != null) return false;
        if (recuperação5 != null ? !recuperação5.equals(that.recuperação5) : that.recuperação5 != null) return false;
        if (recuperação6 != null ? !recuperação6.equals(that.recuperação6) : that.recuperação6 != null) return false;
        if (recuperação7 != null ? !recuperação7.equals(that.recuperação7) : that.recuperação7 != null) return false;
        if (recuperação8 != null ? !recuperação8.equals(that.recuperação8) : that.recuperação8 != null) return false;
        if (turma != null ? !turma.equals(that.turma) : that.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pautaNotaId ^ (pautaNotaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) (codPauta ^ (codPauta >>> 32));
        result = 31 * result + codDisciplina;
        result = 31 * result + (int) dependência;
        result = 31 * result + (históricoDisciplina != null ? históricoDisciplina.hashCode() : 0);
        result = 31 * result + (históricoCh != null ? históricoCh.hashCode() : 0);
        result = 31 * result + (históricoResultado != null ? históricoResultado.hashCode() : 0);
        result = 31 * result + (históricoConceito != null ? históricoConceito.hashCode() : 0);
        result = 31 * result + (históricoFaltas != null ? históricoFaltas.hashCode() : 0);
        result = 31 * result + (matrícula != null ? matrícula.hashCode() : 0);
        result = 31 * result + gradeÚnica;
        result = 31 * result + anoLetivo;
        result = 31 * result + codCurso;
        result = 31 * result + codPeríodo;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + (númeroPauta != null ? númeroPauta.hashCode() : 0);
        result = 31 * result + (int) (codInativa ^ (codInativa >>> 32));
        result = 31 * result + (nota1 != null ? nota1.hashCode() : 0);
        result = 31 * result + (nota2 != null ? nota2.hashCode() : 0);
        result = 31 * result + (nota3 != null ? nota3.hashCode() : 0);
        result = 31 * result + (nota4 != null ? nota4.hashCode() : 0);
        result = 31 * result + (nota5 != null ? nota5.hashCode() : 0);
        result = 31 * result + (nota6 != null ? nota6.hashCode() : 0);
        result = 31 * result + (nota7 != null ? nota7.hashCode() : 0);
        result = 31 * result + (nota8 != null ? nota8.hashCode() : 0);
        result = 31 * result + (notaRecuperação != null ? notaRecuperação.hashCode() : 0);
        result = 31 * result + (notaRecuperação2 != null ? notaRecuperação2.hashCode() : 0);
        result = 31 * result + (médiaAnual != null ? médiaAnual.hashCode() : 0);
        result = 31 * result + (médiaFinal != null ? médiaFinal.hashCode() : 0);
        result = 31 * result + (faltas1 != null ? faltas1.hashCode() : 0);
        result = 31 * result + (faltas2 != null ? faltas2.hashCode() : 0);
        result = 31 * result + (faltas3 != null ? faltas3.hashCode() : 0);
        result = 31 * result + (faltas4 != null ? faltas4.hashCode() : 0);
        result = 31 * result + (faltas5 != null ? faltas5.hashCode() : 0);
        result = 31 * result + (faltas6 != null ? faltas6.hashCode() : 0);
        result = 31 * result + (faltas7 != null ? faltas7.hashCode() : 0);
        result = 31 * result + (faltas8 != null ? faltas8.hashCode() : 0);
        result = 31 * result + (faltasTotal != null ? faltasTotal.hashCode() : 0);
        result = 31 * result + (aulas1 != null ? aulas1.hashCode() : 0);
        result = 31 * result + (aulas2 != null ? aulas2.hashCode() : 0);
        result = 31 * result + (aulas3 != null ? aulas3.hashCode() : 0);
        result = 31 * result + (aulas4 != null ? aulas4.hashCode() : 0);
        result = 31 * result + (aulas5 != null ? aulas5.hashCode() : 0);
        result = 31 * result + (aulas6 != null ? aulas6.hashCode() : 0);
        result = 31 * result + (aulas7 != null ? aulas7.hashCode() : 0);
        result = 31 * result + (aulas8 != null ? aulas8.hashCode() : 0);
        result = 31 * result + (aprovado ? 1 : 0);
        result = 31 * result + (dispensado ? 1 : 0);
        result = 31 * result + (desatualizada ? 1 : 0);
        result = 31 * result + (fm01 != null ? fm01.hashCode() : 0);
        result = 31 * result + (fm02 != null ? fm02.hashCode() : 0);
        result = 31 * result + (fm03 != null ? fm03.hashCode() : 0);
        result = 31 * result + (fm04 != null ? fm04.hashCode() : 0);
        result = 31 * result + (fm05 != null ? fm05.hashCode() : 0);
        result = 31 * result + (fm06 != null ? fm06.hashCode() : 0);
        result = 31 * result + (fm07 != null ? fm07.hashCode() : 0);
        result = 31 * result + (fm08 != null ? fm08.hashCode() : 0);
        result = 31 * result + (fm09 != null ? fm09.hashCode() : 0);
        result = 31 * result + (fm10 != null ? fm10.hashCode() : 0);
        result = 31 * result + (fm11 != null ? fm11.hashCode() : 0);
        result = 31 * result + (fm12 != null ? fm12.hashCode() : 0);
        result = 31 * result + (recuperação1 != null ? recuperação1.hashCode() : 0);
        result = 31 * result + (recuperação2 != null ? recuperação2.hashCode() : 0);
        result = 31 * result + (recuperação3 != null ? recuperação3.hashCode() : 0);
        result = 31 * result + (recuperação4 != null ? recuperação4.hashCode() : 0);
        result = 31 * result + (recuperação5 != null ? recuperação5.hashCode() : 0);
        result = 31 * result + (recuperação6 != null ? recuperação6.hashCode() : 0);
        result = 31 * result + (recuperação7 != null ? recuperação7.hashCode() : 0);
        result = 31 * result + (recuperação8 != null ? recuperação8.hashCode() : 0);
        result = 31 * result + (processando != null ? processando.hashCode() : 0);
        result = 31 * result + (faltasHoras != null ? faltasHoras.hashCode() : 0);
        result = 31 * result + (excluído ? 1 : 0);
        result = 31 * result + (excluídoPauta ? 1 : 0);
        result = 31 * result + (codDisciplinaTipo != null ? codDisciplinaTipo.hashCode() : 0);
        result = 31 * result + (notaRecuperação3 != null ? notaRecuperação3.hashCode() : 0);
        result = 31 * result + (conceito1 != null ? conceito1.hashCode() : 0);
        result = 31 * result + (conceito2 != null ? conceito2.hashCode() : 0);
        result = 31 * result + (conceito3 != null ? conceito3.hashCode() : 0);
        result = 31 * result + (conceito4 != null ? conceito4.hashCode() : 0);
        result = 31 * result + (conceito5 != null ? conceito5.hashCode() : 0);
        result = 31 * result + (conceito6 != null ? conceito6.hashCode() : 0);
        result = 31 * result + (conceito7 != null ? conceito7.hashCode() : 0);
        result = 31 * result + (conceito8 != null ? conceito8.hashCode() : 0);
        return result;
    }
}
