package br.com.xduka.modellegacy.entities;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntRelacionamentoPK implements Serializable{



    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codRelacionamento;

    @Id
    @javax.persistence.Column(name = "CodRelacionamento", nullable = false, insertable = true, updatable = true)
    public int getCodRelacionamento() {
        return codRelacionamento;
    }

    public void setCodRelacionamento(int codRelacionamento) {
        this.codRelacionamento = codRelacionamento;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntRelacionamentoPK that = (CntRelacionamentoPK) o;


        if (codRelacionamento != that.codRelacionamento) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codRelacionamento;


        return result;
    }
}
