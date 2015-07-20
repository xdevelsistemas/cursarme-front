package br.com.xduka.modellegacy.entities;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdAulaConteudoPK implements Serializable {

    private int codDisciplina;

    @Id
    @javax.persistence.Column(name = "CodDisciplina", nullable = false, insertable = true, updatable = true)
    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
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

    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
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

    private int codCurso;

    @Id
    @javax.persistence.Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    private short bimestre;

    @Id
    @javax.persistence.Column(name = "Bimestre", nullable = false, insertable = true, updatable = true)
    public short getBimestre() {
        return bimestre;
    }

    public void setBimestre(short bimestre) {
        this.bimestre = bimestre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAulaConteudoPK that = (AcdAulaConteudoPK) o;

        if (codUnidade != that.codUnidade) return false;
        if (codDisciplina != that.codDisciplina) return false;
        if (!turma.equals(that.turma)) return false;
        if (codCurso != that.codCurso) return false;
        if (bimestre != that.bimestre) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codDisciplina;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + codCurso;
        result = 31 * result + (int)bimestre;
        return result;
    }
}
