package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(InsInscriçãoPK.class)
public class InsInscrição {
    private long inscriçãoId;

    @Basic
    @javax.persistence.Column(name = "Inscrição_ID", nullable = false, insertable = true, updatable = true)
    public long getInscriçãoId() {
        return inscriçãoId;
    }

    public void setInscriçãoId(long inscriçãoId) {
        this.inscriçãoId = inscriçãoId;
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

    private String inscrição;

    @Basic
    @javax.persistence.Column(name = "Inscrição", nullable = true, insertable = true, updatable = true)
    public String getInscrição() {
        return inscrição;
    }

    public void setInscrição(String inscrição) {
        this.inscrição = inscrição;
    }

    private Timestamp inscriçãoInicio;

    @Basic
    @javax.persistence.Column(name = "InscriçãoInicio", nullable = true, insertable = true, updatable = true)
    public Timestamp getInscriçãoInicio() {
        return inscriçãoInicio;
    }

    public void setInscriçãoInicio(Timestamp inscriçãoInicio) {
        this.inscriçãoInicio = inscriçãoInicio;
    }

    private Timestamp inscriçãoFinal;

    @Basic
    @javax.persistence.Column(name = "InscriçãoFinal", nullable = true, insertable = true, updatable = true)
    public Timestamp getInscriçãoFinal() {
        return inscriçãoFinal;
    }

    public void setInscriçãoFinal(Timestamp inscriçãoFinal) {
        this.inscriçãoFinal = inscriçãoFinal;
    }

    private String provas;

    @Basic
    @javax.persistence.Column(name = "Provas", nullable = true, insertable = true, updatable = true)
    public String getProvas() {
        return provas;
    }

    public void setProvas(String provas) {
        this.provas = provas;
    }

    private String obs;

    @Basic
    @javax.persistence.Column(name = "Obs", nullable = true, insertable = true, updatable = true)
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    private Short anoLetivo;

    @Basic
    @javax.persistence.Column(name = "AnoLetivo", nullable = true, insertable = true, updatable = true)
    public Short getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(Short anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    private boolean realizado;

    @Basic
    @javax.persistence.Column(name = "Realizado", nullable = false, insertable = true, updatable = true)
    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    private boolean distribuirPorCurso;

    @Basic
    @javax.persistence.Column(name = "DistribuirPorCurso", nullable = false, insertable = true, updatable = true)
    public boolean isDistribuirPorCurso() {
        return distribuirPorCurso;
    }

    public void setDistribuirPorCurso(boolean distribuirPorCurso) {
        this.distribuirPorCurso = distribuirPorCurso;
    }

    private String textoBoleto;

    @Basic
    @javax.persistence.Column(name = "TextoBoleto", nullable = true, insertable = true, updatable = true)
    public String getTextoBoleto() {
        return textoBoleto;
    }

    public void setTextoBoleto(String textoBoleto) {
        this.textoBoleto = textoBoleto;
    }

    private Integer codCaixa;

    @Basic
    @javax.persistence.Column(name = "CodCaixa", nullable = true, insertable = true, updatable = true)
    public Integer getCodCaixa() {
        return codCaixa;
    }

    public void setCodCaixa(Integer codCaixa) {
        this.codCaixa = codCaixa;
    }

    private Integer codQuestionário;

    @Basic
    @javax.persistence.Column(name = "CodQuestionário", nullable = true, insertable = true, updatable = true)
    public Integer getCodQuestionário() {
        return codQuestionário;
    }

    public void setCodQuestionário(Integer codQuestionário) {
        this.codQuestionário = codQuestionário;
    }

    private Integer codConta;

    @Basic
    @javax.persistence.Column(name = "CodConta", nullable = true, insertable = true, updatable = true)
    public Integer getCodConta() {
        return codConta;
    }

    public void setCodConta(Integer codConta) {
        this.codConta = codConta;
    }

    private Integer codCandidatoUtilizado;

    @Basic
    @javax.persistence.Column(name = "CodCandidatoUtilizado", nullable = true, insertable = true, updatable = true)
    public Integer getCodCandidatoUtilizado() {
        return codCandidatoUtilizado;
    }

    public void setCodCandidatoUtilizado(Integer codCandidatoUtilizado) {
        this.codCandidatoUtilizado = codCandidatoUtilizado;
    }

    private Float valor;

    @Basic
    @javax.persistence.Column(name = "Valor", nullable = true, insertable = true, updatable = true, precision = 0)
    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    private String inscriçãoDocumento;

    @Basic
    @javax.persistence.Column(name = "InscriçãoDocumento", nullable = true, insertable = true, updatable = true)
    public String getInscriçãoDocumento() {
        return inscriçãoDocumento;
    }

    public void setInscriçãoDocumento(String inscriçãoDocumento) {
        this.inscriçãoDocumento = inscriçãoDocumento;
    }

    private Integer codUnidadeCorreção;

    @Basic
    @javax.persistence.Column(name = "CodUnidadeCorreção", nullable = true, insertable = true, updatable = true)
    public Integer getCodUnidadeCorreção() {
        return codUnidadeCorreção;
    }

    public void setCodUnidadeCorreção(Integer codUnidadeCorreção) {
        this.codUnidadeCorreção = codUnidadeCorreção;
    }

    private Boolean validarCpf;

    @Basic
    @javax.persistence.Column(name = "ValidarCPF", nullable = true, insertable = true, updatable = true)
    public Boolean getValidarCpf() {
        return validarCpf;
    }

    public void setValidarCpf(Boolean validarCpf) {
        this.validarCpf = validarCpf;
    }

    private Boolean autoNumerar;

    @Basic
    @javax.persistence.Column(name = "AutoNumerar", nullable = true, insertable = true, updatable = true)
    public Boolean getAutoNumerar() {
        return autoNumerar;
    }

    public void setAutoNumerar(Boolean autoNumerar) {
        this.autoNumerar = autoNumerar;
    }

    private String urlSite;

    @Basic
    @javax.persistence.Column(name = "UrlSite", nullable = true, insertable = true, updatable = true)
    public String getUrlSite() {
        return urlSite;
    }

    public void setUrlSite(String urlSite) {
        this.urlSite = urlSite;
    }

    private Timestamp dataÚltimoBoleto;

    @Basic
    @javax.persistence.Column(name = "DataÚltimoBoleto", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataÚltimoBoleto() {
        return dataÚltimoBoleto;
    }

    public void setDataÚltimoBoleto(Timestamp dataÚltimoBoleto) {
        this.dataÚltimoBoleto = dataÚltimoBoleto;
    }

    private Byte diasBoleto;

    @Basic
    @javax.persistence.Column(name = "DiasBoleto", nullable = true, insertable = true, updatable = true)
    public Byte getDiasBoleto() {
        return diasBoleto;
    }

    public void setDiasBoleto(Byte diasBoleto) {
        this.diasBoleto = diasBoleto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsInscrição that = (InsInscrição) o;

        if (codInscrição != that.codInscrição) return false;
        if (codUnidade != that.codUnidade) return false;
        if (distribuirPorCurso != that.distribuirPorCurso) return false;
        if (inscriçãoId != that.inscriçãoId) return false;
        if (realizado != that.realizado) return false;
        if (anoLetivo != null ? !anoLetivo.equals(that.anoLetivo) : that.anoLetivo != null) return false;
        if (autoNumerar != null ? !autoNumerar.equals(that.autoNumerar) : that.autoNumerar != null) return false;
        if (codCaixa != null ? !codCaixa.equals(that.codCaixa) : that.codCaixa != null) return false;
        if (codCandidatoUtilizado != null ? !codCandidatoUtilizado.equals(that.codCandidatoUtilizado) : that.codCandidatoUtilizado != null)
            return false;
        if (codConta != null ? !codConta.equals(that.codConta) : that.codConta != null) return false;
        if (codQuestionário != null ? !codQuestionário.equals(that.codQuestionário) : that.codQuestionário != null)
            return false;
        if (codUnidadeCorreção != null ? !codUnidadeCorreção.equals(that.codUnidadeCorreção) : that.codUnidadeCorreção != null)
            return false;
        if (dataÚltimoBoleto != null ? !dataÚltimoBoleto.equals(that.dataÚltimoBoleto) : that.dataÚltimoBoleto != null)
            return false;
        if (diasBoleto != null ? !diasBoleto.equals(that.diasBoleto) : that.diasBoleto != null) return false;
        if (inscrição != null ? !inscrição.equals(that.inscrição) : that.inscrição != null) return false;
        if (inscriçãoDocumento != null ? !inscriçãoDocumento.equals(that.inscriçãoDocumento) : that.inscriçãoDocumento != null)
            return false;
        if (inscriçãoFinal != null ? !inscriçãoFinal.equals(that.inscriçãoFinal) : that.inscriçãoFinal != null)
            return false;
        if (inscriçãoInicio != null ? !inscriçãoInicio.equals(that.inscriçãoInicio) : that.inscriçãoInicio != null)
            return false;
        if (obs != null ? !obs.equals(that.obs) : that.obs != null) return false;
        if (provas != null ? !provas.equals(that.provas) : that.provas != null) return false;
        if (textoBoleto != null ? !textoBoleto.equals(that.textoBoleto) : that.textoBoleto != null) return false;
        if (urlSite != null ? !urlSite.equals(that.urlSite) : that.urlSite != null) return false;
        if (validarCpf != null ? !validarCpf.equals(that.validarCpf) : that.validarCpf != null) return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (inscriçãoId ^ (inscriçãoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codInscrição;
        result = 31 * result + (inscrição != null ? inscrição.hashCode() : 0);
        result = 31 * result + (inscriçãoInicio != null ? inscriçãoInicio.hashCode() : 0);
        result = 31 * result + (inscriçãoFinal != null ? inscriçãoFinal.hashCode() : 0);
        result = 31 * result + (provas != null ? provas.hashCode() : 0);
        result = 31 * result + (obs != null ? obs.hashCode() : 0);
        result = 31 * result + (anoLetivo != null ? anoLetivo.hashCode() : 0);
        result = 31 * result + (realizado ? 1 : 0);
        result = 31 * result + (distribuirPorCurso ? 1 : 0);
        result = 31 * result + (textoBoleto != null ? textoBoleto.hashCode() : 0);
        result = 31 * result + (codCaixa != null ? codCaixa.hashCode() : 0);
        result = 31 * result + (codQuestionário != null ? codQuestionário.hashCode() : 0);
        result = 31 * result + (codConta != null ? codConta.hashCode() : 0);
        result = 31 * result + (codCandidatoUtilizado != null ? codCandidatoUtilizado.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (inscriçãoDocumento != null ? inscriçãoDocumento.hashCode() : 0);
        result = 31 * result + (codUnidadeCorreção != null ? codUnidadeCorreção.hashCode() : 0);
        result = 31 * result + (validarCpf != null ? validarCpf.hashCode() : 0);
        result = 31 * result + (autoNumerar != null ? autoNumerar.hashCode() : 0);
        result = 31 * result + (urlSite != null ? urlSite.hashCode() : 0);
        result = 31 * result + (dataÚltimoBoleto != null ? dataÚltimoBoleto.hashCode() : 0);
        result = 31 * result + (diasBoleto != null ? diasBoleto.hashCode() : 0);
        return result;
    }
}
