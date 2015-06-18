package br.com.xduka.modellegacy.entities;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by clayton on 03/12/14.
 */
@Entity
@IdClass(AcdAlunoPK.class)
public class AcdAluno {
    private long alunoId;
    private int codUnidade;
    private int matrícula;
    private long codPautaUtilizada;
    private Integer códigoBarra;
    private Integer matrículaOrigem;
    private Integer matrículaDestino;
    private Byte codCarta;
    private Timestamp cartaData;
    private Integer codInscrição;
    private String senhaAluno;
    private String senhaResponsável;
    private Short codOrigem;
    private String matrículaLonga;
    private Long codMovimentoUtilizado;
    private byte[] cts;
    private String matrículaBarra;
    private String ftp;
    private String mail;
    private int codAluno;
    private int codPai;
    private int codMãe;


    @Basic
    @Column(name = "Aluno_ID", nullable = false, insertable = true, updatable = true)
    public long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(long alunoId) {
        this.alunoId = alunoId;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "Matrícula", nullable = false, insertable = true, updatable = true)
    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }

    @Basic
    @Column(name = "CodPautaUtilizada", nullable = false, insertable = true, updatable = true)
    public long getCodPautaUtilizada() {
        return codPautaUtilizada;
    }

    public void setCodPautaUtilizada(long codPautaUtilizada) {
        this.codPautaUtilizada = codPautaUtilizada;
    }

    @Basic
    @Column(name = "CódigoBarra", nullable = true, insertable = true, updatable = true)
    public Integer getCódigoBarra() {
        return códigoBarra;
    }

    public void setCódigoBarra(Integer códigoBarra) {
        this.códigoBarra = códigoBarra;
    }

    @Basic
    @Column(name = "MatrículaOrigem", nullable = true, insertable = true, updatable = true)
    public Integer getMatrículaOrigem() {
        return matrículaOrigem;
    }

    public void setMatrículaOrigem(Integer matrículaOrigem) {
        this.matrículaOrigem = matrículaOrigem;
    }

    @Basic
    @Column(name = "MatrículaDestino", nullable = true, insertable = true, updatable = true)
    public Integer getMatrículaDestino() {
        return matrículaDestino;
    }

    public void setMatrículaDestino(Integer matrículaDestino) {
        this.matrículaDestino = matrículaDestino;
    }

    @Basic
    @Column(name = "CodCarta", nullable = true, insertable = true, updatable = true)
    public Byte getCodCarta() {
        return codCarta;
    }

    public void setCodCarta(Byte codCarta) {
        this.codCarta = codCarta;
    }

    @Basic
    @Column(name = "CartaData", nullable = true, insertable = true, updatable = true)
    public Timestamp getCartaData() {
        return cartaData;
    }

    public void setCartaData(Timestamp cartaData) {
        this.cartaData = cartaData;
    }

    @Basic
    @Column(name = "CodInscrição", nullable = true, insertable = true, updatable = true)
    public Integer getCodInscrição() {
        return codInscrição;
    }

    public void setCodInscrição(Integer codInscrição) {
        this.codInscrição = codInscrição;
    }

    @Basic
    @Column(name = "SenhaAluno", nullable = true, insertable = true, updatable = true)
    public String getSenhaAluno() {
        return senhaAluno;
    }

    public void setSenhaAluno(String senhaAluno) {
        this.senhaAluno = senhaAluno;
    }

    @Basic
    @Column(name = "SenhaResponsável", nullable = true, insertable = true, updatable = true)
    public String getSenhaResponsável() {
        return senhaResponsável;
    }

    public void setSenhaResponsável(String senhaResponsável) {
        this.senhaResponsável = senhaResponsável;
    }

    @Basic
    @Column(name = "CodOrigem", nullable = true, insertable = true, updatable = true)
    public Short getCodOrigem() {
        return codOrigem;
    }

    public void setCodOrigem(Short codOrigem) {
        this.codOrigem = codOrigem;
    }

    @Basic
    @Column(name = "MatrículaLonga", nullable = true, insertable = true, updatable = true)
    public String getMatrículaLonga() {
        return matrículaLonga;
    }

    public void setMatrículaLonga(String matrículaLonga) {
        this.matrículaLonga = matrículaLonga;
    }

    @Basic
    @Column(name = "CodMovimentoUtilizado", nullable = true, insertable = true, updatable = true)
    public Long getCodMovimentoUtilizado() {
        return codMovimentoUtilizado;
    }

    public void setCodMovimentoUtilizado(Long codMovimentoUtilizado) {
        this.codMovimentoUtilizado = codMovimentoUtilizado;
    }

    @Basic
    @Column(name = "CTS")
    public byte[] getCts() {
        return cts;
    }

    public void setCts(byte[] cts) {
        this.cts = cts;
    }

    @Basic
    @Column(name = "MatrículaBarra", nullable = true, insertable = true, updatable = true)
    public String getMatrículaBarra() {
        return matrículaBarra;
    }

    public void setMatrículaBarra(String matrículaBarra) {
        this.matrículaBarra = matrículaBarra;
    }

    @Basic
    @Column(name = "Ftp", nullable = true, insertable = true, updatable = true)
    public String getFtp() {
        return ftp;
    }

    public void setFtp(String ftp) {
        this.ftp = ftp;
    }

    @Basic
    @Column(name = "Mail", nullable = true, insertable = true, updatable = true)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAluno acdAluno = (AcdAluno) o;

        if (alunoId != acdAluno.alunoId) return false;
        if (codPautaUtilizada != acdAluno.codPautaUtilizada) return false;
        if (codUnidade != acdAluno.codUnidade) return false;
        if (matrícula != acdAluno.matrícula) return false;
        if (cartaData != null ? !cartaData.equals(acdAluno.cartaData) : acdAluno.cartaData != null) return false;
        if (codCarta != null ? !codCarta.equals(acdAluno.codCarta) : acdAluno.codCarta != null) return false;
        if (codInscrição != null ? !codInscrição.equals(acdAluno.codInscrição) : acdAluno.codInscrição != null)
            return false;
        if (codMovimentoUtilizado != null ? !codMovimentoUtilizado.equals(acdAluno.codMovimentoUtilizado) : acdAluno.codMovimentoUtilizado != null)
            return false;
        if (codOrigem != null ? !codOrigem.equals(acdAluno.codOrigem) : acdAluno.codOrigem != null) return false;
        if (!Arrays.equals(cts, acdAluno.cts)) return false;
        if (códigoBarra != null ? !códigoBarra.equals(acdAluno.códigoBarra) : acdAluno.códigoBarra != null)
            return false;
        if (ftp != null ? !ftp.equals(acdAluno.ftp) : acdAluno.ftp != null) return false;
        if (mail != null ? !mail.equals(acdAluno.mail) : acdAluno.mail != null) return false;
        if (matrículaBarra != null ? !matrículaBarra.equals(acdAluno.matrículaBarra) : acdAluno.matrículaBarra != null)
            return false;
        if (matrículaDestino != null ? !matrículaDestino.equals(acdAluno.matrículaDestino) : acdAluno.matrículaDestino != null)
            return false;
        if (matrículaLonga != null ? !matrículaLonga.equals(acdAluno.matrículaLonga) : acdAluno.matrículaLonga != null)
            return false;
        if (matrículaOrigem != null ? !matrículaOrigem.equals(acdAluno.matrículaOrigem) : acdAluno.matrículaOrigem != null)
            return false;
        if (senhaAluno != null ? !senhaAluno.equals(acdAluno.senhaAluno) : acdAluno.senhaAluno != null) return false;
        if (senhaResponsável != null ? !senhaResponsável.equals(acdAluno.senhaResponsável) : acdAluno.senhaResponsável != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (alunoId ^ (alunoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + matrícula;
        result = 31 * result + (int) (codPautaUtilizada ^ (codPautaUtilizada >>> 32));
        result = 31 * result + (códigoBarra != null ? códigoBarra.hashCode() : 0);
        result = 31 * result + (matrículaOrigem != null ? matrículaOrigem.hashCode() : 0);
        result = 31 * result + (matrículaDestino != null ? matrículaDestino.hashCode() : 0);
        result = 31 * result + (codCarta != null ? codCarta.hashCode() : 0);
        result = 31 * result + (cartaData != null ? cartaData.hashCode() : 0);
        result = 31 * result + (codInscrição != null ? codInscrição.hashCode() : 0);
        result = 31 * result + (senhaAluno != null ? senhaAluno.hashCode() : 0);
        result = 31 * result + (senhaResponsável != null ? senhaResponsável.hashCode() : 0);
        result = 31 * result + (codOrigem != null ? codOrigem.hashCode() : 0);
        result = 31 * result + (matrículaLonga != null ? matrículaLonga.hashCode() : 0);
        result = 31 * result + (codMovimentoUtilizado != null ? codMovimentoUtilizado.hashCode() : 0);
        result = 31 * result + (cts != null ? Arrays.hashCode(cts) : 0);
        result = 31 * result + (matrículaBarra != null ? matrículaBarra.hashCode() : 0);
        result = 31 * result + (ftp != null ? ftp.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "CodAluno", nullable = false, insertable = true, updatable = true)
    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    @Basic
    @Column(name = "CodPai", nullable = false, insertable = true, updatable = true)
    public int getCodPai() {
        return codPai;
    }

    public void setCodPai(int codPai) {
        this.codPai = codPai;
    }

    @Basic
    @Column(name = "CodMãe", nullable = false, insertable = true, updatable = true)
    public int getCodMãe() {
        return codMãe;
    }

    public void setCodMãe(int codMãe) {
        this.codMãe = codMãe;
    }




}
