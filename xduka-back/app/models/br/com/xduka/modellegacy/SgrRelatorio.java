package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "sgrRelatório", schema = "dbo")
public class SgrRelatorio {
    private int idRelatório;
    private String codSistema;
    private String relatório;
    private String relatórioUsuário;
    private String ajuda;
    private boolean excluído;
    private boolean nãoUtilizado;
    private boolean personalizaControle;
    private byte menu;
    private Timestamp dataCriação;
    private Timestamp dataModificação;
    private String campos;
    private String consulta;
    private Long acesso;
    private Timestamp dataÚltimoAcesso;

    @Id
    @Column(name = "IDRelatório", nullable = false, insertable = true, updatable = true)
    public int getIdRelatório() {
        return idRelatório;
    }

    public void setIdRelatório(int idRelatório) {
        this.idRelatório = idRelatório;
    }

    @Basic
    @Column(name = "CodSistema", nullable = true, insertable = true, updatable = true)
    public String getCodSistema() {
        return codSistema;
    }

    public void setCodSistema(String codSistema) {
        this.codSistema = codSistema;
    }

    @Basic
    @Column(name = "Relatório", nullable = true, insertable = true, updatable = true)
    public String getRelatório() {
        return relatório;
    }

    public void setRelatório(String relatório) {
        this.relatório = relatório;
    }

    @Basic
    @Column(name = "RelatórioUsuário", nullable = true, insertable = true, updatable = true)
    public String getRelatórioUsuário() {
        return relatórioUsuário;
    }

    public void setRelatórioUsuário(String relatórioUsuário) {
        this.relatórioUsuário = relatórioUsuário;
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
    public byte getMenu() {
        return menu;
    }

    public void setMenu(byte menu) {
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

        SgrRelatorio that = (SgrRelatorio) o;

        if (excluído != that.excluído) return false;
        if (idRelatório != that.idRelatório) return false;
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
        if (relatório != null ? !relatório.equals(that.relatório) : that.relatório != null) return false;
        if (relatórioUsuário != null ? !relatórioUsuário.equals(that.relatórioUsuário) : that.relatórioUsuário != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRelatório;
        result = 31 * result + (codSistema != null ? codSistema.hashCode() : 0);
        result = 31 * result + (relatório != null ? relatório.hashCode() : 0);
        result = 31 * result + (relatórioUsuário != null ? relatórioUsuário.hashCode() : 0);
        result = 31 * result + (ajuda != null ? ajuda.hashCode() : 0);
        result = 31 * result + (excluído ? 1 : 0);
        result = 31 * result + (nãoUtilizado ? 1 : 0);
        result = 31 * result + (personalizaControle ? 1 : 0);
        result = 31 * result + (int) menu;
        result = 31 * result + (dataCriação != null ? dataCriação.hashCode() : 0);
        result = 31 * result + (dataModificação != null ? dataModificação.hashCode() : 0);
        result = 31 * result + (campos != null ? campos.hashCode() : 0);
        result = 31 * result + (consulta != null ? consulta.hashCode() : 0);
        result = 31 * result + (acesso != null ? acesso.hashCode() : 0);
        result = 31 * result + (dataÚltimoAcesso != null ? dataÚltimoAcesso.hashCode() : 0);
        return result;
    }
}
