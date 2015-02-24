package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntUnidadeUsuárioPK.class)
public class CntUnidadeUsuário {
    private int idUsuário;
    private int codUnidade;
    private String unidade;
    private String empresaDocumento;
    private String empresaFinanceiro;
    private String empresaComplemento;
    private Boolean anúncio;
    private boolean excluído;

    @Id
    @Column(name = "IDUsuário", nullable = false, insertable = true, updatable = true)
    public int getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(int idUsuário) {
        this.idUsuário = idUsuário;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Basic
    @Column(name = "Unidade", nullable = true, insertable = true, updatable = true)
    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    @Basic
    @Column(name = "EmpresaDocumento", nullable = true, insertable = true, updatable = true)
    public String getEmpresaDocumento() {
        return empresaDocumento;
    }

    public void setEmpresaDocumento(String empresaDocumento) {
        this.empresaDocumento = empresaDocumento;
    }

    @Basic
    @Column(name = "EmpresaFinanceiro", nullable = true, insertable = true, updatable = true)
    public String getEmpresaFinanceiro() {
        return empresaFinanceiro;
    }

    public void setEmpresaFinanceiro(String empresaFinanceiro) {
        this.empresaFinanceiro = empresaFinanceiro;
    }

    @Basic
    @Column(name = "EmpresaComplemento", nullable = true, insertable = true, updatable = true)
    public String getEmpresaComplemento() {
        return empresaComplemento;
    }

    public void setEmpresaComplemento(String empresaComplemento) {
        this.empresaComplemento = empresaComplemento;
    }

    @Basic
    @Column(name = "Anúncio", nullable = true, insertable = true, updatable = true)
    public Boolean getAnúncio() {
        return anúncio;
    }

    public void setAnúncio(Boolean anúncio) {
        this.anúncio = anúncio;
    }

    @Basic
    @Column(name = "Excluído", nullable = false, insertable = true, updatable = true)
    public boolean isExcluído() {
        return excluído;
    }

    public void setExcluído(boolean excluído) {
        this.excluído = excluído;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntUnidadeUsuário that = (CntUnidadeUsuário) o;

        if (codUnidade != that.codUnidade) return false;
        if (excluído != that.excluído) return false;
        if (idUsuário != that.idUsuário) return false;
        if (anúncio != null ? !anúncio.equals(that.anúncio) : that.anúncio != null) return false;
        if (empresaComplemento != null ? !empresaComplemento.equals(that.empresaComplemento) : that.empresaComplemento != null)
            return false;
        if (empresaDocumento != null ? !empresaDocumento.equals(that.empresaDocumento) : that.empresaDocumento != null)
            return false;
        if (empresaFinanceiro != null ? !empresaFinanceiro.equals(that.empresaFinanceiro) : that.empresaFinanceiro != null)
            return false;
        if (unidade != null ? !unidade.equals(that.unidade) : that.unidade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuário;
        result = 31 * result + codUnidade;
        result = 31 * result + (unidade != null ? unidade.hashCode() : 0);
        result = 31 * result + (empresaDocumento != null ? empresaDocumento.hashCode() : 0);
        result = 31 * result + (empresaFinanceiro != null ? empresaFinanceiro.hashCode() : 0);
        result = 31 * result + (empresaComplemento != null ? empresaComplemento.hashCode() : 0);
        result = 31 * result + (anúncio != null ? anúncio.hashCode() : 0);
        result = 31 * result + (excluído ? 1 : 0);
        return result;
    }
}
