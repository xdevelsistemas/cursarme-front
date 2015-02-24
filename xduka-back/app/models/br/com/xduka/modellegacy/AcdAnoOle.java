package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class AcdAnoOle {
    private int anoOle;

    @Id
    @javax.persistence.Column(name = "AnoOLE", nullable = false, insertable = true, updatable = true)
    public int getAnoOle() {
        return anoOle;
    }

    public void setAnoOle(int anoOle) {
        this.anoOle = anoOle;
    }

    private byte[] carteirinha;

    @Basic
    @javax.persistence.Column(name = "Carteirinha", nullable = true, insertable = true, updatable = true)
    public byte[] getCarteirinha() {
        return carteirinha;
    }

    public void setCarteirinha(byte[] carteirinha) {
        this.carteirinha = carteirinha;
    }

    private byte[] logoMarca;

    @Basic
    @javax.persistence.Column(name = "LogoMarca", nullable = true, insertable = true, updatable = true)
    public byte[] getLogoMarca() {
        return logoMarca;
    }

    public void setLogoMarca(byte[] logoMarca) {
        this.logoMarca = logoMarca;
    }

    private String ata1;

    @Basic
    @javax.persistence.Column(name = "Ata1", nullable = true, insertable = true, updatable = true)
    public String getAta1() {
        return ata1;
    }

    public void setAta1(String ata1) {
        this.ata1 = ata1;
    }

    private String ata2;

    @Basic
    @javax.persistence.Column(name = "Ata2", nullable = true, insertable = true, updatable = true)
    public String getAta2() {
        return ata2;
    }

    public void setAta2(String ata2) {
        this.ata2 = ata2;
    }

    private String critérioAvaliação;

    @Basic
    @javax.persistence.Column(name = "CritérioAvaliação", nullable = true, insertable = true, updatable = true)
    public String getCritérioAvaliação() {
        return critérioAvaliação;
    }

    public void setCritérioAvaliação(String critérioAvaliação) {
        this.critérioAvaliação = critérioAvaliação;
    }

    private String observação;

    @Basic
    @javax.persistence.Column(name = "Observação", nullable = true, insertable = true, updatable = true)
    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

    private String ataDepend2;

    @Basic
    @javax.persistence.Column(name = "AtaDepend2", nullable = true, insertable = true, updatable = true)
    public String getAtaDepend2() {
        return ataDepend2;
    }

    public void setAtaDepend2(String ataDepend2) {
        this.ataDepend2 = ataDepend2;
    }

    private String ataDepend1;

    @Basic
    @javax.persistence.Column(name = "AtaDepend1", nullable = true, insertable = true, updatable = true)
    public String getAtaDepend1() {
        return ataDepend1;
    }

    public void setAtaDepend1(String ataDepend1) {
        this.ataDepend1 = ataDepend1;
    }

    private String ataAdapt2;

    @Basic
    @javax.persistence.Column(name = "AtaAdapt2", nullable = true, insertable = true, updatable = true)
    public String getAtaAdapt2() {
        return ataAdapt2;
    }

    public void setAtaAdapt2(String ataAdapt2) {
        this.ataAdapt2 = ataAdapt2;
    }

    private String ataAdapt1;

    @Basic
    @javax.persistence.Column(name = "AtaAdapt1", nullable = true, insertable = true, updatable = true)
    public String getAtaAdapt1() {
        return ataAdapt1;
    }

    public void setAtaAdapt1(String ataAdapt1) {
        this.ataAdapt1 = ataAdapt1;
    }

    private String cartaRecuperação2;

    @Basic
    @javax.persistence.Column(name = "CartaRecuperação2", nullable = true, insertable = true, updatable = true)
    public String getCartaRecuperação2() {
        return cartaRecuperação2;
    }

    public void setCartaRecuperação2(String cartaRecuperação2) {
        this.cartaRecuperação2 = cartaRecuperação2;
    }

    private String cartaRecuperação1;

    @Basic
    @javax.persistence.Column(name = "CartaRecuperação1", nullable = true, insertable = true, updatable = true)
    public String getCartaRecuperação1() {
        return cartaRecuperação1;
    }

    public void setCartaRecuperação1(String cartaRecuperação1) {
        this.cartaRecuperação1 = cartaRecuperação1;
    }

    private String critérioPromoção;

    @Basic
    @javax.persistence.Column(name = "CritérioPromoção", nullable = true, insertable = true, updatable = true)
    public String getCritérioPromoção() {
        return critérioPromoção;
    }

    public void setCritérioPromoção(String critérioPromoção) {
        this.critérioPromoção = critérioPromoção;
    }

    private String processoAvaliação;

    @Basic
    @javax.persistence.Column(name = "ProcessoAvaliação", nullable = true, insertable = true, updatable = true)
    public String getProcessoAvaliação() {
        return processoAvaliação;
    }

    public void setProcessoAvaliação(String processoAvaliação) {
        this.processoAvaliação = processoAvaliação;
    }

    private String textoConclusão;

    @Basic
    @javax.persistence.Column(name = "TextoConclusão", nullable = true, insertable = true, updatable = true)
    public String getTextoConclusão() {
        return textoConclusão;
    }

    public void setTextoConclusão(String textoConclusão) {
        this.textoConclusão = textoConclusão;
    }

    private String textoFicha;

    @Basic
    @javax.persistence.Column(name = "TextoFicha", nullable = true, insertable = true, updatable = true)
    public String getTextoFicha() {
        return textoFicha;
    }

    public void setTextoFicha(String textoFicha) {
        this.textoFicha = textoFicha;
    }

    private String declaraçãoMatrícula;

    @Basic
    @javax.persistence.Column(name = "DeclaraçãoMatrícula", nullable = true, insertable = true, updatable = true)
    public String getDeclaraçãoMatrícula() {
        return declaraçãoMatrícula;
    }

    public void setDeclaraçãoMatrícula(String declaraçãoMatrícula) {
        this.declaraçãoMatrícula = declaraçãoMatrícula;
    }

    private String declaraçãoMatrículaC;

    @Basic
    @javax.persistence.Column(name = "DeclaraçãoMatrículaC", nullable = true, insertable = true, updatable = true)
    public String getDeclaraçãoMatrículaC() {
        return declaraçãoMatrículaC;
    }

    public void setDeclaraçãoMatrículaC(String declaraçãoMatrículaC) {
        this.declaraçãoMatrículaC = declaraçãoMatrículaC;
    }

    private String certificadoQuitação;

    @Basic
    @javax.persistence.Column(name = "CertificadoQuitação", nullable = true, insertable = true, updatable = true)
    public String getCertificadoQuitação() {
        return certificadoQuitação;
    }

    public void setCertificadoQuitação(String certificadoQuitação) {
        this.certificadoQuitação = certificadoQuitação;
    }

    private String históricoCertificadoParcial;

    @Basic
    @javax.persistence.Column(name = "HistóricoCertificadoParcial", nullable = true, insertable = true, updatable = true)
    public String getHistóricoCertificadoParcial() {
        return históricoCertificadoParcial;
    }

    public void setHistóricoCertificadoParcial(String históricoCertificadoParcial) {
        this.históricoCertificadoParcial = históricoCertificadoParcial;
    }

    private String históricoDeclaração;

    @Basic
    @javax.persistence.Column(name = "HistóricoDeclaração", nullable = true, insertable = true, updatable = true)
    public String getHistóricoDeclaração() {
        return históricoDeclaração;
    }

    public void setHistóricoDeclaração(String históricoDeclaração) {
        this.históricoDeclaração = históricoDeclaração;
    }

    private String históricoCertificado;

    @Basic
    @javax.persistence.Column(name = "HistóricoCertificado", nullable = true, insertable = true, updatable = true)
    public String getHistóricoCertificado() {
        return históricoCertificado;
    }

    public void setHistóricoCertificado(String históricoCertificado) {
        this.históricoCertificado = históricoCertificado;
    }

    private boolean carteirinhaLogo;

    @Basic
    @javax.persistence.Column(name = "CarteirinhaLogo", nullable = false, insertable = true, updatable = true)
    public boolean isCarteirinhaLogo() {
        return carteirinhaLogo;
    }

    public void setCarteirinhaLogo(boolean carteirinhaLogo) {
        this.carteirinhaLogo = carteirinhaLogo;
    }

    private boolean carteirinhaBarra;

    @Basic
    @javax.persistence.Column(name = "CarteirinhaBarra", nullable = false, insertable = true, updatable = true)
    public boolean isCarteirinhaBarra() {
        return carteirinhaBarra;
    }

    public void setCarteirinhaBarra(boolean carteirinhaBarra) {
        this.carteirinhaBarra = carteirinhaBarra;
    }

    private byte[] cts;

    @Basic
    @javax.persistence.Column(name = "CTS", nullable = true, insertable = true, updatable = true)
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

        AcdAnoOle acdAnoOle = (AcdAnoOle) o;

        if (anoOle != acdAnoOle.anoOle) return false;
        if (carteirinhaBarra != acdAnoOle.carteirinhaBarra) return false;
        if (carteirinhaLogo != acdAnoOle.carteirinhaLogo) return false;
        if (ata1 != null ? !ata1.equals(acdAnoOle.ata1) : acdAnoOle.ata1 != null) return false;
        if (ata2 != null ? !ata2.equals(acdAnoOle.ata2) : acdAnoOle.ata2 != null) return false;
        if (ataAdapt1 != null ? !ataAdapt1.equals(acdAnoOle.ataAdapt1) : acdAnoOle.ataAdapt1 != null) return false;
        if (ataAdapt2 != null ? !ataAdapt2.equals(acdAnoOle.ataAdapt2) : acdAnoOle.ataAdapt2 != null) return false;
        if (ataDepend1 != null ? !ataDepend1.equals(acdAnoOle.ataDepend1) : acdAnoOle.ataDepend1 != null) return false;
        if (ataDepend2 != null ? !ataDepend2.equals(acdAnoOle.ataDepend2) : acdAnoOle.ataDepend2 != null) return false;
        if (cartaRecuperação1 != null ? !cartaRecuperação1.equals(acdAnoOle.cartaRecuperação1) : acdAnoOle.cartaRecuperação1 != null)
            return false;
        if (cartaRecuperação2 != null ? !cartaRecuperação2.equals(acdAnoOle.cartaRecuperação2) : acdAnoOle.cartaRecuperação2 != null)
            return false;
        if (!Arrays.equals(carteirinha, acdAnoOle.carteirinha)) return false;
        if (certificadoQuitação != null ? !certificadoQuitação.equals(acdAnoOle.certificadoQuitação) : acdAnoOle.certificadoQuitação != null)
            return false;
        if (critérioAvaliação != null ? !critérioAvaliação.equals(acdAnoOle.critérioAvaliação) : acdAnoOle.critérioAvaliação != null)
            return false;
        if (critérioPromoção != null ? !critérioPromoção.equals(acdAnoOle.critérioPromoção) : acdAnoOle.critérioPromoção != null)
            return false;
        if (!Arrays.equals(cts, acdAnoOle.cts)) return false;
        if (declaraçãoMatrícula != null ? !declaraçãoMatrícula.equals(acdAnoOle.declaraçãoMatrícula) : acdAnoOle.declaraçãoMatrícula != null)
            return false;
        if (declaraçãoMatrículaC != null ? !declaraçãoMatrículaC.equals(acdAnoOle.declaraçãoMatrículaC) : acdAnoOle.declaraçãoMatrículaC != null)
            return false;
        if (históricoCertificado != null ? !históricoCertificado.equals(acdAnoOle.históricoCertificado) : acdAnoOle.históricoCertificado != null)
            return false;
        if (históricoCertificadoParcial != null ? !históricoCertificadoParcial.equals(acdAnoOle.históricoCertificadoParcial) : acdAnoOle.históricoCertificadoParcial != null)
            return false;
        if (históricoDeclaração != null ? !históricoDeclaração.equals(acdAnoOle.históricoDeclaração) : acdAnoOle.históricoDeclaração != null)
            return false;
        if (!Arrays.equals(logoMarca, acdAnoOle.logoMarca)) return false;
        if (observação != null ? !observação.equals(acdAnoOle.observação) : acdAnoOle.observação != null) return false;
        if (processoAvaliação != null ? !processoAvaliação.equals(acdAnoOle.processoAvaliação) : acdAnoOle.processoAvaliação != null)
            return false;
        if (textoConclusão != null ? !textoConclusão.equals(acdAnoOle.textoConclusão) : acdAnoOle.textoConclusão != null)
            return false;
        if (textoFicha != null ? !textoFicha.equals(acdAnoOle.textoFicha) : acdAnoOle.textoFicha != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = anoOle;
        result = 31 * result + (carteirinha != null ? Arrays.hashCode(carteirinha) : 0);
        result = 31 * result + (logoMarca != null ? Arrays.hashCode(logoMarca) : 0);
        result = 31 * result + (ata1 != null ? ata1.hashCode() : 0);
        result = 31 * result + (ata2 != null ? ata2.hashCode() : 0);
        result = 31 * result + (critérioAvaliação != null ? critérioAvaliação.hashCode() : 0);
        result = 31 * result + (observação != null ? observação.hashCode() : 0);
        result = 31 * result + (ataDepend2 != null ? ataDepend2.hashCode() : 0);
        result = 31 * result + (ataDepend1 != null ? ataDepend1.hashCode() : 0);
        result = 31 * result + (ataAdapt2 != null ? ataAdapt2.hashCode() : 0);
        result = 31 * result + (ataAdapt1 != null ? ataAdapt1.hashCode() : 0);
        result = 31 * result + (cartaRecuperação2 != null ? cartaRecuperação2.hashCode() : 0);
        result = 31 * result + (cartaRecuperação1 != null ? cartaRecuperação1.hashCode() : 0);
        result = 31 * result + (critérioPromoção != null ? critérioPromoção.hashCode() : 0);
        result = 31 * result + (processoAvaliação != null ? processoAvaliação.hashCode() : 0);
        result = 31 * result + (textoConclusão != null ? textoConclusão.hashCode() : 0);
        result = 31 * result + (textoFicha != null ? textoFicha.hashCode() : 0);
        result = 31 * result + (declaraçãoMatrícula != null ? declaraçãoMatrícula.hashCode() : 0);
        result = 31 * result + (declaraçãoMatrículaC != null ? declaraçãoMatrículaC.hashCode() : 0);
        result = 31 * result + (certificadoQuitação != null ? certificadoQuitação.hashCode() : 0);
        result = 31 * result + (históricoCertificadoParcial != null ? históricoCertificadoParcial.hashCode() : 0);
        result = 31 * result + (históricoDeclaração != null ? históricoDeclaração.hashCode() : 0);
        result = 31 * result + (históricoCertificado != null ? históricoCertificado.hashCode() : 0);
        result = 31 * result + (carteirinhaLogo ? 1 : 0);
        result = 31 * result + (carteirinhaBarra ? 1 : 0);
        result = 31 * result + (cts != null ? Arrays.hashCode(cts) : 0);
        return result;
    }
}
