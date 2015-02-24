package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(InsCandidatoQuestãoPK.class)
public class InsCandidatoQuestão {
    private long candidatoQuestãoId;
    private int codUnidade;
    private int codInscrição;
    private int codCandidato;
    private int codQuestionário;
    private byte codQuestão;
    private String codOpção;
    private InsOpção insOpção;

    @Basic
    @Column(name = "CandidatoQuestão_ID", nullable = false, insertable = true, updatable = true)
    public long getCandidatoQuestãoId() {
        return candidatoQuestãoId;
    }

    public void setCandidatoQuestãoId(long candidatoQuestãoId) {
        this.candidatoQuestãoId = candidatoQuestãoId;
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
    @Column(name = "CodInscrição", nullable = false, insertable = true, updatable = true)
    public int getCodInscrição() {
        return codInscrição;
    }

    public void setCodInscrição(int codInscrição) {
        this.codInscrição = codInscrição;
    }

    @Id
    @Column(name = "CodCandidato", nullable = false, insertable = true, updatable = true)
    public int getCodCandidato() {
        return codCandidato;
    }

    public void setCodCandidato(int codCandidato) {
        this.codCandidato = codCandidato;
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
    @Column(name = "CodOpção", nullable = true, insertable = true, updatable = true)
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

        InsCandidatoQuestão that = (InsCandidatoQuestão) o;

        if (candidatoQuestãoId != that.candidatoQuestãoId) return false;
        if (codCandidato != that.codCandidato) return false;
        if (codInscrição != that.codInscrição) return false;
        if (codQuestionário != that.codQuestionário) return false;
        if (codQuestão != that.codQuestão) return false;
        if (codUnidade != that.codUnidade) return false;
        if (codOpção != null ? !codOpção.equals(that.codOpção) : that.codOpção != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (candidatoQuestãoId ^ (candidatoQuestãoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codInscrição;
        result = 31 * result + codCandidato;
        result = 31 * result + codQuestionário;
        result = 31 * result + (int) codQuestão;
        result = 31 * result + (codOpção != null ? codOpção.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodQuestionário", referencedColumnName = "CodQuestionário", nullable = false), @JoinColumn(name = "CodQuestão", referencedColumnName = "CodQuestão", nullable = false), @JoinColumn(name = "CodOpção", referencedColumnName = "CodOpção", nullable = false)})
    public InsOpção getInsOpção() {
        return insOpção;
    }

    public void setInsOpção(InsOpção insOpção) {
        this.insOpção = insOpção;
    }
}
