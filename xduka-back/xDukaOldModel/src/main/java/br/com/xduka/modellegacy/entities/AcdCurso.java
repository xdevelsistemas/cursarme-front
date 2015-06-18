package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdCursoPK.class)
public class AcdCurso {
    private long cursoId;

    @Basic
    @javax.persistence.Column(name = "Curso_ID", nullable = false, insertable = true, updatable = true)
    public long getCursoId() {
        return cursoId;
    }

    public void setCursoId(long cursoId) {
        this.cursoId = cursoId;
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

    private String curso;

    @Basic
    @javax.persistence.Column(name = "Curso", nullable = true, insertable = true, updatable = true)
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    private String cursoDocumento;

    @Basic
    @javax.persistence.Column(name = "CursoDocumento", nullable = true, insertable = true, updatable = true)
    public String getCursoDocumento() {
        return cursoDocumento;
    }

    public void setCursoDocumento(String cursoDocumento) {
        this.cursoDocumento = cursoDocumento;
    }

    private int codÁrea;

    @Basic
    @javax.persistence.Column(name = "CodÁrea", nullable = false, insertable = true, updatable = true)
    public int getCodÁrea() {
        return codÁrea;
    }

    public void setCodÁrea(int codÁrea) {
        this.codÁrea = codÁrea;
    }

    private boolean utilizarGradeÚnica;

    @Basic
    @javax.persistence.Column(name = "UtilizarGradeÚnica", nullable = false, insertable = true, updatable = true)
    public boolean isUtilizarGradeÚnica() {
        return utilizarGradeÚnica;
    }

    public void setUtilizarGradeÚnica(boolean utilizarGradeÚnica) {
        this.utilizarGradeÚnica = utilizarGradeÚnica;
    }

    private String habilitação;

    @Basic
    @javax.persistence.Column(name = "Habilitação", nullable = true, insertable = true, updatable = true)
    public String getHabilitação() {
        return habilitação;
    }

    public void setHabilitação(String habilitação) {
        this.habilitação = habilitação;
    }

    private String autorização;

    @Basic
    @javax.persistence.Column(name = "Autorização", nullable = true, insertable = true, updatable = true)
    public String getAutorização() {
        return autorização;
    }

    public void setAutorização(String autorização) {
        this.autorização = autorização;
    }

    private String reconhecimento;

    @Basic
    @javax.persistence.Column(name = "Reconhecimento", nullable = true, insertable = true, updatable = true)
    public String getReconhecimento() {
        return reconhecimento;
    }

    public void setReconhecimento(String reconhecimento) {
        this.reconhecimento = reconhecimento;
    }

    private Integer duraçãoMínima;

    @Basic
    @javax.persistence.Column(name = "DuraçãoMínima", nullable = true, insertable = true, updatable = true)
    public Integer getDuraçãoMínima() {
        return duraçãoMínima;
    }

    public void setDuraçãoMínima(Integer duraçãoMínima) {
        this.duraçãoMínima = duraçãoMínima;
    }

    private Integer duraçãoMáxima;

    @Basic
    @javax.persistence.Column(name = "DuraçãoMáxima", nullable = true, insertable = true, updatable = true)
    public Integer getDuraçãoMáxima() {
        return duraçãoMáxima;
    }

    public void setDuraçãoMáxima(Integer duraçãoMáxima) {
        this.duraçãoMáxima = duraçãoMáxima;
    }

    private String cursoAbreviado;

    @Basic
    @javax.persistence.Column(name = "CursoAbreviado", nullable = true, insertable = true, updatable = true)
    public String getCursoAbreviado() {
        return cursoAbreviado;
    }

    public void setCursoAbreviado(String cursoAbreviado) {
        this.cursoAbreviado = cursoAbreviado;
    }

    private String histórico;

    @Basic
    @javax.persistence.Column(name = "Histórico", nullable = true, insertable = true, updatable = true)
    public String getHistórico() {
        return histórico;
    }

    public void setHistórico(String histórico) {
        this.histórico = histórico;
    }

    private Boolean históricoLivre;

    @Basic
    @javax.persistence.Column(name = "HistóricoLivre", nullable = true, insertable = true, updatable = true)
    public Boolean getHistóricoLivre() {
        return históricoLivre;
    }

    public void setHistóricoLivre(Boolean históricoLivre) {
        this.históricoLivre = históricoLivre;
    }

    private Integer codGradeUtilizada;

    @Basic
    @javax.persistence.Column(name = "CodGradeUtilizada", nullable = true, insertable = true, updatable = true)
    public Integer getCodGradeUtilizada() {
        return codGradeUtilizada;
    }

    public void setCodGradeUtilizada(Integer codGradeUtilizada) {
        this.codGradeUtilizada = codGradeUtilizada;
    }

    private boolean permitirTorcaGrade;

    @Basic
    @javax.persistence.Column(name = "PermitirTorcaGrade", nullable = false, insertable = true, updatable = true)
    public boolean isPermitirTorcaGrade() {
        return permitirTorcaGrade;
    }

    public void setPermitirTorcaGrade(boolean permitirTorcaGrade) {
        this.permitirTorcaGrade = permitirTorcaGrade;
    }

    private String perfilProfissional;

    @Basic
    @javax.persistence.Column(name = "PerfilProfissional", nullable = true, insertable = true, updatable = true)
    public String getPerfilProfissional() {
        return perfilProfissional;
    }

    public void setPerfilProfissional(String perfilProfissional) {
        this.perfilProfissional = perfilProfissional;
    }

    private String pauta;

    @Basic
    @javax.persistence.Column(name = "Pauta", nullable = true, insertable = true, updatable = true)
    public String getPauta() {
        return pauta;
    }

    public void setPauta(String pauta) {
        this.pauta = pauta;
    }

    private String boletim;

    @Basic
    @javax.persistence.Column(name = "Boletim", nullable = true, insertable = true, updatable = true)
    public String getBoletim() {
        return boletim;
    }

    public void setBoletim(String boletim) {
        this.boletim = boletim;
    }

    private String mecEtapa;

    @Basic
    @javax.persistence.Column(name = "MEC_Etapa", nullable = true, insertable = true, updatable = true)
    public String getMecEtapa() {
        return mecEtapa;
    }

    public void setMecEtapa(String mecEtapa) {
        this.mecEtapa = mecEtapa;
    }

    private String mecCurso;

    @Basic
    @javax.persistence.Column(name = "MEC_Curso", nullable = true, insertable = true, updatable = true)
    public String getMecCurso() {
        return mecCurso;
    }

    public void setMecCurso(String mecCurso) {
        this.mecCurso = mecCurso;
    }

    private Boolean arquivoMec;

    @Basic
    @javax.persistence.Column(name = "ArquivoMEC", nullable = true, insertable = true, updatable = true)
    public Boolean getArquivoMec() {
        return arquivoMec;
    }

    public void setArquivoMec(Boolean arquivoMec) {
        this.arquivoMec = arquivoMec;
    }

    private Boolean onlineBlog;

    @Basic
    @javax.persistence.Column(name = "online_Blog", nullable = true, insertable = true, updatable = true)
    public Boolean getOnlineBlog() {
        return onlineBlog;
    }

    public void setOnlineBlog(Boolean onlineBlog) {
        this.onlineBlog = onlineBlog;
    }

    private Boolean onlineBoletim;

    @Basic
    @javax.persistence.Column(name = "online_Boletim", nullable = true, insertable = true, updatable = true)
    public Boolean getOnlineBoletim() {
        return onlineBoletim;
    }

    public void setOnlineBoletim(Boolean onlineBoletim) {
        this.onlineBoletim = onlineBoletim;
    }

    private Boolean onlineBoletimParcial;

    @Basic
    @javax.persistence.Column(name = "online_BoletimParcial", nullable = true, insertable = true, updatable = true)
    public Boolean getOnlineBoletimParcial() {
        return onlineBoletimParcial;
    }

    public void setOnlineBoletimParcial(Boolean onlineBoletimParcial) {
        this.onlineBoletimParcial = onlineBoletimParcial;
    }

    private Boolean onlineHistórico;

    @Basic
    @javax.persistence.Column(name = "online_Histórico", nullable = true, insertable = true, updatable = true)
    public Boolean getOnlineHistórico() {
        return onlineHistórico;
    }

    public void setOnlineHistórico(Boolean onlineHistórico) {
        this.onlineHistórico = onlineHistórico;
    }

    private Boolean onlineFichaDisciplinar;

    @Basic
    @javax.persistence.Column(name = "online_FichaDisciplinar", nullable = true, insertable = true, updatable = true)
    public Boolean getOnlineFichaDisciplinar() {
        return onlineFichaDisciplinar;
    }

    public void setOnlineFichaDisciplinar(Boolean onlineFichaDisciplinar) {
        this.onlineFichaDisciplinar = onlineFichaDisciplinar;
    }

    private Boolean onlineParcelas;

    @Basic
    @javax.persistence.Column(name = "online_Parcelas", nullable = true, insertable = true, updatable = true)
    public Boolean getOnlineParcelas() {
        return onlineParcelas;
    }

    public void setOnlineParcelas(Boolean onlineParcelas) {
        this.onlineParcelas = onlineParcelas;
    }

    private Boolean onlineParcelasImprimir;

    @Basic
    @javax.persistence.Column(name = "online_ParcelasImprimir", nullable = true, insertable = true, updatable = true)
    public Boolean getOnlineParcelasImprimir() {
        return onlineParcelasImprimir;
    }

    public void setOnlineParcelasImprimir(Boolean onlineParcelasImprimir) {
        this.onlineParcelasImprimir = onlineParcelasImprimir;
    }

    private Boolean onlineDemonstrativoFinanceiro;

    @Basic
    @javax.persistence.Column(name = "online_DemonstrativoFinanceiro", nullable = true, insertable = true, updatable = true)
    public Boolean getOnlineDemonstrativoFinanceiro() {
        return onlineDemonstrativoFinanceiro;
    }

    public void setOnlineDemonstrativoFinanceiro(Boolean onlineDemonstrativoFinanceiro) {
        this.onlineDemonstrativoFinanceiro = onlineDemonstrativoFinanceiro;
    }

    private Boolean onlineMatrícula;

    @Basic
    @javax.persistence.Column(name = "online_Matrícula", nullable = true, insertable = true, updatable = true)
    public Boolean getOnlineMatrícula() {
        return onlineMatrícula;
    }

    public void setOnlineMatrícula(Boolean onlineMatrícula) {
        this.onlineMatrícula = onlineMatrícula;
    }

    private Boolean onlineRequerimento;

    @Basic
    @javax.persistence.Column(name = "online_Requerimento", nullable = true, insertable = true, updatable = true)
    public Boolean getOnlineRequerimento() {
        return onlineRequerimento;
    }

    public void setOnlineRequerimento(Boolean onlineRequerimento) {
        this.onlineRequerimento = onlineRequerimento;
    }

    private String mensagemBoletim;

    @Basic
    @javax.persistence.Column(name = "MensagemBoletim", nullable = true, insertable = true, updatable = true)
    public String getMensagemBoletim() {
        return mensagemBoletim;
    }

    public void setMensagemBoletim(String mensagemBoletim) {
        this.mensagemBoletim = mensagemBoletim;
    }

    private String mensagemHistórico;

    @Basic
    @javax.persistence.Column(name = "MensagemHistórico", nullable = true, insertable = true, updatable = true)
    public String getMensagemHistórico() {
        return mensagemHistórico;
    }

    public void setMensagemHistórico(String mensagemHistórico) {
        this.mensagemHistórico = mensagemHistórico;
    }

    private Boolean último;

    @Basic
    @javax.persistence.Column(name = "Último", nullable = true, insertable = true, updatable = true)
    public Boolean getÚltimo() {
        return último;
    }

    public void setÚltimo(Boolean último) {
        this.último = último;
    }

    private Integer codCursoNível;

    @Basic
    @javax.persistence.Column(name = "CodCursoNível", nullable = true, insertable = true, updatable = true)
    public Integer getCodCursoNível() {
        return codCursoNível;
    }

    public void setCodCursoNível(Integer codCursoNível) {
        this.codCursoNível = codCursoNível;
    }

    private String cursoInscrição;

    @Basic
    @javax.persistence.Column(name = "CursoInscrição", nullable = true, insertable = true, updatable = true)
    public String getCursoInscrição() {
        return cursoInscrição;
    }

    public void setCursoInscrição(String cursoInscrição) {
        this.cursoInscrição = cursoInscrição;
    }

    private Boolean boletimOnLine;

    @Basic
    @javax.persistence.Column(name = "BoletimOnLine", nullable = true, insertable = true, updatable = true)
    public Boolean getBoletimOnLine() {
        return boletimOnLine;
    }

    public void setBoletimOnLine(Boolean boletimOnLine) {
        this.boletimOnLine = boletimOnLine;
    }

    private Boolean históricoOnLine;

    @Basic
    @javax.persistence.Column(name = "HistóricoOnLine", nullable = true, insertable = true, updatable = true)
    public Boolean getHistóricoOnLine() {
        return históricoOnLine;
    }

    public void setHistóricoOnLine(Boolean históricoOnLine) {
        this.históricoOnLine = históricoOnLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdCurso acdCurso = (AcdCurso) o;

        if (codCurso != acdCurso.codCurso) return false;
        if (codUnidade != acdCurso.codUnidade) return false;
        if (codÁrea != acdCurso.codÁrea) return false;
        if (cursoId != acdCurso.cursoId) return false;
        if (permitirTorcaGrade != acdCurso.permitirTorcaGrade) return false;
        if (utilizarGradeÚnica != acdCurso.utilizarGradeÚnica) return false;
        if (arquivoMec != null ? !arquivoMec.equals(acdCurso.arquivoMec) : acdCurso.arquivoMec != null) return false;
        if (autorização != null ? !autorização.equals(acdCurso.autorização) : acdCurso.autorização != null)
            return false;
        if (boletim != null ? !boletim.equals(acdCurso.boletim) : acdCurso.boletim != null) return false;
        if (boletimOnLine != null ? !boletimOnLine.equals(acdCurso.boletimOnLine) : acdCurso.boletimOnLine != null)
            return false;
        if (codCursoNível != null ? !codCursoNível.equals(acdCurso.codCursoNível) : acdCurso.codCursoNível != null)
            return false;
        if (codGradeUtilizada != null ? !codGradeUtilizada.equals(acdCurso.codGradeUtilizada) : acdCurso.codGradeUtilizada != null)
            return false;
        if (curso != null ? !curso.equals(acdCurso.curso) : acdCurso.curso != null) return false;
        if (cursoAbreviado != null ? !cursoAbreviado.equals(acdCurso.cursoAbreviado) : acdCurso.cursoAbreviado != null)
            return false;
        if (cursoDocumento != null ? !cursoDocumento.equals(acdCurso.cursoDocumento) : acdCurso.cursoDocumento != null)
            return false;
        if (cursoInscrição != null ? !cursoInscrição.equals(acdCurso.cursoInscrição) : acdCurso.cursoInscrição != null)
            return false;
        if (duraçãoMáxima != null ? !duraçãoMáxima.equals(acdCurso.duraçãoMáxima) : acdCurso.duraçãoMáxima != null)
            return false;
        if (duraçãoMínima != null ? !duraçãoMínima.equals(acdCurso.duraçãoMínima) : acdCurso.duraçãoMínima != null)
            return false;
        if (habilitação != null ? !habilitação.equals(acdCurso.habilitação) : acdCurso.habilitação != null)
            return false;
        if (histórico != null ? !histórico.equals(acdCurso.histórico) : acdCurso.histórico != null) return false;
        if (históricoLivre != null ? !históricoLivre.equals(acdCurso.históricoLivre) : acdCurso.históricoLivre != null)
            return false;
        if (históricoOnLine != null ? !históricoOnLine.equals(acdCurso.históricoOnLine) : acdCurso.históricoOnLine != null)
            return false;
        if (mecCurso != null ? !mecCurso.equals(acdCurso.mecCurso) : acdCurso.mecCurso != null) return false;
        if (mecEtapa != null ? !mecEtapa.equals(acdCurso.mecEtapa) : acdCurso.mecEtapa != null) return false;
        if (mensagemBoletim != null ? !mensagemBoletim.equals(acdCurso.mensagemBoletim) : acdCurso.mensagemBoletim != null)
            return false;
        if (mensagemHistórico != null ? !mensagemHistórico.equals(acdCurso.mensagemHistórico) : acdCurso.mensagemHistórico != null)
            return false;
        if (onlineBlog != null ? !onlineBlog.equals(acdCurso.onlineBlog) : acdCurso.onlineBlog != null) return false;
        if (onlineBoletim != null ? !onlineBoletim.equals(acdCurso.onlineBoletim) : acdCurso.onlineBoletim != null)
            return false;
        if (onlineBoletimParcial != null ? !onlineBoletimParcial.equals(acdCurso.onlineBoletimParcial) : acdCurso.onlineBoletimParcial != null)
            return false;
        if (onlineDemonstrativoFinanceiro != null ? !onlineDemonstrativoFinanceiro.equals(acdCurso.onlineDemonstrativoFinanceiro) : acdCurso.onlineDemonstrativoFinanceiro != null)
            return false;
        if (onlineFichaDisciplinar != null ? !onlineFichaDisciplinar.equals(acdCurso.onlineFichaDisciplinar) : acdCurso.onlineFichaDisciplinar != null)
            return false;
        if (onlineHistórico != null ? !onlineHistórico.equals(acdCurso.onlineHistórico) : acdCurso.onlineHistórico != null)
            return false;
        if (onlineMatrícula != null ? !onlineMatrícula.equals(acdCurso.onlineMatrícula) : acdCurso.onlineMatrícula != null)
            return false;
        if (onlineParcelas != null ? !onlineParcelas.equals(acdCurso.onlineParcelas) : acdCurso.onlineParcelas != null)
            return false;
        if (onlineParcelasImprimir != null ? !onlineParcelasImprimir.equals(acdCurso.onlineParcelasImprimir) : acdCurso.onlineParcelasImprimir != null)
            return false;
        if (onlineRequerimento != null ? !onlineRequerimento.equals(acdCurso.onlineRequerimento) : acdCurso.onlineRequerimento != null)
            return false;
        if (pauta != null ? !pauta.equals(acdCurso.pauta) : acdCurso.pauta != null) return false;
        if (perfilProfissional != null ? !perfilProfissional.equals(acdCurso.perfilProfissional) : acdCurso.perfilProfissional != null)
            return false;
        if (reconhecimento != null ? !reconhecimento.equals(acdCurso.reconhecimento) : acdCurso.reconhecimento != null)
            return false;
        if (último != null ? !último.equals(acdCurso.último) : acdCurso.último != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cursoId ^ (cursoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + (curso != null ? curso.hashCode() : 0);
        result = 31 * result + (cursoDocumento != null ? cursoDocumento.hashCode() : 0);
        result = 31 * result + codÁrea;
        result = 31 * result + (utilizarGradeÚnica ? 1 : 0);
        result = 31 * result + (habilitação != null ? habilitação.hashCode() : 0);
        result = 31 * result + (autorização != null ? autorização.hashCode() : 0);
        result = 31 * result + (reconhecimento != null ? reconhecimento.hashCode() : 0);
        result = 31 * result + (duraçãoMínima != null ? duraçãoMínima.hashCode() : 0);
        result = 31 * result + (duraçãoMáxima != null ? duraçãoMáxima.hashCode() : 0);
        result = 31 * result + (cursoAbreviado != null ? cursoAbreviado.hashCode() : 0);
        result = 31 * result + (histórico != null ? histórico.hashCode() : 0);
        result = 31 * result + (históricoLivre != null ? históricoLivre.hashCode() : 0);
        result = 31 * result + (codGradeUtilizada != null ? codGradeUtilizada.hashCode() : 0);
        result = 31 * result + (permitirTorcaGrade ? 1 : 0);
        result = 31 * result + (perfilProfissional != null ? perfilProfissional.hashCode() : 0);
        result = 31 * result + (pauta != null ? pauta.hashCode() : 0);
        result = 31 * result + (boletim != null ? boletim.hashCode() : 0);
        result = 31 * result + (mecEtapa != null ? mecEtapa.hashCode() : 0);
        result = 31 * result + (mecCurso != null ? mecCurso.hashCode() : 0);
        result = 31 * result + (arquivoMec != null ? arquivoMec.hashCode() : 0);
        result = 31 * result + (onlineBlog != null ? onlineBlog.hashCode() : 0);
        result = 31 * result + (onlineBoletim != null ? onlineBoletim.hashCode() : 0);
        result = 31 * result + (onlineBoletimParcial != null ? onlineBoletimParcial.hashCode() : 0);
        result = 31 * result + (onlineHistórico != null ? onlineHistórico.hashCode() : 0);
        result = 31 * result + (onlineFichaDisciplinar != null ? onlineFichaDisciplinar.hashCode() : 0);
        result = 31 * result + (onlineParcelas != null ? onlineParcelas.hashCode() : 0);
        result = 31 * result + (onlineParcelasImprimir != null ? onlineParcelasImprimir.hashCode() : 0);
        result = 31 * result + (onlineDemonstrativoFinanceiro != null ? onlineDemonstrativoFinanceiro.hashCode() : 0);
        result = 31 * result + (onlineMatrícula != null ? onlineMatrícula.hashCode() : 0);
        result = 31 * result + (onlineRequerimento != null ? onlineRequerimento.hashCode() : 0);
        result = 31 * result + (mensagemBoletim != null ? mensagemBoletim.hashCode() : 0);
        result = 31 * result + (mensagemHistórico != null ? mensagemHistórico.hashCode() : 0);
        result = 31 * result + (último != null ? último.hashCode() : 0);
        result = 31 * result + (codCursoNível != null ? codCursoNível.hashCode() : 0);
        result = 31 * result + (cursoInscrição != null ? cursoInscrição.hashCode() : 0);
        result = 31 * result + (boletimOnLine != null ? boletimOnLine.hashCode() : 0);
        result = 31 * result + (históricoOnLine != null ? históricoOnLine.hashCode() : 0);
        return result;
    }
}
