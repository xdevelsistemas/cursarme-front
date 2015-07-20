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
@javax.persistence.Table(name = "acdFórmula", schema = "dbo")
@IdClass(AcdFormulaPK.class)
public class AcdFormula {
    private long fórmulaId;

    @Basic
    @javax.persistence.Column(name = "Fórmula_ID", nullable = false, insertable = true, updatable = true)
    public long getFórmulaId() {
        return fórmulaId;
    }

    public void setFórmulaId(long fórmulaId) {
        this.fórmulaId = fórmulaId;
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

    private int anoLetivo;

    @Id
    @javax.persistence.Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    private int codFórmula;

    @Id
    @javax.persistence.Column(name = "CodFórmula", nullable = false, insertable = true, updatable = true)
    public int getCodFórmula() {
        return codFórmula;
    }

    public void setCodFórmula(int codFórmula) {
        this.codFórmula = codFórmula;
    }

    private String fórmula;

    @Basic
    @javax.persistence.Column(name = "Fórmula", nullable = false, insertable = true, updatable = true)
    public String getFórmula() {
        return fórmula;
    }

    public void setFórmula(String fórmula) {
        this.fórmula = fórmula;
    }

    private String cálculo01;

    @Basic
    @javax.persistence.Column(name = "Cálculo01", nullable = true, insertable = true, updatable = true)
    public String getCálculo01() {
        return cálculo01;
    }

    public void setCálculo01(String cálculo01) {
        this.cálculo01 = cálculo01;
    }

    private String descrição01;

    @Basic
    @javax.persistence.Column(name = "Descrição01", nullable = true, insertable = true, updatable = true)
    public String getDescrição01() {
        return descrição01;
    }

    public void setDescrição01(String descrição01) {
        this.descrição01 = descrição01;
    }

    private String cálculo02;

    @Basic
    @javax.persistence.Column(name = "Cálculo02", nullable = true, insertable = true, updatable = true)
    public String getCálculo02() {
        return cálculo02;
    }

    public void setCálculo02(String cálculo02) {
        this.cálculo02 = cálculo02;
    }

    private String descrição02;

    @Basic
    @javax.persistence.Column(name = "Descrição02", nullable = true, insertable = true, updatable = true)
    public String getDescrição02() {
        return descrição02;
    }

    public void setDescrição02(String descrição02) {
        this.descrição02 = descrição02;
    }

    private String cálculo03;

    @Basic
    @javax.persistence.Column(name = "Cálculo03", nullable = true, insertable = true, updatable = true)
    public String getCálculo03() {
        return cálculo03;
    }

    public void setCálculo03(String cálculo03) {
        this.cálculo03 = cálculo03;
    }

    private String descrição03;

    @Basic
    @javax.persistence.Column(name = "Descrição03", nullable = true, insertable = true, updatable = true)
    public String getDescrição03() {
        return descrição03;
    }

    public void setDescrição03(String descrição03) {
        this.descrição03 = descrição03;
    }

    private String cálculo04;

    @Basic
    @javax.persistence.Column(name = "Cálculo04", nullable = true, insertable = true, updatable = true)
    public String getCálculo04() {
        return cálculo04;
    }

    public void setCálculo04(String cálculo04) {
        this.cálculo04 = cálculo04;
    }

    private String descrição04;

    @Basic
    @javax.persistence.Column(name = "Descrição04", nullable = true, insertable = true, updatable = true)
    public String getDescrição04() {
        return descrição04;
    }

    public void setDescrição04(String descrição04) {
        this.descrição04 = descrição04;
    }

    private String cálculo05;

    @Basic
    @javax.persistence.Column(name = "Cálculo05", nullable = true, insertable = true, updatable = true)
    public String getCálculo05() {
        return cálculo05;
    }

    public void setCálculo05(String cálculo05) {
        this.cálculo05 = cálculo05;
    }

    private String descrição05;

    @Basic
    @javax.persistence.Column(name = "Descrição05", nullable = true, insertable = true, updatable = true)
    public String getDescrição05() {
        return descrição05;
    }

    public void setDescrição05(String descrição05) {
        this.descrição05 = descrição05;
    }

    private String cálculo06;

    @Basic
    @javax.persistence.Column(name = "Cálculo06", nullable = true, insertable = true, updatable = true)
    public String getCálculo06() {
        return cálculo06;
    }

    public void setCálculo06(String cálculo06) {
        this.cálculo06 = cálculo06;
    }

    private String descrição06;

    @Basic
    @javax.persistence.Column(name = "Descrição06", nullable = true, insertable = true, updatable = true)
    public String getDescrição06() {
        return descrição06;
    }

    public void setDescrição06(String descrição06) {
        this.descrição06 = descrição06;
    }

    private String cálculo07;

    @Basic
    @javax.persistence.Column(name = "Cálculo07", nullable = true, insertable = true, updatable = true)
    public String getCálculo07() {
        return cálculo07;
    }

    public void setCálculo07(String cálculo07) {
        this.cálculo07 = cálculo07;
    }

    private String descrição07;

    @Basic
    @javax.persistence.Column(name = "Descrição07", nullable = true, insertable = true, updatable = true)
    public String getDescrição07() {
        return descrição07;
    }

    public void setDescrição07(String descrição07) {
        this.descrição07 = descrição07;
    }

    private String cálculo08;

    @Basic
    @javax.persistence.Column(name = "Cálculo08", nullable = true, insertable = true, updatable = true)
    public String getCálculo08() {
        return cálculo08;
    }

    public void setCálculo08(String cálculo08) {
        this.cálculo08 = cálculo08;
    }

    private String descrição08;

    @Basic
    @javax.persistence.Column(name = "Descrição08", nullable = true, insertable = true, updatable = true)
    public String getDescrição08() {
        return descrição08;
    }

    public void setDescrição08(String descrição08) {
        this.descrição08 = descrição08;
    }

    private String cálculo09;

    @Basic
    @javax.persistence.Column(name = "Cálculo09", nullable = true, insertable = true, updatable = true)
    public String getCálculo09() {
        return cálculo09;
    }

    public void setCálculo09(String cálculo09) {
        this.cálculo09 = cálculo09;
    }

    private String descrição09;

    @Basic
    @javax.persistence.Column(name = "Descrição09", nullable = true, insertable = true, updatable = true)
    public String getDescrição09() {
        return descrição09;
    }

    public void setDescrição09(String descrição09) {
        this.descrição09 = descrição09;
    }

    private String cálculo10;

    @Basic
    @javax.persistence.Column(name = "Cálculo10", nullable = true, insertable = true, updatable = true)
    public String getCálculo10() {
        return cálculo10;
    }

    public void setCálculo10(String cálculo10) {
        this.cálculo10 = cálculo10;
    }

    private String descrição10;

    @Basic
    @javax.persistence.Column(name = "Descrição10", nullable = true, insertable = true, updatable = true)
    public String getDescrição10() {
        return descrição10;
    }

    public void setDescrição10(String descrição10) {
        this.descrição10 = descrição10;
    }

    private String cálculo11;

    @Basic
    @javax.persistence.Column(name = "Cálculo11", nullable = true, insertable = true, updatable = true)
    public String getCálculo11() {
        return cálculo11;
    }

    public void setCálculo11(String cálculo11) {
        this.cálculo11 = cálculo11;
    }

    private String descrição11;

    @Basic
    @javax.persistence.Column(name = "Descrição11", nullable = true, insertable = true, updatable = true)
    public String getDescrição11() {
        return descrição11;
    }

    public void setDescrição11(String descrição11) {
        this.descrição11 = descrição11;
    }

    private String cálculo12;

    @Basic
    @javax.persistence.Column(name = "Cálculo12", nullable = true, insertable = true, updatable = true)
    public String getCálculo12() {
        return cálculo12;
    }

    public void setCálculo12(String cálculo12) {
        this.cálculo12 = cálculo12;
    }

    private String descrição12;

    @Basic
    @javax.persistence.Column(name = "Descrição12", nullable = true, insertable = true, updatable = true)
    public String getDescrição12() {
        return descrição12;
    }

    public void setDescrição12(String descrição12) {
        this.descrição12 = descrição12;
    }

    private String cálculo13;

    @Basic
    @javax.persistence.Column(name = "Cálculo13", nullable = true, insertable = true, updatable = true)
    public String getCálculo13() {
        return cálculo13;
    }

    public void setCálculo13(String cálculo13) {
        this.cálculo13 = cálculo13;
    }

    private String descrição13;

    @Basic
    @javax.persistence.Column(name = "Descrição13", nullable = true, insertable = true, updatable = true)
    public String getDescrição13() {
        return descrição13;
    }

    public void setDescrição13(String descrição13) {
        this.descrição13 = descrição13;
    }

    private String cálculo14;

    @Basic
    @javax.persistence.Column(name = "Cálculo14", nullable = true, insertable = true, updatable = true)
    public String getCálculo14() {
        return cálculo14;
    }

    public void setCálculo14(String cálculo14) {
        this.cálculo14 = cálculo14;
    }

    private String descrição14;

    @Basic
    @javax.persistence.Column(name = "Descrição14", nullable = true, insertable = true, updatable = true)
    public String getDescrição14() {
        return descrição14;
    }

    public void setDescrição14(String descrição14) {
        this.descrição14 = descrição14;
    }

    private String cálculo15;

    @Basic
    @javax.persistence.Column(name = "Cálculo15", nullable = true, insertable = true, updatable = true)
    public String getCálculo15() {
        return cálculo15;
    }

    public void setCálculo15(String cálculo15) {
        this.cálculo15 = cálculo15;
    }

    private String descrição15;

    @Basic
    @javax.persistence.Column(name = "Descrição15", nullable = true, insertable = true, updatable = true)
    public String getDescrição15() {
        return descrição15;
    }

    public void setDescrição15(String descrição15) {
        this.descrição15 = descrição15;
    }

    private String cálculo16;

    @Basic
    @javax.persistence.Column(name = "Cálculo16", nullable = true, insertable = true, updatable = true)
    public String getCálculo16() {
        return cálculo16;
    }

    public void setCálculo16(String cálculo16) {
        this.cálculo16 = cálculo16;
    }

    private String descrição16;

    @Basic
    @javax.persistence.Column(name = "Descrição16", nullable = true, insertable = true, updatable = true)
    public String getDescrição16() {
        return descrição16;
    }

    public void setDescrição16(String descrição16) {
        this.descrição16 = descrição16;
    }

    private String cálculo17;

    @Basic
    @javax.persistence.Column(name = "Cálculo17", nullable = true, insertable = true, updatable = true)
    public String getCálculo17() {
        return cálculo17;
    }

    public void setCálculo17(String cálculo17) {
        this.cálculo17 = cálculo17;
    }

    private String descrição17;

    @Basic
    @javax.persistence.Column(name = "Descrição17", nullable = true, insertable = true, updatable = true)
    public String getDescrição17() {
        return descrição17;
    }

    public void setDescrição17(String descrição17) {
        this.descrição17 = descrição17;
    }

    private String cálculo18;

    @Basic
    @javax.persistence.Column(name = "Cálculo18", nullable = true, insertable = true, updatable = true)
    public String getCálculo18() {
        return cálculo18;
    }

    public void setCálculo18(String cálculo18) {
        this.cálculo18 = cálculo18;
    }

    private String descrição18;

    @Basic
    @javax.persistence.Column(name = "Descrição18", nullable = true, insertable = true, updatable = true)
    public String getDescrição18() {
        return descrição18;
    }

    public void setDescrição18(String descrição18) {
        this.descrição18 = descrição18;
    }

    private String cálculo19;

    @Basic
    @javax.persistence.Column(name = "Cálculo19", nullable = true, insertable = true, updatable = true)
    public String getCálculo19() {
        return cálculo19;
    }

    public void setCálculo19(String cálculo19) {
        this.cálculo19 = cálculo19;
    }

    private String descrição19;

    @Basic
    @javax.persistence.Column(name = "Descrição19", nullable = true, insertable = true, updatable = true)
    public String getDescrição19() {
        return descrição19;
    }

    public void setDescrição19(String descrição19) {
        this.descrição19 = descrição19;
    }

    private String cálculo20;

    @Basic
    @javax.persistence.Column(name = "Cálculo20", nullable = true, insertable = true, updatable = true)
    public String getCálculo20() {
        return cálculo20;
    }

    public void setCálculo20(String cálculo20) {
        this.cálculo20 = cálculo20;
    }

    private String descrição20;

    @Basic
    @javax.persistence.Column(name = "Descrição20", nullable = true, insertable = true, updatable = true)
    public String getDescrição20() {
        return descrição20;
    }

    public void setDescrição20(String descrição20) {
        this.descrição20 = descrição20;
    }

    private String cálculo21;

    @Basic
    @javax.persistence.Column(name = "Cálculo21", nullable = true, insertable = true, updatable = true)
    public String getCálculo21() {
        return cálculo21;
    }

    public void setCálculo21(String cálculo21) {
        this.cálculo21 = cálculo21;
    }

    private String descrição21;

    @Basic
    @javax.persistence.Column(name = "Descrição21", nullable = true, insertable = true, updatable = true)
    public String getDescrição21() {
        return descrição21;
    }

    public void setDescrição21(String descrição21) {
        this.descrição21 = descrição21;
    }

    private String cálculo22;

    @Basic
    @javax.persistence.Column(name = "Cálculo22", nullable = true, insertable = true, updatable = true)
    public String getCálculo22() {
        return cálculo22;
    }

    public void setCálculo22(String cálculo22) {
        this.cálculo22 = cálculo22;
    }

    private String descrição22;

    @Basic
    @javax.persistence.Column(name = "Descrição22", nullable = true, insertable = true, updatable = true)
    public String getDescrição22() {
        return descrição22;
    }

    public void setDescrição22(String descrição22) {
        this.descrição22 = descrição22;
    }

    private String cálculo23;

    @Basic
    @javax.persistence.Column(name = "Cálculo23", nullable = true, insertable = true, updatable = true)
    public String getCálculo23() {
        return cálculo23;
    }

    public void setCálculo23(String cálculo23) {
        this.cálculo23 = cálculo23;
    }

    private String descrição23;

    @Basic
    @javax.persistence.Column(name = "Descrição23", nullable = true, insertable = true, updatable = true)
    public String getDescrição23() {
        return descrição23;
    }

    public void setDescrição23(String descrição23) {
        this.descrição23 = descrição23;
    }

    private String cálculo24;

    @Basic
    @javax.persistence.Column(name = "Cálculo24", nullable = true, insertable = true, updatable = true)
    public String getCálculo24() {
        return cálculo24;
    }

    public void setCálculo24(String cálculo24) {
        this.cálculo24 = cálculo24;
    }

    private String descrição24;

    @Basic
    @javax.persistence.Column(name = "Descrição24", nullable = true, insertable = true, updatable = true)
    public String getDescrição24() {
        return descrição24;
    }

    public void setDescrição24(String descrição24) {
        this.descrição24 = descrição24;
    }

    private String cálculo25;

    @Basic
    @javax.persistence.Column(name = "Cálculo25", nullable = true, insertable = true, updatable = true)
    public String getCálculo25() {
        return cálculo25;
    }

    public void setCálculo25(String cálculo25) {
        this.cálculo25 = cálculo25;
    }

    private String descrição25;

    @Basic
    @javax.persistence.Column(name = "Descrição25", nullable = true, insertable = true, updatable = true)
    public String getDescrição25() {
        return descrição25;
    }

    public void setDescrição25(String descrição25) {
        this.descrição25 = descrição25;
    }

    private String cálculo26;

    @Basic
    @javax.persistence.Column(name = "Cálculo26", nullable = true, insertable = true, updatable = true)
    public String getCálculo26() {
        return cálculo26;
    }

    public void setCálculo26(String cálculo26) {
        this.cálculo26 = cálculo26;
    }

    private String descrição26;

    @Basic
    @javax.persistence.Column(name = "Descrição26", nullable = true, insertable = true, updatable = true)
    public String getDescrição26() {
        return descrição26;
    }

    public void setDescrição26(String descrição26) {
        this.descrição26 = descrição26;
    }

    private String cálculo27;

    @Basic
    @javax.persistence.Column(name = "Cálculo27", nullable = true, insertable = true, updatable = true)
    public String getCálculo27() {
        return cálculo27;
    }

    public void setCálculo27(String cálculo27) {
        this.cálculo27 = cálculo27;
    }

    private String descrição27;

    @Basic
    @javax.persistence.Column(name = "Descrição27", nullable = true, insertable = true, updatable = true)
    public String getDescrição27() {
        return descrição27;
    }

    public void setDescrição27(String descrição27) {
        this.descrição27 = descrição27;
    }

    private String cálculo28;

    @Basic
    @javax.persistence.Column(name = "Cálculo28", nullable = true, insertable = true, updatable = true)
    public String getCálculo28() {
        return cálculo28;
    }

    public void setCálculo28(String cálculo28) {
        this.cálculo28 = cálculo28;
    }

    private String descrição28;

    @Basic
    @javax.persistence.Column(name = "Descrição28", nullable = true, insertable = true, updatable = true)
    public String getDescrição28() {
        return descrição28;
    }

    public void setDescrição28(String descrição28) {
        this.descrição28 = descrição28;
    }

    private String cálculo29;

    @Basic
    @javax.persistence.Column(name = "Cálculo29", nullable = true, insertable = true, updatable = true)
    public String getCálculo29() {
        return cálculo29;
    }

    public void setCálculo29(String cálculo29) {
        this.cálculo29 = cálculo29;
    }

    private String descrição29;

    @Basic
    @javax.persistence.Column(name = "Descrição29", nullable = true, insertable = true, updatable = true)
    public String getDescrição29() {
        return descrição29;
    }

    public void setDescrição29(String descrição29) {
        this.descrição29 = descrição29;
    }

    private String cálculo30;

    @Basic
    @javax.persistence.Column(name = "Cálculo30", nullable = true, insertable = true, updatable = true)
    public String getCálculo30() {
        return cálculo30;
    }

    public void setCálculo30(String cálculo30) {
        this.cálculo30 = cálculo30;
    }

    private String descrição30;

    @Basic
    @javax.persistence.Column(name = "Descrição30", nullable = true, insertable = true, updatable = true)
    public String getDescrição30() {
        return descrição30;
    }

    public void setDescrição30(String descrição30) {
        this.descrição30 = descrição30;
    }

    private boolean avaliação;

    @Basic
    @javax.persistence.Column(name = "Avaliação", nullable = false, insertable = true, updatable = true)
    public boolean isAvaliação() {
        return avaliação;
    }

    public void setAvaliação(boolean avaliação) {
        this.avaliação = avaliação;
    }

    private BigDecimal média1;

    @Basic
    @javax.persistence.Column(name = "Média1", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia1() {
        return média1;
    }

    public void setMédia1(BigDecimal média1) {
        this.média1 = média1;
    }

    private BigDecimal média2;

    @Basic
    @javax.persistence.Column(name = "Média2", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia2() {
        return média2;
    }

    public void setMédia2(BigDecimal média2) {
        this.média2 = média2;
    }

    private BigDecimal média3;

    @Basic
    @javax.persistence.Column(name = "Média3", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia3() {
        return média3;
    }

    public void setMédia3(BigDecimal média3) {
        this.média3 = média3;
    }

    private BigDecimal média4;

    @Basic
    @javax.persistence.Column(name = "Média4", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia4() {
        return média4;
    }

    public void setMédia4(BigDecimal média4) {
        this.média4 = média4;
    }

    private BigDecimal média5;

    @Basic
    @javax.persistence.Column(name = "Média5", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia5() {
        return média5;
    }

    public void setMédia5(BigDecimal média5) {
        this.média5 = média5;
    }

    private BigDecimal média6;

    @Basic
    @javax.persistence.Column(name = "Média6", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia6() {
        return média6;
    }

    public void setMédia6(BigDecimal média6) {
        this.média6 = média6;
    }

    private BigDecimal média7;

    @Basic
    @javax.persistence.Column(name = "Média7", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia7() {
        return média7;
    }

    public void setMédia7(BigDecimal média7) {
        this.média7 = média7;
    }

    private BigDecimal média8;

    @Basic
    @javax.persistence.Column(name = "Média8", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMédia8() {
        return média8;
    }

    public void setMédia8(BigDecimal média8) {
        this.média8 = média8;
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

    private BigDecimal máxima1;

    @Basic
    @javax.persistence.Column(name = "Máxima1", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima1() {
        return máxima1;
    }

    public void setMáxima1(BigDecimal máxima1) {
        this.máxima1 = máxima1;
    }

    private BigDecimal máxima2;

    @Basic
    @javax.persistence.Column(name = "Máxima2", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima2() {
        return máxima2;
    }

    public void setMáxima2(BigDecimal máxima2) {
        this.máxima2 = máxima2;
    }

    private BigDecimal máxima3;

    @Basic
    @javax.persistence.Column(name = "Máxima3", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima3() {
        return máxima3;
    }

    public void setMáxima3(BigDecimal máxima3) {
        this.máxima3 = máxima3;
    }

    private BigDecimal máxima4;

    @Basic
    @javax.persistence.Column(name = "Máxima4", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima4() {
        return máxima4;
    }

    public void setMáxima4(BigDecimal máxima4) {
        this.máxima4 = máxima4;
    }

    private BigDecimal máxima5;

    @Basic
    @javax.persistence.Column(name = "Máxima5", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima5() {
        return máxima5;
    }

    public void setMáxima5(BigDecimal máxima5) {
        this.máxima5 = máxima5;
    }

    private BigDecimal máxima6;

    @Basic
    @javax.persistence.Column(name = "Máxima6", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima6() {
        return máxima6;
    }

    public void setMáxima6(BigDecimal máxima6) {
        this.máxima6 = máxima6;
    }

    private BigDecimal máxima7;

    @Basic
    @javax.persistence.Column(name = "Máxima7", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima7() {
        return máxima7;
    }

    public void setMáxima7(BigDecimal máxima7) {
        this.máxima7 = máxima7;
    }

    private BigDecimal máxima8;

    @Basic
    @javax.persistence.Column(name = "Máxima8", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáxima8() {
        return máxima8;
    }

    public void setMáxima8(BigDecimal máxima8) {
        this.máxima8 = máxima8;
    }

    private BigDecimal máximaFinal;

    @Basic
    @javax.persistence.Column(name = "MáximaFinal", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getMáximaFinal() {
        return máximaFinal;
    }

    public void setMáximaFinal(BigDecimal máximaFinal) {
        this.máximaFinal = máximaFinal;
    }

    private String cálculo;

    @Basic
    @javax.persistence.Column(name = "Cálculo", nullable = true, insertable = true, updatable = true)
    public String getCálculo() {
        return cálculo;
    }

    public void setCálculo(String cálculo) {
        this.cálculo = cálculo;
    }

    private Boolean somaMáxima;

    @Basic
    @javax.persistence.Column(name = "SomaMáxima", nullable = true, insertable = true, updatable = true)
    public Boolean getSomaMáxima() {
        return somaMáxima;
    }

    public void setSomaMáxima(Boolean somaMáxima) {
        this.somaMáxima = somaMáxima;
    }

    private Long usarConceito;

    @Basic
    @javax.persistence.Column(name = "UsarConceito", nullable = true, insertable = true, updatable = true)
    public Long getUsarConceito() {
        return usarConceito;
    }

    public void setUsarConceito(Long usarConceito) {
        this.usarConceito = usarConceito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdFormula that = (AcdFormula) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (avaliação != that.avaliação) return false;
        if (codFórmula != that.codFórmula) return false;
        if (codUnidade != that.codUnidade) return false;
        if (fórmulaId != that.fórmulaId) return false;
        if (cálculo != null ? !cálculo.equals(that.cálculo) : that.cálculo != null) return false;
        if (cálculo01 != null ? !cálculo01.equals(that.cálculo01) : that.cálculo01 != null) return false;
        if (cálculo02 != null ? !cálculo02.equals(that.cálculo02) : that.cálculo02 != null) return false;
        if (cálculo03 != null ? !cálculo03.equals(that.cálculo03) : that.cálculo03 != null) return false;
        if (cálculo04 != null ? !cálculo04.equals(that.cálculo04) : that.cálculo04 != null) return false;
        if (cálculo05 != null ? !cálculo05.equals(that.cálculo05) : that.cálculo05 != null) return false;
        if (cálculo06 != null ? !cálculo06.equals(that.cálculo06) : that.cálculo06 != null) return false;
        if (cálculo07 != null ? !cálculo07.equals(that.cálculo07) : that.cálculo07 != null) return false;
        if (cálculo08 != null ? !cálculo08.equals(that.cálculo08) : that.cálculo08 != null) return false;
        if (cálculo09 != null ? !cálculo09.equals(that.cálculo09) : that.cálculo09 != null) return false;
        if (cálculo10 != null ? !cálculo10.equals(that.cálculo10) : that.cálculo10 != null) return false;
        if (cálculo11 != null ? !cálculo11.equals(that.cálculo11) : that.cálculo11 != null) return false;
        if (cálculo12 != null ? !cálculo12.equals(that.cálculo12) : that.cálculo12 != null) return false;
        if (cálculo13 != null ? !cálculo13.equals(that.cálculo13) : that.cálculo13 != null) return false;
        if (cálculo14 != null ? !cálculo14.equals(that.cálculo14) : that.cálculo14 != null) return false;
        if (cálculo15 != null ? !cálculo15.equals(that.cálculo15) : that.cálculo15 != null) return false;
        if (cálculo16 != null ? !cálculo16.equals(that.cálculo16) : that.cálculo16 != null) return false;
        if (cálculo17 != null ? !cálculo17.equals(that.cálculo17) : that.cálculo17 != null) return false;
        if (cálculo18 != null ? !cálculo18.equals(that.cálculo18) : that.cálculo18 != null) return false;
        if (cálculo19 != null ? !cálculo19.equals(that.cálculo19) : that.cálculo19 != null) return false;
        if (cálculo20 != null ? !cálculo20.equals(that.cálculo20) : that.cálculo20 != null) return false;
        if (cálculo21 != null ? !cálculo21.equals(that.cálculo21) : that.cálculo21 != null) return false;
        if (cálculo22 != null ? !cálculo22.equals(that.cálculo22) : that.cálculo22 != null) return false;
        if (cálculo23 != null ? !cálculo23.equals(that.cálculo23) : that.cálculo23 != null) return false;
        if (cálculo24 != null ? !cálculo24.equals(that.cálculo24) : that.cálculo24 != null) return false;
        if (cálculo25 != null ? !cálculo25.equals(that.cálculo25) : that.cálculo25 != null) return false;
        if (cálculo26 != null ? !cálculo26.equals(that.cálculo26) : that.cálculo26 != null) return false;
        if (cálculo27 != null ? !cálculo27.equals(that.cálculo27) : that.cálculo27 != null) return false;
        if (cálculo28 != null ? !cálculo28.equals(that.cálculo28) : that.cálculo28 != null) return false;
        if (cálculo29 != null ? !cálculo29.equals(that.cálculo29) : that.cálculo29 != null) return false;
        if (cálculo30 != null ? !cálculo30.equals(that.cálculo30) : that.cálculo30 != null) return false;
        if (descrição01 != null ? !descrição01.equals(that.descrição01) : that.descrição01 != null) return false;
        if (descrição02 != null ? !descrição02.equals(that.descrição02) : that.descrição02 != null) return false;
        if (descrição03 != null ? !descrição03.equals(that.descrição03) : that.descrição03 != null) return false;
        if (descrição04 != null ? !descrição04.equals(that.descrição04) : that.descrição04 != null) return false;
        if (descrição05 != null ? !descrição05.equals(that.descrição05) : that.descrição05 != null) return false;
        if (descrição06 != null ? !descrição06.equals(that.descrição06) : that.descrição06 != null) return false;
        if (descrição07 != null ? !descrição07.equals(that.descrição07) : that.descrição07 != null) return false;
        if (descrição08 != null ? !descrição08.equals(that.descrição08) : that.descrição08 != null) return false;
        if (descrição09 != null ? !descrição09.equals(that.descrição09) : that.descrição09 != null) return false;
        if (descrição10 != null ? !descrição10.equals(that.descrição10) : that.descrição10 != null) return false;
        if (descrição11 != null ? !descrição11.equals(that.descrição11) : that.descrição11 != null) return false;
        if (descrição12 != null ? !descrição12.equals(that.descrição12) : that.descrição12 != null) return false;
        if (descrição13 != null ? !descrição13.equals(that.descrição13) : that.descrição13 != null) return false;
        if (descrição14 != null ? !descrição14.equals(that.descrição14) : that.descrição14 != null) return false;
        if (descrição15 != null ? !descrição15.equals(that.descrição15) : that.descrição15 != null) return false;
        if (descrição16 != null ? !descrição16.equals(that.descrição16) : that.descrição16 != null) return false;
        if (descrição17 != null ? !descrição17.equals(that.descrição17) : that.descrição17 != null) return false;
        if (descrição18 != null ? !descrição18.equals(that.descrição18) : that.descrição18 != null) return false;
        if (descrição19 != null ? !descrição19.equals(that.descrição19) : that.descrição19 != null) return false;
        if (descrição20 != null ? !descrição20.equals(that.descrição20) : that.descrição20 != null) return false;
        if (descrição21 != null ? !descrição21.equals(that.descrição21) : that.descrição21 != null) return false;
        if (descrição22 != null ? !descrição22.equals(that.descrição22) : that.descrição22 != null) return false;
        if (descrição23 != null ? !descrição23.equals(that.descrição23) : that.descrição23 != null) return false;
        if (descrição24 != null ? !descrição24.equals(that.descrição24) : that.descrição24 != null) return false;
        if (descrição25 != null ? !descrição25.equals(that.descrição25) : that.descrição25 != null) return false;
        if (descrição26 != null ? !descrição26.equals(that.descrição26) : that.descrição26 != null) return false;
        if (descrição27 != null ? !descrição27.equals(that.descrição27) : that.descrição27 != null) return false;
        if (descrição28 != null ? !descrição28.equals(that.descrição28) : that.descrição28 != null) return false;
        if (descrição29 != null ? !descrição29.equals(that.descrição29) : that.descrição29 != null) return false;
        if (descrição30 != null ? !descrição30.equals(that.descrição30) : that.descrição30 != null) return false;
        if (fórmula != null ? !fórmula.equals(that.fórmula) : that.fórmula != null) return false;
        if (máxima1 != null ? !máxima1.equals(that.máxima1) : that.máxima1 != null) return false;
        if (máxima2 != null ? !máxima2.equals(that.máxima2) : that.máxima2 != null) return false;
        if (máxima3 != null ? !máxima3.equals(that.máxima3) : that.máxima3 != null) return false;
        if (máxima4 != null ? !máxima4.equals(that.máxima4) : that.máxima4 != null) return false;
        if (máxima5 != null ? !máxima5.equals(that.máxima5) : that.máxima5 != null) return false;
        if (máxima6 != null ? !máxima6.equals(that.máxima6) : that.máxima6 != null) return false;
        if (máxima7 != null ? !máxima7.equals(that.máxima7) : that.máxima7 != null) return false;
        if (máxima8 != null ? !máxima8.equals(that.máxima8) : that.máxima8 != null) return false;
        if (máximaFinal != null ? !máximaFinal.equals(that.máximaFinal) : that.máximaFinal != null) return false;
        if (média1 != null ? !média1.equals(that.média1) : that.média1 != null) return false;
        if (média2 != null ? !média2.equals(that.média2) : that.média2 != null) return false;
        if (média3 != null ? !média3.equals(that.média3) : that.média3 != null) return false;
        if (média4 != null ? !média4.equals(that.média4) : that.média4 != null) return false;
        if (média5 != null ? !média5.equals(that.média5) : that.média5 != null) return false;
        if (média6 != null ? !média6.equals(that.média6) : that.média6 != null) return false;
        if (média7 != null ? !média7.equals(that.média7) : that.média7 != null) return false;
        if (média8 != null ? !média8.equals(that.média8) : that.média8 != null) return false;
        if (médiaFinal != null ? !médiaFinal.equals(that.médiaFinal) : that.médiaFinal != null) return false;
        if (somaMáxima != null ? !somaMáxima.equals(that.somaMáxima) : that.somaMáxima != null) return false;
        if (usarConceito != null ? !usarConceito.equals(that.usarConceito) : that.usarConceito != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (fórmulaId ^ (fórmulaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + codFórmula;
        result = 31 * result + (fórmula != null ? fórmula.hashCode() : 0);
        result = 31 * result + (cálculo01 != null ? cálculo01.hashCode() : 0);
        result = 31 * result + (descrição01 != null ? descrição01.hashCode() : 0);
        result = 31 * result + (cálculo02 != null ? cálculo02.hashCode() : 0);
        result = 31 * result + (descrição02 != null ? descrição02.hashCode() : 0);
        result = 31 * result + (cálculo03 != null ? cálculo03.hashCode() : 0);
        result = 31 * result + (descrição03 != null ? descrição03.hashCode() : 0);
        result = 31 * result + (cálculo04 != null ? cálculo04.hashCode() : 0);
        result = 31 * result + (descrição04 != null ? descrição04.hashCode() : 0);
        result = 31 * result + (cálculo05 != null ? cálculo05.hashCode() : 0);
        result = 31 * result + (descrição05 != null ? descrição05.hashCode() : 0);
        result = 31 * result + (cálculo06 != null ? cálculo06.hashCode() : 0);
        result = 31 * result + (descrição06 != null ? descrição06.hashCode() : 0);
        result = 31 * result + (cálculo07 != null ? cálculo07.hashCode() : 0);
        result = 31 * result + (descrição07 != null ? descrição07.hashCode() : 0);
        result = 31 * result + (cálculo08 != null ? cálculo08.hashCode() : 0);
        result = 31 * result + (descrição08 != null ? descrição08.hashCode() : 0);
        result = 31 * result + (cálculo09 != null ? cálculo09.hashCode() : 0);
        result = 31 * result + (descrição09 != null ? descrição09.hashCode() : 0);
        result = 31 * result + (cálculo10 != null ? cálculo10.hashCode() : 0);
        result = 31 * result + (descrição10 != null ? descrição10.hashCode() : 0);
        result = 31 * result + (cálculo11 != null ? cálculo11.hashCode() : 0);
        result = 31 * result + (descrição11 != null ? descrição11.hashCode() : 0);
        result = 31 * result + (cálculo12 != null ? cálculo12.hashCode() : 0);
        result = 31 * result + (descrição12 != null ? descrição12.hashCode() : 0);
        result = 31 * result + (cálculo13 != null ? cálculo13.hashCode() : 0);
        result = 31 * result + (descrição13 != null ? descrição13.hashCode() : 0);
        result = 31 * result + (cálculo14 != null ? cálculo14.hashCode() : 0);
        result = 31 * result + (descrição14 != null ? descrição14.hashCode() : 0);
        result = 31 * result + (cálculo15 != null ? cálculo15.hashCode() : 0);
        result = 31 * result + (descrição15 != null ? descrição15.hashCode() : 0);
        result = 31 * result + (cálculo16 != null ? cálculo16.hashCode() : 0);
        result = 31 * result + (descrição16 != null ? descrição16.hashCode() : 0);
        result = 31 * result + (cálculo17 != null ? cálculo17.hashCode() : 0);
        result = 31 * result + (descrição17 != null ? descrição17.hashCode() : 0);
        result = 31 * result + (cálculo18 != null ? cálculo18.hashCode() : 0);
        result = 31 * result + (descrição18 != null ? descrição18.hashCode() : 0);
        result = 31 * result + (cálculo19 != null ? cálculo19.hashCode() : 0);
        result = 31 * result + (descrição19 != null ? descrição19.hashCode() : 0);
        result = 31 * result + (cálculo20 != null ? cálculo20.hashCode() : 0);
        result = 31 * result + (descrição20 != null ? descrição20.hashCode() : 0);
        result = 31 * result + (cálculo21 != null ? cálculo21.hashCode() : 0);
        result = 31 * result + (descrição21 != null ? descrição21.hashCode() : 0);
        result = 31 * result + (cálculo22 != null ? cálculo22.hashCode() : 0);
        result = 31 * result + (descrição22 != null ? descrição22.hashCode() : 0);
        result = 31 * result + (cálculo23 != null ? cálculo23.hashCode() : 0);
        result = 31 * result + (descrição23 != null ? descrição23.hashCode() : 0);
        result = 31 * result + (cálculo24 != null ? cálculo24.hashCode() : 0);
        result = 31 * result + (descrição24 != null ? descrição24.hashCode() : 0);
        result = 31 * result + (cálculo25 != null ? cálculo25.hashCode() : 0);
        result = 31 * result + (descrição25 != null ? descrição25.hashCode() : 0);
        result = 31 * result + (cálculo26 != null ? cálculo26.hashCode() : 0);
        result = 31 * result + (descrição26 != null ? descrição26.hashCode() : 0);
        result = 31 * result + (cálculo27 != null ? cálculo27.hashCode() : 0);
        result = 31 * result + (descrição27 != null ? descrição27.hashCode() : 0);
        result = 31 * result + (cálculo28 != null ? cálculo28.hashCode() : 0);
        result = 31 * result + (descrição28 != null ? descrição28.hashCode() : 0);
        result = 31 * result + (cálculo29 != null ? cálculo29.hashCode() : 0);
        result = 31 * result + (descrição29 != null ? descrição29.hashCode() : 0);
        result = 31 * result + (cálculo30 != null ? cálculo30.hashCode() : 0);
        result = 31 * result + (descrição30 != null ? descrição30.hashCode() : 0);
        result = 31 * result + (avaliação ? 1 : 0);
        result = 31 * result + (média1 != null ? média1.hashCode() : 0);
        result = 31 * result + (média2 != null ? média2.hashCode() : 0);
        result = 31 * result + (média3 != null ? média3.hashCode() : 0);
        result = 31 * result + (média4 != null ? média4.hashCode() : 0);
        result = 31 * result + (média5 != null ? média5.hashCode() : 0);
        result = 31 * result + (média6 != null ? média6.hashCode() : 0);
        result = 31 * result + (média7 != null ? média7.hashCode() : 0);
        result = 31 * result + (média8 != null ? média8.hashCode() : 0);
        result = 31 * result + (médiaFinal != null ? médiaFinal.hashCode() : 0);
        result = 31 * result + (máxima1 != null ? máxima1.hashCode() : 0);
        result = 31 * result + (máxima2 != null ? máxima2.hashCode() : 0);
        result = 31 * result + (máxima3 != null ? máxima3.hashCode() : 0);
        result = 31 * result + (máxima4 != null ? máxima4.hashCode() : 0);
        result = 31 * result + (máxima5 != null ? máxima5.hashCode() : 0);
        result = 31 * result + (máxima6 != null ? máxima6.hashCode() : 0);
        result = 31 * result + (máxima7 != null ? máxima7.hashCode() : 0);
        result = 31 * result + (máxima8 != null ? máxima8.hashCode() : 0);
        result = 31 * result + (máximaFinal != null ? máximaFinal.hashCode() : 0);
        result = 31 * result + (cálculo != null ? cálculo.hashCode() : 0);
        result = 31 * result + (somaMáxima != null ? somaMáxima.hashCode() : 0);
        result = 31 * result + (usarConceito != null ? usarConceito.hashCode() : 0);
        return result;
    }
}
