package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdTarefaTurmaPK.class)
public class AcdTarefaTurma {
    private int codUnidade;
    private int codTarefa;
    private int anoLetivo;
    private int codCurso;
    private int codPeríodo;
    private String turma;
    private int codProfessor;
    private boolean cancelada;
    private AcdTarefa acdTarefa;

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodTarefa", nullable = false, insertable = true, updatable = true)
    public int getCodTarefa() {
        return codTarefa;
    }

    public void setCodTarefa(int codTarefa) {
        this.codTarefa = codTarefa;
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
    @Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Basic
    @Column(name = "CodProfessor", nullable = false, insertable = true, updatable = true)
    public int getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(int codProfessor) {
        this.codProfessor = codProfessor;
    }

    @Basic
    @Column(name = "Cancelada", nullable = false, insertable = true, updatable = true)
    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdTarefaTurma that = (AcdTarefaTurma) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (cancelada != that.cancelada) return false;
        if (codCurso != that.codCurso) return false;
        if (codPeríodo != that.codPeríodo) return false;
        if (codProfessor != that.codProfessor) return false;
        if (codTarefa != that.codTarefa) return false;
        if (codUnidade != that.codUnidade) return false;
        if (turma != null ? !turma.equals(that.turma) : that.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codTarefa;
        result = 31 * result + anoLetivo;
        result = 31 * result + codCurso;
        result = 31 * result + codPeríodo;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + codProfessor;
        result = 31 * result + (cancelada ? 1 : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodTarefa", referencedColumnName = "CodTarefa", nullable = false)})
    public AcdTarefa getAcdTarefa() {
        return acdTarefa;
    }

    public void setAcdTarefa(AcdTarefa acdTarefa) {
        this.acdTarefa = acdTarefa;
    }
}
