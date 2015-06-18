package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "sgrFormulário_OLD", schema = "dbo")
public class SgrFormularioOld {
    private int idFormulário;
    private String codSistema;
    private String formulário;
    private String formulárioUsuário;
    private String ajuda;
    private boolean excluído;
    private boolean nãoUtilizado;
    private boolean personalizaControle;
    private boolean menu;
    private Timestamp dataCriação;
    private Timestamp dataModificação;
    private String campos;
    private String consulta;
    private Long acesso;
    private Timestamp dataÚltimoAcesso;
//    private List<SgrControle> sgrControles;

    @Id
    @Column(name = "IDFormulário", nullable = false, insertable = true, updatable = true)
    public int getIdFormulário() {
        return idFormulário;
    }

    public void setIdFormulário(int idFormulário) {
        this.idFormulário = idFormulário;
    }

    @Basic
    @Column(name = "CodSistema", nullable = false, insertable = true, updatable = true)
    public String getCodSistema() {
        return codSistema;
    }

    public void setCodSistema(String codSistema) {
        this.codSistema = codSistema;
    }

    @Basic
    @Column(name = "Formulário", nullable = false, insertable = true, updatable = true)
    public String getFormulário() {
        return formulário;
    }

    public void setFormulário(String formulário) {
        this.formulário = formulário;
    }

    @Basic
    @Column(name = "FormulárioUsuário", nullable = true, insertable = true, updatable = true)
    public String getFormulárioUsuário() {
        return formulárioUsuário;
    }

    public void setFormulárioUsuário(String formulárioUsuário) {
        this.formulárioUsuário = formulárioUsuário;
    }

    @Basic
    @Column(name = "Ajuda", nullable = true, insertable = true, updatable = true)
    public String getAjuda() {
        return ajuda;
    }

    public void setAjuda(String ajuda) {
        this.ajuda = ajuda;
    }

    @Basic
    @Column(name = "Excluído", nullable = false, insertable = true, updatable = true)
    public boolean isExcluído() {
        return excluído;
    }

    public void setExcluído(boolean excluído) {
        this.excluído = excluído;
    }

    @Basic
    @Column(name = "NãoUtilizado", nullable = false, insertable = true, updatable = true)
    public boolean isNãoUtilizado() {
        return nãoUtilizado;
    }

    public void setNãoUtilizado(boolean nãoUtilizado) {
        this.nãoUtilizado = nãoUtilizado;
    }

    @Basic
    @Column(name = "PersonalizaControle", nullable = false, insertable = true, updatable = true)
    public boolean isPersonalizaControle() {
        return personalizaControle;
    }

    public void setPersonalizaControle(boolean personalizaControle) {
        this.personalizaControle = personalizaControle;
    }

    @Basic
    @Column(name = "Menu", nullable = false, insertable = true, updatable = true)
    public boolean isMenu() {
        return menu;
    }

    public void setMenu(boolean menu) {
        this.menu = menu;
    }

    @Basic
    @Column(name = "DataCriação", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataCriação() {
        return dataCriação;
    }

    public void setDataCriação(Timestamp dataCriação) {
        this.dataCriação = dataCriação;
    }

    @Basic
    @Column(name = "DataModificação", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataModificação() {
        return dataModificação;
    }

    public void setDataModificação(Timestamp dataModificação) {
        this.dataModificação = dataModificação;
    }

    @Basic
    @Column(name = "Campos", nullable = true, insertable = true, updatable = true)
    public String getCampos() {
        return campos;
    }

    public void setCampos(String campos) {
        this.campos = campos;
    }

    @Basic
    @Column(name = "Consulta", nullable = true, insertable = true, updatable = true)
    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    @Basic
    @Column(name = "Acesso", nullable = true, insertable = true, updatable = true)
    public Long getAcesso() {
        return acesso;
    }

    public void setAcesso(Long acesso) {
        this.acesso = acesso;
    }

    @Basic
    @Column(name = "DataÚltimoAcesso", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataÚltimoAcesso() {
        return dataÚltimoAcesso;
    }

    public void setDataÚltimoAcesso(Timestamp dataÚltimoAcesso) {
        this.dataÚltimoAcesso = dataÚltimoAcesso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrFormularioOld that = (SgrFormularioOld) o;

        if (excluído != that.excluído) return false;
        if (idFormulário != that.idFormulário) return false;
        if (menu != that.menu) return false;
        if (nãoUtilizado != that.nãoUtilizado) return false;
        if (personalizaControle != that.personalizaControle) return false;
        if (acesso != null ? !acesso.equals(that.acesso) : that.acesso != null) return false;
        if (ajuda != null ? !ajuda.equals(that.ajuda) : that.ajuda != null) return false;
        if (campos != null ? !campos.equals(that.campos) : that.campos != null) return false;
        if (codSistema != null ? !codSistema.equals(that.codSistema) : that.codSistema != null) return false;
        if (consulta != null ? !consulta.equals(that.consulta) : that.consulta != null) return false;
        if (dataCriação != null ? !dataCriação.equals(that.dataCriação) : that.dataCriação != null) return false;
        if (dataModificação != null ? !dataModificação.equals(that.dataModificação) : that.dataModificação != null)
            return false;
        if (dataÚltimoAcesso != null ? !dataÚltimoAcesso.equals(that.dataÚltimoAcesso) : that.dataÚltimoAcesso != null)
            return false;
        if (formulário != null ? !formulário.equals(that.formulário) : that.formulário != null) return false;
        if (formulárioUsuário != null ? !formulárioUsuário.equals(that.formulárioUsuário) : that.formulárioUsuário != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFormulário;
        result = 31 * result + (codSistema != null ? codSistema.hashCode() : 0);
        result = 31 * result + (formulário != null ? formulário.hashCode() : 0);
        result = 31 * result + (formulárioUsuário != null ? formulárioUsuário.hashCode() : 0);
        result = 31 * result + (ajuda != null ? ajuda.hashCode() : 0);
        result = 31 * result + (excluído ? 1 : 0);
        result = 31 * result + (nãoUtilizado ? 1 : 0);
        result = 31 * result + (personalizaControle ? 1 : 0);
        result = 31 * result + (menu ? 1 : 0);
        result = 31 * result + (dataCriação != null ? dataCriação.hashCode() : 0);
        result = 31 * result + (dataModificação != null ? dataModificação.hashCode() : 0);
        result = 31 * result + (campos != null ? campos.hashCode() : 0);
        result = 31 * result + (consulta != null ? consulta.hashCode() : 0);
        result = 31 * result + (acesso != null ? acesso.hashCode() : 0);
        result = 31 * result + (dataÚltimoAcesso != null ? dataÚltimoAcesso.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "sgrFormulárioOld")
//    public List<SgrControle> getSgrControles() {
//        return sgrControles;
//    }
//
//    public void setSgrControles(List<SgrControle> sgrControles) {
//        this.sgrControles = sgrControles;
//    }
}
