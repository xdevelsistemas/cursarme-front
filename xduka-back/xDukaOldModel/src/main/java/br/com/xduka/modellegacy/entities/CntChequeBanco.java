package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class CntChequeBanco {
    private long chequeBancoId;
    private int banco;
    private String descrição;

    @Basic
    @Column(name = "ChequeBanco_ID", nullable = false, insertable = true, updatable = true)
    public long getChequeBancoId() {
        return chequeBancoId;
    }

    public void setChequeBancoId(long chequeBancoId) {
        this.chequeBancoId = chequeBancoId;
    }

    @Id
    @Column(name = "Banco", nullable = false, insertable = true, updatable = true)
    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    @Basic
    @Column(name = "Descrição", nullable = true, insertable = true, updatable = true)
    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntChequeBanco that = (CntChequeBanco) o;

        if (banco != that.banco) return false;
        if (chequeBancoId != that.chequeBancoId) return false;
        if (descrição != null ? !descrição.equals(that.descrição) : that.descrição != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (chequeBancoId ^ (chequeBancoId >>> 32));
        result = 31 * result + banco;
        result = 31 * result + (descrição != null ? descrição.hashCode() : 0);
        return result;
    }
}
