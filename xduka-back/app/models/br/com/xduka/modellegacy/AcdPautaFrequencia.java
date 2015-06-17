package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdPautaFrequenciaPK.class)
public class AcdPautaFrequencia {
    private long pautaFrequênciaId;

    @Basic
    @javax.persistence.Column(name = "PautaFrequência_ID", nullable = false, insertable = true, updatable = true)
    public long getPautaFrequênciaId() {
        return pautaFrequênciaId;
    }

    public void setPautaFrequênciaId(long pautaFrequênciaId) {
        this.pautaFrequênciaId = pautaFrequênciaId;
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

    private short bimestre;

    @Id
    @javax.persistence.Column(name = "Bimestre", nullable = false, insertable = true, updatable = true)
    public short getBimestre() {
        return bimestre;
    }

    public void setBimestre(short bimestre) {
        this.bimestre = bimestre;
    }

    private int codDisciplinaPrincipal;

    @Basic
    @javax.persistence.Column(name = "CodDisciplinaPrincipal", nullable = false, insertable = true, updatable = true)
    public int getCodDisciplinaPrincipal() {
        return codDisciplinaPrincipal;
    }

    public void setCodDisciplinaPrincipal(int codDisciplinaPrincipal) {
        this.codDisciplinaPrincipal = codDisciplinaPrincipal;
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

    private int matrícula;

    @Basic
    @javax.persistence.Column(name = "Matrícula", nullable = false, insertable = true, updatable = true)
    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
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

    private byte númeroPauta;

    @Basic
    @javax.persistence.Column(name = "NúmeroPauta", nullable = false, insertable = true, updatable = true)
    public byte getNúmeroPauta() {
        return númeroPauta;
    }

    public void setNúmeroPauta(byte númeroPauta) {
        this.númeroPauta = númeroPauta;
    }

    private String f01;

    @Basic
    @javax.persistence.Column(name = "F01", nullable = false, insertable = true, updatable = true)
    public String getF01() {
        return f01;
    }

    public void setF01(String f01) {
        this.f01 = f01;
    }

    private String f02;

    @Basic
    @javax.persistence.Column(name = "F02", nullable = false, insertable = true, updatable = true)
    public String getF02() {
        return f02;
    }

    public void setF02(String f02) {
        this.f02 = f02;
    }

    private String f03;

    @Basic
    @javax.persistence.Column(name = "F03", nullable = false, insertable = true, updatable = true)
    public String getF03() {
        return f03;
    }

    public void setF03(String f03) {
        this.f03 = f03;
    }

    private String f06;

    @Basic
    @javax.persistence.Column(name = "F06", nullable = false, insertable = true, updatable = true)
    public String getF06() {
        return f06;
    }

    public void setF06(String f06) {
        this.f06 = f06;
    }

    private String f04;

    @Basic
    @javax.persistence.Column(name = "F04", nullable = false, insertable = true, updatable = true)
    public String getF04() {
        return f04;
    }

    public void setF04(String f04) {
        this.f04 = f04;
    }

    private String f05;

    @Basic
    @javax.persistence.Column(name = "F05", nullable = false, insertable = true, updatable = true)
    public String getF05() {
        return f05;
    }

    public void setF05(String f05) {
        this.f05 = f05;
    }

    private String f07;

    @Basic
    @javax.persistence.Column(name = "F07", nullable = false, insertable = true, updatable = true)
    public String getF07() {
        return f07;
    }

    public void setF07(String f07) {
        this.f07 = f07;
    }

    private String f08;

    @Basic
    @javax.persistence.Column(name = "F08", nullable = false, insertable = true, updatable = true)
    public String getF08() {
        return f08;
    }

    public void setF08(String f08) {
        this.f08 = f08;
    }

    private String f09;

    @Basic
    @javax.persistence.Column(name = "F09", nullable = false, insertable = true, updatable = true)
    public String getF09() {
        return f09;
    }

    public void setF09(String f09) {
        this.f09 = f09;
    }

    private String f10;

    @Basic
    @javax.persistence.Column(name = "F10", nullable = false, insertable = true, updatable = true)
    public String getF10() {
        return f10;
    }

    public void setF10(String f10) {
        this.f10 = f10;
    }

    private String f11;

    @Basic
    @javax.persistence.Column(name = "F11", nullable = false, insertable = true, updatable = true)
    public String getF11() {
        return f11;
    }

    public void setF11(String f11) {
        this.f11 = f11;
    }

    private String f12;

    @Basic
    @javax.persistence.Column(name = "F12", nullable = false, insertable = true, updatable = true)
    public String getF12() {
        return f12;
    }

    public void setF12(String f12) {
        this.f12 = f12;
    }

    private String f13;

    @Basic
    @javax.persistence.Column(name = "F13", nullable = false, insertable = true, updatable = true)
    public String getF13() {
        return f13;
    }

    public void setF13(String f13) {
        this.f13 = f13;
    }

    private String f14;

    @Basic
    @javax.persistence.Column(name = "F14", nullable = false, insertable = true, updatable = true)
    public String getF14() {
        return f14;
    }

    public void setF14(String f14) {
        this.f14 = f14;
    }

    private String f15;

    @Basic
    @javax.persistence.Column(name = "F15", nullable = false, insertable = true, updatable = true)
    public String getF15() {
        return f15;
    }

    public void setF15(String f15) {
        this.f15 = f15;
    }

    private String f16;

    @Basic
    @javax.persistence.Column(name = "F16", nullable = false, insertable = true, updatable = true)
    public String getF16() {
        return f16;
    }

    public void setF16(String f16) {
        this.f16 = f16;
    }

    private String f17;

    @Basic
    @javax.persistence.Column(name = "F17", nullable = false, insertable = true, updatable = true)
    public String getF17() {
        return f17;
    }

    public void setF17(String f17) {
        this.f17 = f17;
    }

    private String f18;

    @Basic
    @javax.persistence.Column(name = "F18", nullable = false, insertable = true, updatable = true)
    public String getF18() {
        return f18;
    }

    public void setF18(String f18) {
        this.f18 = f18;
    }

    private String f19;

    @Basic
    @javax.persistence.Column(name = "F19", nullable = false, insertable = true, updatable = true)
    public String getF19() {
        return f19;
    }

    public void setF19(String f19) {
        this.f19 = f19;
    }

    private String f20;

    @Basic
    @javax.persistence.Column(name = "F20", nullable = false, insertable = true, updatable = true)
    public String getF20() {
        return f20;
    }

    public void setF20(String f20) {
        this.f20 = f20;
    }

    private String f21;

    @Basic
    @javax.persistence.Column(name = "F21", nullable = false, insertable = true, updatable = true)
    public String getF21() {
        return f21;
    }

    public void setF21(String f21) {
        this.f21 = f21;
    }

    private String f22;

    @Basic
    @javax.persistence.Column(name = "F22", nullable = false, insertable = true, updatable = true)
    public String getF22() {
        return f22;
    }

    public void setF22(String f22) {
        this.f22 = f22;
    }

    private String f23;

    @Basic
    @javax.persistence.Column(name = "F23", nullable = false, insertable = true, updatable = true)
    public String getF23() {
        return f23;
    }

    public void setF23(String f23) {
        this.f23 = f23;
    }

    private String f24;

    @Basic
    @javax.persistence.Column(name = "F24", nullable = false, insertable = true, updatable = true)
    public String getF24() {
        return f24;
    }

    public void setF24(String f24) {
        this.f24 = f24;
    }

    private String f25;

    @Basic
    @javax.persistence.Column(name = "F25", nullable = false, insertable = true, updatable = true)
    public String getF25() {
        return f25;
    }

    public void setF25(String f25) {
        this.f25 = f25;
    }

    private String f26;

    @Basic
    @javax.persistence.Column(name = "F26", nullable = false, insertable = true, updatable = true)
    public String getF26() {
        return f26;
    }

    public void setF26(String f26) {
        this.f26 = f26;
    }

    private String f27;

    @Basic
    @javax.persistence.Column(name = "F27", nullable = false, insertable = true, updatable = true)
    public String getF27() {
        return f27;
    }

    public void setF27(String f27) {
        this.f27 = f27;
    }

    private String f28;

    @Basic
    @javax.persistence.Column(name = "F28", nullable = false, insertable = true, updatable = true)
    public String getF28() {
        return f28;
    }

    public void setF28(String f28) {
        this.f28 = f28;
    }

    private String f29;

    @Basic
    @javax.persistence.Column(name = "F29", nullable = false, insertable = true, updatable = true)
    public String getF29() {
        return f29;
    }

    public void setF29(String f29) {
        this.f29 = f29;
    }

    private String f30;

    @Basic
    @javax.persistence.Column(name = "F30", nullable = false, insertable = true, updatable = true)
    public String getF30() {
        return f30;
    }

    public void setF30(String f30) {
        this.f30 = f30;
    }

    private String f31;

    @Basic
    @javax.persistence.Column(name = "F31", nullable = false, insertable = true, updatable = true)
    public String getF31() {
        return f31;
    }

    public void setF31(String f31) {
        this.f31 = f31;
    }

    private String f32;

    @Basic
    @javax.persistence.Column(name = "F32", nullable = false, insertable = true, updatable = true)
    public String getF32() {
        return f32;
    }

    public void setF32(String f32) {
        this.f32 = f32;
    }

    private String f33;

    @Basic
    @javax.persistence.Column(name = "F33", nullable = false, insertable = true, updatable = true)
    public String getF33() {
        return f33;
    }

    public void setF33(String f33) {
        this.f33 = f33;
    }

    private String f34;

    @Basic
    @javax.persistence.Column(name = "F34", nullable = false, insertable = true, updatable = true)
    public String getF34() {
        return f34;
    }

    public void setF34(String f34) {
        this.f34 = f34;
    }

    private String f35;

    @Basic
    @javax.persistence.Column(name = "F35", nullable = false, insertable = true, updatable = true)
    public String getF35() {
        return f35;
    }

    public void setF35(String f35) {
        this.f35 = f35;
    }

    private String f36;

    @Basic
    @javax.persistence.Column(name = "F36", nullable = false, insertable = true, updatable = true)
    public String getF36() {
        return f36;
    }

    public void setF36(String f36) {
        this.f36 = f36;
    }

    private String f37;

    @Basic
    @javax.persistence.Column(name = "F37", nullable = false, insertable = true, updatable = true)
    public String getF37() {
        return f37;
    }

    public void setF37(String f37) {
        this.f37 = f37;
    }

    private String f38;

    @Basic
    @javax.persistence.Column(name = "F38", nullable = false, insertable = true, updatable = true)
    public String getF38() {
        return f38;
    }

    public void setF38(String f38) {
        this.f38 = f38;
    }

    private String f39;

    @Basic
    @javax.persistence.Column(name = "F39", nullable = false, insertable = true, updatable = true)
    public String getF39() {
        return f39;
    }

    public void setF39(String f39) {
        this.f39 = f39;
    }

    private String f40;

    @Basic
    @javax.persistence.Column(name = "F40", nullable = false, insertable = true, updatable = true)
    public String getF40() {
        return f40;
    }

    public void setF40(String f40) {
        this.f40 = f40;
    }

    private String f41;

    @Basic
    @javax.persistence.Column(name = "F41", nullable = false, insertable = true, updatable = true)
    public String getF41() {
        return f41;
    }

    public void setF41(String f41) {
        this.f41 = f41;
    }

    private String f42;

    @Basic
    @javax.persistence.Column(name = "F42", nullable = false, insertable = true, updatable = true)
    public String getF42() {
        return f42;
    }

    public void setF42(String f42) {
        this.f42 = f42;
    }

    private String f43;

    @Basic
    @javax.persistence.Column(name = "F43", nullable = false, insertable = true, updatable = true)
    public String getF43() {
        return f43;
    }

    public void setF43(String f43) {
        this.f43 = f43;
    }

    private String f44;

    @Basic
    @javax.persistence.Column(name = "F44", nullable = false, insertable = true, updatable = true)
    public String getF44() {
        return f44;
    }

    public void setF44(String f44) {
        this.f44 = f44;
    }

    private String f45;

    @Basic
    @javax.persistence.Column(name = "F45", nullable = false, insertable = true, updatable = true)
    public String getF45() {
        return f45;
    }

    public void setF45(String f45) {
        this.f45 = f45;
    }

    private String f46;

    @Basic
    @javax.persistence.Column(name = "F46", nullable = false, insertable = true, updatable = true)
    public String getF46() {
        return f46;
    }

    public void setF46(String f46) {
        this.f46 = f46;
    }

    private String f47;

    @Basic
    @javax.persistence.Column(name = "F47", nullable = false, insertable = true, updatable = true)
    public String getF47() {
        return f47;
    }

    public void setF47(String f47) {
        this.f47 = f47;
    }

    private String f48;

    @Basic
    @javax.persistence.Column(name = "F48", nullable = false, insertable = true, updatable = true)
    public String getF48() {
        return f48;
    }

    public void setF48(String f48) {
        this.f48 = f48;
    }

    private String f49;

    @Basic
    @javax.persistence.Column(name = "F49", nullable = false, insertable = true, updatable = true)
    public String getF49() {
        return f49;
    }

    public void setF49(String f49) {
        this.f49 = f49;
    }

    private String f50;

    @Basic
    @javax.persistence.Column(name = "F50", nullable = false, insertable = true, updatable = true)
    public String getF50() {
        return f50;
    }

    public void setF50(String f50) {
        this.f50 = f50;
    }

    private String f51;

    @Basic
    @javax.persistence.Column(name = "F51", nullable = false, insertable = true, updatable = true)
    public String getF51() {
        return f51;
    }

    public void setF51(String f51) {
        this.f51 = f51;
    }

    private String f52;

    @Basic
    @javax.persistence.Column(name = "F52", nullable = false, insertable = true, updatable = true)
    public String getF52() {
        return f52;
    }

    public void setF52(String f52) {
        this.f52 = f52;
    }

    private String f53;

    @Basic
    @javax.persistence.Column(name = "F53", nullable = false, insertable = true, updatable = true)
    public String getF53() {
        return f53;
    }

    public void setF53(String f53) {
        this.f53 = f53;
    }

    private String f54;

    @Basic
    @javax.persistence.Column(name = "F54", nullable = false, insertable = true, updatable = true)
    public String getF54() {
        return f54;
    }

    public void setF54(String f54) {
        this.f54 = f54;
    }

    private String f55;

    @Basic
    @javax.persistence.Column(name = "F55", nullable = false, insertable = true, updatable = true)
    public String getF55() {
        return f55;
    }

    public void setF55(String f55) {
        this.f55 = f55;
    }

    private String f56;

    @Basic
    @javax.persistence.Column(name = "F56", nullable = false, insertable = true, updatable = true)
    public String getF56() {
        return f56;
    }

    public void setF56(String f56) {
        this.f56 = f56;
    }

    private String f57;

    @Basic
    @javax.persistence.Column(name = "F57", nullable = false, insertable = true, updatable = true)
    public String getF57() {
        return f57;
    }

    public void setF57(String f57) {
        this.f57 = f57;
    }

    private String f58;

    @Basic
    @javax.persistence.Column(name = "F58", nullable = false, insertable = true, updatable = true)
    public String getF58() {
        return f58;
    }

    public void setF58(String f58) {
        this.f58 = f58;
    }

    private String f59;

    @Basic
    @javax.persistence.Column(name = "F59", nullable = false, insertable = true, updatable = true)
    public String getF59() {
        return f59;
    }

    public void setF59(String f59) {
        this.f59 = f59;
    }

    private String f60;

    @Basic
    @javax.persistence.Column(name = "F60", nullable = false, insertable = true, updatable = true)
    public String getF60() {
        return f60;
    }

    public void setF60(String f60) {
        this.f60 = f60;
    }

    private String f61;

    @Basic
    @javax.persistence.Column(name = "F61", nullable = false, insertable = true, updatable = true)
    public String getF61() {
        return f61;
    }

    public void setF61(String f61) {
        this.f61 = f61;
    }

    private String f62;

    @Basic
    @javax.persistence.Column(name = "F62", nullable = false, insertable = true, updatable = true)
    public String getF62() {
        return f62;
    }

    public void setF62(String f62) {
        this.f62 = f62;
    }

    private String f63;

    @Basic
    @javax.persistence.Column(name = "F63", nullable = false, insertable = true, updatable = true)
    public String getF63() {
        return f63;
    }

    public void setF63(String f63) {
        this.f63 = f63;
    }

    private String f64;

    @Basic
    @javax.persistence.Column(name = "F64", nullable = false, insertable = true, updatable = true)
    public String getF64() {
        return f64;
    }

    public void setF64(String f64) {
        this.f64 = f64;
    }

    private String f65;

    @Basic
    @javax.persistence.Column(name = "F65", nullable = false, insertable = true, updatable = true)
    public String getF65() {
        return f65;
    }

    public void setF65(String f65) {
        this.f65 = f65;
    }

    private String f66;

    @Basic
    @javax.persistence.Column(name = "F66", nullable = false, insertable = true, updatable = true)
    public String getF66() {
        return f66;
    }

    public void setF66(String f66) {
        this.f66 = f66;
    }

    private String f67;

    @Basic
    @javax.persistence.Column(name = "F67", nullable = false, insertable = true, updatable = true)
    public String getF67() {
        return f67;
    }

    public void setF67(String f67) {
        this.f67 = f67;
    }

    private String f68;

    @Basic
    @javax.persistence.Column(name = "F68", nullable = false, insertable = true, updatable = true)
    public String getF68() {
        return f68;
    }

    public void setF68(String f68) {
        this.f68 = f68;
    }

    private String f69;

    @Basic
    @javax.persistence.Column(name = "F69", nullable = false, insertable = true, updatable = true)
    public String getF69() {
        return f69;
    }

    public void setF69(String f69) {
        this.f69 = f69;
    }

    private String f70;

    @Basic
    @javax.persistence.Column(name = "F70", nullable = false, insertable = true, updatable = true)
    public String getF70() {
        return f70;
    }

    public void setF70(String f70) {
        this.f70 = f70;
    }

    private String f71;

    @Basic
    @javax.persistence.Column(name = "F71", nullable = false, insertable = true, updatable = true)
    public String getF71() {
        return f71;
    }

    public void setF71(String f71) {
        this.f71 = f71;
    }

    private String f72;

    @Basic
    @javax.persistence.Column(name = "F72", nullable = false, insertable = true, updatable = true)
    public String getF72() {
        return f72;
    }

    public void setF72(String f72) {
        this.f72 = f72;
    }

    private String f73;

    @Basic
    @javax.persistence.Column(name = "F73", nullable = false, insertable = true, updatable = true)
    public String getF73() {
        return f73;
    }

    public void setF73(String f73) {
        this.f73 = f73;
    }

    private String f74;

    @Basic
    @javax.persistence.Column(name = "F74", nullable = false, insertable = true, updatable = true)
    public String getF74() {
        return f74;
    }

    public void setF74(String f74) {
        this.f74 = f74;
    }

    private String f75;

    @Basic
    @javax.persistence.Column(name = "F75", nullable = false, insertable = true, updatable = true)
    public String getF75() {
        return f75;
    }

    public void setF75(String f75) {
        this.f75 = f75;
    }

    private String f76;

    @Basic
    @javax.persistence.Column(name = "F76", nullable = false, insertable = true, updatable = true)
    public String getF76() {
        return f76;
    }

    public void setF76(String f76) {
        this.f76 = f76;
    }

    private String f77;

    @Basic
    @javax.persistence.Column(name = "F77", nullable = false, insertable = true, updatable = true)
    public String getF77() {
        return f77;
    }

    public void setF77(String f77) {
        this.f77 = f77;
    }

    private String f78;

    @Basic
    @javax.persistence.Column(name = "F78", nullable = false, insertable = true, updatable = true)
    public String getF78() {
        return f78;
    }

    public void setF78(String f78) {
        this.f78 = f78;
    }

    private String f79;

    @Basic
    @javax.persistence.Column(name = "F79", nullable = false, insertable = true, updatable = true)
    public String getF79() {
        return f79;
    }

    public void setF79(String f79) {
        this.f79 = f79;
    }

    private String f80;

    @Basic
    @javax.persistence.Column(name = "F80", nullable = false, insertable = true, updatable = true)
    public String getF80() {
        return f80;
    }

    public void setF80(String f80) {
        this.f80 = f80;
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

    private String f81;

    @Basic
    @javax.persistence.Column(name = "F81", nullable = false, insertable = true, updatable = true)
    public String getF81() {
        return f81;
    }

    public void setF81(String f81) {
        this.f81 = f81;
    }

    private String f82;

    @Basic
    @javax.persistence.Column(name = "F82", nullable = false, insertable = true, updatable = true)
    public String getF82() {
        return f82;
    }

    public void setF82(String f82) {
        this.f82 = f82;
    }

    private String f83;

    @Basic
    @javax.persistence.Column(name = "F83", nullable = false, insertable = true, updatable = true)
    public String getF83() {
        return f83;
    }

    public void setF83(String f83) {
        this.f83 = f83;
    }

    private String f84;

    @Basic
    @javax.persistence.Column(name = "F84", nullable = false, insertable = true, updatable = true)
    public String getF84() {
        return f84;
    }

    public void setF84(String f84) {
        this.f84 = f84;
    }

    private String f85;

    @Basic
    @javax.persistence.Column(name = "F85", nullable = false, insertable = true, updatable = true)
    public String getF85() {
        return f85;
    }

    public void setF85(String f85) {
        this.f85 = f85;
    }

    private String f86;

    @Basic
    @javax.persistence.Column(name = "F86", nullable = false, insertable = true, updatable = true)
    public String getF86() {
        return f86;
    }

    public void setF86(String f86) {
        this.f86 = f86;
    }

    private String f87;

    @Basic
    @javax.persistence.Column(name = "F87", nullable = false, insertable = true, updatable = true)
    public String getF87() {
        return f87;
    }

    public void setF87(String f87) {
        this.f87 = f87;
    }

    private String f88;

    @Basic
    @javax.persistence.Column(name = "F88", nullable = false, insertable = true, updatable = true)
    public String getF88() {
        return f88;
    }

    public void setF88(String f88) {
        this.f88 = f88;
    }

    private String f89;

    @Basic
    @javax.persistence.Column(name = "F89", nullable = false, insertable = true, updatable = true)
    public String getF89() {
        return f89;
    }

    public void setF89(String f89) {
        this.f89 = f89;
    }

    private String f90;

    @Basic
    @javax.persistence.Column(name = "F90", nullable = false, insertable = true, updatable = true)
    public String getF90() {
        return f90;
    }

    public void setF90(String f90) {
        this.f90 = f90;
    }

    private String f91;

    @Basic
    @javax.persistence.Column(name = "F91", nullable = false, insertable = true, updatable = true)
    public String getF91() {
        return f91;
    }

    public void setF91(String f91) {
        this.f91 = f91;
    }

    private String f92;

    @Basic
    @javax.persistence.Column(name = "F92", nullable = false, insertable = true, updatable = true)
    public String getF92() {
        return f92;
    }

    public void setF92(String f92) {
        this.f92 = f92;
    }

    private String f93;

    @Basic
    @javax.persistence.Column(name = "F93", nullable = false, insertable = true, updatable = true)
    public String getF93() {
        return f93;
    }

    public void setF93(String f93) {
        this.f93 = f93;
    }

    private String f94;

    @Basic
    @javax.persistence.Column(name = "F94", nullable = false, insertable = true, updatable = true)
    public String getF94() {
        return f94;
    }

    public void setF94(String f94) {
        this.f94 = f94;
    }

    private String f95;

    @Basic
    @javax.persistence.Column(name = "F95", nullable = false, insertable = true, updatable = true)
    public String getF95() {
        return f95;
    }

    public void setF95(String f95) {
        this.f95 = f95;
    }

    private String f96;

    @Basic
    @javax.persistence.Column(name = "F96", nullable = false, insertable = true, updatable = true)
    public String getF96() {
        return f96;
    }

    public void setF96(String f96) {
        this.f96 = f96;
    }

    private String f97;

    @Basic
    @javax.persistence.Column(name = "F97", nullable = false, insertable = true, updatable = true)
    public String getF97() {
        return f97;
    }

    public void setF97(String f97) {
        this.f97 = f97;
    }

    private String f98;

    @Basic
    @javax.persistence.Column(name = "F98", nullable = false, insertable = true, updatable = true)
    public String getF98() {
        return f98;
    }

    public void setF98(String f98) {
        this.f98 = f98;
    }

    private String f99;

    @Basic
    @javax.persistence.Column(name = "F99", nullable = false, insertable = true, updatable = true)
    public String getF99() {
        return f99;
    }

    public void setF99(String f99) {
        this.f99 = f99;
    }

    private Integer total;

    @Basic
    @javax.persistence.Column(name = "Total", nullable = true, insertable = true, updatable = true)
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdPautaFrequencia that = (AcdPautaFrequencia) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (bimestre != that.bimestre) return false;
        if (codCurso != that.codCurso) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codDisciplinaPrincipal != that.codDisciplinaPrincipal) return false;
        if (codPauta != that.codPauta) return false;
        if (codPeríodo != that.codPeríodo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (dependência != that.dependência) return false;
        if (desatualizada != that.desatualizada) return false;
        if (gradeÚnica != that.gradeÚnica) return false;
        if (matrícula != that.matrícula) return false;
        if (númeroPauta != that.númeroPauta) return false;
        if (pautaFrequênciaId != that.pautaFrequênciaId) return false;
        if (f01 != null ? !f01.equals(that.f01) : that.f01 != null) return false;
        if (f02 != null ? !f02.equals(that.f02) : that.f02 != null) return false;
        if (f03 != null ? !f03.equals(that.f03) : that.f03 != null) return false;
        if (f04 != null ? !f04.equals(that.f04) : that.f04 != null) return false;
        if (f05 != null ? !f05.equals(that.f05) : that.f05 != null) return false;
        if (f06 != null ? !f06.equals(that.f06) : that.f06 != null) return false;
        if (f07 != null ? !f07.equals(that.f07) : that.f07 != null) return false;
        if (f08 != null ? !f08.equals(that.f08) : that.f08 != null) return false;
        if (f09 != null ? !f09.equals(that.f09) : that.f09 != null) return false;
        if (f10 != null ? !f10.equals(that.f10) : that.f10 != null) return false;
        if (f11 != null ? !f11.equals(that.f11) : that.f11 != null) return false;
        if (f12 != null ? !f12.equals(that.f12) : that.f12 != null) return false;
        if (f13 != null ? !f13.equals(that.f13) : that.f13 != null) return false;
        if (f14 != null ? !f14.equals(that.f14) : that.f14 != null) return false;
        if (f15 != null ? !f15.equals(that.f15) : that.f15 != null) return false;
        if (f16 != null ? !f16.equals(that.f16) : that.f16 != null) return false;
        if (f17 != null ? !f17.equals(that.f17) : that.f17 != null) return false;
        if (f18 != null ? !f18.equals(that.f18) : that.f18 != null) return false;
        if (f19 != null ? !f19.equals(that.f19) : that.f19 != null) return false;
        if (f20 != null ? !f20.equals(that.f20) : that.f20 != null) return false;
        if (f21 != null ? !f21.equals(that.f21) : that.f21 != null) return false;
        if (f22 != null ? !f22.equals(that.f22) : that.f22 != null) return false;
        if (f23 != null ? !f23.equals(that.f23) : that.f23 != null) return false;
        if (f24 != null ? !f24.equals(that.f24) : that.f24 != null) return false;
        if (f25 != null ? !f25.equals(that.f25) : that.f25 != null) return false;
        if (f26 != null ? !f26.equals(that.f26) : that.f26 != null) return false;
        if (f27 != null ? !f27.equals(that.f27) : that.f27 != null) return false;
        if (f28 != null ? !f28.equals(that.f28) : that.f28 != null) return false;
        if (f29 != null ? !f29.equals(that.f29) : that.f29 != null) return false;
        if (f30 != null ? !f30.equals(that.f30) : that.f30 != null) return false;
        if (f31 != null ? !f31.equals(that.f31) : that.f31 != null) return false;
        if (f32 != null ? !f32.equals(that.f32) : that.f32 != null) return false;
        if (f33 != null ? !f33.equals(that.f33) : that.f33 != null) return false;
        if (f34 != null ? !f34.equals(that.f34) : that.f34 != null) return false;
        if (f35 != null ? !f35.equals(that.f35) : that.f35 != null) return false;
        if (f36 != null ? !f36.equals(that.f36) : that.f36 != null) return false;
        if (f37 != null ? !f37.equals(that.f37) : that.f37 != null) return false;
        if (f38 != null ? !f38.equals(that.f38) : that.f38 != null) return false;
        if (f39 != null ? !f39.equals(that.f39) : that.f39 != null) return false;
        if (f40 != null ? !f40.equals(that.f40) : that.f40 != null) return false;
        if (f41 != null ? !f41.equals(that.f41) : that.f41 != null) return false;
        if (f42 != null ? !f42.equals(that.f42) : that.f42 != null) return false;
        if (f43 != null ? !f43.equals(that.f43) : that.f43 != null) return false;
        if (f44 != null ? !f44.equals(that.f44) : that.f44 != null) return false;
        if (f45 != null ? !f45.equals(that.f45) : that.f45 != null) return false;
        if (f46 != null ? !f46.equals(that.f46) : that.f46 != null) return false;
        if (f47 != null ? !f47.equals(that.f47) : that.f47 != null) return false;
        if (f48 != null ? !f48.equals(that.f48) : that.f48 != null) return false;
        if (f49 != null ? !f49.equals(that.f49) : that.f49 != null) return false;
        if (f50 != null ? !f50.equals(that.f50) : that.f50 != null) return false;
        if (f51 != null ? !f51.equals(that.f51) : that.f51 != null) return false;
        if (f52 != null ? !f52.equals(that.f52) : that.f52 != null) return false;
        if (f53 != null ? !f53.equals(that.f53) : that.f53 != null) return false;
        if (f54 != null ? !f54.equals(that.f54) : that.f54 != null) return false;
        if (f55 != null ? !f55.equals(that.f55) : that.f55 != null) return false;
        if (f56 != null ? !f56.equals(that.f56) : that.f56 != null) return false;
        if (f57 != null ? !f57.equals(that.f57) : that.f57 != null) return false;
        if (f58 != null ? !f58.equals(that.f58) : that.f58 != null) return false;
        if (f59 != null ? !f59.equals(that.f59) : that.f59 != null) return false;
        if (f60 != null ? !f60.equals(that.f60) : that.f60 != null) return false;
        if (f61 != null ? !f61.equals(that.f61) : that.f61 != null) return false;
        if (f62 != null ? !f62.equals(that.f62) : that.f62 != null) return false;
        if (f63 != null ? !f63.equals(that.f63) : that.f63 != null) return false;
        if (f64 != null ? !f64.equals(that.f64) : that.f64 != null) return false;
        if (f65 != null ? !f65.equals(that.f65) : that.f65 != null) return false;
        if (f66 != null ? !f66.equals(that.f66) : that.f66 != null) return false;
        if (f67 != null ? !f67.equals(that.f67) : that.f67 != null) return false;
        if (f68 != null ? !f68.equals(that.f68) : that.f68 != null) return false;
        if (f69 != null ? !f69.equals(that.f69) : that.f69 != null) return false;
        if (f70 != null ? !f70.equals(that.f70) : that.f70 != null) return false;
        if (f71 != null ? !f71.equals(that.f71) : that.f71 != null) return false;
        if (f72 != null ? !f72.equals(that.f72) : that.f72 != null) return false;
        if (f73 != null ? !f73.equals(that.f73) : that.f73 != null) return false;
        if (f74 != null ? !f74.equals(that.f74) : that.f74 != null) return false;
        if (f75 != null ? !f75.equals(that.f75) : that.f75 != null) return false;
        if (f76 != null ? !f76.equals(that.f76) : that.f76 != null) return false;
        if (f77 != null ? !f77.equals(that.f77) : that.f77 != null) return false;
        if (f78 != null ? !f78.equals(that.f78) : that.f78 != null) return false;
        if (f79 != null ? !f79.equals(that.f79) : that.f79 != null) return false;
        if (f80 != null ? !f80.equals(that.f80) : that.f80 != null) return false;
        if (f81 != null ? !f81.equals(that.f81) : that.f81 != null) return false;
        if (f82 != null ? !f82.equals(that.f82) : that.f82 != null) return false;
        if (f83 != null ? !f83.equals(that.f83) : that.f83 != null) return false;
        if (f84 != null ? !f84.equals(that.f84) : that.f84 != null) return false;
        if (f85 != null ? !f85.equals(that.f85) : that.f85 != null) return false;
        if (f86 != null ? !f86.equals(that.f86) : that.f86 != null) return false;
        if (f87 != null ? !f87.equals(that.f87) : that.f87 != null) return false;
        if (f88 != null ? !f88.equals(that.f88) : that.f88 != null) return false;
        if (f89 != null ? !f89.equals(that.f89) : that.f89 != null) return false;
        if (f90 != null ? !f90.equals(that.f90) : that.f90 != null) return false;
        if (f91 != null ? !f91.equals(that.f91) : that.f91 != null) return false;
        if (f92 != null ? !f92.equals(that.f92) : that.f92 != null) return false;
        if (f93 != null ? !f93.equals(that.f93) : that.f93 != null) return false;
        if (f94 != null ? !f94.equals(that.f94) : that.f94 != null) return false;
        if (f95 != null ? !f95.equals(that.f95) : that.f95 != null) return false;
        if (f96 != null ? !f96.equals(that.f96) : that.f96 != null) return false;
        if (f97 != null ? !f97.equals(that.f97) : that.f97 != null) return false;
        if (f98 != null ? !f98.equals(that.f98) : that.f98 != null) return false;
        if (f99 != null ? !f99.equals(that.f99) : that.f99 != null) return false;
        if (processando != null ? !processando.equals(that.processando) : that.processando != null) return false;
        if (total != null ? !total.equals(that.total) : that.total != null) return false;
        if (turma != null ? !turma.equals(that.turma) : that.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pautaFrequênciaId ^ (pautaFrequênciaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) (codPauta ^ (codPauta >>> 32));
        result = 31 * result + codDisciplina;
        result = 31 * result + (int) dependência;
        result = 31 * result + (int) bimestre;
        result = 31 * result + codDisciplinaPrincipal;
        result = 31 * result + gradeÚnica;
        result = 31 * result + matrícula;
        result = 31 * result + anoLetivo;
        result = 31 * result + codCurso;
        result = 31 * result + codPeríodo;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + (int) númeroPauta;
        result = 31 * result + (f01 != null ? f01.hashCode() : 0);
        result = 31 * result + (f02 != null ? f02.hashCode() : 0);
        result = 31 * result + (f03 != null ? f03.hashCode() : 0);
        result = 31 * result + (f06 != null ? f06.hashCode() : 0);
        result = 31 * result + (f04 != null ? f04.hashCode() : 0);
        result = 31 * result + (f05 != null ? f05.hashCode() : 0);
        result = 31 * result + (f07 != null ? f07.hashCode() : 0);
        result = 31 * result + (f08 != null ? f08.hashCode() : 0);
        result = 31 * result + (f09 != null ? f09.hashCode() : 0);
        result = 31 * result + (f10 != null ? f10.hashCode() : 0);
        result = 31 * result + (f11 != null ? f11.hashCode() : 0);
        result = 31 * result + (f12 != null ? f12.hashCode() : 0);
        result = 31 * result + (f13 != null ? f13.hashCode() : 0);
        result = 31 * result + (f14 != null ? f14.hashCode() : 0);
        result = 31 * result + (f15 != null ? f15.hashCode() : 0);
        result = 31 * result + (f16 != null ? f16.hashCode() : 0);
        result = 31 * result + (f17 != null ? f17.hashCode() : 0);
        result = 31 * result + (f18 != null ? f18.hashCode() : 0);
        result = 31 * result + (f19 != null ? f19.hashCode() : 0);
        result = 31 * result + (f20 != null ? f20.hashCode() : 0);
        result = 31 * result + (f21 != null ? f21.hashCode() : 0);
        result = 31 * result + (f22 != null ? f22.hashCode() : 0);
        result = 31 * result + (f23 != null ? f23.hashCode() : 0);
        result = 31 * result + (f24 != null ? f24.hashCode() : 0);
        result = 31 * result + (f25 != null ? f25.hashCode() : 0);
        result = 31 * result + (f26 != null ? f26.hashCode() : 0);
        result = 31 * result + (f27 != null ? f27.hashCode() : 0);
        result = 31 * result + (f28 != null ? f28.hashCode() : 0);
        result = 31 * result + (f29 != null ? f29.hashCode() : 0);
        result = 31 * result + (f30 != null ? f30.hashCode() : 0);
        result = 31 * result + (f31 != null ? f31.hashCode() : 0);
        result = 31 * result + (f32 != null ? f32.hashCode() : 0);
        result = 31 * result + (f33 != null ? f33.hashCode() : 0);
        result = 31 * result + (f34 != null ? f34.hashCode() : 0);
        result = 31 * result + (f35 != null ? f35.hashCode() : 0);
        result = 31 * result + (f36 != null ? f36.hashCode() : 0);
        result = 31 * result + (f37 != null ? f37.hashCode() : 0);
        result = 31 * result + (f38 != null ? f38.hashCode() : 0);
        result = 31 * result + (f39 != null ? f39.hashCode() : 0);
        result = 31 * result + (f40 != null ? f40.hashCode() : 0);
        result = 31 * result + (f41 != null ? f41.hashCode() : 0);
        result = 31 * result + (f42 != null ? f42.hashCode() : 0);
        result = 31 * result + (f43 != null ? f43.hashCode() : 0);
        result = 31 * result + (f44 != null ? f44.hashCode() : 0);
        result = 31 * result + (f45 != null ? f45.hashCode() : 0);
        result = 31 * result + (f46 != null ? f46.hashCode() : 0);
        result = 31 * result + (f47 != null ? f47.hashCode() : 0);
        result = 31 * result + (f48 != null ? f48.hashCode() : 0);
        result = 31 * result + (f49 != null ? f49.hashCode() : 0);
        result = 31 * result + (f50 != null ? f50.hashCode() : 0);
        result = 31 * result + (f51 != null ? f51.hashCode() : 0);
        result = 31 * result + (f52 != null ? f52.hashCode() : 0);
        result = 31 * result + (f53 != null ? f53.hashCode() : 0);
        result = 31 * result + (f54 != null ? f54.hashCode() : 0);
        result = 31 * result + (f55 != null ? f55.hashCode() : 0);
        result = 31 * result + (f56 != null ? f56.hashCode() : 0);
        result = 31 * result + (f57 != null ? f57.hashCode() : 0);
        result = 31 * result + (f58 != null ? f58.hashCode() : 0);
        result = 31 * result + (f59 != null ? f59.hashCode() : 0);
        result = 31 * result + (f60 != null ? f60.hashCode() : 0);
        result = 31 * result + (f61 != null ? f61.hashCode() : 0);
        result = 31 * result + (f62 != null ? f62.hashCode() : 0);
        result = 31 * result + (f63 != null ? f63.hashCode() : 0);
        result = 31 * result + (f64 != null ? f64.hashCode() : 0);
        result = 31 * result + (f65 != null ? f65.hashCode() : 0);
        result = 31 * result + (f66 != null ? f66.hashCode() : 0);
        result = 31 * result + (f67 != null ? f67.hashCode() : 0);
        result = 31 * result + (f68 != null ? f68.hashCode() : 0);
        result = 31 * result + (f69 != null ? f69.hashCode() : 0);
        result = 31 * result + (f70 != null ? f70.hashCode() : 0);
        result = 31 * result + (f71 != null ? f71.hashCode() : 0);
        result = 31 * result + (f72 != null ? f72.hashCode() : 0);
        result = 31 * result + (f73 != null ? f73.hashCode() : 0);
        result = 31 * result + (f74 != null ? f74.hashCode() : 0);
        result = 31 * result + (f75 != null ? f75.hashCode() : 0);
        result = 31 * result + (f76 != null ? f76.hashCode() : 0);
        result = 31 * result + (f77 != null ? f77.hashCode() : 0);
        result = 31 * result + (f78 != null ? f78.hashCode() : 0);
        result = 31 * result + (f79 != null ? f79.hashCode() : 0);
        result = 31 * result + (f80 != null ? f80.hashCode() : 0);
        result = 31 * result + (desatualizada ? 1 : 0);
        result = 31 * result + (f81 != null ? f81.hashCode() : 0);
        result = 31 * result + (f82 != null ? f82.hashCode() : 0);
        result = 31 * result + (f83 != null ? f83.hashCode() : 0);
        result = 31 * result + (f84 != null ? f84.hashCode() : 0);
        result = 31 * result + (f85 != null ? f85.hashCode() : 0);
        result = 31 * result + (f86 != null ? f86.hashCode() : 0);
        result = 31 * result + (f87 != null ? f87.hashCode() : 0);
        result = 31 * result + (f88 != null ? f88.hashCode() : 0);
        result = 31 * result + (f89 != null ? f89.hashCode() : 0);
        result = 31 * result + (f90 != null ? f90.hashCode() : 0);
        result = 31 * result + (f91 != null ? f91.hashCode() : 0);
        result = 31 * result + (f92 != null ? f92.hashCode() : 0);
        result = 31 * result + (f93 != null ? f93.hashCode() : 0);
        result = 31 * result + (f94 != null ? f94.hashCode() : 0);
        result = 31 * result + (f95 != null ? f95.hashCode() : 0);
        result = 31 * result + (f96 != null ? f96.hashCode() : 0);
        result = 31 * result + (f97 != null ? f97.hashCode() : 0);
        result = 31 * result + (f98 != null ? f98.hashCode() : 0);
        result = 31 * result + (f99 != null ? f99.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        result = 31 * result + (processando != null ? processando.hashCode() : 0);
        return result;
    }
}
