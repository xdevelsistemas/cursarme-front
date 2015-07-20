package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(InsQuestionarioPK.class)
public class InsQuestionario {
    private long questionárioId;
    private int codUnidade;
    private int codQuestionário;
    private String questionário;
    private List<InsQuestao> insQuestaos;

    @Basic
    @Column(name = "Questionário_ID", nullable = false, insertable = true, updatable = true)
    public long getQuestionárioId() {
        return questionárioId;
    }

    public void setQuestionárioId(long questionárioId) {
        this.questionárioId = questionárioId;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodQuestionário", nullable = false, insertable = true, updatable = true)
    public int getCodQuestionário() {
        return codQuestionário;
    }

    public void setCodQuestionário(int codQuestionário) {
        this.codQuestionário = codQuestionário;
    }

    @Basic
    @Column(name = "Questionário", nullable = true, insertable = true, updatable = true)
    public String getQuestionário() {
        return questionário;
    }

    public void setQuestionário(String questionário) {
        this.questionário = questionário;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsQuestionario that = (InsQuestionario) o;

        if (codQuestionário != that.codQuestionário) return false;
        if (codUnidade != that.codUnidade) return false;
        if (questionárioId != that.questionárioId) return false;
        if (questionário != null ? !questionário.equals(that.questionário) : that.questionário != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (questionárioId ^ (questionárioId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codQuestionário;
        result = 31 * result + (questionário != null ? questionário.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "insQuestionario")
//    public List<InsQuestao> getInsQuestaos() {
//        return insQuestaos;
//    }
//
//    public void setInsQuestaos(List<InsQuestao> insQuestaos) {
//        this.insQuestaos = insQuestaos;
//    }
}
