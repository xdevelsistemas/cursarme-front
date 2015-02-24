package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class InsQuestionárioPK implements Serializable {
    private int codUnidade;
    private int codQuestionário;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodQuestionário", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodQuestionário() {
        return codQuestionário;
    }

    public void setCodQuestionário(int codQuestionário) {
        this.codQuestionário = codQuestionário;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsQuestionárioPK that = (InsQuestionárioPK) o;

        if (codQuestionário != that.codQuestionário) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codQuestionário;
        return result;
    }
}
