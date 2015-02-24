package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(InsSalaPK.class)
public class InsSala {
    private long salaId;
    private int codUnidade;
    private int codInscrição;
    private short sala;
    private String descrição;
    private Short vagas;

    @Basic
    @Column(name = "Sala_ID", nullable = false, insertable = true, updatable = true)
    public long getSalaId() {
        return salaId;
    }

    public void setSalaId(long salaId) {
        this.salaId = salaId;
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
    @Column(name = "Sala", nullable = false, insertable = true, updatable = true)
    public short getSala() {
        return sala;
    }

    public void setSala(short sala) {
        this.sala = sala;
    }

    @Basic
    @Column(name = "Descrição", nullable = true, insertable = true, updatable = true)
    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    @Basic
    @Column(name = "Vagas", nullable = true, insertable = true, updatable = true)
    public Short getVagas() {
        return vagas;
    }

    public void setVagas(Short vagas) {
        this.vagas = vagas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsSala insSala = (InsSala) o;

        if (codInscrição != insSala.codInscrição) return false;
        if (codUnidade != insSala.codUnidade) return false;
        if (sala != insSala.sala) return false;
        if (salaId != insSala.salaId) return false;
        if (descrição != null ? !descrição.equals(insSala.descrição) : insSala.descrição != null) return false;
        if (vagas != null ? !vagas.equals(insSala.vagas) : insSala.vagas != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (salaId ^ (salaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codInscrição;
        result = 31 * result + (int) sala;
        result = 31 * result + (descrição != null ? descrição.hashCode() : 0);
        result = 31 * result + (vagas != null ? vagas.hashCode() : 0);
        return result;
    }
}
