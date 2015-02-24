package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CntRelacionamentoContatoPK implements Serializable {
    private int codUnidade;
    private int codRelacionamento;
    private int codContato;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
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

    @Column(name = "CodContato", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodContato() {
        return codContato;
    }

    public void setCodContato(int codContato) {
        this.codContato = codContato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntRelacionamentoContatoPK that = (CntRelacionamentoContatoPK) o;

        if (codContato != that.codContato) return false;
        if (codRelacionamento != that.codRelacionamento) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codRelacionamento;
        result = 31 * result + codContato;
        return result;
    }
}
