package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class InsOpcaoPK implements Serializable {
    private int codUnidade;

    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codQuestionário;

    @Column(name = "CodQuestionário", nullable = false, insertable = false, updatable = false)
    @Id
    public int getCodQuestionário() {
        return codQuestionário;
    }

    public void setCodQuestionário(int codQuestionário) {
        this.codQuestionário = codQuestionário;
    }

    private byte codQuestão;

    @Column(name = "CodQuestão", nullable = false, insertable = false, updatable = false)
    @Id
    public byte getCodQuestão() {
        return codQuestão;
    }

    public void setCodQuestão(byte codQuestão) {
        this.codQuestão = codQuestão;
    }

    private String codOpção;

    @Column(name = "CodOpção", nullable = false, insertable = true, updatable = true)
    @Id
    public String getCodOpção() {
        return codOpção;
    }

    public void setCodOpção(String codOpção) {
        this.codOpção = codOpção;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsOpcaoPK that = (InsOpcaoPK) o;

        if (codQuestionário != that.codQuestionário) return false;
        if (codQuestão != that.codQuestão) return false;
        if (codUnidade != that.codUnidade) return false;
        if (codOpção != null ? !codOpção.equals(that.codOpção) : that.codOpção != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codQuestionário;
        result = 31 * result + (int) codQuestão;
        result = 31 * result + (codOpção != null ? codOpção.hashCode() : 0);
        return result;
    }
}
