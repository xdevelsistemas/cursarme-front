package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdBimestreAtivoPK.class)
public class AcdBimestreAtivo {
    private long bimestreAtivoId;
    private int codUnidade;
    private int anoLetivo;
    private int codCurso;
    private Integer bimestreÚltimo;
    private Integer bimestreAtivo;
    private Timestamp atualizaçãoData;

    @Basic
    @Column(name = "BimestreAtivoID", nullable = false, insertable = true, updatable = true)
    public long getBimestreAtivoId() {
        return bimestreAtivoId;
    }

    public void setBimestreAtivoId(long bimestreAtivoId) {
        this.bimestreAtivoId = bimestreAtivoId;
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
    @Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    @Basic
    @Column(name = "BimestreÚltimo", nullable = true, insertable = true, updatable = true)
    public Integer getBimestreÚltimo() {
        return bimestreÚltimo;
    }

    public void setBimestreÚltimo(Integer bimestreÚltimo) {
        this.bimestreÚltimo = bimestreÚltimo;
    }

    @Basic
    @Column(name = "BimestreAtivo", nullable = true, insertable = true, updatable = true)
    public Integer getBimestreAtivo() {
        return bimestreAtivo;
    }

    public void setBimestreAtivo(Integer bimestreAtivo) {
        this.bimestreAtivo = bimestreAtivo;
    }

    @Basic
    @Column(name = "AtualizaçãoData", nullable = true, insertable = true, updatable = true)
    public Timestamp getAtualizaçãoData() {
        return atualizaçãoData;
    }

    public void setAtualizaçãoData(Timestamp atualizaçãoData) {
        this.atualizaçãoData = atualizaçãoData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdBimestreAtivo that = (AcdBimestreAtivo) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (bimestreAtivoId != that.bimestreAtivoId) return false;
        if (codCurso != that.codCurso) return false;
        if (codUnidade != that.codUnidade) return false;
        if (atualizaçãoData != null ? !atualizaçãoData.equals(that.atualizaçãoData) : that.atualizaçãoData != null)
            return false;
        if (bimestreAtivo != null ? !bimestreAtivo.equals(that.bimestreAtivo) : that.bimestreAtivo != null)
            return false;
        if (bimestreÚltimo != null ? !bimestreÚltimo.equals(that.bimestreÚltimo) : that.bimestreÚltimo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (bimestreAtivoId ^ (bimestreAtivoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + codCurso;
        result = 31 * result + (bimestreÚltimo != null ? bimestreÚltimo.hashCode() : 0);
        result = 31 * result + (bimestreAtivo != null ? bimestreAtivo.hashCode() : 0);
        result = 31 * result + (atualizaçãoData != null ? atualizaçãoData.hashCode() : 0);
        return result;
    }
}
