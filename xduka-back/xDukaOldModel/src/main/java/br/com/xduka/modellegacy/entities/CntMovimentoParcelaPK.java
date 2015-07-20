package br.com.xduka.modellegacy.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class CntMovimentoParcelaPK implements Serializable {




    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private long codMovimento;

    @Id
    @javax.persistence.Column(name = "CodMovimento", nullable = false, insertable = true, updatable = true)
    public long getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(long codMovimento) {
        this.codMovimento = codMovimento;
    }

    private int parcela;

    @Id
    @javax.persistence.Column(name = "Parcela", nullable = false, insertable = true, updatable = true)
    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntMovimentoParcelaPK that = (CntMovimentoParcelaPK) o;


        if (codMovimento != that.codMovimento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (parcela != that.parcela) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result =  codUnidade;
        result = 31 * result + (int) (codMovimento ^ (codMovimento >>> 32));
        result = 31 * result + parcela;
        return result;
    }
}
