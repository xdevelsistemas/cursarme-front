package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(InsOpçãoPK.class)
public class InsOpção {
    private long opçãoId;
    private int codUnidade;
    private int codQuestionário;
    private byte codQuestão;
    private String codOpção;
    private String opção;
    private List<InsCandidatoQuestão> insCandidatoQuestãos;
    private InsQuestão insQuestão;

    @Basic
    @Column(name = "Opção_ID", nullable = false, insertable = true, updatable = true)
    public long getOpçãoId() {
        return opçãoId;
    }

    public void setOpçãoId(long opçãoId) {
        this.opçãoId = opçãoId;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodQuestionário", nullable = false, insertable = false, updatable = false)
    public int getCodQuestionário() {
        return codQuestionário;
    }

    public void setCodQuestionário(int codQuestionário) {
        this.codQuestionário = codQuestionário;
    }

    @Id
    @Column(name = "CodQuestão", nullable = false, insertable = false, updatable = false)
    public byte getCodQuestão() {
        return codQuestão;
    }

    public void setCodQuestão(byte codQuestão) {
        this.codQuestão = codQuestão;
    }

    @Id
    @Column(name = "CodOpção", nullable = false, insertable = true, updatable = true)
    public String getCodOpção() {
        return codOpção;
    }

    public void setCodOpção(String codOpção) {
        this.codOpção = codOpção;
    }

    @Basic
    @Column(name = "Opção", nullable = true, insertable = true, updatable = true)
    public String getOpção() {
        return opção;
    }

    public void setOpção(String opção) {
        this.opção = opção;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsOpção insOpção = (InsOpção) o;

        if (codQuestionário != insOpção.codQuestionário) return false;
        if (codQuestão != insOpção.codQuestão) return false;
        if (codUnidade != insOpção.codUnidade) return false;
        if (opçãoId != insOpção.opçãoId) return false;
        if (codOpção != null ? !codOpção.equals(insOpção.codOpção) : insOpção.codOpção != null) return false;
        if (opção != null ? !opção.equals(insOpção.opção) : insOpção.opção != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (opçãoId ^ (opçãoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codQuestionário;
        result = 31 * result + (int) codQuestão;
        result = 31 * result + (codOpção != null ? codOpção.hashCode() : 0);
        result = 31 * result + (opção != null ? opção.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "insOpção")
    public List<InsCandidatoQuestão> getInsCandidatoQuestãos() {
        return insCandidatoQuestãos;
    }

    public void setInsCandidatoQuestãos(List<InsCandidatoQuestão> insCandidatoQuestãos) {
        this.insCandidatoQuestãos = insCandidatoQuestãos;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodQuestionário", referencedColumnName = "CodQuestionário", nullable = false), @JoinColumn(name = "CodQuestão", referencedColumnName = "CodQuestão", nullable = false)})
    public InsQuestão getInsQuestão() {
        return insQuestão;
    }

    public void setInsQuestão(InsQuestão insQuestão) {
        this.insQuestão = insQuestão;
    }
}
