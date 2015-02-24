package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@javax.persistence.Table(name = "acdAulaConfiguração", schema = "dbo", catalog = "xDuka")
public class AcdAulaConfiguracao {
    private long aulaConfiguraçãoId;

    @Basic
    @javax.persistence.Column(name = "AulaConfiguração_ID", nullable = false, insertable = true, updatable = true)
    public long getAulaConfiguraçãoId() {
        return aulaConfiguraçãoId;
    }

    public void setAulaConfiguraçãoId(long aulaConfiguraçãoId) {
        this.aulaConfiguraçãoId = aulaConfiguraçãoId;
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

    private String nota1;

    @Basic
    @javax.persistence.Column(name = "Nota1", nullable = true, insertable = true, updatable = true)
    public String getNota1() {
        return nota1;
    }

    public void setNota1(String nota1) {
        this.nota1 = nota1;
    }

    private String nota2;

    @Basic
    @javax.persistence.Column(name = "Nota2", nullable = true, insertable = true, updatable = true)
    public String getNota2() {
        return nota2;
    }

    public void setNota2(String nota2) {
        this.nota2 = nota2;
    }

    private String nota3;

    @Basic
    @javax.persistence.Column(name = "Nota3", nullable = true, insertable = true, updatable = true)
    public String getNota3() {
        return nota3;
    }

    public void setNota3(String nota3) {
        this.nota3 = nota3;
    }

    private String nota4;

    @Basic
    @javax.persistence.Column(name = "Nota4", nullable = true, insertable = true, updatable = true)
    public String getNota4() {
        return nota4;
    }

    public void setNota4(String nota4) {
        this.nota4 = nota4;
    }

    private String nota5;

    @Basic
    @javax.persistence.Column(name = "Nota5", nullable = true, insertable = true, updatable = true)
    public String getNota5() {
        return nota5;
    }

    public void setNota5(String nota5) {
        this.nota5 = nota5;
    }

    private String nota6;

    @Basic
    @javax.persistence.Column(name = "Nota6", nullable = true, insertable = true, updatable = true)
    public String getNota6() {
        return nota6;
    }

    public void setNota6(String nota6) {
        this.nota6 = nota6;
    }

    private String nota7;

    @Basic
    @javax.persistence.Column(name = "Nota7", nullable = true, insertable = true, updatable = true)
    public String getNota7() {
        return nota7;
    }

    public void setNota7(String nota7) {
        this.nota7 = nota7;
    }

    private String nota8;

    @Basic
    @javax.persistence.Column(name = "Nota8", nullable = true, insertable = true, updatable = true)
    public String getNota8() {
        return nota8;
    }

    public void setNota8(String nota8) {
        this.nota8 = nota8;
    }

    private String recuperação1;

    @Basic
    @javax.persistence.Column(name = "Recuperação1", nullable = true, insertable = true, updatable = true)
    public String getRecuperação1() {
        return recuperação1;
    }

    public void setRecuperação1(String recuperação1) {
        this.recuperação1 = recuperação1;
    }

    private String recuperação2;

    @Basic
    @javax.persistence.Column(name = "Recuperação2", nullable = true, insertable = true, updatable = true)
    public String getRecuperação2() {
        return recuperação2;
    }

    public void setRecuperação2(String recuperação2) {
        this.recuperação2 = recuperação2;
    }

    private String recuperação3;

    @Basic
    @javax.persistence.Column(name = "Recuperação3", nullable = true, insertable = true, updatable = true)
    public String getRecuperação3() {
        return recuperação3;
    }

    public void setRecuperação3(String recuperação3) {
        this.recuperação3 = recuperação3;
    }

    private String recuperação4;

    @Basic
    @javax.persistence.Column(name = "Recuperação4", nullable = true, insertable = true, updatable = true)
    public String getRecuperação4() {
        return recuperação4;
    }

    public void setRecuperação4(String recuperação4) {
        this.recuperação4 = recuperação4;
    }

    private String recuperação5;

    @Basic
    @javax.persistence.Column(name = "Recuperação5", nullable = true, insertable = true, updatable = true)
    public String getRecuperação5() {
        return recuperação5;
    }

    public void setRecuperação5(String recuperação5) {
        this.recuperação5 = recuperação5;
    }

    private String recuperação6;

    @Basic
    @javax.persistence.Column(name = "Recuperação6", nullable = true, insertable = true, updatable = true)
    public String getRecuperação6() {
        return recuperação6;
    }

    public void setRecuperação6(String recuperação6) {
        this.recuperação6 = recuperação6;
    }

    private String recuperação7;

    @Basic
    @javax.persistence.Column(name = "Recuperação7", nullable = true, insertable = true, updatable = true)
    public String getRecuperação7() {
        return recuperação7;
    }

    public void setRecuperação7(String recuperação7) {
        this.recuperação7 = recuperação7;
    }

    private String recuperação8;

    @Basic
    @javax.persistence.Column(name = "Recuperação8", nullable = true, insertable = true, updatable = true)
    public String getRecuperação8() {
        return recuperação8;
    }

    public void setRecuperação8(String recuperação8) {
        this.recuperação8 = recuperação8;
    }

    private String falta1;

    @Basic
    @javax.persistence.Column(name = "Falta1", nullable = true, insertable = true, updatable = true)
    public String getFalta1() {
        return falta1;
    }

    public void setFalta1(String falta1) {
        this.falta1 = falta1;
    }

    private String falta2;

    @Basic
    @javax.persistence.Column(name = "Falta2", nullable = true, insertable = true, updatable = true)
    public String getFalta2() {
        return falta2;
    }

    public void setFalta2(String falta2) {
        this.falta2 = falta2;
    }

    private String falta3;

    @Basic
    @javax.persistence.Column(name = "Falta3", nullable = true, insertable = true, updatable = true)
    public String getFalta3() {
        return falta3;
    }

    public void setFalta3(String falta3) {
        this.falta3 = falta3;
    }

    private String falta4;

    @Basic
    @javax.persistence.Column(name = "Falta4", nullable = true, insertable = true, updatable = true)
    public String getFalta4() {
        return falta4;
    }

    public void setFalta4(String falta4) {
        this.falta4 = falta4;
    }

    private String falta5;

    @Basic
    @javax.persistence.Column(name = "Falta5", nullable = true, insertable = true, updatable = true)
    public String getFalta5() {
        return falta5;
    }

    public void setFalta5(String falta5) {
        this.falta5 = falta5;
    }

    private String falta6;

    @Basic
    @javax.persistence.Column(name = "Falta6", nullable = true, insertable = true, updatable = true)
    public String getFalta6() {
        return falta6;
    }

    public void setFalta6(String falta6) {
        this.falta6 = falta6;
    }

    private String falta7;

    @Basic
    @javax.persistence.Column(name = "Falta7", nullable = true, insertable = true, updatable = true)
    public String getFalta7() {
        return falta7;
    }

    public void setFalta7(String falta7) {
        this.falta7 = falta7;
    }

    private String falta8;

    @Basic
    @javax.persistence.Column(name = "Falta8", nullable = true, insertable = true, updatable = true)
    public String getFalta8() {
        return falta8;
    }

    public void setFalta8(String falta8) {
        this.falta8 = falta8;
    }

    private Byte quantidadeAvaliação1;

    @Basic
    @javax.persistence.Column(name = "QuantidadeAvaliação1", nullable = true, insertable = true, updatable = true)
    public Byte getQuantidadeAvaliação1() {
        return quantidadeAvaliação1;
    }

    public void setQuantidadeAvaliação1(Byte quantidadeAvaliação1) {
        this.quantidadeAvaliação1 = quantidadeAvaliação1;
    }

    private Byte quantidadeAvaliação2;

    @Basic
    @javax.persistence.Column(name = "QuantidadeAvaliação2", nullable = true, insertable = true, updatable = true)
    public Byte getQuantidadeAvaliação2() {
        return quantidadeAvaliação2;
    }

    public void setQuantidadeAvaliação2(Byte quantidadeAvaliação2) {
        this.quantidadeAvaliação2 = quantidadeAvaliação2;
    }

    private Byte quantidadeAvaliação3;

    @Basic
    @javax.persistence.Column(name = "QuantidadeAvaliação3", nullable = true, insertable = true, updatable = true)
    public Byte getQuantidadeAvaliação3() {
        return quantidadeAvaliação3;
    }

    public void setQuantidadeAvaliação3(Byte quantidadeAvaliação3) {
        this.quantidadeAvaliação3 = quantidadeAvaliação3;
    }

    private Byte quantidadeAvaliação4;

    @Basic
    @javax.persistence.Column(name = "QuantidadeAvaliação4", nullable = true, insertable = true, updatable = true)
    public Byte getQuantidadeAvaliação4() {
        return quantidadeAvaliação4;
    }

    public void setQuantidadeAvaliação4(Byte quantidadeAvaliação4) {
        this.quantidadeAvaliação4 = quantidadeAvaliação4;
    }

    private Byte quantidadeAvaliação5;

    @Basic
    @javax.persistence.Column(name = "QuantidadeAvaliação5", nullable = true, insertable = true, updatable = true)
    public Byte getQuantidadeAvaliação5() {
        return quantidadeAvaliação5;
    }

    public void setQuantidadeAvaliação5(Byte quantidadeAvaliação5) {
        this.quantidadeAvaliação5 = quantidadeAvaliação5;
    }

    private Byte quantidadeAvaliação6;

    @Basic
    @javax.persistence.Column(name = "QuantidadeAvaliação6", nullable = true, insertable = true, updatable = true)
    public Byte getQuantidadeAvaliação6() {
        return quantidadeAvaliação6;
    }

    public void setQuantidadeAvaliação6(Byte quantidadeAvaliação6) {
        this.quantidadeAvaliação6 = quantidadeAvaliação6;
    }

    private Byte quantidadeAvaliação7;

    @Basic
    @javax.persistence.Column(name = "QuantidadeAvaliação7", nullable = true, insertable = true, updatable = true)
    public Byte getQuantidadeAvaliação7() {
        return quantidadeAvaliação7;
    }

    public void setQuantidadeAvaliação7(Byte quantidadeAvaliação7) {
        this.quantidadeAvaliação7 = quantidadeAvaliação7;
    }

    private Byte quantidadeAvaliação8;

    @Basic
    @javax.persistence.Column(name = "QuantidadeAvaliação8", nullable = true, insertable = true, updatable = true)
    public Byte getQuantidadeAvaliação8() {
        return quantidadeAvaliação8;
    }

    public void setQuantidadeAvaliação8(Byte quantidadeAvaliação8) {
        this.quantidadeAvaliação8 = quantidadeAvaliação8;
    }

    private String avaliação11;

    @Basic
    @javax.persistence.Column(name = "Avaliação11", nullable = true, insertable = true, updatable = true)
    public String getAvaliação11() {
        return avaliação11;
    }

    public void setAvaliação11(String avaliação11) {
        this.avaliação11 = avaliação11;
    }

    private String avaliação12;

    @Basic
    @javax.persistence.Column(name = "Avaliação12", nullable = true, insertable = true, updatable = true)
    public String getAvaliação12() {
        return avaliação12;
    }

    public void setAvaliação12(String avaliação12) {
        this.avaliação12 = avaliação12;
    }

    private String avaliação13;

    @Basic
    @javax.persistence.Column(name = "Avaliação13", nullable = true, insertable = true, updatable = true)
    public String getAvaliação13() {
        return avaliação13;
    }

    public void setAvaliação13(String avaliação13) {
        this.avaliação13 = avaliação13;
    }

    private String avaliação14;

    @Basic
    @javax.persistence.Column(name = "Avaliação14", nullable = true, insertable = true, updatable = true)
    public String getAvaliação14() {
        return avaliação14;
    }

    public void setAvaliação14(String avaliação14) {
        this.avaliação14 = avaliação14;
    }

    private String avaliação15;

    @Basic
    @javax.persistence.Column(name = "Avaliação15", nullable = true, insertable = true, updatable = true)
    public String getAvaliação15() {
        return avaliação15;
    }

    public void setAvaliação15(String avaliação15) {
        this.avaliação15 = avaliação15;
    }

    private String avaliação16;

    @Basic
    @javax.persistence.Column(name = "Avaliação16", nullable = true, insertable = true, updatable = true)
    public String getAvaliação16() {
        return avaliação16;
    }

    public void setAvaliação16(String avaliação16) {
        this.avaliação16 = avaliação16;
    }

    private String avaliação17;

    @Basic
    @javax.persistence.Column(name = "Avaliação17", nullable = true, insertable = true, updatable = true)
    public String getAvaliação17() {
        return avaliação17;
    }

    public void setAvaliação17(String avaliação17) {
        this.avaliação17 = avaliação17;
    }

    private String avaliação18;

    @Basic
    @javax.persistence.Column(name = "Avaliação18", nullable = true, insertable = true, updatable = true)
    public String getAvaliação18() {
        return avaliação18;
    }

    public void setAvaliação18(String avaliação18) {
        this.avaliação18 = avaliação18;
    }

    private String avaliação21;

    @Basic
    @javax.persistence.Column(name = "Avaliação21", nullable = true, insertable = true, updatable = true)
    public String getAvaliação21() {
        return avaliação21;
    }

    public void setAvaliação21(String avaliação21) {
        this.avaliação21 = avaliação21;
    }

    private String avaliação22;

    @Basic
    @javax.persistence.Column(name = "Avaliação22", nullable = true, insertable = true, updatable = true)
    public String getAvaliação22() {
        return avaliação22;
    }

    public void setAvaliação22(String avaliação22) {
        this.avaliação22 = avaliação22;
    }

    private String avaliação23;

    @Basic
    @javax.persistence.Column(name = "Avaliação23", nullable = true, insertable = true, updatable = true)
    public String getAvaliação23() {
        return avaliação23;
    }

    public void setAvaliação23(String avaliação23) {
        this.avaliação23 = avaliação23;
    }

    private String avaliação24;

    @Basic
    @javax.persistence.Column(name = "Avaliação24", nullable = true, insertable = true, updatable = true)
    public String getAvaliação24() {
        return avaliação24;
    }

    public void setAvaliação24(String avaliação24) {
        this.avaliação24 = avaliação24;
    }

    private String avaliação25;

    @Basic
    @javax.persistence.Column(name = "Avaliação25", nullable = true, insertable = true, updatable = true)
    public String getAvaliação25() {
        return avaliação25;
    }

    public void setAvaliação25(String avaliação25) {
        this.avaliação25 = avaliação25;
    }

    private String avaliação26;

    @Basic
    @javax.persistence.Column(name = "Avaliação26", nullable = true, insertable = true, updatable = true)
    public String getAvaliação26() {
        return avaliação26;
    }

    public void setAvaliação26(String avaliação26) {
        this.avaliação26 = avaliação26;
    }

    private String avaliação27;

    @Basic
    @javax.persistence.Column(name = "Avaliação27", nullable = true, insertable = true, updatable = true)
    public String getAvaliação27() {
        return avaliação27;
    }

    public void setAvaliação27(String avaliação27) {
        this.avaliação27 = avaliação27;
    }

    private String avaliação28;

    @Basic
    @javax.persistence.Column(name = "Avaliação28", nullable = true, insertable = true, updatable = true)
    public String getAvaliação28() {
        return avaliação28;
    }

    public void setAvaliação28(String avaliação28) {
        this.avaliação28 = avaliação28;
    }

    private String avaliação31;

    @Basic
    @javax.persistence.Column(name = "Avaliação31", nullable = true, insertable = true, updatable = true)
    public String getAvaliação31() {
        return avaliação31;
    }

    public void setAvaliação31(String avaliação31) {
        this.avaliação31 = avaliação31;
    }

    private String avaliação32;

    @Basic
    @javax.persistence.Column(name = "Avaliação32", nullable = true, insertable = true, updatable = true)
    public String getAvaliação32() {
        return avaliação32;
    }

    public void setAvaliação32(String avaliação32) {
        this.avaliação32 = avaliação32;
    }

    private String avaliação33;

    @Basic
    @javax.persistence.Column(name = "Avaliação33", nullable = true, insertable = true, updatable = true)
    public String getAvaliação33() {
        return avaliação33;
    }

    public void setAvaliação33(String avaliação33) {
        this.avaliação33 = avaliação33;
    }

    private String avaliação34;

    @Basic
    @javax.persistence.Column(name = "Avaliação34", nullable = true, insertable = true, updatable = true)
    public String getAvaliação34() {
        return avaliação34;
    }

    public void setAvaliação34(String avaliação34) {
        this.avaliação34 = avaliação34;
    }

    private String avaliação35;

    @Basic
    @javax.persistence.Column(name = "Avaliação35", nullable = true, insertable = true, updatable = true)
    public String getAvaliação35() {
        return avaliação35;
    }

    public void setAvaliação35(String avaliação35) {
        this.avaliação35 = avaliação35;
    }

    private String avaliação36;

    @Basic
    @javax.persistence.Column(name = "Avaliação36", nullable = true, insertable = true, updatable = true)
    public String getAvaliação36() {
        return avaliação36;
    }

    public void setAvaliação36(String avaliação36) {
        this.avaliação36 = avaliação36;
    }

    private String avaliação37;

    @Basic
    @javax.persistence.Column(name = "Avaliação37", nullable = true, insertable = true, updatable = true)
    public String getAvaliação37() {
        return avaliação37;
    }

    public void setAvaliação37(String avaliação37) {
        this.avaliação37 = avaliação37;
    }

    private String avaliação38;

    @Basic
    @javax.persistence.Column(name = "Avaliação38", nullable = true, insertable = true, updatable = true)
    public String getAvaliação38() {
        return avaliação38;
    }

    public void setAvaliação38(String avaliação38) {
        this.avaliação38 = avaliação38;
    }

    private String avaliação41;

    @Basic
    @javax.persistence.Column(name = "Avaliação41", nullable = true, insertable = true, updatable = true)
    public String getAvaliação41() {
        return avaliação41;
    }

    public void setAvaliação41(String avaliação41) {
        this.avaliação41 = avaliação41;
    }

    private String avaliação42;

    @Basic
    @javax.persistence.Column(name = "Avaliação42", nullable = true, insertable = true, updatable = true)
    public String getAvaliação42() {
        return avaliação42;
    }

    public void setAvaliação42(String avaliação42) {
        this.avaliação42 = avaliação42;
    }

    private String avaliação43;

    @Basic
    @javax.persistence.Column(name = "Avaliação43", nullable = true, insertable = true, updatable = true)
    public String getAvaliação43() {
        return avaliação43;
    }

    public void setAvaliação43(String avaliação43) {
        this.avaliação43 = avaliação43;
    }

    private String avaliação44;

    @Basic
    @javax.persistence.Column(name = "Avaliação44", nullable = true, insertable = true, updatable = true)
    public String getAvaliação44() {
        return avaliação44;
    }

    public void setAvaliação44(String avaliação44) {
        this.avaliação44 = avaliação44;
    }

    private String avaliação45;

    @Basic
    @javax.persistence.Column(name = "Avaliação45", nullable = true, insertable = true, updatable = true)
    public String getAvaliação45() {
        return avaliação45;
    }

    public void setAvaliação45(String avaliação45) {
        this.avaliação45 = avaliação45;
    }

    private String avaliação46;

    @Basic
    @javax.persistence.Column(name = "Avaliação46", nullable = true, insertable = true, updatable = true)
    public String getAvaliação46() {
        return avaliação46;
    }

    public void setAvaliação46(String avaliação46) {
        this.avaliação46 = avaliação46;
    }

    private String avaliação47;

    @Basic
    @javax.persistence.Column(name = "Avaliação47", nullable = true, insertable = true, updatable = true)
    public String getAvaliação47() {
        return avaliação47;
    }

    public void setAvaliação47(String avaliação47) {
        this.avaliação47 = avaliação47;
    }

    private String avaliação48;

    @Basic
    @javax.persistence.Column(name = "Avaliação48", nullable = true, insertable = true, updatable = true)
    public String getAvaliação48() {
        return avaliação48;
    }

    public void setAvaliação48(String avaliação48) {
        this.avaliação48 = avaliação48;
    }

    private String avaliação51;

    @Basic
    @javax.persistence.Column(name = "Avaliação51", nullable = true, insertable = true, updatable = true)
    public String getAvaliação51() {
        return avaliação51;
    }

    public void setAvaliação51(String avaliação51) {
        this.avaliação51 = avaliação51;
    }

    private String avaliação52;

    @Basic
    @javax.persistence.Column(name = "Avaliação52", nullable = true, insertable = true, updatable = true)
    public String getAvaliação52() {
        return avaliação52;
    }

    public void setAvaliação52(String avaliação52) {
        this.avaliação52 = avaliação52;
    }

    private String avaliação53;

    @Basic
    @javax.persistence.Column(name = "Avaliação53", nullable = true, insertable = true, updatable = true)
    public String getAvaliação53() {
        return avaliação53;
    }

    public void setAvaliação53(String avaliação53) {
        this.avaliação53 = avaliação53;
    }

    private String avaliação54;

    @Basic
    @javax.persistence.Column(name = "Avaliação54", nullable = true, insertable = true, updatable = true)
    public String getAvaliação54() {
        return avaliação54;
    }

    public void setAvaliação54(String avaliação54) {
        this.avaliação54 = avaliação54;
    }

    private String avaliação55;

    @Basic
    @javax.persistence.Column(name = "Avaliação55", nullable = true, insertable = true, updatable = true)
    public String getAvaliação55() {
        return avaliação55;
    }

    public void setAvaliação55(String avaliação55) {
        this.avaliação55 = avaliação55;
    }

    private String avaliação56;

    @Basic
    @javax.persistence.Column(name = "Avaliação56", nullable = true, insertable = true, updatable = true)
    public String getAvaliação56() {
        return avaliação56;
    }

    public void setAvaliação56(String avaliação56) {
        this.avaliação56 = avaliação56;
    }

    private String avaliação57;

    @Basic
    @javax.persistence.Column(name = "Avaliação57", nullable = true, insertable = true, updatable = true)
    public String getAvaliação57() {
        return avaliação57;
    }

    public void setAvaliação57(String avaliação57) {
        this.avaliação57 = avaliação57;
    }

    private String avaliação58;

    @Basic
    @javax.persistence.Column(name = "Avaliação58", nullable = true, insertable = true, updatable = true)
    public String getAvaliação58() {
        return avaliação58;
    }

    public void setAvaliação58(String avaliação58) {
        this.avaliação58 = avaliação58;
    }

    private String avaliação61;

    @Basic
    @javax.persistence.Column(name = "Avaliação61", nullable = true, insertable = true, updatable = true)
    public String getAvaliação61() {
        return avaliação61;
    }

    public void setAvaliação61(String avaliação61) {
        this.avaliação61 = avaliação61;
    }

    private String avaliação62;

    @Basic
    @javax.persistence.Column(name = "Avaliação62", nullable = true, insertable = true, updatable = true)
    public String getAvaliação62() {
        return avaliação62;
    }

    public void setAvaliação62(String avaliação62) {
        this.avaliação62 = avaliação62;
    }

    private String avaliação63;

    @Basic
    @javax.persistence.Column(name = "Avaliação63", nullable = true, insertable = true, updatable = true)
    public String getAvaliação63() {
        return avaliação63;
    }

    public void setAvaliação63(String avaliação63) {
        this.avaliação63 = avaliação63;
    }

    private String avaliação64;

    @Basic
    @javax.persistence.Column(name = "Avaliação64", nullable = true, insertable = true, updatable = true)
    public String getAvaliação64() {
        return avaliação64;
    }

    public void setAvaliação64(String avaliação64) {
        this.avaliação64 = avaliação64;
    }

    private String avaliação65;

    @Basic
    @javax.persistence.Column(name = "Avaliação65", nullable = true, insertable = true, updatable = true)
    public String getAvaliação65() {
        return avaliação65;
    }

    public void setAvaliação65(String avaliação65) {
        this.avaliação65 = avaliação65;
    }

    private String avaliação66;

    @Basic
    @javax.persistence.Column(name = "Avaliação66", nullable = true, insertable = true, updatable = true)
    public String getAvaliação66() {
        return avaliação66;
    }

    public void setAvaliação66(String avaliação66) {
        this.avaliação66 = avaliação66;
    }

    private String avaliação67;

    @Basic
    @javax.persistence.Column(name = "Avaliação67", nullable = true, insertable = true, updatable = true)
    public String getAvaliação67() {
        return avaliação67;
    }

    public void setAvaliação67(String avaliação67) {
        this.avaliação67 = avaliação67;
    }

    private String avaliação68;

    @Basic
    @javax.persistence.Column(name = "Avaliação68", nullable = true, insertable = true, updatable = true)
    public String getAvaliação68() {
        return avaliação68;
    }

    public void setAvaliação68(String avaliação68) {
        this.avaliação68 = avaliação68;
    }

    private String avaliação71;

    @Basic
    @javax.persistence.Column(name = "Avaliação71", nullable = true, insertable = true, updatable = true)
    public String getAvaliação71() {
        return avaliação71;
    }

    public void setAvaliação71(String avaliação71) {
        this.avaliação71 = avaliação71;
    }

    private String avaliação72;

    @Basic
    @javax.persistence.Column(name = "Avaliação72", nullable = true, insertable = true, updatable = true)
    public String getAvaliação72() {
        return avaliação72;
    }

    public void setAvaliação72(String avaliação72) {
        this.avaliação72 = avaliação72;
    }

    private String avaliação73;

    @Basic
    @javax.persistence.Column(name = "Avaliação73", nullable = true, insertable = true, updatable = true)
    public String getAvaliação73() {
        return avaliação73;
    }

    public void setAvaliação73(String avaliação73) {
        this.avaliação73 = avaliação73;
    }

    private String avaliação74;

    @Basic
    @javax.persistence.Column(name = "Avaliação74", nullable = true, insertable = true, updatable = true)
    public String getAvaliação74() {
        return avaliação74;
    }

    public void setAvaliação74(String avaliação74) {
        this.avaliação74 = avaliação74;
    }

    private String avaliação75;

    @Basic
    @javax.persistence.Column(name = "Avaliação75", nullable = true, insertable = true, updatable = true)
    public String getAvaliação75() {
        return avaliação75;
    }

    public void setAvaliação75(String avaliação75) {
        this.avaliação75 = avaliação75;
    }

    private String avaliação76;

    @Basic
    @javax.persistence.Column(name = "Avaliação76", nullable = true, insertable = true, updatable = true)
    public String getAvaliação76() {
        return avaliação76;
    }

    public void setAvaliação76(String avaliação76) {
        this.avaliação76 = avaliação76;
    }

    private String avaliação77;

    @Basic
    @javax.persistence.Column(name = "Avaliação77", nullable = true, insertable = true, updatable = true)
    public String getAvaliação77() {
        return avaliação77;
    }

    public void setAvaliação77(String avaliação77) {
        this.avaliação77 = avaliação77;
    }

    private String avaliação78;

    @Basic
    @javax.persistence.Column(name = "Avaliação78", nullable = true, insertable = true, updatable = true)
    public String getAvaliação78() {
        return avaliação78;
    }

    public void setAvaliação78(String avaliação78) {
        this.avaliação78 = avaliação78;
    }

    private String avaliaçãoRecuperação1;

    @Basic
    @javax.persistence.Column(name = "AvaliaçãoRecuperação1", nullable = true, insertable = true, updatable = true)
    public String getAvaliaçãoRecuperação1() {
        return avaliaçãoRecuperação1;
    }

    public void setAvaliaçãoRecuperação1(String avaliaçãoRecuperação1) {
        this.avaliaçãoRecuperação1 = avaliaçãoRecuperação1;
    }

    private String avaliaçãoRecuperação2;

    @Basic
    @javax.persistence.Column(name = "AvaliaçãoRecuperação2", nullable = true, insertable = true, updatable = true)
    public String getAvaliaçãoRecuperação2() {
        return avaliaçãoRecuperação2;
    }

    public void setAvaliaçãoRecuperação2(String avaliaçãoRecuperação2) {
        this.avaliaçãoRecuperação2 = avaliaçãoRecuperação2;
    }

    private String avaliaçãoRecuperação3;

    @Basic
    @javax.persistence.Column(name = "AvaliaçãoRecuperação3", nullable = true, insertable = true, updatable = true)
    public String getAvaliaçãoRecuperação3() {
        return avaliaçãoRecuperação3;
    }

    public void setAvaliaçãoRecuperação3(String avaliaçãoRecuperação3) {
        this.avaliaçãoRecuperação3 = avaliaçãoRecuperação3;
    }

    private String avaliaçãoRecuperação4;

    @Basic
    @javax.persistence.Column(name = "AvaliaçãoRecuperação4", nullable = true, insertable = true, updatable = true)
    public String getAvaliaçãoRecuperação4() {
        return avaliaçãoRecuperação4;
    }

    public void setAvaliaçãoRecuperação4(String avaliaçãoRecuperação4) {
        this.avaliaçãoRecuperação4 = avaliaçãoRecuperação4;
    }

    private String avaliaçãoRecuperação5;

    @Basic
    @javax.persistence.Column(name = "AvaliaçãoRecuperação5", nullable = true, insertable = true, updatable = true)
    public String getAvaliaçãoRecuperação5() {
        return avaliaçãoRecuperação5;
    }

    public void setAvaliaçãoRecuperação5(String avaliaçãoRecuperação5) {
        this.avaliaçãoRecuperação5 = avaliaçãoRecuperação5;
    }

    private String avaliaçãoRecuperação6;

    @Basic
    @javax.persistence.Column(name = "AvaliaçãoRecuperação6", nullable = true, insertable = true, updatable = true)
    public String getAvaliaçãoRecuperação6() {
        return avaliaçãoRecuperação6;
    }

    public void setAvaliaçãoRecuperação6(String avaliaçãoRecuperação6) {
        this.avaliaçãoRecuperação6 = avaliaçãoRecuperação6;
    }

    private String avaliaçãoRecuperação7;

    @Basic
    @javax.persistence.Column(name = "AvaliaçãoRecuperação7", nullable = true, insertable = true, updatable = true)
    public String getAvaliaçãoRecuperação7() {
        return avaliaçãoRecuperação7;
    }

    public void setAvaliaçãoRecuperação7(String avaliaçãoRecuperação7) {
        this.avaliaçãoRecuperação7 = avaliaçãoRecuperação7;
    }

    private String avaliaçãoRecuperação8;

    @Basic
    @javax.persistence.Column(name = "AvaliaçãoRecuperação8", nullable = true, insertable = true, updatable = true)
    public String getAvaliaçãoRecuperação8() {
        return avaliaçãoRecuperação8;
    }

    public void setAvaliaçãoRecuperação8(String avaliaçãoRecuperação8) {
        this.avaliaçãoRecuperação8 = avaliaçãoRecuperação8;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAulaConfiguracao that = (AcdAulaConfiguracao) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (aulaConfiguraçãoId != that.aulaConfiguraçãoId) return false;
        if (codCurso != that.codCurso) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (codUnidade != that.codUnidade) return false;
        if (avaliação11 != null ? !avaliação11.equals(that.avaliação11) : that.avaliação11 != null) return false;
        if (avaliação12 != null ? !avaliação12.equals(that.avaliação12) : that.avaliação12 != null) return false;
        if (avaliação13 != null ? !avaliação13.equals(that.avaliação13) : that.avaliação13 != null) return false;
        if (avaliação14 != null ? !avaliação14.equals(that.avaliação14) : that.avaliação14 != null) return false;
        if (avaliação15 != null ? !avaliação15.equals(that.avaliação15) : that.avaliação15 != null) return false;
        if (avaliação16 != null ? !avaliação16.equals(that.avaliação16) : that.avaliação16 != null) return false;
        if (avaliação17 != null ? !avaliação17.equals(that.avaliação17) : that.avaliação17 != null) return false;
        if (avaliação18 != null ? !avaliação18.equals(that.avaliação18) : that.avaliação18 != null) return false;
        if (avaliação21 != null ? !avaliação21.equals(that.avaliação21) : that.avaliação21 != null) return false;
        if (avaliação22 != null ? !avaliação22.equals(that.avaliação22) : that.avaliação22 != null) return false;
        if (avaliação23 != null ? !avaliação23.equals(that.avaliação23) : that.avaliação23 != null) return false;
        if (avaliação24 != null ? !avaliação24.equals(that.avaliação24) : that.avaliação24 != null) return false;
        if (avaliação25 != null ? !avaliação25.equals(that.avaliação25) : that.avaliação25 != null) return false;
        if (avaliação26 != null ? !avaliação26.equals(that.avaliação26) : that.avaliação26 != null) return false;
        if (avaliação27 != null ? !avaliação27.equals(that.avaliação27) : that.avaliação27 != null) return false;
        if (avaliação28 != null ? !avaliação28.equals(that.avaliação28) : that.avaliação28 != null) return false;
        if (avaliação31 != null ? !avaliação31.equals(that.avaliação31) : that.avaliação31 != null) return false;
        if (avaliação32 != null ? !avaliação32.equals(that.avaliação32) : that.avaliação32 != null) return false;
        if (avaliação33 != null ? !avaliação33.equals(that.avaliação33) : that.avaliação33 != null) return false;
        if (avaliação34 != null ? !avaliação34.equals(that.avaliação34) : that.avaliação34 != null) return false;
        if (avaliação35 != null ? !avaliação35.equals(that.avaliação35) : that.avaliação35 != null) return false;
        if (avaliação36 != null ? !avaliação36.equals(that.avaliação36) : that.avaliação36 != null) return false;
        if (avaliação37 != null ? !avaliação37.equals(that.avaliação37) : that.avaliação37 != null) return false;
        if (avaliação38 != null ? !avaliação38.equals(that.avaliação38) : that.avaliação38 != null) return false;
        if (avaliação41 != null ? !avaliação41.equals(that.avaliação41) : that.avaliação41 != null) return false;
        if (avaliação42 != null ? !avaliação42.equals(that.avaliação42) : that.avaliação42 != null) return false;
        if (avaliação43 != null ? !avaliação43.equals(that.avaliação43) : that.avaliação43 != null) return false;
        if (avaliação44 != null ? !avaliação44.equals(that.avaliação44) : that.avaliação44 != null) return false;
        if (avaliação45 != null ? !avaliação45.equals(that.avaliação45) : that.avaliação45 != null) return false;
        if (avaliação46 != null ? !avaliação46.equals(that.avaliação46) : that.avaliação46 != null) return false;
        if (avaliação47 != null ? !avaliação47.equals(that.avaliação47) : that.avaliação47 != null) return false;
        if (avaliação48 != null ? !avaliação48.equals(that.avaliação48) : that.avaliação48 != null) return false;
        if (avaliação51 != null ? !avaliação51.equals(that.avaliação51) : that.avaliação51 != null) return false;
        if (avaliação52 != null ? !avaliação52.equals(that.avaliação52) : that.avaliação52 != null) return false;
        if (avaliação53 != null ? !avaliação53.equals(that.avaliação53) : that.avaliação53 != null) return false;
        if (avaliação54 != null ? !avaliação54.equals(that.avaliação54) : that.avaliação54 != null) return false;
        if (avaliação55 != null ? !avaliação55.equals(that.avaliação55) : that.avaliação55 != null) return false;
        if (avaliação56 != null ? !avaliação56.equals(that.avaliação56) : that.avaliação56 != null) return false;
        if (avaliação57 != null ? !avaliação57.equals(that.avaliação57) : that.avaliação57 != null) return false;
        if (avaliação58 != null ? !avaliação58.equals(that.avaliação58) : that.avaliação58 != null) return false;
        if (avaliação61 != null ? !avaliação61.equals(that.avaliação61) : that.avaliação61 != null) return false;
        if (avaliação62 != null ? !avaliação62.equals(that.avaliação62) : that.avaliação62 != null) return false;
        if (avaliação63 != null ? !avaliação63.equals(that.avaliação63) : that.avaliação63 != null) return false;
        if (avaliação64 != null ? !avaliação64.equals(that.avaliação64) : that.avaliação64 != null) return false;
        if (avaliação65 != null ? !avaliação65.equals(that.avaliação65) : that.avaliação65 != null) return false;
        if (avaliação66 != null ? !avaliação66.equals(that.avaliação66) : that.avaliação66 != null) return false;
        if (avaliação67 != null ? !avaliação67.equals(that.avaliação67) : that.avaliação67 != null) return false;
        if (avaliação68 != null ? !avaliação68.equals(that.avaliação68) : that.avaliação68 != null) return false;
        if (avaliação71 != null ? !avaliação71.equals(that.avaliação71) : that.avaliação71 != null) return false;
        if (avaliação72 != null ? !avaliação72.equals(that.avaliação72) : that.avaliação72 != null) return false;
        if (avaliação73 != null ? !avaliação73.equals(that.avaliação73) : that.avaliação73 != null) return false;
        if (avaliação74 != null ? !avaliação74.equals(that.avaliação74) : that.avaliação74 != null) return false;
        if (avaliação75 != null ? !avaliação75.equals(that.avaliação75) : that.avaliação75 != null) return false;
        if (avaliação76 != null ? !avaliação76.equals(that.avaliação76) : that.avaliação76 != null) return false;
        if (avaliação77 != null ? !avaliação77.equals(that.avaliação77) : that.avaliação77 != null) return false;
        if (avaliação78 != null ? !avaliação78.equals(that.avaliação78) : that.avaliação78 != null) return false;
        if (avaliaçãoRecuperação1 != null ? !avaliaçãoRecuperação1.equals(that.avaliaçãoRecuperação1) : that.avaliaçãoRecuperação1 != null)
            return false;
        if (avaliaçãoRecuperação2 != null ? !avaliaçãoRecuperação2.equals(that.avaliaçãoRecuperação2) : that.avaliaçãoRecuperação2 != null)
            return false;
        if (avaliaçãoRecuperação3 != null ? !avaliaçãoRecuperação3.equals(that.avaliaçãoRecuperação3) : that.avaliaçãoRecuperação3 != null)
            return false;
        if (avaliaçãoRecuperação4 != null ? !avaliaçãoRecuperação4.equals(that.avaliaçãoRecuperação4) : that.avaliaçãoRecuperação4 != null)
            return false;
        if (avaliaçãoRecuperação5 != null ? !avaliaçãoRecuperação5.equals(that.avaliaçãoRecuperação5) : that.avaliaçãoRecuperação5 != null)
            return false;
        if (avaliaçãoRecuperação6 != null ? !avaliaçãoRecuperação6.equals(that.avaliaçãoRecuperação6) : that.avaliaçãoRecuperação6 != null)
            return false;
        if (avaliaçãoRecuperação7 != null ? !avaliaçãoRecuperação7.equals(that.avaliaçãoRecuperação7) : that.avaliaçãoRecuperação7 != null)
            return false;
        if (avaliaçãoRecuperação8 != null ? !avaliaçãoRecuperação8.equals(that.avaliaçãoRecuperação8) : that.avaliaçãoRecuperação8 != null)
            return false;
        if (falta1 != null ? !falta1.equals(that.falta1) : that.falta1 != null) return false;
        if (falta2 != null ? !falta2.equals(that.falta2) : that.falta2 != null) return false;
        if (falta3 != null ? !falta3.equals(that.falta3) : that.falta3 != null) return false;
        if (falta4 != null ? !falta4.equals(that.falta4) : that.falta4 != null) return false;
        if (falta5 != null ? !falta5.equals(that.falta5) : that.falta5 != null) return false;
        if (falta6 != null ? !falta6.equals(that.falta6) : that.falta6 != null) return false;
        if (falta7 != null ? !falta7.equals(that.falta7) : that.falta7 != null) return false;
        if (falta8 != null ? !falta8.equals(that.falta8) : that.falta8 != null) return false;
        if (nota1 != null ? !nota1.equals(that.nota1) : that.nota1 != null) return false;
        if (nota2 != null ? !nota2.equals(that.nota2) : that.nota2 != null) return false;
        if (nota3 != null ? !nota3.equals(that.nota3) : that.nota3 != null) return false;
        if (nota4 != null ? !nota4.equals(that.nota4) : that.nota4 != null) return false;
        if (nota5 != null ? !nota5.equals(that.nota5) : that.nota5 != null) return false;
        if (nota6 != null ? !nota6.equals(that.nota6) : that.nota6 != null) return false;
        if (nota7 != null ? !nota7.equals(that.nota7) : that.nota7 != null) return false;
        if (nota8 != null ? !nota8.equals(that.nota8) : that.nota8 != null) return false;
        if (quantidadeAvaliação1 != null ? !quantidadeAvaliação1.equals(that.quantidadeAvaliação1) : that.quantidadeAvaliação1 != null)
            return false;
        if (quantidadeAvaliação2 != null ? !quantidadeAvaliação2.equals(that.quantidadeAvaliação2) : that.quantidadeAvaliação2 != null)
            return false;
        if (quantidadeAvaliação3 != null ? !quantidadeAvaliação3.equals(that.quantidadeAvaliação3) : that.quantidadeAvaliação3 != null)
            return false;
        if (quantidadeAvaliação4 != null ? !quantidadeAvaliação4.equals(that.quantidadeAvaliação4) : that.quantidadeAvaliação4 != null)
            return false;
        if (quantidadeAvaliação5 != null ? !quantidadeAvaliação5.equals(that.quantidadeAvaliação5) : that.quantidadeAvaliação5 != null)
            return false;
        if (quantidadeAvaliação6 != null ? !quantidadeAvaliação6.equals(that.quantidadeAvaliação6) : that.quantidadeAvaliação6 != null)
            return false;
        if (quantidadeAvaliação7 != null ? !quantidadeAvaliação7.equals(that.quantidadeAvaliação7) : that.quantidadeAvaliação7 != null)
            return false;
        if (quantidadeAvaliação8 != null ? !quantidadeAvaliação8.equals(that.quantidadeAvaliação8) : that.quantidadeAvaliação8 != null)
            return false;
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
        int result = (int) (aulaConfiguraçãoId ^ (aulaConfiguraçãoId >>> 32));
        result = 31 * result + anoLetivo;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + codDisciplina;
        result = 31 * result + (nota1 != null ? nota1.hashCode() : 0);
        result = 31 * result + (nota2 != null ? nota2.hashCode() : 0);
        result = 31 * result + (nota3 != null ? nota3.hashCode() : 0);
        result = 31 * result + (nota4 != null ? nota4.hashCode() : 0);
        result = 31 * result + (nota5 != null ? nota5.hashCode() : 0);
        result = 31 * result + (nota6 != null ? nota6.hashCode() : 0);
        result = 31 * result + (nota7 != null ? nota7.hashCode() : 0);
        result = 31 * result + (nota8 != null ? nota8.hashCode() : 0);
        result = 31 * result + (recuperação1 != null ? recuperação1.hashCode() : 0);
        result = 31 * result + (recuperação2 != null ? recuperação2.hashCode() : 0);
        result = 31 * result + (recuperação3 != null ? recuperação3.hashCode() : 0);
        result = 31 * result + (recuperação4 != null ? recuperação4.hashCode() : 0);
        result = 31 * result + (recuperação5 != null ? recuperação5.hashCode() : 0);
        result = 31 * result + (recuperação6 != null ? recuperação6.hashCode() : 0);
        result = 31 * result + (recuperação7 != null ? recuperação7.hashCode() : 0);
        result = 31 * result + (recuperação8 != null ? recuperação8.hashCode() : 0);
        result = 31 * result + (falta1 != null ? falta1.hashCode() : 0);
        result = 31 * result + (falta2 != null ? falta2.hashCode() : 0);
        result = 31 * result + (falta3 != null ? falta3.hashCode() : 0);
        result = 31 * result + (falta4 != null ? falta4.hashCode() : 0);
        result = 31 * result + (falta5 != null ? falta5.hashCode() : 0);
        result = 31 * result + (falta6 != null ? falta6.hashCode() : 0);
        result = 31 * result + (falta7 != null ? falta7.hashCode() : 0);
        result = 31 * result + (falta8 != null ? falta8.hashCode() : 0);
        result = 31 * result + (quantidadeAvaliação1 != null ? quantidadeAvaliação1.hashCode() : 0);
        result = 31 * result + (quantidadeAvaliação2 != null ? quantidadeAvaliação2.hashCode() : 0);
        result = 31 * result + (quantidadeAvaliação3 != null ? quantidadeAvaliação3.hashCode() : 0);
        result = 31 * result + (quantidadeAvaliação4 != null ? quantidadeAvaliação4.hashCode() : 0);
        result = 31 * result + (quantidadeAvaliação5 != null ? quantidadeAvaliação5.hashCode() : 0);
        result = 31 * result + (quantidadeAvaliação6 != null ? quantidadeAvaliação6.hashCode() : 0);
        result = 31 * result + (quantidadeAvaliação7 != null ? quantidadeAvaliação7.hashCode() : 0);
        result = 31 * result + (quantidadeAvaliação8 != null ? quantidadeAvaliação8.hashCode() : 0);
        result = 31 * result + (avaliação11 != null ? avaliação11.hashCode() : 0);
        result = 31 * result + (avaliação12 != null ? avaliação12.hashCode() : 0);
        result = 31 * result + (avaliação13 != null ? avaliação13.hashCode() : 0);
        result = 31 * result + (avaliação14 != null ? avaliação14.hashCode() : 0);
        result = 31 * result + (avaliação15 != null ? avaliação15.hashCode() : 0);
        result = 31 * result + (avaliação16 != null ? avaliação16.hashCode() : 0);
        result = 31 * result + (avaliação17 != null ? avaliação17.hashCode() : 0);
        result = 31 * result + (avaliação18 != null ? avaliação18.hashCode() : 0);
        result = 31 * result + (avaliação21 != null ? avaliação21.hashCode() : 0);
        result = 31 * result + (avaliação22 != null ? avaliação22.hashCode() : 0);
        result = 31 * result + (avaliação23 != null ? avaliação23.hashCode() : 0);
        result = 31 * result + (avaliação24 != null ? avaliação24.hashCode() : 0);
        result = 31 * result + (avaliação25 != null ? avaliação25.hashCode() : 0);
        result = 31 * result + (avaliação26 != null ? avaliação26.hashCode() : 0);
        result = 31 * result + (avaliação27 != null ? avaliação27.hashCode() : 0);
        result = 31 * result + (avaliação28 != null ? avaliação28.hashCode() : 0);
        result = 31 * result + (avaliação31 != null ? avaliação31.hashCode() : 0);
        result = 31 * result + (avaliação32 != null ? avaliação32.hashCode() : 0);
        result = 31 * result + (avaliação33 != null ? avaliação33.hashCode() : 0);
        result = 31 * result + (avaliação34 != null ? avaliação34.hashCode() : 0);
        result = 31 * result + (avaliação35 != null ? avaliação35.hashCode() : 0);
        result = 31 * result + (avaliação36 != null ? avaliação36.hashCode() : 0);
        result = 31 * result + (avaliação37 != null ? avaliação37.hashCode() : 0);
        result = 31 * result + (avaliação38 != null ? avaliação38.hashCode() : 0);
        result = 31 * result + (avaliação41 != null ? avaliação41.hashCode() : 0);
        result = 31 * result + (avaliação42 != null ? avaliação42.hashCode() : 0);
        result = 31 * result + (avaliação43 != null ? avaliação43.hashCode() : 0);
        result = 31 * result + (avaliação44 != null ? avaliação44.hashCode() : 0);
        result = 31 * result + (avaliação45 != null ? avaliação45.hashCode() : 0);
        result = 31 * result + (avaliação46 != null ? avaliação46.hashCode() : 0);
        result = 31 * result + (avaliação47 != null ? avaliação47.hashCode() : 0);
        result = 31 * result + (avaliação48 != null ? avaliação48.hashCode() : 0);
        result = 31 * result + (avaliação51 != null ? avaliação51.hashCode() : 0);
        result = 31 * result + (avaliação52 != null ? avaliação52.hashCode() : 0);
        result = 31 * result + (avaliação53 != null ? avaliação53.hashCode() : 0);
        result = 31 * result + (avaliação54 != null ? avaliação54.hashCode() : 0);
        result = 31 * result + (avaliação55 != null ? avaliação55.hashCode() : 0);
        result = 31 * result + (avaliação56 != null ? avaliação56.hashCode() : 0);
        result = 31 * result + (avaliação57 != null ? avaliação57.hashCode() : 0);
        result = 31 * result + (avaliação58 != null ? avaliação58.hashCode() : 0);
        result = 31 * result + (avaliação61 != null ? avaliação61.hashCode() : 0);
        result = 31 * result + (avaliação62 != null ? avaliação62.hashCode() : 0);
        result = 31 * result + (avaliação63 != null ? avaliação63.hashCode() : 0);
        result = 31 * result + (avaliação64 != null ? avaliação64.hashCode() : 0);
        result = 31 * result + (avaliação65 != null ? avaliação65.hashCode() : 0);
        result = 31 * result + (avaliação66 != null ? avaliação66.hashCode() : 0);
        result = 31 * result + (avaliação67 != null ? avaliação67.hashCode() : 0);
        result = 31 * result + (avaliação68 != null ? avaliação68.hashCode() : 0);
        result = 31 * result + (avaliação71 != null ? avaliação71.hashCode() : 0);
        result = 31 * result + (avaliação72 != null ? avaliação72.hashCode() : 0);
        result = 31 * result + (avaliação73 != null ? avaliação73.hashCode() : 0);
        result = 31 * result + (avaliação74 != null ? avaliação74.hashCode() : 0);
        result = 31 * result + (avaliação75 != null ? avaliação75.hashCode() : 0);
        result = 31 * result + (avaliação76 != null ? avaliação76.hashCode() : 0);
        result = 31 * result + (avaliação77 != null ? avaliação77.hashCode() : 0);
        result = 31 * result + (avaliação78 != null ? avaliação78.hashCode() : 0);
        result = 31 * result + (avaliaçãoRecuperação1 != null ? avaliaçãoRecuperação1.hashCode() : 0);
        result = 31 * result + (avaliaçãoRecuperação2 != null ? avaliaçãoRecuperação2.hashCode() : 0);
        result = 31 * result + (avaliaçãoRecuperação3 != null ? avaliaçãoRecuperação3.hashCode() : 0);
        result = 31 * result + (avaliaçãoRecuperação4 != null ? avaliaçãoRecuperação4.hashCode() : 0);
        result = 31 * result + (avaliaçãoRecuperação5 != null ? avaliaçãoRecuperação5.hashCode() : 0);
        result = 31 * result + (avaliaçãoRecuperação6 != null ? avaliaçãoRecuperação6.hashCode() : 0);
        result = 31 * result + (avaliaçãoRecuperação7 != null ? avaliaçãoRecuperação7.hashCode() : 0);
        result = 31 * result + (avaliaçãoRecuperação8 != null ? avaliaçãoRecuperação8.hashCode() : 0);
        return result;
    }
}
