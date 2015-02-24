package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(InsGabaritoPK.class)
public class InsGabarito {
    private int gabaritoId;

    @Basic
    @javax.persistence.Column(name = "Gabarito_ID", nullable = false, insertable = true, updatable = true)
    public int getGabaritoId() {
        return gabaritoId;
    }

    public void setGabaritoId(int gabaritoId) {
        this.gabaritoId = gabaritoId;
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

    private byte codGabarito;

    @Id
    @javax.persistence.Column(name = "CodGabarito", nullable = false, insertable = true, updatable = true)
    public byte getCodGabarito() {
        return codGabarito;
    }

    public void setCodGabarito(byte codGabarito) {
        this.codGabarito = codGabarito;
    }

    private String gabarito;

    @Basic
    @javax.persistence.Column(name = "Gabarito", nullable = true, insertable = true, updatable = true)
    public String getGabarito() {
        return gabarito;
    }

    public void setGabarito(String gabarito) {
        this.gabarito = gabarito;
    }

    private String resposta01;

    @Basic
    @javax.persistence.Column(name = "Resposta01", nullable = true, insertable = true, updatable = true)
    public String getResposta01() {
        return resposta01;
    }

    public void setResposta01(String resposta01) {
        this.resposta01 = resposta01;
    }

    private String resposta02;

    @Basic
    @javax.persistence.Column(name = "Resposta02", nullable = true, insertable = true, updatable = true)
    public String getResposta02() {
        return resposta02;
    }

    public void setResposta02(String resposta02) {
        this.resposta02 = resposta02;
    }

    private String resposta03;

    @Basic
    @javax.persistence.Column(name = "Resposta03", nullable = true, insertable = true, updatable = true)
    public String getResposta03() {
        return resposta03;
    }

    public void setResposta03(String resposta03) {
        this.resposta03 = resposta03;
    }

    private String resposta04;

    @Basic
    @javax.persistence.Column(name = "Resposta04", nullable = true, insertable = true, updatable = true)
    public String getResposta04() {
        return resposta04;
    }

    public void setResposta04(String resposta04) {
        this.resposta04 = resposta04;
    }

    private String resposta05;

    @Basic
    @javax.persistence.Column(name = "Resposta05", nullable = true, insertable = true, updatable = true)
    public String getResposta05() {
        return resposta05;
    }

    public void setResposta05(String resposta05) {
        this.resposta05 = resposta05;
    }

    private String resposta06;

    @Basic
    @javax.persistence.Column(name = "Resposta06", nullable = true, insertable = true, updatable = true)
    public String getResposta06() {
        return resposta06;
    }

    public void setResposta06(String resposta06) {
        this.resposta06 = resposta06;
    }

    private String resposta07;

    @Basic
    @javax.persistence.Column(name = "Resposta07", nullable = true, insertable = true, updatable = true)
    public String getResposta07() {
        return resposta07;
    }

    public void setResposta07(String resposta07) {
        this.resposta07 = resposta07;
    }

    private String resposta08;

    @Basic
    @javax.persistence.Column(name = "Resposta08", nullable = true, insertable = true, updatable = true)
    public String getResposta08() {
        return resposta08;
    }

    public void setResposta08(String resposta08) {
        this.resposta08 = resposta08;
    }

    private String resposta09;

    @Basic
    @javax.persistence.Column(name = "Resposta09", nullable = true, insertable = true, updatable = true)
    public String getResposta09() {
        return resposta09;
    }

    public void setResposta09(String resposta09) {
        this.resposta09 = resposta09;
    }

    private String resposta10;

    @Basic
    @javax.persistence.Column(name = "Resposta10", nullable = true, insertable = true, updatable = true)
    public String getResposta10() {
        return resposta10;
    }

    public void setResposta10(String resposta10) {
        this.resposta10 = resposta10;
    }

    private String resposta11;

    @Basic
    @javax.persistence.Column(name = "Resposta11", nullable = true, insertable = true, updatable = true)
    public String getResposta11() {
        return resposta11;
    }

    public void setResposta11(String resposta11) {
        this.resposta11 = resposta11;
    }

    private String resposta12;

    @Basic
    @javax.persistence.Column(name = "Resposta12", nullable = true, insertable = true, updatable = true)
    public String getResposta12() {
        return resposta12;
    }

    public void setResposta12(String resposta12) {
        this.resposta12 = resposta12;
    }

    private String resposta13;

    @Basic
    @javax.persistence.Column(name = "Resposta13", nullable = true, insertable = true, updatable = true)
    public String getResposta13() {
        return resposta13;
    }

    public void setResposta13(String resposta13) {
        this.resposta13 = resposta13;
    }

    private String resposta14;

    @Basic
    @javax.persistence.Column(name = "Resposta14", nullable = true, insertable = true, updatable = true)
    public String getResposta14() {
        return resposta14;
    }

    public void setResposta14(String resposta14) {
        this.resposta14 = resposta14;
    }

    private String resposta15;

    @Basic
    @javax.persistence.Column(name = "Resposta15", nullable = true, insertable = true, updatable = true)
    public String getResposta15() {
        return resposta15;
    }

    public void setResposta15(String resposta15) {
        this.resposta15 = resposta15;
    }

    private String resposta16;

    @Basic
    @javax.persistence.Column(name = "Resposta16", nullable = true, insertable = true, updatable = true)
    public String getResposta16() {
        return resposta16;
    }

    public void setResposta16(String resposta16) {
        this.resposta16 = resposta16;
    }

    private String resposta17;

    @Basic
    @javax.persistence.Column(name = "Resposta17", nullable = true, insertable = true, updatable = true)
    public String getResposta17() {
        return resposta17;
    }

    public void setResposta17(String resposta17) {
        this.resposta17 = resposta17;
    }

    private String resposta18;

    @Basic
    @javax.persistence.Column(name = "Resposta18", nullable = true, insertable = true, updatable = true)
    public String getResposta18() {
        return resposta18;
    }

    public void setResposta18(String resposta18) {
        this.resposta18 = resposta18;
    }

    private String resposta19;

    @Basic
    @javax.persistence.Column(name = "Resposta19", nullable = true, insertable = true, updatable = true)
    public String getResposta19() {
        return resposta19;
    }

    public void setResposta19(String resposta19) {
        this.resposta19 = resposta19;
    }

    private String resposta20;

    @Basic
    @javax.persistence.Column(name = "Resposta20", nullable = true, insertable = true, updatable = true)
    public String getResposta20() {
        return resposta20;
    }

    public void setResposta20(String resposta20) {
        this.resposta20 = resposta20;
    }

    private String resposta21;

    @Basic
    @javax.persistence.Column(name = "Resposta21", nullable = true, insertable = true, updatable = true)
    public String getResposta21() {
        return resposta21;
    }

    public void setResposta21(String resposta21) {
        this.resposta21 = resposta21;
    }

    private String resposta22;

    @Basic
    @javax.persistence.Column(name = "Resposta22", nullable = true, insertable = true, updatable = true)
    public String getResposta22() {
        return resposta22;
    }

    public void setResposta22(String resposta22) {
        this.resposta22 = resposta22;
    }

    private String resposta23;

    @Basic
    @javax.persistence.Column(name = "Resposta23", nullable = true, insertable = true, updatable = true)
    public String getResposta23() {
        return resposta23;
    }

    public void setResposta23(String resposta23) {
        this.resposta23 = resposta23;
    }

    private String resposta24;

    @Basic
    @javax.persistence.Column(name = "Resposta24", nullable = true, insertable = true, updatable = true)
    public String getResposta24() {
        return resposta24;
    }

    public void setResposta24(String resposta24) {
        this.resposta24 = resposta24;
    }

    private String resposta25;

    @Basic
    @javax.persistence.Column(name = "Resposta25", nullable = true, insertable = true, updatable = true)
    public String getResposta25() {
        return resposta25;
    }

    public void setResposta25(String resposta25) {
        this.resposta25 = resposta25;
    }

    private String resposta26;

    @Basic
    @javax.persistence.Column(name = "Resposta26", nullable = true, insertable = true, updatable = true)
    public String getResposta26() {
        return resposta26;
    }

    public void setResposta26(String resposta26) {
        this.resposta26 = resposta26;
    }

    private String resposta27;

    @Basic
    @javax.persistence.Column(name = "Resposta27", nullable = true, insertable = true, updatable = true)
    public String getResposta27() {
        return resposta27;
    }

    public void setResposta27(String resposta27) {
        this.resposta27 = resposta27;
    }

    private String resposta28;

    @Basic
    @javax.persistence.Column(name = "Resposta28", nullable = true, insertable = true, updatable = true)
    public String getResposta28() {
        return resposta28;
    }

    public void setResposta28(String resposta28) {
        this.resposta28 = resposta28;
    }

    private String resposta29;

    @Basic
    @javax.persistence.Column(name = "Resposta29", nullable = true, insertable = true, updatable = true)
    public String getResposta29() {
        return resposta29;
    }

    public void setResposta29(String resposta29) {
        this.resposta29 = resposta29;
    }

    private String resposta30;

    @Basic
    @javax.persistence.Column(name = "Resposta30", nullable = true, insertable = true, updatable = true)
    public String getResposta30() {
        return resposta30;
    }

    public void setResposta30(String resposta30) {
        this.resposta30 = resposta30;
    }

    private String resposta31;

    @Basic
    @javax.persistence.Column(name = "Resposta31", nullable = true, insertable = true, updatable = true)
    public String getResposta31() {
        return resposta31;
    }

    public void setResposta31(String resposta31) {
        this.resposta31 = resposta31;
    }

    private String resposta32;

    @Basic
    @javax.persistence.Column(name = "Resposta32", nullable = true, insertable = true, updatable = true)
    public String getResposta32() {
        return resposta32;
    }

    public void setResposta32(String resposta32) {
        this.resposta32 = resposta32;
    }

    private String resposta33;

    @Basic
    @javax.persistence.Column(name = "Resposta33", nullable = true, insertable = true, updatable = true)
    public String getResposta33() {
        return resposta33;
    }

    public void setResposta33(String resposta33) {
        this.resposta33 = resposta33;
    }

    private String resposta34;

    @Basic
    @javax.persistence.Column(name = "Resposta34", nullable = true, insertable = true, updatable = true)
    public String getResposta34() {
        return resposta34;
    }

    public void setResposta34(String resposta34) {
        this.resposta34 = resposta34;
    }

    private String resposta35;

    @Basic
    @javax.persistence.Column(name = "Resposta35", nullable = true, insertable = true, updatable = true)
    public String getResposta35() {
        return resposta35;
    }

    public void setResposta35(String resposta35) {
        this.resposta35 = resposta35;
    }

    private String resposta36;

    @Basic
    @javax.persistence.Column(name = "Resposta36", nullable = true, insertable = true, updatable = true)
    public String getResposta36() {
        return resposta36;
    }

    public void setResposta36(String resposta36) {
        this.resposta36 = resposta36;
    }

    private String resposta37;

    @Basic
    @javax.persistence.Column(name = "Resposta37", nullable = true, insertable = true, updatable = true)
    public String getResposta37() {
        return resposta37;
    }

    public void setResposta37(String resposta37) {
        this.resposta37 = resposta37;
    }

    private String resposta38;

    @Basic
    @javax.persistence.Column(name = "Resposta38", nullable = true, insertable = true, updatable = true)
    public String getResposta38() {
        return resposta38;
    }

    public void setResposta38(String resposta38) {
        this.resposta38 = resposta38;
    }

    private String resposta39;

    @Basic
    @javax.persistence.Column(name = "Resposta39", nullable = true, insertable = true, updatable = true)
    public String getResposta39() {
        return resposta39;
    }

    public void setResposta39(String resposta39) {
        this.resposta39 = resposta39;
    }

    private String resposta40;

    @Basic
    @javax.persistence.Column(name = "Resposta40", nullable = true, insertable = true, updatable = true)
    public String getResposta40() {
        return resposta40;
    }

    public void setResposta40(String resposta40) {
        this.resposta40 = resposta40;
    }

    private String resposta41;

    @Basic
    @javax.persistence.Column(name = "Resposta41", nullable = true, insertable = true, updatable = true)
    public String getResposta41() {
        return resposta41;
    }

    public void setResposta41(String resposta41) {
        this.resposta41 = resposta41;
    }

    private String resposta42;

    @Basic
    @javax.persistence.Column(name = "Resposta42", nullable = true, insertable = true, updatable = true)
    public String getResposta42() {
        return resposta42;
    }

    public void setResposta42(String resposta42) {
        this.resposta42 = resposta42;
    }

    private String resposta43;

    @Basic
    @javax.persistence.Column(name = "Resposta43", nullable = true, insertable = true, updatable = true)
    public String getResposta43() {
        return resposta43;
    }

    public void setResposta43(String resposta43) {
        this.resposta43 = resposta43;
    }

    private String resposta44;

    @Basic
    @javax.persistence.Column(name = "Resposta44", nullable = true, insertable = true, updatable = true)
    public String getResposta44() {
        return resposta44;
    }

    public void setResposta44(String resposta44) {
        this.resposta44 = resposta44;
    }

    private String resposta45;

    @Basic
    @javax.persistence.Column(name = "Resposta45", nullable = true, insertable = true, updatable = true)
    public String getResposta45() {
        return resposta45;
    }

    public void setResposta45(String resposta45) {
        this.resposta45 = resposta45;
    }

    private String resposta46;

    @Basic
    @javax.persistence.Column(name = "Resposta46", nullable = true, insertable = true, updatable = true)
    public String getResposta46() {
        return resposta46;
    }

    public void setResposta46(String resposta46) {
        this.resposta46 = resposta46;
    }

    private String resposta47;

    @Basic
    @javax.persistence.Column(name = "Resposta47", nullable = true, insertable = true, updatable = true)
    public String getResposta47() {
        return resposta47;
    }

    public void setResposta47(String resposta47) {
        this.resposta47 = resposta47;
    }

    private String resposta48;

    @Basic
    @javax.persistence.Column(name = "Resposta48", nullable = true, insertable = true, updatable = true)
    public String getResposta48() {
        return resposta48;
    }

    public void setResposta48(String resposta48) {
        this.resposta48 = resposta48;
    }

    private String resposta49;

    @Basic
    @javax.persistence.Column(name = "Resposta49", nullable = true, insertable = true, updatable = true)
    public String getResposta49() {
        return resposta49;
    }

    public void setResposta49(String resposta49) {
        this.resposta49 = resposta49;
    }

    private String resposta50;

    @Basic
    @javax.persistence.Column(name = "Resposta50", nullable = true, insertable = true, updatable = true)
    public String getResposta50() {
        return resposta50;
    }

    public void setResposta50(String resposta50) {
        this.resposta50 = resposta50;
    }

    private String resposta51;

    @Basic
    @javax.persistence.Column(name = "Resposta51", nullable = true, insertable = true, updatable = true)
    public String getResposta51() {
        return resposta51;
    }

    public void setResposta51(String resposta51) {
        this.resposta51 = resposta51;
    }

    private String resposta52;

    @Basic
    @javax.persistence.Column(name = "Resposta52", nullable = true, insertable = true, updatable = true)
    public String getResposta52() {
        return resposta52;
    }

    public void setResposta52(String resposta52) {
        this.resposta52 = resposta52;
    }

    private String resposta53;

    @Basic
    @javax.persistence.Column(name = "Resposta53", nullable = true, insertable = true, updatable = true)
    public String getResposta53() {
        return resposta53;
    }

    public void setResposta53(String resposta53) {
        this.resposta53 = resposta53;
    }

    private String resposta54;

    @Basic
    @javax.persistence.Column(name = "Resposta54", nullable = true, insertable = true, updatable = true)
    public String getResposta54() {
        return resposta54;
    }

    public void setResposta54(String resposta54) {
        this.resposta54 = resposta54;
    }

    private String resposta55;

    @Basic
    @javax.persistence.Column(name = "Resposta55", nullable = true, insertable = true, updatable = true)
    public String getResposta55() {
        return resposta55;
    }

    public void setResposta55(String resposta55) {
        this.resposta55 = resposta55;
    }

    private String resposta56;

    @Basic
    @javax.persistence.Column(name = "Resposta56", nullable = true, insertable = true, updatable = true)
    public String getResposta56() {
        return resposta56;
    }

    public void setResposta56(String resposta56) {
        this.resposta56 = resposta56;
    }

    private String resposta57;

    @Basic
    @javax.persistence.Column(name = "Resposta57", nullable = true, insertable = true, updatable = true)
    public String getResposta57() {
        return resposta57;
    }

    public void setResposta57(String resposta57) {
        this.resposta57 = resposta57;
    }

    private String resposta58;

    @Basic
    @javax.persistence.Column(name = "Resposta58", nullable = true, insertable = true, updatable = true)
    public String getResposta58() {
        return resposta58;
    }

    public void setResposta58(String resposta58) {
        this.resposta58 = resposta58;
    }

    private String resposta59;

    @Basic
    @javax.persistence.Column(name = "Resposta59", nullable = true, insertable = true, updatable = true)
    public String getResposta59() {
        return resposta59;
    }

    public void setResposta59(String resposta59) {
        this.resposta59 = resposta59;
    }

    private String resposta60;

    @Basic
    @javax.persistence.Column(name = "Resposta60", nullable = true, insertable = true, updatable = true)
    public String getResposta60() {
        return resposta60;
    }

    public void setResposta60(String resposta60) {
        this.resposta60 = resposta60;
    }

    private Integer codDisciplina01;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina01", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina01() {
        return codDisciplina01;
    }

    public void setCodDisciplina01(Integer codDisciplina01) {
        this.codDisciplina01 = codDisciplina01;
    }

    private Integer codDisciplina02;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina02", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina02() {
        return codDisciplina02;
    }

    public void setCodDisciplina02(Integer codDisciplina02) {
        this.codDisciplina02 = codDisciplina02;
    }

    private Integer codDisciplina03;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina03", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina03() {
        return codDisciplina03;
    }

    public void setCodDisciplina03(Integer codDisciplina03) {
        this.codDisciplina03 = codDisciplina03;
    }

    private Integer codDisciplina04;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina04", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina04() {
        return codDisciplina04;
    }

    public void setCodDisciplina04(Integer codDisciplina04) {
        this.codDisciplina04 = codDisciplina04;
    }

    private Integer codDisciplina05;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina05", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina05() {
        return codDisciplina05;
    }

    public void setCodDisciplina05(Integer codDisciplina05) {
        this.codDisciplina05 = codDisciplina05;
    }

    private Integer codDisciplina06;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina06", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina06() {
        return codDisciplina06;
    }

    public void setCodDisciplina06(Integer codDisciplina06) {
        this.codDisciplina06 = codDisciplina06;
    }

    private Integer codDisciplina07;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina07", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina07() {
        return codDisciplina07;
    }

    public void setCodDisciplina07(Integer codDisciplina07) {
        this.codDisciplina07 = codDisciplina07;
    }

    private Integer codDisciplina08;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina08", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina08() {
        return codDisciplina08;
    }

    public void setCodDisciplina08(Integer codDisciplina08) {
        this.codDisciplina08 = codDisciplina08;
    }

    private Integer codDisciplina09;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina09", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina09() {
        return codDisciplina09;
    }

    public void setCodDisciplina09(Integer codDisciplina09) {
        this.codDisciplina09 = codDisciplina09;
    }

    private Integer codDisciplina10;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina10", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina10() {
        return codDisciplina10;
    }

    public void setCodDisciplina10(Integer codDisciplina10) {
        this.codDisciplina10 = codDisciplina10;
    }

    private Integer codDisciplina11;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina11", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina11() {
        return codDisciplina11;
    }

    public void setCodDisciplina11(Integer codDisciplina11) {
        this.codDisciplina11 = codDisciplina11;
    }

    private Integer codDisciplina12;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina12", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina12() {
        return codDisciplina12;
    }

    public void setCodDisciplina12(Integer codDisciplina12) {
        this.codDisciplina12 = codDisciplina12;
    }

    private Integer codDisciplina13;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina13", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina13() {
        return codDisciplina13;
    }

    public void setCodDisciplina13(Integer codDisciplina13) {
        this.codDisciplina13 = codDisciplina13;
    }

    private Integer codDisciplina14;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina14", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina14() {
        return codDisciplina14;
    }

    public void setCodDisciplina14(Integer codDisciplina14) {
        this.codDisciplina14 = codDisciplina14;
    }

    private Integer codDisciplina15;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina15", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina15() {
        return codDisciplina15;
    }

    public void setCodDisciplina15(Integer codDisciplina15) {
        this.codDisciplina15 = codDisciplina15;
    }

    private Integer codDisciplina16;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina16", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina16() {
        return codDisciplina16;
    }

    public void setCodDisciplina16(Integer codDisciplina16) {
        this.codDisciplina16 = codDisciplina16;
    }

    private Integer codDisciplina17;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina17", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina17() {
        return codDisciplina17;
    }

    public void setCodDisciplina17(Integer codDisciplina17) {
        this.codDisciplina17 = codDisciplina17;
    }

    private Integer codDisciplina18;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina18", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina18() {
        return codDisciplina18;
    }

    public void setCodDisciplina18(Integer codDisciplina18) {
        this.codDisciplina18 = codDisciplina18;
    }

    private Integer codDisciplina19;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina19", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina19() {
        return codDisciplina19;
    }

    public void setCodDisciplina19(Integer codDisciplina19) {
        this.codDisciplina19 = codDisciplina19;
    }

    private Integer codDisciplina20;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina20", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina20() {
        return codDisciplina20;
    }

    public void setCodDisciplina20(Integer codDisciplina20) {
        this.codDisciplina20 = codDisciplina20;
    }

    private Integer início01;

    @Basic
    @javax.persistence.Column(name = "Início01", nullable = true, insertable = true, updatable = true)
    public Integer getInício01() {
        return início01;
    }

    public void setInício01(Integer início01) {
        this.início01 = início01;
    }

    private Integer início02;

    @Basic
    @javax.persistence.Column(name = "Início02", nullable = true, insertable = true, updatable = true)
    public Integer getInício02() {
        return início02;
    }

    public void setInício02(Integer início02) {
        this.início02 = início02;
    }

    private Integer início03;

    @Basic
    @javax.persistence.Column(name = "Início03", nullable = true, insertable = true, updatable = true)
    public Integer getInício03() {
        return início03;
    }

    public void setInício03(Integer início03) {
        this.início03 = início03;
    }

    private Integer início04;

    @Basic
    @javax.persistence.Column(name = "Início04", nullable = true, insertable = true, updatable = true)
    public Integer getInício04() {
        return início04;
    }

    public void setInício04(Integer início04) {
        this.início04 = início04;
    }

    private Integer início05;

    @Basic
    @javax.persistence.Column(name = "Início05", nullable = true, insertable = true, updatable = true)
    public Integer getInício05() {
        return início05;
    }

    public void setInício05(Integer início05) {
        this.início05 = início05;
    }

    private Integer início06;

    @Basic
    @javax.persistence.Column(name = "Início06", nullable = true, insertable = true, updatable = true)
    public Integer getInício06() {
        return início06;
    }

    public void setInício06(Integer início06) {
        this.início06 = início06;
    }

    private Integer início07;

    @Basic
    @javax.persistence.Column(name = "Início07", nullable = true, insertable = true, updatable = true)
    public Integer getInício07() {
        return início07;
    }

    public void setInício07(Integer início07) {
        this.início07 = início07;
    }

    private Integer início08;

    @Basic
    @javax.persistence.Column(name = "Início08", nullable = true, insertable = true, updatable = true)
    public Integer getInício08() {
        return início08;
    }

    public void setInício08(Integer início08) {
        this.início08 = início08;
    }

    private Integer início09;

    @Basic
    @javax.persistence.Column(name = "Início09", nullable = true, insertable = true, updatable = true)
    public Integer getInício09() {
        return início09;
    }

    public void setInício09(Integer início09) {
        this.início09 = início09;
    }

    private Integer início10;

    @Basic
    @javax.persistence.Column(name = "Início10", nullable = true, insertable = true, updatable = true)
    public Integer getInício10() {
        return início10;
    }

    public void setInício10(Integer início10) {
        this.início10 = início10;
    }

    private Integer início11;

    @Basic
    @javax.persistence.Column(name = "Início11", nullable = true, insertable = true, updatable = true)
    public Integer getInício11() {
        return início11;
    }

    public void setInício11(Integer início11) {
        this.início11 = início11;
    }

    private Integer início12;

    @Basic
    @javax.persistence.Column(name = "Início12", nullable = true, insertable = true, updatable = true)
    public Integer getInício12() {
        return início12;
    }

    public void setInício12(Integer início12) {
        this.início12 = início12;
    }

    private Integer início13;

    @Basic
    @javax.persistence.Column(name = "Início13", nullable = true, insertable = true, updatable = true)
    public Integer getInício13() {
        return início13;
    }

    public void setInício13(Integer início13) {
        this.início13 = início13;
    }

    private Integer início14;

    @Basic
    @javax.persistence.Column(name = "Início14", nullable = true, insertable = true, updatable = true)
    public Integer getInício14() {
        return início14;
    }

    public void setInício14(Integer início14) {
        this.início14 = início14;
    }

    private Integer início15;

    @Basic
    @javax.persistence.Column(name = "Início15", nullable = true, insertable = true, updatable = true)
    public Integer getInício15() {
        return início15;
    }

    public void setInício15(Integer início15) {
        this.início15 = início15;
    }

    private Integer início16;

    @Basic
    @javax.persistence.Column(name = "Início16", nullable = true, insertable = true, updatable = true)
    public Integer getInício16() {
        return início16;
    }

    public void setInício16(Integer início16) {
        this.início16 = início16;
    }

    private Integer início17;

    @Basic
    @javax.persistence.Column(name = "Início17", nullable = true, insertable = true, updatable = true)
    public Integer getInício17() {
        return início17;
    }

    public void setInício17(Integer início17) {
        this.início17 = início17;
    }

    private Integer início18;

    @Basic
    @javax.persistence.Column(name = "Início18", nullable = true, insertable = true, updatable = true)
    public Integer getInício18() {
        return início18;
    }

    public void setInício18(Integer início18) {
        this.início18 = início18;
    }

    private Integer início19;

    @Basic
    @javax.persistence.Column(name = "Início19", nullable = true, insertable = true, updatable = true)
    public Integer getInício19() {
        return início19;
    }

    public void setInício19(Integer início19) {
        this.início19 = início19;
    }

    private Integer início20;

    @Basic
    @javax.persistence.Column(name = "Início20", nullable = true, insertable = true, updatable = true)
    public Integer getInício20() {
        return início20;
    }

    public void setInício20(Integer início20) {
        this.início20 = início20;
    }

    private Integer final01;

    @Basic
    @javax.persistence.Column(name = "Final01", nullable = true, insertable = true, updatable = true)
    public Integer getFinal01() {
        return final01;
    }

    public void setFinal01(Integer final01) {
        this.final01 = final01;
    }

    private Integer final02;

    @Basic
    @javax.persistence.Column(name = "Final02", nullable = true, insertable = true, updatable = true)
    public Integer getFinal02() {
        return final02;
    }

    public void setFinal02(Integer final02) {
        this.final02 = final02;
    }

    private Integer final03;

    @Basic
    @javax.persistence.Column(name = "Final03", nullable = true, insertable = true, updatable = true)
    public Integer getFinal03() {
        return final03;
    }

    public void setFinal03(Integer final03) {
        this.final03 = final03;
    }

    private Integer final04;

    @Basic
    @javax.persistence.Column(name = "Final04", nullable = true, insertable = true, updatable = true)
    public Integer getFinal04() {
        return final04;
    }

    public void setFinal04(Integer final04) {
        this.final04 = final04;
    }

    private Integer final05;

    @Basic
    @javax.persistence.Column(name = "Final05", nullable = true, insertable = true, updatable = true)
    public Integer getFinal05() {
        return final05;
    }

    public void setFinal05(Integer final05) {
        this.final05 = final05;
    }

    private Integer final06;

    @Basic
    @javax.persistence.Column(name = "Final06", nullable = true, insertable = true, updatable = true)
    public Integer getFinal06() {
        return final06;
    }

    public void setFinal06(Integer final06) {
        this.final06 = final06;
    }

    private Integer final07;

    @Basic
    @javax.persistence.Column(name = "Final07", nullable = true, insertable = true, updatable = true)
    public Integer getFinal07() {
        return final07;
    }

    public void setFinal07(Integer final07) {
        this.final07 = final07;
    }

    private Integer final08;

    @Basic
    @javax.persistence.Column(name = "Final08", nullable = true, insertable = true, updatable = true)
    public Integer getFinal08() {
        return final08;
    }

    public void setFinal08(Integer final08) {
        this.final08 = final08;
    }

    private Integer final09;

    @Basic
    @javax.persistence.Column(name = "Final09", nullable = true, insertable = true, updatable = true)
    public Integer getFinal09() {
        return final09;
    }

    public void setFinal09(Integer final09) {
        this.final09 = final09;
    }

    private Integer final10;

    @Basic
    @javax.persistence.Column(name = "Final10", nullable = true, insertable = true, updatable = true)
    public Integer getFinal10() {
        return final10;
    }

    public void setFinal10(Integer final10) {
        this.final10 = final10;
    }

    private Integer final11;

    @Basic
    @javax.persistence.Column(name = "Final11", nullable = true, insertable = true, updatable = true)
    public Integer getFinal11() {
        return final11;
    }

    public void setFinal11(Integer final11) {
        this.final11 = final11;
    }

    private Integer final12;

    @Basic
    @javax.persistence.Column(name = "Final12", nullable = true, insertable = true, updatable = true)
    public Integer getFinal12() {
        return final12;
    }

    public void setFinal12(Integer final12) {
        this.final12 = final12;
    }

    private Integer final13;

    @Basic
    @javax.persistence.Column(name = "Final13", nullable = true, insertable = true, updatable = true)
    public Integer getFinal13() {
        return final13;
    }

    public void setFinal13(Integer final13) {
        this.final13 = final13;
    }

    private Integer final14;

    @Basic
    @javax.persistence.Column(name = "Final14", nullable = true, insertable = true, updatable = true)
    public Integer getFinal14() {
        return final14;
    }

    public void setFinal14(Integer final14) {
        this.final14 = final14;
    }

    private Integer final15;

    @Basic
    @javax.persistence.Column(name = "Final15", nullable = true, insertable = true, updatable = true)
    public Integer getFinal15() {
        return final15;
    }

    public void setFinal15(Integer final15) {
        this.final15 = final15;
    }

    private Integer final16;

    @Basic
    @javax.persistence.Column(name = "Final16", nullable = true, insertable = true, updatable = true)
    public Integer getFinal16() {
        return final16;
    }

    public void setFinal16(Integer final16) {
        this.final16 = final16;
    }

    private Integer final17;

    @Basic
    @javax.persistence.Column(name = "Final17", nullable = true, insertable = true, updatable = true)
    public Integer getFinal17() {
        return final17;
    }

    public void setFinal17(Integer final17) {
        this.final17 = final17;
    }

    private Integer final18;

    @Basic
    @javax.persistence.Column(name = "Final18", nullable = true, insertable = true, updatable = true)
    public Integer getFinal18() {
        return final18;
    }

    public void setFinal18(Integer final18) {
        this.final18 = final18;
    }

    private Integer final19;

    @Basic
    @javax.persistence.Column(name = "Final19", nullable = true, insertable = true, updatable = true)
    public Integer getFinal19() {
        return final19;
    }

    public void setFinal19(Integer final19) {
        this.final19 = final19;
    }

    private Integer final20;

    @Basic
    @javax.persistence.Column(name = "Final20", nullable = true, insertable = true, updatable = true)
    public Integer getFinal20() {
        return final20;
    }

    public void setFinal20(Integer final20) {
        this.final20 = final20;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsGabarito that = (InsGabarito) o;

        if (codGabarito != that.codGabarito) return false;
        if (codInscrição != that.codInscrição) return false;
        if (codUnidade != that.codUnidade) return false;
        if (gabaritoId != that.gabaritoId) return false;
        if (codDisciplina01 != null ? !codDisciplina01.equals(that.codDisciplina01) : that.codDisciplina01 != null)
            return false;
        if (codDisciplina02 != null ? !codDisciplina02.equals(that.codDisciplina02) : that.codDisciplina02 != null)
            return false;
        if (codDisciplina03 != null ? !codDisciplina03.equals(that.codDisciplina03) : that.codDisciplina03 != null)
            return false;
        if (codDisciplina04 != null ? !codDisciplina04.equals(that.codDisciplina04) : that.codDisciplina04 != null)
            return false;
        if (codDisciplina05 != null ? !codDisciplina05.equals(that.codDisciplina05) : that.codDisciplina05 != null)
            return false;
        if (codDisciplina06 != null ? !codDisciplina06.equals(that.codDisciplina06) : that.codDisciplina06 != null)
            return false;
        if (codDisciplina07 != null ? !codDisciplina07.equals(that.codDisciplina07) : that.codDisciplina07 != null)
            return false;
        if (codDisciplina08 != null ? !codDisciplina08.equals(that.codDisciplina08) : that.codDisciplina08 != null)
            return false;
        if (codDisciplina09 != null ? !codDisciplina09.equals(that.codDisciplina09) : that.codDisciplina09 != null)
            return false;
        if (codDisciplina10 != null ? !codDisciplina10.equals(that.codDisciplina10) : that.codDisciplina10 != null)
            return false;
        if (codDisciplina11 != null ? !codDisciplina11.equals(that.codDisciplina11) : that.codDisciplina11 != null)
            return false;
        if (codDisciplina12 != null ? !codDisciplina12.equals(that.codDisciplina12) : that.codDisciplina12 != null)
            return false;
        if (codDisciplina13 != null ? !codDisciplina13.equals(that.codDisciplina13) : that.codDisciplina13 != null)
            return false;
        if (codDisciplina14 != null ? !codDisciplina14.equals(that.codDisciplina14) : that.codDisciplina14 != null)
            return false;
        if (codDisciplina15 != null ? !codDisciplina15.equals(that.codDisciplina15) : that.codDisciplina15 != null)
            return false;
        if (codDisciplina16 != null ? !codDisciplina16.equals(that.codDisciplina16) : that.codDisciplina16 != null)
            return false;
        if (codDisciplina17 != null ? !codDisciplina17.equals(that.codDisciplina17) : that.codDisciplina17 != null)
            return false;
        if (codDisciplina18 != null ? !codDisciplina18.equals(that.codDisciplina18) : that.codDisciplina18 != null)
            return false;
        if (codDisciplina19 != null ? !codDisciplina19.equals(that.codDisciplina19) : that.codDisciplina19 != null)
            return false;
        if (codDisciplina20 != null ? !codDisciplina20.equals(that.codDisciplina20) : that.codDisciplina20 != null)
            return false;
        if (final01 != null ? !final01.equals(that.final01) : that.final01 != null) return false;
        if (final02 != null ? !final02.equals(that.final02) : that.final02 != null) return false;
        if (final03 != null ? !final03.equals(that.final03) : that.final03 != null) return false;
        if (final04 != null ? !final04.equals(that.final04) : that.final04 != null) return false;
        if (final05 != null ? !final05.equals(that.final05) : that.final05 != null) return false;
        if (final06 != null ? !final06.equals(that.final06) : that.final06 != null) return false;
        if (final07 != null ? !final07.equals(that.final07) : that.final07 != null) return false;
        if (final08 != null ? !final08.equals(that.final08) : that.final08 != null) return false;
        if (final09 != null ? !final09.equals(that.final09) : that.final09 != null) return false;
        if (final10 != null ? !final10.equals(that.final10) : that.final10 != null) return false;
        if (final11 != null ? !final11.equals(that.final11) : that.final11 != null) return false;
        if (final12 != null ? !final12.equals(that.final12) : that.final12 != null) return false;
        if (final13 != null ? !final13.equals(that.final13) : that.final13 != null) return false;
        if (final14 != null ? !final14.equals(that.final14) : that.final14 != null) return false;
        if (final15 != null ? !final15.equals(that.final15) : that.final15 != null) return false;
        if (final16 != null ? !final16.equals(that.final16) : that.final16 != null) return false;
        if (final17 != null ? !final17.equals(that.final17) : that.final17 != null) return false;
        if (final18 != null ? !final18.equals(that.final18) : that.final18 != null) return false;
        if (final19 != null ? !final19.equals(that.final19) : that.final19 != null) return false;
        if (final20 != null ? !final20.equals(that.final20) : that.final20 != null) return false;
        if (gabarito != null ? !gabarito.equals(that.gabarito) : that.gabarito != null) return false;
        if (início01 != null ? !início01.equals(that.início01) : that.início01 != null) return false;
        if (início02 != null ? !início02.equals(that.início02) : that.início02 != null) return false;
        if (início03 != null ? !início03.equals(that.início03) : that.início03 != null) return false;
        if (início04 != null ? !início04.equals(that.início04) : that.início04 != null) return false;
        if (início05 != null ? !início05.equals(that.início05) : that.início05 != null) return false;
        if (início06 != null ? !início06.equals(that.início06) : that.início06 != null) return false;
        if (início07 != null ? !início07.equals(that.início07) : that.início07 != null) return false;
        if (início08 != null ? !início08.equals(that.início08) : that.início08 != null) return false;
        if (início09 != null ? !início09.equals(that.início09) : that.início09 != null) return false;
        if (início10 != null ? !início10.equals(that.início10) : that.início10 != null) return false;
        if (início11 != null ? !início11.equals(that.início11) : that.início11 != null) return false;
        if (início12 != null ? !início12.equals(that.início12) : that.início12 != null) return false;
        if (início13 != null ? !início13.equals(that.início13) : that.início13 != null) return false;
        if (início14 != null ? !início14.equals(that.início14) : that.início14 != null) return false;
        if (início15 != null ? !início15.equals(that.início15) : that.início15 != null) return false;
        if (início16 != null ? !início16.equals(that.início16) : that.início16 != null) return false;
        if (início17 != null ? !início17.equals(that.início17) : that.início17 != null) return false;
        if (início18 != null ? !início18.equals(that.início18) : that.início18 != null) return false;
        if (início19 != null ? !início19.equals(that.início19) : that.início19 != null) return false;
        if (início20 != null ? !início20.equals(that.início20) : that.início20 != null) return false;
        if (resposta01 != null ? !resposta01.equals(that.resposta01) : that.resposta01 != null) return false;
        if (resposta02 != null ? !resposta02.equals(that.resposta02) : that.resposta02 != null) return false;
        if (resposta03 != null ? !resposta03.equals(that.resposta03) : that.resposta03 != null) return false;
        if (resposta04 != null ? !resposta04.equals(that.resposta04) : that.resposta04 != null) return false;
        if (resposta05 != null ? !resposta05.equals(that.resposta05) : that.resposta05 != null) return false;
        if (resposta06 != null ? !resposta06.equals(that.resposta06) : that.resposta06 != null) return false;
        if (resposta07 != null ? !resposta07.equals(that.resposta07) : that.resposta07 != null) return false;
        if (resposta08 != null ? !resposta08.equals(that.resposta08) : that.resposta08 != null) return false;
        if (resposta09 != null ? !resposta09.equals(that.resposta09) : that.resposta09 != null) return false;
        if (resposta10 != null ? !resposta10.equals(that.resposta10) : that.resposta10 != null) return false;
        if (resposta11 != null ? !resposta11.equals(that.resposta11) : that.resposta11 != null) return false;
        if (resposta12 != null ? !resposta12.equals(that.resposta12) : that.resposta12 != null) return false;
        if (resposta13 != null ? !resposta13.equals(that.resposta13) : that.resposta13 != null) return false;
        if (resposta14 != null ? !resposta14.equals(that.resposta14) : that.resposta14 != null) return false;
        if (resposta15 != null ? !resposta15.equals(that.resposta15) : that.resposta15 != null) return false;
        if (resposta16 != null ? !resposta16.equals(that.resposta16) : that.resposta16 != null) return false;
        if (resposta17 != null ? !resposta17.equals(that.resposta17) : that.resposta17 != null) return false;
        if (resposta18 != null ? !resposta18.equals(that.resposta18) : that.resposta18 != null) return false;
        if (resposta19 != null ? !resposta19.equals(that.resposta19) : that.resposta19 != null) return false;
        if (resposta20 != null ? !resposta20.equals(that.resposta20) : that.resposta20 != null) return false;
        if (resposta21 != null ? !resposta21.equals(that.resposta21) : that.resposta21 != null) return false;
        if (resposta22 != null ? !resposta22.equals(that.resposta22) : that.resposta22 != null) return false;
        if (resposta23 != null ? !resposta23.equals(that.resposta23) : that.resposta23 != null) return false;
        if (resposta24 != null ? !resposta24.equals(that.resposta24) : that.resposta24 != null) return false;
        if (resposta25 != null ? !resposta25.equals(that.resposta25) : that.resposta25 != null) return false;
        if (resposta26 != null ? !resposta26.equals(that.resposta26) : that.resposta26 != null) return false;
        if (resposta27 != null ? !resposta27.equals(that.resposta27) : that.resposta27 != null) return false;
        if (resposta28 != null ? !resposta28.equals(that.resposta28) : that.resposta28 != null) return false;
        if (resposta29 != null ? !resposta29.equals(that.resposta29) : that.resposta29 != null) return false;
        if (resposta30 != null ? !resposta30.equals(that.resposta30) : that.resposta30 != null) return false;
        if (resposta31 != null ? !resposta31.equals(that.resposta31) : that.resposta31 != null) return false;
        if (resposta32 != null ? !resposta32.equals(that.resposta32) : that.resposta32 != null) return false;
        if (resposta33 != null ? !resposta33.equals(that.resposta33) : that.resposta33 != null) return false;
        if (resposta34 != null ? !resposta34.equals(that.resposta34) : that.resposta34 != null) return false;
        if (resposta35 != null ? !resposta35.equals(that.resposta35) : that.resposta35 != null) return false;
        if (resposta36 != null ? !resposta36.equals(that.resposta36) : that.resposta36 != null) return false;
        if (resposta37 != null ? !resposta37.equals(that.resposta37) : that.resposta37 != null) return false;
        if (resposta38 != null ? !resposta38.equals(that.resposta38) : that.resposta38 != null) return false;
        if (resposta39 != null ? !resposta39.equals(that.resposta39) : that.resposta39 != null) return false;
        if (resposta40 != null ? !resposta40.equals(that.resposta40) : that.resposta40 != null) return false;
        if (resposta41 != null ? !resposta41.equals(that.resposta41) : that.resposta41 != null) return false;
        if (resposta42 != null ? !resposta42.equals(that.resposta42) : that.resposta42 != null) return false;
        if (resposta43 != null ? !resposta43.equals(that.resposta43) : that.resposta43 != null) return false;
        if (resposta44 != null ? !resposta44.equals(that.resposta44) : that.resposta44 != null) return false;
        if (resposta45 != null ? !resposta45.equals(that.resposta45) : that.resposta45 != null) return false;
        if (resposta46 != null ? !resposta46.equals(that.resposta46) : that.resposta46 != null) return false;
        if (resposta47 != null ? !resposta47.equals(that.resposta47) : that.resposta47 != null) return false;
        if (resposta48 != null ? !resposta48.equals(that.resposta48) : that.resposta48 != null) return false;
        if (resposta49 != null ? !resposta49.equals(that.resposta49) : that.resposta49 != null) return false;
        if (resposta50 != null ? !resposta50.equals(that.resposta50) : that.resposta50 != null) return false;
        if (resposta51 != null ? !resposta51.equals(that.resposta51) : that.resposta51 != null) return false;
        if (resposta52 != null ? !resposta52.equals(that.resposta52) : that.resposta52 != null) return false;
        if (resposta53 != null ? !resposta53.equals(that.resposta53) : that.resposta53 != null) return false;
        if (resposta54 != null ? !resposta54.equals(that.resposta54) : that.resposta54 != null) return false;
        if (resposta55 != null ? !resposta55.equals(that.resposta55) : that.resposta55 != null) return false;
        if (resposta56 != null ? !resposta56.equals(that.resposta56) : that.resposta56 != null) return false;
        if (resposta57 != null ? !resposta57.equals(that.resposta57) : that.resposta57 != null) return false;
        if (resposta58 != null ? !resposta58.equals(that.resposta58) : that.resposta58 != null) return false;
        if (resposta59 != null ? !resposta59.equals(that.resposta59) : that.resposta59 != null) return false;
        if (resposta60 != null ? !resposta60.equals(that.resposta60) : that.resposta60 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gabaritoId;
        result = 31 * result + codUnidade;
        result = 31 * result + codInscrição;
        result = 31 * result + (int) codGabarito;
        result = 31 * result + (gabarito != null ? gabarito.hashCode() : 0);
        result = 31 * result + (resposta01 != null ? resposta01.hashCode() : 0);
        result = 31 * result + (resposta02 != null ? resposta02.hashCode() : 0);
        result = 31 * result + (resposta03 != null ? resposta03.hashCode() : 0);
        result = 31 * result + (resposta04 != null ? resposta04.hashCode() : 0);
        result = 31 * result + (resposta05 != null ? resposta05.hashCode() : 0);
        result = 31 * result + (resposta06 != null ? resposta06.hashCode() : 0);
        result = 31 * result + (resposta07 != null ? resposta07.hashCode() : 0);
        result = 31 * result + (resposta08 != null ? resposta08.hashCode() : 0);
        result = 31 * result + (resposta09 != null ? resposta09.hashCode() : 0);
        result = 31 * result + (resposta10 != null ? resposta10.hashCode() : 0);
        result = 31 * result + (resposta11 != null ? resposta11.hashCode() : 0);
        result = 31 * result + (resposta12 != null ? resposta12.hashCode() : 0);
        result = 31 * result + (resposta13 != null ? resposta13.hashCode() : 0);
        result = 31 * result + (resposta14 != null ? resposta14.hashCode() : 0);
        result = 31 * result + (resposta15 != null ? resposta15.hashCode() : 0);
        result = 31 * result + (resposta16 != null ? resposta16.hashCode() : 0);
        result = 31 * result + (resposta17 != null ? resposta17.hashCode() : 0);
        result = 31 * result + (resposta18 != null ? resposta18.hashCode() : 0);
        result = 31 * result + (resposta19 != null ? resposta19.hashCode() : 0);
        result = 31 * result + (resposta20 != null ? resposta20.hashCode() : 0);
        result = 31 * result + (resposta21 != null ? resposta21.hashCode() : 0);
        result = 31 * result + (resposta22 != null ? resposta22.hashCode() : 0);
        result = 31 * result + (resposta23 != null ? resposta23.hashCode() : 0);
        result = 31 * result + (resposta24 != null ? resposta24.hashCode() : 0);
        result = 31 * result + (resposta25 != null ? resposta25.hashCode() : 0);
        result = 31 * result + (resposta26 != null ? resposta26.hashCode() : 0);
        result = 31 * result + (resposta27 != null ? resposta27.hashCode() : 0);
        result = 31 * result + (resposta28 != null ? resposta28.hashCode() : 0);
        result = 31 * result + (resposta29 != null ? resposta29.hashCode() : 0);
        result = 31 * result + (resposta30 != null ? resposta30.hashCode() : 0);
        result = 31 * result + (resposta31 != null ? resposta31.hashCode() : 0);
        result = 31 * result + (resposta32 != null ? resposta32.hashCode() : 0);
        result = 31 * result + (resposta33 != null ? resposta33.hashCode() : 0);
        result = 31 * result + (resposta34 != null ? resposta34.hashCode() : 0);
        result = 31 * result + (resposta35 != null ? resposta35.hashCode() : 0);
        result = 31 * result + (resposta36 != null ? resposta36.hashCode() : 0);
        result = 31 * result + (resposta37 != null ? resposta37.hashCode() : 0);
        result = 31 * result + (resposta38 != null ? resposta38.hashCode() : 0);
        result = 31 * result + (resposta39 != null ? resposta39.hashCode() : 0);
        result = 31 * result + (resposta40 != null ? resposta40.hashCode() : 0);
        result = 31 * result + (resposta41 != null ? resposta41.hashCode() : 0);
        result = 31 * result + (resposta42 != null ? resposta42.hashCode() : 0);
        result = 31 * result + (resposta43 != null ? resposta43.hashCode() : 0);
        result = 31 * result + (resposta44 != null ? resposta44.hashCode() : 0);
        result = 31 * result + (resposta45 != null ? resposta45.hashCode() : 0);
        result = 31 * result + (resposta46 != null ? resposta46.hashCode() : 0);
        result = 31 * result + (resposta47 != null ? resposta47.hashCode() : 0);
        result = 31 * result + (resposta48 != null ? resposta48.hashCode() : 0);
        result = 31 * result + (resposta49 != null ? resposta49.hashCode() : 0);
        result = 31 * result + (resposta50 != null ? resposta50.hashCode() : 0);
        result = 31 * result + (resposta51 != null ? resposta51.hashCode() : 0);
        result = 31 * result + (resposta52 != null ? resposta52.hashCode() : 0);
        result = 31 * result + (resposta53 != null ? resposta53.hashCode() : 0);
        result = 31 * result + (resposta54 != null ? resposta54.hashCode() : 0);
        result = 31 * result + (resposta55 != null ? resposta55.hashCode() : 0);
        result = 31 * result + (resposta56 != null ? resposta56.hashCode() : 0);
        result = 31 * result + (resposta57 != null ? resposta57.hashCode() : 0);
        result = 31 * result + (resposta58 != null ? resposta58.hashCode() : 0);
        result = 31 * result + (resposta59 != null ? resposta59.hashCode() : 0);
        result = 31 * result + (resposta60 != null ? resposta60.hashCode() : 0);
        result = 31 * result + (codDisciplina01 != null ? codDisciplina01.hashCode() : 0);
        result = 31 * result + (codDisciplina02 != null ? codDisciplina02.hashCode() : 0);
        result = 31 * result + (codDisciplina03 != null ? codDisciplina03.hashCode() : 0);
        result = 31 * result + (codDisciplina04 != null ? codDisciplina04.hashCode() : 0);
        result = 31 * result + (codDisciplina05 != null ? codDisciplina05.hashCode() : 0);
        result = 31 * result + (codDisciplina06 != null ? codDisciplina06.hashCode() : 0);
        result = 31 * result + (codDisciplina07 != null ? codDisciplina07.hashCode() : 0);
        result = 31 * result + (codDisciplina08 != null ? codDisciplina08.hashCode() : 0);
        result = 31 * result + (codDisciplina09 != null ? codDisciplina09.hashCode() : 0);
        result = 31 * result + (codDisciplina10 != null ? codDisciplina10.hashCode() : 0);
        result = 31 * result + (codDisciplina11 != null ? codDisciplina11.hashCode() : 0);
        result = 31 * result + (codDisciplina12 != null ? codDisciplina12.hashCode() : 0);
        result = 31 * result + (codDisciplina13 != null ? codDisciplina13.hashCode() : 0);
        result = 31 * result + (codDisciplina14 != null ? codDisciplina14.hashCode() : 0);
        result = 31 * result + (codDisciplina15 != null ? codDisciplina15.hashCode() : 0);
        result = 31 * result + (codDisciplina16 != null ? codDisciplina16.hashCode() : 0);
        result = 31 * result + (codDisciplina17 != null ? codDisciplina17.hashCode() : 0);
        result = 31 * result + (codDisciplina18 != null ? codDisciplina18.hashCode() : 0);
        result = 31 * result + (codDisciplina19 != null ? codDisciplina19.hashCode() : 0);
        result = 31 * result + (codDisciplina20 != null ? codDisciplina20.hashCode() : 0);
        result = 31 * result + (início01 != null ? início01.hashCode() : 0);
        result = 31 * result + (início02 != null ? início02.hashCode() : 0);
        result = 31 * result + (início03 != null ? início03.hashCode() : 0);
        result = 31 * result + (início04 != null ? início04.hashCode() : 0);
        result = 31 * result + (início05 != null ? início05.hashCode() : 0);
        result = 31 * result + (início06 != null ? início06.hashCode() : 0);
        result = 31 * result + (início07 != null ? início07.hashCode() : 0);
        result = 31 * result + (início08 != null ? início08.hashCode() : 0);
        result = 31 * result + (início09 != null ? início09.hashCode() : 0);
        result = 31 * result + (início10 != null ? início10.hashCode() : 0);
        result = 31 * result + (início11 != null ? início11.hashCode() : 0);
        result = 31 * result + (início12 != null ? início12.hashCode() : 0);
        result = 31 * result + (início13 != null ? início13.hashCode() : 0);
        result = 31 * result + (início14 != null ? início14.hashCode() : 0);
        result = 31 * result + (início15 != null ? início15.hashCode() : 0);
        result = 31 * result + (início16 != null ? início16.hashCode() : 0);
        result = 31 * result + (início17 != null ? início17.hashCode() : 0);
        result = 31 * result + (início18 != null ? início18.hashCode() : 0);
        result = 31 * result + (início19 != null ? início19.hashCode() : 0);
        result = 31 * result + (início20 != null ? início20.hashCode() : 0);
        result = 31 * result + (final01 != null ? final01.hashCode() : 0);
        result = 31 * result + (final02 != null ? final02.hashCode() : 0);
        result = 31 * result + (final03 != null ? final03.hashCode() : 0);
        result = 31 * result + (final04 != null ? final04.hashCode() : 0);
        result = 31 * result + (final05 != null ? final05.hashCode() : 0);
        result = 31 * result + (final06 != null ? final06.hashCode() : 0);
        result = 31 * result + (final07 != null ? final07.hashCode() : 0);
        result = 31 * result + (final08 != null ? final08.hashCode() : 0);
        result = 31 * result + (final09 != null ? final09.hashCode() : 0);
        result = 31 * result + (final10 != null ? final10.hashCode() : 0);
        result = 31 * result + (final11 != null ? final11.hashCode() : 0);
        result = 31 * result + (final12 != null ? final12.hashCode() : 0);
        result = 31 * result + (final13 != null ? final13.hashCode() : 0);
        result = 31 * result + (final14 != null ? final14.hashCode() : 0);
        result = 31 * result + (final15 != null ? final15.hashCode() : 0);
        result = 31 * result + (final16 != null ? final16.hashCode() : 0);
        result = 31 * result + (final17 != null ? final17.hashCode() : 0);
        result = 31 * result + (final18 != null ? final18.hashCode() : 0);
        result = 31 * result + (final19 != null ? final19.hashCode() : 0);
        result = 31 * result + (final20 != null ? final20.hashCode() : 0);
        return result;
    }
}
