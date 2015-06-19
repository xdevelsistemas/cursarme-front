package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdVagaPK.class)
public class AcdVaga {
    private long vagaId;

    @Basic
    @javax.persistence.Column(name = "Vaga_ID", nullable = false, insertable = true, updatable = true)
    public long getVagaId() {
        return vagaId;
    }

    public void setVagaId(long vagaId) {
        this.vagaId = vagaId;
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

    private String codSérieMatrícula;

    @Basic
    @javax.persistence.Column(name = "CodSérieMatrícula", nullable = true, insertable = true, updatable = true)
    public String getCodSérieMatrícula() {
        return codSérieMatrícula;
    }

    public void setCodSérieMatrícula(String codSérieMatrícula) {
        this.codSérieMatrícula = codSérieMatrícula;
    }

    private String codTurno;

    @Basic
    @javax.persistence.Column(name = "CodTurno", nullable = false, insertable = true, updatable = true)
    public String getCodTurno() {
        return codTurno;
    }

    public void setCodTurno(String codTurno) {
        this.codTurno = codTurno;
    }

    private Byte sala;

    @Basic
    @javax.persistence.Column(name = "Sala", nullable = true, insertable = true, updatable = true)
    public Byte getSala() {
        return sala;
    }

    public void setSala(Byte sala) {
        this.sala = sala;
    }

    private Byte pavimento;

    @Basic
    @javax.persistence.Column(name = "Pavimento", nullable = true, insertable = true, updatable = true)
    public Byte getPavimento() {
        return pavimento;
    }

    public void setPavimento(Byte pavimento) {
        this.pavimento = pavimento;
    }

    private Byte vagas;

    @Basic
    @javax.persistence.Column(name = "Vagas", nullable = true, insertable = true, updatable = true)
    public Byte getVagas() {
        return vagas;
    }

    public void setVagas(Byte vagas) {
        this.vagas = vagas;
    }

    private Short vagasOcupadas;

    @Basic
    @javax.persistence.Column(name = "VagasOcupadas", nullable = true, insertable = true, updatable = true)
    public Short getVagasOcupadas() {
        return vagasOcupadas;
    }

    public void setVagasOcupadas(Short vagasOcupadas) {
        this.vagasOcupadas = vagasOcupadas;
    }

    private Short vagasOcupadasFeminino;

    @Basic
    @javax.persistence.Column(name = "VagasOcupadasFeminino", nullable = true, insertable = true, updatable = true)
    public Short getVagasOcupadasFeminino() {
        return vagasOcupadasFeminino;
    }

    public void setVagasOcupadasFeminino(Short vagasOcupadasFeminino) {
        this.vagasOcupadasFeminino = vagasOcupadasFeminino;
    }

    private Short vagasOcupadasMasculino;

    @Basic
    @javax.persistence.Column(name = "VagasOcupadasMasculino", nullable = true, insertable = true, updatable = true)
    public Short getVagasOcupadasMasculino() {
        return vagasOcupadasMasculino;
    }

    public void setVagasOcupadasMasculino(Short vagasOcupadasMasculino) {
        this.vagasOcupadasMasculino = vagasOcupadasMasculino;
    }

    private Byte númeroPautaDivisão;

    @Basic
    @javax.persistence.Column(name = "NúmeroPautaDivisão", nullable = true, insertable = true, updatable = true)
    public Byte getNúmeroPautaDivisão() {
        return númeroPautaDivisão;
    }

    public void setNúmeroPautaDivisão(Byte númeroPautaDivisão) {
        this.númeroPautaDivisão = númeroPautaDivisão;
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

    private Short codProfessor;

    @Basic
    @javax.persistence.Column(name = "CodProfessor", nullable = true, insertable = true, updatable = true)
    public Short getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(Short codProfessor) {
        this.codProfessor = codProfessor;
    }

    private String descrição;

    @Basic
    @javax.persistence.Column(name = "Descrição", nullable = true, insertable = true, updatable = true)
    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    private String período;

    @Basic
    @javax.persistence.Column(name = "Período", nullable = true, insertable = true, updatable = true)
    public String getPeríodo() {
        return período;
    }

    public void setPeríodo(String período) {
        this.período = período;
    }

    private String turmaComplemento;

    @Basic
    @javax.persistence.Column(name = "TurmaComplemento", nullable = true, insertable = true, updatable = true)
    public String getTurmaComplemento() {
        return turmaComplemento;
    }

    public void setTurmaComplemento(String turmaComplemento) {
        this.turmaComplemento = turmaComplemento;
    }

    private Timestamp início;

    @Basic
    @javax.persistence.Column(name = "Início", nullable = true, insertable = true, updatable = true)
    public Timestamp getInício() {
        return início;
    }

    public void setInício(Timestamp início) {
        this.início = início;
    }

    private Timestamp fim;

    @Basic
    @javax.persistence.Column(name = "Fim", nullable = true, insertable = true, updatable = true)
    public Timestamp getFim() {
        return fim;
    }

    public void setFim(Timestamp fim) {
        this.fim = fim;
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

    private String projeto;

    @Basic
    @javax.persistence.Column(name = "Projeto", nullable = true, insertable = true, updatable = true)
    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    private int codModalidade;

    @Basic
    @javax.persistence.Column(name = "CodModalidade", nullable = false, insertable = true, updatable = true)
    public int getCodModalidade() {
        return codModalidade;
    }

    public void setCodModalidade(int codModalidade) {
        this.codModalidade = codModalidade;
    }

    private Integer númeroPautaUtilizado;

    @Basic
    @javax.persistence.Column(name = "NúmeroPautaUtilizado", nullable = true, insertable = true, updatable = true)
    public Integer getNúmeroPautaUtilizado() {
        return númeroPautaUtilizado;
    }

    public void setNúmeroPautaUtilizado(Integer númeroPautaUtilizado) {
        this.númeroPautaUtilizado = númeroPautaUtilizado;
    }

    private String mecMulti;

    @Basic
    @javax.persistence.Column(name = "MEC_Multi", nullable = true, insertable = true, updatable = true)
    public String getMecMulti() {
        return mecMulti;
    }

    public void setMecMulti(String mecMulti) {
        this.mecMulti = mecMulti;
    }

    private String mecUnificada;

    @Basic
    @javax.persistence.Column(name = "MEC_Unificada", nullable = true, insertable = true, updatable = true)
    public String getMecUnificada() {
        return mecUnificada;
    }

    public void setMecUnificada(String mecUnificada) {
        this.mecUnificada = mecUnificada;
    }

    private String mecCorreçãoFluxo;

    @Basic
    @javax.persistence.Column(name = "MEC_CorreçãoFluxo", nullable = true, insertable = true, updatable = true)
    public String getMecCorreçãoFluxo() {
        return mecCorreçãoFluxo;
    }

    public void setMecCorreçãoFluxo(String mecCorreçãoFluxo) {
        this.mecCorreçãoFluxo = mecCorreçãoFluxo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdVaga acdVaga = (AcdVaga) o;

        if (anoLetivo != acdVaga.anoLetivo) return false;
        if (codCurso != acdVaga.codCurso) return false;
        if (codModalidade != acdVaga.codModalidade) return false;
        if (codUnidade != acdVaga.codUnidade) return false;
        if (vagaId != acdVaga.vagaId) return false;
        if (codInscrição != null ? !codInscrição.equals(acdVaga.codInscrição) : acdVaga.codInscrição != null)
            return false;
        if (codProfessor != null ? !codProfessor.equals(acdVaga.codProfessor) : acdVaga.codProfessor != null)
            return false;
        if (codSérieMatrícula != null ? !codSérieMatrícula.equals(acdVaga.codSérieMatrícula) : acdVaga.codSérieMatrícula != null)
            return false;
        if (codTurno != null ? !codTurno.equals(acdVaga.codTurno) : acdVaga.codTurno != null) return false;
        if (descrição != null ? !descrição.equals(acdVaga.descrição) : acdVaga.descrição != null) return false;
        if (fim != null ? !fim.equals(acdVaga.fim) : acdVaga.fim != null) return false;
        if (habilitação != null ? !habilitação.equals(acdVaga.habilitação) : acdVaga.habilitação != null) return false;
        if (início != null ? !início.equals(acdVaga.início) : acdVaga.início != null) return false;
        if (mecCorreçãoFluxo != null ? !mecCorreçãoFluxo.equals(acdVaga.mecCorreçãoFluxo) : acdVaga.mecCorreçãoFluxo != null)
            return false;
        if (mecMulti != null ? !mecMulti.equals(acdVaga.mecMulti) : acdVaga.mecMulti != null) return false;
        if (mecUnificada != null ? !mecUnificada.equals(acdVaga.mecUnificada) : acdVaga.mecUnificada != null)
            return false;
        if (númeroPautaDivisão != null ? !númeroPautaDivisão.equals(acdVaga.númeroPautaDivisão) : acdVaga.númeroPautaDivisão != null)
            return false;
        if (númeroPautaUtilizado != null ? !númeroPautaUtilizado.equals(acdVaga.númeroPautaUtilizado) : acdVaga.númeroPautaUtilizado != null)
            return false;
        if (pavimento != null ? !pavimento.equals(acdVaga.pavimento) : acdVaga.pavimento != null) return false;
        if (período != null ? !período.equals(acdVaga.período) : acdVaga.período != null) return false;
        if (projeto != null ? !projeto.equals(acdVaga.projeto) : acdVaga.projeto != null) return false;
        if (sala != null ? !sala.equals(acdVaga.sala) : acdVaga.sala != null) return false;
        if (turma != null ? !turma.equals(acdVaga.turma) : acdVaga.turma != null) return false;
        if (turmaComplemento != null ? !turmaComplemento.equals(acdVaga.turmaComplemento) : acdVaga.turmaComplemento != null)
            return false;
        if (vagas != null ? !vagas.equals(acdVaga.vagas) : acdVaga.vagas != null) return false;
        if (vagasOcupadas != null ? !vagasOcupadas.equals(acdVaga.vagasOcupadas) : acdVaga.vagasOcupadas != null)
            return false;
        if (vagasOcupadasFeminino != null ? !vagasOcupadasFeminino.equals(acdVaga.vagasOcupadasFeminino) : acdVaga.vagasOcupadasFeminino != null)
            return false;
        if (vagasOcupadasMasculino != null ? !vagasOcupadasMasculino.equals(acdVaga.vagasOcupadasMasculino) : acdVaga.vagasOcupadasMasculino != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (vagaId ^ (vagaId >>> 32));
        result = 31 * result + anoLetivo;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + (codSérieMatrícula != null ? codSérieMatrícula.hashCode() : 0);
        result = 31 * result + (codTurno != null ? codTurno.hashCode() : 0);
        result = 31 * result + (sala != null ? sala.hashCode() : 0);
        result = 31 * result + (pavimento != null ? pavimento.hashCode() : 0);
        result = 31 * result + (vagas != null ? vagas.hashCode() : 0);
        result = 31 * result + (vagasOcupadas != null ? vagasOcupadas.hashCode() : 0);
        result = 31 * result + (vagasOcupadasFeminino != null ? vagasOcupadasFeminino.hashCode() : 0);
        result = 31 * result + (vagasOcupadasMasculino != null ? vagasOcupadasMasculino.hashCode() : 0);
        result = 31 * result + (númeroPautaDivisão != null ? númeroPautaDivisão.hashCode() : 0);
        result = 31 * result + (habilitação != null ? habilitação.hashCode() : 0);
        result = 31 * result + (codProfessor != null ? codProfessor.hashCode() : 0);
        result = 31 * result + (descrição != null ? descrição.hashCode() : 0);
        result = 31 * result + (período != null ? período.hashCode() : 0);
        result = 31 * result + (turmaComplemento != null ? turmaComplemento.hashCode() : 0);
        result = 31 * result + (início != null ? início.hashCode() : 0);
        result = 31 * result + (fim != null ? fim.hashCode() : 0);
        result = 31 * result + (codInscrição != null ? codInscrição.hashCode() : 0);
        result = 31 * result + (projeto != null ? projeto.hashCode() : 0);
        result = 31 * result + codModalidade;
        result = 31 * result + (númeroPautaUtilizado != null ? númeroPautaUtilizado.hashCode() : 0);
        result = 31 * result + (mecMulti != null ? mecMulti.hashCode() : 0);
        result = 31 * result + (mecUnificada != null ? mecUnificada.hashCode() : 0);
        result = 31 * result + (mecCorreçãoFluxo != null ? mecCorreçãoFluxo.hashCode() : 0);
        return result;
    }
}
