package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@javax.persistence.Table(name = "acdAulaConteúdoMais", schema = "dbo")
@IdClass(AcdAulaConteudoMaisPK.class)
public class AcdAulaConteudoMais {
    private long aulaConteúdoMaisId;

    @Basic
    @javax.persistence.Column(name = "AulaConteúdoMais_ID", nullable = false, insertable = true, updatable = true)
    public long getAulaConteúdoMaisId() {
        return aulaConteúdoMaisId;
    }

    public void setAulaConteúdoMaisId(long aulaConteúdoMaisId) {
        this.aulaConteúdoMaisId = aulaConteúdoMaisId;
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

    private Timestamp d100;

    @Basic
    @javax.persistence.Column(name = "D100", nullable = true, insertable = true, updatable = true)
    public Timestamp getD100() {
        return d100;
    }

    public void setD100(Timestamp d100) {
        this.d100 = d100;
    }

    private Timestamp d101;

    @Basic
    @javax.persistence.Column(name = "D101", nullable = true, insertable = true, updatable = true)
    public Timestamp getD101() {
        return d101;
    }

    public void setD101(Timestamp d101) {
        this.d101 = d101;
    }

    private Timestamp d102;

    @Basic
    @javax.persistence.Column(name = "D102", nullable = true, insertable = true, updatable = true)
    public Timestamp getD102() {
        return d102;
    }

    public void setD102(Timestamp d102) {
        this.d102 = d102;
    }

    private Timestamp d103;

    @Basic
    @javax.persistence.Column(name = "D103", nullable = true, insertable = true, updatable = true)
    public Timestamp getD103() {
        return d103;
    }

    public void setD103(Timestamp d103) {
        this.d103 = d103;
    }

    private Timestamp d104;

    @Basic
    @javax.persistence.Column(name = "D104", nullable = true, insertable = true, updatable = true)
    public Timestamp getD104() {
        return d104;
    }

    public void setD104(Timestamp d104) {
        this.d104 = d104;
    }

    private Timestamp d105;

    @Basic
    @javax.persistence.Column(name = "D105", nullable = true, insertable = true, updatable = true)
    public Timestamp getD105() {
        return d105;
    }

    public void setD105(Timestamp d105) {
        this.d105 = d105;
    }

    private Timestamp d106;

    @Basic
    @javax.persistence.Column(name = "D106", nullable = true, insertable = true, updatable = true)
    public Timestamp getD106() {
        return d106;
    }

    public void setD106(Timestamp d106) {
        this.d106 = d106;
    }

    private Timestamp d107;

    @Basic
    @javax.persistence.Column(name = "D107", nullable = true, insertable = true, updatable = true)
    public Timestamp getD107() {
        return d107;
    }

    public void setD107(Timestamp d107) {
        this.d107 = d107;
    }

    private Timestamp d108;

    @Basic
    @javax.persistence.Column(name = "D108", nullable = true, insertable = true, updatable = true)
    public Timestamp getD108() {
        return d108;
    }

    public void setD108(Timestamp d108) {
        this.d108 = d108;
    }

    private Timestamp d109;

    @Basic
    @javax.persistence.Column(name = "D109", nullable = true, insertable = true, updatable = true)
    public Timestamp getD109() {
        return d109;
    }

    public void setD109(Timestamp d109) {
        this.d109 = d109;
    }

    private Timestamp d110;

    @Basic
    @javax.persistence.Column(name = "D110", nullable = true, insertable = true, updatable = true)
    public Timestamp getD110() {
        return d110;
    }

    public void setD110(Timestamp d110) {
        this.d110 = d110;
    }

    private Timestamp d111;

    @Basic
    @javax.persistence.Column(name = "D111", nullable = true, insertable = true, updatable = true)
    public Timestamp getD111() {
        return d111;
    }

    public void setD111(Timestamp d111) {
        this.d111 = d111;
    }

    private Timestamp d112;

    @Basic
    @javax.persistence.Column(name = "D112", nullable = true, insertable = true, updatable = true)
    public Timestamp getD112() {
        return d112;
    }

    public void setD112(Timestamp d112) {
        this.d112 = d112;
    }

    private Timestamp d113;

    @Basic
    @javax.persistence.Column(name = "D113", nullable = true, insertable = true, updatable = true)
    public Timestamp getD113() {
        return d113;
    }

    public void setD113(Timestamp d113) {
        this.d113 = d113;
    }

    private Timestamp d114;

    @Basic
    @javax.persistence.Column(name = "D114", nullable = true, insertable = true, updatable = true)
    public Timestamp getD114() {
        return d114;
    }

    public void setD114(Timestamp d114) {
        this.d114 = d114;
    }

    private Timestamp d115;

    @Basic
    @javax.persistence.Column(name = "D115", nullable = true, insertable = true, updatable = true)
    public Timestamp getD115() {
        return d115;
    }

    public void setD115(Timestamp d115) {
        this.d115 = d115;
    }

    private Timestamp d116;

    @Basic
    @javax.persistence.Column(name = "D116", nullable = true, insertable = true, updatable = true)
    public Timestamp getD116() {
        return d116;
    }

    public void setD116(Timestamp d116) {
        this.d116 = d116;
    }

    private Timestamp d117;

    @Basic
    @javax.persistence.Column(name = "D117", nullable = true, insertable = true, updatable = true)
    public Timestamp getD117() {
        return d117;
    }

    public void setD117(Timestamp d117) {
        this.d117 = d117;
    }

    private Timestamp d118;

    @Basic
    @javax.persistence.Column(name = "D118", nullable = true, insertable = true, updatable = true)
    public Timestamp getD118() {
        return d118;
    }

    public void setD118(Timestamp d118) {
        this.d118 = d118;
    }

    private Timestamp d119;

    @Basic
    @javax.persistence.Column(name = "D119", nullable = true, insertable = true, updatable = true)
    public Timestamp getD119() {
        return d119;
    }

    public void setD119(Timestamp d119) {
        this.d119 = d119;
    }

    private Timestamp d120;

    @Basic
    @javax.persistence.Column(name = "D120", nullable = true, insertable = true, updatable = true)
    public Timestamp getD120() {
        return d120;
    }

    public void setD120(Timestamp d120) {
        this.d120 = d120;
    }

    private Timestamp d121;

    @Basic
    @javax.persistence.Column(name = "D121", nullable = true, insertable = true, updatable = true)
    public Timestamp getD121() {
        return d121;
    }

    public void setD121(Timestamp d121) {
        this.d121 = d121;
    }

    private Timestamp d122;

    @Basic
    @javax.persistence.Column(name = "D122", nullable = true, insertable = true, updatable = true)
    public Timestamp getD122() {
        return d122;
    }

    public void setD122(Timestamp d122) {
        this.d122 = d122;
    }

    private Timestamp d123;

    @Basic
    @javax.persistence.Column(name = "D123", nullable = true, insertable = true, updatable = true)
    public Timestamp getD123() {
        return d123;
    }

    public void setD123(Timestamp d123) {
        this.d123 = d123;
    }

    private Timestamp d124;

    @Basic
    @javax.persistence.Column(name = "D124", nullable = true, insertable = true, updatable = true)
    public Timestamp getD124() {
        return d124;
    }

    public void setD124(Timestamp d124) {
        this.d124 = d124;
    }

    private Timestamp d125;

    @Basic
    @javax.persistence.Column(name = "D125", nullable = true, insertable = true, updatable = true)
    public Timestamp getD125() {
        return d125;
    }

    public void setD125(Timestamp d125) {
        this.d125 = d125;
    }

    private Timestamp d126;

    @Basic
    @javax.persistence.Column(name = "D126", nullable = true, insertable = true, updatable = true)
    public Timestamp getD126() {
        return d126;
    }

    public void setD126(Timestamp d126) {
        this.d126 = d126;
    }

    private Timestamp d127;

    @Basic
    @javax.persistence.Column(name = "D127", nullable = true, insertable = true, updatable = true)
    public Timestamp getD127() {
        return d127;
    }

    public void setD127(Timestamp d127) {
        this.d127 = d127;
    }

    private Timestamp d128;

    @Basic
    @javax.persistence.Column(name = "D128", nullable = true, insertable = true, updatable = true)
    public Timestamp getD128() {
        return d128;
    }

    public void setD128(Timestamp d128) {
        this.d128 = d128;
    }

    private Timestamp d129;

    @Basic
    @javax.persistence.Column(name = "D129", nullable = true, insertable = true, updatable = true)
    public Timestamp getD129() {
        return d129;
    }

    public void setD129(Timestamp d129) {
        this.d129 = d129;
    }

    private Timestamp d130;

    @Basic
    @javax.persistence.Column(name = "D130", nullable = true, insertable = true, updatable = true)
    public Timestamp getD130() {
        return d130;
    }

    public void setD130(Timestamp d130) {
        this.d130 = d130;
    }

    private Timestamp d131;

    @Basic
    @javax.persistence.Column(name = "D131", nullable = true, insertable = true, updatable = true)
    public Timestamp getD131() {
        return d131;
    }

    public void setD131(Timestamp d131) {
        this.d131 = d131;
    }

    private Timestamp d132;

    @Basic
    @javax.persistence.Column(name = "D132", nullable = true, insertable = true, updatable = true)
    public Timestamp getD132() {
        return d132;
    }

    public void setD132(Timestamp d132) {
        this.d132 = d132;
    }

    private Timestamp d133;

    @Basic
    @javax.persistence.Column(name = "D133", nullable = true, insertable = true, updatable = true)
    public Timestamp getD133() {
        return d133;
    }

    public void setD133(Timestamp d133) {
        this.d133 = d133;
    }

    private Timestamp d134;

    @Basic
    @javax.persistence.Column(name = "D134", nullable = true, insertable = true, updatable = true)
    public Timestamp getD134() {
        return d134;
    }

    public void setD134(Timestamp d134) {
        this.d134 = d134;
    }

    private Timestamp d135;

    @Basic
    @javax.persistence.Column(name = "D135", nullable = true, insertable = true, updatable = true)
    public Timestamp getD135() {
        return d135;
    }

    public void setD135(Timestamp d135) {
        this.d135 = d135;
    }

    private Timestamp d136;

    @Basic
    @javax.persistence.Column(name = "D136", nullable = true, insertable = true, updatable = true)
    public Timestamp getD136() {
        return d136;
    }

    public void setD136(Timestamp d136) {
        this.d136 = d136;
    }

    private Timestamp d137;

    @Basic
    @javax.persistence.Column(name = "D137", nullable = true, insertable = true, updatable = true)
    public Timestamp getD137() {
        return d137;
    }

    public void setD137(Timestamp d137) {
        this.d137 = d137;
    }

    private Timestamp d138;

    @Basic
    @javax.persistence.Column(name = "D138", nullable = true, insertable = true, updatable = true)
    public Timestamp getD138() {
        return d138;
    }

    public void setD138(Timestamp d138) {
        this.d138 = d138;
    }

    private Timestamp d139;

    @Basic
    @javax.persistence.Column(name = "D139", nullable = true, insertable = true, updatable = true)
    public Timestamp getD139() {
        return d139;
    }

    public void setD139(Timestamp d139) {
        this.d139 = d139;
    }

    private Timestamp d140;

    @Basic
    @javax.persistence.Column(name = "D140", nullable = true, insertable = true, updatable = true)
    public Timestamp getD140() {
        return d140;
    }

    public void setD140(Timestamp d140) {
        this.d140 = d140;
    }

    private Timestamp d141;

    @Basic
    @javax.persistence.Column(name = "D141", nullable = true, insertable = true, updatable = true)
    public Timestamp getD141() {
        return d141;
    }

    public void setD141(Timestamp d141) {
        this.d141 = d141;
    }

    private Timestamp d142;

    @Basic
    @javax.persistence.Column(name = "D142", nullable = true, insertable = true, updatable = true)
    public Timestamp getD142() {
        return d142;
    }

    public void setD142(Timestamp d142) {
        this.d142 = d142;
    }

    private Timestamp d143;

    @Basic
    @javax.persistence.Column(name = "D143", nullable = true, insertable = true, updatable = true)
    public Timestamp getD143() {
        return d143;
    }

    public void setD143(Timestamp d143) {
        this.d143 = d143;
    }

    private Timestamp d144;

    @Basic
    @javax.persistence.Column(name = "D144", nullable = true, insertable = true, updatable = true)
    public Timestamp getD144() {
        return d144;
    }

    public void setD144(Timestamp d144) {
        this.d144 = d144;
    }

    private Timestamp d145;

    @Basic
    @javax.persistence.Column(name = "D145", nullable = true, insertable = true, updatable = true)
    public Timestamp getD145() {
        return d145;
    }

    public void setD145(Timestamp d145) {
        this.d145 = d145;
    }

    private Timestamp d146;

    @Basic
    @javax.persistence.Column(name = "D146", nullable = true, insertable = true, updatable = true)
    public Timestamp getD146() {
        return d146;
    }

    public void setD146(Timestamp d146) {
        this.d146 = d146;
    }

    private Timestamp d147;

    @Basic
    @javax.persistence.Column(name = "D147", nullable = true, insertable = true, updatable = true)
    public Timestamp getD147() {
        return d147;
    }

    public void setD147(Timestamp d147) {
        this.d147 = d147;
    }

    private Timestamp d148;

    @Basic
    @javax.persistence.Column(name = "D148", nullable = true, insertable = true, updatable = true)
    public Timestamp getD148() {
        return d148;
    }

    public void setD148(Timestamp d148) {
        this.d148 = d148;
    }

    private Timestamp d149;

    @Basic
    @javax.persistence.Column(name = "D149", nullable = true, insertable = true, updatable = true)
    public Timestamp getD149() {
        return d149;
    }

    public void setD149(Timestamp d149) {
        this.d149 = d149;
    }

    private Timestamp d150;

    @Basic
    @javax.persistence.Column(name = "D150", nullable = true, insertable = true, updatable = true)
    public Timestamp getD150() {
        return d150;
    }

    public void setD150(Timestamp d150) {
        this.d150 = d150;
    }

    private Timestamp d151;

    @Basic
    @javax.persistence.Column(name = "D151", nullable = true, insertable = true, updatable = true)
    public Timestamp getD151() {
        return d151;
    }

    public void setD151(Timestamp d151) {
        this.d151 = d151;
    }

    private Timestamp d152;

    @Basic
    @javax.persistence.Column(name = "D152", nullable = true, insertable = true, updatable = true)
    public Timestamp getD152() {
        return d152;
    }

    public void setD152(Timestamp d152) {
        this.d152 = d152;
    }

    private Timestamp d153;

    @Basic
    @javax.persistence.Column(name = "D153", nullable = true, insertable = true, updatable = true)
    public Timestamp getD153() {
        return d153;
    }

    public void setD153(Timestamp d153) {
        this.d153 = d153;
    }

    private Timestamp d154;

    @Basic
    @javax.persistence.Column(name = "D154", nullable = true, insertable = true, updatable = true)
    public Timestamp getD154() {
        return d154;
    }

    public void setD154(Timestamp d154) {
        this.d154 = d154;
    }

    private Timestamp d155;

    @Basic
    @javax.persistence.Column(name = "D155", nullable = true, insertable = true, updatable = true)
    public Timestamp getD155() {
        return d155;
    }

    public void setD155(Timestamp d155) {
        this.d155 = d155;
    }

    private Timestamp d156;

    @Basic
    @javax.persistence.Column(name = "D156", nullable = true, insertable = true, updatable = true)
    public Timestamp getD156() {
        return d156;
    }

    public void setD156(Timestamp d156) {
        this.d156 = d156;
    }

    private Timestamp d157;

    @Basic
    @javax.persistence.Column(name = "D157", nullable = true, insertable = true, updatable = true)
    public Timestamp getD157() {
        return d157;
    }

    public void setD157(Timestamp d157) {
        this.d157 = d157;
    }

    private Timestamp d158;

    @Basic
    @javax.persistence.Column(name = "D158", nullable = true, insertable = true, updatable = true)
    public Timestamp getD158() {
        return d158;
    }

    public void setD158(Timestamp d158) {
        this.d158 = d158;
    }

    private Timestamp d159;

    @Basic
    @javax.persistence.Column(name = "D159", nullable = true, insertable = true, updatable = true)
    public Timestamp getD159() {
        return d159;
    }

    public void setD159(Timestamp d159) {
        this.d159 = d159;
    }

    private Timestamp d160;

    @Basic
    @javax.persistence.Column(name = "D160", nullable = true, insertable = true, updatable = true)
    public Timestamp getD160() {
        return d160;
    }

    public void setD160(Timestamp d160) {
        this.d160 = d160;
    }

    private Timestamp d161;

    @Basic
    @javax.persistence.Column(name = "D161", nullable = true, insertable = true, updatable = true)
    public Timestamp getD161() {
        return d161;
    }

    public void setD161(Timestamp d161) {
        this.d161 = d161;
    }

    private Timestamp d162;

    @Basic
    @javax.persistence.Column(name = "D162", nullable = true, insertable = true, updatable = true)
    public Timestamp getD162() {
        return d162;
    }

    public void setD162(Timestamp d162) {
        this.d162 = d162;
    }

    private Timestamp d163;

    @Basic
    @javax.persistence.Column(name = "D163", nullable = true, insertable = true, updatable = true)
    public Timestamp getD163() {
        return d163;
    }

    public void setD163(Timestamp d163) {
        this.d163 = d163;
    }

    private Timestamp d164;

    @Basic
    @javax.persistence.Column(name = "D164", nullable = true, insertable = true, updatable = true)
    public Timestamp getD164() {
        return d164;
    }

    public void setD164(Timestamp d164) {
        this.d164 = d164;
    }

    private Timestamp d165;

    @Basic
    @javax.persistence.Column(name = "D165", nullable = true, insertable = true, updatable = true)
    public Timestamp getD165() {
        return d165;
    }

    public void setD165(Timestamp d165) {
        this.d165 = d165;
    }

    private Timestamp d166;

    @Basic
    @javax.persistence.Column(name = "D166", nullable = true, insertable = true, updatable = true)
    public Timestamp getD166() {
        return d166;
    }

    public void setD166(Timestamp d166) {
        this.d166 = d166;
    }

    private Timestamp d167;

    @Basic
    @javax.persistence.Column(name = "D167", nullable = true, insertable = true, updatable = true)
    public Timestamp getD167() {
        return d167;
    }

    public void setD167(Timestamp d167) {
        this.d167 = d167;
    }

    private Timestamp d168;

    @Basic
    @javax.persistence.Column(name = "D168", nullable = true, insertable = true, updatable = true)
    public Timestamp getD168() {
        return d168;
    }

    public void setD168(Timestamp d168) {
        this.d168 = d168;
    }

    private Timestamp d169;

    @Basic
    @javax.persistence.Column(name = "D169", nullable = true, insertable = true, updatable = true)
    public Timestamp getD169() {
        return d169;
    }

    public void setD169(Timestamp d169) {
        this.d169 = d169;
    }

    private Timestamp d170;

    @Basic
    @javax.persistence.Column(name = "D170", nullable = true, insertable = true, updatable = true)
    public Timestamp getD170() {
        return d170;
    }

    public void setD170(Timestamp d170) {
        this.d170 = d170;
    }

    private Timestamp d171;

    @Basic
    @javax.persistence.Column(name = "D171", nullable = true, insertable = true, updatable = true)
    public Timestamp getD171() {
        return d171;
    }

    public void setD171(Timestamp d171) {
        this.d171 = d171;
    }

    private Timestamp d172;

    @Basic
    @javax.persistence.Column(name = "D172", nullable = true, insertable = true, updatable = true)
    public Timestamp getD172() {
        return d172;
    }

    public void setD172(Timestamp d172) {
        this.d172 = d172;
    }

    private Timestamp d173;

    @Basic
    @javax.persistence.Column(name = "D173", nullable = true, insertable = true, updatable = true)
    public Timestamp getD173() {
        return d173;
    }

    public void setD173(Timestamp d173) {
        this.d173 = d173;
    }

    private Timestamp d174;

    @Basic
    @javax.persistence.Column(name = "D174", nullable = true, insertable = true, updatable = true)
    public Timestamp getD174() {
        return d174;
    }

    public void setD174(Timestamp d174) {
        this.d174 = d174;
    }

    private Timestamp d175;

    @Basic
    @javax.persistence.Column(name = "D175", nullable = true, insertable = true, updatable = true)
    public Timestamp getD175() {
        return d175;
    }

    public void setD175(Timestamp d175) {
        this.d175 = d175;
    }

    private Timestamp d176;

    @Basic
    @javax.persistence.Column(name = "D176", nullable = true, insertable = true, updatable = true)
    public Timestamp getD176() {
        return d176;
    }

    public void setD176(Timestamp d176) {
        this.d176 = d176;
    }

    private Timestamp d177;

    @Basic
    @javax.persistence.Column(name = "D177", nullable = true, insertable = true, updatable = true)
    public Timestamp getD177() {
        return d177;
    }

    public void setD177(Timestamp d177) {
        this.d177 = d177;
    }

    private Timestamp d178;

    @Basic
    @javax.persistence.Column(name = "D178", nullable = true, insertable = true, updatable = true)
    public Timestamp getD178() {
        return d178;
    }

    public void setD178(Timestamp d178) {
        this.d178 = d178;
    }

    private Timestamp d179;

    @Basic
    @javax.persistence.Column(name = "D179", nullable = true, insertable = true, updatable = true)
    public Timestamp getD179() {
        return d179;
    }

    public void setD179(Timestamp d179) {
        this.d179 = d179;
    }

    private Timestamp d180;

    @Basic
    @javax.persistence.Column(name = "D180", nullable = true, insertable = true, updatable = true)
    public Timestamp getD180() {
        return d180;
    }

    public void setD180(Timestamp d180) {
        this.d180 = d180;
    }

    private Timestamp d181;

    @Basic
    @javax.persistence.Column(name = "D181", nullable = true, insertable = true, updatable = true)
    public Timestamp getD181() {
        return d181;
    }

    public void setD181(Timestamp d181) {
        this.d181 = d181;
    }

    private Timestamp d182;

    @Basic
    @javax.persistence.Column(name = "D182", nullable = true, insertable = true, updatable = true)
    public Timestamp getD182() {
        return d182;
    }

    public void setD182(Timestamp d182) {
        this.d182 = d182;
    }

    private Timestamp d183;

    @Basic
    @javax.persistence.Column(name = "D183", nullable = true, insertable = true, updatable = true)
    public Timestamp getD183() {
        return d183;
    }

    public void setD183(Timestamp d183) {
        this.d183 = d183;
    }

    private Timestamp d184;

    @Basic
    @javax.persistence.Column(name = "D184", nullable = true, insertable = true, updatable = true)
    public Timestamp getD184() {
        return d184;
    }

    public void setD184(Timestamp d184) {
        this.d184 = d184;
    }

    private Timestamp d185;

    @Basic
    @javax.persistence.Column(name = "D185", nullable = true, insertable = true, updatable = true)
    public Timestamp getD185() {
        return d185;
    }

    public void setD185(Timestamp d185) {
        this.d185 = d185;
    }

    private Timestamp d186;

    @Basic
    @javax.persistence.Column(name = "D186", nullable = true, insertable = true, updatable = true)
    public Timestamp getD186() {
        return d186;
    }

    public void setD186(Timestamp d186) {
        this.d186 = d186;
    }

    private Timestamp d187;

    @Basic
    @javax.persistence.Column(name = "D187", nullable = true, insertable = true, updatable = true)
    public Timestamp getD187() {
        return d187;
    }

    public void setD187(Timestamp d187) {
        this.d187 = d187;
    }

    private Timestamp d188;

    @Basic
    @javax.persistence.Column(name = "D188", nullable = true, insertable = true, updatable = true)
    public Timestamp getD188() {
        return d188;
    }

    public void setD188(Timestamp d188) {
        this.d188 = d188;
    }

    private Timestamp d189;

    @Basic
    @javax.persistence.Column(name = "D189", nullable = true, insertable = true, updatable = true)
    public Timestamp getD189() {
        return d189;
    }

    public void setD189(Timestamp d189) {
        this.d189 = d189;
    }

    private Timestamp d190;

    @Basic
    @javax.persistence.Column(name = "D190", nullable = true, insertable = true, updatable = true)
    public Timestamp getD190() {
        return d190;
    }

    public void setD190(Timestamp d190) {
        this.d190 = d190;
    }

    private Timestamp d191;

    @Basic
    @javax.persistence.Column(name = "D191", nullable = true, insertable = true, updatable = true)
    public Timestamp getD191() {
        return d191;
    }

    public void setD191(Timestamp d191) {
        this.d191 = d191;
    }

    private Timestamp d192;

    @Basic
    @javax.persistence.Column(name = "D192", nullable = true, insertable = true, updatable = true)
    public Timestamp getD192() {
        return d192;
    }

    public void setD192(Timestamp d192) {
        this.d192 = d192;
    }

    private Timestamp d193;

    @Basic
    @javax.persistence.Column(name = "D193", nullable = true, insertable = true, updatable = true)
    public Timestamp getD193() {
        return d193;
    }

    public void setD193(Timestamp d193) {
        this.d193 = d193;
    }

    private Timestamp d194;

    @Basic
    @javax.persistence.Column(name = "D194", nullable = true, insertable = true, updatable = true)
    public Timestamp getD194() {
        return d194;
    }

    public void setD194(Timestamp d194) {
        this.d194 = d194;
    }

    private Timestamp d195;

    @Basic
    @javax.persistence.Column(name = "D195", nullable = true, insertable = true, updatable = true)
    public Timestamp getD195() {
        return d195;
    }

    public void setD195(Timestamp d195) {
        this.d195 = d195;
    }

    private Timestamp d196;

    @Basic
    @javax.persistence.Column(name = "D196", nullable = true, insertable = true, updatable = true)
    public Timestamp getD196() {
        return d196;
    }

    public void setD196(Timestamp d196) {
        this.d196 = d196;
    }

    private Timestamp d197;

    @Basic
    @javax.persistence.Column(name = "D197", nullable = true, insertable = true, updatable = true)
    public Timestamp getD197() {
        return d197;
    }

    public void setD197(Timestamp d197) {
        this.d197 = d197;
    }

    private Timestamp d198;

    @Basic
    @javax.persistence.Column(name = "D198", nullable = true, insertable = true, updatable = true)
    public Timestamp getD198() {
        return d198;
    }

    public void setD198(Timestamp d198) {
        this.d198 = d198;
    }

    private Timestamp d199;

    @Basic
    @javax.persistence.Column(name = "D199", nullable = true, insertable = true, updatable = true)
    public Timestamp getD199() {
        return d199;
    }

    public void setD199(Timestamp d199) {
        this.d199 = d199;
    }

    private Timestamp d200;

    @Basic
    @javax.persistence.Column(name = "D200", nullable = true, insertable = true, updatable = true)
    public Timestamp getD200() {
        return d200;
    }

    public void setD200(Timestamp d200) {
        this.d200 = d200;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAulaConteudoMais that = (AcdAulaConteudoMais) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (aulaConteúdoMaisId != that.aulaConteúdoMaisId) return false;
        if (bimestre != that.bimestre) return false;
        if (codCurso != that.codCurso) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codUnidade != that.codUnidade) return false;
        if (codDisciplinaPrincipal != null ? !codDisciplinaPrincipal.equals(that.codDisciplinaPrincipal) : that.codDisciplinaPrincipal != null)
            return false;
        if (codFórmula != null ? !codFórmula.equals(that.codFórmula) : that.codFórmula != null) return false;
        if (d100 != null ? !d100.equals(that.d100) : that.d100 != null) return false;
        if (d101 != null ? !d101.equals(that.d101) : that.d101 != null) return false;
        if (d102 != null ? !d102.equals(that.d102) : that.d102 != null) return false;
        if (d103 != null ? !d103.equals(that.d103) : that.d103 != null) return false;
        if (d104 != null ? !d104.equals(that.d104) : that.d104 != null) return false;
        if (d105 != null ? !d105.equals(that.d105) : that.d105 != null) return false;
        if (d106 != null ? !d106.equals(that.d106) : that.d106 != null) return false;
        if (d107 != null ? !d107.equals(that.d107) : that.d107 != null) return false;
        if (d108 != null ? !d108.equals(that.d108) : that.d108 != null) return false;
        if (d109 != null ? !d109.equals(that.d109) : that.d109 != null) return false;
        if (d110 != null ? !d110.equals(that.d110) : that.d110 != null) return false;
        if (d111 != null ? !d111.equals(that.d111) : that.d111 != null) return false;
        if (d112 != null ? !d112.equals(that.d112) : that.d112 != null) return false;
        if (d113 != null ? !d113.equals(that.d113) : that.d113 != null) return false;
        if (d114 != null ? !d114.equals(that.d114) : that.d114 != null) return false;
        if (d115 != null ? !d115.equals(that.d115) : that.d115 != null) return false;
        if (d116 != null ? !d116.equals(that.d116) : that.d116 != null) return false;
        if (d117 != null ? !d117.equals(that.d117) : that.d117 != null) return false;
        if (d118 != null ? !d118.equals(that.d118) : that.d118 != null) return false;
        if (d119 != null ? !d119.equals(that.d119) : that.d119 != null) return false;
        if (d120 != null ? !d120.equals(that.d120) : that.d120 != null) return false;
        if (d121 != null ? !d121.equals(that.d121) : that.d121 != null) return false;
        if (d122 != null ? !d122.equals(that.d122) : that.d122 != null) return false;
        if (d123 != null ? !d123.equals(that.d123) : that.d123 != null) return false;
        if (d124 != null ? !d124.equals(that.d124) : that.d124 != null) return false;
        if (d125 != null ? !d125.equals(that.d125) : that.d125 != null) return false;
        if (d126 != null ? !d126.equals(that.d126) : that.d126 != null) return false;
        if (d127 != null ? !d127.equals(that.d127) : that.d127 != null) return false;
        if (d128 != null ? !d128.equals(that.d128) : that.d128 != null) return false;
        if (d129 != null ? !d129.equals(that.d129) : that.d129 != null) return false;
        if (d130 != null ? !d130.equals(that.d130) : that.d130 != null) return false;
        if (d131 != null ? !d131.equals(that.d131) : that.d131 != null) return false;
        if (d132 != null ? !d132.equals(that.d132) : that.d132 != null) return false;
        if (d133 != null ? !d133.equals(that.d133) : that.d133 != null) return false;
        if (d134 != null ? !d134.equals(that.d134) : that.d134 != null) return false;
        if (d135 != null ? !d135.equals(that.d135) : that.d135 != null) return false;
        if (d136 != null ? !d136.equals(that.d136) : that.d136 != null) return false;
        if (d137 != null ? !d137.equals(that.d137) : that.d137 != null) return false;
        if (d138 != null ? !d138.equals(that.d138) : that.d138 != null) return false;
        if (d139 != null ? !d139.equals(that.d139) : that.d139 != null) return false;
        if (d140 != null ? !d140.equals(that.d140) : that.d140 != null) return false;
        if (d141 != null ? !d141.equals(that.d141) : that.d141 != null) return false;
        if (d142 != null ? !d142.equals(that.d142) : that.d142 != null) return false;
        if (d143 != null ? !d143.equals(that.d143) : that.d143 != null) return false;
        if (d144 != null ? !d144.equals(that.d144) : that.d144 != null) return false;
        if (d145 != null ? !d145.equals(that.d145) : that.d145 != null) return false;
        if (d146 != null ? !d146.equals(that.d146) : that.d146 != null) return false;
        if (d147 != null ? !d147.equals(that.d147) : that.d147 != null) return false;
        if (d148 != null ? !d148.equals(that.d148) : that.d148 != null) return false;
        if (d149 != null ? !d149.equals(that.d149) : that.d149 != null) return false;
        if (d150 != null ? !d150.equals(that.d150) : that.d150 != null) return false;
        if (d151 != null ? !d151.equals(that.d151) : that.d151 != null) return false;
        if (d152 != null ? !d152.equals(that.d152) : that.d152 != null) return false;
        if (d153 != null ? !d153.equals(that.d153) : that.d153 != null) return false;
        if (d154 != null ? !d154.equals(that.d154) : that.d154 != null) return false;
        if (d155 != null ? !d155.equals(that.d155) : that.d155 != null) return false;
        if (d156 != null ? !d156.equals(that.d156) : that.d156 != null) return false;
        if (d157 != null ? !d157.equals(that.d157) : that.d157 != null) return false;
        if (d158 != null ? !d158.equals(that.d158) : that.d158 != null) return false;
        if (d159 != null ? !d159.equals(that.d159) : that.d159 != null) return false;
        if (d160 != null ? !d160.equals(that.d160) : that.d160 != null) return false;
        if (d161 != null ? !d161.equals(that.d161) : that.d161 != null) return false;
        if (d162 != null ? !d162.equals(that.d162) : that.d162 != null) return false;
        if (d163 != null ? !d163.equals(that.d163) : that.d163 != null) return false;
        if (d164 != null ? !d164.equals(that.d164) : that.d164 != null) return false;
        if (d165 != null ? !d165.equals(that.d165) : that.d165 != null) return false;
        if (d166 != null ? !d166.equals(that.d166) : that.d166 != null) return false;
        if (d167 != null ? !d167.equals(that.d167) : that.d167 != null) return false;
        if (d168 != null ? !d168.equals(that.d168) : that.d168 != null) return false;
        if (d169 != null ? !d169.equals(that.d169) : that.d169 != null) return false;
        if (d170 != null ? !d170.equals(that.d170) : that.d170 != null) return false;
        if (d171 != null ? !d171.equals(that.d171) : that.d171 != null) return false;
        if (d172 != null ? !d172.equals(that.d172) : that.d172 != null) return false;
        if (d173 != null ? !d173.equals(that.d173) : that.d173 != null) return false;
        if (d174 != null ? !d174.equals(that.d174) : that.d174 != null) return false;
        if (d175 != null ? !d175.equals(that.d175) : that.d175 != null) return false;
        if (d176 != null ? !d176.equals(that.d176) : that.d176 != null) return false;
        if (d177 != null ? !d177.equals(that.d177) : that.d177 != null) return false;
        if (d178 != null ? !d178.equals(that.d178) : that.d178 != null) return false;
        if (d179 != null ? !d179.equals(that.d179) : that.d179 != null) return false;
        if (d180 != null ? !d180.equals(that.d180) : that.d180 != null) return false;
        if (d181 != null ? !d181.equals(that.d181) : that.d181 != null) return false;
        if (d182 != null ? !d182.equals(that.d182) : that.d182 != null) return false;
        if (d183 != null ? !d183.equals(that.d183) : that.d183 != null) return false;
        if (d184 != null ? !d184.equals(that.d184) : that.d184 != null) return false;
        if (d185 != null ? !d185.equals(that.d185) : that.d185 != null) return false;
        if (d186 != null ? !d186.equals(that.d186) : that.d186 != null) return false;
        if (d187 != null ? !d187.equals(that.d187) : that.d187 != null) return false;
        if (d188 != null ? !d188.equals(that.d188) : that.d188 != null) return false;
        if (d189 != null ? !d189.equals(that.d189) : that.d189 != null) return false;
        if (d190 != null ? !d190.equals(that.d190) : that.d190 != null) return false;
        if (d191 != null ? !d191.equals(that.d191) : that.d191 != null) return false;
        if (d192 != null ? !d192.equals(that.d192) : that.d192 != null) return false;
        if (d193 != null ? !d193.equals(that.d193) : that.d193 != null) return false;
        if (d194 != null ? !d194.equals(that.d194) : that.d194 != null) return false;
        if (d195 != null ? !d195.equals(that.d195) : that.d195 != null) return false;
        if (d196 != null ? !d196.equals(that.d196) : that.d196 != null) return false;
        if (d197 != null ? !d197.equals(that.d197) : that.d197 != null) return false;
        if (d198 != null ? !d198.equals(that.d198) : that.d198 != null) return false;
        if (d199 != null ? !d199.equals(that.d199) : that.d199 != null) return false;
        if (d200 != null ? !d200.equals(that.d200) : that.d200 != null) return false;
        if (turma != null ? !turma.equals(that.turma) : that.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (aulaConteúdoMaisId ^ (aulaConteúdoMaisId >>> 32));
        result = 31 * result + codDisciplina;
        result = 31 * result + anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + codCurso;
        result = 31 * result + (int) bimestre;
        result = 31 * result + (d100 != null ? d100.hashCode() : 0);
        result = 31 * result + (d101 != null ? d101.hashCode() : 0);
        result = 31 * result + (d102 != null ? d102.hashCode() : 0);
        result = 31 * result + (d103 != null ? d103.hashCode() : 0);
        result = 31 * result + (d104 != null ? d104.hashCode() : 0);
        result = 31 * result + (d105 != null ? d105.hashCode() : 0);
        result = 31 * result + (d106 != null ? d106.hashCode() : 0);
        result = 31 * result + (d107 != null ? d107.hashCode() : 0);
        result = 31 * result + (d108 != null ? d108.hashCode() : 0);
        result = 31 * result + (d109 != null ? d109.hashCode() : 0);
        result = 31 * result + (d110 != null ? d110.hashCode() : 0);
        result = 31 * result + (d111 != null ? d111.hashCode() : 0);
        result = 31 * result + (d112 != null ? d112.hashCode() : 0);
        result = 31 * result + (d113 != null ? d113.hashCode() : 0);
        result = 31 * result + (d114 != null ? d114.hashCode() : 0);
        result = 31 * result + (d115 != null ? d115.hashCode() : 0);
        result = 31 * result + (d116 != null ? d116.hashCode() : 0);
        result = 31 * result + (d117 != null ? d117.hashCode() : 0);
        result = 31 * result + (d118 != null ? d118.hashCode() : 0);
        result = 31 * result + (d119 != null ? d119.hashCode() : 0);
        result = 31 * result + (d120 != null ? d120.hashCode() : 0);
        result = 31 * result + (d121 != null ? d121.hashCode() : 0);
        result = 31 * result + (d122 != null ? d122.hashCode() : 0);
        result = 31 * result + (d123 != null ? d123.hashCode() : 0);
        result = 31 * result + (d124 != null ? d124.hashCode() : 0);
        result = 31 * result + (d125 != null ? d125.hashCode() : 0);
        result = 31 * result + (d126 != null ? d126.hashCode() : 0);
        result = 31 * result + (d127 != null ? d127.hashCode() : 0);
        result = 31 * result + (d128 != null ? d128.hashCode() : 0);
        result = 31 * result + (d129 != null ? d129.hashCode() : 0);
        result = 31 * result + (d130 != null ? d130.hashCode() : 0);
        result = 31 * result + (d131 != null ? d131.hashCode() : 0);
        result = 31 * result + (d132 != null ? d132.hashCode() : 0);
        result = 31 * result + (d133 != null ? d133.hashCode() : 0);
        result = 31 * result + (d134 != null ? d134.hashCode() : 0);
        result = 31 * result + (d135 != null ? d135.hashCode() : 0);
        result = 31 * result + (d136 != null ? d136.hashCode() : 0);
        result = 31 * result + (d137 != null ? d137.hashCode() : 0);
        result = 31 * result + (d138 != null ? d138.hashCode() : 0);
        result = 31 * result + (d139 != null ? d139.hashCode() : 0);
        result = 31 * result + (d140 != null ? d140.hashCode() : 0);
        result = 31 * result + (d141 != null ? d141.hashCode() : 0);
        result = 31 * result + (d142 != null ? d142.hashCode() : 0);
        result = 31 * result + (d143 != null ? d143.hashCode() : 0);
        result = 31 * result + (d144 != null ? d144.hashCode() : 0);
        result = 31 * result + (d145 != null ? d145.hashCode() : 0);
        result = 31 * result + (d146 != null ? d146.hashCode() : 0);
        result = 31 * result + (d147 != null ? d147.hashCode() : 0);
        result = 31 * result + (d148 != null ? d148.hashCode() : 0);
        result = 31 * result + (d149 != null ? d149.hashCode() : 0);
        result = 31 * result + (d150 != null ? d150.hashCode() : 0);
        result = 31 * result + (d151 != null ? d151.hashCode() : 0);
        result = 31 * result + (d152 != null ? d152.hashCode() : 0);
        result = 31 * result + (d153 != null ? d153.hashCode() : 0);
        result = 31 * result + (d154 != null ? d154.hashCode() : 0);
        result = 31 * result + (d155 != null ? d155.hashCode() : 0);
        result = 31 * result + (d156 != null ? d156.hashCode() : 0);
        result = 31 * result + (d157 != null ? d157.hashCode() : 0);
        result = 31 * result + (d158 != null ? d158.hashCode() : 0);
        result = 31 * result + (d159 != null ? d159.hashCode() : 0);
        result = 31 * result + (d160 != null ? d160.hashCode() : 0);
        result = 31 * result + (d161 != null ? d161.hashCode() : 0);
        result = 31 * result + (d162 != null ? d162.hashCode() : 0);
        result = 31 * result + (d163 != null ? d163.hashCode() : 0);
        result = 31 * result + (d164 != null ? d164.hashCode() : 0);
        result = 31 * result + (d165 != null ? d165.hashCode() : 0);
        result = 31 * result + (d166 != null ? d166.hashCode() : 0);
        result = 31 * result + (d167 != null ? d167.hashCode() : 0);
        result = 31 * result + (d168 != null ? d168.hashCode() : 0);
        result = 31 * result + (d169 != null ? d169.hashCode() : 0);
        result = 31 * result + (d170 != null ? d170.hashCode() : 0);
        result = 31 * result + (d171 != null ? d171.hashCode() : 0);
        result = 31 * result + (d172 != null ? d172.hashCode() : 0);
        result = 31 * result + (d173 != null ? d173.hashCode() : 0);
        result = 31 * result + (d174 != null ? d174.hashCode() : 0);
        result = 31 * result + (d175 != null ? d175.hashCode() : 0);
        result = 31 * result + (d176 != null ? d176.hashCode() : 0);
        result = 31 * result + (d177 != null ? d177.hashCode() : 0);
        result = 31 * result + (d178 != null ? d178.hashCode() : 0);
        result = 31 * result + (d179 != null ? d179.hashCode() : 0);
        result = 31 * result + (d180 != null ? d180.hashCode() : 0);
        result = 31 * result + (d181 != null ? d181.hashCode() : 0);
        result = 31 * result + (d182 != null ? d182.hashCode() : 0);
        result = 31 * result + (d183 != null ? d183.hashCode() : 0);
        result = 31 * result + (d184 != null ? d184.hashCode() : 0);
        result = 31 * result + (d185 != null ? d185.hashCode() : 0);
        result = 31 * result + (d186 != null ? d186.hashCode() : 0);
        result = 31 * result + (d187 != null ? d187.hashCode() : 0);
        result = 31 * result + (d188 != null ? d188.hashCode() : 0);
        result = 31 * result + (d189 != null ? d189.hashCode() : 0);
        result = 31 * result + (d190 != null ? d190.hashCode() : 0);
        result = 31 * result + (d191 != null ? d191.hashCode() : 0);
        result = 31 * result + (d192 != null ? d192.hashCode() : 0);
        result = 31 * result + (d193 != null ? d193.hashCode() : 0);
        result = 31 * result + (d194 != null ? d194.hashCode() : 0);
        result = 31 * result + (d195 != null ? d195.hashCode() : 0);
        result = 31 * result + (d196 != null ? d196.hashCode() : 0);
        result = 31 * result + (d197 != null ? d197.hashCode() : 0);
        result = 31 * result + (d198 != null ? d198.hashCode() : 0);
        result = 31 * result + (d199 != null ? d199.hashCode() : 0);
        result = 31 * result + (d200 != null ? d200.hashCode() : 0);
        result = 31 * result + (codDisciplinaPrincipal != null ? codDisciplinaPrincipal.hashCode() : 0);
        result = 31 * result + (codFórmula != null ? codFórmula.hashCode() : 0);
        return result;
    }
}
