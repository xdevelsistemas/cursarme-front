package br.com.xduka.modellegacy.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class AcdVagaPK implements Serializable{

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdVagaPK acdVaga = (AcdVagaPK) o;

        if (anoLetivo != acdVaga.anoLetivo) return false;
        if (codCurso != acdVaga.codCurso) return false;
        if (codUnidade != acdVaga.codUnidade) return false;
        if (turma != null ? !turma.equals(acdVaga.turma) : acdVaga.turma != null) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = anoLetivo;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        return result;
    }
}
