package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdPautaFrequênciaMaisPK.class)
public class AcdPautaFrequênciaMais {
    private long pautaFrequênciaMaisId;

    @Basic
    @javax.persistence.Column(name = "PautaFrequênciaMais_ID", nullable = false, insertable = true, updatable = true)
    public long getPautaFrequênciaMaisId() {
        return pautaFrequênciaMaisId;
    }

    public void setPautaFrequênciaMaisId(long pautaFrequênciaMaisId) {
        this.pautaFrequênciaMaisId = pautaFrequênciaMaisId;
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

    private String f100;

    @Basic
    @javax.persistence.Column(name = "F100", nullable = false, insertable = true, updatable = true)
    public String getF100() {
        return f100;
    }

    public void setF100(String f100) {
        this.f100 = f100;
    }

    private String f101;

    @Basic
    @javax.persistence.Column(name = "F101", nullable = false, insertable = true, updatable = true)
    public String getF101() {
        return f101;
    }

    public void setF101(String f101) {
        this.f101 = f101;
    }

    private String f102;

    @Basic
    @javax.persistence.Column(name = "F102", nullable = false, insertable = true, updatable = true)
    public String getF102() {
        return f102;
    }

    public void setF102(String f102) {
        this.f102 = f102;
    }

    private String f103;

    @Basic
    @javax.persistence.Column(name = "F103", nullable = false, insertable = true, updatable = true)
    public String getF103() {
        return f103;
    }

    public void setF103(String f103) {
        this.f103 = f103;
    }

    private String f104;

    @Basic
    @javax.persistence.Column(name = "F104", nullable = false, insertable = true, updatable = true)
    public String getF104() {
        return f104;
    }

    public void setF104(String f104) {
        this.f104 = f104;
    }

    private String f105;

    @Basic
    @javax.persistence.Column(name = "F105", nullable = false, insertable = true, updatable = true)
    public String getF105() {
        return f105;
    }

    public void setF105(String f105) {
        this.f105 = f105;
    }

    private String f106;

    @Basic
    @javax.persistence.Column(name = "F106", nullable = false, insertable = true, updatable = true)
    public String getF106() {
        return f106;
    }

    public void setF106(String f106) {
        this.f106 = f106;
    }

    private String f107;

    @Basic
    @javax.persistence.Column(name = "F107", nullable = false, insertable = true, updatable = true)
    public String getF107() {
        return f107;
    }

    public void setF107(String f107) {
        this.f107 = f107;
    }

    private String f108;

    @Basic
    @javax.persistence.Column(name = "F108", nullable = false, insertable = true, updatable = true)
    public String getF108() {
        return f108;
    }

    public void setF108(String f108) {
        this.f108 = f108;
    }

    private String f109;

    @Basic
    @javax.persistence.Column(name = "F109", nullable = false, insertable = true, updatable = true)
    public String getF109() {
        return f109;
    }

    public void setF109(String f109) {
        this.f109 = f109;
    }

    private String f110;

    @Basic
    @javax.persistence.Column(name = "F110", nullable = false, insertable = true, updatable = true)
    public String getF110() {
        return f110;
    }

    public void setF110(String f110) {
        this.f110 = f110;
    }

    private String f111;

    @Basic
    @javax.persistence.Column(name = "F111", nullable = false, insertable = true, updatable = true)
    public String getF111() {
        return f111;
    }

    public void setF111(String f111) {
        this.f111 = f111;
    }

    private String f112;

    @Basic
    @javax.persistence.Column(name = "F112", nullable = false, insertable = true, updatable = true)
    public String getF112() {
        return f112;
    }

    public void setF112(String f112) {
        this.f112 = f112;
    }

    private String f113;

    @Basic
    @javax.persistence.Column(name = "F113", nullable = false, insertable = true, updatable = true)
    public String getF113() {
        return f113;
    }

    public void setF113(String f113) {
        this.f113 = f113;
    }

    private String f114;

    @Basic
    @javax.persistence.Column(name = "F114", nullable = false, insertable = true, updatable = true)
    public String getF114() {
        return f114;
    }

    public void setF114(String f114) {
        this.f114 = f114;
    }

    private String f115;

    @Basic
    @javax.persistence.Column(name = "F115", nullable = false, insertable = true, updatable = true)
    public String getF115() {
        return f115;
    }

    public void setF115(String f115) {
        this.f115 = f115;
    }

    private String f116;

    @Basic
    @javax.persistence.Column(name = "F116", nullable = false, insertable = true, updatable = true)
    public String getF116() {
        return f116;
    }

    public void setF116(String f116) {
        this.f116 = f116;
    }

    private String f117;

    @Basic
    @javax.persistence.Column(name = "F117", nullable = false, insertable = true, updatable = true)
    public String getF117() {
        return f117;
    }

    public void setF117(String f117) {
        this.f117 = f117;
    }

    private String f118;

    @Basic
    @javax.persistence.Column(name = "F118", nullable = false, insertable = true, updatable = true)
    public String getF118() {
        return f118;
    }

    public void setF118(String f118) {
        this.f118 = f118;
    }

    private String f119;

    @Basic
    @javax.persistence.Column(name = "F119", nullable = false, insertable = true, updatable = true)
    public String getF119() {
        return f119;
    }

    public void setF119(String f119) {
        this.f119 = f119;
    }

    private String f120;

    @Basic
    @javax.persistence.Column(name = "F120", nullable = false, insertable = true, updatable = true)
    public String getF120() {
        return f120;
    }

    public void setF120(String f120) {
        this.f120 = f120;
    }

    private String f121;

    @Basic
    @javax.persistence.Column(name = "F121", nullable = false, insertable = true, updatable = true)
    public String getF121() {
        return f121;
    }

    public void setF121(String f121) {
        this.f121 = f121;
    }

    private String f122;

    @Basic
    @javax.persistence.Column(name = "F122", nullable = false, insertable = true, updatable = true)
    public String getF122() {
        return f122;
    }

    public void setF122(String f122) {
        this.f122 = f122;
    }

    private String f123;

    @Basic
    @javax.persistence.Column(name = "F123", nullable = false, insertable = true, updatable = true)
    public String getF123() {
        return f123;
    }

    public void setF123(String f123) {
        this.f123 = f123;
    }

    private String f124;

    @Basic
    @javax.persistence.Column(name = "F124", nullable = false, insertable = true, updatable = true)
    public String getF124() {
        return f124;
    }

    public void setF124(String f124) {
        this.f124 = f124;
    }

    private String f125;

    @Basic
    @javax.persistence.Column(name = "F125", nullable = false, insertable = true, updatable = true)
    public String getF125() {
        return f125;
    }

    public void setF125(String f125) {
        this.f125 = f125;
    }

    private String f126;

    @Basic
    @javax.persistence.Column(name = "F126", nullable = false, insertable = true, updatable = true)
    public String getF126() {
        return f126;
    }

    public void setF126(String f126) {
        this.f126 = f126;
    }

    private String f127;

    @Basic
    @javax.persistence.Column(name = "F127", nullable = false, insertable = true, updatable = true)
    public String getF127() {
        return f127;
    }

    public void setF127(String f127) {
        this.f127 = f127;
    }

    private String f128;

    @Basic
    @javax.persistence.Column(name = "F128", nullable = false, insertable = true, updatable = true)
    public String getF128() {
        return f128;
    }

    public void setF128(String f128) {
        this.f128 = f128;
    }

    private String f129;

    @Basic
    @javax.persistence.Column(name = "F129", nullable = false, insertable = true, updatable = true)
    public String getF129() {
        return f129;
    }

    public void setF129(String f129) {
        this.f129 = f129;
    }

    private String f130;

    @Basic
    @javax.persistence.Column(name = "F130", nullable = false, insertable = true, updatable = true)
    public String getF130() {
        return f130;
    }

    public void setF130(String f130) {
        this.f130 = f130;
    }

    private String f131;

    @Basic
    @javax.persistence.Column(name = "F131", nullable = false, insertable = true, updatable = true)
    public String getF131() {
        return f131;
    }

    public void setF131(String f131) {
        this.f131 = f131;
    }

    private String f132;

    @Basic
    @javax.persistence.Column(name = "F132", nullable = false, insertable = true, updatable = true)
    public String getF132() {
        return f132;
    }

    public void setF132(String f132) {
        this.f132 = f132;
    }

    private String f133;

    @Basic
    @javax.persistence.Column(name = "F133", nullable = false, insertable = true, updatable = true)
    public String getF133() {
        return f133;
    }

    public void setF133(String f133) {
        this.f133 = f133;
    }

    private String f134;

    @Basic
    @javax.persistence.Column(name = "F134", nullable = false, insertable = true, updatable = true)
    public String getF134() {
        return f134;
    }

    public void setF134(String f134) {
        this.f134 = f134;
    }

    private String f135;

    @Basic
    @javax.persistence.Column(name = "F135", nullable = false, insertable = true, updatable = true)
    public String getF135() {
        return f135;
    }

    public void setF135(String f135) {
        this.f135 = f135;
    }

    private String f136;

    @Basic
    @javax.persistence.Column(name = "F136", nullable = false, insertable = true, updatable = true)
    public String getF136() {
        return f136;
    }

    public void setF136(String f136) {
        this.f136 = f136;
    }

    private String f137;

    @Basic
    @javax.persistence.Column(name = "F137", nullable = false, insertable = true, updatable = true)
    public String getF137() {
        return f137;
    }

    public void setF137(String f137) {
        this.f137 = f137;
    }

    private String f138;

    @Basic
    @javax.persistence.Column(name = "F138", nullable = false, insertable = true, updatable = true)
    public String getF138() {
        return f138;
    }

    public void setF138(String f138) {
        this.f138 = f138;
    }

    private String f139;

    @Basic
    @javax.persistence.Column(name = "F139", nullable = false, insertable = true, updatable = true)
    public String getF139() {
        return f139;
    }

    public void setF139(String f139) {
        this.f139 = f139;
    }

    private String f140;

    @Basic
    @javax.persistence.Column(name = "F140", nullable = false, insertable = true, updatable = true)
    public String getF140() {
        return f140;
    }

    public void setF140(String f140) {
        this.f140 = f140;
    }

    private String f141;

    @Basic
    @javax.persistence.Column(name = "F141", nullable = false, insertable = true, updatable = true)
    public String getF141() {
        return f141;
    }

    public void setF141(String f141) {
        this.f141 = f141;
    }

    private String f142;

    @Basic
    @javax.persistence.Column(name = "F142", nullable = false, insertable = true, updatable = true)
    public String getF142() {
        return f142;
    }

    public void setF142(String f142) {
        this.f142 = f142;
    }

    private String f143;

    @Basic
    @javax.persistence.Column(name = "F143", nullable = false, insertable = true, updatable = true)
    public String getF143() {
        return f143;
    }

    public void setF143(String f143) {
        this.f143 = f143;
    }

    private String f144;

    @Basic
    @javax.persistence.Column(name = "F144", nullable = false, insertable = true, updatable = true)
    public String getF144() {
        return f144;
    }

    public void setF144(String f144) {
        this.f144 = f144;
    }

    private String f145;

    @Basic
    @javax.persistence.Column(name = "F145", nullable = false, insertable = true, updatable = true)
    public String getF145() {
        return f145;
    }

    public void setF145(String f145) {
        this.f145 = f145;
    }

    private String f146;

    @Basic
    @javax.persistence.Column(name = "F146", nullable = false, insertable = true, updatable = true)
    public String getF146() {
        return f146;
    }

    public void setF146(String f146) {
        this.f146 = f146;
    }

    private String f147;

    @Basic
    @javax.persistence.Column(name = "F147", nullable = false, insertable = true, updatable = true)
    public String getF147() {
        return f147;
    }

    public void setF147(String f147) {
        this.f147 = f147;
    }

    private String f148;

    @Basic
    @javax.persistence.Column(name = "F148", nullable = false, insertable = true, updatable = true)
    public String getF148() {
        return f148;
    }

    public void setF148(String f148) {
        this.f148 = f148;
    }

    private String f149;

    @Basic
    @javax.persistence.Column(name = "F149", nullable = false, insertable = true, updatable = true)
    public String getF149() {
        return f149;
    }

    public void setF149(String f149) {
        this.f149 = f149;
    }

    private String f150;

    @Basic
    @javax.persistence.Column(name = "F150", nullable = false, insertable = true, updatable = true)
    public String getF150() {
        return f150;
    }

    public void setF150(String f150) {
        this.f150 = f150;
    }

    private String f151;

    @Basic
    @javax.persistence.Column(name = "F151", nullable = false, insertable = true, updatable = true)
    public String getF151() {
        return f151;
    }

    public void setF151(String f151) {
        this.f151 = f151;
    }

    private String f152;

    @Basic
    @javax.persistence.Column(name = "F152", nullable = false, insertable = true, updatable = true)
    public String getF152() {
        return f152;
    }

    public void setF152(String f152) {
        this.f152 = f152;
    }

    private String f153;

    @Basic
    @javax.persistence.Column(name = "F153", nullable = false, insertable = true, updatable = true)
    public String getF153() {
        return f153;
    }

    public void setF153(String f153) {
        this.f153 = f153;
    }

    private String f154;

    @Basic
    @javax.persistence.Column(name = "F154", nullable = false, insertable = true, updatable = true)
    public String getF154() {
        return f154;
    }

    public void setF154(String f154) {
        this.f154 = f154;
    }

    private String f155;

    @Basic
    @javax.persistence.Column(name = "F155", nullable = false, insertable = true, updatable = true)
    public String getF155() {
        return f155;
    }

    public void setF155(String f155) {
        this.f155 = f155;
    }

    private String f156;

    @Basic
    @javax.persistence.Column(name = "F156", nullable = false, insertable = true, updatable = true)
    public String getF156() {
        return f156;
    }

    public void setF156(String f156) {
        this.f156 = f156;
    }

    private String f157;

    @Basic
    @javax.persistence.Column(name = "F157", nullable = false, insertable = true, updatable = true)
    public String getF157() {
        return f157;
    }

    public void setF157(String f157) {
        this.f157 = f157;
    }

    private String f158;

    @Basic
    @javax.persistence.Column(name = "F158", nullable = false, insertable = true, updatable = true)
    public String getF158() {
        return f158;
    }

    public void setF158(String f158) {
        this.f158 = f158;
    }

    private String f159;

    @Basic
    @javax.persistence.Column(name = "F159", nullable = false, insertable = true, updatable = true)
    public String getF159() {
        return f159;
    }

    public void setF159(String f159) {
        this.f159 = f159;
    }

    private String f160;

    @Basic
    @javax.persistence.Column(name = "F160", nullable = false, insertable = true, updatable = true)
    public String getF160() {
        return f160;
    }

    public void setF160(String f160) {
        this.f160 = f160;
    }

    private String f161;

    @Basic
    @javax.persistence.Column(name = "F161", nullable = false, insertable = true, updatable = true)
    public String getF161() {
        return f161;
    }

    public void setF161(String f161) {
        this.f161 = f161;
    }

    private String f162;

    @Basic
    @javax.persistence.Column(name = "F162", nullable = false, insertable = true, updatable = true)
    public String getF162() {
        return f162;
    }

    public void setF162(String f162) {
        this.f162 = f162;
    }

    private String f163;

    @Basic
    @javax.persistence.Column(name = "F163", nullable = false, insertable = true, updatable = true)
    public String getF163() {
        return f163;
    }

    public void setF163(String f163) {
        this.f163 = f163;
    }

    private String f164;

    @Basic
    @javax.persistence.Column(name = "F164", nullable = false, insertable = true, updatable = true)
    public String getF164() {
        return f164;
    }

    public void setF164(String f164) {
        this.f164 = f164;
    }

    private String f165;

    @Basic
    @javax.persistence.Column(name = "F165", nullable = false, insertable = true, updatable = true)
    public String getF165() {
        return f165;
    }

    public void setF165(String f165) {
        this.f165 = f165;
    }

    private String f166;

    @Basic
    @javax.persistence.Column(name = "F166", nullable = false, insertable = true, updatable = true)
    public String getF166() {
        return f166;
    }

    public void setF166(String f166) {
        this.f166 = f166;
    }

    private String f167;

    @Basic
    @javax.persistence.Column(name = "F167", nullable = false, insertable = true, updatable = true)
    public String getF167() {
        return f167;
    }

    public void setF167(String f167) {
        this.f167 = f167;
    }

    private String f168;

    @Basic
    @javax.persistence.Column(name = "F168", nullable = false, insertable = true, updatable = true)
    public String getF168() {
        return f168;
    }

    public void setF168(String f168) {
        this.f168 = f168;
    }

    private String f169;

    @Basic
    @javax.persistence.Column(name = "F169", nullable = false, insertable = true, updatable = true)
    public String getF169() {
        return f169;
    }

    public void setF169(String f169) {
        this.f169 = f169;
    }

    private String f170;

    @Basic
    @javax.persistence.Column(name = "F170", nullable = false, insertable = true, updatable = true)
    public String getF170() {
        return f170;
    }

    public void setF170(String f170) {
        this.f170 = f170;
    }

    private String f171;

    @Basic
    @javax.persistence.Column(name = "F171", nullable = false, insertable = true, updatable = true)
    public String getF171() {
        return f171;
    }

    public void setF171(String f171) {
        this.f171 = f171;
    }

    private String f172;

    @Basic
    @javax.persistence.Column(name = "F172", nullable = false, insertable = true, updatable = true)
    public String getF172() {
        return f172;
    }

    public void setF172(String f172) {
        this.f172 = f172;
    }

    private String f173;

    @Basic
    @javax.persistence.Column(name = "F173", nullable = false, insertable = true, updatable = true)
    public String getF173() {
        return f173;
    }

    public void setF173(String f173) {
        this.f173 = f173;
    }

    private String f174;

    @Basic
    @javax.persistence.Column(name = "F174", nullable = false, insertable = true, updatable = true)
    public String getF174() {
        return f174;
    }

    public void setF174(String f174) {
        this.f174 = f174;
    }

    private String f175;

    @Basic
    @javax.persistence.Column(name = "F175", nullable = false, insertable = true, updatable = true)
    public String getF175() {
        return f175;
    }

    public void setF175(String f175) {
        this.f175 = f175;
    }

    private String f176;

    @Basic
    @javax.persistence.Column(name = "F176", nullable = false, insertable = true, updatable = true)
    public String getF176() {
        return f176;
    }

    public void setF176(String f176) {
        this.f176 = f176;
    }

    private String f177;

    @Basic
    @javax.persistence.Column(name = "F177", nullable = false, insertable = true, updatable = true)
    public String getF177() {
        return f177;
    }

    public void setF177(String f177) {
        this.f177 = f177;
    }

    private String f178;

    @Basic
    @javax.persistence.Column(name = "F178", nullable = false, insertable = true, updatable = true)
    public String getF178() {
        return f178;
    }

    public void setF178(String f178) {
        this.f178 = f178;
    }

    private String f179;

    @Basic
    @javax.persistence.Column(name = "F179", nullable = false, insertable = true, updatable = true)
    public String getF179() {
        return f179;
    }

    public void setF179(String f179) {
        this.f179 = f179;
    }

    private String f180;

    @Basic
    @javax.persistence.Column(name = "F180", nullable = false, insertable = true, updatable = true)
    public String getF180() {
        return f180;
    }

    public void setF180(String f180) {
        this.f180 = f180;
    }

    private String f181;

    @Basic
    @javax.persistence.Column(name = "F181", nullable = false, insertable = true, updatable = true)
    public String getF181() {
        return f181;
    }

    public void setF181(String f181) {
        this.f181 = f181;
    }

    private String f182;

    @Basic
    @javax.persistence.Column(name = "F182", nullable = false, insertable = true, updatable = true)
    public String getF182() {
        return f182;
    }

    public void setF182(String f182) {
        this.f182 = f182;
    }

    private String f183;

    @Basic
    @javax.persistence.Column(name = "F183", nullable = false, insertable = true, updatable = true)
    public String getF183() {
        return f183;
    }

    public void setF183(String f183) {
        this.f183 = f183;
    }

    private String f184;

    @Basic
    @javax.persistence.Column(name = "F184", nullable = false, insertable = true, updatable = true)
    public String getF184() {
        return f184;
    }

    public void setF184(String f184) {
        this.f184 = f184;
    }

    private String f185;

    @Basic
    @javax.persistence.Column(name = "F185", nullable = false, insertable = true, updatable = true)
    public String getF185() {
        return f185;
    }

    public void setF185(String f185) {
        this.f185 = f185;
    }

    private String f186;

    @Basic
    @javax.persistence.Column(name = "F186", nullable = false, insertable = true, updatable = true)
    public String getF186() {
        return f186;
    }

    public void setF186(String f186) {
        this.f186 = f186;
    }

    private String f187;

    @Basic
    @javax.persistence.Column(name = "F187", nullable = false, insertable = true, updatable = true)
    public String getF187() {
        return f187;
    }

    public void setF187(String f187) {
        this.f187 = f187;
    }

    private String f188;

    @Basic
    @javax.persistence.Column(name = "F188", nullable = false, insertable = true, updatable = true)
    public String getF188() {
        return f188;
    }

    public void setF188(String f188) {
        this.f188 = f188;
    }

    private String f189;

    @Basic
    @javax.persistence.Column(name = "F189", nullable = false, insertable = true, updatable = true)
    public String getF189() {
        return f189;
    }

    public void setF189(String f189) {
        this.f189 = f189;
    }

    private String f190;

    @Basic
    @javax.persistence.Column(name = "F190", nullable = false, insertable = true, updatable = true)
    public String getF190() {
        return f190;
    }

    public void setF190(String f190) {
        this.f190 = f190;
    }

    private String f191;

    @Basic
    @javax.persistence.Column(name = "F191", nullable = false, insertable = true, updatable = true)
    public String getF191() {
        return f191;
    }

    public void setF191(String f191) {
        this.f191 = f191;
    }

    private String f192;

    @Basic
    @javax.persistence.Column(name = "F192", nullable = false, insertable = true, updatable = true)
    public String getF192() {
        return f192;
    }

    public void setF192(String f192) {
        this.f192 = f192;
    }

    private String f193;

    @Basic
    @javax.persistence.Column(name = "F193", nullable = false, insertable = true, updatable = true)
    public String getF193() {
        return f193;
    }

    public void setF193(String f193) {
        this.f193 = f193;
    }

    private String f194;

    @Basic
    @javax.persistence.Column(name = "F194", nullable = false, insertable = true, updatable = true)
    public String getF194() {
        return f194;
    }

    public void setF194(String f194) {
        this.f194 = f194;
    }

    private String f195;

    @Basic
    @javax.persistence.Column(name = "F195", nullable = false, insertable = true, updatable = true)
    public String getF195() {
        return f195;
    }

    public void setF195(String f195) {
        this.f195 = f195;
    }

    private String f196;

    @Basic
    @javax.persistence.Column(name = "F196", nullable = false, insertable = true, updatable = true)
    public String getF196() {
        return f196;
    }

    public void setF196(String f196) {
        this.f196 = f196;
    }

    private String f197;

    @Basic
    @javax.persistence.Column(name = "F197", nullable = false, insertable = true, updatable = true)
    public String getF197() {
        return f197;
    }

    public void setF197(String f197) {
        this.f197 = f197;
    }

    private String f198;

    @Basic
    @javax.persistence.Column(name = "F198", nullable = false, insertable = true, updatable = true)
    public String getF198() {
        return f198;
    }

    public void setF198(String f198) {
        this.f198 = f198;
    }

    private String f199;

    @Basic
    @javax.persistence.Column(name = "F199", nullable = false, insertable = true, updatable = true)
    public String getF199() {
        return f199;
    }

    public void setF199(String f199) {
        this.f199 = f199;
    }

    private String f200;

    @Basic
    @javax.persistence.Column(name = "F200", nullable = false, insertable = true, updatable = true)
    public String getF200() {
        return f200;
    }

    public void setF200(String f200) {
        this.f200 = f200;
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

    private boolean desatualizada;

    @Basic
    @javax.persistence.Column(name = "Desatualizada", nullable = false, insertable = true, updatable = true)
    public boolean isDesatualizada() {
        return desatualizada;
    }

    public void setDesatualizada(boolean desatualizada) {
        this.desatualizada = desatualizada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdPautaFrequênciaMais that = (AcdPautaFrequênciaMais) o;

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
        if (pautaFrequênciaMaisId != that.pautaFrequênciaMaisId) return false;
        if (f100 != null ? !f100.equals(that.f100) : that.f100 != null) return false;
        if (f101 != null ? !f101.equals(that.f101) : that.f101 != null) return false;
        if (f102 != null ? !f102.equals(that.f102) : that.f102 != null) return false;
        if (f103 != null ? !f103.equals(that.f103) : that.f103 != null) return false;
        if (f104 != null ? !f104.equals(that.f104) : that.f104 != null) return false;
        if (f105 != null ? !f105.equals(that.f105) : that.f105 != null) return false;
        if (f106 != null ? !f106.equals(that.f106) : that.f106 != null) return false;
        if (f107 != null ? !f107.equals(that.f107) : that.f107 != null) return false;
        if (f108 != null ? !f108.equals(that.f108) : that.f108 != null) return false;
        if (f109 != null ? !f109.equals(that.f109) : that.f109 != null) return false;
        if (f110 != null ? !f110.equals(that.f110) : that.f110 != null) return false;
        if (f111 != null ? !f111.equals(that.f111) : that.f111 != null) return false;
        if (f112 != null ? !f112.equals(that.f112) : that.f112 != null) return false;
        if (f113 != null ? !f113.equals(that.f113) : that.f113 != null) return false;
        if (f114 != null ? !f114.equals(that.f114) : that.f114 != null) return false;
        if (f115 != null ? !f115.equals(that.f115) : that.f115 != null) return false;
        if (f116 != null ? !f116.equals(that.f116) : that.f116 != null) return false;
        if (f117 != null ? !f117.equals(that.f117) : that.f117 != null) return false;
        if (f118 != null ? !f118.equals(that.f118) : that.f118 != null) return false;
        if (f119 != null ? !f119.equals(that.f119) : that.f119 != null) return false;
        if (f120 != null ? !f120.equals(that.f120) : that.f120 != null) return false;
        if (f121 != null ? !f121.equals(that.f121) : that.f121 != null) return false;
        if (f122 != null ? !f122.equals(that.f122) : that.f122 != null) return false;
        if (f123 != null ? !f123.equals(that.f123) : that.f123 != null) return false;
        if (f124 != null ? !f124.equals(that.f124) : that.f124 != null) return false;
        if (f125 != null ? !f125.equals(that.f125) : that.f125 != null) return false;
        if (f126 != null ? !f126.equals(that.f126) : that.f126 != null) return false;
        if (f127 != null ? !f127.equals(that.f127) : that.f127 != null) return false;
        if (f128 != null ? !f128.equals(that.f128) : that.f128 != null) return false;
        if (f129 != null ? !f129.equals(that.f129) : that.f129 != null) return false;
        if (f130 != null ? !f130.equals(that.f130) : that.f130 != null) return false;
        if (f131 != null ? !f131.equals(that.f131) : that.f131 != null) return false;
        if (f132 != null ? !f132.equals(that.f132) : that.f132 != null) return false;
        if (f133 != null ? !f133.equals(that.f133) : that.f133 != null) return false;
        if (f134 != null ? !f134.equals(that.f134) : that.f134 != null) return false;
        if (f135 != null ? !f135.equals(that.f135) : that.f135 != null) return false;
        if (f136 != null ? !f136.equals(that.f136) : that.f136 != null) return false;
        if (f137 != null ? !f137.equals(that.f137) : that.f137 != null) return false;
        if (f138 != null ? !f138.equals(that.f138) : that.f138 != null) return false;
        if (f139 != null ? !f139.equals(that.f139) : that.f139 != null) return false;
        if (f140 != null ? !f140.equals(that.f140) : that.f140 != null) return false;
        if (f141 != null ? !f141.equals(that.f141) : that.f141 != null) return false;
        if (f142 != null ? !f142.equals(that.f142) : that.f142 != null) return false;
        if (f143 != null ? !f143.equals(that.f143) : that.f143 != null) return false;
        if (f144 != null ? !f144.equals(that.f144) : that.f144 != null) return false;
        if (f145 != null ? !f145.equals(that.f145) : that.f145 != null) return false;
        if (f146 != null ? !f146.equals(that.f146) : that.f146 != null) return false;
        if (f147 != null ? !f147.equals(that.f147) : that.f147 != null) return false;
        if (f148 != null ? !f148.equals(that.f148) : that.f148 != null) return false;
        if (f149 != null ? !f149.equals(that.f149) : that.f149 != null) return false;
        if (f150 != null ? !f150.equals(that.f150) : that.f150 != null) return false;
        if (f151 != null ? !f151.equals(that.f151) : that.f151 != null) return false;
        if (f152 != null ? !f152.equals(that.f152) : that.f152 != null) return false;
        if (f153 != null ? !f153.equals(that.f153) : that.f153 != null) return false;
        if (f154 != null ? !f154.equals(that.f154) : that.f154 != null) return false;
        if (f155 != null ? !f155.equals(that.f155) : that.f155 != null) return false;
        if (f156 != null ? !f156.equals(that.f156) : that.f156 != null) return false;
        if (f157 != null ? !f157.equals(that.f157) : that.f157 != null) return false;
        if (f158 != null ? !f158.equals(that.f158) : that.f158 != null) return false;
        if (f159 != null ? !f159.equals(that.f159) : that.f159 != null) return false;
        if (f160 != null ? !f160.equals(that.f160) : that.f160 != null) return false;
        if (f161 != null ? !f161.equals(that.f161) : that.f161 != null) return false;
        if (f162 != null ? !f162.equals(that.f162) : that.f162 != null) return false;
        if (f163 != null ? !f163.equals(that.f163) : that.f163 != null) return false;
        if (f164 != null ? !f164.equals(that.f164) : that.f164 != null) return false;
        if (f165 != null ? !f165.equals(that.f165) : that.f165 != null) return false;
        if (f166 != null ? !f166.equals(that.f166) : that.f166 != null) return false;
        if (f167 != null ? !f167.equals(that.f167) : that.f167 != null) return false;
        if (f168 != null ? !f168.equals(that.f168) : that.f168 != null) return false;
        if (f169 != null ? !f169.equals(that.f169) : that.f169 != null) return false;
        if (f170 != null ? !f170.equals(that.f170) : that.f170 != null) return false;
        if (f171 != null ? !f171.equals(that.f171) : that.f171 != null) return false;
        if (f172 != null ? !f172.equals(that.f172) : that.f172 != null) return false;
        if (f173 != null ? !f173.equals(that.f173) : that.f173 != null) return false;
        if (f174 != null ? !f174.equals(that.f174) : that.f174 != null) return false;
        if (f175 != null ? !f175.equals(that.f175) : that.f175 != null) return false;
        if (f176 != null ? !f176.equals(that.f176) : that.f176 != null) return false;
        if (f177 != null ? !f177.equals(that.f177) : that.f177 != null) return false;
        if (f178 != null ? !f178.equals(that.f178) : that.f178 != null) return false;
        if (f179 != null ? !f179.equals(that.f179) : that.f179 != null) return false;
        if (f180 != null ? !f180.equals(that.f180) : that.f180 != null) return false;
        if (f181 != null ? !f181.equals(that.f181) : that.f181 != null) return false;
        if (f182 != null ? !f182.equals(that.f182) : that.f182 != null) return false;
        if (f183 != null ? !f183.equals(that.f183) : that.f183 != null) return false;
        if (f184 != null ? !f184.equals(that.f184) : that.f184 != null) return false;
        if (f185 != null ? !f185.equals(that.f185) : that.f185 != null) return false;
        if (f186 != null ? !f186.equals(that.f186) : that.f186 != null) return false;
        if (f187 != null ? !f187.equals(that.f187) : that.f187 != null) return false;
        if (f188 != null ? !f188.equals(that.f188) : that.f188 != null) return false;
        if (f189 != null ? !f189.equals(that.f189) : that.f189 != null) return false;
        if (f190 != null ? !f190.equals(that.f190) : that.f190 != null) return false;
        if (f191 != null ? !f191.equals(that.f191) : that.f191 != null) return false;
        if (f192 != null ? !f192.equals(that.f192) : that.f192 != null) return false;
        if (f193 != null ? !f193.equals(that.f193) : that.f193 != null) return false;
        if (f194 != null ? !f194.equals(that.f194) : that.f194 != null) return false;
        if (f195 != null ? !f195.equals(that.f195) : that.f195 != null) return false;
        if (f196 != null ? !f196.equals(that.f196) : that.f196 != null) return false;
        if (f197 != null ? !f197.equals(that.f197) : that.f197 != null) return false;
        if (f198 != null ? !f198.equals(that.f198) : that.f198 != null) return false;
        if (f199 != null ? !f199.equals(that.f199) : that.f199 != null) return false;
        if (f200 != null ? !f200.equals(that.f200) : that.f200 != null) return false;
        if (processando != null ? !processando.equals(that.processando) : that.processando != null) return false;
        if (turma != null ? !turma.equals(that.turma) : that.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pautaFrequênciaMaisId ^ (pautaFrequênciaMaisId >>> 32));
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
        result = 31 * result + (f100 != null ? f100.hashCode() : 0);
        result = 31 * result + (f101 != null ? f101.hashCode() : 0);
        result = 31 * result + (f102 != null ? f102.hashCode() : 0);
        result = 31 * result + (f103 != null ? f103.hashCode() : 0);
        result = 31 * result + (f104 != null ? f104.hashCode() : 0);
        result = 31 * result + (f105 != null ? f105.hashCode() : 0);
        result = 31 * result + (f106 != null ? f106.hashCode() : 0);
        result = 31 * result + (f107 != null ? f107.hashCode() : 0);
        result = 31 * result + (f108 != null ? f108.hashCode() : 0);
        result = 31 * result + (f109 != null ? f109.hashCode() : 0);
        result = 31 * result + (f110 != null ? f110.hashCode() : 0);
        result = 31 * result + (f111 != null ? f111.hashCode() : 0);
        result = 31 * result + (f112 != null ? f112.hashCode() : 0);
        result = 31 * result + (f113 != null ? f113.hashCode() : 0);
        result = 31 * result + (f114 != null ? f114.hashCode() : 0);
        result = 31 * result + (f115 != null ? f115.hashCode() : 0);
        result = 31 * result + (f116 != null ? f116.hashCode() : 0);
        result = 31 * result + (f117 != null ? f117.hashCode() : 0);
        result = 31 * result + (f118 != null ? f118.hashCode() : 0);
        result = 31 * result + (f119 != null ? f119.hashCode() : 0);
        result = 31 * result + (f120 != null ? f120.hashCode() : 0);
        result = 31 * result + (f121 != null ? f121.hashCode() : 0);
        result = 31 * result + (f122 != null ? f122.hashCode() : 0);
        result = 31 * result + (f123 != null ? f123.hashCode() : 0);
        result = 31 * result + (f124 != null ? f124.hashCode() : 0);
        result = 31 * result + (f125 != null ? f125.hashCode() : 0);
        result = 31 * result + (f126 != null ? f126.hashCode() : 0);
        result = 31 * result + (f127 != null ? f127.hashCode() : 0);
        result = 31 * result + (f128 != null ? f128.hashCode() : 0);
        result = 31 * result + (f129 != null ? f129.hashCode() : 0);
        result = 31 * result + (f130 != null ? f130.hashCode() : 0);
        result = 31 * result + (f131 != null ? f131.hashCode() : 0);
        result = 31 * result + (f132 != null ? f132.hashCode() : 0);
        result = 31 * result + (f133 != null ? f133.hashCode() : 0);
        result = 31 * result + (f134 != null ? f134.hashCode() : 0);
        result = 31 * result + (f135 != null ? f135.hashCode() : 0);
        result = 31 * result + (f136 != null ? f136.hashCode() : 0);
        result = 31 * result + (f137 != null ? f137.hashCode() : 0);
        result = 31 * result + (f138 != null ? f138.hashCode() : 0);
        result = 31 * result + (f139 != null ? f139.hashCode() : 0);
        result = 31 * result + (f140 != null ? f140.hashCode() : 0);
        result = 31 * result + (f141 != null ? f141.hashCode() : 0);
        result = 31 * result + (f142 != null ? f142.hashCode() : 0);
        result = 31 * result + (f143 != null ? f143.hashCode() : 0);
        result = 31 * result + (f144 != null ? f144.hashCode() : 0);
        result = 31 * result + (f145 != null ? f145.hashCode() : 0);
        result = 31 * result + (f146 != null ? f146.hashCode() : 0);
        result = 31 * result + (f147 != null ? f147.hashCode() : 0);
        result = 31 * result + (f148 != null ? f148.hashCode() : 0);
        result = 31 * result + (f149 != null ? f149.hashCode() : 0);
        result = 31 * result + (f150 != null ? f150.hashCode() : 0);
        result = 31 * result + (f151 != null ? f151.hashCode() : 0);
        result = 31 * result + (f152 != null ? f152.hashCode() : 0);
        result = 31 * result + (f153 != null ? f153.hashCode() : 0);
        result = 31 * result + (f154 != null ? f154.hashCode() : 0);
        result = 31 * result + (f155 != null ? f155.hashCode() : 0);
        result = 31 * result + (f156 != null ? f156.hashCode() : 0);
        result = 31 * result + (f157 != null ? f157.hashCode() : 0);
        result = 31 * result + (f158 != null ? f158.hashCode() : 0);
        result = 31 * result + (f159 != null ? f159.hashCode() : 0);
        result = 31 * result + (f160 != null ? f160.hashCode() : 0);
        result = 31 * result + (f161 != null ? f161.hashCode() : 0);
        result = 31 * result + (f162 != null ? f162.hashCode() : 0);
        result = 31 * result + (f163 != null ? f163.hashCode() : 0);
        result = 31 * result + (f164 != null ? f164.hashCode() : 0);
        result = 31 * result + (f165 != null ? f165.hashCode() : 0);
        result = 31 * result + (f166 != null ? f166.hashCode() : 0);
        result = 31 * result + (f167 != null ? f167.hashCode() : 0);
        result = 31 * result + (f168 != null ? f168.hashCode() : 0);
        result = 31 * result + (f169 != null ? f169.hashCode() : 0);
        result = 31 * result + (f170 != null ? f170.hashCode() : 0);
        result = 31 * result + (f171 != null ? f171.hashCode() : 0);
        result = 31 * result + (f172 != null ? f172.hashCode() : 0);
        result = 31 * result + (f173 != null ? f173.hashCode() : 0);
        result = 31 * result + (f174 != null ? f174.hashCode() : 0);
        result = 31 * result + (f175 != null ? f175.hashCode() : 0);
        result = 31 * result + (f176 != null ? f176.hashCode() : 0);
        result = 31 * result + (f177 != null ? f177.hashCode() : 0);
        result = 31 * result + (f178 != null ? f178.hashCode() : 0);
        result = 31 * result + (f179 != null ? f179.hashCode() : 0);
        result = 31 * result + (f180 != null ? f180.hashCode() : 0);
        result = 31 * result + (f181 != null ? f181.hashCode() : 0);
        result = 31 * result + (f182 != null ? f182.hashCode() : 0);
        result = 31 * result + (f183 != null ? f183.hashCode() : 0);
        result = 31 * result + (f184 != null ? f184.hashCode() : 0);
        result = 31 * result + (f185 != null ? f185.hashCode() : 0);
        result = 31 * result + (f186 != null ? f186.hashCode() : 0);
        result = 31 * result + (f187 != null ? f187.hashCode() : 0);
        result = 31 * result + (f188 != null ? f188.hashCode() : 0);
        result = 31 * result + (f189 != null ? f189.hashCode() : 0);
        result = 31 * result + (f190 != null ? f190.hashCode() : 0);
        result = 31 * result + (f191 != null ? f191.hashCode() : 0);
        result = 31 * result + (f192 != null ? f192.hashCode() : 0);
        result = 31 * result + (f193 != null ? f193.hashCode() : 0);
        result = 31 * result + (f194 != null ? f194.hashCode() : 0);
        result = 31 * result + (f195 != null ? f195.hashCode() : 0);
        result = 31 * result + (f196 != null ? f196.hashCode() : 0);
        result = 31 * result + (f197 != null ? f197.hashCode() : 0);
        result = 31 * result + (f198 != null ? f198.hashCode() : 0);
        result = 31 * result + (f199 != null ? f199.hashCode() : 0);
        result = 31 * result + (f200 != null ? f200.hashCode() : 0);
        result = 31 * result + (processando != null ? processando.hashCode() : 0);
        result = 31 * result + (desatualizada ? 1 : 0);
        return result;
    }
}
