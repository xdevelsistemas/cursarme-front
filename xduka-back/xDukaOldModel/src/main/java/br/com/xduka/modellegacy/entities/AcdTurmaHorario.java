package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "acdTurmaHorário", schema = "dbo")
@IdClass(AcdTurmaHorarioPK.class)
public class AcdTurmaHorario {
    private long turmaHorárioId;
    private int anoLetivo;
    private String turma;
    private int codUnidade;
    private int codCurso;
    private int codPeríodo;
    private short aula;
    private Integer domingo;
    private Integer segunda;
    private Integer terça;
    private Integer quarta;
    private Integer quinta;
    private Integer sexta;
    private Integer sábado;

    @Basic
    @Column(name = "TurmaHorário_ID", nullable = false, insertable = true, updatable = true)
    public long getTurmaHorárioId() {
        return turmaHorárioId;
    }

    public void setTurmaHorárioId(long turmaHorárioId) {
        this.turmaHorárioId = turmaHorárioId;
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
    @Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
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
    @Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    @Id
    @Column(name = "CodPeríodo", nullable = false, insertable = true, updatable = true)
    public int getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(int codPeríodo) {
        this.codPeríodo = codPeríodo;
    }

    @Id
    @Column(name = "Aula", nullable = false, insertable = true, updatable = true)
    public short getAula() {
        return aula;
    }

    public void setAula(short aula) {
        this.aula = aula;
    }

    @Basic
    @Column(name = "Domingo", nullable = true, insertable = true, updatable = true)
    public Integer getDomingo() {
        return domingo;
    }

    public void setDomingo(Integer domingo) {
        this.domingo = domingo;
    }

    @Basic
    @Column(name = "Segunda", nullable = true, insertable = true, updatable = true)
    public Integer getSegunda() {
        return segunda;
    }

    public void setSegunda(Integer segunda) {
        this.segunda = segunda;
    }

    @Basic
    @Column(name = "Terça", nullable = true, insertable = true, updatable = true)
    public Integer getTerça() {
        return terça;
    }

    public void setTerça(Integer terça) {
        this.terça = terça;
    }

    @Basic
    @Column(name = "Quarta", nullable = true, insertable = true, updatable = true)
    public Integer getQuarta() {
        return quarta;
    }

    public void setQuarta(Integer quarta) {
        this.quarta = quarta;
    }

    @Basic
    @Column(name = "Quinta", nullable = true, insertable = true, updatable = true)
    public Integer getQuinta() {
        return quinta;
    }

    public void setQuinta(Integer quinta) {
        this.quinta = quinta;
    }

    @Basic
    @Column(name = "Sexta", nullable = true, insertable = true, updatable = true)
    public Integer getSexta() {
        return sexta;
    }

    public void setSexta(Integer sexta) {
        this.sexta = sexta;
    }

    @Basic
    @Column(name = "Sábado", nullable = true, insertable = true, updatable = true)
    public Integer getSábado() {
        return sábado;
    }

    public void setSábado(Integer sábado) {
        this.sábado = sábado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdTurmaHorario that = (AcdTurmaHorario) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (aula != that.aula) return false;
        if (codCurso != that.codCurso) return false;
        if (codPeríodo != that.codPeríodo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (turmaHorárioId != that.turmaHorárioId) return false;
        if (domingo != null ? !domingo.equals(that.domingo) : that.domingo != null) return false;
        if (quarta != null ? !quarta.equals(that.quarta) : that.quarta != null) return false;
        if (quinta != null ? !quinta.equals(that.quinta) : that.quinta != null) return false;
        if (segunda != null ? !segunda.equals(that.segunda) : that.segunda != null) return false;
        if (sexta != null ? !sexta.equals(that.sexta) : that.sexta != null) return false;
        if (sábado != null ? !sábado.equals(that.sábado) : that.sábado != null) return false;
        if (terça != null ? !terça.equals(that.terça) : that.terça != null) return false;
        if (turma != null ? !turma.equals(that.turma) : that.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (turmaHorárioId ^ (turmaHorárioId >>> 32));
        result = 31 * result + anoLetivo;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + codPeríodo;
        result = 31 * result + (int) aula;
        result = 31 * result + (domingo != null ? domingo.hashCode() : 0);
        result = 31 * result + (segunda != null ? segunda.hashCode() : 0);
        result = 31 * result + (terça != null ? terça.hashCode() : 0);
        result = 31 * result + (quarta != null ? quarta.hashCode() : 0);
        result = 31 * result + (quinta != null ? quinta.hashCode() : 0);
        result = 31 * result + (sexta != null ? sexta.hashCode() : 0);
        result = 31 * result + (sábado != null ? sábado.hashCode() : 0);
        return result;
    }
}
