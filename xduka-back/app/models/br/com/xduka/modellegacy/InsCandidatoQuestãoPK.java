package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class InsCandidatoQuestãoPK implements Serializable {
    private int codUnidade;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codInscrição;

    @Column(name = "CodInscrição", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodInscrição() {
        return codInscrição;
    }

    public void setCodInscrição(int codInscrição) {
        this.codInscrição = codInscrição;
    }

    private int codCandidato;

    @Column(name = "CodCandidato", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodCandidato() {
        return codCandidato;
    }

    public void setCodCandidato(int codCandidato) {
        this.codCandidato = codCandidato;
    }

    private int codQuestionário;

    @Column(name = "CodQuestionário", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodQuestionário() {
        return codQuestionário;
    }

    public void setCodQuestionário(int codQuestionário) {
        this.codQuestionário = codQuestionário;
    }

    private byte codQuestão;

    @Column(name = "CodQuestão", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodQuestão() {
        return codQuestão;
    }

    public void setCodQuestão(byte codQuestão) {
        this.codQuestão = codQuestão;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsCandidatoQuestãoPK that = (InsCandidatoQuestãoPK) o;

        if (codCandidato != that.codCandidato) return false;
        if (codInscrição != that.codInscrição) return false;
        if (codQuestionário != that.codQuestionário) return false;
        if (codQuestão != that.codQuestão) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codInscrição;
        result = 31 * result + codCandidato;
        result = 31 * result + codQuestionário;
        result = 31 * result + (int) codQuestão;
        return result;
    }
}
