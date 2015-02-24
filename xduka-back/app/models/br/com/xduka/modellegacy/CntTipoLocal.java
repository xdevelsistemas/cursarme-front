package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntTipoLocalPK.class)
public class CntTipoLocal {
    private long tipoLocalId;
    private int codUnidade;
    private int codTipoLocal;
    private String tipoLocal;
    private List<CntRelacionamentoEndereco> cntRelacionamentoEndereços;
    private List<CntRelacionamentoTelefone> cntRelacionamentoTelefones;

    @Basic
    @Column(name = "TipoLocal_ID", nullable = false, insertable = true, updatable = true)
    public long getTipoLocalId() {
        return tipoLocalId;
    }

    public void setTipoLocalId(long tipoLocalId) {
        this.tipoLocalId = tipoLocalId;
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
    @Column(name = "CodTipoLocal", nullable = false, insertable = true, updatable = true)
    public int getCodTipoLocal() {
        return codTipoLocal;
    }

    public void setCodTipoLocal(int codTipoLocal) {
        this.codTipoLocal = codTipoLocal;
    }

    @Basic
    @Column(name = "TipoLocal", nullable = true, insertable = true, updatable = true)
    public String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(String tipoLocal) {
        this.tipoLocal = tipoLocal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntTipoLocal that = (CntTipoLocal) o;

        if (codTipoLocal != that.codTipoLocal) return false;
        if (codUnidade != that.codUnidade) return false;
        if (tipoLocalId != that.tipoLocalId) return false;
        if (tipoLocal != null ? !tipoLocal.equals(that.tipoLocal) : that.tipoLocal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (tipoLocalId ^ (tipoLocalId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codTipoLocal;
        result = 31 * result + (tipoLocal != null ? tipoLocal.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "cntTipoLocal")
    public List<CntRelacionamentoEndereco> getCntRelacionamentoEndereços() {
        return cntRelacionamentoEndereços;
    }

    public void setCntRelacionamentoEndereços(List<CntRelacionamentoEndereco> cntRelacionamentoEndereços) {
        this.cntRelacionamentoEndereços = cntRelacionamentoEndereços;
    }

    @OneToMany(mappedBy = "cntTipoLocal")
    public List<CntRelacionamentoTelefone> getCntRelacionamentoTelefones() {
        return cntRelacionamentoTelefones;
    }

    public void setCntRelacionamentoTelefones(List<CntRelacionamentoTelefone> cntRelacionamentoTelefones) {
        this.cntRelacionamentoTelefones = cntRelacionamentoTelefones;
    }
}
