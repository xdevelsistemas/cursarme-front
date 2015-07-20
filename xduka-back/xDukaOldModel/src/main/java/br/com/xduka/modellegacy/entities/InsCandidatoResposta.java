package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(InsCandidatoRespostaPK.class)
public class InsCandidatoResposta {
    private int candidatoRespostaId;

    @Basic
    @javax.persistence.Column(name = "CandidatoResposta_ID", nullable = false, insertable = true, updatable = true)
    public int getCandidatoRespostaId() {
        return candidatoRespostaId;
    }

    public void setCandidatoRespostaId(int candidatoRespostaId) {
        this.candidatoRespostaId = candidatoRespostaId;
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

    private int prova;

    @Id
    @javax.persistence.Column(name = "Prova", nullable = false, insertable = true, updatable = true)
    public int getProva() {
        return prova;
    }

    public void setProva(int prova) {
        this.prova = prova;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsCandidatoResposta that = (InsCandidatoResposta) o;

        if (candidatoRespostaId != that.candidatoRespostaId) return false;
        if (codCandidato != that.codCandidato) return false;
        if (codGabarito != that.codGabarito) return false;
        if (codInscrição != that.codInscrição) return false;
        if (codUnidade != that.codUnidade) return false;
        if (prova != that.prova) return false;
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
        int result = candidatoRespostaId;
        result = 31 * result + codUnidade;
        result = 31 * result + codInscrição;
        result = 31 * result + codCandidato;
        result = 31 * result + prova;
        result = 31 * result + (int) codGabarito;
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
        return result;
    }
}
