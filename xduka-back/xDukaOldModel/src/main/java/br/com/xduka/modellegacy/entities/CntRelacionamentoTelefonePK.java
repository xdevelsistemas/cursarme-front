package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntRelacionamentoTelefonePK implements Serializable {
    private int codUnidade;
    private int codRelacionamento;
    private int índice;

    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodRelacionamento", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodRelacionamento() {
        return codRelacionamento;
    }

    public void setCodRelacionamento(int codRelacionamento) {
        this.codRelacionamento = codRelacionamento;
    }

    @Column(name = "Índice", nullable = false, insertable = true, updatable = true)
    @Id
    public int getÍndice() {
        return índice;
    }

    public void setÍndice(int índice) {
        this.índice = índice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntRelacionamentoTelefonePK that = (CntRelacionamentoTelefonePK) o;

        if (codRelacionamento != that.codRelacionamento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (índice != that.índice) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codRelacionamento;
        result = 31 * result + índice;
        return result;
    }
}
