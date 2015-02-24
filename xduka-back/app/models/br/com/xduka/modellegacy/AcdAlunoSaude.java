package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by clayton on 04/12/14.
 */
@IdClass(AcdAlunoSaudePK.class)
@Entity
@javax.persistence.Table(name = "acdAlunoSaúde", schema = "dbo", catalog = "xDuka")
public class AcdAlunoSaude {
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

    private boolean problemasvisão;

    @Basic
    @javax.persistence.Column(name = "Problemasvisão", nullable = false, insertable = true, updatable = true)
    public boolean isProblemasvisão() {
        return problemasvisão;
    }

    public void setProblemasvisão(boolean problemasvisão) {
        this.problemasvisão = problemasvisão;
    }

    private boolean problemasAudição;

    @Basic
    @javax.persistence.Column(name = "ProblemasAudição", nullable = false, insertable = true, updatable = true)
    public boolean isProblemasAudição() {
        return problemasAudição;
    }

    public void setProblemasAudição(boolean problemasAudição) {
        this.problemasAudição = problemasAudição;
    }

    private boolean problemasLinguagem;

    @Basic
    @javax.persistence.Column(name = "ProblemasLinguagem", nullable = false, insertable = true, updatable = true)
    public boolean isProblemasLinguagem() {
        return problemasLinguagem;
    }

    public void setProblemasLinguagem(boolean problemasLinguagem) {
        this.problemasLinguagem = problemasLinguagem;
    }

    private String problemasSaúdeOutros;

    @Basic
    @javax.persistence.Column(name = "ProblemasSaúdeOutros", nullable = true, insertable = true, updatable = true)
    public String getProblemasSaúdeOutros() {
        return problemasSaúdeOutros;
    }

    public void setProblemasSaúdeOutros(String problemasSaúdeOutros) {
        this.problemasSaúdeOutros = problemasSaúdeOutros;
    }

    private String alergiaAlimentos;

    @Basic
    @javax.persistence.Column(name = "AlergiaAlimentos", nullable = true, insertable = true, updatable = true)
    public String getAlergiaAlimentos() {
        return alergiaAlimentos;
    }

    public void setAlergiaAlimentos(String alergiaAlimentos) {
        this.alergiaAlimentos = alergiaAlimentos;
    }

    private String alergiaMedicamentos;

    @Basic
    @javax.persistence.Column(name = "AlergiaMedicamentos", nullable = true, insertable = true, updatable = true)
    public String getAlergiaMedicamentos() {
        return alergiaMedicamentos;
    }

    public void setAlergiaMedicamentos(String alergiaMedicamentos) {
        this.alergiaMedicamentos = alergiaMedicamentos;
    }

    private String medicamentosControlados;

    @Basic
    @javax.persistence.Column(name = "MedicamentosControlados", nullable = true, insertable = true, updatable = true)
    public String getMedicamentosControlados() {
        return medicamentosControlados;
    }

    public void setMedicamentosControlados(String medicamentosControlados) {
        this.medicamentosControlados = medicamentosControlados;
    }

    private boolean acompanhamentoNeurológico;

    @Basic
    @javax.persistence.Column(name = "AcompanhamentoNeurológico", nullable = false, insertable = true, updatable = true)
    public boolean isAcompanhamentoNeurológico() {
        return acompanhamentoNeurológico;
    }

    public void setAcompanhamentoNeurológico(boolean acompanhamentoNeurológico) {
        this.acompanhamentoNeurológico = acompanhamentoNeurológico;
    }

    private boolean acompanhamentoCardiológico;

    @Basic
    @javax.persistence.Column(name = "AcompanhamentoCardiológico", nullable = false, insertable = true, updatable = true)
    public boolean isAcompanhamentoCardiológico() {
        return acompanhamentoCardiológico;
    }

    public void setAcompanhamentoCardiológico(boolean acompanhamentoCardiológico) {
        this.acompanhamentoCardiológico = acompanhamentoCardiológico;
    }

    private boolean acompanhamentoPsicológico;

    @Basic
    @javax.persistence.Column(name = "AcompanhamentoPsicológico", nullable = false, insertable = true, updatable = true)
    public boolean isAcompanhamentoPsicológico() {
        return acompanhamentoPsicológico;
    }

    public void setAcompanhamentoPsicológico(boolean acompanhamentoPsicológico) {
        this.acompanhamentoPsicológico = acompanhamentoPsicológico;
    }

    private String acompanhamentoMédicoOutros;

    @Basic
    @javax.persistence.Column(name = "AcompanhamentoMédicoOutros", nullable = true, insertable = true, updatable = true)
    public String getAcompanhamentoMédicoOutros() {
        return acompanhamentoMédicoOutros;
    }

    public void setAcompanhamentoMédicoOutros(String acompanhamentoMédicoOutros) {
        this.acompanhamentoMédicoOutros = acompanhamentoMédicoOutros;
    }

    private boolean doençasCoqueluche;

    @Basic
    @javax.persistence.Column(name = "DoençasCoqueluche", nullable = false, insertable = true, updatable = true)
    public boolean isDoençasCoqueluche() {
        return doençasCoqueluche;
    }

    public void setDoençasCoqueluche(boolean doençasCoqueluche) {
        this.doençasCoqueluche = doençasCoqueluche;
    }

    private boolean doençasMeningite;

    @Basic
    @javax.persistence.Column(name = "DoençasMeningite", nullable = false, insertable = true, updatable = true)
    public boolean isDoençasMeningite() {
        return doençasMeningite;
    }

    public void setDoençasMeningite(boolean doençasMeningite) {
        this.doençasMeningite = doençasMeningite;
    }

    private boolean doençasVaríola;

    @Basic
    @javax.persistence.Column(name = "DoençasVaríola", nullable = false, insertable = true, updatable = true)
    public boolean isDoençasVaríola() {
        return doençasVaríola;
    }

    public void setDoençasVaríola(boolean doençasVaríola) {
        this.doençasVaríola = doençasVaríola;
    }

    private boolean doençasSarampo;

    @Basic
    @javax.persistence.Column(name = "DoençasSarampo", nullable = false, insertable = true, updatable = true)
    public boolean isDoençasSarampo() {
        return doençasSarampo;
    }

    public void setDoençasSarampo(boolean doençasSarampo) {
        this.doençasSarampo = doençasSarampo;
    }

    private boolean vacinasBcgOral;

    @Basic
    @javax.persistence.Column(name = "VacinasBCGOral", nullable = false, insertable = true, updatable = true)
    public boolean isVacinasBcgOral() {
        return vacinasBcgOral;
    }

    public void setVacinasBcgOral(boolean vacinasBcgOral) {
        this.vacinasBcgOral = vacinasBcgOral;
    }

    private boolean vacinasTríplice;

    @Basic
    @javax.persistence.Column(name = "VacinasTríplice", nullable = false, insertable = true, updatable = true)
    public boolean isVacinasTríplice() {
        return vacinasTríplice;
    }

    public void setVacinasTríplice(boolean vacinasTríplice) {
        this.vacinasTríplice = vacinasTríplice;
    }

    private boolean vacinasSabim;

    @Basic
    @javax.persistence.Column(name = "VacinasSABIM", nullable = false, insertable = true, updatable = true)
    public boolean isVacinasSabim() {
        return vacinasSabim;
    }

    public void setVacinasSabim(boolean vacinasSabim) {
        this.vacinasSabim = vacinasSabim;
    }

    private boolean vacinasAntiSarampo;

    @Basic
    @javax.persistence.Column(name = "VacinasAntiSarampo", nullable = false, insertable = true, updatable = true)
    public boolean isVacinasAntiSarampo() {
        return vacinasAntiSarampo;
    }

    public void setVacinasAntiSarampo(boolean vacinasAntiSarampo) {
        this.vacinasAntiSarampo = vacinasAntiSarampo;
    }

    private boolean vacinasAntiTetânica;

    @Basic
    @javax.persistence.Column(name = "VacinasAntiTetânica", nullable = false, insertable = true, updatable = true)
    public boolean isVacinasAntiTetânica() {
        return vacinasAntiTetânica;
    }

    public void setVacinasAntiTetânica(boolean vacinasAntiTetânica) {
        this.vacinasAntiTetânica = vacinasAntiTetânica;
    }

    private String remédiosDorCabeça;

    @Basic
    @javax.persistence.Column(name = "RemédiosDorCabeça", nullable = true, insertable = true, updatable = true)
    public String getRemédiosDorCabeça() {
        return remédiosDorCabeça;
    }

    public void setRemédiosDorCabeça(String remédiosDorCabeça) {
        this.remédiosDorCabeça = remédiosDorCabeça;
    }

    private String remédiosDorBarriga;

    @Basic
    @javax.persistence.Column(name = "RemédiosDorBarriga", nullable = true, insertable = true, updatable = true)
    public String getRemédiosDorBarriga() {
        return remédiosDorBarriga;
    }

    public void setRemédiosDorBarriga(String remédiosDorBarriga) {
        this.remédiosDorBarriga = remédiosDorBarriga;
    }

    private String remédiosFebre;

    @Basic
    @javax.persistence.Column(name = "RemédiosFebre", nullable = true, insertable = true, updatable = true)
    public String getRemédiosFebre() {
        return remédiosFebre;
    }

    public void setRemédiosFebre(String remédiosFebre) {
        this.remédiosFebre = remédiosFebre;
    }

    private String remédiosEnjôo;

    @Basic
    @javax.persistence.Column(name = "RemédiosEnjôo", nullable = true, insertable = true, updatable = true)
    public String getRemédiosEnjôo() {
        return remédiosEnjôo;
    }

    public void setRemédiosEnjôo(String remédiosEnjôo) {
        this.remédiosEnjôo = remédiosEnjôo;
    }

    private String planoSaúde;

    @Basic
    @javax.persistence.Column(name = "PlanoSaúde", nullable = true, insertable = true, updatable = true)
    public String getPlanoSaúde() {
        return planoSaúde;
    }

    public void setPlanoSaúde(String planoSaúde) {
        this.planoSaúde = planoSaúde;
    }

    private Integer inserido;

    @Basic
    @javax.persistence.Column(name = "Inserido", nullable = true, insertable = true, updatable = true)
    public Integer getInserido() {
        return inserido;
    }

    public void setInserido(Integer inserido) {
        this.inserido = inserido;
    }

    private String hospitalEmergência;

    @Basic
    @javax.persistence.Column(name = "HospitalEmergência", nullable = true, insertable = true, updatable = true)
    public String getHospitalEmergência() {
        return hospitalEmergência;
    }

    public void setHospitalEmergência(String hospitalEmergência) {
        this.hospitalEmergência = hospitalEmergência;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAlunoSaude that = (AcdAlunoSaude) o;

        if (acompanhamentoCardiológico != that.acompanhamentoCardiológico) return false;
        if (acompanhamentoNeurológico != that.acompanhamentoNeurológico) return false;
        if (acompanhamentoPsicológico != that.acompanhamentoPsicológico) return false;
        if (codUnidade != that.codUnidade) return false;
        if (doençasCoqueluche != that.doençasCoqueluche) return false;
        if (doençasMeningite != that.doençasMeningite) return false;
        if (doençasSarampo != that.doençasSarampo) return false;
        if (doençasVaríola != that.doençasVaríola) return false;
        if (matrícula != that.matrícula) return false;
        if (problemasAudição != that.problemasAudição) return false;
        if (problemasLinguagem != that.problemasLinguagem) return false;
        if (problemasvisão != that.problemasvisão) return false;
        if (vacinasAntiSarampo != that.vacinasAntiSarampo) return false;
        if (vacinasAntiTetânica != that.vacinasAntiTetânica) return false;
        if (vacinasBcgOral != that.vacinasBcgOral) return false;
        if (vacinasSabim != that.vacinasSabim) return false;
        if (vacinasTríplice != that.vacinasTríplice) return false;
        if (acompanhamentoMédicoOutros != null ? !acompanhamentoMédicoOutros.equals(that.acompanhamentoMédicoOutros) : that.acompanhamentoMédicoOutros != null)
            return false;
        if (alergiaAlimentos != null ? !alergiaAlimentos.equals(that.alergiaAlimentos) : that.alergiaAlimentos != null)
            return false;
        if (alergiaMedicamentos != null ? !alergiaMedicamentos.equals(that.alergiaMedicamentos) : that.alergiaMedicamentos != null)
            return false;
        if (hospitalEmergência != null ? !hospitalEmergência.equals(that.hospitalEmergência) : that.hospitalEmergência != null)
            return false;
        if (inserido != null ? !inserido.equals(that.inserido) : that.inserido != null) return false;
        if (medicamentosControlados != null ? !medicamentosControlados.equals(that.medicamentosControlados) : that.medicamentosControlados != null)
            return false;
        if (planoSaúde != null ? !planoSaúde.equals(that.planoSaúde) : that.planoSaúde != null) return false;
        if (problemasSaúdeOutros != null ? !problemasSaúdeOutros.equals(that.problemasSaúdeOutros) : that.problemasSaúdeOutros != null)
            return false;
        if (remédiosDorBarriga != null ? !remédiosDorBarriga.equals(that.remédiosDorBarriga) : that.remédiosDorBarriga != null)
            return false;
        if (remédiosDorCabeça != null ? !remédiosDorCabeça.equals(that.remédiosDorCabeça) : that.remédiosDorCabeça != null)
            return false;
        if (remédiosEnjôo != null ? !remédiosEnjôo.equals(that.remédiosEnjôo) : that.remédiosEnjôo != null)
            return false;
        if (remédiosFebre != null ? !remédiosFebre.equals(that.remédiosFebre) : that.remédiosFebre != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + matrícula;
        result = 31 * result + (problemasvisão ? 1 : 0);
        result = 31 * result + (problemasAudição ? 1 : 0);
        result = 31 * result + (problemasLinguagem ? 1 : 0);
        result = 31 * result + (problemasSaúdeOutros != null ? problemasSaúdeOutros.hashCode() : 0);
        result = 31 * result + (alergiaAlimentos != null ? alergiaAlimentos.hashCode() : 0);
        result = 31 * result + (alergiaMedicamentos != null ? alergiaMedicamentos.hashCode() : 0);
        result = 31 * result + (medicamentosControlados != null ? medicamentosControlados.hashCode() : 0);
        result = 31 * result + (acompanhamentoNeurológico ? 1 : 0);
        result = 31 * result + (acompanhamentoCardiológico ? 1 : 0);
        result = 31 * result + (acompanhamentoPsicológico ? 1 : 0);
        result = 31 * result + (acompanhamentoMédicoOutros != null ? acompanhamentoMédicoOutros.hashCode() : 0);
        result = 31 * result + (doençasCoqueluche ? 1 : 0);
        result = 31 * result + (doençasMeningite ? 1 : 0);
        result = 31 * result + (doençasVaríola ? 1 : 0);
        result = 31 * result + (doençasSarampo ? 1 : 0);
        result = 31 * result + (vacinasBcgOral ? 1 : 0);
        result = 31 * result + (vacinasTríplice ? 1 : 0);
        result = 31 * result + (vacinasSabim ? 1 : 0);
        result = 31 * result + (vacinasAntiSarampo ? 1 : 0);
        result = 31 * result + (vacinasAntiTetânica ? 1 : 0);
        result = 31 * result + (remédiosDorCabeça != null ? remédiosDorCabeça.hashCode() : 0);
        result = 31 * result + (remédiosDorBarriga != null ? remédiosDorBarriga.hashCode() : 0);
        result = 31 * result + (remédiosFebre != null ? remédiosFebre.hashCode() : 0);
        result = 31 * result + (remédiosEnjôo != null ? remédiosEnjôo.hashCode() : 0);
        result = 31 * result + (planoSaúde != null ? planoSaúde.hashCode() : 0);
        result = 31 * result + (inserido != null ? inserido.hashCode() : 0);
        result = 31 * result + (hospitalEmergência != null ? hospitalEmergência.hashCode() : 0);
        return result;
    }
}
