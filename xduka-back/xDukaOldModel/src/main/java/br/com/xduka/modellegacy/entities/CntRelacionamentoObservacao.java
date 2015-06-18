package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "cntRelacionamentoObservação", schema = "dbo")
@IdClass(CntRelacionamentoObservacaoPK.class)
public class CntRelacionamentoObservacao {
    private long relacionamentoObservaçãoId;
    private int codUnidade;
    private int codRelacionamento;
    private String observação;

    @Basic
    @Column(name = "RelacionamentoObservação_ID", nullable = false, insertable = true, updatable = true)
    public long getRelacionamentoObservaçãoId() {
        return relacionamentoObservaçãoId;
    }

    public void setRelacionamentoObservaçãoId(long relacionamentoObservaçãoId) {
        this.relacionamentoObservaçãoId = relacionamentoObservaçãoId;
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
    @Column(name = "CodRelacionamento", nullable = false, insertable = true, updatable = true)
    public int getCodRelacionamento() {
        return codRelacionamento;
    }

    public void setCodRelacionamento(int codRelacionamento) {
        this.codRelacionamento = codRelacionamento;
    }

    @Basic
    @Column(name = "Observação", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntRelacionamentoObservacao that = (CntRelacionamentoObservacao) o;

        if (codRelacionamento != that.codRelacionamento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (relacionamentoObservaçãoId != that.relacionamentoObservaçãoId) return false;
        if (observação != null ? !observação.equals(that.observação) : that.observação != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (relacionamentoObservaçãoId ^ (relacionamentoObservaçãoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codRelacionamento;
        result = 31 * result + (observação != null ? observação.hashCode() : 0);
        return result;
    }
}
