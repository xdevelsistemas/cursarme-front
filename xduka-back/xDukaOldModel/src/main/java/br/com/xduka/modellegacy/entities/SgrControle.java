package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class SgrControle {
    private int idControle;
    private Integer idFormulário;
    private String controle;
    private String controleUsuário;
    private Byte nível;
    private String controle1;
    private String controle2;
    private String controle3;
    private boolean botão;
    private boolean folhaDados;
    private byte[] cts;
//    private SgrFormularioOld sgrFormulárioOld;
//    private List<SgrPersonalizacao> sgrPersonalizacoes;

    @Id
    @Column(name = "IDControle", nullable = false, insertable = true, updatable = true)
    public int getIdControle() {
        return idControle;
    }

    public void setIdControle(int idControle) {
        this.idControle = idControle;
    }

    @Basic
    @Column(name = "IDFormulário", nullable = true, insertable = true, updatable = true)
    public Integer getIdFormulário() {
        return idFormulário;
    }

    public void setIdFormulário(Integer idFormulário) {
        this.idFormulário = idFormulário;
    }

    @Basic
    @Column(name = "Controle", nullable = true, insertable = true, updatable = true)
    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    @Basic
    @Column(name = "ControleUsuário", nullable = true, insertable = true, updatable = true)
    public String getControleUsuário() {
        return controleUsuário;
    }

    public void setControleUsuário(String controleUsuário) {
        this.controleUsuário = controleUsuário;
    }

    @Basic
    @Column(name = "Nível", nullable = true, insertable = true, updatable = true)
    public Byte getNível() {
        return nível;
    }

    public void setNível(Byte nível) {
        this.nível = nível;
    }

    @Basic
    @Column(name = "Controle1", nullable = true, insertable = true, updatable = true)
    public String getControle1() {
        return controle1;
    }

    public void setControle1(String controle1) {
        this.controle1 = controle1;
    }

    @Basic
    @Column(name = "Controle2", nullable = true, insertable = true, updatable = true)
    public String getControle2() {
        return controle2;
    }

    public void setControle2(String controle2) {
        this.controle2 = controle2;
    }

    @Basic
    @Column(name = "Controle3", nullable = true, insertable = true, updatable = true)
    public String getControle3() {
        return controle3;
    }

    public void setControle3(String controle3) {
        this.controle3 = controle3;
    }

    @Basic
    @Column(name = "Botão", nullable = false, insertable = true, updatable = true)
    public boolean isBotão() {
        return botão;
    }

    public void setBotão(boolean botão) {
        this.botão = botão;
    }

    @Basic
    @Column(name = "FolhaDados", nullable = false, insertable = true, updatable = true)
    public boolean isFolhaDados() {
        return folhaDados;
    }

    public void setFolhaDados(boolean folhaDados) {
        this.folhaDados = folhaDados;
    }

    @Basic
    @Column(name = "CTS", nullable = true, insertable = true, updatable = true)
    public byte[] getCts() {
        return cts;
    }

    public void setCts(byte[] cts) {
        this.cts = cts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrControle that = (SgrControle) o;

        if (botão != that.botão) return false;
        if (folhaDados != that.folhaDados) return false;
        if (idControle != that.idControle) return false;
        if (controle != null ? !controle.equals(that.controle) : that.controle != null) return false;
        if (controle1 != null ? !controle1.equals(that.controle1) : that.controle1 != null) return false;
        if (controle2 != null ? !controle2.equals(that.controle2) : that.controle2 != null) return false;
        if (controle3 != null ? !controle3.equals(that.controle3) : that.controle3 != null) return false;
        if (controleUsuário != null ? !controleUsuário.equals(that.controleUsuário) : that.controleUsuário != null)
            return false;
        if (!Arrays.equals(cts, that.cts)) return false;
        if (idFormulário != null ? !idFormulário.equals(that.idFormulário) : that.idFormulário != null) return false;
        if (nível != null ? !nível.equals(that.nível) : that.nível != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idControle;
        result = 31 * result + (idFormulário != null ? idFormulário.hashCode() : 0);
        result = 31 * result + (controle != null ? controle.hashCode() : 0);
        result = 31 * result + (controleUsuário != null ? controleUsuário.hashCode() : 0);
        result = 31 * result + (nível != null ? nível.hashCode() : 0);
        result = 31 * result + (controle1 != null ? controle1.hashCode() : 0);
        result = 31 * result + (controle2 != null ? controle2.hashCode() : 0);
        result = 31 * result + (controle3 != null ? controle3.hashCode() : 0);
        result = 31 * result + (botão ? 1 : 0);
        result = 31 * result + (folhaDados ? 1 : 0);
        result = 31 * result + (cts != null ? Arrays.hashCode(cts) : 0);
        return result;
    }

//    @ManyToOne
//    @JoinColumn(name = "IDFormulário", referencedColumnName = "IDFormulário")
//    public SgrFormularioOld getSgrFormulárioOld() {
//        return sgrFormulárioOld;
//    }
//
//    public void setSgrFormulárioOld(SgrFormularioOld sgrFormulárioOld) {
//        this.sgrFormulárioOld = sgrFormulárioOld;
//    }
//
//    @OneToMany(mappedBy = "sgrControleByIdControle")
//    public List<SgrPersonalizacao> getSgrPersonalizacoes() {
//        return sgrPersonalizacoes;
//    }
//
//    public void setSgrPersonalizacoes(List<SgrPersonalizacao> sgrPersonalizacoes) {
//        this.sgrPersonalizacoes = sgrPersonalizacoes;
//    }
}
