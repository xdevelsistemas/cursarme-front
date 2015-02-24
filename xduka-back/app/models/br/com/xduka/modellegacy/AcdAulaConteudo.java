package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@javax.persistence.Table(name = "acdAulaConteúdo", schema = "dbo", catalog = "xDuka")
public class AcdAulaConteudo {
    private long aulaConteúdoId;

    @Basic
    @javax.persistence.Column(name = "AulaConteúdo_ID", nullable = false, insertable = true, updatable = true)
    public long getAulaConteúdoId() {
        return aulaConteúdoId;
    }

    public void setAulaConteúdoId(long aulaConteúdoId) {
        this.aulaConteúdoId = aulaConteúdoId;
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

    private int anoLetivo;

    @Id
    @javax.persistence.Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
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

    private String turma;

    @Id
    @javax.persistence.Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
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

    private short bimestre;

    @Id
    @javax.persistence.Column(name = "Bimestre", nullable = false, insertable = true, updatable = true)
    public short getBimestre() {
        return bimestre;
    }

    public void setBimestre(short bimestre) {
        this.bimestre = bimestre;
    }

    private Timestamp d01;

    @Basic
    @javax.persistence.Column(name = "D01", nullable = true, insertable = true, updatable = true)
    public Timestamp getD01() {
        return d01;
    }

    public void setD01(Timestamp d01) {
        this.d01 = d01;
    }

    private Timestamp d02;

    @Basic
    @javax.persistence.Column(name = "D02", nullable = true, insertable = true, updatable = true)
    public Timestamp getD02() {
        return d02;
    }

    public void setD02(Timestamp d02) {
        this.d02 = d02;
    }

    private Timestamp d03;

    @Basic
    @javax.persistence.Column(name = "D03", nullable = true, insertable = true, updatable = true)
    public Timestamp getD03() {
        return d03;
    }

    public void setD03(Timestamp d03) {
        this.d03 = d03;
    }

    private Timestamp d04;

    @Basic
    @javax.persistence.Column(name = "D04", nullable = true, insertable = true, updatable = true)
    public Timestamp getD04() {
        return d04;
    }

    public void setD04(Timestamp d04) {
        this.d04 = d04;
    }

    private Timestamp d05;

    @Basic
    @javax.persistence.Column(name = "D05", nullable = true, insertable = true, updatable = true)
    public Timestamp getD05() {
        return d05;
    }

    public void setD05(Timestamp d05) {
        this.d05 = d05;
    }

    private Timestamp d06;

    @Basic
    @javax.persistence.Column(name = "D06", nullable = true, insertable = true, updatable = true)
    public Timestamp getD06() {
        return d06;
    }

    public void setD06(Timestamp d06) {
        this.d06 = d06;
    }

    private Timestamp d07;

    @Basic
    @javax.persistence.Column(name = "D07", nullable = true, insertable = true, updatable = true)
    public Timestamp getD07() {
        return d07;
    }

    public void setD07(Timestamp d07) {
        this.d07 = d07;
    }

    private Timestamp d08;

    @Basic
    @javax.persistence.Column(name = "D08", nullable = true, insertable = true, updatable = true)
    public Timestamp getD08() {
        return d08;
    }

    public void setD08(Timestamp d08) {
        this.d08 = d08;
    }

    private Timestamp d09;

    @Basic
    @javax.persistence.Column(name = "D09", nullable = true, insertable = true, updatable = true)
    public Timestamp getD09() {
        return d09;
    }

    public void setD09(Timestamp d09) {
        this.d09 = d09;
    }

    private Timestamp d10;

    @Basic
    @javax.persistence.Column(name = "D10", nullable = true, insertable = true, updatable = true)
    public Timestamp getD10() {
        return d10;
    }

    public void setD10(Timestamp d10) {
        this.d10 = d10;
    }

    private Timestamp d11;

    @Basic
    @javax.persistence.Column(name = "D11", nullable = true, insertable = true, updatable = true)
    public Timestamp getD11() {
        return d11;
    }

    public void setD11(Timestamp d11) {
        this.d11 = d11;
    }

    private Timestamp d12;

    @Basic
    @javax.persistence.Column(name = "D12", nullable = true, insertable = true, updatable = true)
    public Timestamp getD12() {
        return d12;
    }

    public void setD12(Timestamp d12) {
        this.d12 = d12;
    }

    private Timestamp d13;

    @Basic
    @javax.persistence.Column(name = "D13", nullable = true, insertable = true, updatable = true)
    public Timestamp getD13() {
        return d13;
    }

    public void setD13(Timestamp d13) {
        this.d13 = d13;
    }

    private Timestamp d14;

    @Basic
    @javax.persistence.Column(name = "D14", nullable = true, insertable = true, updatable = true)
    public Timestamp getD14() {
        return d14;
    }

    public void setD14(Timestamp d14) {
        this.d14 = d14;
    }

    private Timestamp d15;

    @Basic
    @javax.persistence.Column(name = "D15", nullable = true, insertable = true, updatable = true)
    public Timestamp getD15() {
        return d15;
    }

    public void setD15(Timestamp d15) {
        this.d15 = d15;
    }

    private Timestamp d16;

    @Basic
    @javax.persistence.Column(name = "D16", nullable = true, insertable = true, updatable = true)
    public Timestamp getD16() {
        return d16;
    }

    public void setD16(Timestamp d16) {
        this.d16 = d16;
    }

    private Timestamp d17;

    @Basic
    @javax.persistence.Column(name = "D17", nullable = true, insertable = true, updatable = true)
    public Timestamp getD17() {
        return d17;
    }

    public void setD17(Timestamp d17) {
        this.d17 = d17;
    }

    private Timestamp d18;

    @Basic
    @javax.persistence.Column(name = "D18", nullable = true, insertable = true, updatable = true)
    public Timestamp getD18() {
        return d18;
    }

    public void setD18(Timestamp d18) {
        this.d18 = d18;
    }

    private Timestamp d19;

    @Basic
    @javax.persistence.Column(name = "D19", nullable = true, insertable = true, updatable = true)
    public Timestamp getD19() {
        return d19;
    }

    public void setD19(Timestamp d19) {
        this.d19 = d19;
    }

    private Timestamp d20;

    @Basic
    @javax.persistence.Column(name = "D20", nullable = true, insertable = true, updatable = true)
    public Timestamp getD20() {
        return d20;
    }

    public void setD20(Timestamp d20) {
        this.d20 = d20;
    }

    private Timestamp d21;

    @Basic
    @javax.persistence.Column(name = "D21", nullable = true, insertable = true, updatable = true)
    public Timestamp getD21() {
        return d21;
    }

    public void setD21(Timestamp d21) {
        this.d21 = d21;
    }

    private Timestamp d22;

    @Basic
    @javax.persistence.Column(name = "D22", nullable = true, insertable = true, updatable = true)
    public Timestamp getD22() {
        return d22;
    }

    public void setD22(Timestamp d22) {
        this.d22 = d22;
    }

    private Timestamp d23;

    @Basic
    @javax.persistence.Column(name = "D23", nullable = true, insertable = true, updatable = true)
    public Timestamp getD23() {
        return d23;
    }

    public void setD23(Timestamp d23) {
        this.d23 = d23;
    }

    private Timestamp d24;

    @Basic
    @javax.persistence.Column(name = "D24", nullable = true, insertable = true, updatable = true)
    public Timestamp getD24() {
        return d24;
    }

    public void setD24(Timestamp d24) {
        this.d24 = d24;
    }

    private Timestamp d25;

    @Basic
    @javax.persistence.Column(name = "D25", nullable = true, insertable = true, updatable = true)
    public Timestamp getD25() {
        return d25;
    }

    public void setD25(Timestamp d25) {
        this.d25 = d25;
    }

    private Timestamp d26;

    @Basic
    @javax.persistence.Column(name = "D26", nullable = true, insertable = true, updatable = true)
    public Timestamp getD26() {
        return d26;
    }

    public void setD26(Timestamp d26) {
        this.d26 = d26;
    }

    private Timestamp d27;

    @Basic
    @javax.persistence.Column(name = "D27", nullable = true, insertable = true, updatable = true)
    public Timestamp getD27() {
        return d27;
    }

    public void setD27(Timestamp d27) {
        this.d27 = d27;
    }

    private Timestamp d28;

    @Basic
    @javax.persistence.Column(name = "D28", nullable = true, insertable = true, updatable = true)
    public Timestamp getD28() {
        return d28;
    }

    public void setD28(Timestamp d28) {
        this.d28 = d28;
    }

    private Timestamp d29;

    @Basic
    @javax.persistence.Column(name = "D29", nullable = true, insertable = true, updatable = true)
    public Timestamp getD29() {
        return d29;
    }

    public void setD29(Timestamp d29) {
        this.d29 = d29;
    }

    private Timestamp d30;

    @Basic
    @javax.persistence.Column(name = "D30", nullable = true, insertable = true, updatable = true)
    public Timestamp getD30() {
        return d30;
    }

    public void setD30(Timestamp d30) {
        this.d30 = d30;
    }

    private Timestamp d31;

    @Basic
    @javax.persistence.Column(name = "D31", nullable = true, insertable = true, updatable = true)
    public Timestamp getD31() {
        return d31;
    }

    public void setD31(Timestamp d31) {
        this.d31 = d31;
    }

    private Timestamp d32;

    @Basic
    @javax.persistence.Column(name = "D32", nullable = true, insertable = true, updatable = true)
    public Timestamp getD32() {
        return d32;
    }

    public void setD32(Timestamp d32) {
        this.d32 = d32;
    }

    private Timestamp d33;

    @Basic
    @javax.persistence.Column(name = "D33", nullable = true, insertable = true, updatable = true)
    public Timestamp getD33() {
        return d33;
    }

    public void setD33(Timestamp d33) {
        this.d33 = d33;
    }

    private Timestamp d34;

    @Basic
    @javax.persistence.Column(name = "D34", nullable = true, insertable = true, updatable = true)
    public Timestamp getD34() {
        return d34;
    }

    public void setD34(Timestamp d34) {
        this.d34 = d34;
    }

    private Timestamp d35;

    @Basic
    @javax.persistence.Column(name = "D35", nullable = true, insertable = true, updatable = true)
    public Timestamp getD35() {
        return d35;
    }

    public void setD35(Timestamp d35) {
        this.d35 = d35;
    }

    private Timestamp d36;

    @Basic
    @javax.persistence.Column(name = "D36", nullable = true, insertable = true, updatable = true)
    public Timestamp getD36() {
        return d36;
    }

    public void setD36(Timestamp d36) {
        this.d36 = d36;
    }

    private Timestamp d37;

    @Basic
    @javax.persistence.Column(name = "D37", nullable = true, insertable = true, updatable = true)
    public Timestamp getD37() {
        return d37;
    }

    public void setD37(Timestamp d37) {
        this.d37 = d37;
    }

    private Timestamp d38;

    @Basic
    @javax.persistence.Column(name = "D38", nullable = true, insertable = true, updatable = true)
    public Timestamp getD38() {
        return d38;
    }

    public void setD38(Timestamp d38) {
        this.d38 = d38;
    }

    private Timestamp d39;

    @Basic
    @javax.persistence.Column(name = "D39", nullable = true, insertable = true, updatable = true)
    public Timestamp getD39() {
        return d39;
    }

    public void setD39(Timestamp d39) {
        this.d39 = d39;
    }

    private Timestamp d40;

    @Basic
    @javax.persistence.Column(name = "D40", nullable = true, insertable = true, updatable = true)
    public Timestamp getD40() {
        return d40;
    }

    public void setD40(Timestamp d40) {
        this.d40 = d40;
    }

    private Timestamp d41;

    @Basic
    @javax.persistence.Column(name = "D41", nullable = true, insertable = true, updatable = true)
    public Timestamp getD41() {
        return d41;
    }

    public void setD41(Timestamp d41) {
        this.d41 = d41;
    }

    private Timestamp d42;

    @Basic
    @javax.persistence.Column(name = "D42", nullable = true, insertable = true, updatable = true)
    public Timestamp getD42() {
        return d42;
    }

    public void setD42(Timestamp d42) {
        this.d42 = d42;
    }

    private Timestamp d43;

    @Basic
    @javax.persistence.Column(name = "D43", nullable = true, insertable = true, updatable = true)
    public Timestamp getD43() {
        return d43;
    }

    public void setD43(Timestamp d43) {
        this.d43 = d43;
    }

    private Timestamp d44;

    @Basic
    @javax.persistence.Column(name = "D44", nullable = true, insertable = true, updatable = true)
    public Timestamp getD44() {
        return d44;
    }

    public void setD44(Timestamp d44) {
        this.d44 = d44;
    }

    private Timestamp d45;

    @Basic
    @javax.persistence.Column(name = "D45", nullable = true, insertable = true, updatable = true)
    public Timestamp getD45() {
        return d45;
    }

    public void setD45(Timestamp d45) {
        this.d45 = d45;
    }

    private Timestamp d46;

    @Basic
    @javax.persistence.Column(name = "D46", nullable = true, insertable = true, updatable = true)
    public Timestamp getD46() {
        return d46;
    }

    public void setD46(Timestamp d46) {
        this.d46 = d46;
    }

    private Timestamp d47;

    @Basic
    @javax.persistence.Column(name = "D47", nullable = true, insertable = true, updatable = true)
    public Timestamp getD47() {
        return d47;
    }

    public void setD47(Timestamp d47) {
        this.d47 = d47;
    }

    private Timestamp d48;

    @Basic
    @javax.persistence.Column(name = "D48", nullable = true, insertable = true, updatable = true)
    public Timestamp getD48() {
        return d48;
    }

    public void setD48(Timestamp d48) {
        this.d48 = d48;
    }

    private Timestamp d49;

    @Basic
    @javax.persistence.Column(name = "D49", nullable = true, insertable = true, updatable = true)
    public Timestamp getD49() {
        return d49;
    }

    public void setD49(Timestamp d49) {
        this.d49 = d49;
    }

    private Timestamp d50;

    @Basic
    @javax.persistence.Column(name = "D50", nullable = true, insertable = true, updatable = true)
    public Timestamp getD50() {
        return d50;
    }

    public void setD50(Timestamp d50) {
        this.d50 = d50;
    }

    private Timestamp d51;

    @Basic
    @javax.persistence.Column(name = "D51", nullable = true, insertable = true, updatable = true)
    public Timestamp getD51() {
        return d51;
    }

    public void setD51(Timestamp d51) {
        this.d51 = d51;
    }

    private Timestamp d52;

    @Basic
    @javax.persistence.Column(name = "D52", nullable = true, insertable = true, updatable = true)
    public Timestamp getD52() {
        return d52;
    }

    public void setD52(Timestamp d52) {
        this.d52 = d52;
    }

    private Timestamp d53;

    @Basic
    @javax.persistence.Column(name = "D53", nullable = true, insertable = true, updatable = true)
    public Timestamp getD53() {
        return d53;
    }

    public void setD53(Timestamp d53) {
        this.d53 = d53;
    }

    private Timestamp d54;

    @Basic
    @javax.persistence.Column(name = "D54", nullable = true, insertable = true, updatable = true)
    public Timestamp getD54() {
        return d54;
    }

    public void setD54(Timestamp d54) {
        this.d54 = d54;
    }

    private Timestamp d55;

    @Basic
    @javax.persistence.Column(name = "D55", nullable = true, insertable = true, updatable = true)
    public Timestamp getD55() {
        return d55;
    }

    public void setD55(Timestamp d55) {
        this.d55 = d55;
    }

    private Timestamp d56;

    @Basic
    @javax.persistence.Column(name = "D56", nullable = true, insertable = true, updatable = true)
    public Timestamp getD56() {
        return d56;
    }

    public void setD56(Timestamp d56) {
        this.d56 = d56;
    }

    private Timestamp d57;

    @Basic
    @javax.persistence.Column(name = "D57", nullable = true, insertable = true, updatable = true)
    public Timestamp getD57() {
        return d57;
    }

    public void setD57(Timestamp d57) {
        this.d57 = d57;
    }

    private Timestamp d58;

    @Basic
    @javax.persistence.Column(name = "D58", nullable = true, insertable = true, updatable = true)
    public Timestamp getD58() {
        return d58;
    }

    public void setD58(Timestamp d58) {
        this.d58 = d58;
    }

    private Timestamp d59;

    @Basic
    @javax.persistence.Column(name = "D59", nullable = true, insertable = true, updatable = true)
    public Timestamp getD59() {
        return d59;
    }

    public void setD59(Timestamp d59) {
        this.d59 = d59;
    }

    private Timestamp d60;

    @Basic
    @javax.persistence.Column(name = "D60", nullable = true, insertable = true, updatable = true)
    public Timestamp getD60() {
        return d60;
    }

    public void setD60(Timestamp d60) {
        this.d60 = d60;
    }

    private Timestamp d61;

    @Basic
    @javax.persistence.Column(name = "D61", nullable = true, insertable = true, updatable = true)
    public Timestamp getD61() {
        return d61;
    }

    public void setD61(Timestamp d61) {
        this.d61 = d61;
    }

    private Timestamp d62;

    @Basic
    @javax.persistence.Column(name = "D62", nullable = true, insertable = true, updatable = true)
    public Timestamp getD62() {
        return d62;
    }

    public void setD62(Timestamp d62) {
        this.d62 = d62;
    }

    private Timestamp d63;

    @Basic
    @javax.persistence.Column(name = "D63", nullable = true, insertable = true, updatable = true)
    public Timestamp getD63() {
        return d63;
    }

    public void setD63(Timestamp d63) {
        this.d63 = d63;
    }

    private Timestamp d64;

    @Basic
    @javax.persistence.Column(name = "D64", nullable = true, insertable = true, updatable = true)
    public Timestamp getD64() {
        return d64;
    }

    public void setD64(Timestamp d64) {
        this.d64 = d64;
    }

    private Timestamp d65;

    @Basic
    @javax.persistence.Column(name = "D65", nullable = true, insertable = true, updatable = true)
    public Timestamp getD65() {
        return d65;
    }

    public void setD65(Timestamp d65) {
        this.d65 = d65;
    }

    private Timestamp d66;

    @Basic
    @javax.persistence.Column(name = "D66", nullable = true, insertable = true, updatable = true)
    public Timestamp getD66() {
        return d66;
    }

    public void setD66(Timestamp d66) {
        this.d66 = d66;
    }

    private Timestamp d67;

    @Basic
    @javax.persistence.Column(name = "D67", nullable = true, insertable = true, updatable = true)
    public Timestamp getD67() {
        return d67;
    }

    public void setD67(Timestamp d67) {
        this.d67 = d67;
    }

    private Timestamp d68;

    @Basic
    @javax.persistence.Column(name = "D68", nullable = true, insertable = true, updatable = true)
    public Timestamp getD68() {
        return d68;
    }

    public void setD68(Timestamp d68) {
        this.d68 = d68;
    }

    private Timestamp d69;

    @Basic
    @javax.persistence.Column(name = "D69", nullable = true, insertable = true, updatable = true)
    public Timestamp getD69() {
        return d69;
    }

    public void setD69(Timestamp d69) {
        this.d69 = d69;
    }

    private Timestamp d70;

    @Basic
    @javax.persistence.Column(name = "D70", nullable = true, insertable = true, updatable = true)
    public Timestamp getD70() {
        return d70;
    }

    public void setD70(Timestamp d70) {
        this.d70 = d70;
    }

    private Timestamp d71;

    @Basic
    @javax.persistence.Column(name = "D71", nullable = true, insertable = true, updatable = true)
    public Timestamp getD71() {
        return d71;
    }

    public void setD71(Timestamp d71) {
        this.d71 = d71;
    }

    private Timestamp d72;

    @Basic
    @javax.persistence.Column(name = "D72", nullable = true, insertable = true, updatable = true)
    public Timestamp getD72() {
        return d72;
    }

    public void setD72(Timestamp d72) {
        this.d72 = d72;
    }

    private Timestamp d73;

    @Basic
    @javax.persistence.Column(name = "D73", nullable = true, insertable = true, updatable = true)
    public Timestamp getD73() {
        return d73;
    }

    public void setD73(Timestamp d73) {
        this.d73 = d73;
    }

    private Timestamp d74;

    @Basic
    @javax.persistence.Column(name = "D74", nullable = true, insertable = true, updatable = true)
    public Timestamp getD74() {
        return d74;
    }

    public void setD74(Timestamp d74) {
        this.d74 = d74;
    }

    private Timestamp d75;

    @Basic
    @javax.persistence.Column(name = "D75", nullable = true, insertable = true, updatable = true)
    public Timestamp getD75() {
        return d75;
    }

    public void setD75(Timestamp d75) {
        this.d75 = d75;
    }

    private Timestamp d76;

    @Basic
    @javax.persistence.Column(name = "D76", nullable = true, insertable = true, updatable = true)
    public Timestamp getD76() {
        return d76;
    }

    public void setD76(Timestamp d76) {
        this.d76 = d76;
    }

    private Timestamp d77;

    @Basic
    @javax.persistence.Column(name = "D77", nullable = true, insertable = true, updatable = true)
    public Timestamp getD77() {
        return d77;
    }

    public void setD77(Timestamp d77) {
        this.d77 = d77;
    }

    private Timestamp d78;

    @Basic
    @javax.persistence.Column(name = "D78", nullable = true, insertable = true, updatable = true)
    public Timestamp getD78() {
        return d78;
    }

    public void setD78(Timestamp d78) {
        this.d78 = d78;
    }

    private Timestamp d79;

    @Basic
    @javax.persistence.Column(name = "D79", nullable = true, insertable = true, updatable = true)
    public Timestamp getD79() {
        return d79;
    }

    public void setD79(Timestamp d79) {
        this.d79 = d79;
    }

    private Timestamp d80;

    @Basic
    @javax.persistence.Column(name = "D80", nullable = true, insertable = true, updatable = true)
    public Timestamp getD80() {
        return d80;
    }

    public void setD80(Timestamp d80) {
        this.d80 = d80;
    }

    private String c01;

    @Basic
    @javax.persistence.Column(name = "C01", nullable = true, insertable = true, updatable = true)
    public String getC01() {
        return c01;
    }

    public void setC01(String c01) {
        this.c01 = c01;
    }

    private String c02;

    @Basic
    @javax.persistence.Column(name = "C02", nullable = true, insertable = true, updatable = true)
    public String getC02() {
        return c02;
    }

    public void setC02(String c02) {
        this.c02 = c02;
    }

    private String c03;

    @Basic
    @javax.persistence.Column(name = "C03", nullable = true, insertable = true, updatable = true)
    public String getC03() {
        return c03;
    }

    public void setC03(String c03) {
        this.c03 = c03;
    }

    private String c04;

    @Basic
    @javax.persistence.Column(name = "C04", nullable = true, insertable = true, updatable = true)
    public String getC04() {
        return c04;
    }

    public void setC04(String c04) {
        this.c04 = c04;
    }

    private String c05;

    @Basic
    @javax.persistence.Column(name = "C05", nullable = true, insertable = true, updatable = true)
    public String getC05() {
        return c05;
    }

    public void setC05(String c05) {
        this.c05 = c05;
    }

    private String c06;

    @Basic
    @javax.persistence.Column(name = "C06", nullable = true, insertable = true, updatable = true)
    public String getC06() {
        return c06;
    }

    public void setC06(String c06) {
        this.c06 = c06;
    }

    private String c07;

    @Basic
    @javax.persistence.Column(name = "C07", nullable = true, insertable = true, updatable = true)
    public String getC07() {
        return c07;
    }

    public void setC07(String c07) {
        this.c07 = c07;
    }

    private String c08;

    @Basic
    @javax.persistence.Column(name = "C08", nullable = true, insertable = true, updatable = true)
    public String getC08() {
        return c08;
    }

    public void setC08(String c08) {
        this.c08 = c08;
    }

    private String c09;

    @Basic
    @javax.persistence.Column(name = "C09", nullable = true, insertable = true, updatable = true)
    public String getC09() {
        return c09;
    }

    public void setC09(String c09) {
        this.c09 = c09;
    }

    private String c10;

    @Basic
    @javax.persistence.Column(name = "C10", nullable = true, insertable = true, updatable = true)
    public String getC10() {
        return c10;
    }

    public void setC10(String c10) {
        this.c10 = c10;
    }

    private String c11;

    @Basic
    @javax.persistence.Column(name = "C11", nullable = true, insertable = true, updatable = true)
    public String getC11() {
        return c11;
    }

    public void setC11(String c11) {
        this.c11 = c11;
    }

    private String c12;

    @Basic
    @javax.persistence.Column(name = "C12", nullable = true, insertable = true, updatable = true)
    public String getC12() {
        return c12;
    }

    public void setC12(String c12) {
        this.c12 = c12;
    }

    private String c13;

    @Basic
    @javax.persistence.Column(name = "C13", nullable = true, insertable = true, updatable = true)
    public String getC13() {
        return c13;
    }

    public void setC13(String c13) {
        this.c13 = c13;
    }

    private String c14;

    @Basic
    @javax.persistence.Column(name = "C14", nullable = true, insertable = true, updatable = true)
    public String getC14() {
        return c14;
    }

    public void setC14(String c14) {
        this.c14 = c14;
    }

    private String c15;

    @Basic
    @javax.persistence.Column(name = "C15", nullable = true, insertable = true, updatable = true)
    public String getC15() {
        return c15;
    }

    public void setC15(String c15) {
        this.c15 = c15;
    }

    private String c16;

    @Basic
    @javax.persistence.Column(name = "C16", nullable = true, insertable = true, updatable = true)
    public String getC16() {
        return c16;
    }

    public void setC16(String c16) {
        this.c16 = c16;
    }

    private String c17;

    @Basic
    @javax.persistence.Column(name = "C17", nullable = true, insertable = true, updatable = true)
    public String getC17() {
        return c17;
    }

    public void setC17(String c17) {
        this.c17 = c17;
    }

    private String c18;

    @Basic
    @javax.persistence.Column(name = "C18", nullable = true, insertable = true, updatable = true)
    public String getC18() {
        return c18;
    }

    public void setC18(String c18) {
        this.c18 = c18;
    }

    private String c19;

    @Basic
    @javax.persistence.Column(name = "C19", nullable = true, insertable = true, updatable = true)
    public String getC19() {
        return c19;
    }

    public void setC19(String c19) {
        this.c19 = c19;
    }

    private String c20;

    @Basic
    @javax.persistence.Column(name = "C20", nullable = true, insertable = true, updatable = true)
    public String getC20() {
        return c20;
    }

    public void setC20(String c20) {
        this.c20 = c20;
    }

    private String c21;

    @Basic
    @javax.persistence.Column(name = "C21", nullable = true, insertable = true, updatable = true)
    public String getC21() {
        return c21;
    }

    public void setC21(String c21) {
        this.c21 = c21;
    }

    private String c22;

    @Basic
    @javax.persistence.Column(name = "C22", nullable = true, insertable = true, updatable = true)
    public String getC22() {
        return c22;
    }

    public void setC22(String c22) {
        this.c22 = c22;
    }

    private String c23;

    @Basic
    @javax.persistence.Column(name = "C23", nullable = true, insertable = true, updatable = true)
    public String getC23() {
        return c23;
    }

    public void setC23(String c23) {
        this.c23 = c23;
    }

    private String c24;

    @Basic
    @javax.persistence.Column(name = "C24", nullable = true, insertable = true, updatable = true)
    public String getC24() {
        return c24;
    }

    public void setC24(String c24) {
        this.c24 = c24;
    }

    private String c25;

    @Basic
    @javax.persistence.Column(name = "C25", nullable = true, insertable = true, updatable = true)
    public String getC25() {
        return c25;
    }

    public void setC25(String c25) {
        this.c25 = c25;
    }

    private String c26;

    @Basic
    @javax.persistence.Column(name = "C26", nullable = true, insertable = true, updatable = true)
    public String getC26() {
        return c26;
    }

    public void setC26(String c26) {
        this.c26 = c26;
    }

    private String c27;

    @Basic
    @javax.persistence.Column(name = "C27", nullable = true, insertable = true, updatable = true)
    public String getC27() {
        return c27;
    }

    public void setC27(String c27) {
        this.c27 = c27;
    }

    private String c28;

    @Basic
    @javax.persistence.Column(name = "C28", nullable = true, insertable = true, updatable = true)
    public String getC28() {
        return c28;
    }

    public void setC28(String c28) {
        this.c28 = c28;
    }

    private String c29;

    @Basic
    @javax.persistence.Column(name = "C29", nullable = true, insertable = true, updatable = true)
    public String getC29() {
        return c29;
    }

    public void setC29(String c29) {
        this.c29 = c29;
    }

    private String c30;

    @Basic
    @javax.persistence.Column(name = "C30", nullable = true, insertable = true, updatable = true)
    public String getC30() {
        return c30;
    }

    public void setC30(String c30) {
        this.c30 = c30;
    }

    private String c31;

    @Basic
    @javax.persistence.Column(name = "C31", nullable = true, insertable = true, updatable = true)
    public String getC31() {
        return c31;
    }

    public void setC31(String c31) {
        this.c31 = c31;
    }

    private String c32;

    @Basic
    @javax.persistence.Column(name = "C32", nullable = true, insertable = true, updatable = true)
    public String getC32() {
        return c32;
    }

    public void setC32(String c32) {
        this.c32 = c32;
    }

    private String c33;

    @Basic
    @javax.persistence.Column(name = "C33", nullable = true, insertable = true, updatable = true)
    public String getC33() {
        return c33;
    }

    public void setC33(String c33) {
        this.c33 = c33;
    }

    private String c34;

    @Basic
    @javax.persistence.Column(name = "C34", nullable = true, insertable = true, updatable = true)
    public String getC34() {
        return c34;
    }

    public void setC34(String c34) {
        this.c34 = c34;
    }

    private String c35;

    @Basic
    @javax.persistence.Column(name = "C35", nullable = true, insertable = true, updatable = true)
    public String getC35() {
        return c35;
    }

    public void setC35(String c35) {
        this.c35 = c35;
    }

    private String c36;

    @Basic
    @javax.persistence.Column(name = "C36", nullable = true, insertable = true, updatable = true)
    public String getC36() {
        return c36;
    }

    public void setC36(String c36) {
        this.c36 = c36;
    }

    private String c37;

    @Basic
    @javax.persistence.Column(name = "C37", nullable = true, insertable = true, updatable = true)
    public String getC37() {
        return c37;
    }

    public void setC37(String c37) {
        this.c37 = c37;
    }

    private String c38;

    @Basic
    @javax.persistence.Column(name = "C38", nullable = true, insertable = true, updatable = true)
    public String getC38() {
        return c38;
    }

    public void setC38(String c38) {
        this.c38 = c38;
    }

    private String c39;

    @Basic
    @javax.persistence.Column(name = "C39", nullable = true, insertable = true, updatable = true)
    public String getC39() {
        return c39;
    }

    public void setC39(String c39) {
        this.c39 = c39;
    }

    private String c40;

    @Basic
    @javax.persistence.Column(name = "C40", nullable = true, insertable = true, updatable = true)
    public String getC40() {
        return c40;
    }

    public void setC40(String c40) {
        this.c40 = c40;
    }

    private String c41;

    @Basic
    @javax.persistence.Column(name = "C41", nullable = true, insertable = true, updatable = true)
    public String getC41() {
        return c41;
    }

    public void setC41(String c41) {
        this.c41 = c41;
    }

    private String c42;

    @Basic
    @javax.persistence.Column(name = "C42", nullable = true, insertable = true, updatable = true)
    public String getC42() {
        return c42;
    }

    public void setC42(String c42) {
        this.c42 = c42;
    }

    private String c43;

    @Basic
    @javax.persistence.Column(name = "C43", nullable = true, insertable = true, updatable = true)
    public String getC43() {
        return c43;
    }

    public void setC43(String c43) {
        this.c43 = c43;
    }

    private String c44;

    @Basic
    @javax.persistence.Column(name = "C44", nullable = true, insertable = true, updatable = true)
    public String getC44() {
        return c44;
    }

    public void setC44(String c44) {
        this.c44 = c44;
    }

    private String c45;

    @Basic
    @javax.persistence.Column(name = "C45", nullable = true, insertable = true, updatable = true)
    public String getC45() {
        return c45;
    }

    public void setC45(String c45) {
        this.c45 = c45;
    }

    private String c46;

    @Basic
    @javax.persistence.Column(name = "C46", nullable = true, insertable = true, updatable = true)
    public String getC46() {
        return c46;
    }

    public void setC46(String c46) {
        this.c46 = c46;
    }

    private String c47;

    @Basic
    @javax.persistence.Column(name = "C47", nullable = true, insertable = true, updatable = true)
    public String getC47() {
        return c47;
    }

    public void setC47(String c47) {
        this.c47 = c47;
    }

    private String c48;

    @Basic
    @javax.persistence.Column(name = "C48", nullable = true, insertable = true, updatable = true)
    public String getC48() {
        return c48;
    }

    public void setC48(String c48) {
        this.c48 = c48;
    }

    private String c49;

    @Basic
    @javax.persistence.Column(name = "C49", nullable = true, insertable = true, updatable = true)
    public String getC49() {
        return c49;
    }

    public void setC49(String c49) {
        this.c49 = c49;
    }

    private String c50;

    @Basic
    @javax.persistence.Column(name = "C50", nullable = true, insertable = true, updatable = true)
    public String getC50() {
        return c50;
    }

    public void setC50(String c50) {
        this.c50 = c50;
    }

    private String c51;

    @Basic
    @javax.persistence.Column(name = "C51", nullable = true, insertable = true, updatable = true)
    public String getC51() {
        return c51;
    }

    public void setC51(String c51) {
        this.c51 = c51;
    }

    private String c52;

    @Basic
    @javax.persistence.Column(name = "C52", nullable = true, insertable = true, updatable = true)
    public String getC52() {
        return c52;
    }

    public void setC52(String c52) {
        this.c52 = c52;
    }

    private String c53;

    @Basic
    @javax.persistence.Column(name = "C53", nullable = true, insertable = true, updatable = true)
    public String getC53() {
        return c53;
    }

    public void setC53(String c53) {
        this.c53 = c53;
    }

    private String c54;

    @Basic
    @javax.persistence.Column(name = "C54", nullable = true, insertable = true, updatable = true)
    public String getC54() {
        return c54;
    }

    public void setC54(String c54) {
        this.c54 = c54;
    }

    private String c55;

    @Basic
    @javax.persistence.Column(name = "C55", nullable = true, insertable = true, updatable = true)
    public String getC55() {
        return c55;
    }

    public void setC55(String c55) {
        this.c55 = c55;
    }

    private String c56;

    @Basic
    @javax.persistence.Column(name = "C56", nullable = true, insertable = true, updatable = true)
    public String getC56() {
        return c56;
    }

    public void setC56(String c56) {
        this.c56 = c56;
    }

    private String c57;

    @Basic
    @javax.persistence.Column(name = "C57", nullable = true, insertable = true, updatable = true)
    public String getC57() {
        return c57;
    }

    public void setC57(String c57) {
        this.c57 = c57;
    }

    private String c58;

    @Basic
    @javax.persistence.Column(name = "C58", nullable = true, insertable = true, updatable = true)
    public String getC58() {
        return c58;
    }

    public void setC58(String c58) {
        this.c58 = c58;
    }

    private String c59;

    @Basic
    @javax.persistence.Column(name = "C59", nullable = true, insertable = true, updatable = true)
    public String getC59() {
        return c59;
    }

    public void setC59(String c59) {
        this.c59 = c59;
    }

    private String c60;

    @Basic
    @javax.persistence.Column(name = "C60", nullable = true, insertable = true, updatable = true)
    public String getC60() {
        return c60;
    }

    public void setC60(String c60) {
        this.c60 = c60;
    }

    private String c61;

    @Basic
    @javax.persistence.Column(name = "C61", nullable = true, insertable = true, updatable = true)
    public String getC61() {
        return c61;
    }

    public void setC61(String c61) {
        this.c61 = c61;
    }

    private String c62;

    @Basic
    @javax.persistence.Column(name = "C62", nullable = true, insertable = true, updatable = true)
    public String getC62() {
        return c62;
    }

    public void setC62(String c62) {
        this.c62 = c62;
    }

    private String c63;

    @Basic
    @javax.persistence.Column(name = "C63", nullable = true, insertable = true, updatable = true)
    public String getC63() {
        return c63;
    }

    public void setC63(String c63) {
        this.c63 = c63;
    }

    private String c64;

    @Basic
    @javax.persistence.Column(name = "C64", nullable = true, insertable = true, updatable = true)
    public String getC64() {
        return c64;
    }

    public void setC64(String c64) {
        this.c64 = c64;
    }

    private String c65;

    @Basic
    @javax.persistence.Column(name = "C65", nullable = true, insertable = true, updatable = true)
    public String getC65() {
        return c65;
    }

    public void setC65(String c65) {
        this.c65 = c65;
    }

    private String c66;

    @Basic
    @javax.persistence.Column(name = "C66", nullable = true, insertable = true, updatable = true)
    public String getC66() {
        return c66;
    }

    public void setC66(String c66) {
        this.c66 = c66;
    }

    private String c67;

    @Basic
    @javax.persistence.Column(name = "C67", nullable = true, insertable = true, updatable = true)
    public String getC67() {
        return c67;
    }

    public void setC67(String c67) {
        this.c67 = c67;
    }

    private String c68;

    @Basic
    @javax.persistence.Column(name = "C68", nullable = true, insertable = true, updatable = true)
    public String getC68() {
        return c68;
    }

    public void setC68(String c68) {
        this.c68 = c68;
    }

    private String c69;

    @Basic
    @javax.persistence.Column(name = "C69", nullable = true, insertable = true, updatable = true)
    public String getC69() {
        return c69;
    }

    public void setC69(String c69) {
        this.c69 = c69;
    }

    private String c70;

    @Basic
    @javax.persistence.Column(name = "C70", nullable = true, insertable = true, updatable = true)
    public String getC70() {
        return c70;
    }

    public void setC70(String c70) {
        this.c70 = c70;
    }

    private String c71;

    @Basic
    @javax.persistence.Column(name = "C71", nullable = true, insertable = true, updatable = true)
    public String getC71() {
        return c71;
    }

    public void setC71(String c71) {
        this.c71 = c71;
    }

    private String c72;

    @Basic
    @javax.persistence.Column(name = "C72", nullable = true, insertable = true, updatable = true)
    public String getC72() {
        return c72;
    }

    public void setC72(String c72) {
        this.c72 = c72;
    }

    private String c73;

    @Basic
    @javax.persistence.Column(name = "C73", nullable = true, insertable = true, updatable = true)
    public String getC73() {
        return c73;
    }

    public void setC73(String c73) {
        this.c73 = c73;
    }

    private String c74;

    @Basic
    @javax.persistence.Column(name = "C74", nullable = true, insertable = true, updatable = true)
    public String getC74() {
        return c74;
    }

    public void setC74(String c74) {
        this.c74 = c74;
    }

    private String c75;

    @Basic
    @javax.persistence.Column(name = "C75", nullable = true, insertable = true, updatable = true)
    public String getC75() {
        return c75;
    }

    public void setC75(String c75) {
        this.c75 = c75;
    }

    private String c76;

    @Basic
    @javax.persistence.Column(name = "C76", nullable = true, insertable = true, updatable = true)
    public String getC76() {
        return c76;
    }

    public void setC76(String c76) {
        this.c76 = c76;
    }

    private String c77;

    @Basic
    @javax.persistence.Column(name = "C77", nullable = true, insertable = true, updatable = true)
    public String getC77() {
        return c77;
    }

    public void setC77(String c77) {
        this.c77 = c77;
    }

    private String c78;

    @Basic
    @javax.persistence.Column(name = "C78", nullable = true, insertable = true, updatable = true)
    public String getC78() {
        return c78;
    }

    public void setC78(String c78) {
        this.c78 = c78;
    }

    private String c79;

    @Basic
    @javax.persistence.Column(name = "C79", nullable = true, insertable = true, updatable = true)
    public String getC79() {
        return c79;
    }

    public void setC79(String c79) {
        this.c79 = c79;
    }

    private String c80;

    @Basic
    @javax.persistence.Column(name = "C80", nullable = true, insertable = true, updatable = true)
    public String getC80() {
        return c80;
    }

    public void setC80(String c80) {
        this.c80 = c80;
    }

    private Integer codDisciplinaPrincipal;

    @Basic
    @javax.persistence.Column(name = "CodDisciplinaPrincipal", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplinaPrincipal() {
        return codDisciplinaPrincipal;
    }

    public void setCodDisciplinaPrincipal(Integer codDisciplinaPrincipal) {
        this.codDisciplinaPrincipal = codDisciplinaPrincipal;
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

    private Timestamp d81;

    @Basic
    @javax.persistence.Column(name = "D81", nullable = true, insertable = true, updatable = true)
    public Timestamp getD81() {
        return d81;
    }

    public void setD81(Timestamp d81) {
        this.d81 = d81;
    }

    private Timestamp d82;

    @Basic
    @javax.persistence.Column(name = "D82", nullable = true, insertable = true, updatable = true)
    public Timestamp getD82() {
        return d82;
    }

    public void setD82(Timestamp d82) {
        this.d82 = d82;
    }

    private Timestamp d83;

    @Basic
    @javax.persistence.Column(name = "D83", nullable = true, insertable = true, updatable = true)
    public Timestamp getD83() {
        return d83;
    }

    public void setD83(Timestamp d83) {
        this.d83 = d83;
    }

    private Timestamp d84;

    @Basic
    @javax.persistence.Column(name = "D84", nullable = true, insertable = true, updatable = true)
    public Timestamp getD84() {
        return d84;
    }

    public void setD84(Timestamp d84) {
        this.d84 = d84;
    }

    private Timestamp d85;

    @Basic
    @javax.persistence.Column(name = "D85", nullable = true, insertable = true, updatable = true)
    public Timestamp getD85() {
        return d85;
    }

    public void setD85(Timestamp d85) {
        this.d85 = d85;
    }

    private Timestamp d86;

    @Basic
    @javax.persistence.Column(name = "D86", nullable = true, insertable = true, updatable = true)
    public Timestamp getD86() {
        return d86;
    }

    public void setD86(Timestamp d86) {
        this.d86 = d86;
    }

    private Timestamp d87;

    @Basic
    @javax.persistence.Column(name = "D87", nullable = true, insertable = true, updatable = true)
    public Timestamp getD87() {
        return d87;
    }

    public void setD87(Timestamp d87) {
        this.d87 = d87;
    }

    private Timestamp d88;

    @Basic
    @javax.persistence.Column(name = "D88", nullable = true, insertable = true, updatable = true)
    public Timestamp getD88() {
        return d88;
    }

    public void setD88(Timestamp d88) {
        this.d88 = d88;
    }

    private Timestamp d89;

    @Basic
    @javax.persistence.Column(name = "D89", nullable = true, insertable = true, updatable = true)
    public Timestamp getD89() {
        return d89;
    }

    public void setD89(Timestamp d89) {
        this.d89 = d89;
    }

    private Timestamp d90;

    @Basic
    @javax.persistence.Column(name = "D90", nullable = true, insertable = true, updatable = true)
    public Timestamp getD90() {
        return d90;
    }

    public void setD90(Timestamp d90) {
        this.d90 = d90;
    }

    private Timestamp d91;

    @Basic
    @javax.persistence.Column(name = "D91", nullable = true, insertable = true, updatable = true)
    public Timestamp getD91() {
        return d91;
    }

    public void setD91(Timestamp d91) {
        this.d91 = d91;
    }

    private Timestamp d92;

    @Basic
    @javax.persistence.Column(name = "D92", nullable = true, insertable = true, updatable = true)
    public Timestamp getD92() {
        return d92;
    }

    public void setD92(Timestamp d92) {
        this.d92 = d92;
    }

    private Timestamp d93;

    @Basic
    @javax.persistence.Column(name = "D93", nullable = true, insertable = true, updatable = true)
    public Timestamp getD93() {
        return d93;
    }

    public void setD93(Timestamp d93) {
        this.d93 = d93;
    }

    private Timestamp d94;

    @Basic
    @javax.persistence.Column(name = "D94", nullable = true, insertable = true, updatable = true)
    public Timestamp getD94() {
        return d94;
    }

    public void setD94(Timestamp d94) {
        this.d94 = d94;
    }

    private Timestamp d95;

    @Basic
    @javax.persistence.Column(name = "D95", nullable = true, insertable = true, updatable = true)
    public Timestamp getD95() {
        return d95;
    }

    public void setD95(Timestamp d95) {
        this.d95 = d95;
    }

    private Timestamp d96;

    @Basic
    @javax.persistence.Column(name = "D96", nullable = true, insertable = true, updatable = true)
    public Timestamp getD96() {
        return d96;
    }

    public void setD96(Timestamp d96) {
        this.d96 = d96;
    }

    private Timestamp d97;

    @Basic
    @javax.persistence.Column(name = "D97", nullable = true, insertable = true, updatable = true)
    public Timestamp getD97() {
        return d97;
    }

    public void setD97(Timestamp d97) {
        this.d97 = d97;
    }

    private Timestamp d98;

    @Basic
    @javax.persistence.Column(name = "D98", nullable = true, insertable = true, updatable = true)
    public Timestamp getD98() {
        return d98;
    }

    public void setD98(Timestamp d98) {
        this.d98 = d98;
    }

    private Timestamp d99;

    @Basic
    @javax.persistence.Column(name = "D99", nullable = true, insertable = true, updatable = true)
    public Timestamp getD99() {
        return d99;
    }

    public void setD99(Timestamp d99) {
        this.d99 = d99;
    }

    private String c81;

    @Basic
    @javax.persistence.Column(name = "C81", nullable = true, insertable = true, updatable = true)
    public String getC81() {
        return c81;
    }

    public void setC81(String c81) {
        this.c81 = c81;
    }

    private String c82;

    @Basic
    @javax.persistence.Column(name = "C82", nullable = true, insertable = true, updatable = true)
    public String getC82() {
        return c82;
    }

    public void setC82(String c82) {
        this.c82 = c82;
    }

    private String c83;

    @Basic
    @javax.persistence.Column(name = "C83", nullable = true, insertable = true, updatable = true)
    public String getC83() {
        return c83;
    }

    public void setC83(String c83) {
        this.c83 = c83;
    }

    private String c84;

    @Basic
    @javax.persistence.Column(name = "C84", nullable = true, insertable = true, updatable = true)
    public String getC84() {
        return c84;
    }

    public void setC84(String c84) {
        this.c84 = c84;
    }

    private String c85;

    @Basic
    @javax.persistence.Column(name = "C85", nullable = true, insertable = true, updatable = true)
    public String getC85() {
        return c85;
    }

    public void setC85(String c85) {
        this.c85 = c85;
    }

    private String c86;

    @Basic
    @javax.persistence.Column(name = "C86", nullable = true, insertable = true, updatable = true)
    public String getC86() {
        return c86;
    }

    public void setC86(String c86) {
        this.c86 = c86;
    }

    private String c87;

    @Basic
    @javax.persistence.Column(name = "C87", nullable = true, insertable = true, updatable = true)
    public String getC87() {
        return c87;
    }

    public void setC87(String c87) {
        this.c87 = c87;
    }

    private String c88;

    @Basic
    @javax.persistence.Column(name = "C88", nullable = true, insertable = true, updatable = true)
    public String getC88() {
        return c88;
    }

    public void setC88(String c88) {
        this.c88 = c88;
    }

    private String c89;

    @Basic
    @javax.persistence.Column(name = "C89", nullable = true, insertable = true, updatable = true)
    public String getC89() {
        return c89;
    }

    public void setC89(String c89) {
        this.c89 = c89;
    }

    private String c90;

    @Basic
    @javax.persistence.Column(name = "C90", nullable = true, insertable = true, updatable = true)
    public String getC90() {
        return c90;
    }

    public void setC90(String c90) {
        this.c90 = c90;
    }

    private String c91;

    @Basic
    @javax.persistence.Column(name = "C91", nullable = true, insertable = true, updatable = true)
    public String getC91() {
        return c91;
    }

    public void setC91(String c91) {
        this.c91 = c91;
    }

    private String c92;

    @Basic
    @javax.persistence.Column(name = "C92", nullable = true, insertable = true, updatable = true)
    public String getC92() {
        return c92;
    }

    public void setC92(String c92) {
        this.c92 = c92;
    }

    private String c93;

    @Basic
    @javax.persistence.Column(name = "C93", nullable = true, insertable = true, updatable = true)
    public String getC93() {
        return c93;
    }

    public void setC93(String c93) {
        this.c93 = c93;
    }

    private String c94;

    @Basic
    @javax.persistence.Column(name = "C94", nullable = true, insertable = true, updatable = true)
    public String getC94() {
        return c94;
    }

    public void setC94(String c94) {
        this.c94 = c94;
    }

    private String c95;

    @Basic
    @javax.persistence.Column(name = "C95", nullable = true, insertable = true, updatable = true)
    public String getC95() {
        return c95;
    }

    public void setC95(String c95) {
        this.c95 = c95;
    }

    private String c96;

    @Basic
    @javax.persistence.Column(name = "C96", nullable = true, insertable = true, updatable = true)
    public String getC96() {
        return c96;
    }

    public void setC96(String c96) {
        this.c96 = c96;
    }

    private String c97;

    @Basic
    @javax.persistence.Column(name = "C97", nullable = true, insertable = true, updatable = true)
    public String getC97() {
        return c97;
    }

    public void setC97(String c97) {
        this.c97 = c97;
    }

    private String c98;

    @Basic
    @javax.persistence.Column(name = "C98", nullable = true, insertable = true, updatable = true)
    public String getC98() {
        return c98;
    }

    public void setC98(String c98) {
        this.c98 = c98;
    }

    private String c99;

    @Basic
    @javax.persistence.Column(name = "C99", nullable = true, insertable = true, updatable = true)
    public String getC99() {
        return c99;
    }

    public void setC99(String c99) {
        this.c99 = c99;
    }

    private String conteúdo;

    @Basic
    @javax.persistence.Column(name = "Conteúdo", nullable = true, insertable = true, updatable = true)
    public String getConteúdo() {
        return conteúdo;
    }

    public void setConteúdo(String conteúdo) {
        this.conteúdo = conteúdo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAulaConteudo that = (AcdAulaConteudo) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (aulaConteúdoId != that.aulaConteúdoId) return false;
        if (bimestre != that.bimestre) return false;
        if (codCurso != that.codCurso) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codUnidade != that.codUnidade) return false;
        if (c01 != null ? !c01.equals(that.c01) : that.c01 != null) return false;
        if (c02 != null ? !c02.equals(that.c02) : that.c02 != null) return false;
        if (c03 != null ? !c03.equals(that.c03) : that.c03 != null) return false;
        if (c04 != null ? !c04.equals(that.c04) : that.c04 != null) return false;
        if (c05 != null ? !c05.equals(that.c05) : that.c05 != null) return false;
        if (c06 != null ? !c06.equals(that.c06) : that.c06 != null) return false;
        if (c07 != null ? !c07.equals(that.c07) : that.c07 != null) return false;
        if (c08 != null ? !c08.equals(that.c08) : that.c08 != null) return false;
        if (c09 != null ? !c09.equals(that.c09) : that.c09 != null) return false;
        if (c10 != null ? !c10.equals(that.c10) : that.c10 != null) return false;
        if (c11 != null ? !c11.equals(that.c11) : that.c11 != null) return false;
        if (c12 != null ? !c12.equals(that.c12) : that.c12 != null) return false;
        if (c13 != null ? !c13.equals(that.c13) : that.c13 != null) return false;
        if (c14 != null ? !c14.equals(that.c14) : that.c14 != null) return false;
        if (c15 != null ? !c15.equals(that.c15) : that.c15 != null) return false;
        if (c16 != null ? !c16.equals(that.c16) : that.c16 != null) return false;
        if (c17 != null ? !c17.equals(that.c17) : that.c17 != null) return false;
        if (c18 != null ? !c18.equals(that.c18) : that.c18 != null) return false;
        if (c19 != null ? !c19.equals(that.c19) : that.c19 != null) return false;
        if (c20 != null ? !c20.equals(that.c20) : that.c20 != null) return false;
        if (c21 != null ? !c21.equals(that.c21) : that.c21 != null) return false;
        if (c22 != null ? !c22.equals(that.c22) : that.c22 != null) return false;
        if (c23 != null ? !c23.equals(that.c23) : that.c23 != null) return false;
        if (c24 != null ? !c24.equals(that.c24) : that.c24 != null) return false;
        if (c25 != null ? !c25.equals(that.c25) : that.c25 != null) return false;
        if (c26 != null ? !c26.equals(that.c26) : that.c26 != null) return false;
        if (c27 != null ? !c27.equals(that.c27) : that.c27 != null) return false;
        if (c28 != null ? !c28.equals(that.c28) : that.c28 != null) return false;
        if (c29 != null ? !c29.equals(that.c29) : that.c29 != null) return false;
        if (c30 != null ? !c30.equals(that.c30) : that.c30 != null) return false;
        if (c31 != null ? !c31.equals(that.c31) : that.c31 != null) return false;
        if (c32 != null ? !c32.equals(that.c32) : that.c32 != null) return false;
        if (c33 != null ? !c33.equals(that.c33) : that.c33 != null) return false;
        if (c34 != null ? !c34.equals(that.c34) : that.c34 != null) return false;
        if (c35 != null ? !c35.equals(that.c35) : that.c35 != null) return false;
        if (c36 != null ? !c36.equals(that.c36) : that.c36 != null) return false;
        if (c37 != null ? !c37.equals(that.c37) : that.c37 != null) return false;
        if (c38 != null ? !c38.equals(that.c38) : that.c38 != null) return false;
        if (c39 != null ? !c39.equals(that.c39) : that.c39 != null) return false;
        if (c40 != null ? !c40.equals(that.c40) : that.c40 != null) return false;
        if (c41 != null ? !c41.equals(that.c41) : that.c41 != null) return false;
        if (c42 != null ? !c42.equals(that.c42) : that.c42 != null) return false;
        if (c43 != null ? !c43.equals(that.c43) : that.c43 != null) return false;
        if (c44 != null ? !c44.equals(that.c44) : that.c44 != null) return false;
        if (c45 != null ? !c45.equals(that.c45) : that.c45 != null) return false;
        if (c46 != null ? !c46.equals(that.c46) : that.c46 != null) return false;
        if (c47 != null ? !c47.equals(that.c47) : that.c47 != null) return false;
        if (c48 != null ? !c48.equals(that.c48) : that.c48 != null) return false;
        if (c49 != null ? !c49.equals(that.c49) : that.c49 != null) return false;
        if (c50 != null ? !c50.equals(that.c50) : that.c50 != null) return false;
        if (c51 != null ? !c51.equals(that.c51) : that.c51 != null) return false;
        if (c52 != null ? !c52.equals(that.c52) : that.c52 != null) return false;
        if (c53 != null ? !c53.equals(that.c53) : that.c53 != null) return false;
        if (c54 != null ? !c54.equals(that.c54) : that.c54 != null) return false;
        if (c55 != null ? !c55.equals(that.c55) : that.c55 != null) return false;
        if (c56 != null ? !c56.equals(that.c56) : that.c56 != null) return false;
        if (c57 != null ? !c57.equals(that.c57) : that.c57 != null) return false;
        if (c58 != null ? !c58.equals(that.c58) : that.c58 != null) return false;
        if (c59 != null ? !c59.equals(that.c59) : that.c59 != null) return false;
        if (c60 != null ? !c60.equals(that.c60) : that.c60 != null) return false;
        if (c61 != null ? !c61.equals(that.c61) : that.c61 != null) return false;
        if (c62 != null ? !c62.equals(that.c62) : that.c62 != null) return false;
        if (c63 != null ? !c63.equals(that.c63) : that.c63 != null) return false;
        if (c64 != null ? !c64.equals(that.c64) : that.c64 != null) return false;
        if (c65 != null ? !c65.equals(that.c65) : that.c65 != null) return false;
        if (c66 != null ? !c66.equals(that.c66) : that.c66 != null) return false;
        if (c67 != null ? !c67.equals(that.c67) : that.c67 != null) return false;
        if (c68 != null ? !c68.equals(that.c68) : that.c68 != null) return false;
        if (c69 != null ? !c69.equals(that.c69) : that.c69 != null) return false;
        if (c70 != null ? !c70.equals(that.c70) : that.c70 != null) return false;
        if (c71 != null ? !c71.equals(that.c71) : that.c71 != null) return false;
        if (c72 != null ? !c72.equals(that.c72) : that.c72 != null) return false;
        if (c73 != null ? !c73.equals(that.c73) : that.c73 != null) return false;
        if (c74 != null ? !c74.equals(that.c74) : that.c74 != null) return false;
        if (c75 != null ? !c75.equals(that.c75) : that.c75 != null) return false;
        if (c76 != null ? !c76.equals(that.c76) : that.c76 != null) return false;
        if (c77 != null ? !c77.equals(that.c77) : that.c77 != null) return false;
        if (c78 != null ? !c78.equals(that.c78) : that.c78 != null) return false;
        if (c79 != null ? !c79.equals(that.c79) : that.c79 != null) return false;
        if (c80 != null ? !c80.equals(that.c80) : that.c80 != null) return false;
        if (c81 != null ? !c81.equals(that.c81) : that.c81 != null) return false;
        if (c82 != null ? !c82.equals(that.c82) : that.c82 != null) return false;
        if (c83 != null ? !c83.equals(that.c83) : that.c83 != null) return false;
        if (c84 != null ? !c84.equals(that.c84) : that.c84 != null) return false;
        if (c85 != null ? !c85.equals(that.c85) : that.c85 != null) return false;
        if (c86 != null ? !c86.equals(that.c86) : that.c86 != null) return false;
        if (c87 != null ? !c87.equals(that.c87) : that.c87 != null) return false;
        if (c88 != null ? !c88.equals(that.c88) : that.c88 != null) return false;
        if (c89 != null ? !c89.equals(that.c89) : that.c89 != null) return false;
        if (c90 != null ? !c90.equals(that.c90) : that.c90 != null) return false;
        if (c91 != null ? !c91.equals(that.c91) : that.c91 != null) return false;
        if (c92 != null ? !c92.equals(that.c92) : that.c92 != null) return false;
        if (c93 != null ? !c93.equals(that.c93) : that.c93 != null) return false;
        if (c94 != null ? !c94.equals(that.c94) : that.c94 != null) return false;
        if (c95 != null ? !c95.equals(that.c95) : that.c95 != null) return false;
        if (c96 != null ? !c96.equals(that.c96) : that.c96 != null) return false;
        if (c97 != null ? !c97.equals(that.c97) : that.c97 != null) return false;
        if (c98 != null ? !c98.equals(that.c98) : that.c98 != null) return false;
        if (c99 != null ? !c99.equals(that.c99) : that.c99 != null) return false;
        if (codDisciplinaPrincipal != null ? !codDisciplinaPrincipal.equals(that.codDisciplinaPrincipal) : that.codDisciplinaPrincipal != null)
            return false;
        if (codFórmula != null ? !codFórmula.equals(that.codFórmula) : that.codFórmula != null) return false;
        if (conteúdo != null ? !conteúdo.equals(that.conteúdo) : that.conteúdo != null) return false;
        if (d01 != null ? !d01.equals(that.d01) : that.d01 != null) return false;
        if (d02 != null ? !d02.equals(that.d02) : that.d02 != null) return false;
        if (d03 != null ? !d03.equals(that.d03) : that.d03 != null) return false;
        if (d04 != null ? !d04.equals(that.d04) : that.d04 != null) return false;
        if (d05 != null ? !d05.equals(that.d05) : that.d05 != null) return false;
        if (d06 != null ? !d06.equals(that.d06) : that.d06 != null) return false;
        if (d07 != null ? !d07.equals(that.d07) : that.d07 != null) return false;
        if (d08 != null ? !d08.equals(that.d08) : that.d08 != null) return false;
        if (d09 != null ? !d09.equals(that.d09) : that.d09 != null) return false;
        if (d10 != null ? !d10.equals(that.d10) : that.d10 != null) return false;
        if (d11 != null ? !d11.equals(that.d11) : that.d11 != null) return false;
        if (d12 != null ? !d12.equals(that.d12) : that.d12 != null) return false;
        if (d13 != null ? !d13.equals(that.d13) : that.d13 != null) return false;
        if (d14 != null ? !d14.equals(that.d14) : that.d14 != null) return false;
        if (d15 != null ? !d15.equals(that.d15) : that.d15 != null) return false;
        if (d16 != null ? !d16.equals(that.d16) : that.d16 != null) return false;
        if (d17 != null ? !d17.equals(that.d17) : that.d17 != null) return false;
        if (d18 != null ? !d18.equals(that.d18) : that.d18 != null) return false;
        if (d19 != null ? !d19.equals(that.d19) : that.d19 != null) return false;
        if (d20 != null ? !d20.equals(that.d20) : that.d20 != null) return false;
        if (d21 != null ? !d21.equals(that.d21) : that.d21 != null) return false;
        if (d22 != null ? !d22.equals(that.d22) : that.d22 != null) return false;
        if (d23 != null ? !d23.equals(that.d23) : that.d23 != null) return false;
        if (d24 != null ? !d24.equals(that.d24) : that.d24 != null) return false;
        if (d25 != null ? !d25.equals(that.d25) : that.d25 != null) return false;
        if (d26 != null ? !d26.equals(that.d26) : that.d26 != null) return false;
        if (d27 != null ? !d27.equals(that.d27) : that.d27 != null) return false;
        if (d28 != null ? !d28.equals(that.d28) : that.d28 != null) return false;
        if (d29 != null ? !d29.equals(that.d29) : that.d29 != null) return false;
        if (d30 != null ? !d30.equals(that.d30) : that.d30 != null) return false;
        if (d31 != null ? !d31.equals(that.d31) : that.d31 != null) return false;
        if (d32 != null ? !d32.equals(that.d32) : that.d32 != null) return false;
        if (d33 != null ? !d33.equals(that.d33) : that.d33 != null) return false;
        if (d34 != null ? !d34.equals(that.d34) : that.d34 != null) return false;
        if (d35 != null ? !d35.equals(that.d35) : that.d35 != null) return false;
        if (d36 != null ? !d36.equals(that.d36) : that.d36 != null) return false;
        if (d37 != null ? !d37.equals(that.d37) : that.d37 != null) return false;
        if (d38 != null ? !d38.equals(that.d38) : that.d38 != null) return false;
        if (d39 != null ? !d39.equals(that.d39) : that.d39 != null) return false;
        if (d40 != null ? !d40.equals(that.d40) : that.d40 != null) return false;
        if (d41 != null ? !d41.equals(that.d41) : that.d41 != null) return false;
        if (d42 != null ? !d42.equals(that.d42) : that.d42 != null) return false;
        if (d43 != null ? !d43.equals(that.d43) : that.d43 != null) return false;
        if (d44 != null ? !d44.equals(that.d44) : that.d44 != null) return false;
        if (d45 != null ? !d45.equals(that.d45) : that.d45 != null) return false;
        if (d46 != null ? !d46.equals(that.d46) : that.d46 != null) return false;
        if (d47 != null ? !d47.equals(that.d47) : that.d47 != null) return false;
        if (d48 != null ? !d48.equals(that.d48) : that.d48 != null) return false;
        if (d49 != null ? !d49.equals(that.d49) : that.d49 != null) return false;
        if (d50 != null ? !d50.equals(that.d50) : that.d50 != null) return false;
        if (d51 != null ? !d51.equals(that.d51) : that.d51 != null) return false;
        if (d52 != null ? !d52.equals(that.d52) : that.d52 != null) return false;
        if (d53 != null ? !d53.equals(that.d53) : that.d53 != null) return false;
        if (d54 != null ? !d54.equals(that.d54) : that.d54 != null) return false;
        if (d55 != null ? !d55.equals(that.d55) : that.d55 != null) return false;
        if (d56 != null ? !d56.equals(that.d56) : that.d56 != null) return false;
        if (d57 != null ? !d57.equals(that.d57) : that.d57 != null) return false;
        if (d58 != null ? !d58.equals(that.d58) : that.d58 != null) return false;
        if (d59 != null ? !d59.equals(that.d59) : that.d59 != null) return false;
        if (d60 != null ? !d60.equals(that.d60) : that.d60 != null) return false;
        if (d61 != null ? !d61.equals(that.d61) : that.d61 != null) return false;
        if (d62 != null ? !d62.equals(that.d62) : that.d62 != null) return false;
        if (d63 != null ? !d63.equals(that.d63) : that.d63 != null) return false;
        if (d64 != null ? !d64.equals(that.d64) : that.d64 != null) return false;
        if (d65 != null ? !d65.equals(that.d65) : that.d65 != null) return false;
        if (d66 != null ? !d66.equals(that.d66) : that.d66 != null) return false;
        if (d67 != null ? !d67.equals(that.d67) : that.d67 != null) return false;
        if (d68 != null ? !d68.equals(that.d68) : that.d68 != null) return false;
        if (d69 != null ? !d69.equals(that.d69) : that.d69 != null) return false;
        if (d70 != null ? !d70.equals(that.d70) : that.d70 != null) return false;
        if (d71 != null ? !d71.equals(that.d71) : that.d71 != null) return false;
        if (d72 != null ? !d72.equals(that.d72) : that.d72 != null) return false;
        if (d73 != null ? !d73.equals(that.d73) : that.d73 != null) return false;
        if (d74 != null ? !d74.equals(that.d74) : that.d74 != null) return false;
        if (d75 != null ? !d75.equals(that.d75) : that.d75 != null) return false;
        if (d76 != null ? !d76.equals(that.d76) : that.d76 != null) return false;
        if (d77 != null ? !d77.equals(that.d77) : that.d77 != null) return false;
        if (d78 != null ? !d78.equals(that.d78) : that.d78 != null) return false;
        if (d79 != null ? !d79.equals(that.d79) : that.d79 != null) return false;
        if (d80 != null ? !d80.equals(that.d80) : that.d80 != null) return false;
        if (d81 != null ? !d81.equals(that.d81) : that.d81 != null) return false;
        if (d82 != null ? !d82.equals(that.d82) : that.d82 != null) return false;
        if (d83 != null ? !d83.equals(that.d83) : that.d83 != null) return false;
        if (d84 != null ? !d84.equals(that.d84) : that.d84 != null) return false;
        if (d85 != null ? !d85.equals(that.d85) : that.d85 != null) return false;
        if (d86 != null ? !d86.equals(that.d86) : that.d86 != null) return false;
        if (d87 != null ? !d87.equals(that.d87) : that.d87 != null) return false;
        if (d88 != null ? !d88.equals(that.d88) : that.d88 != null) return false;
        if (d89 != null ? !d89.equals(that.d89) : that.d89 != null) return false;
        if (d90 != null ? !d90.equals(that.d90) : that.d90 != null) return false;
        if (d91 != null ? !d91.equals(that.d91) : that.d91 != null) return false;
        if (d92 != null ? !d92.equals(that.d92) : that.d92 != null) return false;
        if (d93 != null ? !d93.equals(that.d93) : that.d93 != null) return false;
        if (d94 != null ? !d94.equals(that.d94) : that.d94 != null) return false;
        if (d95 != null ? !d95.equals(that.d95) : that.d95 != null) return false;
        if (d96 != null ? !d96.equals(that.d96) : that.d96 != null) return false;
        if (d97 != null ? !d97.equals(that.d97) : that.d97 != null) return false;
        if (d98 != null ? !d98.equals(that.d98) : that.d98 != null) return false;
        if (d99 != null ? !d99.equals(that.d99) : that.d99 != null) return false;
        if (turma != null ? !turma.equals(that.turma) : that.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (aulaConteúdoId ^ (aulaConteúdoId >>> 32));
        result = 31 * result + codDisciplina;
        result = 31 * result + anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + codCurso;
        result = 31 * result + (int) bimestre;
        result = 31 * result + (d01 != null ? d01.hashCode() : 0);
        result = 31 * result + (d02 != null ? d02.hashCode() : 0);
        result = 31 * result + (d03 != null ? d03.hashCode() : 0);
        result = 31 * result + (d04 != null ? d04.hashCode() : 0);
        result = 31 * result + (d05 != null ? d05.hashCode() : 0);
        result = 31 * result + (d06 != null ? d06.hashCode() : 0);
        result = 31 * result + (d07 != null ? d07.hashCode() : 0);
        result = 31 * result + (d08 != null ? d08.hashCode() : 0);
        result = 31 * result + (d09 != null ? d09.hashCode() : 0);
        result = 31 * result + (d10 != null ? d10.hashCode() : 0);
        result = 31 * result + (d11 != null ? d11.hashCode() : 0);
        result = 31 * result + (d12 != null ? d12.hashCode() : 0);
        result = 31 * result + (d13 != null ? d13.hashCode() : 0);
        result = 31 * result + (d14 != null ? d14.hashCode() : 0);
        result = 31 * result + (d15 != null ? d15.hashCode() : 0);
        result = 31 * result + (d16 != null ? d16.hashCode() : 0);
        result = 31 * result + (d17 != null ? d17.hashCode() : 0);
        result = 31 * result + (d18 != null ? d18.hashCode() : 0);
        result = 31 * result + (d19 != null ? d19.hashCode() : 0);
        result = 31 * result + (d20 != null ? d20.hashCode() : 0);
        result = 31 * result + (d21 != null ? d21.hashCode() : 0);
        result = 31 * result + (d22 != null ? d22.hashCode() : 0);
        result = 31 * result + (d23 != null ? d23.hashCode() : 0);
        result = 31 * result + (d24 != null ? d24.hashCode() : 0);
        result = 31 * result + (d25 != null ? d25.hashCode() : 0);
        result = 31 * result + (d26 != null ? d26.hashCode() : 0);
        result = 31 * result + (d27 != null ? d27.hashCode() : 0);
        result = 31 * result + (d28 != null ? d28.hashCode() : 0);
        result = 31 * result + (d29 != null ? d29.hashCode() : 0);
        result = 31 * result + (d30 != null ? d30.hashCode() : 0);
        result = 31 * result + (d31 != null ? d31.hashCode() : 0);
        result = 31 * result + (d32 != null ? d32.hashCode() : 0);
        result = 31 * result + (d33 != null ? d33.hashCode() : 0);
        result = 31 * result + (d34 != null ? d34.hashCode() : 0);
        result = 31 * result + (d35 != null ? d35.hashCode() : 0);
        result = 31 * result + (d36 != null ? d36.hashCode() : 0);
        result = 31 * result + (d37 != null ? d37.hashCode() : 0);
        result = 31 * result + (d38 != null ? d38.hashCode() : 0);
        result = 31 * result + (d39 != null ? d39.hashCode() : 0);
        result = 31 * result + (d40 != null ? d40.hashCode() : 0);
        result = 31 * result + (d41 != null ? d41.hashCode() : 0);
        result = 31 * result + (d42 != null ? d42.hashCode() : 0);
        result = 31 * result + (d43 != null ? d43.hashCode() : 0);
        result = 31 * result + (d44 != null ? d44.hashCode() : 0);
        result = 31 * result + (d45 != null ? d45.hashCode() : 0);
        result = 31 * result + (d46 != null ? d46.hashCode() : 0);
        result = 31 * result + (d47 != null ? d47.hashCode() : 0);
        result = 31 * result + (d48 != null ? d48.hashCode() : 0);
        result = 31 * result + (d49 != null ? d49.hashCode() : 0);
        result = 31 * result + (d50 != null ? d50.hashCode() : 0);
        result = 31 * result + (d51 != null ? d51.hashCode() : 0);
        result = 31 * result + (d52 != null ? d52.hashCode() : 0);
        result = 31 * result + (d53 != null ? d53.hashCode() : 0);
        result = 31 * result + (d54 != null ? d54.hashCode() : 0);
        result = 31 * result + (d55 != null ? d55.hashCode() : 0);
        result = 31 * result + (d56 != null ? d56.hashCode() : 0);
        result = 31 * result + (d57 != null ? d57.hashCode() : 0);
        result = 31 * result + (d58 != null ? d58.hashCode() : 0);
        result = 31 * result + (d59 != null ? d59.hashCode() : 0);
        result = 31 * result + (d60 != null ? d60.hashCode() : 0);
        result = 31 * result + (d61 != null ? d61.hashCode() : 0);
        result = 31 * result + (d62 != null ? d62.hashCode() : 0);
        result = 31 * result + (d63 != null ? d63.hashCode() : 0);
        result = 31 * result + (d64 != null ? d64.hashCode() : 0);
        result = 31 * result + (d65 != null ? d65.hashCode() : 0);
        result = 31 * result + (d66 != null ? d66.hashCode() : 0);
        result = 31 * result + (d67 != null ? d67.hashCode() : 0);
        result = 31 * result + (d68 != null ? d68.hashCode() : 0);
        result = 31 * result + (d69 != null ? d69.hashCode() : 0);
        result = 31 * result + (d70 != null ? d70.hashCode() : 0);
        result = 31 * result + (d71 != null ? d71.hashCode() : 0);
        result = 31 * result + (d72 != null ? d72.hashCode() : 0);
        result = 31 * result + (d73 != null ? d73.hashCode() : 0);
        result = 31 * result + (d74 != null ? d74.hashCode() : 0);
        result = 31 * result + (d75 != null ? d75.hashCode() : 0);
        result = 31 * result + (d76 != null ? d76.hashCode() : 0);
        result = 31 * result + (d77 != null ? d77.hashCode() : 0);
        result = 31 * result + (d78 != null ? d78.hashCode() : 0);
        result = 31 * result + (d79 != null ? d79.hashCode() : 0);
        result = 31 * result + (d80 != null ? d80.hashCode() : 0);
        result = 31 * result + (c01 != null ? c01.hashCode() : 0);
        result = 31 * result + (c02 != null ? c02.hashCode() : 0);
        result = 31 * result + (c03 != null ? c03.hashCode() : 0);
        result = 31 * result + (c04 != null ? c04.hashCode() : 0);
        result = 31 * result + (c05 != null ? c05.hashCode() : 0);
        result = 31 * result + (c06 != null ? c06.hashCode() : 0);
        result = 31 * result + (c07 != null ? c07.hashCode() : 0);
        result = 31 * result + (c08 != null ? c08.hashCode() : 0);
        result = 31 * result + (c09 != null ? c09.hashCode() : 0);
        result = 31 * result + (c10 != null ? c10.hashCode() : 0);
        result = 31 * result + (c11 != null ? c11.hashCode() : 0);
        result = 31 * result + (c12 != null ? c12.hashCode() : 0);
        result = 31 * result + (c13 != null ? c13.hashCode() : 0);
        result = 31 * result + (c14 != null ? c14.hashCode() : 0);
        result = 31 * result + (c15 != null ? c15.hashCode() : 0);
        result = 31 * result + (c16 != null ? c16.hashCode() : 0);
        result = 31 * result + (c17 != null ? c17.hashCode() : 0);
        result = 31 * result + (c18 != null ? c18.hashCode() : 0);
        result = 31 * result + (c19 != null ? c19.hashCode() : 0);
        result = 31 * result + (c20 != null ? c20.hashCode() : 0);
        result = 31 * result + (c21 != null ? c21.hashCode() : 0);
        result = 31 * result + (c22 != null ? c22.hashCode() : 0);
        result = 31 * result + (c23 != null ? c23.hashCode() : 0);
        result = 31 * result + (c24 != null ? c24.hashCode() : 0);
        result = 31 * result + (c25 != null ? c25.hashCode() : 0);
        result = 31 * result + (c26 != null ? c26.hashCode() : 0);
        result = 31 * result + (c27 != null ? c27.hashCode() : 0);
        result = 31 * result + (c28 != null ? c28.hashCode() : 0);
        result = 31 * result + (c29 != null ? c29.hashCode() : 0);
        result = 31 * result + (c30 != null ? c30.hashCode() : 0);
        result = 31 * result + (c31 != null ? c31.hashCode() : 0);
        result = 31 * result + (c32 != null ? c32.hashCode() : 0);
        result = 31 * result + (c33 != null ? c33.hashCode() : 0);
        result = 31 * result + (c34 != null ? c34.hashCode() : 0);
        result = 31 * result + (c35 != null ? c35.hashCode() : 0);
        result = 31 * result + (c36 != null ? c36.hashCode() : 0);
        result = 31 * result + (c37 != null ? c37.hashCode() : 0);
        result = 31 * result + (c38 != null ? c38.hashCode() : 0);
        result = 31 * result + (c39 != null ? c39.hashCode() : 0);
        result = 31 * result + (c40 != null ? c40.hashCode() : 0);
        result = 31 * result + (c41 != null ? c41.hashCode() : 0);
        result = 31 * result + (c42 != null ? c42.hashCode() : 0);
        result = 31 * result + (c43 != null ? c43.hashCode() : 0);
        result = 31 * result + (c44 != null ? c44.hashCode() : 0);
        result = 31 * result + (c45 != null ? c45.hashCode() : 0);
        result = 31 * result + (c46 != null ? c46.hashCode() : 0);
        result = 31 * result + (c47 != null ? c47.hashCode() : 0);
        result = 31 * result + (c48 != null ? c48.hashCode() : 0);
        result = 31 * result + (c49 != null ? c49.hashCode() : 0);
        result = 31 * result + (c50 != null ? c50.hashCode() : 0);
        result = 31 * result + (c51 != null ? c51.hashCode() : 0);
        result = 31 * result + (c52 != null ? c52.hashCode() : 0);
        result = 31 * result + (c53 != null ? c53.hashCode() : 0);
        result = 31 * result + (c54 != null ? c54.hashCode() : 0);
        result = 31 * result + (c55 != null ? c55.hashCode() : 0);
        result = 31 * result + (c56 != null ? c56.hashCode() : 0);
        result = 31 * result + (c57 != null ? c57.hashCode() : 0);
        result = 31 * result + (c58 != null ? c58.hashCode() : 0);
        result = 31 * result + (c59 != null ? c59.hashCode() : 0);
        result = 31 * result + (c60 != null ? c60.hashCode() : 0);
        result = 31 * result + (c61 != null ? c61.hashCode() : 0);
        result = 31 * result + (c62 != null ? c62.hashCode() : 0);
        result = 31 * result + (c63 != null ? c63.hashCode() : 0);
        result = 31 * result + (c64 != null ? c64.hashCode() : 0);
        result = 31 * result + (c65 != null ? c65.hashCode() : 0);
        result = 31 * result + (c66 != null ? c66.hashCode() : 0);
        result = 31 * result + (c67 != null ? c67.hashCode() : 0);
        result = 31 * result + (c68 != null ? c68.hashCode() : 0);
        result = 31 * result + (c69 != null ? c69.hashCode() : 0);
        result = 31 * result + (c70 != null ? c70.hashCode() : 0);
        result = 31 * result + (c71 != null ? c71.hashCode() : 0);
        result = 31 * result + (c72 != null ? c72.hashCode() : 0);
        result = 31 * result + (c73 != null ? c73.hashCode() : 0);
        result = 31 * result + (c74 != null ? c74.hashCode() : 0);
        result = 31 * result + (c75 != null ? c75.hashCode() : 0);
        result = 31 * result + (c76 != null ? c76.hashCode() : 0);
        result = 31 * result + (c77 != null ? c77.hashCode() : 0);
        result = 31 * result + (c78 != null ? c78.hashCode() : 0);
        result = 31 * result + (c79 != null ? c79.hashCode() : 0);
        result = 31 * result + (c80 != null ? c80.hashCode() : 0);
        result = 31 * result + (codDisciplinaPrincipal != null ? codDisciplinaPrincipal.hashCode() : 0);
        result = 31 * result + (codFórmula != null ? codFórmula.hashCode() : 0);
        result = 31 * result + (d81 != null ? d81.hashCode() : 0);
        result = 31 * result + (d82 != null ? d82.hashCode() : 0);
        result = 31 * result + (d83 != null ? d83.hashCode() : 0);
        result = 31 * result + (d84 != null ? d84.hashCode() : 0);
        result = 31 * result + (d85 != null ? d85.hashCode() : 0);
        result = 31 * result + (d86 != null ? d86.hashCode() : 0);
        result = 31 * result + (d87 != null ? d87.hashCode() : 0);
        result = 31 * result + (d88 != null ? d88.hashCode() : 0);
        result = 31 * result + (d89 != null ? d89.hashCode() : 0);
        result = 31 * result + (d90 != null ? d90.hashCode() : 0);
        result = 31 * result + (d91 != null ? d91.hashCode() : 0);
        result = 31 * result + (d92 != null ? d92.hashCode() : 0);
        result = 31 * result + (d93 != null ? d93.hashCode() : 0);
        result = 31 * result + (d94 != null ? d94.hashCode() : 0);
        result = 31 * result + (d95 != null ? d95.hashCode() : 0);
        result = 31 * result + (d96 != null ? d96.hashCode() : 0);
        result = 31 * result + (d97 != null ? d97.hashCode() : 0);
        result = 31 * result + (d98 != null ? d98.hashCode() : 0);
        result = 31 * result + (d99 != null ? d99.hashCode() : 0);
        result = 31 * result + (c81 != null ? c81.hashCode() : 0);
        result = 31 * result + (c82 != null ? c82.hashCode() : 0);
        result = 31 * result + (c83 != null ? c83.hashCode() : 0);
        result = 31 * result + (c84 != null ? c84.hashCode() : 0);
        result = 31 * result + (c85 != null ? c85.hashCode() : 0);
        result = 31 * result + (c86 != null ? c86.hashCode() : 0);
        result = 31 * result + (c87 != null ? c87.hashCode() : 0);
        result = 31 * result + (c88 != null ? c88.hashCode() : 0);
        result = 31 * result + (c89 != null ? c89.hashCode() : 0);
        result = 31 * result + (c90 != null ? c90.hashCode() : 0);
        result = 31 * result + (c91 != null ? c91.hashCode() : 0);
        result = 31 * result + (c92 != null ? c92.hashCode() : 0);
        result = 31 * result + (c93 != null ? c93.hashCode() : 0);
        result = 31 * result + (c94 != null ? c94.hashCode() : 0);
        result = 31 * result + (c95 != null ? c95.hashCode() : 0);
        result = 31 * result + (c96 != null ? c96.hashCode() : 0);
        result = 31 * result + (c97 != null ? c97.hashCode() : 0);
        result = 31 * result + (c98 != null ? c98.hashCode() : 0);
        result = 31 * result + (c99 != null ? c99.hashCode() : 0);
        result = 31 * result + (conteúdo != null ? conteúdo.hashCode() : 0);
        return result;
    }
}
