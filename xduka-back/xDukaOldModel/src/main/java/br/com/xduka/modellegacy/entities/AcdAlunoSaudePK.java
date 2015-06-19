package br.com.xduka.modellegacy.entities;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class AcdAlunoSaudePK implements Serializable{
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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAlunoSaudePK that = (AcdAlunoSaudePK) o;

        if (codUnidade != that.codUnidade) return false;
        if (matrícula != that.matrícula) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + matrícula;

        return result;
    }
}
