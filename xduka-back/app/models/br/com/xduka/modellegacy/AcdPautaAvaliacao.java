package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdPautaAvaliacaoPK.class)
public class AcdPautaAvaliacao {
    private long pautaAvaliaçãoId;

    @Basic
    @javax.persistence.Column(name = "PautaAvaliação_ID", nullable = false, insertable = true, updatable = true)
    public long getPautaAvaliaçãoId() {
        return pautaAvaliaçãoId;
    }

    public void setPautaAvaliaçãoId(long pautaAvaliaçãoId) {
        this.pautaAvaliaçãoId = pautaAvaliaçãoId;
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

    private Integer codDisciplinaPrincipal;

    @Basic
    @javax.persistence.Column(name = "CodDisciplinaPrincipal", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplinaPrincipal() {
        return codDisciplinaPrincipal;
    }

    public void setCodDisciplinaPrincipal(Integer codDisciplinaPrincipal) {
        this.codDisciplinaPrincipal = codDisciplinaPrincipal;
    }

    private Integer gradeÚnica;

    @Basic
    @javax.persistence.Column(name = "GradeÚnica", nullable = true, insertable = true, updatable = true)
    public Integer getGradeÚnica() {
        return gradeÚnica;
    }

    public void setGradeÚnica(Integer gradeÚnica) {
        this.gradeÚnica = gradeÚnica;
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

    private Integer anoLetivo;

    @Basic
    @javax.persistence.Column(name = "AnoLetivo", nullable = true, insertable = true, updatable = true)
    public Integer getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(Integer anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    private Integer codCurso;

    @Basic
    @javax.persistence.Column(name = "CodCurso", nullable = true, insertable = true, updatable = true)
    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    private Integer codPeríodo;

    @Basic
    @javax.persistence.Column(name = "CodPeríodo", nullable = true, insertable = true, updatable = true)
    public Integer getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(Integer codPeríodo) {
        this.codPeríodo = codPeríodo;
    }

    private String turma;

    @Basic
    @javax.persistence.Column(name = "Turma", nullable = true, insertable = true, updatable = true)
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

    private BigDecimal avaliação11;

    @Basic
    @javax.persistence.Column(name = "Avaliação11", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação11() {
        return avaliação11;
    }

    public void setAvaliação11(BigDecimal avaliação11) {
        this.avaliação11 = avaliação11;
    }

    private BigDecimal avaliação12;

    @Basic
    @javax.persistence.Column(name = "Avaliação12", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação12() {
        return avaliação12;
    }

    public void setAvaliação12(BigDecimal avaliação12) {
        this.avaliação12 = avaliação12;
    }

    private BigDecimal avaliação13;

    @Basic
    @javax.persistence.Column(name = "Avaliação13", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação13() {
        return avaliação13;
    }

    public void setAvaliação13(BigDecimal avaliação13) {
        this.avaliação13 = avaliação13;
    }

    private BigDecimal avaliação14;

    @Basic
    @javax.persistence.Column(name = "Avaliação14", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação14() {
        return avaliação14;
    }

    public void setAvaliação14(BigDecimal avaliação14) {
        this.avaliação14 = avaliação14;
    }

    private BigDecimal avaliação15;

    @Basic
    @javax.persistence.Column(name = "Avaliação15", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação15() {
        return avaliação15;
    }

    public void setAvaliação15(BigDecimal avaliação15) {
        this.avaliação15 = avaliação15;
    }

    private BigDecimal avaliação1Recuperação;

    @Basic
    @javax.persistence.Column(name = "Avaliação1Recuperação", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação1Recuperação() {
        return avaliação1Recuperação;
    }

    public void setAvaliação1Recuperação(BigDecimal avaliação1Recuperação) {
        this.avaliação1Recuperação = avaliação1Recuperação;
    }

    private BigDecimal avaliação1Total;

    @Basic
    @javax.persistence.Column(name = "Avaliação1Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação1Total() {
        return avaliação1Total;
    }

    public void setAvaliação1Total(BigDecimal avaliação1Total) {
        this.avaliação1Total = avaliação1Total;
    }

    private BigDecimal avaliação21;

    @Basic
    @javax.persistence.Column(name = "Avaliação21", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação21() {
        return avaliação21;
    }

    public void setAvaliação21(BigDecimal avaliação21) {
        this.avaliação21 = avaliação21;
    }

    private BigDecimal avaliação22;

    @Basic
    @javax.persistence.Column(name = "Avaliação22", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação22() {
        return avaliação22;
    }

    public void setAvaliação22(BigDecimal avaliação22) {
        this.avaliação22 = avaliação22;
    }

    private BigDecimal avaliação23;

    @Basic
    @javax.persistence.Column(name = "Avaliação23", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação23() {
        return avaliação23;
    }

    public void setAvaliação23(BigDecimal avaliação23) {
        this.avaliação23 = avaliação23;
    }

    private BigDecimal avaliação24;

    @Basic
    @javax.persistence.Column(name = "Avaliação24", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação24() {
        return avaliação24;
    }

    public void setAvaliação24(BigDecimal avaliação24) {
        this.avaliação24 = avaliação24;
    }

    private BigDecimal avaliação25;

    @Basic
    @javax.persistence.Column(name = "Avaliação25", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação25() {
        return avaliação25;
    }

    public void setAvaliação25(BigDecimal avaliação25) {
        this.avaliação25 = avaliação25;
    }

    private BigDecimal avaliação2Recuperação;

    @Basic
    @javax.persistence.Column(name = "Avaliação2Recuperação", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação2Recuperação() {
        return avaliação2Recuperação;
    }

    public void setAvaliação2Recuperação(BigDecimal avaliação2Recuperação) {
        this.avaliação2Recuperação = avaliação2Recuperação;
    }

    private BigDecimal avaliação2Total;

    @Basic
    @javax.persistence.Column(name = "Avaliação2Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação2Total() {
        return avaliação2Total;
    }

    public void setAvaliação2Total(BigDecimal avaliação2Total) {
        this.avaliação2Total = avaliação2Total;
    }

    private BigDecimal avaliação31;

    @Basic
    @javax.persistence.Column(name = "Avaliação31", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação31() {
        return avaliação31;
    }

    public void setAvaliação31(BigDecimal avaliação31) {
        this.avaliação31 = avaliação31;
    }

    private BigDecimal avaliação32;

    @Basic
    @javax.persistence.Column(name = "Avaliação32", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação32() {
        return avaliação32;
    }

    public void setAvaliação32(BigDecimal avaliação32) {
        this.avaliação32 = avaliação32;
    }

    private BigDecimal avaliação33;

    @Basic
    @javax.persistence.Column(name = "Avaliação33", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação33() {
        return avaliação33;
    }

    public void setAvaliação33(BigDecimal avaliação33) {
        this.avaliação33 = avaliação33;
    }

    private BigDecimal avaliação34;

    @Basic
    @javax.persistence.Column(name = "Avaliação34", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação34() {
        return avaliação34;
    }

    public void setAvaliação34(BigDecimal avaliação34) {
        this.avaliação34 = avaliação34;
    }

    private BigDecimal avaliação35;

    @Basic
    @javax.persistence.Column(name = "Avaliação35", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação35() {
        return avaliação35;
    }

    public void setAvaliação35(BigDecimal avaliação35) {
        this.avaliação35 = avaliação35;
    }

    private BigDecimal avaliação3Recuperação;

    @Basic
    @javax.persistence.Column(name = "Avaliação3Recuperação", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação3Recuperação() {
        return avaliação3Recuperação;
    }

    public void setAvaliação3Recuperação(BigDecimal avaliação3Recuperação) {
        this.avaliação3Recuperação = avaliação3Recuperação;
    }

    private BigDecimal avaliação3Total;

    @Basic
    @javax.persistence.Column(name = "Avaliação3Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação3Total() {
        return avaliação3Total;
    }

    public void setAvaliação3Total(BigDecimal avaliação3Total) {
        this.avaliação3Total = avaliação3Total;
    }

    private BigDecimal avaliação41;

    @Basic
    @javax.persistence.Column(name = "Avaliação41", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação41() {
        return avaliação41;
    }

    public void setAvaliação41(BigDecimal avaliação41) {
        this.avaliação41 = avaliação41;
    }

    private BigDecimal avaliação42;

    @Basic
    @javax.persistence.Column(name = "Avaliação42", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação42() {
        return avaliação42;
    }

    public void setAvaliação42(BigDecimal avaliação42) {
        this.avaliação42 = avaliação42;
    }

    private BigDecimal avaliação43;

    @Basic
    @javax.persistence.Column(name = "Avaliação43", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação43() {
        return avaliação43;
    }

    public void setAvaliação43(BigDecimal avaliação43) {
        this.avaliação43 = avaliação43;
    }

    private BigDecimal avaliação44;

    @Basic
    @javax.persistence.Column(name = "Avaliação44", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação44() {
        return avaliação44;
    }

    public void setAvaliação44(BigDecimal avaliação44) {
        this.avaliação44 = avaliação44;
    }

    private BigDecimal avaliação45;

    @Basic
    @javax.persistence.Column(name = "Avaliação45", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação45() {
        return avaliação45;
    }

    public void setAvaliação45(BigDecimal avaliação45) {
        this.avaliação45 = avaliação45;
    }

    private BigDecimal avaliação4Recuperação;

    @Basic
    @javax.persistence.Column(name = "Avaliação4Recuperação", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação4Recuperação() {
        return avaliação4Recuperação;
    }

    public void setAvaliação4Recuperação(BigDecimal avaliação4Recuperação) {
        this.avaliação4Recuperação = avaliação4Recuperação;
    }

    private BigDecimal avaliação4Total;

    @Basic
    @javax.persistence.Column(name = "Avaliação4Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação4Total() {
        return avaliação4Total;
    }

    public void setAvaliação4Total(BigDecimal avaliação4Total) {
        this.avaliação4Total = avaliação4Total;
    }

    private BigDecimal avaliação51;

    @Basic
    @javax.persistence.Column(name = "Avaliação51", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação51() {
        return avaliação51;
    }

    public void setAvaliação51(BigDecimal avaliação51) {
        this.avaliação51 = avaliação51;
    }

    private BigDecimal avaliação52;

    @Basic
    @javax.persistence.Column(name = "Avaliação52", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação52() {
        return avaliação52;
    }

    public void setAvaliação52(BigDecimal avaliação52) {
        this.avaliação52 = avaliação52;
    }

    private BigDecimal avaliação53;

    @Basic
    @javax.persistence.Column(name = "Avaliação53", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação53() {
        return avaliação53;
    }

    public void setAvaliação53(BigDecimal avaliação53) {
        this.avaliação53 = avaliação53;
    }

    private BigDecimal avaliação54;

    @Basic
    @javax.persistence.Column(name = "Avaliação54", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação54() {
        return avaliação54;
    }

    public void setAvaliação54(BigDecimal avaliação54) {
        this.avaliação54 = avaliação54;
    }

    private BigDecimal avaliação55;

    @Basic
    @javax.persistence.Column(name = "Avaliação55", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação55() {
        return avaliação55;
    }

    public void setAvaliação55(BigDecimal avaliação55) {
        this.avaliação55 = avaliação55;
    }

    private BigDecimal avaliação5Recuperação;

    @Basic
    @javax.persistence.Column(name = "Avaliação5Recuperação", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação5Recuperação() {
        return avaliação5Recuperação;
    }

    public void setAvaliação5Recuperação(BigDecimal avaliação5Recuperação) {
        this.avaliação5Recuperação = avaliação5Recuperação;
    }

    private BigDecimal avaliação5Total;

    @Basic
    @javax.persistence.Column(name = "Avaliação5Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação5Total() {
        return avaliação5Total;
    }

    public void setAvaliação5Total(BigDecimal avaliação5Total) {
        this.avaliação5Total = avaliação5Total;
    }

    private BigDecimal avaliação61;

    @Basic
    @javax.persistence.Column(name = "Avaliação61", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação61() {
        return avaliação61;
    }

    public void setAvaliação61(BigDecimal avaliação61) {
        this.avaliação61 = avaliação61;
    }

    private BigDecimal avaliação62;

    @Basic
    @javax.persistence.Column(name = "Avaliação62", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação62() {
        return avaliação62;
    }

    public void setAvaliação62(BigDecimal avaliação62) {
        this.avaliação62 = avaliação62;
    }

    private BigDecimal avaliação63;

    @Basic
    @javax.persistence.Column(name = "Avaliação63", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação63() {
        return avaliação63;
    }

    public void setAvaliação63(BigDecimal avaliação63) {
        this.avaliação63 = avaliação63;
    }

    private BigDecimal avaliação64;

    @Basic
    @javax.persistence.Column(name = "Avaliação64", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação64() {
        return avaliação64;
    }

    public void setAvaliação64(BigDecimal avaliação64) {
        this.avaliação64 = avaliação64;
    }

    private BigDecimal avaliação65;

    @Basic
    @javax.persistence.Column(name = "Avaliação65", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação65() {
        return avaliação65;
    }

    public void setAvaliação65(BigDecimal avaliação65) {
        this.avaliação65 = avaliação65;
    }

    private BigDecimal avaliação6Recuperação;

    @Basic
    @javax.persistence.Column(name = "Avaliação6Recuperação", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação6Recuperação() {
        return avaliação6Recuperação;
    }

    public void setAvaliação6Recuperação(BigDecimal avaliação6Recuperação) {
        this.avaliação6Recuperação = avaliação6Recuperação;
    }

    private BigDecimal avaliação6Total;

    @Basic
    @javax.persistence.Column(name = "Avaliação6Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação6Total() {
        return avaliação6Total;
    }

    public void setAvaliação6Total(BigDecimal avaliação6Total) {
        this.avaliação6Total = avaliação6Total;
    }

    private BigDecimal avaliação71;

    @Basic
    @javax.persistence.Column(name = "Avaliação71", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação71() {
        return avaliação71;
    }

    public void setAvaliação71(BigDecimal avaliação71) {
        this.avaliação71 = avaliação71;
    }

    private BigDecimal avaliação72;

    @Basic
    @javax.persistence.Column(name = "Avaliação72", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação72() {
        return avaliação72;
    }

    public void setAvaliação72(BigDecimal avaliação72) {
        this.avaliação72 = avaliação72;
    }

    private BigDecimal avaliação73;

    @Basic
    @javax.persistence.Column(name = "Avaliação73", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação73() {
        return avaliação73;
    }

    public void setAvaliação73(BigDecimal avaliação73) {
        this.avaliação73 = avaliação73;
    }

    private BigDecimal avaliação74;

    @Basic
    @javax.persistence.Column(name = "Avaliação74", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação74() {
        return avaliação74;
    }

    public void setAvaliação74(BigDecimal avaliação74) {
        this.avaliação74 = avaliação74;
    }

    private BigDecimal avaliação75;

    @Basic
    @javax.persistence.Column(name = "Avaliação75", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação75() {
        return avaliação75;
    }

    public void setAvaliação75(BigDecimal avaliação75) {
        this.avaliação75 = avaliação75;
    }

    private BigDecimal avaliação7Recuperação;

    @Basic
    @javax.persistence.Column(name = "Avaliação7Recuperação", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação7Recuperação() {
        return avaliação7Recuperação;
    }

    public void setAvaliação7Recuperação(BigDecimal avaliação7Recuperação) {
        this.avaliação7Recuperação = avaliação7Recuperação;
    }

    private BigDecimal avaliação7Total;

    @Basic
    @javax.persistence.Column(name = "Avaliação7Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação7Total() {
        return avaliação7Total;
    }

    public void setAvaliação7Total(BigDecimal avaliação7Total) {
        this.avaliação7Total = avaliação7Total;
    }

    private BigDecimal avaliação81;

    @Basic
    @javax.persistence.Column(name = "Avaliação81", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação81() {
        return avaliação81;
    }

    public void setAvaliação81(BigDecimal avaliação81) {
        this.avaliação81 = avaliação81;
    }

    private BigDecimal avaliação82;

    @Basic
    @javax.persistence.Column(name = "Avaliação82", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação82() {
        return avaliação82;
    }

    public void setAvaliação82(BigDecimal avaliação82) {
        this.avaliação82 = avaliação82;
    }

    private BigDecimal avaliação83;

    @Basic
    @javax.persistence.Column(name = "Avaliação83", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação83() {
        return avaliação83;
    }

    public void setAvaliação83(BigDecimal avaliação83) {
        this.avaliação83 = avaliação83;
    }

    private BigDecimal avaliação84;

    @Basic
    @javax.persistence.Column(name = "Avaliação84", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação84() {
        return avaliação84;
    }

    public void setAvaliação84(BigDecimal avaliação84) {
        this.avaliação84 = avaliação84;
    }

    private BigDecimal avaliação85;

    @Basic
    @javax.persistence.Column(name = "Avaliação85", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação85() {
        return avaliação85;
    }

    public void setAvaliação85(BigDecimal avaliação85) {
        this.avaliação85 = avaliação85;
    }

    private BigDecimal avaliação8Recuperação;

    @Basic
    @javax.persistence.Column(name = "Avaliação8Recuperação", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação8Recuperação() {
        return avaliação8Recuperação;
    }

    public void setAvaliação8Recuperação(BigDecimal avaliação8Recuperação) {
        this.avaliação8Recuperação = avaliação8Recuperação;
    }

    private BigDecimal avaliação8Total;

    @Basic
    @javax.persistence.Column(name = "Avaliação8Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação8Total() {
        return avaliação8Total;
    }

    public void setAvaliação8Total(BigDecimal avaliação8Total) {
        this.avaliação8Total = avaliação8Total;
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

    private Boolean processando;

    @Basic
    @javax.persistence.Column(name = "Processando", nullable = true, insertable = true, updatable = true)
    public Boolean getProcessando() {
        return processando;
    }

    public void setProcessando(Boolean processando) {
        this.processando = processando;
    }

    private BigDecimal avaliação16;

    @Basic
    @javax.persistence.Column(name = "Avaliação16", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação16() {
        return avaliação16;
    }

    public void setAvaliação16(BigDecimal avaliação16) {
        this.avaliação16 = avaliação16;
    }

    private BigDecimal avaliação17;

    @Basic
    @javax.persistence.Column(name = "Avaliação17", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação17() {
        return avaliação17;
    }

    public void setAvaliação17(BigDecimal avaliação17) {
        this.avaliação17 = avaliação17;
    }

    private BigDecimal avaliação26;

    @Basic
    @javax.persistence.Column(name = "Avaliação26", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação26() {
        return avaliação26;
    }

    public void setAvaliação26(BigDecimal avaliação26) {
        this.avaliação26 = avaliação26;
    }

    private BigDecimal avaliação27;

    @Basic
    @javax.persistence.Column(name = "Avaliação27", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação27() {
        return avaliação27;
    }

    public void setAvaliação27(BigDecimal avaliação27) {
        this.avaliação27 = avaliação27;
    }

    private BigDecimal avaliação36;

    @Basic
    @javax.persistence.Column(name = "Avaliação36", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação36() {
        return avaliação36;
    }

    public void setAvaliação36(BigDecimal avaliação36) {
        this.avaliação36 = avaliação36;
    }

    private BigDecimal avaliação37;

    @Basic
    @javax.persistence.Column(name = "Avaliação37", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação37() {
        return avaliação37;
    }

    public void setAvaliação37(BigDecimal avaliação37) {
        this.avaliação37 = avaliação37;
    }

    private BigDecimal avaliação46;

    @Basic
    @javax.persistence.Column(name = "Avaliação46", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação46() {
        return avaliação46;
    }

    public void setAvaliação46(BigDecimal avaliação46) {
        this.avaliação46 = avaliação46;
    }

    private BigDecimal avaliação47;

    @Basic
    @javax.persistence.Column(name = "Avaliação47", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação47() {
        return avaliação47;
    }

    public void setAvaliação47(BigDecimal avaliação47) {
        this.avaliação47 = avaliação47;
    }

    private BigDecimal avaliação56;

    @Basic
    @javax.persistence.Column(name = "Avaliação56", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação56() {
        return avaliação56;
    }

    public void setAvaliação56(BigDecimal avaliação56) {
        this.avaliação56 = avaliação56;
    }

    private BigDecimal avaliação57;

    @Basic
    @javax.persistence.Column(name = "Avaliação57", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação57() {
        return avaliação57;
    }

    public void setAvaliação57(BigDecimal avaliação57) {
        this.avaliação57 = avaliação57;
    }

    private BigDecimal avaliação66;

    @Basic
    @javax.persistence.Column(name = "Avaliação66", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação66() {
        return avaliação66;
    }

    public void setAvaliação66(BigDecimal avaliação66) {
        this.avaliação66 = avaliação66;
    }

    private BigDecimal avaliação67;

    @Basic
    @javax.persistence.Column(name = "Avaliação67", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação67() {
        return avaliação67;
    }

    public void setAvaliação67(BigDecimal avaliação67) {
        this.avaliação67 = avaliação67;
    }

    private BigDecimal avaliação76;

    @Basic
    @javax.persistence.Column(name = "Avaliação76", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação76() {
        return avaliação76;
    }

    public void setAvaliação76(BigDecimal avaliação76) {
        this.avaliação76 = avaliação76;
    }

    private BigDecimal avaliação77;

    @Basic
    @javax.persistence.Column(name = "Avaliação77", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação77() {
        return avaliação77;
    }

    public void setAvaliação77(BigDecimal avaliação77) {
        this.avaliação77 = avaliação77;
    }

    private BigDecimal avaliação86;

    @Basic
    @javax.persistence.Column(name = "Avaliação86", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação86() {
        return avaliação86;
    }

    public void setAvaliação86(BigDecimal avaliação86) {
        this.avaliação86 = avaliação86;
    }

    private BigDecimal avaliação87;

    @Basic
    @javax.persistence.Column(name = "Avaliação87", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAvaliação87() {
        return avaliação87;
    }

    public void setAvaliação87(BigDecimal avaliação87) {
        this.avaliação87 = avaliação87;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdPautaAvaliacao that = (AcdPautaAvaliacao) o;

        if (codDisciplina != that.codDisciplina) return false;
        if (codPauta != that.codPauta) return false;
        if (codUnidade != that.codUnidade) return false;
        if (dependência != that.dependência) return false;
        if (desatualizada != that.desatualizada) return false;
        if (pautaAvaliaçãoId != that.pautaAvaliaçãoId) return false;
        if (anoLetivo != null ? !anoLetivo.equals(that.anoLetivo) : that.anoLetivo != null) return false;
        if (avaliação11 != null ? !avaliação11.equals(that.avaliação11) : that.avaliação11 != null) return false;
        if (avaliação12 != null ? !avaliação12.equals(that.avaliação12) : that.avaliação12 != null) return false;
        if (avaliação13 != null ? !avaliação13.equals(that.avaliação13) : that.avaliação13 != null) return false;
        if (avaliação14 != null ? !avaliação14.equals(that.avaliação14) : that.avaliação14 != null) return false;
        if (avaliação15 != null ? !avaliação15.equals(that.avaliação15) : that.avaliação15 != null) return false;
        if (avaliação16 != null ? !avaliação16.equals(that.avaliação16) : that.avaliação16 != null) return false;
        if (avaliação17 != null ? !avaliação17.equals(that.avaliação17) : that.avaliação17 != null) return false;
        if (avaliação1Recuperação != null ? !avaliação1Recuperação.equals(that.avaliação1Recuperação) : that.avaliação1Recuperação != null)
            return false;
        if (avaliação1Total != null ? !avaliação1Total.equals(that.avaliação1Total) : that.avaliação1Total != null)
            return false;
        if (avaliação21 != null ? !avaliação21.equals(that.avaliação21) : that.avaliação21 != null) return false;
        if (avaliação22 != null ? !avaliação22.equals(that.avaliação22) : that.avaliação22 != null) return false;
        if (avaliação23 != null ? !avaliação23.equals(that.avaliação23) : that.avaliação23 != null) return false;
        if (avaliação24 != null ? !avaliação24.equals(that.avaliação24) : that.avaliação24 != null) return false;
        if (avaliação25 != null ? !avaliação25.equals(that.avaliação25) : that.avaliação25 != null) return false;
        if (avaliação26 != null ? !avaliação26.equals(that.avaliação26) : that.avaliação26 != null) return false;
        if (avaliação27 != null ? !avaliação27.equals(that.avaliação27) : that.avaliação27 != null) return false;
        if (avaliação2Recuperação != null ? !avaliação2Recuperação.equals(that.avaliação2Recuperação) : that.avaliação2Recuperação != null)
            return false;
        if (avaliação2Total != null ? !avaliação2Total.equals(that.avaliação2Total) : that.avaliação2Total != null)
            return false;
        if (avaliação31 != null ? !avaliação31.equals(that.avaliação31) : that.avaliação31 != null) return false;
        if (avaliação32 != null ? !avaliação32.equals(that.avaliação32) : that.avaliação32 != null) return false;
        if (avaliação33 != null ? !avaliação33.equals(that.avaliação33) : that.avaliação33 != null) return false;
        if (avaliação34 != null ? !avaliação34.equals(that.avaliação34) : that.avaliação34 != null) return false;
        if (avaliação35 != null ? !avaliação35.equals(that.avaliação35) : that.avaliação35 != null) return false;
        if (avaliação36 != null ? !avaliação36.equals(that.avaliação36) : that.avaliação36 != null) return false;
        if (avaliação37 != null ? !avaliação37.equals(that.avaliação37) : that.avaliação37 != null) return false;
        if (avaliação3Recuperação != null ? !avaliação3Recuperação.equals(that.avaliação3Recuperação) : that.avaliação3Recuperação != null)
            return false;
        if (avaliação3Total != null ? !avaliação3Total.equals(that.avaliação3Total) : that.avaliação3Total != null)
            return false;
        if (avaliação41 != null ? !avaliação41.equals(that.avaliação41) : that.avaliação41 != null) return false;
        if (avaliação42 != null ? !avaliação42.equals(that.avaliação42) : that.avaliação42 != null) return false;
        if (avaliação43 != null ? !avaliação43.equals(that.avaliação43) : that.avaliação43 != null) return false;
        if (avaliação44 != null ? !avaliação44.equals(that.avaliação44) : that.avaliação44 != null) return false;
        if (avaliação45 != null ? !avaliação45.equals(that.avaliação45) : that.avaliação45 != null) return false;
        if (avaliação46 != null ? !avaliação46.equals(that.avaliação46) : that.avaliação46 != null) return false;
        if (avaliação47 != null ? !avaliação47.equals(that.avaliação47) : that.avaliação47 != null) return false;
        if (avaliação4Recuperação != null ? !avaliação4Recuperação.equals(that.avaliação4Recuperação) : that.avaliação4Recuperação != null)
            return false;
        if (avaliação4Total != null ? !avaliação4Total.equals(that.avaliação4Total) : that.avaliação4Total != null)
            return false;
        if (avaliação51 != null ? !avaliação51.equals(that.avaliação51) : that.avaliação51 != null) return false;
        if (avaliação52 != null ? !avaliação52.equals(that.avaliação52) : that.avaliação52 != null) return false;
        if (avaliação53 != null ? !avaliação53.equals(that.avaliação53) : that.avaliação53 != null) return false;
        if (avaliação54 != null ? !avaliação54.equals(that.avaliação54) : that.avaliação54 != null) return false;
        if (avaliação55 != null ? !avaliação55.equals(that.avaliação55) : that.avaliação55 != null) return false;
        if (avaliação56 != null ? !avaliação56.equals(that.avaliação56) : that.avaliação56 != null) return false;
        if (avaliação57 != null ? !avaliação57.equals(that.avaliação57) : that.avaliação57 != null) return false;
        if (avaliação5Recuperação != null ? !avaliação5Recuperação.equals(that.avaliação5Recuperação) : that.avaliação5Recuperação != null)
            return false;
        if (avaliação5Total != null ? !avaliação5Total.equals(that.avaliação5Total) : that.avaliação5Total != null)
            return false;
        if (avaliação61 != null ? !avaliação61.equals(that.avaliação61) : that.avaliação61 != null) return false;
        if (avaliação62 != null ? !avaliação62.equals(that.avaliação62) : that.avaliação62 != null) return false;
        if (avaliação63 != null ? !avaliação63.equals(that.avaliação63) : that.avaliação63 != null) return false;
        if (avaliação64 != null ? !avaliação64.equals(that.avaliação64) : that.avaliação64 != null) return false;
        if (avaliação65 != null ? !avaliação65.equals(that.avaliação65) : that.avaliação65 != null) return false;
        if (avaliação66 != null ? !avaliação66.equals(that.avaliação66) : that.avaliação66 != null) return false;
        if (avaliação67 != null ? !avaliação67.equals(that.avaliação67) : that.avaliação67 != null) return false;
        if (avaliação6Recuperação != null ? !avaliação6Recuperação.equals(that.avaliação6Recuperação) : that.avaliação6Recuperação != null)
            return false;
        if (avaliação6Total != null ? !avaliação6Total.equals(that.avaliação6Total) : that.avaliação6Total != null)
            return false;
        if (avaliação71 != null ? !avaliação71.equals(that.avaliação71) : that.avaliação71 != null) return false;
        if (avaliação72 != null ? !avaliação72.equals(that.avaliação72) : that.avaliação72 != null) return false;
        if (avaliação73 != null ? !avaliação73.equals(that.avaliação73) : that.avaliação73 != null) return false;
        if (avaliação74 != null ? !avaliação74.equals(that.avaliação74) : that.avaliação74 != null) return false;
        if (avaliação75 != null ? !avaliação75.equals(that.avaliação75) : that.avaliação75 != null) return false;
        if (avaliação76 != null ? !avaliação76.equals(that.avaliação76) : that.avaliação76 != null) return false;
        if (avaliação77 != null ? !avaliação77.equals(that.avaliação77) : that.avaliação77 != null) return false;
        if (avaliação7Recuperação != null ? !avaliação7Recuperação.equals(that.avaliação7Recuperação) : that.avaliação7Recuperação != null)
            return false;
        if (avaliação7Total != null ? !avaliação7Total.equals(that.avaliação7Total) : that.avaliação7Total != null)
            return false;
        if (avaliação81 != null ? !avaliação81.equals(that.avaliação81) : that.avaliação81 != null) return false;
        if (avaliação82 != null ? !avaliação82.equals(that.avaliação82) : that.avaliação82 != null) return false;
        if (avaliação83 != null ? !avaliação83.equals(that.avaliação83) : that.avaliação83 != null) return false;
        if (avaliação84 != null ? !avaliação84.equals(that.avaliação84) : that.avaliação84 != null) return false;
        if (avaliação85 != null ? !avaliação85.equals(that.avaliação85) : that.avaliação85 != null) return false;
        if (avaliação86 != null ? !avaliação86.equals(that.avaliação86) : that.avaliação86 != null) return false;
        if (avaliação87 != null ? !avaliação87.equals(that.avaliação87) : that.avaliação87 != null) return false;
        if (avaliação8Recuperação != null ? !avaliação8Recuperação.equals(that.avaliação8Recuperação) : that.avaliação8Recuperação != null)
            return false;
        if (avaliação8Total != null ? !avaliação8Total.equals(that.avaliação8Total) : that.avaliação8Total != null)
            return false;
        if (codCurso != null ? !codCurso.equals(that.codCurso) : that.codCurso != null) return false;
        if (codDisciplinaPrincipal != null ? !codDisciplinaPrincipal.equals(that.codDisciplinaPrincipal) : that.codDisciplinaPrincipal != null)
            return false;
        if (codPeríodo != null ? !codPeríodo.equals(that.codPeríodo) : that.codPeríodo != null) return false;
        if (gradeÚnica != null ? !gradeÚnica.equals(that.gradeÚnica) : that.gradeÚnica != null) return false;
        if (matrícula != null ? !matrícula.equals(that.matrícula) : that.matrícula != null) return false;
        if (númeroPauta != null ? !númeroPauta.equals(that.númeroPauta) : that.númeroPauta != null) return false;
        if (processando != null ? !processando.equals(that.processando) : that.processando != null) return false;
        if (turma != null ? !turma.equals(that.turma) : that.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pautaAvaliaçãoId ^ (pautaAvaliaçãoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) (codPauta ^ (codPauta >>> 32));
        result = 31 * result + codDisciplina;
        result = 31 * result + (int) dependência;
        result = 31 * result + (codDisciplinaPrincipal != null ? codDisciplinaPrincipal.hashCode() : 0);
        result = 31 * result + (gradeÚnica != null ? gradeÚnica.hashCode() : 0);
        result = 31 * result + (matrícula != null ? matrícula.hashCode() : 0);
        result = 31 * result + (anoLetivo != null ? anoLetivo.hashCode() : 0);
        result = 31 * result + (codCurso != null ? codCurso.hashCode() : 0);
        result = 31 * result + (codPeríodo != null ? codPeríodo.hashCode() : 0);
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + (númeroPauta != null ? númeroPauta.hashCode() : 0);
        result = 31 * result + (avaliação11 != null ? avaliação11.hashCode() : 0);
        result = 31 * result + (avaliação12 != null ? avaliação12.hashCode() : 0);
        result = 31 * result + (avaliação13 != null ? avaliação13.hashCode() : 0);
        result = 31 * result + (avaliação14 != null ? avaliação14.hashCode() : 0);
        result = 31 * result + (avaliação15 != null ? avaliação15.hashCode() : 0);
        result = 31 * result + (avaliação1Recuperação != null ? avaliação1Recuperação.hashCode() : 0);
        result = 31 * result + (avaliação1Total != null ? avaliação1Total.hashCode() : 0);
        result = 31 * result + (avaliação21 != null ? avaliação21.hashCode() : 0);
        result = 31 * result + (avaliação22 != null ? avaliação22.hashCode() : 0);
        result = 31 * result + (avaliação23 != null ? avaliação23.hashCode() : 0);
        result = 31 * result + (avaliação24 != null ? avaliação24.hashCode() : 0);
        result = 31 * result + (avaliação25 != null ? avaliação25.hashCode() : 0);
        result = 31 * result + (avaliação2Recuperação != null ? avaliação2Recuperação.hashCode() : 0);
        result = 31 * result + (avaliação2Total != null ? avaliação2Total.hashCode() : 0);
        result = 31 * result + (avaliação31 != null ? avaliação31.hashCode() : 0);
        result = 31 * result + (avaliação32 != null ? avaliação32.hashCode() : 0);
        result = 31 * result + (avaliação33 != null ? avaliação33.hashCode() : 0);
        result = 31 * result + (avaliação34 != null ? avaliação34.hashCode() : 0);
        result = 31 * result + (avaliação35 != null ? avaliação35.hashCode() : 0);
        result = 31 * result + (avaliação3Recuperação != null ? avaliação3Recuperação.hashCode() : 0);
        result = 31 * result + (avaliação3Total != null ? avaliação3Total.hashCode() : 0);
        result = 31 * result + (avaliação41 != null ? avaliação41.hashCode() : 0);
        result = 31 * result + (avaliação42 != null ? avaliação42.hashCode() : 0);
        result = 31 * result + (avaliação43 != null ? avaliação43.hashCode() : 0);
        result = 31 * result + (avaliação44 != null ? avaliação44.hashCode() : 0);
        result = 31 * result + (avaliação45 != null ? avaliação45.hashCode() : 0);
        result = 31 * result + (avaliação4Recuperação != null ? avaliação4Recuperação.hashCode() : 0);
        result = 31 * result + (avaliação4Total != null ? avaliação4Total.hashCode() : 0);
        result = 31 * result + (avaliação51 != null ? avaliação51.hashCode() : 0);
        result = 31 * result + (avaliação52 != null ? avaliação52.hashCode() : 0);
        result = 31 * result + (avaliação53 != null ? avaliação53.hashCode() : 0);
        result = 31 * result + (avaliação54 != null ? avaliação54.hashCode() : 0);
        result = 31 * result + (avaliação55 != null ? avaliação55.hashCode() : 0);
        result = 31 * result + (avaliação5Recuperação != null ? avaliação5Recuperação.hashCode() : 0);
        result = 31 * result + (avaliação5Total != null ? avaliação5Total.hashCode() : 0);
        result = 31 * result + (avaliação61 != null ? avaliação61.hashCode() : 0);
        result = 31 * result + (avaliação62 != null ? avaliação62.hashCode() : 0);
        result = 31 * result + (avaliação63 != null ? avaliação63.hashCode() : 0);
        result = 31 * result + (avaliação64 != null ? avaliação64.hashCode() : 0);
        result = 31 * result + (avaliação65 != null ? avaliação65.hashCode() : 0);
        result = 31 * result + (avaliação6Recuperação != null ? avaliação6Recuperação.hashCode() : 0);
        result = 31 * result + (avaliação6Total != null ? avaliação6Total.hashCode() : 0);
        result = 31 * result + (avaliação71 != null ? avaliação71.hashCode() : 0);
        result = 31 * result + (avaliação72 != null ? avaliação72.hashCode() : 0);
        result = 31 * result + (avaliação73 != null ? avaliação73.hashCode() : 0);
        result = 31 * result + (avaliação74 != null ? avaliação74.hashCode() : 0);
        result = 31 * result + (avaliação75 != null ? avaliação75.hashCode() : 0);
        result = 31 * result + (avaliação7Recuperação != null ? avaliação7Recuperação.hashCode() : 0);
        result = 31 * result + (avaliação7Total != null ? avaliação7Total.hashCode() : 0);
        result = 31 * result + (avaliação81 != null ? avaliação81.hashCode() : 0);
        result = 31 * result + (avaliação82 != null ? avaliação82.hashCode() : 0);
        result = 31 * result + (avaliação83 != null ? avaliação83.hashCode() : 0);
        result = 31 * result + (avaliação84 != null ? avaliação84.hashCode() : 0);
        result = 31 * result + (avaliação85 != null ? avaliação85.hashCode() : 0);
        result = 31 * result + (avaliação8Recuperação != null ? avaliação8Recuperação.hashCode() : 0);
        result = 31 * result + (avaliação8Total != null ? avaliação8Total.hashCode() : 0);
        result = 31 * result + (desatualizada ? 1 : 0);
        result = 31 * result + (processando != null ? processando.hashCode() : 0);
        result = 31 * result + (avaliação16 != null ? avaliação16.hashCode() : 0);
        result = 31 * result + (avaliação17 != null ? avaliação17.hashCode() : 0);
        result = 31 * result + (avaliação26 != null ? avaliação26.hashCode() : 0);
        result = 31 * result + (avaliação27 != null ? avaliação27.hashCode() : 0);
        result = 31 * result + (avaliação36 != null ? avaliação36.hashCode() : 0);
        result = 31 * result + (avaliação37 != null ? avaliação37.hashCode() : 0);
        result = 31 * result + (avaliação46 != null ? avaliação46.hashCode() : 0);
        result = 31 * result + (avaliação47 != null ? avaliação47.hashCode() : 0);
        result = 31 * result + (avaliação56 != null ? avaliação56.hashCode() : 0);
        result = 31 * result + (avaliação57 != null ? avaliação57.hashCode() : 0);
        result = 31 * result + (avaliação66 != null ? avaliação66.hashCode() : 0);
        result = 31 * result + (avaliação67 != null ? avaliação67.hashCode() : 0);
        result = 31 * result + (avaliação76 != null ? avaliação76.hashCode() : 0);
        result = 31 * result + (avaliação77 != null ? avaliação77.hashCode() : 0);
        result = 31 * result + (avaliação86 != null ? avaliação86.hashCode() : 0);
        result = 31 * result + (avaliação87 != null ? avaliação87.hashCode() : 0);
        return result;
    }
}
