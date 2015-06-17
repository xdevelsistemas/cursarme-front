package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CbrAnuidadePK.class)
public class CbrAnuidade {
    private long anuidadeId;
    private int codUnidade;
    private int anoLetivo;
    private byte codAnuidade;
    private String anuidade;
    private String espécie;
    private String espécieDescrição;
    private List<CbrAnuidadeMes> cbrAnuidadeMêses;

    @Basic
    @Column(name = "Anuidade_ID", nullable = false, insertable = true, updatable = true)
    public long getAnuidadeId() {
        return anuidadeId;
    }

    public void setAnuidadeId(long anuidadeId) {
        this.anuidadeId = anuidadeId;
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
    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Id
    @Column(name = "CodAnuidade", nullable = false, insertable = true, updatable = true)
    public byte getCodAnuidade() {
        return codAnuidade;
    }

    public void setCodAnuidade(byte codAnuidade) {
        this.codAnuidade = codAnuidade;
    }

    @Basic
    @Column(name = "Anuidade", nullable = true, insertable = true, updatable = true)
    public String getAnuidade() {
        return anuidade;
    }

    public void setAnuidade(String anuidade) {
        this.anuidade = anuidade;
    }

    @Basic
    @Column(name = "Espécie", nullable = true, insertable = true, updatable = true)
    public String getEspécie() {
        return espécie;
    }

    public void setEspécie(String espécie) {
        this.espécie = espécie;
    }

    @Basic
    @Column(name = "EspécieDescrição", nullable = true, insertable = true, updatable = true)
    public String getEspécieDescrição() {
        return espécieDescrição;
    }

    public void setEspécieDescrição(String espécieDescrição) {
        this.espécieDescrição = espécieDescrição;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrAnuidade that = (CbrAnuidade) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (anuidadeId != that.anuidadeId) return false;
        if (codAnuidade != that.codAnuidade) return false;
        if (codUnidade != that.codUnidade) return false;
        if (anuidade != null ? !anuidade.equals(that.anuidade) : that.anuidade != null) return false;
        if (espécie != null ? !espécie.equals(that.espécie) : that.espécie != null) return false;
        if (espécieDescrição != null ? !espécieDescrição.equals(that.espécieDescrição) : that.espécieDescrição != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (anuidadeId ^ (anuidadeId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + (int) codAnuidade;
        result = 31 * result + (anuidade != null ? anuidade.hashCode() : 0);
        result = 31 * result + (espécie != null ? espécie.hashCode() : 0);
        result = 31 * result + (espécieDescrição != null ? espécieDescrição.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "cbrAnuidade")
    public List<CbrAnuidadeMes> getCbrAnuidadeMêses() {
        return cbrAnuidadeMêses;
    }

    public void setCbrAnuidadeMêses(List<CbrAnuidadeMes> cbrAnuidadeMêses) {
        this.cbrAnuidadeMêses = cbrAnuidadeMêses;
    }
}
