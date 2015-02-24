package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class AcdHistórico {
    private long acdHistóricoId;

    @Basic
    @javax.persistence.Column(name = "acdHistórico_ID", nullable = false, insertable = true, updatable = true)
    public long getAcdHistóricoId() {
        return acdHistóricoId;
    }

    public void setAcdHistóricoId(long acdHistóricoId) {
        this.acdHistóricoId = acdHistóricoId;
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

    private int matrícula;

    @Id
    @javax.persistence.Column(name = "Matrícula", nullable = false, insertable = true, updatable = true)
    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
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

    private Integer codInscrição;

    @Basic
    @javax.persistence.Column(name = "CodInscrição", nullable = true, insertable = true, updatable = true)
    public Integer getCodInscrição() {
        return codInscrição;
    }

    public void setCodInscrição(Integer codInscrição) {
        this.codInscrição = codInscrição;
    }

    private Integer codCandidato;

    @Basic
    @javax.persistence.Column(name = "CodCandidato", nullable = true, insertable = true, updatable = true)
    public Integer getCodCandidato() {
        return codCandidato;
    }

    public void setCodCandidato(Integer codCandidato) {
        this.codCandidato = codCandidato;
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

    private String formaIngresso;

    @Basic
    @javax.persistence.Column(name = "FormaIngresso", nullable = true, insertable = true, updatable = true)
    public String getFormaIngresso() {
        return formaIngresso;
    }

    public void setFormaIngresso(String formaIngresso) {
        this.formaIngresso = formaIngresso;
    }

    private Boolean encerrado;

    @Basic
    @javax.persistence.Column(name = "Encerrado", nullable = true, insertable = true, updatable = true)
    public Boolean getEncerrado() {
        return encerrado;
    }

    public void setEncerrado(Boolean encerrado) {
        this.encerrado = encerrado;
    }

    private Timestamp dataApuração;

    @Basic
    @javax.persistence.Column(name = "DataApuração", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataApuração() {
        return dataApuração;
    }

    public void setDataApuração(Timestamp dataApuração) {
        this.dataApuração = dataApuração;
    }

    private Short anoConclusão;

    @Basic
    @javax.persistence.Column(name = "AnoConclusão", nullable = true, insertable = true, updatable = true)
    public Short getAnoConclusão() {
        return anoConclusão;
    }

    public void setAnoConclusão(Short anoConclusão) {
        this.anoConclusão = anoConclusão;
    }

    private Timestamp dataColação;

    @Basic
    @javax.persistence.Column(name = "DataColação", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataColação() {
        return dataColação;
    }

    public void setDataColação(Timestamp dataColação) {
        this.dataColação = dataColação;
    }

    private Timestamp dataDiploma;

    @Basic
    @javax.persistence.Column(name = "DataDiploma", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataDiploma() {
        return dataDiploma;
    }

    public void setDataDiploma(Timestamp dataDiploma) {
        this.dataDiploma = dataDiploma;
    }

    private String escolaMédio;

    @Basic
    @javax.persistence.Column(name = "EscolaMédio", nullable = true, insertable = true, updatable = true)
    public String getEscolaMédio() {
        return escolaMédio;
    }

    public void setEscolaMédio(String escolaMédio) {
        this.escolaMédio = escolaMédio;
    }

    private String escolaMédioAnoConclusão;

    @Basic
    @javax.persistence.Column(name = "EscolaMédioAnoConclusão", nullable = true, insertable = true, updatable = true)
    public String getEscolaMédioAnoConclusão() {
        return escolaMédioAnoConclusão;
    }

    public void setEscolaMédioAnoConclusão(String escolaMédioAnoConclusão) {
        this.escolaMédioAnoConclusão = escolaMédioAnoConclusão;
    }

    private String escolaMédioCidade;

    @Basic
    @javax.persistence.Column(name = "EscolaMédioCidade", nullable = true, insertable = true, updatable = true)
    public String getEscolaMédioCidade() {
        return escolaMédioCidade;
    }

    public void setEscolaMédioCidade(String escolaMédioCidade) {
        this.escolaMédioCidade = escolaMédioCidade;
    }

    private String escolaMédioUf;

    @Basic
    @javax.persistence.Column(name = "EscolaMédioUF", nullable = true, insertable = true, updatable = true)
    public String getEscolaMédioUf() {
        return escolaMédioUf;
    }

    public void setEscolaMédioUf(String escolaMédioUf) {
        this.escolaMédioUf = escolaMédioUf;
    }

    private Integer codGrade;

    @Basic
    @javax.persistence.Column(name = "CodGrade", nullable = true, insertable = true, updatable = true)
    public Integer getCodGrade() {
        return codGrade;
    }

    public void setCodGrade(Integer codGrade) {
        this.codGrade = codGrade;
    }

    private Timestamp estágioInício;

    @Basic
    @javax.persistence.Column(name = "EstágioInício", nullable = true, insertable = true, updatable = true)
    public Timestamp getEstágioInício() {
        return estágioInício;
    }

    public void setEstágioInício(Timestamp estágioInício) {
        this.estágioInício = estágioInício;
    }

    private Timestamp estágioFim;

    @Basic
    @javax.persistence.Column(name = "EstágioFim", nullable = true, insertable = true, updatable = true)
    public Timestamp getEstágioFim() {
        return estágioFim;
    }

    public void setEstágioFim(Timestamp estágioFim) {
        this.estágioFim = estágioFim;
    }

    private Integer estágioCh;

    @Basic
    @javax.persistence.Column(name = "EstágioCH", nullable = true, insertable = true, updatable = true)
    public Integer getEstágioCh() {
        return estágioCh;
    }

    public void setEstágioCh(Integer estágioCh) {
        this.estágioCh = estágioCh;
    }

    private String estágioResultado;

    @Basic
    @javax.persistence.Column(name = "EstágioResultado", nullable = true, insertable = true, updatable = true)
    public String getEstágioResultado() {
        return estágioResultado;
    }

    public void setEstágioResultado(String estágioResultado) {
        this.estágioResultado = estágioResultado;
    }

    private Timestamp dataEncerramento;

    @Basic
    @javax.persistence.Column(name = "DataEncerramento", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(Timestamp dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    private String observaçãoTransferência;

    @Basic
    @javax.persistence.Column(name = "ObservaçãoTransferência", nullable = true, insertable = true, updatable = true)
    public String getObservaçãoTransferência() {
        return observaçãoTransferência;
    }

    public void setObservaçãoTransferência(String observaçãoTransferência) {
        this.observaçãoTransferência = observaçãoTransferência;
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

    private String instituiçãoTransferência;

    @Basic
    @javax.persistence.Column(name = "InstituiçãoTransferência", nullable = true, insertable = true, updatable = true)
    public String getInstituiçãoTransferência() {
        return instituiçãoTransferência;
    }

    public void setInstituiçãoTransferência(String instituiçãoTransferência) {
        this.instituiçãoTransferência = instituiçãoTransferência;
    }

    private String escolaMédioCurso;

    @Basic
    @javax.persistence.Column(name = "EscolaMédioCurso", nullable = true, insertable = true, updatable = true)
    public String getEscolaMédioCurso() {
        return escolaMédioCurso;
    }

    public void setEscolaMédioCurso(String escolaMédioCurso) {
        this.escolaMédioCurso = escolaMédioCurso;
    }

    private Integer codIngressoForma;

    @Basic
    @javax.persistence.Column(name = "CodIngressoForma", nullable = true, insertable = true, updatable = true)
    public Integer getCodIngressoForma() {
        return codIngressoForma;
    }

    public void setCodIngressoForma(Integer codIngressoForma) {
        this.codIngressoForma = codIngressoForma;
    }

    private String monografia;

    @Basic
    @javax.persistence.Column(name = "Monografia", nullable = true, insertable = true, updatable = true)
    public String getMonografia() {
        return monografia;
    }

    public void setMonografia(String monografia) {
        this.monografia = monografia;
    }

    private String monografiaProfessor;

    @Basic
    @javax.persistence.Column(name = "MonografiaProfessor", nullable = true, insertable = true, updatable = true)
    public String getMonografiaProfessor() {
        return monografiaProfessor;
    }

    public void setMonografiaProfessor(String monografiaProfessor) {
        this.monografiaProfessor = monografiaProfessor;
    }

    private String formaIngressoClassificação;

    @Basic
    @javax.persistence.Column(name = "FormaIngressoClassificação", nullable = true, insertable = true, updatable = true)
    public String getFormaIngressoClassificação() {
        return formaIngressoClassificação;
    }

    public void setFormaIngressoClassificação(String formaIngressoClassificação) {
        this.formaIngressoClassificação = formaIngressoClassificação;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdHistórico that = (AcdHistórico) o;

        if (acdHistóricoId != that.acdHistóricoId) return false;
        if (codCurso != that.codCurso) return false;
        if (codUnidade != that.codUnidade) return false;
        if (matrícula != that.matrícula) return false;
        if (anoConclusão != null ? !anoConclusão.equals(that.anoConclusão) : that.anoConclusão != null) return false;
        if (codCandidato != null ? !codCandidato.equals(that.codCandidato) : that.codCandidato != null) return false;
        if (codGrade != null ? !codGrade.equals(that.codGrade) : that.codGrade != null) return false;
        if (codIngressoForma != null ? !codIngressoForma.equals(that.codIngressoForma) : that.codIngressoForma != null)
            return false;
        if (codInscrição != null ? !codInscrição.equals(that.codInscrição) : that.codInscrição != null) return false;
        if (dataApuração != null ? !dataApuração.equals(that.dataApuração) : that.dataApuração != null) return false;
        if (dataColação != null ? !dataColação.equals(that.dataColação) : that.dataColação != null) return false;
        if (dataDiploma != null ? !dataDiploma.equals(that.dataDiploma) : that.dataDiploma != null) return false;
        if (dataEncerramento != null ? !dataEncerramento.equals(that.dataEncerramento) : that.dataEncerramento != null)
            return false;
        if (encerrado != null ? !encerrado.equals(that.encerrado) : that.encerrado != null) return false;
        if (escolaMédio != null ? !escolaMédio.equals(that.escolaMédio) : that.escolaMédio != null) return false;
        if (escolaMédioAnoConclusão != null ? !escolaMédioAnoConclusão.equals(that.escolaMédioAnoConclusão) : that.escolaMédioAnoConclusão != null)
            return false;
        if (escolaMédioCidade != null ? !escolaMédioCidade.equals(that.escolaMédioCidade) : that.escolaMédioCidade != null)
            return false;
        if (escolaMédioCurso != null ? !escolaMédioCurso.equals(that.escolaMédioCurso) : that.escolaMédioCurso != null)
            return false;
        if (escolaMédioUf != null ? !escolaMédioUf.equals(that.escolaMédioUf) : that.escolaMédioUf != null)
            return false;
        if (estágioCh != null ? !estágioCh.equals(that.estágioCh) : that.estágioCh != null) return false;
        if (estágioFim != null ? !estágioFim.equals(that.estágioFim) : that.estágioFim != null) return false;
        if (estágioInício != null ? !estágioInício.equals(that.estágioInício) : that.estágioInício != null)
            return false;
        if (estágioResultado != null ? !estágioResultado.equals(that.estágioResultado) : that.estágioResultado != null)
            return false;
        if (formaIngresso != null ? !formaIngresso.equals(that.formaIngresso) : that.formaIngresso != null)
            return false;
        if (formaIngressoClassificação != null ? !formaIngressoClassificação.equals(that.formaIngressoClassificação) : that.formaIngressoClassificação != null)
            return false;
        if (inscriçãoDocumento != null ? !inscriçãoDocumento.equals(that.inscriçãoDocumento) : that.inscriçãoDocumento != null)
            return false;
        if (instituiçãoTransferência != null ? !instituiçãoTransferência.equals(that.instituiçãoTransferência) : that.instituiçãoTransferência != null)
            return false;
        if (monografia != null ? !monografia.equals(that.monografia) : that.monografia != null) return false;
        if (monografiaProfessor != null ? !monografiaProfessor.equals(that.monografiaProfessor) : that.monografiaProfessor != null)
            return false;
        if (observação != null ? !observação.equals(that.observação) : that.observação != null) return false;
        if (observaçãoTransferência != null ? !observaçãoTransferência.equals(that.observaçãoTransferência) : that.observaçãoTransferência != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (acdHistóricoId ^ (acdHistóricoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + matrícula;
        result = 31 * result + codCurso;
        result = 31 * result + (codInscrição != null ? codInscrição.hashCode() : 0);
        result = 31 * result + (codCandidato != null ? codCandidato.hashCode() : 0);
        result = 31 * result + (observação != null ? observação.hashCode() : 0);
        result = 31 * result + (formaIngresso != null ? formaIngresso.hashCode() : 0);
        result = 31 * result + (encerrado != null ? encerrado.hashCode() : 0);
        result = 31 * result + (dataApuração != null ? dataApuração.hashCode() : 0);
        result = 31 * result + (anoConclusão != null ? anoConclusão.hashCode() : 0);
        result = 31 * result + (dataColação != null ? dataColação.hashCode() : 0);
        result = 31 * result + (dataDiploma != null ? dataDiploma.hashCode() : 0);
        result = 31 * result + (escolaMédio != null ? escolaMédio.hashCode() : 0);
        result = 31 * result + (escolaMédioAnoConclusão != null ? escolaMédioAnoConclusão.hashCode() : 0);
        result = 31 * result + (escolaMédioCidade != null ? escolaMédioCidade.hashCode() : 0);
        result = 31 * result + (escolaMédioUf != null ? escolaMédioUf.hashCode() : 0);
        result = 31 * result + (codGrade != null ? codGrade.hashCode() : 0);
        result = 31 * result + (estágioInício != null ? estágioInício.hashCode() : 0);
        result = 31 * result + (estágioFim != null ? estágioFim.hashCode() : 0);
        result = 31 * result + (estágioCh != null ? estágioCh.hashCode() : 0);
        result = 31 * result + (estágioResultado != null ? estágioResultado.hashCode() : 0);
        result = 31 * result + (dataEncerramento != null ? dataEncerramento.hashCode() : 0);
        result = 31 * result + (observaçãoTransferência != null ? observaçãoTransferência.hashCode() : 0);
        result = 31 * result + (inscriçãoDocumento != null ? inscriçãoDocumento.hashCode() : 0);
        result = 31 * result + (instituiçãoTransferência != null ? instituiçãoTransferência.hashCode() : 0);
        result = 31 * result + (escolaMédioCurso != null ? escolaMédioCurso.hashCode() : 0);
        result = 31 * result + (codIngressoForma != null ? codIngressoForma.hashCode() : 0);
        result = 31 * result + (monografia != null ? monografia.hashCode() : 0);
        result = 31 * result + (monografiaProfessor != null ? monografiaProfessor.hashCode() : 0);
        result = 31 * result + (formaIngressoClassificação != null ? formaIngressoClassificação.hashCode() : 0);
        return result;
    }
}
