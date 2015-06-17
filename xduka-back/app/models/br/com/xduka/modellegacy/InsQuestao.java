package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(InsQuestaoPK.class)
public class InsQuestao {
    private long questãoId;
    private int codUnidade;
    private int codQuestionário;
    private byte codQuestão;
    private String questão;
    private List<InsOpcao> insOpcaos;
    private InsQuestionario insQuestionario;

    @Basic
    @Column(name = "Questão_ID", nullable = false, insertable = true, updatable = true)
    public long getQuestãoId() {
        return questãoId;
    }

    public void setQuestãoId(long questãoId) {
        this.questãoId = questãoId;
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

    @Id
    @Column(name = "CodQuestão", nullable = false, insertable = true, updatable = true)
    public byte getCodQuestão() {
        return codQuestão;
    }

    public void setCodQuestão(byte codQuestão) {
        this.codQuestão = codQuestão;
    }

    @Basic
    @Column(name = "Questão", nullable = true, insertable = true, updatable = true)
    public String getQuestão() {
        return questão;
    }

    public void setQuestão(String questão) {
        this.questão = questão;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsQuestao that = (InsQuestao) o;

        if (codQuestionário != that.codQuestionário) return false;
        if (codQuestão != that.codQuestão) return false;
        if (codUnidade != that.codUnidade) return false;
        if (questãoId != that.questãoId) return false;
        if (questão != null ? !questão.equals(that.questão) : that.questão != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (questãoId ^ (questãoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codQuestionário;
        result = 31 * result + (int) codQuestão;
        result = 31 * result + (questão != null ? questão.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "insQuestão")
    public List<InsOpcao> getInsOpcaos() {
        return insOpcaos;
    }

    public void setInsOpcaos(List<InsOpcao> insOpcaos) {
        this.insOpcaos = insOpcaos;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodQuestionário", referencedColumnName = "CodQuestionário", nullable = false)})
    public InsQuestionario getInsQuestionario() {
        return insQuestionario;
    }

    public void setInsQuestionario(InsQuestionario insQuestionario) {
        this.insQuestionario = insQuestionario;
    }
}
