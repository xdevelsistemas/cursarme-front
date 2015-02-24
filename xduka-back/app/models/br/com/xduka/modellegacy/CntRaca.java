package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "cntRaça", schema = "dbo", catalog = "xDuka")
@IdClass(CntRacaPK.class)
public class CntRaca {
    private long raçaId;
    private int codUnidade;
    private int codRaça;
    private String raça;

    @Basic
    @Column(name = "Raça_Id", nullable = false, insertable = true, updatable = true)
    public long getRaçaId() {
        return raçaId;
    }

    public void setRaçaId(long raçaId) {
        this.raçaId = raçaId;
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
    @Column(name = "CodRaça", nullable = false, insertable = true, updatable = true)
    public int getCodRaça() {
        return codRaça;
    }

    public void setCodRaça(int codRaça) {
        this.codRaça = codRaça;
    }

    @Basic
    @Column(name = "Raça", nullable = true, insertable = true, updatable = true)
    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntRaca cntRaca = (CntRaca) o;

        if (codRaça != cntRaca.codRaça) return false;
        if (codUnidade != cntRaca.codUnidade) return false;
        if (raçaId != cntRaca.raçaId) return false;
        if (raça != null ? !raça.equals(cntRaca.raça) : cntRaca.raça != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (raçaId ^ (raçaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codRaça;
        result = 31 * result + (raça != null ? raça.hashCode() : 0);
        return result;
    }
}
