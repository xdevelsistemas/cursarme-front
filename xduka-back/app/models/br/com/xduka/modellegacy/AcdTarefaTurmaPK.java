package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdTarefaTurmaPK implements Serializable {
    private int codUnidade;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codTarefa;

    @Column(name = "CodTarefa", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodTarefa() {
        return codTarefa;
    }

    public void setCodTarefa(int codTarefa) {
        this.codTarefa = codTarefa;
    }

    private int anoLetivo;

    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    @Id
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    private int codCurso;

    @Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    private int codPeríodo;

    @Column(name = "CodPeríodo", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(int codPeríodo) {
        this.codPeríodo = codPeríodo;
    }

    private String turma;

    @Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    @Id
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdTarefaTurmaPK that = (AcdTarefaTurmaPK) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codCurso != that.codCurso) return false;
        if (codPeríodo != that.codPeríodo) return false;
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
        return result;
    }
}
