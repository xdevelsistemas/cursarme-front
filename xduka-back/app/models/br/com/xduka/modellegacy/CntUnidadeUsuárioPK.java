package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntUnidadeUsuárioPK implements Serializable {
    private int codUnidade;
    private int idUsuário;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }



    @Column(name = "IDUsuário", nullable = false, insertable = true, updatable = true)
    @Id
    public int getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(int codConta) {
        this.idUsuário = codConta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntUnidadeUsuárioPK that = (CntUnidadeUsuárioPK) o;

        if (idUsuário != that.idUsuário) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + idUsuário;
        return result;
    }
}
