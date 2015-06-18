package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdAulaPK.class)
public class AcdAula {
    private long aulaId;

    @Basic
    @javax.persistence.Column(name = "Aula_ID", nullable = false, insertable = true, updatable = true)
    public long getAulaId() {
        return aulaId;
    }

    public void setAulaId(long aulaId) {
        this.aulaId = aulaId;
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

    private String turma;

    @Id
    @javax.persistence.Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
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

    private int codCurso;

    @Id
    @javax.persistence.Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
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

    private Short codProfessor;

    @Basic
    @javax.persistence.Column(name = "CodProfessor", nullable = true, insertable = true, updatable = true)
    public Short getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(Short codProfessor) {
        this.codProfessor = codProfessor;
    }

    private Short previstas1;

    @Basic
    @javax.persistence.Column(name = "Previstas1", nullable = true, insertable = true, updatable = true)
    public Short getPrevistas1() {
        return previstas1;
    }

    public void setPrevistas1(Short previstas1) {
        this.previstas1 = previstas1;
    }

    private Short previstas2;

    @Basic
    @javax.persistence.Column(name = "Previstas2", nullable = true, insertable = true, updatable = true)
    public Short getPrevistas2() {
        return previstas2;
    }

    public void setPrevistas2(Short previstas2) {
        this.previstas2 = previstas2;
    }

    private Short previstas3;

    @Basic
    @javax.persistence.Column(name = "Previstas3", nullable = true, insertable = true, updatable = true)
    public Short getPrevistas3() {
        return previstas3;
    }

    public void setPrevistas3(Short previstas3) {
        this.previstas3 = previstas3;
    }

    private Short previstas4;

    @Basic
    @javax.persistence.Column(name = "Previstas4", nullable = true, insertable = true, updatable = true)
    public Short getPrevistas4() {
        return previstas4;
    }

    public void setPrevistas4(Short previstas4) {
        this.previstas4 = previstas4;
    }

    private Short previstas5;

    @Basic
    @javax.persistence.Column(name = "Previstas5", nullable = true, insertable = true, updatable = true)
    public Short getPrevistas5() {
        return previstas5;
    }

    public void setPrevistas5(Short previstas5) {
        this.previstas5 = previstas5;
    }

    private Short previstas6;

    @Basic
    @javax.persistence.Column(name = "Previstas6", nullable = true, insertable = true, updatable = true)
    public Short getPrevistas6() {
        return previstas6;
    }

    public void setPrevistas6(Short previstas6) {
        this.previstas6 = previstas6;
    }

    private Short previstas7;

    @Basic
    @javax.persistence.Column(name = "Previstas7", nullable = true, insertable = true, updatable = true)
    public Short getPrevistas7() {
        return previstas7;
    }

    public void setPrevistas7(Short previstas7) {
        this.previstas7 = previstas7;
    }

    private Short previstas8;

    @Basic
    @javax.persistence.Column(name = "Previstas8", nullable = true, insertable = true, updatable = true)
    public Short getPrevistas8() {
        return previstas8;
    }

    public void setPrevistas8(Short previstas8) {
        this.previstas8 = previstas8;
    }

    private Short previstasRecuperação;

    @Basic
    @javax.persistence.Column(name = "PrevistasRecuperação", nullable = true, insertable = true, updatable = true)
    public Short getPrevistasRecuperação() {
        return previstasRecuperação;
    }

    public void setPrevistasRecuperação(Short previstasRecuperação) {
        this.previstasRecuperação = previstasRecuperação;
    }

    private Short dadas1;

    @Basic
    @javax.persistence.Column(name = "Dadas1", nullable = true, insertable = true, updatable = true)
    public Short getDadas1() {
        return dadas1;
    }

    public void setDadas1(Short dadas1) {
        this.dadas1 = dadas1;
    }

    private Short dadas2;

    @Basic
    @javax.persistence.Column(name = "Dadas2", nullable = true, insertable = true, updatable = true)
    public Short getDadas2() {
        return dadas2;
    }

    public void setDadas2(Short dadas2) {
        this.dadas2 = dadas2;
    }

    private Short dadas3;

    @Basic
    @javax.persistence.Column(name = "Dadas3", nullable = true, insertable = true, updatable = true)
    public Short getDadas3() {
        return dadas3;
    }

    public void setDadas3(Short dadas3) {
        this.dadas3 = dadas3;
    }

    private Short dadas4;

    @Basic
    @javax.persistence.Column(name = "Dadas4", nullable = true, insertable = true, updatable = true)
    public Short getDadas4() {
        return dadas4;
    }

    public void setDadas4(Short dadas4) {
        this.dadas4 = dadas4;
    }

    private Short dadas5;

    @Basic
    @javax.persistence.Column(name = "Dadas5", nullable = true, insertable = true, updatable = true)
    public Short getDadas5() {
        return dadas5;
    }

    public void setDadas5(Short dadas5) {
        this.dadas5 = dadas5;
    }

    private Short dadas6;

    @Basic
    @javax.persistence.Column(name = "Dadas6", nullable = true, insertable = true, updatable = true)
    public Short getDadas6() {
        return dadas6;
    }

    public void setDadas6(Short dadas6) {
        this.dadas6 = dadas6;
    }

    private Short dadas7;

    @Basic
    @javax.persistence.Column(name = "Dadas7", nullable = true, insertable = true, updatable = true)
    public Short getDadas7() {
        return dadas7;
    }

    public void setDadas7(Short dadas7) {
        this.dadas7 = dadas7;
    }

    private Short dadas8;

    @Basic
    @javax.persistence.Column(name = "Dadas8", nullable = true, insertable = true, updatable = true)
    public Short getDadas8() {
        return dadas8;
    }

    public void setDadas8(Short dadas8) {
        this.dadas8 = dadas8;
    }

    private Short dadasRecuperação;

    @Basic
    @javax.persistence.Column(name = "DadasRecuperação", nullable = true, insertable = true, updatable = true)
    public Short getDadasRecuperação() {
        return dadasRecuperação;
    }

    public void setDadasRecuperação(Short dadasRecuperação) {
        this.dadasRecuperação = dadasRecuperação;
    }

    private String conteúdo1;

    @Basic
    @javax.persistence.Column(name = "Conteúdo1", nullable = true, insertable = true, updatable = true)
    public String getConteúdo1() {
        return conteúdo1;
    }

    public void setConteúdo1(String conteúdo1) {
        this.conteúdo1 = conteúdo1;
    }

    private String conteúdo2;

    @Basic
    @javax.persistence.Column(name = "Conteúdo2", nullable = true, insertable = true, updatable = true)
    public String getConteúdo2() {
        return conteúdo2;
    }

    public void setConteúdo2(String conteúdo2) {
        this.conteúdo2 = conteúdo2;
    }

    private String conteúdo3;

    @Basic
    @javax.persistence.Column(name = "Conteúdo3", nullable = true, insertable = true, updatable = true)
    public String getConteúdo3() {
        return conteúdo3;
    }

    public void setConteúdo3(String conteúdo3) {
        this.conteúdo3 = conteúdo3;
    }

    private String conteúdo4;

    @Basic
    @javax.persistence.Column(name = "Conteúdo4", nullable = true, insertable = true, updatable = true)
    public String getConteúdo4() {
        return conteúdo4;
    }

    public void setConteúdo4(String conteúdo4) {
        this.conteúdo4 = conteúdo4;
    }

    private String conteúdo5;

    @Basic
    @javax.persistence.Column(name = "Conteúdo5", nullable = true, insertable = true, updatable = true)
    public String getConteúdo5() {
        return conteúdo5;
    }

    public void setConteúdo5(String conteúdo5) {
        this.conteúdo5 = conteúdo5;
    }

    private String conteúdo6;

    @Basic
    @javax.persistence.Column(name = "Conteúdo6", nullable = true, insertable = true, updatable = true)
    public String getConteúdo6() {
        return conteúdo6;
    }

    public void setConteúdo6(String conteúdo6) {
        this.conteúdo6 = conteúdo6;
    }

    private String conteúdo7;

    @Basic
    @javax.persistence.Column(name = "Conteúdo7", nullable = true, insertable = true, updatable = true)
    public String getConteúdo7() {
        return conteúdo7;
    }

    public void setConteúdo7(String conteúdo7) {
        this.conteúdo7 = conteúdo7;
    }

    private String conteúdo8;

    @Basic
    @javax.persistence.Column(name = "Conteúdo8", nullable = true, insertable = true, updatable = true)
    public String getConteúdo8() {
        return conteúdo8;
    }

    public void setConteúdo8(String conteúdo8) {
        this.conteúdo8 = conteúdo8;
    }

    private Byte númeroPautaUtilizado;

    @Basic
    @javax.persistence.Column(name = "NúmeroPautaUtilizado", nullable = true, insertable = true, updatable = true)
    public Byte getNúmeroPautaUtilizado() {
        return númeroPautaUtilizado;
    }

    public void setNúmeroPautaUtilizado(Byte númeroPautaUtilizado) {
        this.númeroPautaUtilizado = númeroPautaUtilizado;
    }

    private BigDecimal médiaMédiaAnual;

    @Basic
    @javax.persistence.Column(name = "MédiaMédiaAnual", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédiaMédiaAnual() {
        return médiaMédiaAnual;
    }

    public void setMédiaMédiaAnual(BigDecimal médiaMédiaAnual) {
        this.médiaMédiaAnual = médiaMédiaAnual;
    }

    private BigDecimal máxima11;

    @Basic
    @javax.persistence.Column(name = "Máxima11", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima11() {
        return máxima11;
    }

    public void setMáxima11(BigDecimal máxima11) {
        this.máxima11 = máxima11;
    }

    private BigDecimal máxima12;

    @Basic
    @javax.persistence.Column(name = "Máxima12", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima12() {
        return máxima12;
    }

    public void setMáxima12(BigDecimal máxima12) {
        this.máxima12 = máxima12;
    }

    private BigDecimal máxima13;

    @Basic
    @javax.persistence.Column(name = "Máxima13", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima13() {
        return máxima13;
    }

    public void setMáxima13(BigDecimal máxima13) {
        this.máxima13 = máxima13;
    }

    private BigDecimal máxima14;

    @Basic
    @javax.persistence.Column(name = "Máxima14", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima14() {
        return máxima14;
    }

    public void setMáxima14(BigDecimal máxima14) {
        this.máxima14 = máxima14;
    }

    private BigDecimal máxima15;

    @Basic
    @javax.persistence.Column(name = "Máxima15", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima15() {
        return máxima15;
    }

    public void setMáxima15(BigDecimal máxima15) {
        this.máxima15 = máxima15;
    }

    private BigDecimal máxima1Total;

    @Basic
    @javax.persistence.Column(name = "Máxima1Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima1Total() {
        return máxima1Total;
    }

    public void setMáxima1Total(BigDecimal máxima1Total) {
        this.máxima1Total = máxima1Total;
    }

    private BigDecimal máxima21;

    @Basic
    @javax.persistence.Column(name = "Máxima21", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima21() {
        return máxima21;
    }

    public void setMáxima21(BigDecimal máxima21) {
        this.máxima21 = máxima21;
    }

    private BigDecimal máxima22;

    @Basic
    @javax.persistence.Column(name = "Máxima22", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima22() {
        return máxima22;
    }

    public void setMáxima22(BigDecimal máxima22) {
        this.máxima22 = máxima22;
    }

    private BigDecimal máxima23;

    @Basic
    @javax.persistence.Column(name = "Máxima23", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima23() {
        return máxima23;
    }

    public void setMáxima23(BigDecimal máxima23) {
        this.máxima23 = máxima23;
    }

    private BigDecimal máxima24;

    @Basic
    @javax.persistence.Column(name = "Máxima24", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima24() {
        return máxima24;
    }

    public void setMáxima24(BigDecimal máxima24) {
        this.máxima24 = máxima24;
    }

    private BigDecimal máxima25;

    @Basic
    @javax.persistence.Column(name = "Máxima25", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima25() {
        return máxima25;
    }

    public void setMáxima25(BigDecimal máxima25) {
        this.máxima25 = máxima25;
    }

    private BigDecimal máxima2Total;

    @Basic
    @javax.persistence.Column(name = "Máxima2Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima2Total() {
        return máxima2Total;
    }

    public void setMáxima2Total(BigDecimal máxima2Total) {
        this.máxima2Total = máxima2Total;
    }

    private BigDecimal máxima31;

    @Basic
    @javax.persistence.Column(name = "Máxima31", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima31() {
        return máxima31;
    }

    public void setMáxima31(BigDecimal máxima31) {
        this.máxima31 = máxima31;
    }

    private BigDecimal máxima32;

    @Basic
    @javax.persistence.Column(name = "Máxima32", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima32() {
        return máxima32;
    }

    public void setMáxima32(BigDecimal máxima32) {
        this.máxima32 = máxima32;
    }

    private BigDecimal máxima33;

    @Basic
    @javax.persistence.Column(name = "Máxima33", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima33() {
        return máxima33;
    }

    public void setMáxima33(BigDecimal máxima33) {
        this.máxima33 = máxima33;
    }

    private BigDecimal máxima34;

    @Basic
    @javax.persistence.Column(name = "Máxima34", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima34() {
        return máxima34;
    }

    public void setMáxima34(BigDecimal máxima34) {
        this.máxima34 = máxima34;
    }

    private BigDecimal máxima35;

    @Basic
    @javax.persistence.Column(name = "Máxima35", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima35() {
        return máxima35;
    }

    public void setMáxima35(BigDecimal máxima35) {
        this.máxima35 = máxima35;
    }

    private BigDecimal máxima3Total;

    @Basic
    @javax.persistence.Column(name = "Máxima3Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima3Total() {
        return máxima3Total;
    }

    public void setMáxima3Total(BigDecimal máxima3Total) {
        this.máxima3Total = máxima3Total;
    }

    private BigDecimal máxima41;

    @Basic
    @javax.persistence.Column(name = "Máxima41", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima41() {
        return máxima41;
    }

    public void setMáxima41(BigDecimal máxima41) {
        this.máxima41 = máxima41;
    }

    private BigDecimal máxima42;

    @Basic
    @javax.persistence.Column(name = "Máxima42", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima42() {
        return máxima42;
    }

    public void setMáxima42(BigDecimal máxima42) {
        this.máxima42 = máxima42;
    }

    private BigDecimal máxima43;

    @Basic
    @javax.persistence.Column(name = "Máxima43", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima43() {
        return máxima43;
    }

    public void setMáxima43(BigDecimal máxima43) {
        this.máxima43 = máxima43;
    }

    private BigDecimal máxima44;

    @Basic
    @javax.persistence.Column(name = "Máxima44", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima44() {
        return máxima44;
    }

    public void setMáxima44(BigDecimal máxima44) {
        this.máxima44 = máxima44;
    }

    private BigDecimal máxima45;

    @Basic
    @javax.persistence.Column(name = "Máxima45", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima45() {
        return máxima45;
    }

    public void setMáxima45(BigDecimal máxima45) {
        this.máxima45 = máxima45;
    }

    private BigDecimal máxima4Total;

    @Basic
    @javax.persistence.Column(name = "Máxima4Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima4Total() {
        return máxima4Total;
    }

    public void setMáxima4Total(BigDecimal máxima4Total) {
        this.máxima4Total = máxima4Total;
    }

    private BigDecimal máxima51;

    @Basic
    @javax.persistence.Column(name = "Máxima51", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima51() {
        return máxima51;
    }

    public void setMáxima51(BigDecimal máxima51) {
        this.máxima51 = máxima51;
    }

    private BigDecimal máxima52;

    @Basic
    @javax.persistence.Column(name = "Máxima52", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima52() {
        return máxima52;
    }

    public void setMáxima52(BigDecimal máxima52) {
        this.máxima52 = máxima52;
    }

    private BigDecimal máxima53;

    @Basic
    @javax.persistence.Column(name = "Máxima53", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima53() {
        return máxima53;
    }

    public void setMáxima53(BigDecimal máxima53) {
        this.máxima53 = máxima53;
    }

    private BigDecimal máxima54;

    @Basic
    @javax.persistence.Column(name = "Máxima54", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima54() {
        return máxima54;
    }

    public void setMáxima54(BigDecimal máxima54) {
        this.máxima54 = máxima54;
    }

    private BigDecimal máxima55;

    @Basic
    @javax.persistence.Column(name = "Máxima55", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima55() {
        return máxima55;
    }

    public void setMáxima55(BigDecimal máxima55) {
        this.máxima55 = máxima55;
    }

    private BigDecimal máxima5Total;

    @Basic
    @javax.persistence.Column(name = "Máxima5Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima5Total() {
        return máxima5Total;
    }

    public void setMáxima5Total(BigDecimal máxima5Total) {
        this.máxima5Total = máxima5Total;
    }

    private BigDecimal máxima61;

    @Basic
    @javax.persistence.Column(name = "Máxima61", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima61() {
        return máxima61;
    }

    public void setMáxima61(BigDecimal máxima61) {
        this.máxima61 = máxima61;
    }

    private BigDecimal máxima62;

    @Basic
    @javax.persistence.Column(name = "Máxima62", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima62() {
        return máxima62;
    }

    public void setMáxima62(BigDecimal máxima62) {
        this.máxima62 = máxima62;
    }

    private BigDecimal máxima63;

    @Basic
    @javax.persistence.Column(name = "Máxima63", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima63() {
        return máxima63;
    }

    public void setMáxima63(BigDecimal máxima63) {
        this.máxima63 = máxima63;
    }

    private BigDecimal máxima64;

    @Basic
    @javax.persistence.Column(name = "Máxima64", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima64() {
        return máxima64;
    }

    public void setMáxima64(BigDecimal máxima64) {
        this.máxima64 = máxima64;
    }

    private BigDecimal máxima65;

    @Basic
    @javax.persistence.Column(name = "Máxima65", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima65() {
        return máxima65;
    }

    public void setMáxima65(BigDecimal máxima65) {
        this.máxima65 = máxima65;
    }

    private BigDecimal máxima6Total;

    @Basic
    @javax.persistence.Column(name = "Máxima6Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima6Total() {
        return máxima6Total;
    }

    public void setMáxima6Total(BigDecimal máxima6Total) {
        this.máxima6Total = máxima6Total;
    }

    private BigDecimal máxima71;

    @Basic
    @javax.persistence.Column(name = "Máxima71", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima71() {
        return máxima71;
    }

    public void setMáxima71(BigDecimal máxima71) {
        this.máxima71 = máxima71;
    }

    private BigDecimal máxima72;

    @Basic
    @javax.persistence.Column(name = "Máxima72", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima72() {
        return máxima72;
    }

    public void setMáxima72(BigDecimal máxima72) {
        this.máxima72 = máxima72;
    }

    private BigDecimal máxima73;

    @Basic
    @javax.persistence.Column(name = "Máxima73", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima73() {
        return máxima73;
    }

    public void setMáxima73(BigDecimal máxima73) {
        this.máxima73 = máxima73;
    }

    private BigDecimal máxima74;

    @Basic
    @javax.persistence.Column(name = "Máxima74", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima74() {
        return máxima74;
    }

    public void setMáxima74(BigDecimal máxima74) {
        this.máxima74 = máxima74;
    }

    private BigDecimal máxima75;

    @Basic
    @javax.persistence.Column(name = "Máxima75", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima75() {
        return máxima75;
    }

    public void setMáxima75(BigDecimal máxima75) {
        this.máxima75 = máxima75;
    }

    private BigDecimal máxima7Total;

    @Basic
    @javax.persistence.Column(name = "Máxima7Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima7Total() {
        return máxima7Total;
    }

    public void setMáxima7Total(BigDecimal máxima7Total) {
        this.máxima7Total = máxima7Total;
    }

    private BigDecimal máxima81;

    @Basic
    @javax.persistence.Column(name = "Máxima81", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima81() {
        return máxima81;
    }

    public void setMáxima81(BigDecimal máxima81) {
        this.máxima81 = máxima81;
    }

    private BigDecimal máxima82;

    @Basic
    @javax.persistence.Column(name = "Máxima82", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima82() {
        return máxima82;
    }

    public void setMáxima82(BigDecimal máxima82) {
        this.máxima82 = máxima82;
    }

    private BigDecimal máxima83;

    @Basic
    @javax.persistence.Column(name = "Máxima83", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima83() {
        return máxima83;
    }

    public void setMáxima83(BigDecimal máxima83) {
        this.máxima83 = máxima83;
    }

    private BigDecimal máxima84;

    @Basic
    @javax.persistence.Column(name = "Máxima84", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima84() {
        return máxima84;
    }

    public void setMáxima84(BigDecimal máxima84) {
        this.máxima84 = máxima84;
    }

    private BigDecimal máxima85;

    @Basic
    @javax.persistence.Column(name = "Máxima85", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima85() {
        return máxima85;
    }

    public void setMáxima85(BigDecimal máxima85) {
        this.máxima85 = máxima85;
    }

    private BigDecimal máxima8Total;

    @Basic
    @javax.persistence.Column(name = "Máxima8Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima8Total() {
        return máxima8Total;
    }

    public void setMáxima8Total(BigDecimal máxima8Total) {
        this.máxima8Total = máxima8Total;
    }

    private BigDecimal média11;

    @Basic
    @javax.persistence.Column(name = "Média11", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia11() {
        return média11;
    }

    public void setMédia11(BigDecimal média11) {
        this.média11 = média11;
    }

    private BigDecimal média12;

    @Basic
    @javax.persistence.Column(name = "Média12", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia12() {
        return média12;
    }

    public void setMédia12(BigDecimal média12) {
        this.média12 = média12;
    }

    private BigDecimal média13;

    @Basic
    @javax.persistence.Column(name = "Média13", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia13() {
        return média13;
    }

    public void setMédia13(BigDecimal média13) {
        this.média13 = média13;
    }

    private BigDecimal média14;

    @Basic
    @javax.persistence.Column(name = "Média14", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia14() {
        return média14;
    }

    public void setMédia14(BigDecimal média14) {
        this.média14 = média14;
    }

    private BigDecimal média15;

    @Basic
    @javax.persistence.Column(name = "Média15", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia15() {
        return média15;
    }

    public void setMédia15(BigDecimal média15) {
        this.média15 = média15;
    }

    private BigDecimal média1Total;

    @Basic
    @javax.persistence.Column(name = "Média1Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia1Total() {
        return média1Total;
    }

    public void setMédia1Total(BigDecimal média1Total) {
        this.média1Total = média1Total;
    }

    private BigDecimal média21;

    @Basic
    @javax.persistence.Column(name = "Média21", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia21() {
        return média21;
    }

    public void setMédia21(BigDecimal média21) {
        this.média21 = média21;
    }

    private BigDecimal média22;

    @Basic
    @javax.persistence.Column(name = "Média22", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia22() {
        return média22;
    }

    public void setMédia22(BigDecimal média22) {
        this.média22 = média22;
    }

    private BigDecimal média23;

    @Basic
    @javax.persistence.Column(name = "Média23", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia23() {
        return média23;
    }

    public void setMédia23(BigDecimal média23) {
        this.média23 = média23;
    }

    private BigDecimal média24;

    @Basic
    @javax.persistence.Column(name = "Média24", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia24() {
        return média24;
    }

    public void setMédia24(BigDecimal média24) {
        this.média24 = média24;
    }

    private BigDecimal média25;

    @Basic
    @javax.persistence.Column(name = "Média25", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia25() {
        return média25;
    }

    public void setMédia25(BigDecimal média25) {
        this.média25 = média25;
    }

    private BigDecimal média2Total;

    @Basic
    @javax.persistence.Column(name = "Média2Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia2Total() {
        return média2Total;
    }

    public void setMédia2Total(BigDecimal média2Total) {
        this.média2Total = média2Total;
    }

    private BigDecimal média31;

    @Basic
    @javax.persistence.Column(name = "Média31", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia31() {
        return média31;
    }

    public void setMédia31(BigDecimal média31) {
        this.média31 = média31;
    }

    private BigDecimal média32;

    @Basic
    @javax.persistence.Column(name = "Média32", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia32() {
        return média32;
    }

    public void setMédia32(BigDecimal média32) {
        this.média32 = média32;
    }

    private BigDecimal média33;

    @Basic
    @javax.persistence.Column(name = "Média33", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia33() {
        return média33;
    }

    public void setMédia33(BigDecimal média33) {
        this.média33 = média33;
    }

    private BigDecimal média34;

    @Basic
    @javax.persistence.Column(name = "Média34", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia34() {
        return média34;
    }

    public void setMédia34(BigDecimal média34) {
        this.média34 = média34;
    }

    private BigDecimal média35;

    @Basic
    @javax.persistence.Column(name = "Média35", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia35() {
        return média35;
    }

    public void setMédia35(BigDecimal média35) {
        this.média35 = média35;
    }

    private BigDecimal média3Total;

    @Basic
    @javax.persistence.Column(name = "Média3Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia3Total() {
        return média3Total;
    }

    public void setMédia3Total(BigDecimal média3Total) {
        this.média3Total = média3Total;
    }

    private BigDecimal média41;

    @Basic
    @javax.persistence.Column(name = "Média41", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia41() {
        return média41;
    }

    public void setMédia41(BigDecimal média41) {
        this.média41 = média41;
    }

    private BigDecimal média42;

    @Basic
    @javax.persistence.Column(name = "Média42", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia42() {
        return média42;
    }

    public void setMédia42(BigDecimal média42) {
        this.média42 = média42;
    }

    private BigDecimal média43;

    @Basic
    @javax.persistence.Column(name = "Média43", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia43() {
        return média43;
    }

    public void setMédia43(BigDecimal média43) {
        this.média43 = média43;
    }

    private BigDecimal média44;

    @Basic
    @javax.persistence.Column(name = "Média44", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia44() {
        return média44;
    }

    public void setMédia44(BigDecimal média44) {
        this.média44 = média44;
    }

    private BigDecimal média45;

    @Basic
    @javax.persistence.Column(name = "Média45", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia45() {
        return média45;
    }

    public void setMédia45(BigDecimal média45) {
        this.média45 = média45;
    }

    private BigDecimal média4Total;

    @Basic
    @javax.persistence.Column(name = "Média4Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia4Total() {
        return média4Total;
    }

    public void setMédia4Total(BigDecimal média4Total) {
        this.média4Total = média4Total;
    }

    private BigDecimal média51;

    @Basic
    @javax.persistence.Column(name = "Média51", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia51() {
        return média51;
    }

    public void setMédia51(BigDecimal média51) {
        this.média51 = média51;
    }

    private BigDecimal média52;

    @Basic
    @javax.persistence.Column(name = "Média52", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia52() {
        return média52;
    }

    public void setMédia52(BigDecimal média52) {
        this.média52 = média52;
    }

    private BigDecimal média53;

    @Basic
    @javax.persistence.Column(name = "Média53", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia53() {
        return média53;
    }

    public void setMédia53(BigDecimal média53) {
        this.média53 = média53;
    }

    private BigDecimal média54;

    @Basic
    @javax.persistence.Column(name = "Média54", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia54() {
        return média54;
    }

    public void setMédia54(BigDecimal média54) {
        this.média54 = média54;
    }

    private BigDecimal média55;

    @Basic
    @javax.persistence.Column(name = "Média55", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia55() {
        return média55;
    }

    public void setMédia55(BigDecimal média55) {
        this.média55 = média55;
    }

    private BigDecimal média5Total;

    @Basic
    @javax.persistence.Column(name = "Média5Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia5Total() {
        return média5Total;
    }

    public void setMédia5Total(BigDecimal média5Total) {
        this.média5Total = média5Total;
    }

    private BigDecimal média61;

    @Basic
    @javax.persistence.Column(name = "Média61", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia61() {
        return média61;
    }

    public void setMédia61(BigDecimal média61) {
        this.média61 = média61;
    }

    private BigDecimal média62;

    @Basic
    @javax.persistence.Column(name = "Média62", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia62() {
        return média62;
    }

    public void setMédia62(BigDecimal média62) {
        this.média62 = média62;
    }

    private BigDecimal média63;

    @Basic
    @javax.persistence.Column(name = "Média63", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia63() {
        return média63;
    }

    public void setMédia63(BigDecimal média63) {
        this.média63 = média63;
    }

    private BigDecimal média64;

    @Basic
    @javax.persistence.Column(name = "Média64", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia64() {
        return média64;
    }

    public void setMédia64(BigDecimal média64) {
        this.média64 = média64;
    }

    private BigDecimal média65;

    @Basic
    @javax.persistence.Column(name = "Média65", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia65() {
        return média65;
    }

    public void setMédia65(BigDecimal média65) {
        this.média65 = média65;
    }

    private BigDecimal média6Total;

    @Basic
    @javax.persistence.Column(name = "Média6Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia6Total() {
        return média6Total;
    }

    public void setMédia6Total(BigDecimal média6Total) {
        this.média6Total = média6Total;
    }

    private BigDecimal média71;

    @Basic
    @javax.persistence.Column(name = "Média71", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia71() {
        return média71;
    }

    public void setMédia71(BigDecimal média71) {
        this.média71 = média71;
    }

    private BigDecimal média72;

    @Basic
    @javax.persistence.Column(name = "Média72", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia72() {
        return média72;
    }

    public void setMédia72(BigDecimal média72) {
        this.média72 = média72;
    }

    private BigDecimal média73;

    @Basic
    @javax.persistence.Column(name = "Média73", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia73() {
        return média73;
    }

    public void setMédia73(BigDecimal média73) {
        this.média73 = média73;
    }

    private BigDecimal média74;

    @Basic
    @javax.persistence.Column(name = "Média74", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia74() {
        return média74;
    }

    public void setMédia74(BigDecimal média74) {
        this.média74 = média74;
    }

    private BigDecimal média75;

    @Basic
    @javax.persistence.Column(name = "Média75", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia75() {
        return média75;
    }

    public void setMédia75(BigDecimal média75) {
        this.média75 = média75;
    }

    private BigDecimal média7Total;

    @Basic
    @javax.persistence.Column(name = "Média7Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia7Total() {
        return média7Total;
    }

    public void setMédia7Total(BigDecimal média7Total) {
        this.média7Total = média7Total;
    }

    private BigDecimal média81;

    @Basic
    @javax.persistence.Column(name = "Média81", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia81() {
        return média81;
    }

    public void setMédia81(BigDecimal média81) {
        this.média81 = média81;
    }

    private BigDecimal média82;

    @Basic
    @javax.persistence.Column(name = "Média82", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia82() {
        return média82;
    }

    public void setMédia82(BigDecimal média82) {
        this.média82 = média82;
    }

    private BigDecimal média83;

    @Basic
    @javax.persistence.Column(name = "Média83", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia83() {
        return média83;
    }

    public void setMédia83(BigDecimal média83) {
        this.média83 = média83;
    }

    private BigDecimal média84;

    @Basic
    @javax.persistence.Column(name = "Média84", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia84() {
        return média84;
    }

    public void setMédia84(BigDecimal média84) {
        this.média84 = média84;
    }

    private BigDecimal média85;

    @Basic
    @javax.persistence.Column(name = "Média85", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia85() {
        return média85;
    }

    public void setMédia85(BigDecimal média85) {
        this.média85 = média85;
    }

    private BigDecimal média8Total;

    @Basic
    @javax.persistence.Column(name = "Média8Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia8Total() {
        return média8Total;
    }

    public void setMédia8Total(BigDecimal média8Total) {
        this.média8Total = média8Total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAula acdAula = (AcdAula) o;

        if (anoLetivo != acdAula.anoLetivo) return false;
        if (aulaId != acdAula.aulaId) return false;
        if (codCurso != acdAula.codCurso) return false;
        if (codDisciplina != acdAula.codDisciplina) return false;
        if (codUnidade != acdAula.codUnidade) return false;
        if (codProfessor != null ? !codProfessor.equals(acdAula.codProfessor) : acdAula.codProfessor != null)
            return false;
        if (conteúdo1 != null ? !conteúdo1.equals(acdAula.conteúdo1) : acdAula.conteúdo1 != null) return false;
        if (conteúdo2 != null ? !conteúdo2.equals(acdAula.conteúdo2) : acdAula.conteúdo2 != null) return false;
        if (conteúdo3 != null ? !conteúdo3.equals(acdAula.conteúdo3) : acdAula.conteúdo3 != null) return false;
        if (conteúdo4 != null ? !conteúdo4.equals(acdAula.conteúdo4) : acdAula.conteúdo4 != null) return false;
        if (conteúdo5 != null ? !conteúdo5.equals(acdAula.conteúdo5) : acdAula.conteúdo5 != null) return false;
        if (conteúdo6 != null ? !conteúdo6.equals(acdAula.conteúdo6) : acdAula.conteúdo6 != null) return false;
        if (conteúdo7 != null ? !conteúdo7.equals(acdAula.conteúdo7) : acdAula.conteúdo7 != null) return false;
        if (conteúdo8 != null ? !conteúdo8.equals(acdAula.conteúdo8) : acdAula.conteúdo8 != null) return false;
        if (dadas1 != null ? !dadas1.equals(acdAula.dadas1) : acdAula.dadas1 != null) return false;
        if (dadas2 != null ? !dadas2.equals(acdAula.dadas2) : acdAula.dadas2 != null) return false;
        if (dadas3 != null ? !dadas3.equals(acdAula.dadas3) : acdAula.dadas3 != null) return false;
        if (dadas4 != null ? !dadas4.equals(acdAula.dadas4) : acdAula.dadas4 != null) return false;
        if (dadas5 != null ? !dadas5.equals(acdAula.dadas5) : acdAula.dadas5 != null) return false;
        if (dadas6 != null ? !dadas6.equals(acdAula.dadas6) : acdAula.dadas6 != null) return false;
        if (dadas7 != null ? !dadas7.equals(acdAula.dadas7) : acdAula.dadas7 != null) return false;
        if (dadas8 != null ? !dadas8.equals(acdAula.dadas8) : acdAula.dadas8 != null) return false;
        if (dadasRecuperação != null ? !dadasRecuperação.equals(acdAula.dadasRecuperação) : acdAula.dadasRecuperação != null)
            return false;
        if (máxima11 != null ? !máxima11.equals(acdAula.máxima11) : acdAula.máxima11 != null) return false;
        if (máxima12 != null ? !máxima12.equals(acdAula.máxima12) : acdAula.máxima12 != null) return false;
        if (máxima13 != null ? !máxima13.equals(acdAula.máxima13) : acdAula.máxima13 != null) return false;
        if (máxima14 != null ? !máxima14.equals(acdAula.máxima14) : acdAula.máxima14 != null) return false;
        if (máxima15 != null ? !máxima15.equals(acdAula.máxima15) : acdAula.máxima15 != null) return false;
        if (máxima1Total != null ? !máxima1Total.equals(acdAula.máxima1Total) : acdAula.máxima1Total != null)
            return false;
        if (máxima21 != null ? !máxima21.equals(acdAula.máxima21) : acdAula.máxima21 != null) return false;
        if (máxima22 != null ? !máxima22.equals(acdAula.máxima22) : acdAula.máxima22 != null) return false;
        if (máxima23 != null ? !máxima23.equals(acdAula.máxima23) : acdAula.máxima23 != null) return false;
        if (máxima24 != null ? !máxima24.equals(acdAula.máxima24) : acdAula.máxima24 != null) return false;
        if (máxima25 != null ? !máxima25.equals(acdAula.máxima25) : acdAula.máxima25 != null) return false;
        if (máxima2Total != null ? !máxima2Total.equals(acdAula.máxima2Total) : acdAula.máxima2Total != null)
            return false;
        if (máxima31 != null ? !máxima31.equals(acdAula.máxima31) : acdAula.máxima31 != null) return false;
        if (máxima32 != null ? !máxima32.equals(acdAula.máxima32) : acdAula.máxima32 != null) return false;
        if (máxima33 != null ? !máxima33.equals(acdAula.máxima33) : acdAula.máxima33 != null) return false;
        if (máxima34 != null ? !máxima34.equals(acdAula.máxima34) : acdAula.máxima34 != null) return false;
        if (máxima35 != null ? !máxima35.equals(acdAula.máxima35) : acdAula.máxima35 != null) return false;
        if (máxima3Total != null ? !máxima3Total.equals(acdAula.máxima3Total) : acdAula.máxima3Total != null)
            return false;
        if (máxima41 != null ? !máxima41.equals(acdAula.máxima41) : acdAula.máxima41 != null) return false;
        if (máxima42 != null ? !máxima42.equals(acdAula.máxima42) : acdAula.máxima42 != null) return false;
        if (máxima43 != null ? !máxima43.equals(acdAula.máxima43) : acdAula.máxima43 != null) return false;
        if (máxima44 != null ? !máxima44.equals(acdAula.máxima44) : acdAula.máxima44 != null) return false;
        if (máxima45 != null ? !máxima45.equals(acdAula.máxima45) : acdAula.máxima45 != null) return false;
        if (máxima4Total != null ? !máxima4Total.equals(acdAula.máxima4Total) : acdAula.máxima4Total != null)
            return false;
        if (máxima51 != null ? !máxima51.equals(acdAula.máxima51) : acdAula.máxima51 != null) return false;
        if (máxima52 != null ? !máxima52.equals(acdAula.máxima52) : acdAula.máxima52 != null) return false;
        if (máxima53 != null ? !máxima53.equals(acdAula.máxima53) : acdAula.máxima53 != null) return false;
        if (máxima54 != null ? !máxima54.equals(acdAula.máxima54) : acdAula.máxima54 != null) return false;
        if (máxima55 != null ? !máxima55.equals(acdAula.máxima55) : acdAula.máxima55 != null) return false;
        if (máxima5Total != null ? !máxima5Total.equals(acdAula.máxima5Total) : acdAula.máxima5Total != null)
            return false;
        if (máxima61 != null ? !máxima61.equals(acdAula.máxima61) : acdAula.máxima61 != null) return false;
        if (máxima62 != null ? !máxima62.equals(acdAula.máxima62) : acdAula.máxima62 != null) return false;
        if (máxima63 != null ? !máxima63.equals(acdAula.máxima63) : acdAula.máxima63 != null) return false;
        if (máxima64 != null ? !máxima64.equals(acdAula.máxima64) : acdAula.máxima64 != null) return false;
        if (máxima65 != null ? !máxima65.equals(acdAula.máxima65) : acdAula.máxima65 != null) return false;
        if (máxima6Total != null ? !máxima6Total.equals(acdAula.máxima6Total) : acdAula.máxima6Total != null)
            return false;
        if (máxima71 != null ? !máxima71.equals(acdAula.máxima71) : acdAula.máxima71 != null) return false;
        if (máxima72 != null ? !máxima72.equals(acdAula.máxima72) : acdAula.máxima72 != null) return false;
        if (máxima73 != null ? !máxima73.equals(acdAula.máxima73) : acdAula.máxima73 != null) return false;
        if (máxima74 != null ? !máxima74.equals(acdAula.máxima74) : acdAula.máxima74 != null) return false;
        if (máxima75 != null ? !máxima75.equals(acdAula.máxima75) : acdAula.máxima75 != null) return false;
        if (máxima7Total != null ? !máxima7Total.equals(acdAula.máxima7Total) : acdAula.máxima7Total != null)
            return false;
        if (máxima81 != null ? !máxima81.equals(acdAula.máxima81) : acdAula.máxima81 != null) return false;
        if (máxima82 != null ? !máxima82.equals(acdAula.máxima82) : acdAula.máxima82 != null) return false;
        if (máxima83 != null ? !máxima83.equals(acdAula.máxima83) : acdAula.máxima83 != null) return false;
        if (máxima84 != null ? !máxima84.equals(acdAula.máxima84) : acdAula.máxima84 != null) return false;
        if (máxima85 != null ? !máxima85.equals(acdAula.máxima85) : acdAula.máxima85 != null) return false;
        if (máxima8Total != null ? !máxima8Total.equals(acdAula.máxima8Total) : acdAula.máxima8Total != null)
            return false;
        if (média11 != null ? !média11.equals(acdAula.média11) : acdAula.média11 != null) return false;
        if (média12 != null ? !média12.equals(acdAula.média12) : acdAula.média12 != null) return false;
        if (média13 != null ? !média13.equals(acdAula.média13) : acdAula.média13 != null) return false;
        if (média14 != null ? !média14.equals(acdAula.média14) : acdAula.média14 != null) return false;
        if (média15 != null ? !média15.equals(acdAula.média15) : acdAula.média15 != null) return false;
        if (média1Total != null ? !média1Total.equals(acdAula.média1Total) : acdAula.média1Total != null) return false;
        if (média21 != null ? !média21.equals(acdAula.média21) : acdAula.média21 != null) return false;
        if (média22 != null ? !média22.equals(acdAula.média22) : acdAula.média22 != null) return false;
        if (média23 != null ? !média23.equals(acdAula.média23) : acdAula.média23 != null) return false;
        if (média24 != null ? !média24.equals(acdAula.média24) : acdAula.média24 != null) return false;
        if (média25 != null ? !média25.equals(acdAula.média25) : acdAula.média25 != null) return false;
        if (média2Total != null ? !média2Total.equals(acdAula.média2Total) : acdAula.média2Total != null) return false;
        if (média31 != null ? !média31.equals(acdAula.média31) : acdAula.média31 != null) return false;
        if (média32 != null ? !média32.equals(acdAula.média32) : acdAula.média32 != null) return false;
        if (média33 != null ? !média33.equals(acdAula.média33) : acdAula.média33 != null) return false;
        if (média34 != null ? !média34.equals(acdAula.média34) : acdAula.média34 != null) return false;
        if (média35 != null ? !média35.equals(acdAula.média35) : acdAula.média35 != null) return false;
        if (média3Total != null ? !média3Total.equals(acdAula.média3Total) : acdAula.média3Total != null) return false;
        if (média41 != null ? !média41.equals(acdAula.média41) : acdAula.média41 != null) return false;
        if (média42 != null ? !média42.equals(acdAula.média42) : acdAula.média42 != null) return false;
        if (média43 != null ? !média43.equals(acdAula.média43) : acdAula.média43 != null) return false;
        if (média44 != null ? !média44.equals(acdAula.média44) : acdAula.média44 != null) return false;
        if (média45 != null ? !média45.equals(acdAula.média45) : acdAula.média45 != null) return false;
        if (média4Total != null ? !média4Total.equals(acdAula.média4Total) : acdAula.média4Total != null) return false;
        if (média51 != null ? !média51.equals(acdAula.média51) : acdAula.média51 != null) return false;
        if (média52 != null ? !média52.equals(acdAula.média52) : acdAula.média52 != null) return false;
        if (média53 != null ? !média53.equals(acdAula.média53) : acdAula.média53 != null) return false;
        if (média54 != null ? !média54.equals(acdAula.média54) : acdAula.média54 != null) return false;
        if (média55 != null ? !média55.equals(acdAula.média55) : acdAula.média55 != null) return false;
        if (média5Total != null ? !média5Total.equals(acdAula.média5Total) : acdAula.média5Total != null) return false;
        if (média61 != null ? !média61.equals(acdAula.média61) : acdAula.média61 != null) return false;
        if (média62 != null ? !média62.equals(acdAula.média62) : acdAula.média62 != null) return false;
        if (média63 != null ? !média63.equals(acdAula.média63) : acdAula.média63 != null) return false;
        if (média64 != null ? !média64.equals(acdAula.média64) : acdAula.média64 != null) return false;
        if (média65 != null ? !média65.equals(acdAula.média65) : acdAula.média65 != null) return false;
        if (média6Total != null ? !média6Total.equals(acdAula.média6Total) : acdAula.média6Total != null) return false;
        if (média71 != null ? !média71.equals(acdAula.média71) : acdAula.média71 != null) return false;
        if (média72 != null ? !média72.equals(acdAula.média72) : acdAula.média72 != null) return false;
        if (média73 != null ? !média73.equals(acdAula.média73) : acdAula.média73 != null) return false;
        if (média74 != null ? !média74.equals(acdAula.média74) : acdAula.média74 != null) return false;
        if (média75 != null ? !média75.equals(acdAula.média75) : acdAula.média75 != null) return false;
        if (média7Total != null ? !média7Total.equals(acdAula.média7Total) : acdAula.média7Total != null) return false;
        if (média81 != null ? !média81.equals(acdAula.média81) : acdAula.média81 != null) return false;
        if (média82 != null ? !média82.equals(acdAula.média82) : acdAula.média82 != null) return false;
        if (média83 != null ? !média83.equals(acdAula.média83) : acdAula.média83 != null) return false;
        if (média84 != null ? !média84.equals(acdAula.média84) : acdAula.média84 != null) return false;
        if (média85 != null ? !média85.equals(acdAula.média85) : acdAula.média85 != null) return false;
        if (média8Total != null ? !média8Total.equals(acdAula.média8Total) : acdAula.média8Total != null) return false;
        if (médiaMédiaAnual != null ? !médiaMédiaAnual.equals(acdAula.médiaMédiaAnual) : acdAula.médiaMédiaAnual != null)
            return false;
        if (númeroPautaUtilizado != null ? !númeroPautaUtilizado.equals(acdAula.númeroPautaUtilizado) : acdAula.númeroPautaUtilizado != null)
            return false;
        if (previstas1 != null ? !previstas1.equals(acdAula.previstas1) : acdAula.previstas1 != null) return false;
        if (previstas2 != null ? !previstas2.equals(acdAula.previstas2) : acdAula.previstas2 != null) return false;
        if (previstas3 != null ? !previstas3.equals(acdAula.previstas3) : acdAula.previstas3 != null) return false;
        if (previstas4 != null ? !previstas4.equals(acdAula.previstas4) : acdAula.previstas4 != null) return false;
        if (previstas5 != null ? !previstas5.equals(acdAula.previstas5) : acdAula.previstas5 != null) return false;
        if (previstas6 != null ? !previstas6.equals(acdAula.previstas6) : acdAula.previstas6 != null) return false;
        if (previstas7 != null ? !previstas7.equals(acdAula.previstas7) : acdAula.previstas7 != null) return false;
        if (previstas8 != null ? !previstas8.equals(acdAula.previstas8) : acdAula.previstas8 != null) return false;
        if (previstasRecuperação != null ? !previstasRecuperação.equals(acdAula.previstasRecuperação) : acdAula.previstasRecuperação != null)
            return false;
        if (turma != null ? !turma.equals(acdAula.turma) : acdAula.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (aulaId ^ (aulaId >>> 32));
        result = 31 * result + anoLetivo;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + codDisciplina;
        result = 31 * result + (codProfessor != null ? codProfessor.hashCode() : 0);
        result = 31 * result + (previstas1 != null ? previstas1.hashCode() : 0);
        result = 31 * result + (previstas2 != null ? previstas2.hashCode() : 0);
        result = 31 * result + (previstas3 != null ? previstas3.hashCode() : 0);
        result = 31 * result + (previstas4 != null ? previstas4.hashCode() : 0);
        result = 31 * result + (previstas5 != null ? previstas5.hashCode() : 0);
        result = 31 * result + (previstas6 != null ? previstas6.hashCode() : 0);
        result = 31 * result + (previstas7 != null ? previstas7.hashCode() : 0);
        result = 31 * result + (previstas8 != null ? previstas8.hashCode() : 0);
        result = 31 * result + (previstasRecuperação != null ? previstasRecuperação.hashCode() : 0);
        result = 31 * result + (dadas1 != null ? dadas1.hashCode() : 0);
        result = 31 * result + (dadas2 != null ? dadas2.hashCode() : 0);
        result = 31 * result + (dadas3 != null ? dadas3.hashCode() : 0);
        result = 31 * result + (dadas4 != null ? dadas4.hashCode() : 0);
        result = 31 * result + (dadas5 != null ? dadas5.hashCode() : 0);
        result = 31 * result + (dadas6 != null ? dadas6.hashCode() : 0);
        result = 31 * result + (dadas7 != null ? dadas7.hashCode() : 0);
        result = 31 * result + (dadas8 != null ? dadas8.hashCode() : 0);
        result = 31 * result + (dadasRecuperação != null ? dadasRecuperação.hashCode() : 0);
        result = 31 * result + (conteúdo1 != null ? conteúdo1.hashCode() : 0);
        result = 31 * result + (conteúdo2 != null ? conteúdo2.hashCode() : 0);
        result = 31 * result + (conteúdo3 != null ? conteúdo3.hashCode() : 0);
        result = 31 * result + (conteúdo4 != null ? conteúdo4.hashCode() : 0);
        result = 31 * result + (conteúdo5 != null ? conteúdo5.hashCode() : 0);
        result = 31 * result + (conteúdo6 != null ? conteúdo6.hashCode() : 0);
        result = 31 * result + (conteúdo7 != null ? conteúdo7.hashCode() : 0);
        result = 31 * result + (conteúdo8 != null ? conteúdo8.hashCode() : 0);
        result = 31 * result + (númeroPautaUtilizado != null ? númeroPautaUtilizado.hashCode() : 0);
        result = 31 * result + (médiaMédiaAnual != null ? médiaMédiaAnual.hashCode() : 0);
        result = 31 * result + (máxima11 != null ? máxima11.hashCode() : 0);
        result = 31 * result + (máxima12 != null ? máxima12.hashCode() : 0);
        result = 31 * result + (máxima13 != null ? máxima13.hashCode() : 0);
        result = 31 * result + (máxima14 != null ? máxima14.hashCode() : 0);
        result = 31 * result + (máxima15 != null ? máxima15.hashCode() : 0);
        result = 31 * result + (máxima1Total != null ? máxima1Total.hashCode() : 0);
        result = 31 * result + (máxima21 != null ? máxima21.hashCode() : 0);
        result = 31 * result + (máxima22 != null ? máxima22.hashCode() : 0);
        result = 31 * result + (máxima23 != null ? máxima23.hashCode() : 0);
        result = 31 * result + (máxima24 != null ? máxima24.hashCode() : 0);
        result = 31 * result + (máxima25 != null ? máxima25.hashCode() : 0);
        result = 31 * result + (máxima2Total != null ? máxima2Total.hashCode() : 0);
        result = 31 * result + (máxima31 != null ? máxima31.hashCode() : 0);
        result = 31 * result + (máxima32 != null ? máxima32.hashCode() : 0);
        result = 31 * result + (máxima33 != null ? máxima33.hashCode() : 0);
        result = 31 * result + (máxima34 != null ? máxima34.hashCode() : 0);
        result = 31 * result + (máxima35 != null ? máxima35.hashCode() : 0);
        result = 31 * result + (máxima3Total != null ? máxima3Total.hashCode() : 0);
        result = 31 * result + (máxima41 != null ? máxima41.hashCode() : 0);
        result = 31 * result + (máxima42 != null ? máxima42.hashCode() : 0);
        result = 31 * result + (máxima43 != null ? máxima43.hashCode() : 0);
        result = 31 * result + (máxima44 != null ? máxima44.hashCode() : 0);
        result = 31 * result + (máxima45 != null ? máxima45.hashCode() : 0);
        result = 31 * result + (máxima4Total != null ? máxima4Total.hashCode() : 0);
        result = 31 * result + (máxima51 != null ? máxima51.hashCode() : 0);
        result = 31 * result + (máxima52 != null ? máxima52.hashCode() : 0);
        result = 31 * result + (máxima53 != null ? máxima53.hashCode() : 0);
        result = 31 * result + (máxima54 != null ? máxima54.hashCode() : 0);
        result = 31 * result + (máxima55 != null ? máxima55.hashCode() : 0);
        result = 31 * result + (máxima5Total != null ? máxima5Total.hashCode() : 0);
        result = 31 * result + (máxima61 != null ? máxima61.hashCode() : 0);
        result = 31 * result + (máxima62 != null ? máxima62.hashCode() : 0);
        result = 31 * result + (máxima63 != null ? máxima63.hashCode() : 0);
        result = 31 * result + (máxima64 != null ? máxima64.hashCode() : 0);
        result = 31 * result + (máxima65 != null ? máxima65.hashCode() : 0);
        result = 31 * result + (máxima6Total != null ? máxima6Total.hashCode() : 0);
        result = 31 * result + (máxima71 != null ? máxima71.hashCode() : 0);
        result = 31 * result + (máxima72 != null ? máxima72.hashCode() : 0);
        result = 31 * result + (máxima73 != null ? máxima73.hashCode() : 0);
        result = 31 * result + (máxima74 != null ? máxima74.hashCode() : 0);
        result = 31 * result + (máxima75 != null ? máxima75.hashCode() : 0);
        result = 31 * result + (máxima7Total != null ? máxima7Total.hashCode() : 0);
        result = 31 * result + (máxima81 != null ? máxima81.hashCode() : 0);
        result = 31 * result + (máxima82 != null ? máxima82.hashCode() : 0);
        result = 31 * result + (máxima83 != null ? máxima83.hashCode() : 0);
        result = 31 * result + (máxima84 != null ? máxima84.hashCode() : 0);
        result = 31 * result + (máxima85 != null ? máxima85.hashCode() : 0);
        result = 31 * result + (máxima8Total != null ? máxima8Total.hashCode() : 0);
        result = 31 * result + (média11 != null ? média11.hashCode() : 0);
        result = 31 * result + (média12 != null ? média12.hashCode() : 0);
        result = 31 * result + (média13 != null ? média13.hashCode() : 0);
        result = 31 * result + (média14 != null ? média14.hashCode() : 0);
        result = 31 * result + (média15 != null ? média15.hashCode() : 0);
        result = 31 * result + (média1Total != null ? média1Total.hashCode() : 0);
        result = 31 * result + (média21 != null ? média21.hashCode() : 0);
        result = 31 * result + (média22 != null ? média22.hashCode() : 0);
        result = 31 * result + (média23 != null ? média23.hashCode() : 0);
        result = 31 * result + (média24 != null ? média24.hashCode() : 0);
        result = 31 * result + (média25 != null ? média25.hashCode() : 0);
        result = 31 * result + (média2Total != null ? média2Total.hashCode() : 0);
        result = 31 * result + (média31 != null ? média31.hashCode() : 0);
        result = 31 * result + (média32 != null ? média32.hashCode() : 0);
        result = 31 * result + (média33 != null ? média33.hashCode() : 0);
        result = 31 * result + (média34 != null ? média34.hashCode() : 0);
        result = 31 * result + (média35 != null ? média35.hashCode() : 0);
        result = 31 * result + (média3Total != null ? média3Total.hashCode() : 0);
        result = 31 * result + (média41 != null ? média41.hashCode() : 0);
        result = 31 * result + (média42 != null ? média42.hashCode() : 0);
        result = 31 * result + (média43 != null ? média43.hashCode() : 0);
        result = 31 * result + (média44 != null ? média44.hashCode() : 0);
        result = 31 * result + (média45 != null ? média45.hashCode() : 0);
        result = 31 * result + (média4Total != null ? média4Total.hashCode() : 0);
        result = 31 * result + (média51 != null ? média51.hashCode() : 0);
        result = 31 * result + (média52 != null ? média52.hashCode() : 0);
        result = 31 * result + (média53 != null ? média53.hashCode() : 0);
        result = 31 * result + (média54 != null ? média54.hashCode() : 0);
        result = 31 * result + (média55 != null ? média55.hashCode() : 0);
        result = 31 * result + (média5Total != null ? média5Total.hashCode() : 0);
        result = 31 * result + (média61 != null ? média61.hashCode() : 0);
        result = 31 * result + (média62 != null ? média62.hashCode() : 0);
        result = 31 * result + (média63 != null ? média63.hashCode() : 0);
        result = 31 * result + (média64 != null ? média64.hashCode() : 0);
        result = 31 * result + (média65 != null ? média65.hashCode() : 0);
        result = 31 * result + (média6Total != null ? média6Total.hashCode() : 0);
        result = 31 * result + (média71 != null ? média71.hashCode() : 0);
        result = 31 * result + (média72 != null ? média72.hashCode() : 0);
        result = 31 * result + (média73 != null ? média73.hashCode() : 0);
        result = 31 * result + (média74 != null ? média74.hashCode() : 0);
        result = 31 * result + (média75 != null ? média75.hashCode() : 0);
        result = 31 * result + (média7Total != null ? média7Total.hashCode() : 0);
        result = 31 * result + (média81 != null ? média81.hashCode() : 0);
        result = 31 * result + (média82 != null ? média82.hashCode() : 0);
        result = 31 * result + (média83 != null ? média83.hashCode() : 0);
        result = 31 * result + (média84 != null ? média84.hashCode() : 0);
        result = 31 * result + (média85 != null ? média85.hashCode() : 0);
        result = 31 * result + (média8Total != null ? média8Total.hashCode() : 0);
        return result;
    }
}
