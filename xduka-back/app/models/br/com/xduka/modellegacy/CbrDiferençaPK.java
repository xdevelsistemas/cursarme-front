package models.br.com.xduka.modellegacy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class CbrDiferençaPK implements Serializable {
    private int codUnidade;
    private long codMovimento;
    private int codDiferença;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Column(name = "CodMovimento", nullable = false, insertable = true, updatable = true)
    @Id
    public long getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(long codMovimento) {
        this.codMovimento = codMovimento;
    }

    @Column(name = "CodDiferença", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodDiferença() {
        return codDiferença;
    }

    public void setCodDiferença(int codDiferença) {
        this.codDiferença = codDiferença;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrDiferençaPK that = (CbrDiferençaPK) o;

        if (codDiferença != that.codDiferença) return false;
        if (codMovimento != that.codMovimento) return false;
        if (codUnidade != that.codUnidade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) (codMovimento ^ (codMovimento >>> 32));
        result = 31 * result + codDiferença;
        return result;
    }
}
