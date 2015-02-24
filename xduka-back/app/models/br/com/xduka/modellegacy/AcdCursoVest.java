package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdCursoVestPK.class)
public class AcdCursoVest {
    private long cursoVestId;
    private int anoLetivo;
    private int codUnidade;
    private int codCursoVest;
    private String cursoVest;
    private String codGrupo;
    private Short vagas;
    private Double candidatoVaga;
    private Byte percentualEtapa1;
    private Byte percentualFinal;
    private Short aprovadosEscola;
    private String cursoCidade;
    private Byte codCurso93;
    private AcdGrupoVest acdGrupoVest;

    @Basic
    @Column(name = "CursoVest_ID", nullable = false, insertable = true, updatable = true)
    public long getCursoVestId() {
        return cursoVestId;
    }

    public void setCursoVestId(long cursoVestId) {
        this.cursoVestId = cursoVestId;
    }

    @Id
    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
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
    @Column(name = "CodCursoVest", nullable = false, insertable = true, updatable = true)
    public int getCodCursoVest() {
        return codCursoVest;
    }

    public void setCodCursoVest(int codCursoVest) {
        this.codCursoVest = codCursoVest;
    }

    @Basic
    @Column(name = "CursoVest", nullable = true, insertable = true, updatable = true)
    public String getCursoVest() {
        return cursoVest;
    }

    public void setCursoVest(String cursoVest) {
        this.cursoVest = cursoVest;
    }

    @Basic
    @Column(name = "CodGrupo", nullable = true, insertable = true, updatable = true)
    public String getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(String codGrupo) {
        this.codGrupo = codGrupo;
    }

    @Basic
    @Column(name = "Vagas", nullable = true, insertable = true, updatable = true)
    public Short getVagas() {
        return vagas;
    }

    public void setVagas(Short vagas) {
        this.vagas = vagas;
    }

    @Basic
    @Column(name = "CandidatoVaga", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getCandidatoVaga() {
        return candidatoVaga;
    }

    public void setCandidatoVaga(Double candidatoVaga) {
        this.candidatoVaga = candidatoVaga;
    }

    @Basic
    @Column(name = "PercentualEtapa1", nullable = true, insertable = true, updatable = true)
    public Byte getPercentualEtapa1() {
        return percentualEtapa1;
    }

    public void setPercentualEtapa1(Byte percentualEtapa1) {
        this.percentualEtapa1 = percentualEtapa1;
    }

    @Basic
    @Column(name = "PercentualFinal", nullable = true, insertable = true, updatable = true)
    public Byte getPercentualFinal() {
        return percentualFinal;
    }

    public void setPercentualFinal(Byte percentualFinal) {
        this.percentualFinal = percentualFinal;
    }

    @Basic
    @Column(name = "AprovadosEscola", nullable = true, insertable = true, updatable = true)
    public Short getAprovadosEscola() {
        return aprovadosEscola;
    }

    public void setAprovadosEscola(Short aprovadosEscola) {
        this.aprovadosEscola = aprovadosEscola;
    }

    @Basic
    @Column(name = "CursoCidade", nullable = true, insertable = true, updatable = true)
    public String getCursoCidade() {
        return cursoCidade;
    }

    public void setCursoCidade(String cursoCidade) {
        this.cursoCidade = cursoCidade;
    }

    @Basic
    @Column(name = "CodCurso93", nullable = true, insertable = true, updatable = true)
    public Byte getCodCurso93() {
        return codCurso93;
    }

    public void setCodCurso93(Byte codCurso93) {
        this.codCurso93 = codCurso93;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdCursoVest that = (AcdCursoVest) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codCursoVest != that.codCursoVest) return false;
        if (codUnidade != that.codUnidade) return false;
        if (cursoVestId != that.cursoVestId) return false;
        if (aprovadosEscola != null ? !aprovadosEscola.equals(that.aprovadosEscola) : that.aprovadosEscola != null)
            return false;
        if (candidatoVaga != null ? !candidatoVaga.equals(that.candidatoVaga) : that.candidatoVaga != null)
            return false;
        if (codCurso93 != null ? !codCurso93.equals(that.codCurso93) : that.codCurso93 != null) return false;
        if (codGrupo != null ? !codGrupo.equals(that.codGrupo) : that.codGrupo != null) return false;
        if (cursoCidade != null ? !cursoCidade.equals(that.cursoCidade) : that.cursoCidade != null) return false;
        if (cursoVest != null ? !cursoVest.equals(that.cursoVest) : that.cursoVest != null) return false;
        if (percentualEtapa1 != null ? !percentualEtapa1.equals(that.percentualEtapa1) : that.percentualEtapa1 != null)
            return false;
        if (percentualFinal != null ? !percentualFinal.equals(that.percentualFinal) : that.percentualFinal != null)
            return false;
        if (vagas != null ? !vagas.equals(that.vagas) : that.vagas != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cursoVestId ^ (cursoVestId >>> 32));
        result = 31 * result + anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + codCursoVest;
        result = 31 * result + (cursoVest != null ? cursoVest.hashCode() : 0);
        result = 31 * result + (codGrupo != null ? codGrupo.hashCode() : 0);
        result = 31 * result + (vagas != null ? vagas.hashCode() : 0);
        result = 31 * result + (candidatoVaga != null ? candidatoVaga.hashCode() : 0);
        result = 31 * result + (percentualEtapa1 != null ? percentualEtapa1.hashCode() : 0);
        result = 31 * result + (percentualFinal != null ? percentualFinal.hashCode() : 0);
        result = 31 * result + (aprovadosEscola != null ? aprovadosEscola.hashCode() : 0);
        result = 31 * result + (cursoCidade != null ? cursoCidade.hashCode() : 0);
        result = 31 * result + (codCurso93 != null ? codCurso93.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "AnoLetivo", referencedColumnName = "AnoLetivo", nullable = false), @JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodGrupo", referencedColumnName = "CodGrupo", nullable = false)})
    public AcdGrupoVest getAcdGrupoVest() {
        return acdGrupoVest;
    }

    public void setAcdGrupoVest(AcdGrupoVest acdGrupoVest) {
        this.acdGrupoVest = acdGrupoVest;
    }
}
